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
 * The behavior of M_BOX_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     BOX_GRP_ID
 *
 * [column]
 *     BOX_GRP_ID, CENTER_ID, BOX_GRP_CD, BOX_GRP_NM, STANDARD_BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_BOX, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP_DTL, M_PARAM
 *
 * [foreign property]
 *     mCenter, mBox, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpDtlList, mParamList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMBoxGrpBhv extends AbstractBehaviorWritable<MBoxGrp, MBoxGrpCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MBoxGrpDbm asDBMeta() { return MBoxGrpDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_BOX_GRP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MBoxGrpDbm getMyDBMeta() { return MBoxGrpDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MBoxGrpCB newConditionBean() { return new MBoxGrpCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MBoxGrp newMyEntity() { return new MBoxGrp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MBoxGrpCB newMyConditionBean() { return new MBoxGrpCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MBoxGrpCB cb) {
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
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().setFoo...(value);
     * MBoxGrp mBoxGrp = <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mBoxGrp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mBoxGrp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBoxGrp selectEntity(MBoxGrpCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MBoxGrp facadeSelectEntity(MBoxGrpCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBoxGrp> OptionalEntity<ENTITY> doSelectOptionalEntity(MBoxGrpCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().set...;
     * MBoxGrp mBoxGrp = <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mBoxGrp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBoxGrp selectEntityWithDeletedCheck(MBoxGrpCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param boxGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBoxGrp selectByPKValue(Long boxGrpId) {
        return facadeSelectByPKValue(boxGrpId);
    }

    protected MBoxGrp facadeSelectByPKValue(Long boxGrpId) {
        return doSelectByPK(boxGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBoxGrp> ENTITY doSelectByPK(Long boxGrpId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(boxGrpId), tp);
    }

    protected <ENTITY extends MBoxGrp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long boxGrpId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(boxGrpId, tp), boxGrpId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param boxGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBoxGrp selectByPKValueWithDeletedCheck(Long boxGrpId) {
        return doSelectByPKWithDeletedCheck(boxGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBoxGrp> ENTITY doSelectByPKWithDeletedCheck(Long boxGrpId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(boxGrpId), tp);
    }

    protected MBoxGrpCB xprepareCBAsPK(Long boxGrpId) {
        assertObjectNotNull("boxGrpId", boxGrpId);
        return newConditionBean().acceptPK(boxGrpId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param boxGrpCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MBoxGrp> selectByUniqueOf(Long centerId, String boxGrpCd) {
        return facadeSelectByUniqueOf(centerId, boxGrpCd);
    }

    protected OptionalEntity<MBoxGrp> facadeSelectByUniqueOf(Long centerId, String boxGrpCd) {
        return doSelectByUniqueOf(centerId, boxGrpCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBoxGrp> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String boxGrpCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, boxGrpCd), tp), centerId, boxGrpCd);
    }

    protected MBoxGrpCB xprepareCBAsUniqueOf(Long centerId, String boxGrpCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("boxGrpCd", boxGrpCd);
        return newConditionBean().acceptUniqueOf(centerId, boxGrpCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MBoxGrp&gt; <span style="color: #553000">mBoxGrpList</span> = <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MBoxGrp mBoxGrp : <span style="color: #553000">mBoxGrpList</span>) {
     *     ... = mBoxGrp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MBoxGrp> selectList(MBoxGrpCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MBoxGrp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MBoxGrp mBoxGrp : <span style="color: #553000">page</span>) {
     *     ... = mBoxGrp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MBoxGrp> selectPage(MBoxGrpCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().set...
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @param entityRowHandler The handler of entity row of MBoxGrp. (NotNull)
     */
    public void selectCursor(MBoxGrpCB cb, EntityRowHandler<MBoxGrp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MBoxGrpCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MBoxGrpCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mBoxGrpList The entity list of MBoxGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MBoxGrp> mBoxGrpList, ReferrerLoaderHandler<LoaderOfMBoxGrp> loaderLambda) {
        xassLRArg(mBoxGrpList, loaderLambda);
        loaderLambda.handle(new LoaderOfMBoxGrp().ready(mBoxGrpList, _behaviorSelector));
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
     * @param mBoxGrp The entity of MBoxGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MBoxGrp mBoxGrp, ReferrerLoaderHandler<LoaderOfMBoxGrp> loaderLambda) {
        xassLRArg(mBoxGrp, loaderLambda);
        loaderLambda.handle(new LoaderOfMBoxGrp().ready(xnewLRAryLs(mBoxGrp), _behaviorSelector));
    }

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">mBoxGrpList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBoxGrp mBoxGrp : <span style="color: #553000">mBoxGrpList</span>) {
     *     ... = mBoxGrp.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxGrpId_InScope(pkList);
     * cb.query().addOrderBy_BoxGrpId_Asc();
     * </pre>
     * @param mBoxGrpList The entity list of MBoxGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(List<MBoxGrp> mBoxGrpList, ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        xassLRArg(mBoxGrpList, refCBLambda);
        return doLoadMBoxGrpDtlList(mBoxGrpList, new LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_GRP_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">mBoxGrp</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBoxGrp</span>.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxGrpId_InScope(pkList);
     * cb.query().addOrderBy_BoxGrpId_Asc();
     * </pre>
     * @param mBoxGrp The entity of MBoxGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(MBoxGrp mBoxGrp, ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        xassLRArg(mBoxGrp, refCBLambda);
        return doLoadMBoxGrpDtlList(xnewLRLs(mBoxGrp), new LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBoxGrp The entity of MBoxGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(MBoxGrp mBoxGrp, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> loadReferrerOption) {
        xassLRArg(mBoxGrp, loadReferrerOption);
        return loadMBoxGrpDtlList(xnewLRLs(mBoxGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxGrpList The entity list of MBoxGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(List<MBoxGrp> mBoxGrpList, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> loadReferrerOption) {
        xassLRArg(mBoxGrpList, loadReferrerOption);
        if (mBoxGrpList.isEmpty()) { return (NestedReferrerListGateway<MBoxGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxGrpDtlList(mBoxGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBoxGrpDtl> doLoadMBoxGrpDtlList(List<MBoxGrp> mBoxGrpList, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> option) {
        return helpLoadReferrerInternally(mBoxGrpList, option, "mBoxGrpDtlList");
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mBoxGrpList</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBoxGrp mBoxGrp : <span style="color: #553000">mBoxGrpList</span>) {
     *     ... = mBoxGrp.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingBoxGroupId_InScope(pkList);
     * cb.query().addOrderBy_PackingBoxGroupId_Asc();
     * </pre>
     * @param mBoxGrpList The entity list of MBoxGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(List<MBoxGrp> mBoxGrpList, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mBoxGrpList, refCBLambda);
        return doLoadMParamList(mBoxGrpList, new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by PACKING_BOX_GROUP_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mBoxGrp</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBoxGrp</span>.<span style="color: #CC4747">getMParamList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingBoxGroupId_InScope(pkList);
     * cb.query().addOrderBy_PackingBoxGroupId_Asc();
     * </pre>
     * @param mBoxGrp The entity of MBoxGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MBoxGrp mBoxGrp, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mBoxGrp, refCBLambda);
        return doLoadMParamList(xnewLRLs(mBoxGrp), new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBoxGrp The entity of MBoxGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MBoxGrp mBoxGrp, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mBoxGrp, loadReferrerOption);
        return loadMParamList(xnewLRLs(mBoxGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxGrpList The entity list of MBoxGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MParam> loadMParamList(List<MBoxGrp> mBoxGrpList, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mBoxGrpList, loadReferrerOption);
        if (mBoxGrpList.isEmpty()) { return (NestedReferrerListGateway<MParam>)EMPTY_NREF_LGWAY; }
        return doLoadMParamList(mBoxGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MParam> doLoadMParamList(List<MBoxGrp> mBoxGrpList, LoadReferrerOption<MParamCB, MParam> option) {
        return helpLoadReferrerInternally(mBoxGrpList, option, "mParamList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mBoxGrpList The list of mBoxGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MBoxGrp> mBoxGrpList)
    { return helpPulloutInternally(mBoxGrpList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MBox'.
     * @param mBoxGrpList The list of mBoxGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MBox> pulloutMBox(List<MBoxGrp> mBoxGrpList)
    { return helpPulloutInternally(mBoxGrpList, "mBox"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mBoxGrpList The list of mBoxGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MBoxGrp> mBoxGrpList)
    { return helpPulloutInternally(mBoxGrpList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key boxGrpId.
     * @param mBoxGrpList The list of mBoxGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractBoxGrpIdList(List<MBoxGrp> mBoxGrpList)
    { return helpExtractListInternally(mBoxGrpList, "boxGrpId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mBoxGrp.setFoo...(value);
     * mBoxGrp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBoxGrp.set...;</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">insert</span>(mBoxGrp);
     * ... = mBoxGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mBoxGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MBoxGrp mBoxGrp) {
        doInsert(mBoxGrp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBoxGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBoxGrp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBoxGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">update</span>(mBoxGrp);
     * </pre>
     * @param mBoxGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MBoxGrp mBoxGrp) {
        doUpdate(mBoxGrp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBoxGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBoxGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mBoxGrp);
     * </pre>
     * @param mBoxGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MBoxGrp mBoxGrp) {
        doUpdateNonstrict(mBoxGrp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mBoxGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MBoxGrp mBoxGrp) {
        doInsertOrUpdate(mBoxGrp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mBoxGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MBoxGrp mBoxGrp) {
        doInsertOrUpdateNonstrict(mBoxGrp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBoxGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">delete</span>(mBoxGrp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mBoxGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MBoxGrp mBoxGrp) {
        doDelete(mBoxGrp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mBoxGrp);
     * </pre>
     * @param mBoxGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MBoxGrp mBoxGrp) {
        doDeleteNonstrict(mBoxGrp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mBoxGrp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mBoxGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MBoxGrp mBoxGrp) {
        doDeleteNonstrictIgnoreDeleted(mBoxGrp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MBoxGrp et, final DeleteOption<MBoxGrpCB> op) {
        assertObjectNotNull("mBoxGrp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     *     mBoxGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBoxGrp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mBoxGrpList.add(mBoxGrp);
     * }
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchInsert</span>(mBoxGrpList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MBoxGrp> mBoxGrpList) {
        return doBatchInsert(mBoxGrpList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     *     mBoxGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBoxGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mBoxGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mBoxGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mBoxGrpList.add(mBoxGrp);
     * }
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxGrpList);
     * </pre>
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MBoxGrp> mBoxGrpList) {
        return doBatchUpdate(mBoxGrpList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mBoxGrpBhv.<span style="color: #CC4747">batchUpdate</span>(mBoxGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MBoxGrp> mBoxGrpList, SpecifyQuery<MBoxGrpCB> colCBLambda) {
        return doBatchUpdate(mBoxGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     *     mBoxGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBoxGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mBoxGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mBoxGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mBoxGrpList.add(mBoxGrp);
     * }
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxGrpList);
     * </pre>
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MBoxGrp> mBoxGrpList) {
        return doBatchUpdateNonstrict(mBoxGrpList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mBoxGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mBoxGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MBoxGrp> mBoxGrpList, SpecifyQuery<MBoxGrpCB> colCBLambda) {
        return doBatchUpdateNonstrict(mBoxGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MBoxGrp> mBoxGrpList) {
        return doBatchDelete(mBoxGrpList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MBoxGrp> mBoxGrpList) {
        return doBatchDeleteNonstrict(mBoxGrpList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MBoxGrp, MBoxGrpCB&gt;() {
     *     public ConditionBean setup(MBoxGrp entity, MBoxGrpCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MBoxGrp, MBoxGrpCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setPK...(value);</span>
     * mBoxGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBoxGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mBoxGrp, cb);
     * </pre>
     * @param mBoxGrp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MBoxGrp mBoxGrp, MBoxGrpCB cb) {
        return doQueryUpdate(mBoxGrp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MBoxGrpCB cb = new MBoxGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">queryDelete</span>(mBoxGrp, cb);
     * </pre>
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MBoxGrpCB cb) {
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
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mBoxGrp.setFoo...(value);
     * mBoxGrp.setBar...(value);
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mBoxGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mBoxGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mBoxGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, InsertOption<MBoxGrpCB>> opLambda) {
        doInsert(mBoxGrp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBoxGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBoxGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mBoxGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mBoxGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> opLambda) {
        doUpdate(mBoxGrp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * mBoxGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBoxGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mBoxGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mBoxGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> opLambda) {
        doUpdateNonstrict(mBoxGrp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mBoxGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, InsertOption<MBoxGrpCB>> insertOpLambda, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> updateOpLambda) {
        doInsertOrUpdate(mBoxGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mBoxGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, InsertOption<MBoxGrpCB>> insertOpLambda, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mBoxGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mBoxGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, DeleteOption<MBoxGrpCB>> opLambda) {
        doDelete(mBoxGrp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mBoxGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MBoxGrp mBoxGrp, WritableOptionCall<MBoxGrpCB, DeleteOption<MBoxGrpCB>> opLambda) {
        doDeleteNonstrict(mBoxGrp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MBoxGrp> mBoxGrpList, WritableOptionCall<MBoxGrpCB, InsertOption<MBoxGrpCB>> opLambda) {
        return doBatchInsert(mBoxGrpList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MBoxGrp> mBoxGrpList, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> opLambda) {
        return doBatchUpdate(mBoxGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MBoxGrp> mBoxGrpList, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> opLambda) {
        return doBatchUpdateNonstrict(mBoxGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MBoxGrp> mBoxGrpList, WritableOptionCall<MBoxGrpCB, DeleteOption<MBoxGrpCB>> opLambda) {
        return doBatchDelete(mBoxGrpList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mBoxGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MBoxGrp> mBoxGrpList, WritableOptionCall<MBoxGrpCB, DeleteOption<MBoxGrpCB>> opLambda) {
        return doBatchDeleteNonstrict(mBoxGrpList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MBoxGrp, MBoxGrpCB> manyArgLambda, WritableOptionCall<MBoxGrpCB, InsertOption<MBoxGrpCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MBoxGrp mBoxGrp = <span style="color: #70226C">new</span> MBoxGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setPK...(value);</span>
     * mBoxGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBoxGrp.setVersionNo(value);</span>
     * MBoxGrpCB cb = <span style="color: #70226C">new</span> MBoxGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxGrpBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mBoxGrp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mBoxGrp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MBoxGrp mBoxGrp, MBoxGrpCB cb, WritableOptionCall<MBoxGrpCB, UpdateOption<MBoxGrpCB>> opLambda) {
        return doQueryUpdate(mBoxGrp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MBoxGrp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MBoxGrpCB cb, WritableOptionCall<MBoxGrpCB, DeleteOption<MBoxGrpCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mBoxGrpBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mBoxGrpBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mBoxGrpBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mBoxGrpBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mBoxGrpBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mBoxGrpBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mBoxGrpBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mBoxGrpBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mBoxGrpBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mBoxGrpBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mBoxGrpBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mBoxGrpBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mBoxGrpBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mBoxGrpBhv.outideSql().removeBlockComment().selectList()
     * mBoxGrpBhv.outideSql().removeLineComment().selectList()
     * mBoxGrpBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MBoxGrpBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MBoxGrpBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MBoxGrp> typeOfSelectedEntity() { return MBoxGrp.class; }
    protected Class<MBoxGrp> typeOfHandlingEntity() { return MBoxGrp.class; }
    protected Class<MBoxGrpCB> typeOfHandlingConditionBean() { return MBoxGrpCB.class; }
}
