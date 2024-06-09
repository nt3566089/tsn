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
 * The behavior of T_MOVE_INST_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_B_ID
 *
 * [column]
 *     MOVE_INST_B_ID, MOVE_INST_H_ID, MOVE_INST_STATUS, INOUT_TYPE, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, LOT1, LOT2, LOT3, LOT4, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, TRANCEPORT_CD, SOURCE_CD, SOURCE_NM, SCH_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, M_LOCATION, T_LOT, T_MOVE_INST_H, M_PRODUCT, M_SHAPE, M_STOCK_TYPE, T_STORE_NO, M_WAREHOUSE, B_CLASS_DTL(ByInoutType), T_MOVE_INST_B_SUB(AsOne)
 *
 * [referrer table]
 *     T_MOVE_RECORD_B, T_MOVE_INST_B_SUB
 *
 * [foreign property]
 *     mCustomerByDepositId, mLocation, tLot, tMoveInstH, mProduct, mShape, mStockType, tStoreNo, mCustomerBySupplierId, mWarehouse, bClassDtlByInoutType, bClassDtlByMoveInstStatus, tMoveInstBSubAsOne
 *
 * [referrer property]
 *     tMoveRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTMoveInstBBhv extends AbstractBehaviorWritable<TMoveInstB, TMoveInstBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TMoveInstBDbm asDBMeta() { return TMoveInstBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_MOVE_INST_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TMoveInstBDbm getMyDBMeta() { return TMoveInstBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TMoveInstBCB newConditionBean() { return new TMoveInstBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TMoveInstB newMyEntity() { return new TMoveInstB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TMoveInstBCB newMyConditionBean() { return new TMoveInstBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TMoveInstBCB cb) {
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
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().setFoo...(value);
     * TMoveInstB tMoveInstB = <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tMoveInstB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tMoveInstB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstB selectEntity(TMoveInstBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TMoveInstB facadeSelectEntity(TMoveInstBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstB> OptionalEntity<ENTITY> doSelectOptionalEntity(TMoveInstBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().set...;
     * TMoveInstB tMoveInstB = <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tMoveInstB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstB selectEntityWithDeletedCheck(TMoveInstBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param moveInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstB selectByPKValue(Long moveInstBId) {
        return facadeSelectByPKValue(moveInstBId);
    }

    protected TMoveInstB facadeSelectByPKValue(Long moveInstBId) {
        return doSelectByPK(moveInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstB> ENTITY doSelectByPK(Long moveInstBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(moveInstBId), tp);
    }

    protected <ENTITY extends TMoveInstB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long moveInstBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(moveInstBId, tp), moveInstBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param moveInstBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TMoveInstB selectByPKValueWithDeletedCheck(Long moveInstBId) {
        return doSelectByPKWithDeletedCheck(moveInstBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TMoveInstB> ENTITY doSelectByPKWithDeletedCheck(Long moveInstBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(moveInstBId), tp);
    }

    protected TMoveInstBCB xprepareCBAsPK(Long moveInstBId) {
        assertObjectNotNull("moveInstBId", moveInstBId);
        return newConditionBean().acceptPK(moveInstBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TMoveInstB&gt; <span style="color: #553000">tMoveInstBList</span> = <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TMoveInstB tMoveInstB : <span style="color: #553000">tMoveInstBList</span>) {
     *     ... = tMoveInstB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TMoveInstB> selectList(TMoveInstBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TMoveInstB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TMoveInstB tMoveInstB : <span style="color: #553000">page</span>) {
     *     ... = tMoveInstB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TMoveInstB> selectPage(TMoveInstBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @param entityRowHandler The handler of entity row of TMoveInstB. (NotNull)
     */
    public void selectCursor(TMoveInstBCB cb, EntityRowHandler<TMoveInstB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveInstBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TMoveInstBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tMoveInstBList The entity list of TMoveInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TMoveInstB> tMoveInstBList, ReferrerLoaderHandler<LoaderOfTMoveInstB> loaderLambda) {
        xassLRArg(tMoveInstBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveInstB().ready(tMoveInstBList, _behaviorSelector));
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
     * @param tMoveInstB The entity of TMoveInstB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TMoveInstB tMoveInstB, ReferrerLoaderHandler<LoaderOfTMoveInstB> loaderLambda) {
        xassLRArg(tMoveInstB, loaderLambda);
        loaderLambda.handle(new LoaderOfTMoveInstB().ready(xnewLRAryLs(tMoveInstB), _behaviorSelector));
    }

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">tMoveInstBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TMoveInstB tMoveInstB : <span style="color: #553000">tMoveInstBList</span>) {
     *     ... = tMoveInstB.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstBId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstBId_Asc();
     * </pre>
     * @param tMoveInstBList The entity list of TMoveInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(List<TMoveInstB> tMoveInstBList, ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        xassLRArg(tMoveInstBList, refCBLambda);
        return doLoadTMoveRecordBList(tMoveInstBList, new LoadReferrerOption<TMoveRecordBCB, TMoveRecordB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">tMoveInstB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tMoveInstB</span>.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstBId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstBId_Asc();
     * </pre>
     * @param tMoveInstB The entity of TMoveInstB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(TMoveInstB tMoveInstB, ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        xassLRArg(tMoveInstB, refCBLambda);
        return doLoadTMoveRecordBList(xnewLRLs(tMoveInstB), new LoadReferrerOption<TMoveRecordBCB, TMoveRecordB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tMoveInstB The entity of TMoveInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(TMoveInstB tMoveInstB, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> loadReferrerOption) {
        xassLRArg(tMoveInstB, loadReferrerOption);
        return loadTMoveRecordBList(xnewLRLs(tMoveInstB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tMoveInstBList The entity list of TMoveInstB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveRecordB> loadTMoveRecordBList(List<TMoveInstB> tMoveInstBList, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> loadReferrerOption) {
        xassLRArg(tMoveInstBList, loadReferrerOption);
        if (tMoveInstBList.isEmpty()) { return (NestedReferrerListGateway<TMoveRecordB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveRecordBList(tMoveInstBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveRecordB> doLoadTMoveRecordBList(List<TMoveInstB> tMoveInstBList, LoadReferrerOption<TMoveRecordBCB, TMoveRecordB> option) {
        return helpLoadReferrerInternally(tMoveInstBList, option, "tMoveRecordBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerByDepositId(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mCustomerByDepositId"); }

    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "tLot"); }

    /**
     * Pull out the list of foreign table 'TMoveInstH'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstH> pulloutTMoveInstH(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "tMoveInstH"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MShape'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'TStoreNo'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TStoreNo> pulloutTStoreNo(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "tStoreNo"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomerBySupplierId(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mCustomerBySupplierId"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInoutType(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "bClassDtlByInoutType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMoveInstStatus(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "bClassDtlByMoveInstStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'TMoveInstBSub'.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TMoveInstBSub> pulloutTMoveInstBSubAsOne(List<TMoveInstB> tMoveInstBList)
    { return helpPulloutInternally(tMoveInstBList, "tMoveInstBSubAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key moveInstBId.
     * @param tMoveInstBList The list of tMoveInstB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMoveInstBIdList(List<TMoveInstB> tMoveInstBList)
    { return helpExtractListInternally(tMoveInstBList, "moveInstBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveInstB.setFoo...(value);
     * tMoveInstB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstB.set...;</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">insert</span>(tMoveInstB);
     * ... = tMoveInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tMoveInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TMoveInstB tMoveInstB) {
        doInsert(tMoveInstB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">update</span>(tMoveInstB);
     * </pre>
     * @param tMoveInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TMoveInstB tMoveInstB) {
        doUpdate(tMoveInstB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tMoveInstB);
     * </pre>
     * @param tMoveInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TMoveInstB tMoveInstB) {
        doUpdateNonstrict(tMoveInstB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TMoveInstB tMoveInstB) {
        doInsertOrUpdate(tMoveInstB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tMoveInstB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TMoveInstB tMoveInstB) {
        doInsertOrUpdateNonstrict(tMoveInstB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">delete</span>(tMoveInstB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tMoveInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TMoveInstB tMoveInstB) {
        doDelete(tMoveInstB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tMoveInstB);
     * </pre>
     * @param tMoveInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TMoveInstB tMoveInstB) {
        doDeleteNonstrict(tMoveInstB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tMoveInstB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tMoveInstB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TMoveInstB tMoveInstB) {
        doDeleteNonstrictIgnoreDeleted(tMoveInstB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TMoveInstB et, final DeleteOption<TMoveInstBCB> op) {
        assertObjectNotNull("tMoveInstB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     *     tMoveInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tMoveInstBList.add(tMoveInstB);
     * }
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tMoveInstBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TMoveInstB> tMoveInstBList) {
        return doBatchInsert(tMoveInstBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     *     tMoveInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveInstBList.add(tMoveInstB);
     * }
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstBList);
     * </pre>
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveInstB> tMoveInstBList) {
        return doBatchUpdate(tMoveInstBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tMoveInstBBhv.<span style="color: #CC4747">batchUpdate</span>(tMoveInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TMoveInstB> tMoveInstBList, SpecifyQuery<TMoveInstBCB> colCBLambda) {
        return doBatchUpdate(tMoveInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     *     tMoveInstB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tMoveInstB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tMoveInstB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tMoveInstB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tMoveInstBList.add(tMoveInstB);
     * }
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tMoveInstBList);
     * </pre>
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveInstB> tMoveInstBList) {
        return doBatchUpdateNonstrict(tMoveInstBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tMoveInstBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TMoveInstB> tMoveInstBList, SpecifyQuery<TMoveInstBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tMoveInstBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TMoveInstB> tMoveInstBList) {
        return doBatchDelete(tMoveInstBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TMoveInstB> tMoveInstBList) {
        return doBatchDeleteNonstrict(tMoveInstBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TMoveInstB, TMoveInstBCB&gt;() {
     *     public ConditionBean setup(TMoveInstB entity, TMoveInstBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TMoveInstB, TMoveInstBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setPK...(value);</span>
     * tMoveInstB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tMoveInstB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tMoveInstB, cb);
     * </pre>
     * @param tMoveInstB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TMoveInstB tMoveInstB, TMoveInstBCB cb) {
        return doQueryUpdate(tMoveInstB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TMoveInstBCB cb = new TMoveInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tMoveInstB, cb);
     * </pre>
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TMoveInstBCB cb) {
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
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tMoveInstB.setFoo...(value);
     * tMoveInstB.setBar...(value);
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tMoveInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tMoveInstB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tMoveInstB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, InsertOption<TMoveInstBCB>> opLambda) {
        doInsert(tMoveInstB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tMoveInstB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tMoveInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> opLambda) {
        doUpdate(tMoveInstB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * tMoveInstB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tMoveInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tMoveInstB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> opLambda) {
        doUpdateNonstrict(tMoveInstB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tMoveInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, InsertOption<TMoveInstBCB>> insertOpLambda, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> updateOpLambda) {
        doInsertOrUpdate(tMoveInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tMoveInstB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, InsertOption<TMoveInstBCB>> insertOpLambda, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tMoveInstB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tMoveInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, DeleteOption<TMoveInstBCB>> opLambda) {
        doDelete(tMoveInstB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tMoveInstB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TMoveInstB tMoveInstB, WritableOptionCall<TMoveInstBCB, DeleteOption<TMoveInstBCB>> opLambda) {
        doDeleteNonstrict(tMoveInstB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TMoveInstB> tMoveInstBList, WritableOptionCall<TMoveInstBCB, InsertOption<TMoveInstBCB>> opLambda) {
        return doBatchInsert(tMoveInstBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TMoveInstB> tMoveInstBList, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> opLambda) {
        return doBatchUpdate(tMoveInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TMoveInstB> tMoveInstBList, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> opLambda) {
        return doBatchUpdateNonstrict(tMoveInstBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TMoveInstB> tMoveInstBList, WritableOptionCall<TMoveInstBCB, DeleteOption<TMoveInstBCB>> opLambda) {
        return doBatchDelete(tMoveInstBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tMoveInstBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TMoveInstB> tMoveInstBList, WritableOptionCall<TMoveInstBCB, DeleteOption<TMoveInstBCB>> opLambda) {
        return doBatchDeleteNonstrict(tMoveInstBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TMoveInstB, TMoveInstBCB> manyArgLambda, WritableOptionCall<TMoveInstBCB, InsertOption<TMoveInstBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TMoveInstB tMoveInstB = <span style="color: #70226C">new</span> TMoveInstB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setPK...(value);</span>
     * tMoveInstB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tMoveInstB.setVersionNo(value);</span>
     * TMoveInstBCB cb = <span style="color: #70226C">new</span> TMoveInstBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tMoveInstB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tMoveInstB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TMoveInstB tMoveInstB, TMoveInstBCB cb, WritableOptionCall<TMoveInstBCB, UpdateOption<TMoveInstBCB>> opLambda) {
        return doQueryUpdate(tMoveInstB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TMoveInstB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TMoveInstBCB cb, WritableOptionCall<TMoveInstBCB, DeleteOption<TMoveInstBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tMoveInstBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tMoveInstBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveInstBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tMoveInstBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tMoveInstBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tMoveInstBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tMoveInstBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tMoveInstBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tMoveInstBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tMoveInstBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tMoveInstBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tMoveInstBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tMoveInstBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tMoveInstBBhv.outideSql().removeBlockComment().selectList()
     * tMoveInstBBhv.outideSql().removeLineComment().selectList()
     * tMoveInstBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TMoveInstBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TMoveInstBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TMoveInstB> typeOfSelectedEntity() { return TMoveInstB.class; }
    protected Class<TMoveInstB> typeOfHandlingEntity() { return TMoveInstB.class; }
    protected Class<TMoveInstBCB> typeOfHandlingConditionBean() { return TMoveInstBCB.class; }
}
