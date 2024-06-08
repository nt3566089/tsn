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
 * The behavior of M_CENTER_CLASS as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_ID
 *
 * [column]
 *     CENTER_CLASS_ID, CENTER_ID, CLASS_CD, CLASS_COMMENT, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(BySystemType)
 *
 * [referrer table]
 *     M_CENTER_CLASS_DTL, M_CENTER_CLASS_GRP
 *
 * [foreign property]
 *     mCenter, bClassDtlBySystemType
 *
 * [referrer property]
 *     mCenterClassDtlList, mCenterClassGrpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterClassBhv extends AbstractBehaviorWritable<MCenterClass, MCenterClassCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCenterClassDbm asDBMeta() { return MCenterClassDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CENTER_CLASS"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCenterClassDbm getMyDBMeta() { return MCenterClassDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCenterClassCB newConditionBean() { return new MCenterClassCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCenterClass newMyEntity() { return new MCenterClass(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCenterClassCB newMyConditionBean() { return new MCenterClassCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCenterClassCB cb) {
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
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().setFoo...(value);
     * MCenterClass mCenterClass = <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCenterClass != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCenterClass.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClass selectEntity(MCenterClassCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCenterClass facadeSelectEntity(MCenterClassCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClass> OptionalEntity<ENTITY> doSelectOptionalEntity(MCenterClassCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().set...;
     * MCenterClass mCenterClass = <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCenterClass.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClass selectEntityWithDeletedCheck(MCenterClassCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerClassId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClass selectByPKValue(Long centerClassId) {
        return facadeSelectByPKValue(centerClassId);
    }

    protected MCenterClass facadeSelectByPKValue(Long centerClassId) {
        return doSelectByPK(centerClassId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClass> ENTITY doSelectByPK(Long centerClassId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerClassId), tp);
    }

    protected <ENTITY extends MCenterClass> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerClassId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerClassId, tp), centerClassId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerClassId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClass selectByPKValueWithDeletedCheck(Long centerClassId) {
        return doSelectByPKWithDeletedCheck(centerClassId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClass> ENTITY doSelectByPKWithDeletedCheck(Long centerClassId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerClassId), tp);
    }

    protected MCenterClassCB xprepareCBAsPK(Long centerClassId) {
        assertObjectNotNull("centerClassId", centerClassId);
        return newConditionBean().acceptPK(centerClassId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param classCd : +UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCenterClass> selectByUniqueOf(Long centerId, String classCd) {
        return facadeSelectByUniqueOf(centerId, classCd);
    }

    protected OptionalEntity<MCenterClass> facadeSelectByUniqueOf(Long centerId, String classCd) {
        return doSelectByUniqueOf(centerId, classCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClass> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String classCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, classCd), tp), centerId, classCd);
    }

    protected MCenterClassCB xprepareCBAsUniqueOf(Long centerId, String classCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("classCd", classCd);
        return newConditionBean().acceptUniqueOf(centerId, classCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCenterClass&gt; <span style="color: #553000">mCenterClassList</span> = <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCenterClass mCenterClass : <span style="color: #553000">mCenterClassList</span>) {
     *     ... = mCenterClass.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCenterClass> selectList(MCenterClassCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCenterClass&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCenterClass mCenterClass : <span style="color: #553000">page</span>) {
     *     ... = mCenterClass.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCenterClass> selectPage(MCenterClassCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @param entityRowHandler The handler of entity row of MCenterClass. (NotNull)
     */
    public void selectCursor(MCenterClassCB cb, EntityRowHandler<MCenterClass> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterClassCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterClassCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCenterClassList The entity list of MCenterClass. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCenterClass> mCenterClassList, ReferrerLoaderHandler<LoaderOfMCenterClass> loaderLambda) {
        xassLRArg(mCenterClassList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterClass().ready(mCenterClassList, _behaviorSelector));
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
     * @param mCenterClass The entity of MCenterClass. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCenterClass mCenterClass, ReferrerLoaderHandler<LoaderOfMCenterClass> loaderLambda) {
        xassLRArg(mCenterClass, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterClass().ready(xnewLRAryLs(mCenterClass), _behaviorSelector));
    }

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by CENTER_CLASS_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">mCenterClassList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenterClass mCenterClass : <span style="color: #553000">mCenterClassList</span>) {
     *     ... = mCenterClass.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param mCenterClassList The entity list of MCenterClass. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(List<MCenterClass> mCenterClassList, ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        xassLRArg(mCenterClassList, refCBLambda);
        return doLoadMCenterClassDtlList(mCenterClassList, new LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by CENTER_CLASS_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">mCenterClass</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenterClass</span>.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param mCenterClass The entity of MCenterClass. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(MCenterClass mCenterClass, ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        xassLRArg(mCenterClass, refCBLambda);
        return doLoadMCenterClassDtlList(xnewLRLs(mCenterClass), new LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenterClass The entity of MCenterClass. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(MCenterClass mCenterClass, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> loadReferrerOption) {
        xassLRArg(mCenterClass, loadReferrerOption);
        return loadMCenterClassDtlList(xnewLRLs(mCenterClass), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterClassList The entity list of MCenterClass. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(List<MCenterClass> mCenterClassList, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> loadReferrerOption) {
        xassLRArg(mCenterClassList, loadReferrerOption);
        if (mCenterClassList.isEmpty()) { return (NestedReferrerListGateway<MCenterClassDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassDtlList(mCenterClassList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClassDtl> doLoadMCenterClassDtlList(List<MCenterClass> mCenterClassList, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> option) {
        return helpLoadReferrerInternally(mCenterClassList, option, "mCenterClassDtlList");
    }

    /**
     * Load referrer of MCenterClassGrpList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP by CENTER_CLASS_ID, named 'MCenterClassGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">loadMCenterClassGrpList</span>(<span style="color: #553000">mCenterClassList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenterClass mCenterClass : <span style="color: #553000">mCenterClassList</span>) {
     *     ... = mCenterClass.<span style="color: #CC4747">getMCenterClassGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param mCenterClassList The entity list of MCenterClass. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrp> loadMCenterClassGrpList(List<MCenterClass> mCenterClassList, ConditionBeanSetupper<MCenterClassGrpCB> refCBLambda) {
        xassLRArg(mCenterClassList, refCBLambda);
        return doLoadMCenterClassGrpList(mCenterClassList, new LoadReferrerOption<MCenterClassGrpCB, MCenterClassGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassGrpList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP by CENTER_CLASS_ID, named 'MCenterClassGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">loadMCenterClassGrpList</span>(<span style="color: #553000">mCenterClass</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenterClass</span>.<span style="color: #CC4747">getMCenterClassGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassId_Asc();
     * </pre>
     * @param mCenterClass The entity of MCenterClass. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrp> loadMCenterClassGrpList(MCenterClass mCenterClass, ConditionBeanSetupper<MCenterClassGrpCB> refCBLambda) {
        xassLRArg(mCenterClass, refCBLambda);
        return doLoadMCenterClassGrpList(xnewLRLs(mCenterClass), new LoadReferrerOption<MCenterClassGrpCB, MCenterClassGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenterClass The entity of MCenterClass. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrp> loadMCenterClassGrpList(MCenterClass mCenterClass, LoadReferrerOption<MCenterClassGrpCB, MCenterClassGrp> loadReferrerOption) {
        xassLRArg(mCenterClass, loadReferrerOption);
        return loadMCenterClassGrpList(xnewLRLs(mCenterClass), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterClassList The entity list of MCenterClass. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClassGrp> loadMCenterClassGrpList(List<MCenterClass> mCenterClassList, LoadReferrerOption<MCenterClassGrpCB, MCenterClassGrp> loadReferrerOption) {
        xassLRArg(mCenterClassList, loadReferrerOption);
        if (mCenterClassList.isEmpty()) { return (NestedReferrerListGateway<MCenterClassGrp>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassGrpList(mCenterClassList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClassGrp> doLoadMCenterClassGrpList(List<MCenterClass> mCenterClassList, LoadReferrerOption<MCenterClassGrpCB, MCenterClassGrp> option) {
        return helpLoadReferrerInternally(mCenterClassList, option, "mCenterClassGrpList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mCenterClassList The list of mCenterClass. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MCenterClass> mCenterClassList)
    { return helpPulloutInternally(mCenterClassList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCenterClassList The list of mCenterClass. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySystemType(List<MCenterClass> mCenterClassList)
    { return helpPulloutInternally(mCenterClassList, "bClassDtlBySystemType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerClassId.
     * @param mCenterClassList The list of mCenterClass. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterClassIdList(List<MCenterClass> mCenterClassList)
    { return helpExtractListInternally(mCenterClassList, "centerClassId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterClass.setFoo...(value);
     * mCenterClass.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClass.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClass.set...;</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">insert</span>(mCenterClass);
     * ... = mCenterClass.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCenterClass The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCenterClass mCenterClass) {
        doInsert(mCenterClass, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClass.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClass.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClass.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClass.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">update</span>(mCenterClass);
     * </pre>
     * @param mCenterClass The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCenterClass mCenterClass) {
        doUpdate(mCenterClass, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClass.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClass.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClass.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCenterClass);
     * </pre>
     * @param mCenterClass The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCenterClass mCenterClass) {
        doUpdateNonstrict(mCenterClass, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterClass The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCenterClass mCenterClass) {
        doInsertOrUpdate(mCenterClass, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterClass The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCenterClass mCenterClass) {
        doInsertOrUpdateNonstrict(mCenterClass, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClass.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">delete</span>(mCenterClass);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCenterClass The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCenterClass mCenterClass) {
        doDelete(mCenterClass, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCenterClass);
     * </pre>
     * @param mCenterClass The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCenterClass mCenterClass) {
        doDeleteNonstrict(mCenterClass, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCenterClass);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCenterClass The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCenterClass mCenterClass) {
        doDeleteNonstrictIgnoreDeleted(mCenterClass, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCenterClass et, final DeleteOption<MCenterClassCB> op) {
        assertObjectNotNull("mCenterClass", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     *     mCenterClass.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClass.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCenterClassList.add(mCenterClass);
     * }
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCenterClassList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCenterClass> mCenterClassList) {
        return doBatchInsert(mCenterClassList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     *     mCenterClass.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClass.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterClass.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterClass.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterClassList.add(mCenterClass);
     * }
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassList);
     * </pre>
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterClass> mCenterClassList) {
        return doBatchUpdate(mCenterClassList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCenterClassBhv.<span style="color: #CC4747">batchUpdate</span>(mCenterClassList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterClass> mCenterClassList, SpecifyQuery<MCenterClassCB> colCBLambda) {
        return doBatchUpdate(mCenterClassList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     *     mCenterClass.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClass.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterClass.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterClass.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterClassList.add(mCenterClass);
     * }
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassList);
     * </pre>
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterClass> mCenterClassList) {
        return doBatchUpdateNonstrict(mCenterClassList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterClassList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterClassList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterClass> mCenterClassList, SpecifyQuery<MCenterClassCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCenterClassList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCenterClass> mCenterClassList) {
        return doBatchDelete(mCenterClassList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCenterClass> mCenterClassList) {
        return doBatchDeleteNonstrict(mCenterClassList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCenterClass, MCenterClassCB&gt;() {
     *     public ConditionBean setup(MCenterClass entity, MCenterClassCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCenterClass, MCenterClassCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterClass.setPK...(value);</span>
     * mCenterClass.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClass.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClass.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCenterClass, cb);
     * </pre>
     * @param mCenterClass The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCenterClass mCenterClass, MCenterClassCB cb) {
        return doQueryUpdate(mCenterClass, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCenterClassCB cb = new MCenterClassCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCenterClass, cb);
     * </pre>
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCenterClassCB cb) {
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
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterClass.setFoo...(value);
     * mCenterClass.setBar...(value);
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCenterClass, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCenterClass.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCenterClass The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, InsertOption<MCenterClassCB>> opLambda) {
        doInsert(mCenterClass, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClass.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClass.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCenterClass, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClass The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> opLambda) {
        doUpdate(mCenterClass, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * mCenterClass.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClass.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCenterClass, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClass The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> opLambda) {
        doUpdateNonstrict(mCenterClass, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCenterClass The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, InsertOption<MCenterClassCB>> insertOpLambda, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> updateOpLambda) {
        doInsertOrUpdate(mCenterClass, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCenterClass The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, InsertOption<MCenterClassCB>> insertOpLambda, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCenterClass, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCenterClass The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, DeleteOption<MCenterClassCB>> opLambda) {
        doDelete(mCenterClass, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCenterClass The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCenterClass mCenterClass, WritableOptionCall<MCenterClassCB, DeleteOption<MCenterClassCB>> opLambda) {
        doDeleteNonstrict(mCenterClass, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCenterClass> mCenterClassList, WritableOptionCall<MCenterClassCB, InsertOption<MCenterClassCB>> opLambda) {
        return doBatchInsert(mCenterClassList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCenterClass> mCenterClassList, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> opLambda) {
        return doBatchUpdate(mCenterClassList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCenterClass> mCenterClassList, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> opLambda) {
        return doBatchUpdateNonstrict(mCenterClassList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCenterClass> mCenterClassList, WritableOptionCall<MCenterClassCB, DeleteOption<MCenterClassCB>> opLambda) {
        return doBatchDelete(mCenterClassList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCenterClassList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCenterClass> mCenterClassList, WritableOptionCall<MCenterClassCB, DeleteOption<MCenterClassCB>> opLambda) {
        return doBatchDeleteNonstrict(mCenterClassList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCenterClass, MCenterClassCB> manyArgLambda, WritableOptionCall<MCenterClassCB, InsertOption<MCenterClassCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterClass mCenterClass = <span style="color: #70226C">new</span> MCenterClass();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterClass.setPK...(value);</span>
     * mCenterClass.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClass.setVersionNo(value);</span>
     * MCenterClassCB cb = <span style="color: #70226C">new</span> MCenterClassCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCenterClass, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClass The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCenterClass mCenterClass, MCenterClassCB cb, WritableOptionCall<MCenterClassCB, UpdateOption<MCenterClassCB>> opLambda) {
        return doQueryUpdate(mCenterClass, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCenterClass. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCenterClassCB cb, WritableOptionCall<MCenterClassCB, DeleteOption<MCenterClassCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCenterClassBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCenterClassBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterClassBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCenterClassBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterClassBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCenterClassBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCenterClassBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCenterClassBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCenterClassBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCenterClassBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCenterClassBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCenterClassBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCenterClassBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCenterClassBhv.outideSql().removeBlockComment().selectList()
     * mCenterClassBhv.outideSql().removeLineComment().selectList()
     * mCenterClassBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCenterClassBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCenterClassBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCenterClass> typeOfSelectedEntity() { return MCenterClass.class; }
    protected Class<MCenterClass> typeOfHandlingEntity() { return MCenterClass.class; }
    protected Class<MCenterClassCB> typeOfHandlingConditionBean() { return MCenterClassCB.class; }
}
