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
 * The behavior of M_ZONE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZONE_ID
 *
 * [column]
 *     ZONE_ID, WAREHOUSE_ID, ZONE_CD, ZONE_NM, PICKING_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZONE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_WAREHOUSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_LOCATION, M_PARAM, T_INVENTORY_INST
 *
 * [foreign property]
 *     mWarehouse, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mLocationList, mParamList, tInventoryInstList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMZoneBhv extends AbstractBehaviorWritable<MZone, MZoneCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MZoneDbm asDBMeta() { return MZoneDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_ZONE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MZoneDbm getMyDBMeta() { return MZoneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MZoneCB newConditionBean() { return new MZoneCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MZone newMyEntity() { return new MZone(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MZoneCB newMyConditionBean() { return new MZoneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MZoneCB cb) {
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
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().setFoo...(value);
     * MZone mZone = <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mZone != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mZone.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MZone selectEntity(MZoneCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MZone facadeSelectEntity(MZoneCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MZone> OptionalEntity<ENTITY> doSelectOptionalEntity(MZoneCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().set...;
     * MZone mZone = <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mZone.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MZone selectEntityWithDeletedCheck(MZoneCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param zoneId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MZone selectByPKValue(Long zoneId) {
        return facadeSelectByPKValue(zoneId);
    }

    protected MZone facadeSelectByPKValue(Long zoneId) {
        return doSelectByPK(zoneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MZone> ENTITY doSelectByPK(Long zoneId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(zoneId), tp);
    }

    protected <ENTITY extends MZone> OptionalEntity<ENTITY> doSelectOptionalByPK(Long zoneId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(zoneId, tp), zoneId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param zoneId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MZone selectByPKValueWithDeletedCheck(Long zoneId) {
        return doSelectByPKWithDeletedCheck(zoneId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MZone> ENTITY doSelectByPKWithDeletedCheck(Long zoneId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(zoneId), tp);
    }

    protected MZoneCB xprepareCBAsPK(Long zoneId) {
        assertObjectNotNull("zoneId", zoneId);
        return newConditionBean().acceptPK(zoneId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param warehouseId : UQ+, IX, NotNull, bigint(19), FK to M_WAREHOUSE. (NotNull)
     * @param zoneCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MZone> selectByUniqueOf(Long warehouseId, String zoneCd) {
        return facadeSelectByUniqueOf(warehouseId, zoneCd);
    }

    protected OptionalEntity<MZone> facadeSelectByUniqueOf(Long warehouseId, String zoneCd) {
        return doSelectByUniqueOf(warehouseId, zoneCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MZone> OptionalEntity<ENTITY> doSelectByUniqueOf(Long warehouseId, String zoneCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(warehouseId, zoneCd), tp), warehouseId, zoneCd);
    }

    protected MZoneCB xprepareCBAsUniqueOf(Long warehouseId, String zoneCd) {
        assertObjectNotNull("warehouseId", warehouseId);assertObjectNotNull("zoneCd", zoneCd);
        return newConditionBean().acceptUniqueOf(warehouseId, zoneCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MZone&gt; <span style="color: #553000">mZoneList</span> = <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MZone> selectList(MZoneCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MZone&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MZone mZone : <span style="color: #553000">page</span>) {
     *     ... = mZone.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MZone> selectPage(MZoneCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().set...
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @param entityRowHandler The handler of entity row of MZone. (NotNull)
     */
    public void selectCursor(MZoneCB cb, EntityRowHandler<MZone> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MZoneCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MZoneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MZone> mZoneList, ReferrerLoaderHandler<LoaderOfMZone> loaderLambda) {
        xassLRArg(mZoneList, loaderLambda);
        loaderLambda.handle(new LoaderOfMZone().ready(mZoneList, _behaviorSelector));
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
     * @param mZone The entity of MZone. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MZone mZone, ReferrerLoaderHandler<LoaderOfMZone> loaderLambda) {
        xassLRArg(mZone, loaderLambda);
        loaderLambda.handle(new LoaderOfMZone().ready(xnewLRAryLs(mZone), _behaviorSelector));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by ZONE_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MZone> mZoneList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mZoneList, refCBLambda);
        return doLoadMLocationList(mZoneList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by ZONE_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mZone</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mZone</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param mZone The entity of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MZone mZone, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mZone, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mZone), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mZone The entity of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MZone mZone, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mZone, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mZone), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MZone> mZoneList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mZoneList, loadReferrerOption);
        if (mZoneList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mZoneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MZone> mZoneList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mZoneList, option, "mLocationList");
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by EM_REPLENISH_ZONE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEmReplenishZoneId_InScope(pkList);
     * cb.query().addOrderBy_EmReplenishZoneId_Asc();
     * </pre>
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(List<MZone> mZoneList, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mZoneList, refCBLambda);
        return doLoadMParamList(mZoneList, new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by EM_REPLENISH_ZONE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mZone</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mZone</span>.<span style="color: #CC4747">getMParamList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEmReplenishZoneId_InScope(pkList);
     * cb.query().addOrderBy_EmReplenishZoneId_Asc();
     * </pre>
     * @param mZone The entity of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MZone mZone, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mZone, refCBLambda);
        return doLoadMParamList(xnewLRLs(mZone), new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mZone The entity of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MZone mZone, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mZone, loadReferrerOption);
        return loadMParamList(xnewLRLs(mZone), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MParam> loadMParamList(List<MZone> mZoneList, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mZoneList, loadReferrerOption);
        if (mZoneList.isEmpty()) { return (NestedReferrerListGateway<MParam>)EMPTY_NREF_LGWAY; }
        return doLoadMParamList(mZoneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MParam> doLoadMParamList(List<MZone> mZoneList, LoadReferrerOption<MParamCB, MParam> option) {
        return helpLoadReferrerInternally(mZoneList, option, "mParamList");
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by ZONE_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mZoneList</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MZone mZone : <span style="color: #553000">mZoneList</span>) {
     *     ... = mZone.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MZone> mZoneList, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mZoneList, refCBLambda);
        return doLoadTInventoryInstList(mZoneList, new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * T_INVENTORY_INST by ZONE_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">mZone</span>, <span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">instCB</span>.setupSelect...
     *     <span style="color: #553000">instCB</span>.query().set...
     *     <span style="color: #553000">instCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mZone</span>.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZoneId_InScope(pkList);
     * cb.query().addOrderBy_ZoneId_Asc();
     * </pre>
     * @param mZone The entity of MZone. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MZone mZone, ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        xassLRArg(mZone, refCBLambda);
        return doLoadTInventoryInstList(xnewLRLs(mZone), new LoadReferrerOption<TInventoryInstCB, TInventoryInst>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mZone The entity of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(MZone mZone, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mZone, loadReferrerOption);
        return loadTInventoryInstList(xnewLRLs(mZone), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mZoneList The entity list of MZone. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryInst> loadTInventoryInstList(List<MZone> mZoneList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> loadReferrerOption) {
        xassLRArg(mZoneList, loadReferrerOption);
        if (mZoneList.isEmpty()) { return (NestedReferrerListGateway<TInventoryInst>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryInstList(mZoneList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryInst> doLoadTInventoryInstList(List<MZone> mZoneList, LoadReferrerOption<TInventoryInstCB, TInventoryInst> option) {
        return helpLoadReferrerInternally(mZoneList, option, "tInventoryInstList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param mZoneList The list of mZone. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<MZone> mZoneList)
    { return helpPulloutInternally(mZoneList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mZoneList The list of mZone. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MZone> mZoneList)
    { return helpPulloutInternally(mZoneList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key zoneId.
     * @param mZoneList The list of mZone. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractZoneIdList(List<MZone> mZoneList)
    { return helpExtractListInternally(mZoneList, "zoneId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mZone.setFoo...(value);
     * mZone.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mZone.set...;</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">insert</span>(mZone);
     * ... = mZone.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mZone The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MZone mZone) {
        doInsert(mZone, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mZone.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">update</span>(mZone);
     * </pre>
     * @param mZone The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MZone mZone) {
        doUpdate(mZone, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mZone.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mZone);
     * </pre>
     * @param mZone The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MZone mZone) {
        doUpdateNonstrict(mZone, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mZone The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MZone mZone) {
        doInsertOrUpdate(mZone, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mZone The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MZone mZone) {
        doInsertOrUpdateNonstrict(mZone, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">delete</span>(mZone);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MZone mZone) {
        doDelete(mZone, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mZone);
     * </pre>
     * @param mZone The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MZone mZone) {
        doDeleteNonstrict(mZone, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mZone);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mZone The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MZone mZone) {
        doDeleteNonstrictIgnoreDeleted(mZone, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MZone et, final DeleteOption<MZoneCB> op) {
        assertObjectNotNull("mZone", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MZone mZone = <span style="color: #70226C">new</span> MZone();
     *     mZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mZone.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mZoneList.add(mZone);
     * }
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchInsert</span>(mZoneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MZone> mZoneList) {
        return doBatchInsert(mZoneList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MZone mZone = <span style="color: #70226C">new</span> MZone();
     *     mZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mZone.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mZone.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mZone.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mZoneList.add(mZone);
     * }
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mZoneList);
     * </pre>
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MZone> mZoneList) {
        return doBatchUpdate(mZoneList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mZoneBhv.<span style="color: #CC4747">batchUpdate</span>(mZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MZone> mZoneList, SpecifyQuery<MZoneCB> colCBLambda) {
        return doBatchUpdate(mZoneList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MZone mZone = <span style="color: #70226C">new</span> MZone();
     *     mZone.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mZone.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mZone.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mZone.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mZoneList.add(mZone);
     * }
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mZoneList);
     * </pre>
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MZone> mZoneList) {
        return doBatchUpdateNonstrict(mZoneList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mZoneList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MZone> mZoneList, SpecifyQuery<MZoneCB> colCBLambda) {
        return doBatchUpdateNonstrict(mZoneList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MZone> mZoneList) {
        return doBatchDelete(mZoneList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MZone> mZoneList) {
        return doBatchDeleteNonstrict(mZoneList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MZone, MZoneCB&gt;() {
     *     public ConditionBean setup(MZone entity, MZoneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MZone, MZoneCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mZone.setPK...(value);</span>
     * mZone.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mZone.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mZone.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mZone, cb);
     * </pre>
     * @param mZone The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MZone mZone, MZoneCB cb) {
        return doQueryUpdate(mZone, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MZoneCB cb = new MZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">queryDelete</span>(mZone, cb);
     * </pre>
     * @param cb The condition-bean of MZone. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MZoneCB cb) {
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
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mZone.setFoo...(value);
     * mZone.setBar...(value);
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mZone.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mZone The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MZone mZone, WritableOptionCall<MZoneCB, InsertOption<MZoneCB>> opLambda) {
        doInsert(mZone, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mZone.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mZone The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MZone mZone, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> opLambda) {
        doUpdate(mZone, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * mZone.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mZone, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mZone The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MZone mZone, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> opLambda) {
        doUpdateNonstrict(mZone, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mZone The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MZone mZone, WritableOptionCall<MZoneCB, InsertOption<MZoneCB>> insertOpLambda, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> updateOpLambda) {
        doInsertOrUpdate(mZone, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mZone The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MZone mZone, WritableOptionCall<MZoneCB, InsertOption<MZoneCB>> insertOpLambda, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mZone, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MZone mZone, WritableOptionCall<MZoneCB, DeleteOption<MZoneCB>> opLambda) {
        doDelete(mZone, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mZone The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MZone mZone, WritableOptionCall<MZoneCB, DeleteOption<MZoneCB>> opLambda) {
        doDeleteNonstrict(mZone, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MZone> mZoneList, WritableOptionCall<MZoneCB, InsertOption<MZoneCB>> opLambda) {
        return doBatchInsert(mZoneList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MZone> mZoneList, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> opLambda) {
        return doBatchUpdate(mZoneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MZone> mZoneList, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> opLambda) {
        return doBatchUpdateNonstrict(mZoneList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MZone> mZoneList, WritableOptionCall<MZoneCB, DeleteOption<MZoneCB>> opLambda) {
        return doBatchDelete(mZoneList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mZoneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MZone> mZoneList, WritableOptionCall<MZoneCB, DeleteOption<MZoneCB>> opLambda) {
        return doBatchDeleteNonstrict(mZoneList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MZone, MZoneCB> manyArgLambda, WritableOptionCall<MZoneCB, InsertOption<MZoneCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MZone mZone = <span style="color: #70226C">new</span> MZone();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mZone.setPK...(value);</span>
     * mZone.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mZone.setVersionNo(value);</span>
     * MZoneCB cb = <span style="color: #70226C">new</span> MZoneCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mZoneBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mZone, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mZone The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MZone. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MZone mZone, MZoneCB cb, WritableOptionCall<MZoneCB, UpdateOption<MZoneCB>> opLambda) {
        return doQueryUpdate(mZone, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MZone. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MZoneCB cb, WritableOptionCall<MZoneCB, DeleteOption<MZoneCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mZoneBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mZoneBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mZoneBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mZoneBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mZoneBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mZoneBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mZoneBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mZoneBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mZoneBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mZoneBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mZoneBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mZoneBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mZoneBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mZoneBhv.outideSql().removeBlockComment().selectList()
     * mZoneBhv.outideSql().removeLineComment().selectList()
     * mZoneBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MZoneBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MZoneBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MZone> typeOfSelectedEntity() { return MZone.class; }
    protected Class<MZone> typeOfHandlingEntity() { return MZone.class; }
    protected Class<MZoneCB> typeOfHandlingConditionBean() { return MZoneCB.class; }
}
