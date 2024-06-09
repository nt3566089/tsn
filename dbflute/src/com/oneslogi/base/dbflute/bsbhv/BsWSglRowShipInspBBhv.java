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
 * The behavior of W_SGL_ROW_SHIP_INSP_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_B_ID, SGL_ROW_SHIP_INSP_H_ID, PICKING_H_ID, USER_ID, INSPECTED_NUM, INSPECTION_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PICKING_H, W_SGL_ROW_SHIP_INSP_H, B_USER, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPickingH, wSglRowShipInspH, bUser, bClassDtlByInspectionFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWSglRowShipInspBBhv extends AbstractBehaviorWritable<WSglRowShipInspB, WSglRowShipInspBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WSglRowShipInspBDbm asDBMeta() { return WSglRowShipInspBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_SGL_ROW_SHIP_INSP_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WSglRowShipInspBDbm getMyDBMeta() { return WSglRowShipInspBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WSglRowShipInspBCB newConditionBean() { return new WSglRowShipInspBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WSglRowShipInspB newMyEntity() { return new WSglRowShipInspB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WSglRowShipInspBCB newMyConditionBean() { return new WSglRowShipInspBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WSglRowShipInspBCB cb) {
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
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wSglRowShipInspB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wSglRowShipInspB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspB selectEntity(WSglRowShipInspBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WSglRowShipInspB facadeSelectEntity(WSglRowShipInspBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspB> OptionalEntity<ENTITY> doSelectOptionalEntity(WSglRowShipInspBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().set...;
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wSglRowShipInspB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspB selectEntityWithDeletedCheck(WSglRowShipInspBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sglRowShipInspBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspB selectByPKValue(Long sglRowShipInspBId) {
        return facadeSelectByPKValue(sglRowShipInspBId);
    }

    protected WSglRowShipInspB facadeSelectByPKValue(Long sglRowShipInspBId) {
        return doSelectByPK(sglRowShipInspBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspB> ENTITY doSelectByPK(Long sglRowShipInspBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sglRowShipInspBId), tp);
    }

    protected <ENTITY extends WSglRowShipInspB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long sglRowShipInspBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sglRowShipInspBId, tp), sglRowShipInspBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sglRowShipInspBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspB selectByPKValueWithDeletedCheck(Long sglRowShipInspBId) {
        return doSelectByPKWithDeletedCheck(sglRowShipInspBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspB> ENTITY doSelectByPKWithDeletedCheck(Long sglRowShipInspBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(sglRowShipInspBId), tp);
    }

    protected WSglRowShipInspBCB xprepareCBAsPK(Long sglRowShipInspBId) {
        assertObjectNotNull("sglRowShipInspBId", sglRowShipInspBId);
        return newConditionBean().acceptPK(sglRowShipInspBId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param sglRowShipInspHId : UQ+, IX, NotNull, bigint(19), FK to W_SGL_ROW_SHIP_INSP_H. (NotNull)
     * @param pickingHId : +UQ, IX, NotNull, bigint(19), FK to T_PICKING_H. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WSglRowShipInspB> selectByUniqueOf(Long sglRowShipInspHId, Long pickingHId) {
        return facadeSelectByUniqueOf(sglRowShipInspHId, pickingHId);
    }

    protected OptionalEntity<WSglRowShipInspB> facadeSelectByUniqueOf(Long sglRowShipInspHId, Long pickingHId) {
        return doSelectByUniqueOf(sglRowShipInspHId, pickingHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspB> OptionalEntity<ENTITY> doSelectByUniqueOf(Long sglRowShipInspHId, Long pickingHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(sglRowShipInspHId, pickingHId), tp), sglRowShipInspHId, pickingHId);
    }

    protected WSglRowShipInspBCB xprepareCBAsUniqueOf(Long sglRowShipInspHId, Long pickingHId) {
        assertObjectNotNull("sglRowShipInspHId", sglRowShipInspHId);assertObjectNotNull("pickingHId", pickingHId);
        return newConditionBean().acceptUniqueOf(sglRowShipInspHId, pickingHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WSglRowShipInspB&gt; <span style="color: #553000">wSglRowShipInspBList</span> = <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WSglRowShipInspB wSglRowShipInspB : <span style="color: #553000">wSglRowShipInspBList</span>) {
     *     ... = wSglRowShipInspB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WSglRowShipInspB> selectList(WSglRowShipInspBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WSglRowShipInspB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WSglRowShipInspB wSglRowShipInspB : <span style="color: #553000">page</span>) {
     *     ... = wSglRowShipInspB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WSglRowShipInspB> selectPage(WSglRowShipInspBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().set...
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @param entityRowHandler The handler of entity row of WSglRowShipInspB. (NotNull)
     */
    public void selectCursor(WSglRowShipInspBCB cb, EntityRowHandler<WSglRowShipInspB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WSglRowShipInspBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WSglRowShipInspBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wSglRowShipInspBList The entity list of WSglRowShipInspB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WSglRowShipInspB> wSglRowShipInspBList, ReferrerLoaderHandler<LoaderOfWSglRowShipInspB> loaderLambda) {
        xassLRArg(wSglRowShipInspBList, loaderLambda);
        loaderLambda.handle(new LoaderOfWSglRowShipInspB().ready(wSglRowShipInspBList, _behaviorSelector));
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
     * @param wSglRowShipInspB The entity of WSglRowShipInspB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WSglRowShipInspB wSglRowShipInspB, ReferrerLoaderHandler<LoaderOfWSglRowShipInspB> loaderLambda) {
        xassLRArg(wSglRowShipInspB, loaderLambda);
        loaderLambda.handle(new LoaderOfWSglRowShipInspB().ready(xnewLRAryLs(wSglRowShipInspB), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TPickingH'.
     * @param wSglRowShipInspBList The list of wSglRowShipInspB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPickingH> pulloutTPickingH(List<WSglRowShipInspB> wSglRowShipInspBList)
    { return helpPulloutInternally(wSglRowShipInspBList, "tPickingH"); }

    /**
     * Pull out the list of foreign table 'WSglRowShipInspH'.
     * @param wSglRowShipInspBList The list of wSglRowShipInspB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WSglRowShipInspH> pulloutWSglRowShipInspH(List<WSglRowShipInspB> wSglRowShipInspBList)
    { return helpPulloutInternally(wSglRowShipInspBList, "wSglRowShipInspH"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param wSglRowShipInspBList The list of wSglRowShipInspB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUser(List<WSglRowShipInspB> wSglRowShipInspBList)
    { return helpPulloutInternally(wSglRowShipInspBList, "bUser"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param wSglRowShipInspBList The list of wSglRowShipInspB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInspectionFlg(List<WSglRowShipInspB> wSglRowShipInspBList)
    { return helpPulloutInternally(wSglRowShipInspBList, "bClassDtlByInspectionFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sglRowShipInspBId.
     * @param wSglRowShipInspBList The list of wSglRowShipInspB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSglRowShipInspBIdList(List<WSglRowShipInspB> wSglRowShipInspBList)
    { return helpExtractListInternally(wSglRowShipInspBList, "sglRowShipInspBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wSglRowShipInspB.setFoo...(value);
     * wSglRowShipInspB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.set...;</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">insert</span>(wSglRowShipInspB);
     * ... = wSglRowShipInspB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wSglRowShipInspB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WSglRowShipInspB wSglRowShipInspB) {
        doInsert(wSglRowShipInspB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">update</span>(wSglRowShipInspB);
     * </pre>
     * @param wSglRowShipInspB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WSglRowShipInspB wSglRowShipInspB) {
        doUpdate(wSglRowShipInspB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wSglRowShipInspB);
     * </pre>
     * @param wSglRowShipInspB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WSglRowShipInspB wSglRowShipInspB) {
        doUpdateNonstrict(wSglRowShipInspB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wSglRowShipInspB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WSglRowShipInspB wSglRowShipInspB) {
        doInsertOrUpdate(wSglRowShipInspB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wSglRowShipInspB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WSglRowShipInspB wSglRowShipInspB) {
        doInsertOrUpdateNonstrict(wSglRowShipInspB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">delete</span>(wSglRowShipInspB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wSglRowShipInspB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WSglRowShipInspB wSglRowShipInspB) {
        doDelete(wSglRowShipInspB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wSglRowShipInspB);
     * </pre>
     * @param wSglRowShipInspB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WSglRowShipInspB wSglRowShipInspB) {
        doDeleteNonstrict(wSglRowShipInspB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wSglRowShipInspB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wSglRowShipInspB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WSglRowShipInspB wSglRowShipInspB) {
        doDeleteNonstrictIgnoreDeleted(wSglRowShipInspB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WSglRowShipInspB et, final DeleteOption<WSglRowShipInspBCB> op) {
        assertObjectNotNull("wSglRowShipInspB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     *     wSglRowShipInspB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wSglRowShipInspBList.add(wSglRowShipInspB);
     * }
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchInsert</span>(wSglRowShipInspBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WSglRowShipInspB> wSglRowShipInspBList) {
        return doBatchInsert(wSglRowShipInspBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     *     wSglRowShipInspB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wSglRowShipInspB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wSglRowShipInspB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wSglRowShipInspBList.add(wSglRowShipInspB);
     * }
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspBList);
     * </pre>
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WSglRowShipInspB> wSglRowShipInspBList) {
        return doBatchUpdate(wSglRowShipInspBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wSglRowShipInspBBhv.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WSglRowShipInspB> wSglRowShipInspBList, SpecifyQuery<WSglRowShipInspBCB> colCBLambda) {
        return doBatchUpdate(wSglRowShipInspBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     *     wSglRowShipInspB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wSglRowShipInspB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wSglRowShipInspB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wSglRowShipInspBList.add(wSglRowShipInspB);
     * }
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspBList);
     * </pre>
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WSglRowShipInspB> wSglRowShipInspBList) {
        return doBatchUpdateNonstrict(wSglRowShipInspBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wSglRowShipInspBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wSglRowShipInspBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WSglRowShipInspB> wSglRowShipInspBList, SpecifyQuery<WSglRowShipInspBCB> colCBLambda) {
        return doBatchUpdateNonstrict(wSglRowShipInspBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WSglRowShipInspB> wSglRowShipInspBList) {
        return doBatchDelete(wSglRowShipInspBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WSglRowShipInspB> wSglRowShipInspBList) {
        return doBatchDeleteNonstrict(wSglRowShipInspBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WSglRowShipInspB, WSglRowShipInspBCB&gt;() {
     *     public ConditionBean setup(WSglRowShipInspB entity, WSglRowShipInspBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WSglRowShipInspB, WSglRowShipInspBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setPK...(value);</span>
     * wSglRowShipInspB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wSglRowShipInspB, cb);
     * </pre>
     * @param wSglRowShipInspB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WSglRowShipInspB wSglRowShipInspB, WSglRowShipInspBCB cb) {
        return doQueryUpdate(wSglRowShipInspB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WSglRowShipInspBCB cb = new WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">queryDelete</span>(wSglRowShipInspB, cb);
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WSglRowShipInspBCB cb) {
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
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wSglRowShipInspB.setFoo...(value);
     * wSglRowShipInspB.setBar...(value);
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wSglRowShipInspB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wSglRowShipInspB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wSglRowShipInspB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, InsertOption<WSglRowShipInspBCB>> opLambda) {
        doInsert(wSglRowShipInspB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wSglRowShipInspB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> opLambda) {
        doUpdate(wSglRowShipInspB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * wSglRowShipInspB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wSglRowShipInspB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> opLambda) {
        doUpdateNonstrict(wSglRowShipInspB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wSglRowShipInspB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, InsertOption<WSglRowShipInspBCB>> insertOpLambda, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> updateOpLambda) {
        doInsertOrUpdate(wSglRowShipInspB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wSglRowShipInspB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, InsertOption<WSglRowShipInspBCB>> insertOpLambda, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wSglRowShipInspB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wSglRowShipInspB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, DeleteOption<WSglRowShipInspBCB>> opLambda) {
        doDelete(wSglRowShipInspB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wSglRowShipInspB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WSglRowShipInspB wSglRowShipInspB, WritableOptionCall<WSglRowShipInspBCB, DeleteOption<WSglRowShipInspBCB>> opLambda) {
        doDeleteNonstrict(wSglRowShipInspB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WSglRowShipInspB> wSglRowShipInspBList, WritableOptionCall<WSglRowShipInspBCB, InsertOption<WSglRowShipInspBCB>> opLambda) {
        return doBatchInsert(wSglRowShipInspBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WSglRowShipInspB> wSglRowShipInspBList, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> opLambda) {
        return doBatchUpdate(wSglRowShipInspBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WSglRowShipInspB> wSglRowShipInspBList, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> opLambda) {
        return doBatchUpdateNonstrict(wSglRowShipInspBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WSglRowShipInspB> wSglRowShipInspBList, WritableOptionCall<WSglRowShipInspBCB, DeleteOption<WSglRowShipInspBCB>> opLambda) {
        return doBatchDelete(wSglRowShipInspBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wSglRowShipInspBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WSglRowShipInspB> wSglRowShipInspBList, WritableOptionCall<WSglRowShipInspBCB, DeleteOption<WSglRowShipInspBCB>> opLambda) {
        return doBatchDeleteNonstrict(wSglRowShipInspBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WSglRowShipInspB, WSglRowShipInspBCB> manyArgLambda, WritableOptionCall<WSglRowShipInspBCB, InsertOption<WSglRowShipInspBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WSglRowShipInspB wSglRowShipInspB = <span style="color: #70226C">new</span> WSglRowShipInspB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setPK...(value);</span>
     * wSglRowShipInspB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspB.setVersionNo(value);</span>
     * WSglRowShipInspBCB cb = <span style="color: #70226C">new</span> WSglRowShipInspBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wSglRowShipInspB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WSglRowShipInspB wSglRowShipInspB, WSglRowShipInspBCB cb, WritableOptionCall<WSglRowShipInspBCB, UpdateOption<WSglRowShipInspBCB>> opLambda) {
        return doQueryUpdate(wSglRowShipInspB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WSglRowShipInspB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WSglRowShipInspBCB cb, WritableOptionCall<WSglRowShipInspBCB, DeleteOption<WSglRowShipInspBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wSglRowShipInspBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wSglRowShipInspBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wSglRowShipInspBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wSglRowShipInspBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wSglRowShipInspBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wSglRowShipInspBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wSglRowShipInspBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wSglRowShipInspBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wSglRowShipInspBBhv.outideSql().removeBlockComment().selectList()
     * wSglRowShipInspBBhv.outideSql().removeLineComment().selectList()
     * wSglRowShipInspBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WSglRowShipInspBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WSglRowShipInspBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WSglRowShipInspB> typeOfSelectedEntity() { return WSglRowShipInspB.class; }
    protected Class<WSglRowShipInspB> typeOfHandlingEntity() { return WSglRowShipInspB.class; }
    protected Class<WSglRowShipInspBCB> typeOfHandlingConditionBean() { return WSglRowShipInspBCB.class; }
}
