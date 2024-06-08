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
 * The behavior of M_SHAPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_ID
 *
 * [column]
 *     SHAPE_ID, SHAPE_CD, SHAPE_DICT_ID, SHAPE_UNIT_DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     H_INVENTORY_B, H_STOCK, M_SHAPE_GRP_DTL, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK
 *
 * [foreign property]
 *     bDictByShapeDictId, bDictByShapeUnitDictId, vDictByShapeDictId, vDictByShapeUnitDictId, bClassDtlByDelFlg
 *
 * [referrer property]
 *     hInventoryBList, hStockList, mShapeGrpDtlList, tAllocInstBList, tInventoryBList, tMoveInstBList, tPickingBList, tShippingInstBList, tStockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShapeBhv extends AbstractBehaviorWritable<MShape, MShapeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MShapeDbm asDBMeta() { return MShapeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_SHAPE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MShapeDbm getMyDBMeta() { return MShapeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MShapeCB newConditionBean() { return new MShapeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MShape newMyEntity() { return new MShape(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MShapeCB newMyConditionBean() { return new MShapeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MShapeCB cb) {
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
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().setFoo...(value);
     * MShape mShape = <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mShape != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mShape.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShape selectEntity(MShapeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MShape facadeSelectEntity(MShapeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShape> OptionalEntity<ENTITY> doSelectOptionalEntity(MShapeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().set...;
     * MShape mShape = <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mShape.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShape selectEntityWithDeletedCheck(MShapeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shapeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShape selectByPKValue(Long shapeId) {
        return facadeSelectByPKValue(shapeId);
    }

    protected MShape facadeSelectByPKValue(Long shapeId) {
        return doSelectByPK(shapeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShape> ENTITY doSelectByPK(Long shapeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shapeId), tp);
    }

    protected <ENTITY extends MShape> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shapeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shapeId, tp), shapeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shapeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShape selectByPKValueWithDeletedCheck(Long shapeId) {
        return doSelectByPKWithDeletedCheck(shapeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShape> ENTITY doSelectByPKWithDeletedCheck(Long shapeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shapeId), tp);
    }

    protected MShapeCB xprepareCBAsPK(Long shapeId) {
        assertObjectNotNull("shapeId", shapeId);
        return newConditionBean().acceptPK(shapeId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param shapeCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MShape> selectByUniqueOf(String shapeCd) {
        return facadeSelectByUniqueOf(shapeCd);
    }

    protected OptionalEntity<MShape> facadeSelectByUniqueOf(String shapeCd) {
        return doSelectByUniqueOf(shapeCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShape> OptionalEntity<ENTITY> doSelectByUniqueOf(String shapeCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(shapeCd), tp), shapeCd);
    }

    protected MShapeCB xprepareCBAsUniqueOf(String shapeCd) {
        assertObjectNotNull("shapeCd", shapeCd);
        return newConditionBean().acceptUniqueOf(shapeCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MShape&gt; <span style="color: #553000">mShapeList</span> = <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MShape> selectList(MShapeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MShape&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">page</span>) {
     *     ... = mShape.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MShape> selectPage(MShapeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().set...
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @param entityRowHandler The handler of entity row of MShape. (NotNull)
     */
    public void selectCursor(MShapeCB cb, EntityRowHandler<MShape> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MShape> mShapeList, ReferrerLoaderHandler<LoaderOfMShape> loaderLambda) {
        xassLRArg(mShapeList, loaderLambda);
        loaderLambda.handle(new LoaderOfMShape().ready(mShapeList, _behaviorSelector));
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
     * @param mShape The entity of MShape. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MShape mShape, ReferrerLoaderHandler<LoaderOfMShape> loaderLambda) {
        xassLRArg(mShape, loaderLambda);
        loaderLambda.handle(new LoaderOfMShape().ready(xnewLRAryLs(mShape), _behaviorSelector));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getHInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<MShape> mShapeList, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadHInventoryBList(mShapeList, new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HInventoryBList by the set-upper of referrer. <br>
     * H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadHInventoryBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getHInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(MShape mShape, ConditionBeanSetupper<HInventoryBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadHInventoryBList(xnewLRLs(mShape), new LoadReferrerOption<HInventoryBCB, HInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(MShape mShape, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadHInventoryBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HInventoryB> loadHInventoryBList(List<MShape> mShapeList, LoadReferrerOption<HInventoryBCB, HInventoryB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<HInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadHInventoryBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HInventoryB> doLoadHInventoryBList(List<MShape> mShapeList, LoadReferrerOption<HInventoryBCB, HInventoryB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "hInventoryBList");
    }

    /**
     * Load referrer of HStockList by the set-upper of referrer. <br>
     * H_STOCK by SHAPE_ID, named 'HStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadHStockList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getHStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(List<MShape> mShapeList, ConditionBeanSetupper<HStockCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadHStockList(mShapeList, new LoadReferrerOption<HStockCB, HStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockList by the set-upper of referrer. <br>
     * H_STOCK by SHAPE_ID, named 'HStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadHStockList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getHStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(MShape mShape, ConditionBeanSetupper<HStockCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadHStockList(xnewLRLs(mShape), new LoadReferrerOption<HStockCB, HStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStock> loadHStockList(MShape mShape, LoadReferrerOption<HStockCB, HStock> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadHStockList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStock> loadHStockList(List<MShape> mShapeList, LoadReferrerOption<HStockCB, HStock> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<HStock>)EMPTY_NREF_LGWAY; }
        return doLoadHStockList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStock> doLoadHStockList(List<MShape> mShapeList, LoadReferrerOption<HStockCB, HStock> option) {
        return helpLoadReferrerInternally(mShapeList, option, "hStockList");
    }

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(List<MShape> mShapeList, ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadMShapeGrpDtlList(mShapeList, new LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(MShape mShape, ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadMShapeGrpDtlList(xnewLRLs(mShape), new LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(MShape mShape, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadMShapeGrpDtlList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(List<MShape> mShapeList, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<MShapeGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMShapeGrpDtlList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MShapeGrpDtl> doLoadMShapeGrpDtlList(List<MShape> mShapeList, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> option) {
        return helpLoadReferrerInternally(mShapeList, option, "mShapeGrpDtlList");
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MShape> mShapeList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTAllocInstBList(mShapeList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MShape mShape, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(mShape), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MShape mShape, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MShape> mShapeList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<MShape> mShapeList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MShape> mShapeList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTInventoryBList(mShapeList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MShape mShape, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(mShape), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MShape mShape, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MShape> mShapeList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<MShape> mShapeList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MShape> mShapeList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTMoveInstBList(mShapeList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MShape mShape, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(mShape), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MShape mShape, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MShape> mShapeList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<MShape> mShapeList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<MShape> mShapeList, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTPickingBList(mShapeList, new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTPickingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(MShape mShape, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTPickingBList(xnewLRLs(mShape), new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(MShape mShape, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTPickingBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<MShape> mShapeList, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TPickingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingB> doLoadTPickingBList(List<MShape> mShapeList, LoadReferrerOption<TPickingBCB, TPickingB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tPickingBList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MShape> mShapeList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTShippingInstBList(mShapeList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MShape mShape, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(mShape), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MShape mShape, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MShape> mShapeList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<MShape> mShapeList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by SHAPE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mShapeList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShape mShape : <span style="color: #553000">mShapeList</span>) {
     *     ... = mShape.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MShape> mShapeList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mShapeList, refCBLambda);
        return doLoadTStockList(mShapeList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by SHAPE_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mShape</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShape</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeId_InScope(pkList);
     * cb.query().addOrderBy_ShapeId_Asc();
     * </pre>
     * @param mShape The entity of MShape. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MShape mShape, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mShape, refCBLambda);
        return doLoadTStockList(xnewLRLs(mShape), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShape The entity of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MShape mShape, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mShape, loadReferrerOption);
        return loadTStockList(xnewLRLs(mShape), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeList The entity list of MShape. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MShape> mShapeList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mShapeList, loadReferrerOption);
        if (mShapeList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mShapeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MShape> mShapeList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mShapeList, option, "tStockList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDictByShapeDictId(List<MShape> mShapeList)
    { return helpPulloutInternally(mShapeList, "bDictByShapeDictId"); }

    /**
     * Pull out the list of foreign table 'BDict'.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDictByShapeUnitDictId(List<MShape> mShapeList)
    { return helpPulloutInternally(mShapeList, "bDictByShapeUnitDictId"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDictByShapeDictId(List<MShape> mShapeList)
    { return helpPulloutInternally(mShapeList, "vDictByShapeDictId"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDictByShapeUnitDictId(List<MShape> mShapeList)
    { return helpPulloutInternally(mShapeList, "vDictByShapeUnitDictId"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MShape> mShapeList)
    { return helpPulloutInternally(mShapeList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shapeId.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShapeIdList(List<MShape> mShapeList)
    { return helpExtractListInternally(mShapeList, "shapeId"); }

    /**
     * Extract the value list of (single) unique key shapeCd.
     * @param mShapeList The list of mShape. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractShapeCdList(List<MShape> mShapeList)
    { return helpExtractListInternally(mShapeList, "shapeCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShape.setFoo...(value);
     * mShape.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShape.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShape.set...;</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">insert</span>(mShape);
     * ... = mShape.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mShape The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MShape mShape) {
        doInsert(mShape, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShape.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShape.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShape.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShape.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">update</span>(mShape);
     * </pre>
     * @param mShape The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MShape mShape) {
        doUpdate(mShape, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShape.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShape.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShape.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mShape);
     * </pre>
     * @param mShape The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MShape mShape) {
        doUpdateNonstrict(mShape, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShape The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MShape mShape) {
        doInsertOrUpdate(mShape, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShape The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MShape mShape) {
        doInsertOrUpdateNonstrict(mShape, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShape.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">delete</span>(mShape);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mShape The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MShape mShape) {
        doDelete(mShape, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mShape);
     * </pre>
     * @param mShape The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MShape mShape) {
        doDeleteNonstrict(mShape, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mShape);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mShape The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MShape mShape) {
        doDeleteNonstrictIgnoreDeleted(mShape, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MShape et, final DeleteOption<MShapeCB> op) {
        assertObjectNotNull("mShape", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MShape mShape = <span style="color: #70226C">new</span> MShape();
     *     mShape.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShape.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mShapeList.add(mShape);
     * }
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchInsert</span>(mShapeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MShape> mShapeList) {
        return doBatchInsert(mShapeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MShape mShape = <span style="color: #70226C">new</span> MShape();
     *     mShape.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShape.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShape.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShape.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeList.add(mShape);
     * }
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeList);
     * </pre>
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShape> mShapeList) {
        return doBatchUpdate(mShapeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mShapeBhv.<span style="color: #CC4747">batchUpdate</span>(mShapeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShape> mShapeList, SpecifyQuery<MShapeCB> colCBLambda) {
        return doBatchUpdate(mShapeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MShape mShape = <span style="color: #70226C">new</span> MShape();
     *     mShape.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShape.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShape.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShape.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeList.add(mShape);
     * }
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeList);
     * </pre>
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShape> mShapeList) {
        return doBatchUpdateNonstrict(mShapeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShape> mShapeList, SpecifyQuery<MShapeCB> colCBLambda) {
        return doBatchUpdateNonstrict(mShapeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MShape> mShapeList) {
        return doBatchDelete(mShapeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MShape> mShapeList) {
        return doBatchDeleteNonstrict(mShapeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MShape, MShapeCB&gt;() {
     *     public ConditionBean setup(MShape entity, MShapeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MShape, MShapeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShape.setPK...(value);</span>
     * mShape.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShape.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShape.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mShape, cb);
     * </pre>
     * @param mShape The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MShape mShape, MShapeCB cb) {
        return doQueryUpdate(mShape, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MShapeCB cb = new MShapeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">queryDelete</span>(mShape, cb);
     * </pre>
     * @param cb The condition-bean of MShape. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MShapeCB cb) {
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
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShape.setFoo...(value);
     * mShape.setBar...(value);
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mShape, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mShape.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mShape The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MShape mShape, WritableOptionCall<MShapeCB, InsertOption<MShapeCB>> opLambda) {
        doInsert(mShape, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShape.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShape.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mShape, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShape The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MShape mShape, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> opLambda) {
        doUpdate(mShape, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * mShape.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShape.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mShape, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShape The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MShape mShape, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> opLambda) {
        doUpdateNonstrict(mShape, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mShape The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MShape mShape, WritableOptionCall<MShapeCB, InsertOption<MShapeCB>> insertOpLambda, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> updateOpLambda) {
        doInsertOrUpdate(mShape, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mShape The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MShape mShape, WritableOptionCall<MShapeCB, InsertOption<MShapeCB>> insertOpLambda, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mShape, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mShape The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MShape mShape, WritableOptionCall<MShapeCB, DeleteOption<MShapeCB>> opLambda) {
        doDelete(mShape, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mShape The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MShape mShape, WritableOptionCall<MShapeCB, DeleteOption<MShapeCB>> opLambda) {
        doDeleteNonstrict(mShape, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MShape> mShapeList, WritableOptionCall<MShapeCB, InsertOption<MShapeCB>> opLambda) {
        return doBatchInsert(mShapeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MShape> mShapeList, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> opLambda) {
        return doBatchUpdate(mShapeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MShape> mShapeList, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> opLambda) {
        return doBatchUpdateNonstrict(mShapeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MShape> mShapeList, WritableOptionCall<MShapeCB, DeleteOption<MShapeCB>> opLambda) {
        return doBatchDelete(mShapeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mShapeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MShape> mShapeList, WritableOptionCall<MShapeCB, DeleteOption<MShapeCB>> opLambda) {
        return doBatchDeleteNonstrict(mShapeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MShape, MShapeCB> manyArgLambda, WritableOptionCall<MShapeCB, InsertOption<MShapeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShape mShape = <span style="color: #70226C">new</span> MShape();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShape.setPK...(value);</span>
     * mShape.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShape.setVersionNo(value);</span>
     * MShapeCB cb = <span style="color: #70226C">new</span> MShapeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mShape, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mShape The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MShape. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MShape mShape, MShapeCB cb, WritableOptionCall<MShapeCB, UpdateOption<MShapeCB>> opLambda) {
        return doQueryUpdate(mShape, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MShape. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MShapeCB cb, WritableOptionCall<MShapeCB, DeleteOption<MShapeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mShapeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mShapeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mShapeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mShapeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mShapeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mShapeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mShapeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mShapeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mShapeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mShapeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mShapeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mShapeBhv.outideSql().removeBlockComment().selectList()
     * mShapeBhv.outideSql().removeLineComment().selectList()
     * mShapeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MShapeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MShapeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MShape> typeOfSelectedEntity() { return MShape.class; }
    protected Class<MShape> typeOfHandlingEntity() { return MShape.class; }
    protected Class<MShapeCB> typeOfHandlingConditionBean() { return MShapeCB.class; }
}
