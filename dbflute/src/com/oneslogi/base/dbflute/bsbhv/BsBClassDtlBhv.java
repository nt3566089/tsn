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
 * The behavior of B_CLASS_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLASS_DTL_ID
 *
 * [column]
 *     CLASS_DTL_ID, CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS, B_DICT, V_DICT, B_CLASS_DTL_SUB(AsOne)
 *
 * [referrer table]
 *     B_CLASS_GRP_DTL, B_CLASS_DTL_SUB
 *
 * [foreign property]
 *     bClass, bDict, vDict, bClassDtlSubAsOne
 *
 * [referrer property]
 *     bClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBClassDtlBhv extends AbstractBehaviorWritable<BClassDtl, BClassDtlCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BClassDtlDbm asDBMeta() { return BClassDtlDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_CLASS_DTL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BClassDtlDbm getMyDBMeta() { return BClassDtlDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BClassDtlCB newConditionBean() { return new BClassDtlCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BClassDtl newMyEntity() { return new BClassDtl(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BClassDtlCB newMyConditionBean() { return new BClassDtlCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BClassDtlCB cb) {
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
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().setFoo...(value);
     * BClassDtl bClassDtl = <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bClassDtl != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bClassDtl.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BClassDtl selectEntity(BClassDtlCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BClassDtl facadeSelectEntity(BClassDtlCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BClassDtl> OptionalEntity<ENTITY> doSelectOptionalEntity(BClassDtlCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().set...;
     * BClassDtl bClassDtl = <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bClassDtl.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BClassDtl selectEntityWithDeletedCheck(BClassDtlCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param classDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BClassDtl selectByPKValue(Long classDtlId) {
        return facadeSelectByPKValue(classDtlId);
    }

    protected BClassDtl facadeSelectByPKValue(Long classDtlId) {
        return doSelectByPK(classDtlId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BClassDtl> ENTITY doSelectByPK(Long classDtlId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(classDtlId), tp);
    }

    protected <ENTITY extends BClassDtl> OptionalEntity<ENTITY> doSelectOptionalByPK(Long classDtlId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(classDtlId, tp), classDtlId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param classDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BClassDtl selectByPKValueWithDeletedCheck(Long classDtlId) {
        return doSelectByPKWithDeletedCheck(classDtlId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BClassDtl> ENTITY doSelectByPKWithDeletedCheck(Long classDtlId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(classDtlId), tp);
    }

    protected BClassDtlCB xprepareCBAsPK(Long classDtlId) {
        assertObjectNotNull("classDtlId", classDtlId);
        return newConditionBean().acceptPK(classDtlId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param classId : UQ+, IX, NotNull, bigint(19), FK to B_CLASS. (NotNull)
     * @param classDtlCd : +UQ, NotNull, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BClassDtl> selectByUniqueOf(Long classId, String classDtlCd) {
        return facadeSelectByUniqueOf(classId, classDtlCd);
    }

    protected OptionalEntity<BClassDtl> facadeSelectByUniqueOf(Long classId, String classDtlCd) {
        return doSelectByUniqueOf(classId, classDtlCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BClassDtl> OptionalEntity<ENTITY> doSelectByUniqueOf(Long classId, String classDtlCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(classId, classDtlCd), tp), classId, classDtlCd);
    }

    protected BClassDtlCB xprepareCBAsUniqueOf(Long classId, String classDtlCd) {
        assertObjectNotNull("classId", classId);assertObjectNotNull("classDtlCd", classDtlCd);
        return newConditionBean().acceptUniqueOf(classId, classDtlCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BClassDtl&gt; <span style="color: #553000">bClassDtlList</span> = <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BClassDtl bClassDtl : <span style="color: #553000">bClassDtlList</span>) {
     *     ... = bClassDtl.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BClassDtl> selectList(BClassDtlCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BClassDtl&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BClassDtl bClassDtl : <span style="color: #553000">page</span>) {
     *     ... = bClassDtl.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BClassDtl> selectPage(BClassDtlCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().set...
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @param entityRowHandler The handler of entity row of BClassDtl. (NotNull)
     */
    public void selectCursor(BClassDtlCB cb, EntityRowHandler<BClassDtl> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BClassDtlCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BClassDtlCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bClassDtlList The entity list of BClassDtl. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BClassDtl> bClassDtlList, ReferrerLoaderHandler<LoaderOfBClassDtl> loaderLambda) {
        xassLRArg(bClassDtlList, loaderLambda);
        loaderLambda.handle(new LoaderOfBClassDtl().ready(bClassDtlList, _behaviorSelector));
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
     * @param bClassDtl The entity of BClassDtl. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BClassDtl bClassDtl, ReferrerLoaderHandler<LoaderOfBClassDtl> loaderLambda) {
        xassLRArg(bClassDtl, loaderLambda);
        loaderLambda.handle(new LoaderOfBClassDtl().ready(xnewLRAryLs(bClassDtl), _behaviorSelector));
    }

    /**
     * Load referrer of BClassGrpDtlList by the set-upper of referrer. <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">loadBClassGrpDtlList</span>(<span style="color: #553000">bClassDtlList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BClassDtl bClassDtl : <span style="color: #553000">bClassDtlList</span>) {
     *     ... = bClassDtl.<span style="color: #CC4747">getBClassGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassDtlId_InScope(pkList);
     * cb.query().addOrderBy_ClassDtlId_Asc();
     * </pre>
     * @param bClassDtlList The entity list of BClassDtl. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassGrpDtl> loadBClassGrpDtlList(List<BClassDtl> bClassDtlList, ConditionBeanSetupper<BClassGrpDtlCB> refCBLambda) {
        xassLRArg(bClassDtlList, refCBLambda);
        return doLoadBClassGrpDtlList(bClassDtlList, new LoadReferrerOption<BClassGrpDtlCB, BClassGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BClassGrpDtlList by the set-upper of referrer. <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">loadBClassGrpDtlList</span>(<span style="color: #553000">bClassDtl</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bClassDtl</span>.<span style="color: #CC4747">getBClassGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassDtlId_InScope(pkList);
     * cb.query().addOrderBy_ClassDtlId_Asc();
     * </pre>
     * @param bClassDtl The entity of BClassDtl. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassGrpDtl> loadBClassGrpDtlList(BClassDtl bClassDtl, ConditionBeanSetupper<BClassGrpDtlCB> refCBLambda) {
        xassLRArg(bClassDtl, refCBLambda);
        return doLoadBClassGrpDtlList(xnewLRLs(bClassDtl), new LoadReferrerOption<BClassGrpDtlCB, BClassGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bClassDtl The entity of BClassDtl. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassGrpDtl> loadBClassGrpDtlList(BClassDtl bClassDtl, LoadReferrerOption<BClassGrpDtlCB, BClassGrpDtl> loadReferrerOption) {
        xassLRArg(bClassDtl, loadReferrerOption);
        return loadBClassGrpDtlList(xnewLRLs(bClassDtl), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bClassDtlList The entity list of BClassDtl. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BClassGrpDtl> loadBClassGrpDtlList(List<BClassDtl> bClassDtlList, LoadReferrerOption<BClassGrpDtlCB, BClassGrpDtl> loadReferrerOption) {
        xassLRArg(bClassDtlList, loadReferrerOption);
        if (bClassDtlList.isEmpty()) { return (NestedReferrerListGateway<BClassGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadBClassGrpDtlList(bClassDtlList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BClassGrpDtl> doLoadBClassGrpDtlList(List<BClassDtl> bClassDtlList, LoadReferrerOption<BClassGrpDtlCB, BClassGrpDtl> option) {
        return helpLoadReferrerInternally(bClassDtlList, option, "bClassGrpDtlList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BClass'.
     * @param bClassDtlList The list of bClassDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClass> pulloutBClass(List<BClassDtl> bClassDtlList)
    { return helpPulloutInternally(bClassDtlList, "bClass"); }

    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bClassDtlList The list of bClassDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BClassDtl> bClassDtlList)
    { return helpPulloutInternally(bClassDtlList, "bDict"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bClassDtlList The list of bClassDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BClassDtl> bClassDtlList)
    { return helpPulloutInternally(bClassDtlList, "vDict"); }

    /**
     * Pull out the list of referrer-as-one table 'BClassDtlSub'.
     * @param bClassDtlList The list of bClassDtl. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtlSub> pulloutBClassDtlSubAsOne(List<BClassDtl> bClassDtlList)
    { return helpPulloutInternally(bClassDtlList, "bClassDtlSubAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key classDtlId.
     * @param bClassDtlList The list of bClassDtl. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractClassDtlIdList(List<BClassDtl> bClassDtlList)
    { return helpExtractListInternally(bClassDtlList, "classDtlId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bClassDtl.setFoo...(value);
     * bClassDtl.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bClassDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bClassDtl.set...;</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">insert</span>(bClassDtl);
     * ... = bClassDtl.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bClassDtl The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BClassDtl bClassDtl) {
        doInsert(bClassDtl, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bClassDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bClassDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bClassDtl.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bClassDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">update</span>(bClassDtl);
     * </pre>
     * @param bClassDtl The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BClassDtl bClassDtl) {
        doUpdate(bClassDtl, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bClassDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bClassDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bClassDtl.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bClassDtl);
     * </pre>
     * @param bClassDtl The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BClassDtl bClassDtl) {
        doUpdateNonstrict(bClassDtl, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bClassDtl The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BClassDtl bClassDtl) {
        doInsertOrUpdate(bClassDtl, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bClassDtl The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BClassDtl bClassDtl) {
        doInsertOrUpdateNonstrict(bClassDtl, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bClassDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">delete</span>(bClassDtl);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bClassDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BClassDtl bClassDtl) {
        doDelete(bClassDtl, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bClassDtl);
     * </pre>
     * @param bClassDtl The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BClassDtl bClassDtl) {
        doDeleteNonstrict(bClassDtl, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bClassDtl);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bClassDtl The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BClassDtl bClassDtl) {
        doDeleteNonstrictIgnoreDeleted(bClassDtl, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BClassDtl et, final DeleteOption<BClassDtlCB> op) {
        assertObjectNotNull("bClassDtl", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     *     bClassDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bClassDtl.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bClassDtlList.add(bClassDtl);
     * }
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchInsert</span>(bClassDtlList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BClassDtl> bClassDtlList) {
        return doBatchInsert(bClassDtlList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     *     bClassDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bClassDtl.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bClassDtl.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bClassDtl.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bClassDtlList.add(bClassDtl);
     * }
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bClassDtlList);
     * </pre>
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BClassDtl> bClassDtlList) {
        return doBatchUpdate(bClassDtlList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bClassDtlBhv.<span style="color: #CC4747">batchUpdate</span>(bClassDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bClassDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BClassDtl> bClassDtlList, SpecifyQuery<BClassDtlCB> colCBLambda) {
        return doBatchUpdate(bClassDtlList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     *     bClassDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bClassDtl.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bClassDtl.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bClassDtl.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bClassDtlList.add(bClassDtl);
     * }
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bClassDtlList);
     * </pre>
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BClassDtl> bClassDtlList) {
        return doBatchUpdateNonstrict(bClassDtlList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bClassDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bClassDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BClassDtl> bClassDtlList, SpecifyQuery<BClassDtlCB> colCBLambda) {
        return doBatchUpdateNonstrict(bClassDtlList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BClassDtl> bClassDtlList) {
        return doBatchDelete(bClassDtlList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BClassDtl> bClassDtlList) {
        return doBatchDeleteNonstrict(bClassDtlList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BClassDtl, BClassDtlCB&gt;() {
     *     public ConditionBean setup(BClassDtl entity, BClassDtlCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BClassDtl, BClassDtlCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bClassDtl.setPK...(value);</span>
     * bClassDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bClassDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bClassDtl.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bClassDtl, cb);
     * </pre>
     * @param bClassDtl The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BClassDtl bClassDtl, BClassDtlCB cb) {
        return doQueryUpdate(bClassDtl, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BClassDtlCB cb = new BClassDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">queryDelete</span>(bClassDtl, cb);
     * </pre>
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BClassDtlCB cb) {
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
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bClassDtl.setFoo...(value);
     * bClassDtl.setBar...(value);
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bClassDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bClassDtl.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bClassDtl The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, InsertOption<BClassDtlCB>> opLambda) {
        doInsert(bClassDtl, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bClassDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bClassDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bClassDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bClassDtl The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> opLambda) {
        doUpdate(bClassDtl, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * bClassDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bClassDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bClassDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bClassDtl The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> opLambda) {
        doUpdateNonstrict(bClassDtl, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bClassDtl The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, InsertOption<BClassDtlCB>> insertOpLambda, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> updateOpLambda) {
        doInsertOrUpdate(bClassDtl, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bClassDtl The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, InsertOption<BClassDtlCB>> insertOpLambda, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bClassDtl, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bClassDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, DeleteOption<BClassDtlCB>> opLambda) {
        doDelete(bClassDtl, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bClassDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BClassDtl bClassDtl, WritableOptionCall<BClassDtlCB, DeleteOption<BClassDtlCB>> opLambda) {
        doDeleteNonstrict(bClassDtl, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BClassDtl> bClassDtlList, WritableOptionCall<BClassDtlCB, InsertOption<BClassDtlCB>> opLambda) {
        return doBatchInsert(bClassDtlList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BClassDtl> bClassDtlList, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> opLambda) {
        return doBatchUpdate(bClassDtlList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BClassDtl> bClassDtlList, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> opLambda) {
        return doBatchUpdateNonstrict(bClassDtlList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BClassDtl> bClassDtlList, WritableOptionCall<BClassDtlCB, DeleteOption<BClassDtlCB>> opLambda) {
        return doBatchDelete(bClassDtlList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bClassDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BClassDtl> bClassDtlList, WritableOptionCall<BClassDtlCB, DeleteOption<BClassDtlCB>> opLambda) {
        return doBatchDeleteNonstrict(bClassDtlList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BClassDtl, BClassDtlCB> manyArgLambda, WritableOptionCall<BClassDtlCB, InsertOption<BClassDtlCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BClassDtl bClassDtl = <span style="color: #70226C">new</span> BClassDtl();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bClassDtl.setPK...(value);</span>
     * bClassDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bClassDtl.setVersionNo(value);</span>
     * BClassDtlCB cb = <span style="color: #70226C">new</span> BClassDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bClassDtlBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bClassDtl, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bClassDtl The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BClassDtl bClassDtl, BClassDtlCB cb, WritableOptionCall<BClassDtlCB, UpdateOption<BClassDtlCB>> opLambda) {
        return doQueryUpdate(bClassDtl, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BClassDtl. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BClassDtlCB cb, WritableOptionCall<BClassDtlCB, DeleteOption<BClassDtlCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bClassDtlBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bClassDtlBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bClassDtlBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bClassDtlBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bClassDtlBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bClassDtlBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bClassDtlBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bClassDtlBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bClassDtlBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bClassDtlBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bClassDtlBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bClassDtlBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bClassDtlBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bClassDtlBhv.outideSql().removeBlockComment().selectList()
     * bClassDtlBhv.outideSql().removeLineComment().selectList()
     * bClassDtlBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BClassDtlBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BClassDtlBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BClassDtl> typeOfSelectedEntity() { return BClassDtl.class; }
    protected Class<BClassDtl> typeOfHandlingEntity() { return BClassDtl.class; }
    protected Class<BClassDtlCB> typeOfHandlingConditionBean() { return BClassDtlCB.class; }
}
