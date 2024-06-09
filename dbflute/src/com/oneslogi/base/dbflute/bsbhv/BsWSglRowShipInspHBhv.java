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
 * The behavior of W_SGL_ROW_SHIP_INSP_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_H_ID, CLIENT_ID, CENTER_ID, PICKING_GROUP_NO, TEMP_NO, PRODUCT_ID, WORK_INST_NUM, SLIP_NUM, INSPECTED_SLIP_NUM, BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_BOX, M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer table]
 *     W_SGL_ROW_SHIP_INSP_B
 *
 * [foreign property]
 *     mBox, mCenter, mClient, mProduct
 *
 * [referrer property]
 *     wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWSglRowShipInspHBhv extends AbstractBehaviorWritable<WSglRowShipInspH, WSglRowShipInspHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WSglRowShipInspHDbm asDBMeta() { return WSglRowShipInspHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "W_SGL_ROW_SHIP_INSP_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WSglRowShipInspHDbm getMyDBMeta() { return WSglRowShipInspHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WSglRowShipInspHCB newConditionBean() { return new WSglRowShipInspHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WSglRowShipInspH newMyEntity() { return new WSglRowShipInspH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WSglRowShipInspHCB newMyConditionBean() { return new WSglRowShipInspHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WSglRowShipInspHCB cb) {
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
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wSglRowShipInspH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wSglRowShipInspH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspH selectEntity(WSglRowShipInspHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WSglRowShipInspH facadeSelectEntity(WSglRowShipInspHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspH> OptionalEntity<ENTITY> doSelectOptionalEntity(WSglRowShipInspHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().set...;
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wSglRowShipInspH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspH selectEntityWithDeletedCheck(WSglRowShipInspHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sglRowShipInspHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspH selectByPKValue(Long sglRowShipInspHId) {
        return facadeSelectByPKValue(sglRowShipInspHId);
    }

    protected WSglRowShipInspH facadeSelectByPKValue(Long sglRowShipInspHId) {
        return doSelectByPK(sglRowShipInspHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspH> ENTITY doSelectByPK(Long sglRowShipInspHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sglRowShipInspHId), tp);
    }

    protected <ENTITY extends WSglRowShipInspH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long sglRowShipInspHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sglRowShipInspHId, tp), sglRowShipInspHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sglRowShipInspHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WSglRowShipInspH selectByPKValueWithDeletedCheck(Long sglRowShipInspHId) {
        return doSelectByPKWithDeletedCheck(sglRowShipInspHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspH> ENTITY doSelectByPKWithDeletedCheck(Long sglRowShipInspHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(sglRowShipInspHId), tp);
    }

    protected WSglRowShipInspHCB xprepareCBAsPK(Long sglRowShipInspHId) {
        assertObjectNotNull("sglRowShipInspHId", sglRowShipInspHId);
        return newConditionBean().acceptPK(sglRowShipInspHId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param centerId : +UQ, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param pickingGroupNo : +UQ, NotNull, varchar(30). (NotNull)
     * @param tempNo : +UQ, NotNull, varchar(30). (NotNull)
     * @param productId : +UQ, IX, NotNull, bigint(19), FK to M_PRODUCT. (NotNull)
     * @param workInstNum : +UQ, NotNull, bigint(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WSglRowShipInspH> selectByUniqueOf(Long clientId, Long centerId, String pickingGroupNo, String tempNo, Long productId, Long workInstNum) {
        return facadeSelectByUniqueOf(clientId, centerId, pickingGroupNo, tempNo, productId, workInstNum);
    }

    protected OptionalEntity<WSglRowShipInspH> facadeSelectByUniqueOf(Long clientId, Long centerId, String pickingGroupNo, String tempNo, Long productId, Long workInstNum) {
        return doSelectByUniqueOf(clientId, centerId, pickingGroupNo, tempNo, productId, workInstNum, typeOfSelectedEntity());
    }

    protected <ENTITY extends WSglRowShipInspH> OptionalEntity<ENTITY> doSelectByUniqueOf(Long clientId, Long centerId, String pickingGroupNo, String tempNo, Long productId, Long workInstNum, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(clientId, centerId, pickingGroupNo, tempNo, productId, workInstNum), tp), clientId, centerId, pickingGroupNo, tempNo, productId, workInstNum);
    }

    protected WSglRowShipInspHCB xprepareCBAsUniqueOf(Long clientId, Long centerId, String pickingGroupNo, String tempNo, Long productId, Long workInstNum) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("centerId", centerId);assertObjectNotNull("pickingGroupNo", pickingGroupNo);assertObjectNotNull("tempNo", tempNo);assertObjectNotNull("productId", productId);assertObjectNotNull("workInstNum", workInstNum);
        return newConditionBean().acceptUniqueOf(clientId, centerId, pickingGroupNo, tempNo, productId, workInstNum);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WSglRowShipInspH&gt; <span style="color: #553000">wSglRowShipInspHList</span> = <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WSglRowShipInspH wSglRowShipInspH : <span style="color: #553000">wSglRowShipInspHList</span>) {
     *     ... = wSglRowShipInspH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WSglRowShipInspH> selectList(WSglRowShipInspHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WSglRowShipInspH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WSglRowShipInspH wSglRowShipInspH : <span style="color: #553000">page</span>) {
     *     ... = wSglRowShipInspH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WSglRowShipInspH> selectPage(WSglRowShipInspHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().set...
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @param entityRowHandler The handler of entity row of WSglRowShipInspH. (NotNull)
     */
    public void selectCursor(WSglRowShipInspHCB cb, EntityRowHandler<WSglRowShipInspH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WSglRowShipInspHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WSglRowShipInspHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wSglRowShipInspHList The entity list of WSglRowShipInspH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WSglRowShipInspH> wSglRowShipInspHList, ReferrerLoaderHandler<LoaderOfWSglRowShipInspH> loaderLambda) {
        xassLRArg(wSglRowShipInspHList, loaderLambda);
        loaderLambda.handle(new LoaderOfWSglRowShipInspH().ready(wSglRowShipInspHList, _behaviorSelector));
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
     * @param wSglRowShipInspH The entity of WSglRowShipInspH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WSglRowShipInspH wSglRowShipInspH, ReferrerLoaderHandler<LoaderOfWSglRowShipInspH> loaderLambda) {
        xassLRArg(wSglRowShipInspH, loaderLambda);
        loaderLambda.handle(new LoaderOfWSglRowShipInspH().ready(xnewLRAryLs(wSglRowShipInspH), _behaviorSelector));
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">wSglRowShipInspHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WSglRowShipInspH wSglRowShipInspH : <span style="color: #553000">wSglRowShipInspHList</span>) {
     *     ... = wSglRowShipInspH.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSglRowShipInspHId_InScope(pkList);
     * cb.query().addOrderBy_SglRowShipInspHId_Asc();
     * </pre>
     * @param wSglRowShipInspHList The entity list of WSglRowShipInspH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<WSglRowShipInspH> wSglRowShipInspHList, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(wSglRowShipInspHList, refCBLambda);
        return doLoadWSglRowShipInspBList(wSglRowShipInspHList, new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">wSglRowShipInspH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">wSglRowShipInspH</span>.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSglRowShipInspHId_InScope(pkList);
     * cb.query().addOrderBy_SglRowShipInspHId_Asc();
     * </pre>
     * @param wSglRowShipInspH The entity of WSglRowShipInspH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(WSglRowShipInspH wSglRowShipInspH, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(wSglRowShipInspH, refCBLambda);
        return doLoadWSglRowShipInspBList(xnewLRLs(wSglRowShipInspH), new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param wSglRowShipInspH The entity of WSglRowShipInspH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(WSglRowShipInspH wSglRowShipInspH, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(wSglRowShipInspH, loadReferrerOption);
        return loadWSglRowShipInspBList(xnewLRLs(wSglRowShipInspH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param wSglRowShipInspHList The entity list of WSglRowShipInspH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<WSglRowShipInspH> wSglRowShipInspHList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(wSglRowShipInspHList, loadReferrerOption);
        if (wSglRowShipInspHList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspB>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspBList(wSglRowShipInspHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspB> doLoadWSglRowShipInspBList(List<WSglRowShipInspH> wSglRowShipInspHList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> option) {
        return helpLoadReferrerInternally(wSglRowShipInspHList, option, "wSglRowShipInspBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MBox'.
     * @param wSglRowShipInspHList The list of wSglRowShipInspH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MBox> pulloutMBox(List<WSglRowShipInspH> wSglRowShipInspHList)
    { return helpPulloutInternally(wSglRowShipInspHList, "mBox"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param wSglRowShipInspHList The list of wSglRowShipInspH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<WSglRowShipInspH> wSglRowShipInspHList)
    { return helpPulloutInternally(wSglRowShipInspHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param wSglRowShipInspHList The list of wSglRowShipInspH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<WSglRowShipInspH> wSglRowShipInspHList)
    { return helpPulloutInternally(wSglRowShipInspHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param wSglRowShipInspHList The list of wSglRowShipInspH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<WSglRowShipInspH> wSglRowShipInspHList)
    { return helpPulloutInternally(wSglRowShipInspHList, "mProduct"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sglRowShipInspHId.
     * @param wSglRowShipInspHList The list of wSglRowShipInspH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSglRowShipInspHIdList(List<WSglRowShipInspH> wSglRowShipInspHList)
    { return helpExtractListInternally(wSglRowShipInspHList, "sglRowShipInspHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wSglRowShipInspH.setFoo...(value);
     * wSglRowShipInspH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.set...;</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">insert</span>(wSglRowShipInspH);
     * ... = wSglRowShipInspH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wSglRowShipInspH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WSglRowShipInspH wSglRowShipInspH) {
        doInsert(wSglRowShipInspH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">update</span>(wSglRowShipInspH);
     * </pre>
     * @param wSglRowShipInspH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WSglRowShipInspH wSglRowShipInspH) {
        doUpdate(wSglRowShipInspH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wSglRowShipInspH);
     * </pre>
     * @param wSglRowShipInspH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WSglRowShipInspH wSglRowShipInspH) {
        doUpdateNonstrict(wSglRowShipInspH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wSglRowShipInspH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WSglRowShipInspH wSglRowShipInspH) {
        doInsertOrUpdate(wSglRowShipInspH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wSglRowShipInspH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WSglRowShipInspH wSglRowShipInspH) {
        doInsertOrUpdateNonstrict(wSglRowShipInspH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">delete</span>(wSglRowShipInspH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wSglRowShipInspH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WSglRowShipInspH wSglRowShipInspH) {
        doDelete(wSglRowShipInspH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wSglRowShipInspH);
     * </pre>
     * @param wSglRowShipInspH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WSglRowShipInspH wSglRowShipInspH) {
        doDeleteNonstrict(wSglRowShipInspH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wSglRowShipInspH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wSglRowShipInspH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WSglRowShipInspH wSglRowShipInspH) {
        doDeleteNonstrictIgnoreDeleted(wSglRowShipInspH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WSglRowShipInspH et, final DeleteOption<WSglRowShipInspHCB> op) {
        assertObjectNotNull("wSglRowShipInspH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     *     wSglRowShipInspH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wSglRowShipInspHList.add(wSglRowShipInspH);
     * }
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchInsert</span>(wSglRowShipInspHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WSglRowShipInspH> wSglRowShipInspHList) {
        return doBatchInsert(wSglRowShipInspHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     *     wSglRowShipInspH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wSglRowShipInspH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wSglRowShipInspH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wSglRowShipInspHList.add(wSglRowShipInspH);
     * }
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspHList);
     * </pre>
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WSglRowShipInspH> wSglRowShipInspHList) {
        return doBatchUpdate(wSglRowShipInspHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wSglRowShipInspHBhv.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WSglRowShipInspH> wSglRowShipInspHList, SpecifyQuery<WSglRowShipInspHCB> colCBLambda) {
        return doBatchUpdate(wSglRowShipInspHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     *     wSglRowShipInspH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wSglRowShipInspH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wSglRowShipInspH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wSglRowShipInspH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wSglRowShipInspHList.add(wSglRowShipInspH);
     * }
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wSglRowShipInspHList);
     * </pre>
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WSglRowShipInspH> wSglRowShipInspHList) {
        return doBatchUpdateNonstrict(wSglRowShipInspHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wSglRowShipInspHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wSglRowShipInspHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WSglRowShipInspH> wSglRowShipInspHList, SpecifyQuery<WSglRowShipInspHCB> colCBLambda) {
        return doBatchUpdateNonstrict(wSglRowShipInspHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WSglRowShipInspH> wSglRowShipInspHList) {
        return doBatchDelete(wSglRowShipInspHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WSglRowShipInspH> wSglRowShipInspHList) {
        return doBatchDeleteNonstrict(wSglRowShipInspHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WSglRowShipInspH, WSglRowShipInspHCB&gt;() {
     *     public ConditionBean setup(WSglRowShipInspH entity, WSglRowShipInspHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WSglRowShipInspH, WSglRowShipInspHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setPK...(value);</span>
     * wSglRowShipInspH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wSglRowShipInspH, cb);
     * </pre>
     * @param wSglRowShipInspH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WSglRowShipInspH wSglRowShipInspH, WSglRowShipInspHCB cb) {
        return doQueryUpdate(wSglRowShipInspH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WSglRowShipInspHCB cb = new WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">queryDelete</span>(wSglRowShipInspH, cb);
     * </pre>
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WSglRowShipInspHCB cb) {
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
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wSglRowShipInspH.setFoo...(value);
     * wSglRowShipInspH.setBar...(value);
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wSglRowShipInspH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wSglRowShipInspH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wSglRowShipInspH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, InsertOption<WSglRowShipInspHCB>> opLambda) {
        doInsert(wSglRowShipInspH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wSglRowShipInspH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wSglRowShipInspH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> opLambda) {
        doUpdate(wSglRowShipInspH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * wSglRowShipInspH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wSglRowShipInspH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wSglRowShipInspH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> opLambda) {
        doUpdateNonstrict(wSglRowShipInspH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wSglRowShipInspH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, InsertOption<WSglRowShipInspHCB>> insertOpLambda, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> updateOpLambda) {
        doInsertOrUpdate(wSglRowShipInspH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wSglRowShipInspH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, InsertOption<WSglRowShipInspHCB>> insertOpLambda, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wSglRowShipInspH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wSglRowShipInspH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, DeleteOption<WSglRowShipInspHCB>> opLambda) {
        doDelete(wSglRowShipInspH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wSglRowShipInspH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WSglRowShipInspH wSglRowShipInspH, WritableOptionCall<WSglRowShipInspHCB, DeleteOption<WSglRowShipInspHCB>> opLambda) {
        doDeleteNonstrict(wSglRowShipInspH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WSglRowShipInspH> wSglRowShipInspHList, WritableOptionCall<WSglRowShipInspHCB, InsertOption<WSglRowShipInspHCB>> opLambda) {
        return doBatchInsert(wSglRowShipInspHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WSglRowShipInspH> wSglRowShipInspHList, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> opLambda) {
        return doBatchUpdate(wSglRowShipInspHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WSglRowShipInspH> wSglRowShipInspHList, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> opLambda) {
        return doBatchUpdateNonstrict(wSglRowShipInspHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WSglRowShipInspH> wSglRowShipInspHList, WritableOptionCall<WSglRowShipInspHCB, DeleteOption<WSglRowShipInspHCB>> opLambda) {
        return doBatchDelete(wSglRowShipInspHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wSglRowShipInspHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WSglRowShipInspH> wSglRowShipInspHList, WritableOptionCall<WSglRowShipInspHCB, DeleteOption<WSglRowShipInspHCB>> opLambda) {
        return doBatchDeleteNonstrict(wSglRowShipInspHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WSglRowShipInspH, WSglRowShipInspHCB> manyArgLambda, WritableOptionCall<WSglRowShipInspHCB, InsertOption<WSglRowShipInspHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WSglRowShipInspH wSglRowShipInspH = <span style="color: #70226C">new</span> WSglRowShipInspH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setPK...(value);</span>
     * wSglRowShipInspH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wSglRowShipInspH.setVersionNo(value);</span>
     * WSglRowShipInspHCB cb = <span style="color: #70226C">new</span> WSglRowShipInspHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wSglRowShipInspHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wSglRowShipInspH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wSglRowShipInspH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WSglRowShipInspH wSglRowShipInspH, WSglRowShipInspHCB cb, WritableOptionCall<WSglRowShipInspHCB, UpdateOption<WSglRowShipInspHCB>> opLambda) {
        return doQueryUpdate(wSglRowShipInspH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WSglRowShipInspH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WSglRowShipInspHCB cb, WritableOptionCall<WSglRowShipInspHCB, DeleteOption<WSglRowShipInspHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wSglRowShipInspHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wSglRowShipInspHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wSglRowShipInspHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wSglRowShipInspHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wSglRowShipInspHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wSglRowShipInspHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wSglRowShipInspHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wSglRowShipInspHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wSglRowShipInspHBhv.outideSql().removeBlockComment().selectList()
     * wSglRowShipInspHBhv.outideSql().removeLineComment().selectList()
     * wSglRowShipInspHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WSglRowShipInspHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WSglRowShipInspHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WSglRowShipInspH> typeOfSelectedEntity() { return WSglRowShipInspH.class; }
    protected Class<WSglRowShipInspH> typeOfHandlingEntity() { return WSglRowShipInspH.class; }
    protected Class<WSglRowShipInspHCB> typeOfHandlingConditionBean() { return WSglRowShipInspHCB.class; }
}
