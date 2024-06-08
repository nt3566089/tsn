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
 * The behavior of T_EC_ORDER_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_B_ID
 *
 * [column]
 *     EC_ORDER_B_ID, EC_ORDER_H_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_OPTION, ORDER_NUM, UNIT_PRICE, UNIT_TOTAL_PRICE, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_H, B_CLASS_DTL(ByErrorFlg)
 *
 * [referrer table]
 *     T_AMAZON_ORDER, T_RAKUTEN_ORDER, T_YAHOO_ORDER
 *
 * [foreign property]
 *     tEcOrderH, bClassDtlByErrorFlg
 *
 * [referrer property]
 *     tAmazonOrderList, tRakutenOrderList, tYahooOrderList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderBBhv extends AbstractBehaviorWritable<TEcOrderB, TEcOrderBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TEcOrderBDbm asDBMeta() { return TEcOrderBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_EC_ORDER_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TEcOrderBDbm getMyDBMeta() { return TEcOrderBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TEcOrderBCB newConditionBean() { return new TEcOrderBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TEcOrderB newMyEntity() { return new TEcOrderB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TEcOrderBCB newMyConditionBean() { return new TEcOrderBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TEcOrderBCB cb) {
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
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().setFoo...(value);
     * TEcOrderB tEcOrderB = <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tEcOrderB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tEcOrderB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderB selectEntity(TEcOrderBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TEcOrderB facadeSelectEntity(TEcOrderBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderB> OptionalEntity<ENTITY> doSelectOptionalEntity(TEcOrderBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().set...;
     * TEcOrderB tEcOrderB = <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tEcOrderB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderB selectEntityWithDeletedCheck(TEcOrderBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param ecOrderBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderB selectByPKValue(Long ecOrderBId) {
        return facadeSelectByPKValue(ecOrderBId);
    }

    protected TEcOrderB facadeSelectByPKValue(Long ecOrderBId) {
        return doSelectByPK(ecOrderBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderB> ENTITY doSelectByPK(Long ecOrderBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(ecOrderBId), tp);
    }

    protected <ENTITY extends TEcOrderB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long ecOrderBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(ecOrderBId, tp), ecOrderBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param ecOrderBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderB selectByPKValueWithDeletedCheck(Long ecOrderBId) {
        return doSelectByPKWithDeletedCheck(ecOrderBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderB> ENTITY doSelectByPKWithDeletedCheck(Long ecOrderBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(ecOrderBId), tp);
    }

    protected TEcOrderBCB xprepareCBAsPK(Long ecOrderBId) {
        assertObjectNotNull("ecOrderBId", ecOrderBId);
        return newConditionBean().acceptPK(ecOrderBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TEcOrderB&gt; <span style="color: #553000">tEcOrderBList</span> = <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TEcOrderB> selectList(TEcOrderBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TEcOrderB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TEcOrderB tEcOrderB : <span style="color: #553000">page</span>) {
     *     ... = tEcOrderB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TEcOrderB> selectPage(TEcOrderBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @param entityRowHandler The handler of entity row of TEcOrderB. (NotNull)
     */
    public void selectCursor(TEcOrderBCB cb, EntityRowHandler<TEcOrderB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TEcOrderB> tEcOrderBList, ReferrerLoaderHandler<LoaderOfTEcOrderB> loaderLambda) {
        xassLRArg(tEcOrderBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderB().ready(tEcOrderBList, _behaviorSelector));
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
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TEcOrderB tEcOrderB, ReferrerLoaderHandler<LoaderOfTEcOrderB> loaderLambda) {
        xassLRArg(tEcOrderB, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderB().ready(xnewLRAryLs(tEcOrderB), _behaviorSelector));
    }

    /**
     * Load referrer of TAmazonOrderList by the set-upper of referrer. <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTAmazonOrderList</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTAmazonOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAmazonOrder> loadTAmazonOrderList(List<TEcOrderB> tEcOrderBList, ConditionBeanSetupper<TAmazonOrderCB> refCBLambda) {
        xassLRArg(tEcOrderBList, refCBLambda);
        return doLoadTAmazonOrderList(tEcOrderBList, new LoadReferrerOption<TAmazonOrderCB, TAmazonOrder>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAmazonOrderList by the set-upper of referrer. <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTAmazonOrderList</span>(<span style="color: #553000">tEcOrderB</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tEcOrderB</span>.<span style="color: #CC4747">getTAmazonOrderList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAmazonOrder> loadTAmazonOrderList(TEcOrderB tEcOrderB, ConditionBeanSetupper<TAmazonOrderCB> refCBLambda) {
        xassLRArg(tEcOrderB, refCBLambda);
        return doLoadTAmazonOrderList(xnewLRLs(tEcOrderB), new LoadReferrerOption<TAmazonOrderCB, TAmazonOrder>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAmazonOrder> loadTAmazonOrderList(TEcOrderB tEcOrderB, LoadReferrerOption<TAmazonOrderCB, TAmazonOrder> loadReferrerOption) {
        xassLRArg(tEcOrderB, loadReferrerOption);
        return loadTAmazonOrderList(xnewLRLs(tEcOrderB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAmazonOrder> loadTAmazonOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TAmazonOrderCB, TAmazonOrder> loadReferrerOption) {
        xassLRArg(tEcOrderBList, loadReferrerOption);
        if (tEcOrderBList.isEmpty()) { return (NestedReferrerListGateway<TAmazonOrder>)EMPTY_NREF_LGWAY; }
        return doLoadTAmazonOrderList(tEcOrderBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAmazonOrder> doLoadTAmazonOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TAmazonOrderCB, TAmazonOrder> option) {
        return helpLoadReferrerInternally(tEcOrderBList, option, "tAmazonOrderList");
    }

    /**
     * Load referrer of TRakutenOrderList by the set-upper of referrer. <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTRakutenOrderList</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTRakutenOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TRakutenOrder> loadTRakutenOrderList(List<TEcOrderB> tEcOrderBList, ConditionBeanSetupper<TRakutenOrderCB> refCBLambda) {
        xassLRArg(tEcOrderBList, refCBLambda);
        return doLoadTRakutenOrderList(tEcOrderBList, new LoadReferrerOption<TRakutenOrderCB, TRakutenOrder>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TRakutenOrderList by the set-upper of referrer. <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTRakutenOrderList</span>(<span style="color: #553000">tEcOrderB</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tEcOrderB</span>.<span style="color: #CC4747">getTRakutenOrderList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TRakutenOrder> loadTRakutenOrderList(TEcOrderB tEcOrderB, ConditionBeanSetupper<TRakutenOrderCB> refCBLambda) {
        xassLRArg(tEcOrderB, refCBLambda);
        return doLoadTRakutenOrderList(xnewLRLs(tEcOrderB), new LoadReferrerOption<TRakutenOrderCB, TRakutenOrder>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TRakutenOrder> loadTRakutenOrderList(TEcOrderB tEcOrderB, LoadReferrerOption<TRakutenOrderCB, TRakutenOrder> loadReferrerOption) {
        xassLRArg(tEcOrderB, loadReferrerOption);
        return loadTRakutenOrderList(xnewLRLs(tEcOrderB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TRakutenOrder> loadTRakutenOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TRakutenOrderCB, TRakutenOrder> loadReferrerOption) {
        xassLRArg(tEcOrderBList, loadReferrerOption);
        if (tEcOrderBList.isEmpty()) { return (NestedReferrerListGateway<TRakutenOrder>)EMPTY_NREF_LGWAY; }
        return doLoadTRakutenOrderList(tEcOrderBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TRakutenOrder> doLoadTRakutenOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TRakutenOrderCB, TRakutenOrder> option) {
        return helpLoadReferrerInternally(tEcOrderBList, option, "tRakutenOrderList");
    }

    /**
     * Load referrer of TYahooOrderList by the set-upper of referrer. <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTYahooOrderList</span>(<span style="color: #553000">tEcOrderBList</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TEcOrderB tEcOrderB : <span style="color: #553000">tEcOrderBList</span>) {
     *     ... = tEcOrderB.<span style="color: #CC4747">getTYahooOrderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYahooOrder> loadTYahooOrderList(List<TEcOrderB> tEcOrderBList, ConditionBeanSetupper<TYahooOrderCB> refCBLambda) {
        xassLRArg(tEcOrderBList, refCBLambda);
        return doLoadTYahooOrderList(tEcOrderBList, new LoadReferrerOption<TYahooOrderCB, TYahooOrder>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TYahooOrderList by the set-upper of referrer. <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">loadTYahooOrderList</span>(<span style="color: #553000">tEcOrderB</span>, <span style="color: #553000">orderCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orderCB</span>.setupSelect...
     *     <span style="color: #553000">orderCB</span>.query().set...
     *     <span style="color: #553000">orderCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tEcOrderB</span>.<span style="color: #CC4747">getTYahooOrderList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderBId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderBId_Asc();
     * </pre>
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYahooOrder> loadTYahooOrderList(TEcOrderB tEcOrderB, ConditionBeanSetupper<TYahooOrderCB> refCBLambda) {
        xassLRArg(tEcOrderB, refCBLambda);
        return doLoadTYahooOrderList(xnewLRLs(tEcOrderB), new LoadReferrerOption<TYahooOrderCB, TYahooOrder>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tEcOrderB The entity of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYahooOrder> loadTYahooOrderList(TEcOrderB tEcOrderB, LoadReferrerOption<TYahooOrderCB, TYahooOrder> loadReferrerOption) {
        xassLRArg(tEcOrderB, loadReferrerOption);
        return loadTYahooOrderList(xnewLRLs(tEcOrderB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tEcOrderBList The entity list of TEcOrderB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TYahooOrder> loadTYahooOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TYahooOrderCB, TYahooOrder> loadReferrerOption) {
        xassLRArg(tEcOrderBList, loadReferrerOption);
        if (tEcOrderBList.isEmpty()) { return (NestedReferrerListGateway<TYahooOrder>)EMPTY_NREF_LGWAY; }
        return doLoadTYahooOrderList(tEcOrderBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TYahooOrder> doLoadTYahooOrderList(List<TEcOrderB> tEcOrderBList, LoadReferrerOption<TYahooOrderCB, TYahooOrder> option) {
        return helpLoadReferrerInternally(tEcOrderBList, option, "tYahooOrderList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TEcOrderH'.
     * @param tEcOrderBList The list of tEcOrderB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TEcOrderH> pulloutTEcOrderH(List<TEcOrderB> tEcOrderBList)
    { return helpPulloutInternally(tEcOrderBList, "tEcOrderH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderBList The list of tEcOrderB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorFlg(List<TEcOrderB> tEcOrderBList)
    { return helpPulloutInternally(tEcOrderBList, "bClassDtlByErrorFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key ecOrderBId.
     * @param tEcOrderBList The list of tEcOrderB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractEcOrderBIdList(List<TEcOrderB> tEcOrderBList)
    { return helpExtractListInternally(tEcOrderBList, "ecOrderBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderB.setFoo...(value);
     * tEcOrderB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderB.set...;</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">insert</span>(tEcOrderB);
     * ... = tEcOrderB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tEcOrderB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TEcOrderB tEcOrderB) {
        doInsert(tEcOrderB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">update</span>(tEcOrderB);
     * </pre>
     * @param tEcOrderB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TEcOrderB tEcOrderB) {
        doUpdate(tEcOrderB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tEcOrderB);
     * </pre>
     * @param tEcOrderB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TEcOrderB tEcOrderB) {
        doUpdateNonstrict(tEcOrderB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TEcOrderB tEcOrderB) {
        doInsertOrUpdate(tEcOrderB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TEcOrderB tEcOrderB) {
        doInsertOrUpdateNonstrict(tEcOrderB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">delete</span>(tEcOrderB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tEcOrderB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TEcOrderB tEcOrderB) {
        doDelete(tEcOrderB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tEcOrderB);
     * </pre>
     * @param tEcOrderB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TEcOrderB tEcOrderB) {
        doDeleteNonstrict(tEcOrderB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tEcOrderB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tEcOrderB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TEcOrderB tEcOrderB) {
        doDeleteNonstrictIgnoreDeleted(tEcOrderB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TEcOrderB et, final DeleteOption<TEcOrderBCB> op) {
        assertObjectNotNull("tEcOrderB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     *     tEcOrderB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tEcOrderBList.add(tEcOrderB);
     * }
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tEcOrderBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TEcOrderB> tEcOrderBList) {
        return doBatchInsert(tEcOrderBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     *     tEcOrderB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderBList.add(tEcOrderB);
     * }
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderBList);
     * </pre>
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderB> tEcOrderBList) {
        return doBatchUpdate(tEcOrderBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tEcOrderBBhv.<span style="color: #CC4747">batchUpdate</span>(tEcOrderBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderB> tEcOrderBList, SpecifyQuery<TEcOrderBCB> colCBLambda) {
        return doBatchUpdate(tEcOrderBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     *     tEcOrderB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderBList.add(tEcOrderB);
     * }
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderBList);
     * </pre>
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderB> tEcOrderBList) {
        return doBatchUpdateNonstrict(tEcOrderBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderB> tEcOrderBList, SpecifyQuery<TEcOrderBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tEcOrderBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TEcOrderB> tEcOrderBList) {
        return doBatchDelete(tEcOrderBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TEcOrderB> tEcOrderBList) {
        return doBatchDeleteNonstrict(tEcOrderBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TEcOrderB, TEcOrderBCB&gt;() {
     *     public ConditionBean setup(TEcOrderB entity, TEcOrderBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TEcOrderB, TEcOrderBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setPK...(value);</span>
     * tEcOrderB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tEcOrderB, cb);
     * </pre>
     * @param tEcOrderB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TEcOrderB tEcOrderB, TEcOrderBCB cb) {
        return doQueryUpdate(tEcOrderB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TEcOrderBCB cb = new TEcOrderBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tEcOrderB, cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TEcOrderBCB cb) {
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
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderB.setFoo...(value);
     * tEcOrderB.setBar...(value);
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tEcOrderB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tEcOrderB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tEcOrderB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, InsertOption<TEcOrderBCB>> opLambda) {
        doInsert(tEcOrderB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tEcOrderB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> opLambda) {
        doUpdate(tEcOrderB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * tEcOrderB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tEcOrderB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> opLambda) {
        doUpdateNonstrict(tEcOrderB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tEcOrderB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, InsertOption<TEcOrderBCB>> insertOpLambda, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> updateOpLambda) {
        doInsertOrUpdate(tEcOrderB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tEcOrderB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, InsertOption<TEcOrderBCB>> insertOpLambda, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tEcOrderB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tEcOrderB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, DeleteOption<TEcOrderBCB>> opLambda) {
        doDelete(tEcOrderB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tEcOrderB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TEcOrderB tEcOrderB, WritableOptionCall<TEcOrderBCB, DeleteOption<TEcOrderBCB>> opLambda) {
        doDeleteNonstrict(tEcOrderB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TEcOrderB> tEcOrderBList, WritableOptionCall<TEcOrderBCB, InsertOption<TEcOrderBCB>> opLambda) {
        return doBatchInsert(tEcOrderBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TEcOrderB> tEcOrderBList, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> opLambda) {
        return doBatchUpdate(tEcOrderBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TEcOrderB> tEcOrderBList, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> opLambda) {
        return doBatchUpdateNonstrict(tEcOrderBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TEcOrderB> tEcOrderBList, WritableOptionCall<TEcOrderBCB, DeleteOption<TEcOrderBCB>> opLambda) {
        return doBatchDelete(tEcOrderBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tEcOrderBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TEcOrderB> tEcOrderBList, WritableOptionCall<TEcOrderBCB, DeleteOption<TEcOrderBCB>> opLambda) {
        return doBatchDeleteNonstrict(tEcOrderBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TEcOrderB, TEcOrderBCB> manyArgLambda, WritableOptionCall<TEcOrderBCB, InsertOption<TEcOrderBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderB tEcOrderB = <span style="color: #70226C">new</span> TEcOrderB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setPK...(value);</span>
     * tEcOrderB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderB.setVersionNo(value);</span>
     * TEcOrderBCB cb = <span style="color: #70226C">new</span> TEcOrderBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tEcOrderB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TEcOrderB tEcOrderB, TEcOrderBCB cb, WritableOptionCall<TEcOrderBCB, UpdateOption<TEcOrderBCB>> opLambda) {
        return doQueryUpdate(tEcOrderB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TEcOrderB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TEcOrderBCB cb, WritableOptionCall<TEcOrderBCB, DeleteOption<TEcOrderBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tEcOrderBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tEcOrderBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tEcOrderBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tEcOrderBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tEcOrderBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tEcOrderBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tEcOrderBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tEcOrderBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tEcOrderBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tEcOrderBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tEcOrderBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tEcOrderBBhv.outideSql().removeBlockComment().selectList()
     * tEcOrderBBhv.outideSql().removeLineComment().selectList()
     * tEcOrderBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TEcOrderBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TEcOrderBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TEcOrderB> typeOfSelectedEntity() { return TEcOrderB.class; }
    protected Class<TEcOrderB> typeOfHandlingEntity() { return TEcOrderB.class; }
    protected Class<TEcOrderBCB> typeOfHandlingConditionBean() { return TEcOrderBCB.class; }
}
