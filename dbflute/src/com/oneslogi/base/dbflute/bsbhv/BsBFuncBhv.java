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
 * The behavior of B_FUNC as TABLE. <br>
 * <pre>
 * [primary key]
 *     FUNC_ID
 *
 * [column]
 *     FUNC_ID, CLASS_CD, METHOD_CD, FUNC_CD, FUNC_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FUNC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     B_ARG, B_FUNC_ROLE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bArgList, bFuncRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBFuncBhv extends AbstractBehaviorWritable<BFunc, BFuncCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BFuncDbm asDBMeta() { return BFuncDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_FUNC"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BFuncDbm getMyDBMeta() { return BFuncDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BFuncCB newConditionBean() { return new BFuncCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BFunc newMyEntity() { return new BFunc(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BFuncCB newMyConditionBean() { return new BFuncCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BFuncCB cb) {
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
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().setFoo...(value);
     * BFunc bFunc = <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bFunc != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bFunc.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BFunc selectEntity(BFuncCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BFunc facadeSelectEntity(BFuncCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BFunc> OptionalEntity<ENTITY> doSelectOptionalEntity(BFuncCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().set...;
     * BFunc bFunc = <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bFunc.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BFunc selectEntityWithDeletedCheck(BFuncCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param funcId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BFunc selectByPKValue(Long funcId) {
        return facadeSelectByPKValue(funcId);
    }

    protected BFunc facadeSelectByPKValue(Long funcId) {
        return doSelectByPK(funcId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BFunc> ENTITY doSelectByPK(Long funcId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(funcId), tp);
    }

    protected <ENTITY extends BFunc> OptionalEntity<ENTITY> doSelectOptionalByPK(Long funcId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(funcId, tp), funcId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param funcId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BFunc selectByPKValueWithDeletedCheck(Long funcId) {
        return doSelectByPKWithDeletedCheck(funcId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BFunc> ENTITY doSelectByPKWithDeletedCheck(Long funcId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(funcId), tp);
    }

    protected BFuncCB xprepareCBAsPK(Long funcId) {
        assertObjectNotNull("funcId", funcId);
        return newConditionBean().acceptPK(funcId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param classCd : UQ+, NotNull, varchar(100). (NotNull)
     * @param methodCd : +UQ, NotNull, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BFunc> selectByUniqueOf(String classCd, String methodCd) {
        return facadeSelectByUniqueOf(classCd, methodCd);
    }

    protected OptionalEntity<BFunc> facadeSelectByUniqueOf(String classCd, String methodCd) {
        return doSelectByUniqueOf(classCd, methodCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BFunc> OptionalEntity<ENTITY> doSelectByUniqueOf(String classCd, String methodCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(classCd, methodCd), tp), classCd, methodCd);
    }

    protected BFuncCB xprepareCBAsUniqueOf(String classCd, String methodCd) {
        assertObjectNotNull("classCd", classCd);assertObjectNotNull("methodCd", methodCd);
        return newConditionBean().acceptUniqueOf(classCd, methodCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BFunc&gt; <span style="color: #553000">bFuncList</span> = <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BFunc bFunc : <span style="color: #553000">bFuncList</span>) {
     *     ... = bFunc.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BFunc> selectList(BFuncCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BFunc&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BFunc bFunc : <span style="color: #553000">page</span>) {
     *     ... = bFunc.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BFunc> selectPage(BFuncCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().set...
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @param entityRowHandler The handler of entity row of BFunc. (NotNull)
     */
    public void selectCursor(BFuncCB cb, EntityRowHandler<BFunc> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BFuncCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BFuncCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bFuncList The entity list of BFunc. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BFunc> bFuncList, ReferrerLoaderHandler<LoaderOfBFunc> loaderLambda) {
        xassLRArg(bFuncList, loaderLambda);
        loaderLambda.handle(new LoaderOfBFunc().ready(bFuncList, _behaviorSelector));
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
     * @param bFunc The entity of BFunc. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BFunc bFunc, ReferrerLoaderHandler<LoaderOfBFunc> loaderLambda) {
        xassLRArg(bFunc, loaderLambda);
        loaderLambda.handle(new LoaderOfBFunc().ready(xnewLRAryLs(bFunc), _behaviorSelector));
    }

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by FUNC_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">bFuncList</span>, <span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">argCB</span>.setupSelect...
     *     <span style="color: #553000">argCB</span>.query().set...
     *     <span style="color: #553000">argCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BFunc bFunc : <span style="color: #553000">bFuncList</span>) {
     *     ... = bFunc.<span style="color: #CC4747">getBArgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param bFuncList The entity list of BFunc. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(List<BFunc> bFuncList, ConditionBeanSetupper<BArgCB> refCBLambda) {
        xassLRArg(bFuncList, refCBLambda);
        return doLoadBArgList(bFuncList, new LoadReferrerOption<BArgCB, BArg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by FUNC_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">bFunc</span>, <span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">argCB</span>.setupSelect...
     *     <span style="color: #553000">argCB</span>.query().set...
     *     <span style="color: #553000">argCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bFunc</span>.<span style="color: #CC4747">getBArgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param bFunc The entity of BFunc. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(BFunc bFunc, ConditionBeanSetupper<BArgCB> refCBLambda) {
        xassLRArg(bFunc, refCBLambda);
        return doLoadBArgList(xnewLRLs(bFunc), new LoadReferrerOption<BArgCB, BArg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bFunc The entity of BFunc. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(BFunc bFunc, LoadReferrerOption<BArgCB, BArg> loadReferrerOption) {
        xassLRArg(bFunc, loadReferrerOption);
        return loadBArgList(xnewLRLs(bFunc), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bFuncList The entity list of BFunc. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BArg> loadBArgList(List<BFunc> bFuncList, LoadReferrerOption<BArgCB, BArg> loadReferrerOption) {
        xassLRArg(bFuncList, loadReferrerOption);
        if (bFuncList.isEmpty()) { return (NestedReferrerListGateway<BArg>)EMPTY_NREF_LGWAY; }
        return doLoadBArgList(bFuncList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BArg> doLoadBArgList(List<BFunc> bFuncList, LoadReferrerOption<BArgCB, BArg> option) {
        return helpLoadReferrerInternally(bFuncList, option, "bArgList");
    }

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">bFuncList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BFunc bFunc : <span style="color: #553000">bFuncList</span>) {
     *     ... = bFunc.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param bFuncList The entity list of BFunc. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(List<BFunc> bFuncList, ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        xassLRArg(bFuncList, refCBLambda);
        return doLoadBFuncRoleList(bFuncList, new LoadReferrerOption<BFuncRoleCB, BFuncRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">bFunc</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bFunc</span>.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param bFunc The entity of BFunc. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(BFunc bFunc, ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        xassLRArg(bFunc, refCBLambda);
        return doLoadBFuncRoleList(xnewLRLs(bFunc), new LoadReferrerOption<BFuncRoleCB, BFuncRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bFunc The entity of BFunc. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(BFunc bFunc, LoadReferrerOption<BFuncRoleCB, BFuncRole> loadReferrerOption) {
        xassLRArg(bFunc, loadReferrerOption);
        return loadBFuncRoleList(xnewLRLs(bFunc), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bFuncList The entity list of BFunc. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BFuncRole> loadBFuncRoleList(List<BFunc> bFuncList, LoadReferrerOption<BFuncRoleCB, BFuncRole> loadReferrerOption) {
        xassLRArg(bFuncList, loadReferrerOption);
        if (bFuncList.isEmpty()) { return (NestedReferrerListGateway<BFuncRole>)EMPTY_NREF_LGWAY; }
        return doLoadBFuncRoleList(bFuncList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BFuncRole> doLoadBFuncRoleList(List<BFunc> bFuncList, LoadReferrerOption<BFuncRoleCB, BFuncRole> option) {
        return helpLoadReferrerInternally(bFuncList, option, "bFuncRoleList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key funcId.
     * @param bFuncList The list of bFunc. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractFuncIdList(List<BFunc> bFuncList)
    { return helpExtractListInternally(bFuncList, "funcId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bFunc.setFoo...(value);
     * bFunc.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bFunc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bFunc.set...;</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">insert</span>(bFunc);
     * ... = bFunc.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bFunc The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BFunc bFunc) {
        doInsert(bFunc, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bFunc.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bFunc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bFunc.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bFunc.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">update</span>(bFunc);
     * </pre>
     * @param bFunc The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BFunc bFunc) {
        doUpdate(bFunc, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bFunc.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bFunc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bFunc.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bFunc);
     * </pre>
     * @param bFunc The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BFunc bFunc) {
        doUpdateNonstrict(bFunc, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bFunc The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BFunc bFunc) {
        doInsertOrUpdate(bFunc, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bFunc The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BFunc bFunc) {
        doInsertOrUpdateNonstrict(bFunc, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bFunc.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">delete</span>(bFunc);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bFunc The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BFunc bFunc) {
        doDelete(bFunc, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bFunc);
     * </pre>
     * @param bFunc The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BFunc bFunc) {
        doDeleteNonstrict(bFunc, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bFunc);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bFunc The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BFunc bFunc) {
        doDeleteNonstrictIgnoreDeleted(bFunc, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BFunc et, final DeleteOption<BFuncCB> op) {
        assertObjectNotNull("bFunc", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     *     bFunc.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bFunc.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bFuncList.add(bFunc);
     * }
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchInsert</span>(bFuncList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BFunc> bFuncList) {
        return doBatchInsert(bFuncList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     *     bFunc.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bFunc.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bFunc.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bFunc.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bFuncList.add(bFunc);
     * }
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bFuncList);
     * </pre>
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BFunc> bFuncList) {
        return doBatchUpdate(bFuncList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bFuncBhv.<span style="color: #CC4747">batchUpdate</span>(bFuncList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bFuncList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BFunc> bFuncList, SpecifyQuery<BFuncCB> colCBLambda) {
        return doBatchUpdate(bFuncList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     *     bFunc.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bFunc.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bFunc.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bFunc.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bFuncList.add(bFunc);
     * }
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bFuncList);
     * </pre>
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BFunc> bFuncList) {
        return doBatchUpdateNonstrict(bFuncList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bFuncList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bFuncList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BFunc> bFuncList, SpecifyQuery<BFuncCB> colCBLambda) {
        return doBatchUpdateNonstrict(bFuncList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BFunc> bFuncList) {
        return doBatchDelete(bFuncList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BFunc> bFuncList) {
        return doBatchDeleteNonstrict(bFuncList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BFunc, BFuncCB&gt;() {
     *     public ConditionBean setup(BFunc entity, BFuncCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BFunc, BFuncCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bFunc.setPK...(value);</span>
     * bFunc.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bFunc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bFunc.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bFunc, cb);
     * </pre>
     * @param bFunc The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BFunc bFunc, BFuncCB cb) {
        return doQueryUpdate(bFunc, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BFuncCB cb = new BFuncCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">queryDelete</span>(bFunc, cb);
     * </pre>
     * @param cb The condition-bean of BFunc. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BFuncCB cb) {
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
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bFunc.setFoo...(value);
     * bFunc.setBar...(value);
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bFunc, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bFunc.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bFunc The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BFunc bFunc, WritableOptionCall<BFuncCB, InsertOption<BFuncCB>> opLambda) {
        doInsert(bFunc, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bFunc.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bFunc.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bFunc, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bFunc The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BFunc bFunc, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> opLambda) {
        doUpdate(bFunc, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * bFunc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bFunc.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bFunc, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bFunc The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BFunc bFunc, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> opLambda) {
        doUpdateNonstrict(bFunc, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bFunc The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BFunc bFunc, WritableOptionCall<BFuncCB, InsertOption<BFuncCB>> insertOpLambda, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> updateOpLambda) {
        doInsertOrUpdate(bFunc, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bFunc The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BFunc bFunc, WritableOptionCall<BFuncCB, InsertOption<BFuncCB>> insertOpLambda, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bFunc, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bFunc The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BFunc bFunc, WritableOptionCall<BFuncCB, DeleteOption<BFuncCB>> opLambda) {
        doDelete(bFunc, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bFunc The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BFunc bFunc, WritableOptionCall<BFuncCB, DeleteOption<BFuncCB>> opLambda) {
        doDeleteNonstrict(bFunc, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BFunc> bFuncList, WritableOptionCall<BFuncCB, InsertOption<BFuncCB>> opLambda) {
        return doBatchInsert(bFuncList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BFunc> bFuncList, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> opLambda) {
        return doBatchUpdate(bFuncList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BFunc> bFuncList, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> opLambda) {
        return doBatchUpdateNonstrict(bFuncList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BFunc> bFuncList, WritableOptionCall<BFuncCB, DeleteOption<BFuncCB>> opLambda) {
        return doBatchDelete(bFuncList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bFuncList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BFunc> bFuncList, WritableOptionCall<BFuncCB, DeleteOption<BFuncCB>> opLambda) {
        return doBatchDeleteNonstrict(bFuncList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BFunc, BFuncCB> manyArgLambda, WritableOptionCall<BFuncCB, InsertOption<BFuncCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BFunc bFunc = <span style="color: #70226C">new</span> BFunc();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bFunc.setPK...(value);</span>
     * bFunc.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bFunc.setVersionNo(value);</span>
     * BFuncCB cb = <span style="color: #70226C">new</span> BFuncCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bFunc, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bFunc The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BFunc. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BFunc bFunc, BFuncCB cb, WritableOptionCall<BFuncCB, UpdateOption<BFuncCB>> opLambda) {
        return doQueryUpdate(bFunc, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BFunc. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BFuncCB cb, WritableOptionCall<BFuncCB, DeleteOption<BFuncCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bFuncBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bFuncBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bFuncBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bFuncBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bFuncBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bFuncBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bFuncBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bFuncBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bFuncBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bFuncBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bFuncBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bFuncBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bFuncBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bFuncBhv.outideSql().removeBlockComment().selectList()
     * bFuncBhv.outideSql().removeLineComment().selectList()
     * bFuncBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BFuncBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BFuncBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BFunc> typeOfSelectedEntity() { return BFunc.class; }
    protected Class<BFunc> typeOfHandlingEntity() { return BFunc.class; }
    protected Class<BFuncCB> typeOfHandlingConditionBean() { return BFuncCB.class; }
}
