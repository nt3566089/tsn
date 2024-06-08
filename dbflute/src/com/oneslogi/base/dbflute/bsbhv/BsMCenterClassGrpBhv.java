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
 * The behavior of M_CENTER_CLASS_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_CLASS_GRP_ID
 *
 * [column]
 *     CENTER_CLASS_GRP_ID, CLASS_GRP_CD, CLASS_GRP_COMMENT, CENTER_CLASS_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER_CLASS
 *
 * [referrer table]
 *     M_CENTER_CLASS_GRP_DTL
 *
 * [foreign property]
 *     mCenterClass
 *
 * [referrer property]
 *     mCenterClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterClassGrpBhv extends AbstractBehaviorWritable<MCenterClassGrp, MCenterClassGrpCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCenterClassGrpDbm asDBMeta() { return MCenterClassGrpDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CENTER_CLASS_GRP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCenterClassGrpDbm getMyDBMeta() { return MCenterClassGrpDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCenterClassGrpCB newConditionBean() { return new MCenterClassGrpCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCenterClassGrp newMyEntity() { return new MCenterClassGrp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCenterClassGrpCB newMyConditionBean() { return new MCenterClassGrpCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCenterClassGrpCB cb) {
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
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * MCenterClassGrp mCenterClassGrp = <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCenterClassGrp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCenterClassGrp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClassGrp selectEntity(MCenterClassGrpCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCenterClassGrp facadeSelectEntity(MCenterClassGrpCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClassGrp> OptionalEntity<ENTITY> doSelectOptionalEntity(MCenterClassGrpCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().set...;
     * MCenterClassGrp mCenterClassGrp = <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCenterClassGrp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClassGrp selectEntityWithDeletedCheck(MCenterClassGrpCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerClassGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClassGrp selectByPKValue(Long centerClassGrpId) {
        return facadeSelectByPKValue(centerClassGrpId);
    }

    protected MCenterClassGrp facadeSelectByPKValue(Long centerClassGrpId) {
        return doSelectByPK(centerClassGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClassGrp> ENTITY doSelectByPK(Long centerClassGrpId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerClassGrpId), tp);
    }

    protected <ENTITY extends MCenterClassGrp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerClassGrpId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerClassGrpId, tp), centerClassGrpId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerClassGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenterClassGrp selectByPKValueWithDeletedCheck(Long centerClassGrpId) {
        return doSelectByPKWithDeletedCheck(centerClassGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClassGrp> ENTITY doSelectByPKWithDeletedCheck(Long centerClassGrpId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerClassGrpId), tp);
    }

    protected MCenterClassGrpCB xprepareCBAsPK(Long centerClassGrpId) {
        assertObjectNotNull("centerClassGrpId", centerClassGrpId);
        return newConditionBean().acceptPK(centerClassGrpId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerClassId : UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS. (NotNull)
     * @param classGrpCd : +UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCenterClassGrp> selectByUniqueOf(Long centerClassId, String classGrpCd) {
        return facadeSelectByUniqueOf(centerClassId, classGrpCd);
    }

    protected OptionalEntity<MCenterClassGrp> facadeSelectByUniqueOf(Long centerClassId, String classGrpCd) {
        return doSelectByUniqueOf(centerClassId, classGrpCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenterClassGrp> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerClassId, String classGrpCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerClassId, classGrpCd), tp), centerClassId, classGrpCd);
    }

    protected MCenterClassGrpCB xprepareCBAsUniqueOf(Long centerClassId, String classGrpCd) {
        assertObjectNotNull("centerClassId", centerClassId);assertObjectNotNull("classGrpCd", classGrpCd);
        return newConditionBean().acceptUniqueOf(centerClassId, classGrpCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCenterClassGrp&gt; <span style="color: #553000">mCenterClassGrpList</span> = <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCenterClassGrp mCenterClassGrp : <span style="color: #553000">mCenterClassGrpList</span>) {
     *     ... = mCenterClassGrp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCenterClassGrp> selectList(MCenterClassGrpCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCenterClassGrp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCenterClassGrp mCenterClassGrp : <span style="color: #553000">page</span>) {
     *     ... = mCenterClassGrp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCenterClassGrp> selectPage(MCenterClassGrpCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @param entityRowHandler The handler of entity row of MCenterClassGrp. (NotNull)
     */
    public void selectCursor(MCenterClassGrpCB cb, EntityRowHandler<MCenterClassGrp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterClassGrpCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterClassGrpCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCenterClassGrpList The entity list of MCenterClassGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCenterClassGrp> mCenterClassGrpList, ReferrerLoaderHandler<LoaderOfMCenterClassGrp> loaderLambda) {
        xassLRArg(mCenterClassGrpList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterClassGrp().ready(mCenterClassGrpList, _behaviorSelector));
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
     * @param mCenterClassGrp The entity of MCenterClassGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCenterClassGrp mCenterClassGrp, ReferrerLoaderHandler<LoaderOfMCenterClassGrp> loaderLambda) {
        xassLRArg(mCenterClassGrp, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenterClassGrp().ready(xnewLRAryLs(mCenterClassGrp), _behaviorSelector));
    }

    /**
     * Load referrer of MCenterClassGrpDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_GRP_ID, named 'MCenterClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">loadMCenterClassGrpDtlList</span>(<span style="color: #553000">mCenterClassGrpList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenterClassGrp mCenterClassGrp : <span style="color: #553000">mCenterClassGrpList</span>) {
     *     ... = mCenterClassGrp.<span style="color: #CC4747">getMCenterClassGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassGrpId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassGrpId_Asc();
     * </pre>
     * @param mCenterClassGrpList The entity list of MCenterClassGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrpDtl> loadMCenterClassGrpDtlList(List<MCenterClassGrp> mCenterClassGrpList, ConditionBeanSetupper<MCenterClassGrpDtlCB> refCBLambda) {
        xassLRArg(mCenterClassGrpList, refCBLambda);
        return doLoadMCenterClassGrpDtlList(mCenterClassGrpList, new LoadReferrerOption<MCenterClassGrpDtlCB, MCenterClassGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassGrpDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_GRP_ID, named 'MCenterClassGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">loadMCenterClassGrpDtlList</span>(<span style="color: #553000">mCenterClassGrp</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenterClassGrp</span>.<span style="color: #CC4747">getMCenterClassGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterClassGrpId_InScope(pkList);
     * cb.query().addOrderBy_CenterClassGrpId_Asc();
     * </pre>
     * @param mCenterClassGrp The entity of MCenterClassGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrpDtl> loadMCenterClassGrpDtlList(MCenterClassGrp mCenterClassGrp, ConditionBeanSetupper<MCenterClassGrpDtlCB> refCBLambda) {
        xassLRArg(mCenterClassGrp, refCBLambda);
        return doLoadMCenterClassGrpDtlList(xnewLRLs(mCenterClassGrp), new LoadReferrerOption<MCenterClassGrpDtlCB, MCenterClassGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenterClassGrp The entity of MCenterClassGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassGrpDtl> loadMCenterClassGrpDtlList(MCenterClassGrp mCenterClassGrp, LoadReferrerOption<MCenterClassGrpDtlCB, MCenterClassGrpDtl> loadReferrerOption) {
        xassLRArg(mCenterClassGrp, loadReferrerOption);
        return loadMCenterClassGrpDtlList(xnewLRLs(mCenterClassGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterClassGrpList The entity list of MCenterClassGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClassGrpDtl> loadMCenterClassGrpDtlList(List<MCenterClassGrp> mCenterClassGrpList, LoadReferrerOption<MCenterClassGrpDtlCB, MCenterClassGrpDtl> loadReferrerOption) {
        xassLRArg(mCenterClassGrpList, loadReferrerOption);
        if (mCenterClassGrpList.isEmpty()) { return (NestedReferrerListGateway<MCenterClassGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassGrpDtlList(mCenterClassGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClassGrpDtl> doLoadMCenterClassGrpDtlList(List<MCenterClassGrp> mCenterClassGrpList, LoadReferrerOption<MCenterClassGrpDtlCB, MCenterClassGrpDtl> option) {
        return helpLoadReferrerInternally(mCenterClassGrpList, option, "mCenterClassGrpDtlList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenterClass'.
     * @param mCenterClassGrpList The list of mCenterClassGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenterClass> pulloutMCenterClass(List<MCenterClassGrp> mCenterClassGrpList)
    { return helpPulloutInternally(mCenterClassGrpList, "mCenterClass"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerClassGrpId.
     * @param mCenterClassGrpList The list of mCenterClassGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterClassGrpIdList(List<MCenterClassGrp> mCenterClassGrpList)
    { return helpExtractListInternally(mCenterClassGrpList, "centerClassGrpId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterClassGrp.setFoo...(value);
     * mCenterClassGrp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.set...;</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">insert</span>(mCenterClassGrp);
     * ... = mCenterClassGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCenterClassGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCenterClassGrp mCenterClassGrp) {
        doInsert(mCenterClassGrp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClassGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClassGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">update</span>(mCenterClassGrp);
     * </pre>
     * @param mCenterClassGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCenterClassGrp mCenterClassGrp) {
        doUpdate(mCenterClassGrp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClassGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCenterClassGrp);
     * </pre>
     * @param mCenterClassGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCenterClassGrp mCenterClassGrp) {
        doUpdateNonstrict(mCenterClassGrp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterClassGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCenterClassGrp mCenterClassGrp) {
        doInsertOrUpdate(mCenterClassGrp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenterClassGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCenterClassGrp mCenterClassGrp) {
        doInsertOrUpdateNonstrict(mCenterClassGrp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClassGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">delete</span>(mCenterClassGrp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCenterClassGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCenterClassGrp mCenterClassGrp) {
        doDelete(mCenterClassGrp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCenterClassGrp);
     * </pre>
     * @param mCenterClassGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCenterClassGrp mCenterClassGrp) {
        doDeleteNonstrict(mCenterClassGrp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCenterClassGrp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCenterClassGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCenterClassGrp mCenterClassGrp) {
        doDeleteNonstrictIgnoreDeleted(mCenterClassGrp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCenterClassGrp et, final DeleteOption<MCenterClassGrpCB> op) {
        assertObjectNotNull("mCenterClassGrp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     *     mCenterClassGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClassGrp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCenterClassGrpList.add(mCenterClassGrp);
     * }
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCenterClassGrpList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCenterClassGrp> mCenterClassGrpList) {
        return doBatchInsert(mCenterClassGrpList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     *     mCenterClassGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClassGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterClassGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterClassGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterClassGrpList.add(mCenterClassGrp);
     * }
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassGrpList);
     * </pre>
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterClassGrp> mCenterClassGrpList) {
        return doBatchUpdate(mCenterClassGrpList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCenterClassGrpBhv.<span style="color: #CC4747">batchUpdate</span>(mCenterClassGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenterClassGrp> mCenterClassGrpList, SpecifyQuery<MCenterClassGrpCB> colCBLambda) {
        return doBatchUpdate(mCenterClassGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     *     mCenterClassGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenterClassGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenterClassGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenterClassGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterClassGrpList.add(mCenterClassGrp);
     * }
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterClassGrpList);
     * </pre>
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterClassGrp> mCenterClassGrpList) {
        return doBatchUpdateNonstrict(mCenterClassGrpList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterClassGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterClassGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenterClassGrp> mCenterClassGrpList, SpecifyQuery<MCenterClassGrpCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCenterClassGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCenterClassGrp> mCenterClassGrpList) {
        return doBatchDelete(mCenterClassGrpList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCenterClassGrp> mCenterClassGrpList) {
        return doBatchDeleteNonstrict(mCenterClassGrpList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCenterClassGrp, MCenterClassGrpCB&gt;() {
     *     public ConditionBean setup(MCenterClassGrp entity, MCenterClassGrpCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCenterClassGrp, MCenterClassGrpCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setPK...(value);</span>
     * mCenterClassGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCenterClassGrp, cb);
     * </pre>
     * @param mCenterClassGrp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCenterClassGrp mCenterClassGrp, MCenterClassGrpCB cb) {
        return doQueryUpdate(mCenterClassGrp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCenterClassGrpCB cb = new MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCenterClassGrp, cb);
     * </pre>
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCenterClassGrpCB cb) {
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
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenterClassGrp.setFoo...(value);
     * mCenterClassGrp.setBar...(value);
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCenterClassGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCenterClassGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCenterClassGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, InsertOption<MCenterClassGrpCB>> opLambda) {
        doInsert(mCenterClassGrp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClassGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenterClassGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCenterClassGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClassGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> opLambda) {
        doUpdate(mCenterClassGrp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * mCenterClassGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenterClassGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCenterClassGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClassGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> opLambda) {
        doUpdateNonstrict(mCenterClassGrp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCenterClassGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, InsertOption<MCenterClassGrpCB>> insertOpLambda, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> updateOpLambda) {
        doInsertOrUpdate(mCenterClassGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCenterClassGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, InsertOption<MCenterClassGrpCB>> insertOpLambda, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCenterClassGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCenterClassGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, DeleteOption<MCenterClassGrpCB>> opLambda) {
        doDelete(mCenterClassGrp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCenterClassGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCenterClassGrp mCenterClassGrp, WritableOptionCall<MCenterClassGrpCB, DeleteOption<MCenterClassGrpCB>> opLambda) {
        doDeleteNonstrict(mCenterClassGrp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCenterClassGrp> mCenterClassGrpList, WritableOptionCall<MCenterClassGrpCB, InsertOption<MCenterClassGrpCB>> opLambda) {
        return doBatchInsert(mCenterClassGrpList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCenterClassGrp> mCenterClassGrpList, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> opLambda) {
        return doBatchUpdate(mCenterClassGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCenterClassGrp> mCenterClassGrpList, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> opLambda) {
        return doBatchUpdateNonstrict(mCenterClassGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCenterClassGrp> mCenterClassGrpList, WritableOptionCall<MCenterClassGrpCB, DeleteOption<MCenterClassGrpCB>> opLambda) {
        return doBatchDelete(mCenterClassGrpList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCenterClassGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCenterClassGrp> mCenterClassGrpList, WritableOptionCall<MCenterClassGrpCB, DeleteOption<MCenterClassGrpCB>> opLambda) {
        return doBatchDeleteNonstrict(mCenterClassGrpList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCenterClassGrp, MCenterClassGrpCB> manyArgLambda, WritableOptionCall<MCenterClassGrpCB, InsertOption<MCenterClassGrpCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenterClassGrp mCenterClassGrp = <span style="color: #70226C">new</span> MCenterClassGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setPK...(value);</span>
     * mCenterClassGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenterClassGrp.setVersionNo(value);</span>
     * MCenterClassGrpCB cb = <span style="color: #70226C">new</span> MCenterClassGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterClassGrpBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCenterClassGrp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenterClassGrp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCenterClassGrp mCenterClassGrp, MCenterClassGrpCB cb, WritableOptionCall<MCenterClassGrpCB, UpdateOption<MCenterClassGrpCB>> opLambda) {
        return doQueryUpdate(mCenterClassGrp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCenterClassGrp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCenterClassGrpCB cb, WritableOptionCall<MCenterClassGrpCB, DeleteOption<MCenterClassGrpCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCenterClassGrpBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCenterClassGrpBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterClassGrpBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCenterClassGrpBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterClassGrpBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCenterClassGrpBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCenterClassGrpBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCenterClassGrpBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCenterClassGrpBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCenterClassGrpBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCenterClassGrpBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCenterClassGrpBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCenterClassGrpBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCenterClassGrpBhv.outideSql().removeBlockComment().selectList()
     * mCenterClassGrpBhv.outideSql().removeLineComment().selectList()
     * mCenterClassGrpBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCenterClassGrpBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCenterClassGrpBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCenterClassGrp> typeOfSelectedEntity() { return MCenterClassGrp.class; }
    protected Class<MCenterClassGrp> typeOfHandlingEntity() { return MCenterClassGrp.class; }
    protected Class<MCenterClassGrpCB> typeOfHandlingConditionBean() { return MCenterClassGrpCB.class; }
}
