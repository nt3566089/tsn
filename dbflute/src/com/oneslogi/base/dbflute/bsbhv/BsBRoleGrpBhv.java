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
 * The behavior of B_ROLE_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     ROLE_GRP_ID
 *
 * [column]
 *     ROLE_GRP_ID, ROLE_GRP_CD, DICT_ID, ROLE_CONTROL_CLASS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByRoleControlClass)
 *
 * [referrer table]
 *     B_ROLE_GRP_DTL, B_USER
 *
 * [foreign property]
 *     bDict, vDict, bClassDtlByRoleControlClass
 *
 * [referrer property]
 *     bRoleGrpDtlList, bUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBRoleGrpBhv extends AbstractBehaviorWritable<BRoleGrp, BRoleGrpCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BRoleGrpDbm asDBMeta() { return BRoleGrpDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_ROLE_GRP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BRoleGrpDbm getMyDBMeta() { return BRoleGrpDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BRoleGrpCB newConditionBean() { return new BRoleGrpCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BRoleGrp newMyEntity() { return new BRoleGrp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BRoleGrpCB newMyConditionBean() { return new BRoleGrpCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BRoleGrpCB cb) {
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
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().setFoo...(value);
     * BRoleGrp bRoleGrp = <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bRoleGrp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bRoleGrp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRoleGrp selectEntity(BRoleGrpCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BRoleGrp facadeSelectEntity(BRoleGrpCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRoleGrp> OptionalEntity<ENTITY> doSelectOptionalEntity(BRoleGrpCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().set...;
     * BRoleGrp bRoleGrp = <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bRoleGrp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRoleGrp selectEntityWithDeletedCheck(BRoleGrpCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param roleGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRoleGrp selectByPKValue(Long roleGrpId) {
        return facadeSelectByPKValue(roleGrpId);
    }

    protected BRoleGrp facadeSelectByPKValue(Long roleGrpId) {
        return doSelectByPK(roleGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRoleGrp> ENTITY doSelectByPK(Long roleGrpId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(roleGrpId), tp);
    }

    protected <ENTITY extends BRoleGrp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long roleGrpId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(roleGrpId, tp), roleGrpId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param roleGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BRoleGrp selectByPKValueWithDeletedCheck(Long roleGrpId) {
        return doSelectByPKWithDeletedCheck(roleGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRoleGrp> ENTITY doSelectByPKWithDeletedCheck(Long roleGrpId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(roleGrpId), tp);
    }

    protected BRoleGrpCB xprepareCBAsPK(Long roleGrpId) {
        assertObjectNotNull("roleGrpId", roleGrpId);
        return newConditionBean().acceptPK(roleGrpId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param roleGrpCd : UQ+, NotNull, varchar(30). (NotNull)
     * @param dictId : +UQ, IX, bigint(19), FK to B_DICT. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BRoleGrp> selectByUniqueOf(String roleGrpCd, Long dictId) {
        return facadeSelectByUniqueOf(roleGrpCd, dictId);
    }

    protected OptionalEntity<BRoleGrp> facadeSelectByUniqueOf(String roleGrpCd, Long dictId) {
        return doSelectByUniqueOf(roleGrpCd, dictId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BRoleGrp> OptionalEntity<ENTITY> doSelectByUniqueOf(String roleGrpCd, Long dictId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(roleGrpCd, dictId), tp), roleGrpCd, dictId);
    }

    protected BRoleGrpCB xprepareCBAsUniqueOf(String roleGrpCd, Long dictId) {
        assertObjectNotNull("roleGrpCd", roleGrpCd);assertObjectNotNull("dictId", dictId);
        return newConditionBean().acceptUniqueOf(roleGrpCd, dictId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BRoleGrp&gt; <span style="color: #553000">bRoleGrpList</span> = <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BRoleGrp bRoleGrp : <span style="color: #553000">bRoleGrpList</span>) {
     *     ... = bRoleGrp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BRoleGrp> selectList(BRoleGrpCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BRoleGrp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BRoleGrp bRoleGrp : <span style="color: #553000">page</span>) {
     *     ... = bRoleGrp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BRoleGrp> selectPage(BRoleGrpCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().set...
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @param entityRowHandler The handler of entity row of BRoleGrp. (NotNull)
     */
    public void selectCursor(BRoleGrpCB cb, EntityRowHandler<BRoleGrp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BRoleGrpCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BRoleGrpCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bRoleGrpList The entity list of BRoleGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BRoleGrp> bRoleGrpList, ReferrerLoaderHandler<LoaderOfBRoleGrp> loaderLambda) {
        xassLRArg(bRoleGrpList, loaderLambda);
        loaderLambda.handle(new LoaderOfBRoleGrp().ready(bRoleGrpList, _behaviorSelector));
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
     * @param bRoleGrp The entity of BRoleGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BRoleGrp bRoleGrp, ReferrerLoaderHandler<LoaderOfBRoleGrp> loaderLambda) {
        xassLRArg(bRoleGrp, loaderLambda);
        loaderLambda.handle(new LoaderOfBRoleGrp().ready(xnewLRAryLs(bRoleGrp), _behaviorSelector));
    }

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">bRoleGrpList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRoleGrp bRoleGrp : <span style="color: #553000">bRoleGrpList</span>) {
     *     ... = bRoleGrp.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param bRoleGrpList The entity list of BRoleGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(List<BRoleGrp> bRoleGrpList, ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        xassLRArg(bRoleGrpList, refCBLambda);
        return doLoadBRoleGrpDtlList(bRoleGrpList, new LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">bRoleGrp</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRoleGrp</span>.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param bRoleGrp The entity of BRoleGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(BRoleGrp bRoleGrp, ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        xassLRArg(bRoleGrp, refCBLambda);
        return doLoadBRoleGrpDtlList(xnewLRLs(bRoleGrp), new LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRoleGrp The entity of BRoleGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(BRoleGrp bRoleGrp, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> loadReferrerOption) {
        xassLRArg(bRoleGrp, loadReferrerOption);
        return loadBRoleGrpDtlList(xnewLRLs(bRoleGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleGrpList The entity list of BRoleGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BRoleGrpDtl> loadBRoleGrpDtlList(List<BRoleGrp> bRoleGrpList, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> loadReferrerOption) {
        xassLRArg(bRoleGrpList, loadReferrerOption);
        if (bRoleGrpList.isEmpty()) { return (NestedReferrerListGateway<BRoleGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadBRoleGrpDtlList(bRoleGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BRoleGrpDtl> doLoadBRoleGrpDtlList(List<BRoleGrp> bRoleGrpList, LoadReferrerOption<BRoleGrpDtlCB, BRoleGrpDtl> option) {
        return helpLoadReferrerInternally(bRoleGrpList, option, "bRoleGrpDtlList");
    }

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by ROLE_GRP_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">bRoleGrpList</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BRoleGrp bRoleGrp : <span style="color: #553000">bRoleGrpList</span>) {
     *     ... = bRoleGrp.<span style="color: #CC4747">getBUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param bRoleGrpList The entity list of BRoleGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(List<BRoleGrp> bRoleGrpList, ConditionBeanSetupper<BUserCB> refCBLambda) {
        xassLRArg(bRoleGrpList, refCBLambda);
        return doLoadBUserList(bRoleGrpList, new LoadReferrerOption<BUserCB, BUser>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by ROLE_GRP_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">bRoleGrp</span>, <span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userCB</span>.setupSelect...
     *     <span style="color: #553000">userCB</span>.query().set...
     *     <span style="color: #553000">userCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bRoleGrp</span>.<span style="color: #CC4747">getBUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param bRoleGrp The entity of BRoleGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(BRoleGrp bRoleGrp, ConditionBeanSetupper<BUserCB> refCBLambda) {
        xassLRArg(bRoleGrp, refCBLambda);
        return doLoadBUserList(xnewLRLs(bRoleGrp), new LoadReferrerOption<BUserCB, BUser>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bRoleGrp The entity of BRoleGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BUser> loadBUserList(BRoleGrp bRoleGrp, LoadReferrerOption<BUserCB, BUser> loadReferrerOption) {
        xassLRArg(bRoleGrp, loadReferrerOption);
        return loadBUserList(xnewLRLs(bRoleGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bRoleGrpList The entity list of BRoleGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BUser> loadBUserList(List<BRoleGrp> bRoleGrpList, LoadReferrerOption<BUserCB, BUser> loadReferrerOption) {
        xassLRArg(bRoleGrpList, loadReferrerOption);
        if (bRoleGrpList.isEmpty()) { return (NestedReferrerListGateway<BUser>)EMPTY_NREF_LGWAY; }
        return doLoadBUserList(bRoleGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BUser> doLoadBUserList(List<BRoleGrp> bRoleGrpList, LoadReferrerOption<BUserCB, BUser> option) {
        return helpLoadReferrerInternally(bRoleGrpList, option, "bUserList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bRoleGrpList The list of bRoleGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BRoleGrp> bRoleGrpList)
    { return helpPulloutInternally(bRoleGrpList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bRoleGrpList The list of bRoleGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BRoleGrp> bRoleGrpList)
    { return helpPulloutInternally(bRoleGrpList, "vDict"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bRoleGrpList The list of bRoleGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByRoleControlClass(List<BRoleGrp> bRoleGrpList)
    { return helpPulloutInternally(bRoleGrpList, "bClassDtlByRoleControlClass"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key roleGrpId.
     * @param bRoleGrpList The list of bRoleGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRoleGrpIdList(List<BRoleGrp> bRoleGrpList)
    { return helpExtractListInternally(bRoleGrpList, "roleGrpId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bRoleGrp.setFoo...(value);
     * bRoleGrp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRoleGrp.set...;</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">insert</span>(bRoleGrp);
     * ... = bRoleGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bRoleGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BRoleGrp bRoleGrp) {
        doInsert(bRoleGrp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRoleGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRoleGrp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRoleGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">update</span>(bRoleGrp);
     * </pre>
     * @param bRoleGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BRoleGrp bRoleGrp) {
        doUpdate(bRoleGrp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRoleGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRoleGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bRoleGrp);
     * </pre>
     * @param bRoleGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BRoleGrp bRoleGrp) {
        doUpdateNonstrict(bRoleGrp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bRoleGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BRoleGrp bRoleGrp) {
        doInsertOrUpdate(bRoleGrp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bRoleGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BRoleGrp bRoleGrp) {
        doInsertOrUpdateNonstrict(bRoleGrp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRoleGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">delete</span>(bRoleGrp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bRoleGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BRoleGrp bRoleGrp) {
        doDelete(bRoleGrp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bRoleGrp);
     * </pre>
     * @param bRoleGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BRoleGrp bRoleGrp) {
        doDeleteNonstrict(bRoleGrp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bRoleGrp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bRoleGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BRoleGrp bRoleGrp) {
        doDeleteNonstrictIgnoreDeleted(bRoleGrp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BRoleGrp et, final DeleteOption<BRoleGrpCB> op) {
        assertObjectNotNull("bRoleGrp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     *     bRoleGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRoleGrp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bRoleGrpList.add(bRoleGrp);
     * }
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchInsert</span>(bRoleGrpList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BRoleGrp> bRoleGrpList) {
        return doBatchInsert(bRoleGrpList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     *     bRoleGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRoleGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bRoleGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bRoleGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bRoleGrpList.add(bRoleGrp);
     * }
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleGrpList);
     * </pre>
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BRoleGrp> bRoleGrpList) {
        return doBatchUpdate(bRoleGrpList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bRoleGrpBhv.<span style="color: #CC4747">batchUpdate</span>(bRoleGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BRoleGrp> bRoleGrpList, SpecifyQuery<BRoleGrpCB> colCBLambda) {
        return doBatchUpdate(bRoleGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     *     bRoleGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bRoleGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bRoleGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bRoleGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bRoleGrpList.add(bRoleGrp);
     * }
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bRoleGrpList);
     * </pre>
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BRoleGrp> bRoleGrpList) {
        return doBatchUpdateNonstrict(bRoleGrpList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bRoleGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bRoleGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BRoleGrp> bRoleGrpList, SpecifyQuery<BRoleGrpCB> colCBLambda) {
        return doBatchUpdateNonstrict(bRoleGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BRoleGrp> bRoleGrpList) {
        return doBatchDelete(bRoleGrpList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BRoleGrp> bRoleGrpList) {
        return doBatchDeleteNonstrict(bRoleGrpList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BRoleGrp, BRoleGrpCB&gt;() {
     *     public ConditionBean setup(BRoleGrp entity, BRoleGrpCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BRoleGrp, BRoleGrpCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setPK...(value);</span>
     * bRoleGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bRoleGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bRoleGrp, cb);
     * </pre>
     * @param bRoleGrp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BRoleGrp bRoleGrp, BRoleGrpCB cb) {
        return doQueryUpdate(bRoleGrp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BRoleGrpCB cb = new BRoleGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">queryDelete</span>(bRoleGrp, cb);
     * </pre>
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BRoleGrpCB cb) {
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
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bRoleGrp.setFoo...(value);
     * bRoleGrp.setBar...(value);
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bRoleGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bRoleGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bRoleGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, InsertOption<BRoleGrpCB>> opLambda) {
        doInsert(bRoleGrp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRoleGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bRoleGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bRoleGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bRoleGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> opLambda) {
        doUpdate(bRoleGrp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * bRoleGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bRoleGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bRoleGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bRoleGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> opLambda) {
        doUpdateNonstrict(bRoleGrp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bRoleGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, InsertOption<BRoleGrpCB>> insertOpLambda, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> updateOpLambda) {
        doInsertOrUpdate(bRoleGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bRoleGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, InsertOption<BRoleGrpCB>> insertOpLambda, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bRoleGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bRoleGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, DeleteOption<BRoleGrpCB>> opLambda) {
        doDelete(bRoleGrp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bRoleGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BRoleGrp bRoleGrp, WritableOptionCall<BRoleGrpCB, DeleteOption<BRoleGrpCB>> opLambda) {
        doDeleteNonstrict(bRoleGrp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BRoleGrp> bRoleGrpList, WritableOptionCall<BRoleGrpCB, InsertOption<BRoleGrpCB>> opLambda) {
        return doBatchInsert(bRoleGrpList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BRoleGrp> bRoleGrpList, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> opLambda) {
        return doBatchUpdate(bRoleGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BRoleGrp> bRoleGrpList, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> opLambda) {
        return doBatchUpdateNonstrict(bRoleGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BRoleGrp> bRoleGrpList, WritableOptionCall<BRoleGrpCB, DeleteOption<BRoleGrpCB>> opLambda) {
        return doBatchDelete(bRoleGrpList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bRoleGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BRoleGrp> bRoleGrpList, WritableOptionCall<BRoleGrpCB, DeleteOption<BRoleGrpCB>> opLambda) {
        return doBatchDeleteNonstrict(bRoleGrpList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BRoleGrp, BRoleGrpCB> manyArgLambda, WritableOptionCall<BRoleGrpCB, InsertOption<BRoleGrpCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BRoleGrp bRoleGrp = <span style="color: #70226C">new</span> BRoleGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setPK...(value);</span>
     * bRoleGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bRoleGrp.setVersionNo(value);</span>
     * BRoleGrpCB cb = <span style="color: #70226C">new</span> BRoleGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bRoleGrp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bRoleGrp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BRoleGrp bRoleGrp, BRoleGrpCB cb, WritableOptionCall<BRoleGrpCB, UpdateOption<BRoleGrpCB>> opLambda) {
        return doQueryUpdate(bRoleGrp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BRoleGrp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BRoleGrpCB cb, WritableOptionCall<BRoleGrpCB, DeleteOption<BRoleGrpCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bRoleGrpBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bRoleGrpBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bRoleGrpBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bRoleGrpBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bRoleGrpBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bRoleGrpBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bRoleGrpBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bRoleGrpBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bRoleGrpBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bRoleGrpBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bRoleGrpBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bRoleGrpBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bRoleGrpBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bRoleGrpBhv.outideSql().removeBlockComment().selectList()
     * bRoleGrpBhv.outideSql().removeLineComment().selectList()
     * bRoleGrpBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BRoleGrpBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BRoleGrpBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BRoleGrp> typeOfSelectedEntity() { return BRoleGrp.class; }
    protected Class<BRoleGrp> typeOfHandlingEntity() { return BRoleGrp.class; }
    protected Class<BRoleGrpCB> typeOfHandlingConditionBean() { return BRoleGrpCB.class; }
}
