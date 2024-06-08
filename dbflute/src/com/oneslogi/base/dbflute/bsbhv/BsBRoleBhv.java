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
 * The behavior of B_ROLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ROLE_ID
 *
 * [column]
 *     ROLE_ID, ROLE_CD, DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT
 *
 * [referrer table]
 *     B_COL_ROLE, B_FUNC_ROLE, B_ITEM_ROLE, B_ROLE_GRP_DTL, B_SCREEN_ROLE
 *
 * [foreign property]
 *     bDict, vDict
 *
 * [referrer property]
 *     bColRoleList, bFuncRoleList, bItemRoleList, bRoleGrpDtlList, bScreenRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBRoleBhv extends AbstractBehaviorWritable<BRole, BRoleCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BRoleDbm asDBMeta() { return BRoleDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_ROLE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BRoleDbm getMyDBMeta() { return BRoleDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BRoleCB newConditionBean() { return new BRoleCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BRole newMyEntity() { return new BRole(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BRoleCB newMyConditionBean() { return new BRoleCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BRoleCB cb) {
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
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().setFoo...(value);
     * BRole bRole = <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bRole != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bRole.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRole selectEntity(BRoleCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BRole facadeSelectEntity(BRoleCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRole> OptionalEntity<ENTITY> doSelectOptionalEntity(BRoleCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().set...;
     * BRole bRole = <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bRole.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRole selectEntityWithDeletedCheck(BRoleCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param roleId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRole selectByPKValue(Long roleId) {
        return facadeSelectByPKValue(roleId);
    }

    protected BRole facadeSelectByPKValue(Long roleId) {
        return doSelectByPK(roleId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRole> ENTITY doSelectByPK(Long roleId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(roleId), tp);
    }

    protected <ENTITY extends BRole> OptionalEntity<ENTITY> doSelectOptionalByPK(Long roleId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(roleId, tp), roleId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param roleId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRole selectByPKValueWithDeletedCheck(Long roleId) {
        return doSelectByPKWithDeletedCheck(roleId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRole> ENTITY doSelectByPKWithDeletedCheck(Long roleId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(roleId), tp);
    }

    protected BRoleCB xprepareCBAsPK(Long roleId) {
        assertObjectNotNull("roleId", roleId);
        return newConditionBean().acceptPK(roleId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param roleCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BRole> selectByUniqueOf(String roleCd) {
        return facadeSelectByUniqueOf(roleCd);
    }

    protected OptionalEntity<BRole> facadeSelectByUniqueOf(String roleCd) {
        return doSelectByUniqueOf(roleCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRole> OptionalEntity<ENTITY> doSelectByUniqueOf(String roleCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(roleCd), tp), roleCd);
    }

    protected BRoleCB xprepareCBAsUniqueOf(String roleCd) {
        assertObjectNotNull("roleCd", roleCd);
        return newConditionBean().acceptUniqueOf(roleCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BRole&gt; <span style="color: #553000">bRoleList</span> = <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BRole> selectList(BRoleCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BRole&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">page</span>) {
     *     ... = bRole.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BRole> selectPage(BRoleCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().set...
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @param entityRowHandler The handler of entity row of BRole. (NotNull)
     */
    public void selectCursor(BRoleCB cb, EntityRowHandler<BRole> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BRoleCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BRoleCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BRole> bRoleList, ReferrerLoaderHandler<LoaderOfBRole> loaderLambda) {
        xassLRArg(bRoleList, loaderLambda);
        loaderLambda.handle(new LoaderOfBRole().ready(bRoleList, _behaviorSelector));
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
     * @param bRole The entity of BRole. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BRole bRole, ReferrerLoaderHandler<LoaderOfBRole> loaderLambda) {
        xassLRArg(bRole, loaderLambda);
        loaderLambda.handle(new LoaderOfBRole().ready(xnewLRAryLs(bRole), _behaviorSelector));
    }

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBColRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(List<BRole> bRoleList, ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        xassLRArg(bRoleList, refCBLambda);
        return doLoadBColRoleList(bRoleList, new LoadReferrerOption<BColRoleCB, BColRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">bRole</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRole</span>.<span style="color: #CC4747">getBColRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRole The entity of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(BRole bRole, ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        xassLRArg(bRole, refCBLambda);
        return doLoadBColRoleList(xnewLRLs(bRole), new LoadReferrerOption<BColRoleCB, BColRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRole The entity of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(BRole bRole, LoadReferrerOption<BColRoleCB, BColRole> loadReferrerOption) {
        xassLRArg(bRole, loadReferrerOption);
        return loadBColRoleList(xnewLRLs(bRole), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BColRole> loadBColRoleList(List<BRole> bRoleList, LoadReferrerOption<BColRoleCB, BColRole> loadReferrerOption) {
        xassLRArg(bRoleList, loadReferrerOption);
        if (bRoleList.isEmpty()) { return (NestedReferrerListGateway<BColRole>)EMPTY_NREF_LGWAY; }
        return doLoadBColRoleList(bRoleList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BColRole> doLoadBColRoleList(List<BRole> bRoleList, LoadReferrerOption<BColRoleCB, BColRole> option) {
        return helpLoadReferrerInternally(bRoleList, option, "bColRoleList");
    }

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(List<BRole> bRoleList, ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        xassLRArg(bRoleList, refCBLambda);
        return doLoadBFuncRoleList(bRoleList, new LoadReferrerOption<BFuncRoleCB, BFuncRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">bRole</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRole</span>.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRole The entity of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(BRole bRole, ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        xassLRArg(bRole, refCBLambda);
        return doLoadBFuncRoleList(xnewLRLs(bRole), new LoadReferrerOption<BFuncRoleCB, BFuncRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRole The entity of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(BRole bRole, LoadReferrerOption<BFuncRoleCB, BFuncRole> loadReferrerOption) {
        xassLRArg(bRole, loadReferrerOption);
        return loadBFuncRoleList(xnewLRLs(bRole), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(List<BRole> bRoleList, LoadReferrerOption<BFuncRoleCB, BFuncRole> loadReferrerOption) {
        xassLRArg(bRoleList, loadReferrerOption);
        if (bRoleList.isEmpty()) { return (NestedReferrerListGateway<BFuncRole>)EMPTY_NREF_LGWAY; }
        return doLoadBFuncRoleList(bRoleList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BFuncRole> doLoadBFuncRoleList(List<BRole> bRoleList, LoadReferrerOption<BFuncRoleCB, BFuncRole> option) {
        return helpLoadReferrerInternally(bRoleList, option, "bFuncRoleList");
    }

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBItemRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(List<BRole> bRoleList, ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        xassLRArg(bRoleList, refCBLambda);
        return doLoadBItemRoleList(bRoleList, new LoadReferrerOption<BItemRoleCB, BItemRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BItemRoleList by the set-upper of referrer. <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBItemRoleList</span>(<span style="color: #553000">bRole</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRole</span>.<span style="color: #CC4747">getBItemRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRole The entity of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(BRole bRole, ConditionBeanSetupper<BItemRoleCB> refCBLambda) {
        xassLRArg(bRole, refCBLambda);
        return doLoadBItemRoleList(xnewLRLs(bRole), new LoadReferrerOption<BItemRoleCB, BItemRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRole The entity of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(BRole bRole, LoadReferrerOption<BItemRoleCB, BItemRole> loadReferrerOption) {
        xassLRArg(bRole, loadReferrerOption);
        return loadBItemRoleList(xnewLRLs(bRole), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BItemRole> loadBItemRoleList(List<BRole> bRoleList, LoadReferrerOption<BItemRoleCB, BItemRole> loadReferrerOption) {
        xassLRArg(bRoleList, loadReferrerOption);
        if (bRoleList.isEmpty()) { return (NestedReferrerListGateway<BItemRole>)EMPTY_NREF_LGWAY; }
        return doLoadBItemRoleList(bRoleList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BItemRole> doLoadBItemRoleList(List<BRole> bRoleList, LoadReferrerOption<BItemRoleCB, BItemRole> option) {
        return helpLoadReferrerInternally(bRoleList, option, "bItemRoleList");
    }

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(List<BRole> bRoleList, ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        xassLRArg(bRoleList, refCBLambda);
        return doLoadBRoleGrpDtlList(bRoleList, new LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">bRole</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRole</span>.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRole The entity of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(BRole bRole, ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        xassLRArg(bRole, refCBLambda);
        return doLoadBRoleGrpDtlList(xnewLRLs(bRole), new LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRole The entity of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(BRole bRole, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> loadReferrerOption) {
        xassLRArg(bRole, loadReferrerOption);
        return loadBRoleGrpDtlList(xnewLRLs(bRole), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(List<BRole> bRoleList, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> loadReferrerOption) {
        xassLRArg(bRoleList, loadReferrerOption);
        if (bRoleList.isEmpty()) { return (NestedReferrerListGateway<BRoleGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadBRoleGrpDtlList(bRoleList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BRoleGrpDtl> doLoadBRoleGrpDtlList(List<BRole> bRoleList, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> option) {
        return helpLoadReferrerInternally(bRoleList, option, "bRoleGrpDtlList");
    }

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">bRoleList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRole bRole : <span style="color: #553000">bRoleList</span>) {
     *     ... = bRole.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(List<BRole> bRoleList, ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        xassLRArg(bRoleList, refCBLambda);
        return doLoadBScreenRoleList(bRoleList, new LoadReferrerOption<BScreenRoleCB, BScreenRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BScreenRoleList by the set-upper of referrer. <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleList'.
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">loadBScreenRoleList</span>(<span style="color: #553000">bRole</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRole</span>.<span style="color: #CC4747">getBScreenRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param bRole The entity of BRole. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(BRole bRole, ConditionBeanSetupper<BScreenRoleCB> refCBLambda) {
        xassLRArg(bRole, refCBLambda);
        return doLoadBScreenRoleList(xnewLRLs(bRole), new LoadReferrerOption<BScreenRoleCB, BScreenRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRole The entity of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(BRole bRole, LoadReferrerOption<BScreenRoleCB, BScreenRole> loadReferrerOption) {
        xassLRArg(bRole, loadReferrerOption);
        return loadBScreenRoleList(xnewLRLs(bRole), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleList The entity list of BRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BScreenRole> loadBScreenRoleList(List<BRole> bRoleList, LoadReferrerOption<BScreenRoleCB, BScreenRole> loadReferrerOption) {
        xassLRArg(bRoleList, loadReferrerOption);
        if (bRoleList.isEmpty()) { return (NestedReferrerListGateway<BScreenRole>)EMPTY_NREF_LGWAY; }
        return doLoadBScreenRoleList(bRoleList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BScreenRole> doLoadBScreenRoleList(List<BRole> bRoleList, LoadReferrerOption<BScreenRoleCB, BScreenRole> option) {
        return helpLoadReferrerInternally(bRoleList, option, "bScreenRoleList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bRoleList The list of bRole. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BRole> bRoleList)
    { return helpPulloutInternally(bRoleList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bRoleList The list of bRole. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BRole> bRoleList)
    { return helpPulloutInternally(bRoleList, "vDict"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key roleId.
     * @param bRoleList The list of bRole. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRoleIdList(List<BRole> bRoleList)
    { return helpExtractListInternally(bRoleList, "roleId"); }

    /**
     * Extract the value list of (single) unique key roleCd.
     * @param bRoleList The list of bRole. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractRoleCdList(List<BRole> bRoleList)
    { return helpExtractListInternally(bRoleList, "roleCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bRole.setFoo...(value);
     * bRole.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRole.set...;</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">insert</span>(bRole);
     * ... = bRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bRole The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BRole bRole) {
        doInsert(bRole, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRole.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRole.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">update</span>(bRole);
     * </pre>
     * @param bRole The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BRole bRole) {
        doUpdate(bRole, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bRole);
     * </pre>
     * @param bRole The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BRole bRole) {
        doUpdateNonstrict(bRole, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bRole The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BRole bRole) {
        doInsertOrUpdate(bRole, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bRole The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BRole bRole) {
        doInsertOrUpdateNonstrict(bRole, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRole.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">delete</span>(bRole);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bRole The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BRole bRole) {
        doDelete(bRole, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bRole);
     * </pre>
     * @param bRole The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BRole bRole) {
        doDeleteNonstrict(bRole, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bRole);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bRole The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BRole bRole) {
        doDeleteNonstrictIgnoreDeleted(bRole, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BRole et, final DeleteOption<BRoleCB> op) {
        assertObjectNotNull("bRole", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BRole bRole = <span style="color: #70226C">new</span> BRole();
     *     bRole.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRole.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bRoleList.add(bRole);
     * }
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchInsert</span>(bRoleList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BRole> bRoleList) {
        return doBatchInsert(bRoleList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BRole bRole = <span style="color: #70226C">new</span> BRole();
     *     bRole.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRole.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bRole.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bRole.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bRoleList.add(bRole);
     * }
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleList);
     * </pre>
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BRole> bRoleList) {
        return doBatchUpdate(bRoleList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bRoleBhv.<span style="color: #CC4747">batchUpdate</span>(bRoleList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BRole> bRoleList, SpecifyQuery<BRoleCB> colCBLambda) {
        return doBatchUpdate(bRoleList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BRole bRole = <span style="color: #70226C">new</span> BRole();
     *     bRole.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRole.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bRole.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bRole.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bRoleList.add(bRole);
     * }
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleList);
     * </pre>
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BRole> bRoleList) {
        return doBatchUpdateNonstrict(bRoleList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bRoleList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bRoleList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BRole> bRoleList, SpecifyQuery<BRoleCB> colCBLambda) {
        return doBatchUpdateNonstrict(bRoleList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BRole> bRoleList) {
        return doBatchDelete(bRoleList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BRole> bRoleList) {
        return doBatchDeleteNonstrict(bRoleList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BRole, BRoleCB&gt;() {
     *     public ConditionBean setup(BRole entity, BRoleCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BRole, BRoleCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bRole.setPK...(value);</span>
     * bRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bRole, cb);
     * </pre>
     * @param bRole The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BRole bRole, BRoleCB cb) {
        return doQueryUpdate(bRole, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BRoleCB cb = new BRoleCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">queryDelete</span>(bRole, cb);
     * </pre>
     * @param cb The condition-bean of BRole. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BRoleCB cb) {
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
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bRole.setFoo...(value);
     * bRole.setBar...(value);
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bRole, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bRole The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BRole bRole, WritableOptionCall<BRoleCB, InsertOption<BRoleCB>> opLambda) {
        doInsert(bRole, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRole.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bRole, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bRole The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BRole bRole, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> opLambda) {
        doUpdate(bRole, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * bRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bRole, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bRole The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BRole bRole, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> opLambda) {
        doUpdateNonstrict(bRole, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bRole The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BRole bRole, WritableOptionCall<BRoleCB, InsertOption<BRoleCB>> insertOpLambda, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> updateOpLambda) {
        doInsertOrUpdate(bRole, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bRole The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BRole bRole, WritableOptionCall<BRoleCB, InsertOption<BRoleCB>> insertOpLambda, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bRole, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bRole The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BRole bRole, WritableOptionCall<BRoleCB, DeleteOption<BRoleCB>> opLambda) {
        doDelete(bRole, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bRole The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BRole bRole, WritableOptionCall<BRoleCB, DeleteOption<BRoleCB>> opLambda) {
        doDeleteNonstrict(bRole, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BRole> bRoleList, WritableOptionCall<BRoleCB, InsertOption<BRoleCB>> opLambda) {
        return doBatchInsert(bRoleList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BRole> bRoleList, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> opLambda) {
        return doBatchUpdate(bRoleList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BRole> bRoleList, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> opLambda) {
        return doBatchUpdateNonstrict(bRoleList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BRole> bRoleList, WritableOptionCall<BRoleCB, DeleteOption<BRoleCB>> opLambda) {
        return doBatchDelete(bRoleList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bRoleList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BRole> bRoleList, WritableOptionCall<BRoleCB, DeleteOption<BRoleCB>> opLambda) {
        return doBatchDeleteNonstrict(bRoleList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BRole, BRoleCB> manyArgLambda, WritableOptionCall<BRoleCB, InsertOption<BRoleCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BRole bRole = <span style="color: #70226C">new</span> BRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bRole.setPK...(value);</span>
     * bRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRole.setVersionNo(value);</span>
     * BRoleCB cb = <span style="color: #70226C">new</span> BRoleCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bRole, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bRole The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BRole. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BRole bRole, BRoleCB cb, WritableOptionCall<BRoleCB, UpdateOption<BRoleCB>> opLambda) {
        return doQueryUpdate(bRole, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BRole. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BRoleCB cb, WritableOptionCall<BRoleCB, DeleteOption<BRoleCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bRoleBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bRoleBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bRoleBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bRoleBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bRoleBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bRoleBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bRoleBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bRoleBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bRoleBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bRoleBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bRoleBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bRoleBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bRoleBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bRoleBhv.outideSql().removeBlockComment().selectList()
     * bRoleBhv.outideSql().removeLineComment().selectList()
     * bRoleBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BRoleBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BRoleBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BRole> typeOfSelectedEntity() { return BRole.class; }
    protected Class<BRole> typeOfHandlingEntity() { return BRole.class; }
    protected Class<BRoleCB> typeOfHandlingConditionBean() { return BRoleCB.class; }
}
