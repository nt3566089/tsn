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
 * The behavior of M_WAREHOUSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     WAREHOUSE_ID
 *
 * [column]
 *     WAREHOUSE_ID, CENTER_ID, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, FOREIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WAREHOUSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_WEB_HT_INFO, M_ZONE, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_RECEIVE_PLAN_B, T_SHIPPING_INST_B, T_STOCK, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg, bClassDtlByForeignFlg
 *
 * [referrer property]
 *     mWebHtInfoList, mZoneList, tAllocInstBList, tInventoryBList, tMoveInstBList, tReceivePlanBList, tShippingInstBList, tStockList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWarehouseBhv extends AbstractBehaviorWritable<MWarehouse, MWarehouseCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MWarehouseDbm asDBMeta() { return MWarehouseDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_WAREHOUSE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MWarehouseDbm getMyDBMeta() { return MWarehouseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MWarehouseCB newConditionBean() { return new MWarehouseCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MWarehouse newMyEntity() { return new MWarehouse(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MWarehouseCB newMyConditionBean() { return new MWarehouseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MWarehouseCB cb) {
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
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().setFoo...(value);
     * MWarehouse mWarehouse = <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mWarehouse != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mWarehouse.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWarehouse selectEntity(MWarehouseCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MWarehouse facadeSelectEntity(MWarehouseCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWarehouse> OptionalEntity<ENTITY> doSelectOptionalEntity(MWarehouseCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().set...;
     * MWarehouse mWarehouse = <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mWarehouse.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWarehouse selectEntityWithDeletedCheck(MWarehouseCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param warehouseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWarehouse selectByPKValue(Long warehouseId) {
        return facadeSelectByPKValue(warehouseId);
    }

    protected MWarehouse facadeSelectByPKValue(Long warehouseId) {
        return doSelectByPK(warehouseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWarehouse> ENTITY doSelectByPK(Long warehouseId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(warehouseId), tp);
    }

    protected <ENTITY extends MWarehouse> OptionalEntity<ENTITY> doSelectOptionalByPK(Long warehouseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(warehouseId, tp), warehouseId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param warehouseId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWarehouse selectByPKValueWithDeletedCheck(Long warehouseId) {
        return doSelectByPKWithDeletedCheck(warehouseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWarehouse> ENTITY doSelectByPKWithDeletedCheck(Long warehouseId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(warehouseId), tp);
    }

    protected MWarehouseCB xprepareCBAsPK(Long warehouseId) {
        assertObjectNotNull("warehouseId", warehouseId);
        return newConditionBean().acceptPK(warehouseId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param warehouseCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWarehouse> selectByUniqueOf(Long centerId, String warehouseCd) {
        return facadeSelectByUniqueOf(centerId, warehouseCd);
    }

    protected OptionalEntity<MWarehouse> facadeSelectByUniqueOf(Long centerId, String warehouseCd) {
        return doSelectByUniqueOf(centerId, warehouseCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWarehouse> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String warehouseCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, warehouseCd), tp), centerId, warehouseCd);
    }

    protected MWarehouseCB xprepareCBAsUniqueOf(Long centerId, String warehouseCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("warehouseCd", warehouseCd);
        return newConditionBean().acceptUniqueOf(centerId, warehouseCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MWarehouse&gt; <span style="color: #553000">mWarehouseList</span> = <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MWarehouse> selectList(MWarehouseCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MWarehouse&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">page</span>) {
     *     ... = mWarehouse.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MWarehouse> selectPage(MWarehouseCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().set...
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @param entityRowHandler The handler of entity row of MWarehouse. (NotNull)
     */
    public void selectCursor(MWarehouseCB cb, EntityRowHandler<MWarehouse> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MWarehouseCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MWarehouseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MWarehouse> mWarehouseList, ReferrerLoaderHandler<LoaderOfMWarehouse> loaderLambda) {
        xassLRArg(mWarehouseList, loaderLambda);
        loaderLambda.handle(new LoaderOfMWarehouse().ready(mWarehouseList, _behaviorSelector));
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
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MWarehouse mWarehouse, ReferrerLoaderHandler<LoaderOfMWarehouse> loaderLambda) {
        xassLRArg(mWarehouse, loaderLambda);
        loaderLambda.handle(new LoaderOfMWarehouse().ready(xnewLRAryLs(mWarehouse), _behaviorSelector));
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadMWebHtInfoList(mWarehouseList, new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MWarehouse mWarehouse, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadMWebHtInfoList(xnewLRLs(mWarehouse), new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MWarehouse mWarehouse, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadMWebHtInfoList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MWarehouse> mWarehouseList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<MWebHtInfo>)EMPTY_NREF_LGWAY; }
        return doLoadMWebHtInfoList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWebHtInfo> doLoadMWebHtInfoList(List<MWarehouse> mWarehouseList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "mWebHtInfoList");
    }

    /**
     * Load referrer of MZoneList by the set-upper of referrer. <br>
     * M_ZONE by WAREHOUSE_ID, named 'MZoneList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadMZoneList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">zoneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneCB</span>.setupSelect...
     *     <span style="color: #553000">zoneCB</span>.query().set...
     *     <span style="color: #553000">zoneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getMZoneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MZone> loadMZoneList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<MZoneCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadMZoneList(mWarehouseList, new LoadReferrerOption<MZoneCB, MZone>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MZoneList by the set-upper of referrer. <br>
     * M_ZONE by WAREHOUSE_ID, named 'MZoneList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadMZoneList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">zoneCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zoneCB</span>.setupSelect...
     *     <span style="color: #553000">zoneCB</span>.query().set...
     *     <span style="color: #553000">zoneCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getMZoneList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MZone> loadMZoneList(MWarehouse mWarehouse, ConditionBeanSetupper<MZoneCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadMZoneList(xnewLRLs(mWarehouse), new LoadReferrerOption<MZoneCB, MZone>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MZone> loadMZoneList(MWarehouse mWarehouse, LoadReferrerOption<MZoneCB, MZone> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadMZoneList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MZone> loadMZoneList(List<MWarehouse> mWarehouseList, LoadReferrerOption<MZoneCB, MZone> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<MZone>)EMPTY_NREF_LGWAY; }
        return doLoadMZoneList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MZone> doLoadMZoneList(List<MWarehouse> mWarehouseList, LoadReferrerOption<MZoneCB, MZone> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "mZoneList");
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by WAREHOUSE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTAllocInstBList(mWarehouseList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by WAREHOUSE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MWarehouse mWarehouse, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(mWarehouse), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MWarehouse mWarehouse, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by WAREHOUSE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTInventoryBList(mWarehouseList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by WAREHOUSE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MWarehouse mWarehouse, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(mWarehouse), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MWarehouse mWarehouse, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by WAREHOUSE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTMoveInstBList(mWarehouseList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by WAREHOUSE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MWarehouse mWarehouse, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(mWarehouse), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MWarehouse mWarehouse, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_PlanWarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTReceivePlanBList(mWarehouseList, new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_B by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_PlanWarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(MWarehouse mWarehouse, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTReceivePlanBList(xnewLRLs(mWarehouse), new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(MWarehouse mWarehouse, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTReceivePlanBList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanB>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanBList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanB> doLoadTReceivePlanBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tReceivePlanBList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by WAREHOUSE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTShippingInstBList(mWarehouseList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by WAREHOUSE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MWarehouse mWarehouse, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(mWarehouse), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MWarehouse mWarehouse, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by WAREHOUSE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadTStockList(mWarehouseList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by WAREHOUSE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MWarehouse mWarehouse, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadTStockList(xnewLRLs(mWarehouse), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MWarehouse mWarehouse, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadTStockList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MWarehouse> mWarehouseList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "tStockList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mWarehouseList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MWarehouse mWarehouse, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mWarehouse), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MWarehouse mWarehouse, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mWarehouseList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MWarehouse mWarehouse, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mWarehouse), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MWarehouse mWarehouse, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mWarehouseList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MWarehouse mWarehouse, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mWarehouse), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MWarehouse mWarehouse, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mWarehouseList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWarehouse mWarehouse : <span style="color: #553000">mWarehouseList</span>) {
     *     ... = mWarehouse.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MWarehouse> mWarehouseList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mWarehouseList, refCBLambda);
        return doLoadWHtReceiveStoreList(mWarehouseList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mWarehouse</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWarehouse</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWarehouseId_InScope(pkList);
     * cb.query().addOrderBy_WarehouseId_Asc();
     * </pre>
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MWarehouse mWarehouse, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mWarehouse, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mWarehouse), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mWarehouse The entity of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MWarehouse mWarehouse, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mWarehouse, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mWarehouse), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mWarehouseList The entity list of MWarehouse. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mWarehouseList, loadReferrerOption);
        if (mWarehouseList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mWarehouseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MWarehouse> mWarehouseList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mWarehouseList, option, "wHtReceiveStoreList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mWarehouseList The list of mWarehouse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MWarehouse> mWarehouseList)
    { return helpPulloutInternally(mWarehouseList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mWarehouseList The list of mWarehouse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MWarehouse> mWarehouseList)
    { return helpPulloutInternally(mWarehouseList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mWarehouseList The list of mWarehouse. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByForeignFlg(List<MWarehouse> mWarehouseList)
    { return helpPulloutInternally(mWarehouseList, "bClassDtlByForeignFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key warehouseId.
     * @param mWarehouseList The list of mWarehouse. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractWarehouseIdList(List<MWarehouse> mWarehouseList)
    { return helpExtractListInternally(mWarehouseList, "warehouseId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWarehouse.setFoo...(value);
     * mWarehouse.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWarehouse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWarehouse.set...;</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">insert</span>(mWarehouse);
     * ... = mWarehouse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mWarehouse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MWarehouse mWarehouse) {
        doInsert(mWarehouse, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWarehouse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWarehouse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWarehouse.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWarehouse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">update</span>(mWarehouse);
     * </pre>
     * @param mWarehouse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MWarehouse mWarehouse) {
        doUpdate(mWarehouse, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWarehouse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWarehouse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWarehouse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mWarehouse);
     * </pre>
     * @param mWarehouse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MWarehouse mWarehouse) {
        doUpdateNonstrict(mWarehouse, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWarehouse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MWarehouse mWarehouse) {
        doInsertOrUpdate(mWarehouse, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWarehouse The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MWarehouse mWarehouse) {
        doInsertOrUpdateNonstrict(mWarehouse, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWarehouse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">delete</span>(mWarehouse);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mWarehouse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MWarehouse mWarehouse) {
        doDelete(mWarehouse, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mWarehouse);
     * </pre>
     * @param mWarehouse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MWarehouse mWarehouse) {
        doDeleteNonstrict(mWarehouse, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mWarehouse);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mWarehouse The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MWarehouse mWarehouse) {
        doDeleteNonstrictIgnoreDeleted(mWarehouse, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MWarehouse et, final DeleteOption<MWarehouseCB> op) {
        assertObjectNotNull("mWarehouse", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     *     mWarehouse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWarehouse.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mWarehouseList.add(mWarehouse);
     * }
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchInsert</span>(mWarehouseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MWarehouse> mWarehouseList) {
        return doBatchInsert(mWarehouseList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     *     mWarehouse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWarehouse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWarehouse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWarehouse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWarehouseList.add(mWarehouse);
     * }
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWarehouseList);
     * </pre>
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MWarehouse> mWarehouseList) {
        return doBatchUpdate(mWarehouseList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mWarehouseBhv.<span style="color: #CC4747">batchUpdate</span>(mWarehouseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWarehouseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MWarehouse> mWarehouseList, SpecifyQuery<MWarehouseCB> colCBLambda) {
        return doBatchUpdate(mWarehouseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     *     mWarehouse.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWarehouse.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWarehouse.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWarehouse.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWarehouseList.add(mWarehouse);
     * }
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWarehouseList);
     * </pre>
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MWarehouse> mWarehouseList) {
        return doBatchUpdateNonstrict(mWarehouseList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mWarehouseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mWarehouseList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MWarehouse> mWarehouseList, SpecifyQuery<MWarehouseCB> colCBLambda) {
        return doBatchUpdateNonstrict(mWarehouseList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MWarehouse> mWarehouseList) {
        return doBatchDelete(mWarehouseList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MWarehouse> mWarehouseList) {
        return doBatchDeleteNonstrict(mWarehouseList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MWarehouse, MWarehouseCB&gt;() {
     *     public ConditionBean setup(MWarehouse entity, MWarehouseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MWarehouse, MWarehouseCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWarehouse.setPK...(value);</span>
     * mWarehouse.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWarehouse.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWarehouse.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mWarehouse, cb);
     * </pre>
     * @param mWarehouse The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MWarehouse mWarehouse, MWarehouseCB cb) {
        return doQueryUpdate(mWarehouse, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MWarehouseCB cb = new MWarehouseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWarehouse, cb);
     * </pre>
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MWarehouseCB cb) {
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
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWarehouse.setFoo...(value);
     * mWarehouse.setBar...(value);
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mWarehouse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mWarehouse.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mWarehouse The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, InsertOption<MWarehouseCB>> opLambda) {
        doInsert(mWarehouse, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWarehouse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWarehouse.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mWarehouse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWarehouse The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> opLambda) {
        doUpdate(mWarehouse, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * mWarehouse.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWarehouse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mWarehouse, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWarehouse The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> opLambda) {
        doUpdateNonstrict(mWarehouse, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mWarehouse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, InsertOption<MWarehouseCB>> insertOpLambda, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> updateOpLambda) {
        doInsertOrUpdate(mWarehouse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mWarehouse The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, InsertOption<MWarehouseCB>> insertOpLambda, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mWarehouse, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mWarehouse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, DeleteOption<MWarehouseCB>> opLambda) {
        doDelete(mWarehouse, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mWarehouse The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MWarehouse mWarehouse, WritableOptionCall<MWarehouseCB, DeleteOption<MWarehouseCB>> opLambda) {
        doDeleteNonstrict(mWarehouse, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MWarehouse> mWarehouseList, WritableOptionCall<MWarehouseCB, InsertOption<MWarehouseCB>> opLambda) {
        return doBatchInsert(mWarehouseList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MWarehouse> mWarehouseList, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> opLambda) {
        return doBatchUpdate(mWarehouseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MWarehouse> mWarehouseList, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> opLambda) {
        return doBatchUpdateNonstrict(mWarehouseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MWarehouse> mWarehouseList, WritableOptionCall<MWarehouseCB, DeleteOption<MWarehouseCB>> opLambda) {
        return doBatchDelete(mWarehouseList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mWarehouseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MWarehouse> mWarehouseList, WritableOptionCall<MWarehouseCB, DeleteOption<MWarehouseCB>> opLambda) {
        return doBatchDeleteNonstrict(mWarehouseList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MWarehouse, MWarehouseCB> manyArgLambda, WritableOptionCall<MWarehouseCB, InsertOption<MWarehouseCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWarehouse mWarehouse = <span style="color: #70226C">new</span> MWarehouse();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWarehouse.setPK...(value);</span>
     * mWarehouse.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWarehouse.setVersionNo(value);</span>
     * MWarehouseCB cb = <span style="color: #70226C">new</span> MWarehouseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mWarehouseBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mWarehouse, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mWarehouse The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MWarehouse mWarehouse, MWarehouseCB cb, WritableOptionCall<MWarehouseCB, UpdateOption<MWarehouseCB>> opLambda) {
        return doQueryUpdate(mWarehouse, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MWarehouse. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MWarehouseCB cb, WritableOptionCall<MWarehouseCB, DeleteOption<MWarehouseCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mWarehouseBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mWarehouseBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWarehouseBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mWarehouseBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWarehouseBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mWarehouseBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mWarehouseBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mWarehouseBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mWarehouseBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mWarehouseBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mWarehouseBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mWarehouseBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mWarehouseBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mWarehouseBhv.outideSql().removeBlockComment().selectList()
     * mWarehouseBhv.outideSql().removeLineComment().selectList()
     * mWarehouseBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MWarehouseBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MWarehouseBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MWarehouse> typeOfSelectedEntity() { return MWarehouse.class; }
    protected Class<MWarehouse> typeOfHandlingEntity() { return MWarehouse.class; }
    protected Class<MWarehouseCB> typeOfHandlingConditionBean() { return MWarehouseCB.class; }
}
