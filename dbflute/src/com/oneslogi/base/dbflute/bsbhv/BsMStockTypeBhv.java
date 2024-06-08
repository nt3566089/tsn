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
 * The behavior of M_STOCK_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_TYPE_ID
 *
 * [column]
 *     STOCK_TYPE_ID, STOCK_TYPE_CD, DICT_ID, REVERSE_VALID_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByReverseValidFlg)
 *
 * [referrer table]
 *     H_INVENTORY_B, H_SHIPPING_B, H_STOCK, M_LOCATION, M_PROCESS_TYPE, T_ALLOC_INST_B, T_INVENTORY_B, T_INVENTORY_INST, T_MOVE_INST_B, T_RECEIVE_PLAN_H, T_SHIPPING_INST_B, T_STOCK, T_STORE_RECORD_H, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE
 *
 * [foreign property]
 *     bDict, vDict, bClassDtlByReverseValidFlg
 *
 * [referrer property]
 *     hInventoryBList, hShippingBList, hStockList, mLocationList, mProcessTypeList, tAllocInstBList, tInventoryBList, tInventoryInstList, tMoveInstBList, tReceivePlanHList, tShippingInstBList, tStockList, tStoreRecordHList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMStockTypeBhv extends AbstractBehaviorWritable<MStockType, MStockTypeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MStockTypeDbm asDBMeta() { return MStockTypeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_STOCK_TYPE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MStockTypeDbm getMyDBMeta() { return MStockTypeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MStockTypeCB newConditionBean() { return new MStockTypeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MStockType newMyEntity() { return new MStockType(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MStockTypeCB newMyConditionBean() { return new MStockTypeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MStockTypeCB cb) {
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
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().setFoo...(value);
     * MStockType mStockType = <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mStockType != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mStockType.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MStockType selectEntity(MStockTypeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MStockType facadeSelectEntity(MStockTypeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MStockType> OptionalEntity<ENTITY> doSelectOptionalEntity(MStockTypeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().set...;
     * MStockType mStockType = <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mStockType.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MStockType selectEntityWithDeletedCheck(MStockTypeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param stockTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MStockType selectByPKValue(Long stockTypeId) {
        return facadeSelectByPKValue(stockTypeId);
    }

    protected MStockType facadeSelectByPKValue(Long stockTypeId) {
        return doSelectByPK(stockTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MStockType> ENTITY doSelectByPK(Long stockTypeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(stockTypeId), tp);
    }

    protected <ENTITY extends MStockType> OptionalEntity<ENTITY> doSelectOptionalByPK(Long stockTypeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(stockTypeId, tp), stockTypeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stockTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MStockType selectByPKValueWithDeletedCheck(Long stockTypeId) {
        return doSelectByPKWithDeletedCheck(stockTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MStockType> ENTITY doSelectByPKWithDeletedCheck(Long stockTypeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(stockTypeId), tp);
    }

    protected MStockTypeCB xprepareCBAsPK(Long stockTypeId) {
        assertObjectNotNull("stockTypeId", stockTypeId);
        return newConditionBean().acceptPK(stockTypeId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param stockTypeCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MStockType> selectByUniqueOf(String stockTypeCd) {
        return facadeSelectByUniqueOf(stockTypeCd);
    }

    protected OptionalEntity<MStockType> facadeSelectByUniqueOf(String stockTypeCd) {
        return doSelectByUniqueOf(stockTypeCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MStockType> OptionalEntity<ENTITY> doSelectByUniqueOf(String stockTypeCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(stockTypeCd), tp), stockTypeCd);
    }

    protected MStockTypeCB xprepareCBAsUniqueOf(String stockTypeCd) {
        assertObjectNotNull("stockTypeCd", stockTypeCd);
        return newConditionBean().acceptUniqueOf(stockTypeCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MStockType&gt; <span style="color: #553000">mStockTypeList</span> = <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MStockType> selectList(MStockTypeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MStockType&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">page</span>) {
     *     ... = mStockType.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MStockType> selectPage(MStockTypeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().set...
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @param entityRowHandler The handler of entity row of MStockType. (NotNull)
     */
    public void selectCursor(MStockTypeCB cb, EntityRowHandler<MStockType> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MStockTypeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MStockTypeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MStockType> mStockTypeList, ReferrerLoaderHandler<LoaderOfMStockType> loaderLambda) {
        xassLRArg(mStockTypeList, loaderLambda);
        loaderLambda.handle(new LoaderOfMStockType().ready(mStockTypeList, _behaviorSelector));
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
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MStockType mStockType, ReferrerLoaderHandler<LoaderOfMStockType> loaderLambda) {
        xassLRArg(mStockType, loaderLambda);
        loaderLambda.handle(new LoaderOfMStockType().ready(xnewLRAryLs(mStockType), _behaviorSelector));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by STOCK_TYPE_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getHInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadHInventoryBList(mStockTypeList, new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by STOCK_TYPE_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getHInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(MStockType mStockType, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadHInventoryBList(xnewLRLs(mStockType), new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(MStockType mStockType, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadHInventoryBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<MStockType> mStockTypeList, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<HInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadHInventoryBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HInventoryB> doLoadHInventoryBList(List<MStockType> mStockTypeList, LoadReferrerOption<HInventoryBCB, HInventoryB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "hInventoryBList");
    }

    /**
     * Load referrer of HShippingBList by the set-upper of referrer. <br>
     * H_SHIPPING_B by STOCK_TYPE_ID, named 'HShippingBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHShippingBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getHShippingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<HShippingBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadHShippingBList(mStockTypeList, new LoadReferrerOption<HShippingBCB, HShippingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HShippingBList by the set-upper of referrer. <br>
     * H_SHIPPING_B by STOCK_TYPE_ID, named 'HShippingBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHShippingBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getHShippingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(MStockType mStockType, ConditionBeanSetupper<HShippingBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadHShippingBList(xnewLRLs(mStockType), new LoadReferrerOption<HShippingBCB, HShippingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(MStockType mStockType, LoadReferrerOption<HShippingBCB, HShippingB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadHShippingBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(List<MStockType> mStockTypeList, LoadReferrerOption<HShippingBCB, HShippingB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<HShippingB>)EMPTY_NREF_LGWAY; }
        return doLoadHShippingBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HShippingB> doLoadHShippingBList(List<MStockType> mStockTypeList, LoadReferrerOption<HShippingBCB, HShippingB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "hShippingBList");
    }

    /**
     * Load referrer of HStockList by the set-upper of referrer. <br>
     * H_STOCK by STOCK_TYPE_ID, named 'HStockList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHStockList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getHStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(List<MStockType> mStockTypeList, ConditionBeanSetupper<HStockCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadHStockList(mStockTypeList, new LoadReferrerOption<HStockCB, HStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockList by the set-upper of referrer. <br>
     * H_STOCK by STOCK_TYPE_ID, named 'HStockList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadHStockList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getHStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(MStockType mStockType, ConditionBeanSetupper<HStockCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadHStockList(xnewLRLs(mStockType), new LoadReferrerOption<HStockCB, HStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(MStockType mStockType, LoadReferrerOption<HStockCB, HStock> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadHStockList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStock> loadHStockList(List<MStockType> mStockTypeList, LoadReferrerOption<HStockCB, HStock> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<HStock>)EMPTY_NREF_LGWAY; }
        return doLoadHStockList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStock> doLoadHStockList(List<MStockType> mStockTypeList, LoadReferrerOption<HStockCB, HStock> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "hStockList");
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishStockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MStockType> mStockTypeList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadMLocationList(mStockTypeList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishStockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MStockType mStockType, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mStockType), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MStockType mStockType, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MStockType> mStockTypeList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MStockType> mStockTypeList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "mLocationList");
    }

    /**
     * Load referrer of MProcessTypeList by the set-upper of referrer. <br>
     * M_PROCESS_TYPE by STOCK_TYPE_ID, named 'MProcessTypeList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadMProcessTypeList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getMProcessTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(List<MStockType> mStockTypeList, ConditionBeanSetupper<MProcessTypeCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadMProcessTypeList(mStockTypeList, new LoadReferrerOption<MProcessTypeCB, MProcessType>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProcessTypeList by the set-upper of referrer. <br>
     * M_PROCESS_TYPE by STOCK_TYPE_ID, named 'MProcessTypeList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadMProcessTypeList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getMProcessTypeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(MStockType mStockType, ConditionBeanSetupper<MProcessTypeCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadMProcessTypeList(xnewLRLs(mStockType), new LoadReferrerOption<MProcessTypeCB, MProcessType>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(MStockType mStockType, LoadReferrerOption<MProcessTypeCB, MProcessType> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadMProcessTypeList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(List<MStockType> mStockTypeList, LoadReferrerOption<MProcessTypeCB, MProcessType> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<MProcessType>)EMPTY_NREF_LGWAY; }
        return doLoadMProcessTypeList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProcessType> doLoadMProcessTypeList(List<MStockType> mStockTypeList, LoadReferrerOption<MProcessTypeCB, MProcessType> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "mProcessTypeList");
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by STOCK_TYPE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTAllocInstBList(mStockTypeList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by STOCK_TYPE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MStockType mStockType, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(mStockType), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MStockType mStockType, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STOCK_TYPE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTInventoryBList(mStockTypeList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by STOCK_TYPE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MStockType mStockType, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(mStockType), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MStockType mStockType, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MStockType> mStockTypeList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<MStockType> mStockTypeList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by STOCK_TYPE_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTInventoryInstList(mStockTypeList, new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by STOCK_TYPE_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MStockType mStockType, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTInventoryInstList(xnewLRLs(mStockType), new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MStockType mStockType, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTInventoryInstList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MStockType> mStockTypeList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TInventoryInst>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryInstList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryInst> doLoadTInventoryInstList(List<MStockType> mStockTypeList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tInventoryInstList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by STOCK_TYPE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTMoveInstBList(mStockTypeList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by STOCK_TYPE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MStockType mStockType, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(mStockType), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MStockType mStockType, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by STOCK_TYPE_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTReceivePlanHList(mStockTypeList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by STOCK_TYPE_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MStockType mStockType, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(mStockType), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MStockType mStockType, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MStockType> mStockTypeList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<MStockType> mStockTypeList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by STOCK_TYPE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTShippingInstBList(mStockTypeList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by STOCK_TYPE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MStockType mStockType, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(mStockType), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MStockType mStockType, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<MStockType> mStockTypeList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by STOCK_TYPE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTStockList(mStockTypeList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by STOCK_TYPE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MStockType mStockType, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTStockList(xnewLRLs(mStockType), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MStockType mStockType, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTStockList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MStockType> mStockTypeList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MStockType> mStockTypeList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tStockList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by STOCK_TYPE_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MStockType> mStockTypeList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadTStoreRecordHList(mStockTypeList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by STOCK_TYPE_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MStockType mStockType, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(mStockType), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MStockType mStockType, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MStockType> mStockTypeList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<MStockType> mStockTypeList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "tStoreRecordHList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MStockType> mStockTypeList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mStockTypeList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MStockType mStockType, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mStockType), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MStockType mStockType, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MStockType> mStockTypeList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mStockTypeList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MStockType mStockType, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mStockType), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MStockType mStockType, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MStockType> mStockTypeList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mStockTypeList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MStockType mStockType, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mStockType), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MStockType mStockType, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by STOCK_TYPE_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mStockTypeList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MStockType mStockType : <span style="color: #553000">mStockTypeList</span>) {
     *     ... = mStockType.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MStockType> mStockTypeList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mStockTypeList, refCBLambda);
        return doLoadWHtReceiveStoreList(mStockTypeList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by STOCK_TYPE_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mStockType</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mStockType</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockTypeId_InScope(pkList);
     * cb.query().addOrderBy_StockTypeId_Asc();
     * </pre>
     * @param mStockType The entity of MStockType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MStockType mStockType, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mStockType, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mStockType), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mStockType The entity of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MStockType mStockType, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mStockType, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mStockType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mStockTypeList The entity list of MStockType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mStockTypeList, loadReferrerOption);
        if (mStockTypeList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mStockTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MStockType> mStockTypeList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mStockTypeList, option, "wHtReceiveStoreList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param mStockTypeList The list of mStockType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<MStockType> mStockTypeList)
    { return helpPulloutInternally(mStockTypeList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param mStockTypeList The list of mStockType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<MStockType> mStockTypeList)
    { return helpPulloutInternally(mStockTypeList, "vDict"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mStockTypeList The list of mStockType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByReverseValidFlg(List<MStockType> mStockTypeList)
    { return helpPulloutInternally(mStockTypeList, "bClassDtlByReverseValidFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key stockTypeId.
     * @param mStockTypeList The list of mStockType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStockTypeIdList(List<MStockType> mStockTypeList)
    { return helpExtractListInternally(mStockTypeList, "stockTypeId"); }

    /**
     * Extract the value list of (single) unique key stockTypeCd.
     * @param mStockTypeList The list of mStockType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractStockTypeCdList(List<MStockType> mStockTypeList)
    { return helpExtractListInternally(mStockTypeList, "stockTypeCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mStockType.setFoo...(value);
     * mStockType.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mStockType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mStockType.set...;</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">insert</span>(mStockType);
     * ... = mStockType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mStockType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MStockType mStockType) {
        doInsert(mStockType, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mStockType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mStockType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mStockType.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mStockType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">update</span>(mStockType);
     * </pre>
     * @param mStockType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MStockType mStockType) {
        doUpdate(mStockType, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mStockType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mStockType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mStockType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mStockType);
     * </pre>
     * @param mStockType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MStockType mStockType) {
        doUpdateNonstrict(mStockType, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mStockType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MStockType mStockType) {
        doInsertOrUpdate(mStockType, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mStockType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MStockType mStockType) {
        doInsertOrUpdateNonstrict(mStockType, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mStockType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">delete</span>(mStockType);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mStockType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MStockType mStockType) {
        doDelete(mStockType, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mStockType);
     * </pre>
     * @param mStockType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MStockType mStockType) {
        doDeleteNonstrict(mStockType, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mStockType);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mStockType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MStockType mStockType) {
        doDeleteNonstrictIgnoreDeleted(mStockType, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MStockType et, final DeleteOption<MStockTypeCB> op) {
        assertObjectNotNull("mStockType", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     *     mStockType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mStockType.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mStockTypeList.add(mStockType);
     * }
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchInsert</span>(mStockTypeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MStockType> mStockTypeList) {
        return doBatchInsert(mStockTypeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     *     mStockType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mStockType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mStockType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mStockType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mStockTypeList.add(mStockType);
     * }
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mStockTypeList);
     * </pre>
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MStockType> mStockTypeList) {
        return doBatchUpdate(mStockTypeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mStockTypeBhv.<span style="color: #CC4747">batchUpdate</span>(mStockTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mStockTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MStockType> mStockTypeList, SpecifyQuery<MStockTypeCB> colCBLambda) {
        return doBatchUpdate(mStockTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     *     mStockType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mStockType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mStockType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mStockType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mStockTypeList.add(mStockType);
     * }
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mStockTypeList);
     * </pre>
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MStockType> mStockTypeList) {
        return doBatchUpdateNonstrict(mStockTypeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mStockTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mStockTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MStockType> mStockTypeList, SpecifyQuery<MStockTypeCB> colCBLambda) {
        return doBatchUpdateNonstrict(mStockTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MStockType> mStockTypeList) {
        return doBatchDelete(mStockTypeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MStockType> mStockTypeList) {
        return doBatchDeleteNonstrict(mStockTypeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MStockType, MStockTypeCB&gt;() {
     *     public ConditionBean setup(MStockType entity, MStockTypeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MStockType, MStockTypeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mStockType.setPK...(value);</span>
     * mStockType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mStockType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mStockType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mStockType, cb);
     * </pre>
     * @param mStockType The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MStockType mStockType, MStockTypeCB cb) {
        return doQueryUpdate(mStockType, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MStockTypeCB cb = new MStockTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(mStockType, cb);
     * </pre>
     * @param cb The condition-bean of MStockType. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MStockTypeCB cb) {
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
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mStockType.setFoo...(value);
     * mStockType.setBar...(value);
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mStockType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mStockType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mStockType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MStockType mStockType, WritableOptionCall<MStockTypeCB, InsertOption<MStockTypeCB>> opLambda) {
        doInsert(mStockType, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mStockType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mStockType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mStockType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mStockType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MStockType mStockType, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> opLambda) {
        doUpdate(mStockType, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * mStockType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mStockType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mStockType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mStockType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MStockType mStockType, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> opLambda) {
        doUpdateNonstrict(mStockType, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mStockType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MStockType mStockType, WritableOptionCall<MStockTypeCB, InsertOption<MStockTypeCB>> insertOpLambda, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> updateOpLambda) {
        doInsertOrUpdate(mStockType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mStockType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MStockType mStockType, WritableOptionCall<MStockTypeCB, InsertOption<MStockTypeCB>> insertOpLambda, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mStockType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mStockType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MStockType mStockType, WritableOptionCall<MStockTypeCB, DeleteOption<MStockTypeCB>> opLambda) {
        doDelete(mStockType, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mStockType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MStockType mStockType, WritableOptionCall<MStockTypeCB, DeleteOption<MStockTypeCB>> opLambda) {
        doDeleteNonstrict(mStockType, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MStockType> mStockTypeList, WritableOptionCall<MStockTypeCB, InsertOption<MStockTypeCB>> opLambda) {
        return doBatchInsert(mStockTypeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MStockType> mStockTypeList, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> opLambda) {
        return doBatchUpdate(mStockTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MStockType> mStockTypeList, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> opLambda) {
        return doBatchUpdateNonstrict(mStockTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MStockType> mStockTypeList, WritableOptionCall<MStockTypeCB, DeleteOption<MStockTypeCB>> opLambda) {
        return doBatchDelete(mStockTypeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mStockTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MStockType> mStockTypeList, WritableOptionCall<MStockTypeCB, DeleteOption<MStockTypeCB>> opLambda) {
        return doBatchDeleteNonstrict(mStockTypeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MStockType, MStockTypeCB> manyArgLambda, WritableOptionCall<MStockTypeCB, InsertOption<MStockTypeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MStockType mStockType = <span style="color: #70226C">new</span> MStockType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mStockType.setPK...(value);</span>
     * mStockType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mStockType.setVersionNo(value);</span>
     * MStockTypeCB cb = <span style="color: #70226C">new</span> MStockTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mStockTypeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mStockType, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mStockType The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MStockType. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MStockType mStockType, MStockTypeCB cb, WritableOptionCall<MStockTypeCB, UpdateOption<MStockTypeCB>> opLambda) {
        return doQueryUpdate(mStockType, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MStockType. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MStockTypeCB cb, WritableOptionCall<MStockTypeCB, DeleteOption<MStockTypeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mStockTypeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mStockTypeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mStockTypeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mStockTypeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mStockTypeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mStockTypeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mStockTypeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mStockTypeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mStockTypeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mStockTypeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mStockTypeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mStockTypeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mStockTypeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mStockTypeBhv.outideSql().removeBlockComment().selectList()
     * mStockTypeBhv.outideSql().removeLineComment().selectList()
     * mStockTypeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MStockTypeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MStockTypeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MStockType> typeOfSelectedEntity() { return MStockType.class; }
    protected Class<MStockType> typeOfHandlingEntity() { return MStockType.class; }
    protected Class<MStockTypeCB> typeOfHandlingConditionBean() { return MStockTypeCB.class; }
}
