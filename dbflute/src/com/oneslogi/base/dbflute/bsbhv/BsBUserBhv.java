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
 * The behavior of B_USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_CD, USER_NM, CULTURE_ID, ROLE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ROLE_GRP, B_CULTURE, B_CLASS_DTL(ByDelFlg), B_USER_AUTH(AsOne), M_USER_LOGIN(AsOne)
 *
 * [referrer table]
 *     M_USER_CENTER, M_USER_CLIENT, M_USER_DEPOSIT, T_EC_ORDER_R, T_INVENTORY_R, T_MOVE_INST_R, T_PACKING_R, T_PICKING_R, T_RECEIVE_PLAN_R, T_STORE_NO_R, T_STORE_RECORD_R, W_SGL_ROW_SHIP_INSP_B, T_PACKING_H, B_USER_AUTH, M_USER_LOGIN
 *
 * [foreign property]
 *     bRoleGrp, bCulture, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryRList, tMoveInstRList, tPackingRByTagOutUserIdList, tPackingRByInspectionOutUserIdList, tPackingRByStwOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRByPl2OutUserIdList, tPickingRBySlipOutUserIdList, tPickingRByPackingOutUserIdList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBUserBhv extends AbstractBehaviorWritable<BUser, BUserCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BUserDbm asDBMeta() { return BUserDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_USER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BUserDbm getMyDBMeta() { return BUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BUserCB newConditionBean() { return new BUserCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BUser newMyEntity() { return new BUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BUserCB newMyConditionBean() { return new BUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BUserCB cb) {
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
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().setFoo...(value);
     * BUser bUser = <span style="color: #0000C0">bUserBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bUser != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bUser.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BUser selectEntity(BUserCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BUser facadeSelectEntity(BUserCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BUser> OptionalEntity<ENTITY> doSelectOptionalEntity(BUserCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().set...;
     * BUser bUser = <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BUser selectEntityWithDeletedCheck(BUserCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param userId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BUser selectByPKValue(Long userId) {
        return facadeSelectByPKValue(userId);
    }

    protected BUser facadeSelectByPKValue(Long userId) {
        return doSelectByPK(userId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BUser> ENTITY doSelectByPK(Long userId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(userId), tp);
    }

    protected <ENTITY extends BUser> OptionalEntity<ENTITY> doSelectOptionalByPK(Long userId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(userId, tp), userId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param userId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BUser selectByPKValueWithDeletedCheck(Long userId) {
        return doSelectByPKWithDeletedCheck(userId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BUser> ENTITY doSelectByPKWithDeletedCheck(Long userId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(userId), tp);
    }

    protected BUserCB xprepareCBAsPK(Long userId) {
        assertObjectNotNull("userId", userId);
        return newConditionBean().acceptPK(userId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param userCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BUser> selectByUniqueOf(String userCd) {
        return facadeSelectByUniqueOf(userCd);
    }

    protected OptionalEntity<BUser> facadeSelectByUniqueOf(String userCd) {
        return doSelectByUniqueOf(userCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BUser> OptionalEntity<ENTITY> doSelectByUniqueOf(String userCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(userCd), tp), userCd);
    }

    protected BUserCB xprepareCBAsUniqueOf(String userCd) {
        assertObjectNotNull("userCd", userCd);
        return newConditionBean().acceptUniqueOf(userCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BUser&gt; <span style="color: #553000">bUserList</span> = <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BUser> selectList(BUserCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BUser&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">page</span>) {
     *     ... = bUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BUser> selectPage(BUserCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().set...
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @param entityRowHandler The handler of entity row of BUser. (NotNull)
     */
    public void selectCursor(BUserCB cb, EntityRowHandler<BUser> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BUserCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BUser> bUserList, ReferrerLoaderHandler<LoaderOfBUser> loaderLambda) {
        xassLRArg(bUserList, loaderLambda);
        loaderLambda.handle(new LoaderOfBUser().ready(bUserList, _behaviorSelector));
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
     * @param bUser The entity of BUser. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BUser bUser, ReferrerLoaderHandler<LoaderOfBUser> loaderLambda) {
        xassLRArg(bUser, loaderLambda);
        loaderLambda.handle(new LoaderOfBUser().ready(xnewLRAryLs(bUser), _behaviorSelector));
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by USER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<BUser> bUserList, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadMUserCenterList(bUserList, new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by USER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getMUserCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(BUser bUser, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadMUserCenterList(xnewLRLs(bUser), new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(BUser bUser, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadMUserCenterList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<BUser> bUserList, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<MUserCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMUserCenterList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserCenter> doLoadMUserCenterList(List<BUser> bUserList, LoadReferrerOption<MUserCenterCB, MUserCenter> option) {
        return helpLoadReferrerInternally(bUserList, option, "mUserCenterList");
    }

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * M_USER_CLIENT by USER_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(List<BUser> bUserList, ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadMUserClientList(bUserList, new LoadReferrerOption<MUserClientCB, MUserClient>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * M_USER_CLIENT by USER_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getMUserClientList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(BUser bUser, ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadMUserClientList(xnewLRLs(bUser), new LoadReferrerOption<MUserClientCB, MUserClient>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(BUser bUser, LoadReferrerOption<MUserClientCB, MUserClient> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadMUserClientList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(List<BUser> bUserList, LoadReferrerOption<MUserClientCB, MUserClient> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<MUserClient>)EMPTY_NREF_LGWAY; }
        return doLoadMUserClientList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserClient> doLoadMUserClientList(List<BUser> bUserList, LoadReferrerOption<MUserClientCB, MUserClient> option) {
        return helpLoadReferrerInternally(bUserList, option, "mUserClientList");
    }

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">depositCB</span>.setupSelect...
     *     <span style="color: #553000">depositCB</span>.query().set...
     *     <span style="color: #553000">depositCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserDepositList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(List<BUser> bUserList, ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadMUserDepositList(bUserList, new LoadReferrerOption<MUserDepositCB, MUserDeposit>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">depositCB</span>.setupSelect...
     *     <span style="color: #553000">depositCB</span>.query().set...
     *     <span style="color: #553000">depositCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getMUserDepositList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(BUser bUser, ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadMUserDepositList(xnewLRLs(bUser), new LoadReferrerOption<MUserDepositCB, MUserDeposit>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(BUser bUser, LoadReferrerOption<MUserDepositCB, MUserDeposit> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadMUserDepositList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserDeposit> loadMUserDepositList(List<BUser> bUserList, LoadReferrerOption<MUserDepositCB, MUserDeposit> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<MUserDeposit>)EMPTY_NREF_LGWAY; }
        return doLoadMUserDepositList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserDeposit> doLoadMUserDepositList(List<BUser> bUserList, LoadReferrerOption<MUserDepositCB, MUserDeposit> option) {
        return helpLoadReferrerInternally(bUserList, option, "mUserDepositList");
    }

    /**
     * Load referrer of TEcOrderRList by the set-upper of referrer. <br>
     * T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTEcOrderRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTEcOrderRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStatementOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StatementOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderR> loadTEcOrderRList(List<BUser> bUserList, ConditionBeanSetupper<TEcOrderRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTEcOrderRList(bUserList, new LoadReferrerOption<TEcOrderRCB, TEcOrderR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderRList by the set-upper of referrer. <br>
     * T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTEcOrderRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTEcOrderRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStatementOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StatementOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderR> loadTEcOrderRList(BUser bUser, ConditionBeanSetupper<TEcOrderRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTEcOrderRList(xnewLRLs(bUser), new LoadReferrerOption<TEcOrderRCB, TEcOrderR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderR> loadTEcOrderRList(BUser bUser, LoadReferrerOption<TEcOrderRCB, TEcOrderR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTEcOrderRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderR> loadTEcOrderRList(List<BUser> bUserList, LoadReferrerOption<TEcOrderRCB, TEcOrderR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderR>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderR> doLoadTEcOrderRList(List<BUser> bUserList, LoadReferrerOption<TEcOrderRCB, TEcOrderR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tEcOrderRList");
    }

    /**
     * Load referrer of TInventoryRList by the set-upper of referrer. <br>
     * T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTInventoryRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryR> loadTInventoryRList(List<BUser> bUserList, ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTInventoryRList(bUserList, new LoadReferrerOption<TInventoryRCB, TInventoryR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryRList by the set-upper of referrer. <br>
     * T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTInventoryRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTInventoryRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryR> loadTInventoryRList(BUser bUser, ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTInventoryRList(xnewLRLs(bUser), new LoadReferrerOption<TInventoryRCB, TInventoryR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryR> loadTInventoryRList(BUser bUser, LoadReferrerOption<TInventoryRCB, TInventoryR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTInventoryRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryR> loadTInventoryRList(List<BUser> bUserList, LoadReferrerOption<TInventoryRCB, TInventoryR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TInventoryR>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryR> doLoadTInventoryRList(List<BUser> bUserList, LoadReferrerOption<TInventoryRCB, TInventoryR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tInventoryRList");
    }

    /**
     * Load referrer of TMoveInstRList by the set-upper of referrer. <br>
     * T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTMoveInstRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTMoveInstRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInstOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InstOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstR> loadTMoveInstRList(List<BUser> bUserList, ConditionBeanSetupper<TMoveInstRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTMoveInstRList(bUserList, new LoadReferrerOption<TMoveInstRCB, TMoveInstR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstRList by the set-upper of referrer. <br>
     * T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTMoveInstRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTMoveInstRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInstOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InstOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstR> loadTMoveInstRList(BUser bUser, ConditionBeanSetupper<TMoveInstRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTMoveInstRList(xnewLRLs(bUser), new LoadReferrerOption<TMoveInstRCB, TMoveInstR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstR> loadTMoveInstRList(BUser bUser, LoadReferrerOption<TMoveInstRCB, TMoveInstR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTMoveInstRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstR> loadTMoveInstRList(List<BUser> bUserList, LoadReferrerOption<TMoveInstRCB, TMoveInstR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstR>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstR> doLoadTMoveInstRList(List<BUser> bUserList, LoadReferrerOption<TMoveInstRCB, TMoveInstR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tMoveInstRList");
    }

    /**
     * Load referrer of TPackingRByTagOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByTagOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByTagOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTagOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TagOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByTagOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPackingRByTagOutUserIdList(bUserList, new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingRByTagOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByTagOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPackingRByTagOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTagOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TagOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByTagOutUserIdList(BUser bUser, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPackingRByTagOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByTagOutUserIdList(BUser bUser, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPackingRByTagOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingR> loadTPackingRByTagOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPackingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingRByTagOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingR> doLoadTPackingRByTagOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPackingRByTagOutUserIdList");
    }

    /**
     * Load referrer of TPackingRByInspectionOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByInspectionOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByInspectionOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInspectionOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InspectionOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByInspectionOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPackingRByInspectionOutUserIdList(bUserList, new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingRByInspectionOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByInspectionOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPackingRByInspectionOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInspectionOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InspectionOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByInspectionOutUserIdList(BUser bUser, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPackingRByInspectionOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByInspectionOutUserIdList(BUser bUser, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPackingRByInspectionOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingR> loadTPackingRByInspectionOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPackingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingRByInspectionOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingR> doLoadTPackingRByInspectionOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPackingRByInspectionOutUserIdList");
    }

    /**
     * Load referrer of TPackingRByStwOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByStwOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByStwOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStwOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StwOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByStwOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPackingRByStwOutUserIdList(bUserList, new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingRByStwOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingRByStwOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPackingRByStwOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStwOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StwOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByStwOutUserIdList(BUser bUser, ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPackingRByStwOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPackingRCB, TPackingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingR> loadTPackingRByStwOutUserIdList(BUser bUser, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPackingRByStwOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingR> loadTPackingRByStwOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPackingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingRByStwOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingR> doLoadTPackingRByStwOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPackingRCB, TPackingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPackingRByStwOutUserIdList");
    }

    /**
     * Load referrer of TPickingRByPl1OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPl1OutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl1OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl1OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl1OutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl1OutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRByPl1OutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRByPl1OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPl1OutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRByPl1OutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl1OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl1OutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl1OutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRByPl1OutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl1OutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRByPl1OutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl1OutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRByPl1OutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRByPl1OutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRByPl1OutUserIdList");
    }

    /**
     * Load referrer of TPickingRByCaseOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByCaseOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByCaseOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCaseOutUserId_InScope(pkList);
     * cb.query().addOrderBy_CaseOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByCaseOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRByCaseOutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRByCaseOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByCaseOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRByCaseOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCaseOutUserId_InScope(pkList);
     * cb.query().addOrderBy_CaseOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByCaseOutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRByCaseOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByCaseOutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRByCaseOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRByCaseOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRByCaseOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRByCaseOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRByCaseOutUserIdList");
    }

    /**
     * Load referrer of TPickingRByShippingRecordOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByShippingRecordOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByShippingRecordOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ShippingRecordOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByShippingRecordOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRByShippingRecordOutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRByShippingRecordOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByShippingRecordOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRByShippingRecordOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ShippingRecordOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByShippingRecordOutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRByShippingRecordOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByShippingRecordOutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRByShippingRecordOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRByShippingRecordOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRByShippingRecordOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRByShippingRecordOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRByShippingRecordOutUserIdList");
    }

    /**
     * Load referrer of TPickingRByPl2OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPl2OutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl2OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl2OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl2OutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl2OutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRByPl2OutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRByPl2OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPl2OutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRByPl2OutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl2OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl2OutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl2OutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRByPl2OutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl2OutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRByPl2OutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPl2OutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRByPl2OutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRByPl2OutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRByPl2OutUserIdList");
    }

    /**
     * Load referrer of TPickingRBySlipOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRBySlipOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRBySlipOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSlipOutUserId_InScope(pkList);
     * cb.query().addOrderBy_SlipOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRBySlipOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRBySlipOutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRBySlipOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRBySlipOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRBySlipOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSlipOutUserId_InScope(pkList);
     * cb.query().addOrderBy_SlipOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRBySlipOutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRBySlipOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRBySlipOutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRBySlipOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRBySlipOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRBySlipOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRBySlipOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRBySlipOutUserIdList");
    }

    /**
     * Load referrer of TPickingRByPackingOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPackingOutUserIdList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPackingOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PackingOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPackingOutUserIdList(List<BUser> bUserList, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPickingRByPackingOutUserIdList(bUserList, new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingRByPackingOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPickingRByPackingOutUserIdList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPickingRByPackingOutUserIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PackingOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPackingOutUserIdList(BUser bUser, ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPickingRByPackingOutUserIdList(xnewLRLs(bUser), new LoadReferrerOption<TPickingRCB, TPickingR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPackingOutUserIdList(BUser bUser, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPickingRByPackingOutUserIdList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingR> loadTPickingRByPackingOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPickingR>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingRByPackingOutUserIdList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingR> doLoadTPickingRByPackingOutUserIdList(List<BUser> bUserList, LoadReferrerOption<TPickingRCB, TPickingR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPickingRByPackingOutUserIdList");
    }

    /**
     * Load referrer of TReceivePlanRList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTReceivePlanRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTReceivePlanRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRplOutUserId_InScope(pkList);
     * cb.query().addOrderBy_RplOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanR> loadTReceivePlanRList(List<BUser> bUserList, ConditionBeanSetupper<TReceivePlanRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTReceivePlanRList(bUserList, new LoadReferrerOption<TReceivePlanRCB, TReceivePlanR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanRList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTReceivePlanRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTReceivePlanRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRplOutUserId_InScope(pkList);
     * cb.query().addOrderBy_RplOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanR> loadTReceivePlanRList(BUser bUser, ConditionBeanSetupper<TReceivePlanRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTReceivePlanRList(xnewLRLs(bUser), new LoadReferrerOption<TReceivePlanRCB, TReceivePlanR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanR> loadTReceivePlanRList(BUser bUser, LoadReferrerOption<TReceivePlanRCB, TReceivePlanR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTReceivePlanRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanR> loadTReceivePlanRList(List<BUser> bUserList, LoadReferrerOption<TReceivePlanRCB, TReceivePlanR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanR>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanR> doLoadTReceivePlanRList(List<BUser> bUserList, LoadReferrerOption<TReceivePlanRCB, TReceivePlanR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tReceivePlanRList");
    }

    /**
     * Load referrer of TStoreNoRList by the set-upper of referrer. <br>
     * T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTStoreNoRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreNoRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNoR> loadTStoreNoRList(List<BUser> bUserList, ConditionBeanSetupper<TStoreNoRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTStoreNoRList(bUserList, new LoadReferrerOption<TStoreNoRCB, TStoreNoR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreNoRList by the set-upper of referrer. <br>
     * T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTStoreNoRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTStoreNoRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNoR> loadTStoreNoRList(BUser bUser, ConditionBeanSetupper<TStoreNoRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTStoreNoRList(xnewLRLs(bUser), new LoadReferrerOption<TStoreNoRCB, TStoreNoR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreNoR> loadTStoreNoRList(BUser bUser, LoadReferrerOption<TStoreNoRCB, TStoreNoR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTStoreNoRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreNoR> loadTStoreNoRList(List<BUser> bUserList, LoadReferrerOption<TStoreNoRCB, TStoreNoR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TStoreNoR>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreNoRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreNoR> doLoadTStoreNoRList(List<BUser> bUserList, LoadReferrerOption<TStoreNoRCB, TStoreNoR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tStoreNoRList");
    }

    /**
     * Load referrer of TStoreRecordRList by the set-upper of referrer. <br>
     * T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTStoreRecordRList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreRecordRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceiveRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ReceiveRecordOutUserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordR> loadTStoreRecordRList(List<BUser> bUserList, ConditionBeanSetupper<TStoreRecordRCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTStoreRecordRList(bUserList, new LoadReferrerOption<TStoreRecordRCB, TStoreRecordR>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordRList by the set-upper of referrer. <br>
     * T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTStoreRecordRList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rCB</span>.setupSelect...
     *     <span style="color: #553000">rCB</span>.query().set...
     *     <span style="color: #553000">rCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTStoreRecordRList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceiveRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ReceiveRecordOutUserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordR> loadTStoreRecordRList(BUser bUser, ConditionBeanSetupper<TStoreRecordRCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTStoreRecordRList(xnewLRLs(bUser), new LoadReferrerOption<TStoreRecordRCB, TStoreRecordR>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordR> loadTStoreRecordRList(BUser bUser, LoadReferrerOption<TStoreRecordRCB, TStoreRecordR> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTStoreRecordRList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordR> loadTStoreRecordRList(List<BUser> bUserList, LoadReferrerOption<TStoreRecordRCB, TStoreRecordR> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordR>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordRList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordR> doLoadTStoreRecordRList(List<BUser> bUserList, LoadReferrerOption<TStoreRecordRCB, TStoreRecordR> option) {
        return helpLoadReferrerInternally(bUserList, option, "tStoreRecordRList");
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<BUser> bUserList, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadWSglRowShipInspBList(bUserList, new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(BUser bUser, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadWSglRowShipInspBList(xnewLRLs(bUser), new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(BUser bUser, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadWSglRowShipInspBList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<BUser> bUserList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspB>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspBList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspB> doLoadWSglRowShipInspBList(List<BUser> bUserList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> option) {
        return helpLoadReferrerInternally(bUserList, option, "wSglRowShipInspBList");
    }

    /**
     * Load referrer of TPackingHByUpdUserList by the set-upper of referrer. <br>
     * T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingHByUpdUserList</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingHByUpdUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUpdUser_InScope(pkList);
     * cb.query().addOrderBy_UpdUser_Asc();
     * </pre>
     * @param bUserList The entity list of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHByUpdUserList(List<BUser> bUserList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(bUserList, refCBLambda);
        return doLoadTPackingHByUpdUserList(bUserList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHByUpdUserList by the set-upper of referrer. <br>
     * T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">loadTPackingHByUpdUserList</span>(<span style="color: #553000">bUser</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bUser</span>.<span style="color: #CC4747">getTPackingHByUpdUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUpdUser_InScope(pkList);
     * cb.query().addOrderBy_UpdUser_Asc();
     * </pre>
     * @param bUser The entity of BUser. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHByUpdUserList(BUser bUser, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(bUser, refCBLambda);
        return doLoadTPackingHByUpdUserList(xnewLRLs(bUser), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bUser The entity of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHByUpdUserList(BUser bUser, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(bUser, loadReferrerOption);
        return loadTPackingHByUpdUserList(xnewLRLs(bUser), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bUserList The entity list of BUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHByUpdUserList(List<BUser> bUserList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(bUserList, loadReferrerOption);
        if (bUserList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHByUpdUserList(bUserList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHByUpdUserList(List<BUser> bUserList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(bUserList, option, "tPackingHByUpdUserList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BRoleGrp'.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BRoleGrp> pulloutBRoleGrp(List<BUser> bUserList)
    { return helpPulloutInternally(bUserList, "bRoleGrp"); }

    /**
     * Pull out the list of foreign table 'BCulture'.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BCulture> pulloutBCulture(List<BUser> bUserList)
    { return helpPulloutInternally(bUserList, "bCulture"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<BUser> bUserList)
    { return helpPulloutInternally(bUserList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'BUserAuth'.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUserAuth> pulloutBUserAuthAsOne(List<BUser> bUserList)
    { return helpPulloutInternally(bUserList, "bUserAuthAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'MUserLogin'.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MUserLogin> pulloutMUserLoginAsOne(List<BUser> bUserList)
    { return helpPulloutInternally(bUserList, "mUserLoginAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key userId.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUserIdList(List<BUser> bUserList)
    { return helpExtractListInternally(bUserList, "userId"); }

    /**
     * Extract the value list of (single) unique key userCd.
     * @param bUserList The list of bUser. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUserCdList(List<BUser> bUserList)
    { return helpExtractListInternally(bUserList, "userCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bUser.setFoo...(value);
     * bUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bUser.set...;</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">insert</span>(bUser);
     * ... = bUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bUser The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BUser bUser) {
        doInsert(bUser, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bUser.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">update</span>(bUser);
     * </pre>
     * @param bUser The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BUser bUser) {
        doUpdate(bUser, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bUser);
     * </pre>
     * @param bUser The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BUser bUser) {
        doUpdateNonstrict(bUser, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bUser The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BUser bUser) {
        doInsertOrUpdate(bUser, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bUser The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BUser bUser) {
        doInsertOrUpdateNonstrict(bUser, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bUser.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">delete</span>(bUser);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bUser The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BUser bUser) {
        doDelete(bUser, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bUser);
     * </pre>
     * @param bUser The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BUser bUser) {
        doDeleteNonstrict(bUser, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bUser);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bUser The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BUser bUser) {
        doDeleteNonstrictIgnoreDeleted(bUser, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BUser et, final DeleteOption<BUserCB> op) {
        assertObjectNotNull("bUser", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BUser bUser = <span style="color: #70226C">new</span> BUser();
     *     bUser.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bUser.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bUserList.add(bUser);
     * }
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchInsert</span>(bUserList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BUser> bUserList) {
        return doBatchInsert(bUserList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BUser bUser = <span style="color: #70226C">new</span> BUser();
     *     bUser.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bUser.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bUserList.add(bUser);
     * }
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bUserList);
     * </pre>
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BUser> bUserList) {
        return doBatchUpdate(bUserList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bUserBhv.<span style="color: #CC4747">batchUpdate</span>(bUserList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bUserList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BUser> bUserList, SpecifyQuery<BUserCB> colCBLambda) {
        return doBatchUpdate(bUserList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BUser bUser = <span style="color: #70226C">new</span> BUser();
     *     bUser.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bUser.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bUserList.add(bUser);
     * }
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bUserList);
     * </pre>
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BUser> bUserList) {
        return doBatchUpdateNonstrict(bUserList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bUserList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bUserList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BUser> bUserList, SpecifyQuery<BUserCB> colCBLambda) {
        return doBatchUpdateNonstrict(bUserList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BUser> bUserList) {
        return doBatchDelete(bUserList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BUser> bUserList) {
        return doBatchDeleteNonstrict(bUserList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BUser, BUserCB&gt;() {
     *     public ConditionBean setup(BUser entity, BUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BUser, BUserCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bUser.setPK...(value);</span>
     * bUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bUser, cb);
     * </pre>
     * @param bUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BUser bUser, BUserCB cb) {
        return doQueryUpdate(bUser, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BUserCB cb = new BUserCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">queryDelete</span>(bUser, cb);
     * </pre>
     * @param cb The condition-bean of BUser. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BUserCB cb) {
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
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bUser.setFoo...(value);
     * bUser.setBar...(value);
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bUser, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bUser The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BUser bUser, WritableOptionCall<BUserCB, InsertOption<BUserCB>> opLambda) {
        doInsert(bUser, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bUser.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bUser, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bUser The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BUser bUser, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> opLambda) {
        doUpdate(bUser, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * bUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bUser, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bUser The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BUser bUser, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> opLambda) {
        doUpdateNonstrict(bUser, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bUser The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BUser bUser, WritableOptionCall<BUserCB, InsertOption<BUserCB>> insertOpLambda, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> updateOpLambda) {
        doInsertOrUpdate(bUser, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bUser The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BUser bUser, WritableOptionCall<BUserCB, InsertOption<BUserCB>> insertOpLambda, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bUser, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bUser The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BUser bUser, WritableOptionCall<BUserCB, DeleteOption<BUserCB>> opLambda) {
        doDelete(bUser, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bUser The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BUser bUser, WritableOptionCall<BUserCB, DeleteOption<BUserCB>> opLambda) {
        doDeleteNonstrict(bUser, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BUser> bUserList, WritableOptionCall<BUserCB, InsertOption<BUserCB>> opLambda) {
        return doBatchInsert(bUserList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BUser> bUserList, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> opLambda) {
        return doBatchUpdate(bUserList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BUser> bUserList, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> opLambda) {
        return doBatchUpdateNonstrict(bUserList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BUser> bUserList, WritableOptionCall<BUserCB, DeleteOption<BUserCB>> opLambda) {
        return doBatchDelete(bUserList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BUser> bUserList, WritableOptionCall<BUserCB, DeleteOption<BUserCB>> opLambda) {
        return doBatchDeleteNonstrict(bUserList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BUser, BUserCB> manyArgLambda, WritableOptionCall<BUserCB, InsertOption<BUserCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BUser bUser = <span style="color: #70226C">new</span> BUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bUser.setPK...(value);</span>
     * bUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bUser.setVersionNo(value);</span>
     * BUserCB cb = <span style="color: #70226C">new</span> BUserCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bUser, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BUser. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BUser bUser, BUserCB cb, WritableOptionCall<BUserCB, UpdateOption<BUserCB>> opLambda) {
        return doQueryUpdate(bUser, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BUser. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BUserCB cb, WritableOptionCall<BUserCB, DeleteOption<BUserCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bUserBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bUserBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bUserBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bUserBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bUserBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bUserBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bUserBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bUserBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bUserBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bUserBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bUserBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bUserBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bUserBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bUserBhv.outideSql().removeBlockComment().selectList()
     * bUserBhv.outideSql().removeLineComment().selectList()
     * bUserBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BUserBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BUserBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BUser> typeOfSelectedEntity() { return BUser.class; }
    protected Class<BUser> typeOfHandlingEntity() { return BUser.class; }
    protected Class<BUserCB> typeOfHandlingConditionBean() { return BUserCB.class; }
}
