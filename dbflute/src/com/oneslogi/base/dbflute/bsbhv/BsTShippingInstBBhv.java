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
 * The behavior of T_SHIPPING_INST_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_SHAPE, M_WAREHOUSE, T_LOT, T_ALLOC_INST_B, T_STORE_NO, M_STOCK_TYPE, M_LOCATION, T_SHIPPING_INST_H, M_PRODUCT, M_CUSTOMER, B_CLASS_DTL(ByErrorFlg), T_SHIPPING_INST_SPARE(AsOne)
 *
 * [referrer table]
 *     T_PICKING_B, T_SHIPPING_INST_SPARE
 *
 * [foreign property]
 *     mShape, mWarehouse, tLot, tAllocInstB, tStoreNo, mStockType, mLocation, tShippingInstH, mProduct, mCustomer, bClassDtlByErrorFlg, tShippingInstSpareAsOne
 *
 * [referrer property]
 *     tPickingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstBBhv extends AbstractBehaviorWritable<TShippingInstB, TShippingInstBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 出荷指示マスタデータ取得 */
    public static final String PATH_selectSqlShippingPlanBulkMasterData = "selectSqlShippingPlanBulkMasterData";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TShippingInstBDbm asDBMeta() { return TShippingInstBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_SHIPPING_INST_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TShippingInstBDbm getMyDBMeta() { return TShippingInstBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TShippingInstBCB newConditionBean() { return new TShippingInstBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TShippingInstB newMyEntity() { return new TShippingInstB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TShippingInstBCB newMyConditionBean() { return new TShippingInstBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TShippingInstBCB cb) {
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
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().setFoo...(value);
     * TShippingInstB tShippingInstB = <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tShippingInstB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tShippingInstB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingInstB selectEntity(TShippingInstBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TShippingInstB facadeSelectEntity(TShippingInstBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingInstB> OptionalEntity<ENTITY> doSelectOptionalEntity(TShippingInstBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().set...;
     * TShippingInstB tShippingInstB = <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tShippingInstB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingInstB selectEntityWithDeletedCheck(TShippingInstBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shippingInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingInstB selectByPKValue(Long shippingInstBId) {
        return facadeSelectByPKValue(shippingInstBId);
    }

    protected TShippingInstB facadeSelectByPKValue(Long shippingInstBId) {
        return doSelectByPK(shippingInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingInstB> ENTITY doSelectByPK(Long shippingInstBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shippingInstBId), tp);
    }

    protected <ENTITY extends TShippingInstB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shippingInstBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shippingInstBId, tp), shippingInstBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shippingInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingInstB selectByPKValueWithDeletedCheck(Long shippingInstBId) {
        return doSelectByPKWithDeletedCheck(shippingInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingInstB> ENTITY doSelectByPKWithDeletedCheck(Long shippingInstBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shippingInstBId), tp);
    }

    protected TShippingInstBCB xprepareCBAsPK(Long shippingInstBId) {
        assertObjectNotNull("shippingInstBId", shippingInstBId);
        return newConditionBean().acceptPK(shippingInstBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TShippingInstB&gt; <span style="color: #553000">tShippingInstBList</span> = <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TShippingInstB tShippingInstB : <span style="color: #553000">tShippingInstBList</span>) {
     *     ... = tShippingInstB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TShippingInstB> selectList(TShippingInstBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TShippingInstB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TShippingInstB tShippingInstB : <span style="color: #553000">page</span>) {
     *     ... = tShippingInstB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TShippingInstB> selectPage(TShippingInstBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @param entityRowHandler The handler of entity row of TShippingInstB. (NotNull)
     */
    public void selectCursor(TShippingInstBCB cb, EntityRowHandler<TShippingInstB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingInstBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingInstBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tShippingInstBList The entity list of TShippingInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TShippingInstB> tShippingInstBList, ReferrerLoaderHandler<LoaderOfTShippingInstB> loaderLambda) {
        xassLRArg(tShippingInstBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingInstB().ready(tShippingInstBList, _behaviorSelector));
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
     * @param tShippingInstB The entity of TShippingInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TShippingInstB tShippingInstB, ReferrerLoaderHandler<LoaderOfTShippingInstB> loaderLambda) {
        xassLRArg(tShippingInstB, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingInstB().ready(xnewLRAryLs(tShippingInstB), _behaviorSelector));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tShippingInstBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TShippingInstB tShippingInstB : <span style="color: #553000">tShippingInstBList</span>) {
     *     ... = tShippingInstB.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param tShippingInstBList The entity list of TShippingInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TShippingInstB> tShippingInstBList, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tShippingInstBList, refCBLambda);
        return doLoadTPickingBList(tShippingInstBList, new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tShippingInstB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tShippingInstB</span>.<span style="color: #CC4747">getTPickingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param tShippingInstB The entity of TShippingInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TShippingInstB tShippingInstB, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tShippingInstB, refCBLambda);
        return doLoadTPickingBList(xnewLRLs(tShippingInstB), new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tShippingInstB The entity of TShippingInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TShippingInstB tShippingInstB, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tShippingInstB, loadReferrerOption);
        return loadTPickingBList(xnewLRLs(tShippingInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tShippingInstBList The entity list of TShippingInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TShippingInstB> tShippingInstBList, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tShippingInstBList, loadReferrerOption);
        if (tShippingInstBList.isEmpty()) { return (NestedReferrerListGateway<TPickingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingBList(tShippingInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingB> doLoadTPickingBList(List<TShippingInstB> tShippingInstBList, LoadReferrerOption<TPickingBCB, TPickingB> option) {
        return helpLoadReferrerInternally(tShippingInstBList, option, "tPickingBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShape'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "tLot"); }

    /**
     * Pull out the list of foreign table 'TAllocInstB'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TAllocInstB> pulloutTAllocInstB(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "tAllocInstB"); }

    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNo(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "tStoreNo"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'TShippingInstH'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TShippingInstH> pulloutTShippingInstH(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "tShippingInstH"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorFlg(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "bClassDtlByErrorFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'TShippingInstSpare'.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TShippingInstSpare> pulloutTShippingInstSpareAsOne(List<TShippingInstB> tShippingInstBList)
    { return helpPulloutInternally(tShippingInstBList, "tShippingInstSpareAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shippingInstBId.
     * @param tShippingInstBList The list of tShippingInstB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShippingInstBIdList(List<TShippingInstB> tShippingInstBList)
    { return helpExtractListInternally(tShippingInstBList, "shippingInstBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingInstB.setFoo...(value);
     * tShippingInstB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingInstB.set...;</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">insert</span>(tShippingInstB);
     * ... = tShippingInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tShippingInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TShippingInstB tShippingInstB) {
        doInsert(tShippingInstB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingInstB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">update</span>(tShippingInstB);
     * </pre>
     * @param tShippingInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TShippingInstB tShippingInstB) {
        doUpdate(tShippingInstB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tShippingInstB);
     * </pre>
     * @param tShippingInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TShippingInstB tShippingInstB) {
        doUpdateNonstrict(tShippingInstB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TShippingInstB tShippingInstB) {
        doInsertOrUpdate(tShippingInstB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TShippingInstB tShippingInstB) {
        doInsertOrUpdateNonstrict(tShippingInstB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">delete</span>(tShippingInstB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tShippingInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TShippingInstB tShippingInstB) {
        doDelete(tShippingInstB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tShippingInstB);
     * </pre>
     * @param tShippingInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TShippingInstB tShippingInstB) {
        doDeleteNonstrict(tShippingInstB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tShippingInstB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tShippingInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TShippingInstB tShippingInstB) {
        doDeleteNonstrictIgnoreDeleted(tShippingInstB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TShippingInstB et, final DeleteOption<TShippingInstBCB> op) {
        assertObjectNotNull("tShippingInstB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     *     tShippingInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingInstB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tShippingInstBList.add(tShippingInstB);
     * }
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tShippingInstBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TShippingInstB> tShippingInstBList) {
        return doBatchInsert(tShippingInstBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     *     tShippingInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingInstBList.add(tShippingInstB);
     * }
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingInstBList);
     * </pre>
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingInstB> tShippingInstBList) {
        return doBatchUpdate(tShippingInstBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tShippingInstBBhv.<span style="color: #CC4747">batchUpdate</span>(tShippingInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingInstB> tShippingInstBList, SpecifyQuery<TShippingInstBCB> colCBLambda) {
        return doBatchUpdate(tShippingInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     *     tShippingInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingInstBList.add(tShippingInstB);
     * }
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingInstBList);
     * </pre>
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingInstB> tShippingInstBList) {
        return doBatchUpdateNonstrict(tShippingInstBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingInstB> tShippingInstBList, SpecifyQuery<TShippingInstBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tShippingInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TShippingInstB> tShippingInstBList) {
        return doBatchDelete(tShippingInstBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TShippingInstB> tShippingInstBList) {
        return doBatchDeleteNonstrict(tShippingInstBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TShippingInstB, TShippingInstBCB&gt;() {
     *     public ConditionBean setup(TShippingInstB entity, TShippingInstBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TShippingInstB, TShippingInstBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setPK...(value);</span>
     * tShippingInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tShippingInstB, cb);
     * </pre>
     * @param tShippingInstB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TShippingInstB tShippingInstB, TShippingInstBCB cb) {
        return doQueryUpdate(tShippingInstB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TShippingInstBCB cb = new TShippingInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tShippingInstB, cb);
     * </pre>
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TShippingInstBCB cb) {
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
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingInstB.setFoo...(value);
     * tShippingInstB.setBar...(value);
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tShippingInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tShippingInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tShippingInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, InsertOption<TShippingInstBCB>> opLambda) {
        doInsert(tShippingInstB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tShippingInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> opLambda) {
        doUpdate(tShippingInstB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * tShippingInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tShippingInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> opLambda) {
        doUpdateNonstrict(tShippingInstB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tShippingInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, InsertOption<TShippingInstBCB>> insertOpLambda, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> updateOpLambda) {
        doInsertOrUpdate(tShippingInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tShippingInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, InsertOption<TShippingInstBCB>> insertOpLambda, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tShippingInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tShippingInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, DeleteOption<TShippingInstBCB>> opLambda) {
        doDelete(tShippingInstB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tShippingInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TShippingInstB tShippingInstB, WritableOptionCall<TShippingInstBCB, DeleteOption<TShippingInstBCB>> opLambda) {
        doDeleteNonstrict(tShippingInstB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TShippingInstB> tShippingInstBList, WritableOptionCall<TShippingInstBCB, InsertOption<TShippingInstBCB>> opLambda) {
        return doBatchInsert(tShippingInstBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TShippingInstB> tShippingInstBList, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> opLambda) {
        return doBatchUpdate(tShippingInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TShippingInstB> tShippingInstBList, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> opLambda) {
        return doBatchUpdateNonstrict(tShippingInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TShippingInstB> tShippingInstBList, WritableOptionCall<TShippingInstBCB, DeleteOption<TShippingInstBCB>> opLambda) {
        return doBatchDelete(tShippingInstBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tShippingInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TShippingInstB> tShippingInstBList, WritableOptionCall<TShippingInstBCB, DeleteOption<TShippingInstBCB>> opLambda) {
        return doBatchDeleteNonstrict(tShippingInstBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TShippingInstB, TShippingInstBCB> manyArgLambda, WritableOptionCall<TShippingInstBCB, InsertOption<TShippingInstBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingInstB tShippingInstB = <span style="color: #70226C">new</span> TShippingInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setPK...(value);</span>
     * tShippingInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingInstB.setVersionNo(value);</span>
     * TShippingInstBCB cb = <span style="color: #70226C">new</span> TShippingInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tShippingInstB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingInstB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TShippingInstB tShippingInstB, TShippingInstBCB cb, WritableOptionCall<TShippingInstBCB, UpdateOption<TShippingInstBCB>> opLambda) {
        return doQueryUpdate(tShippingInstB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TShippingInstB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TShippingInstBCB cb, WritableOptionCall<TShippingInstBCB, DeleteOption<TShippingInstBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tShippingInstBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tShippingInstBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingInstBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tShippingInstBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingInstBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tShippingInstBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tShippingInstBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tShippingInstBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tShippingInstBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tShippingInstBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tShippingInstBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tShippingInstBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tShippingInstBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tShippingInstBBhv.outideSql().removeBlockComment().selectList()
     * tShippingInstBBhv.outideSql().removeLineComment().selectList()
     * tShippingInstBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TShippingInstBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TShippingInstBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TShippingInstB> typeOfSelectedEntity() { return TShippingInstB.class; }
    protected Class<TShippingInstB> typeOfHandlingEntity() { return TShippingInstB.class; }
    protected Class<TShippingInstBCB> typeOfHandlingConditionBean() { return TShippingInstBCB.class; }
}
