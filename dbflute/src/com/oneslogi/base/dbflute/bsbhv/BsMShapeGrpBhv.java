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
 * The behavior of M_SHAPE_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_GRP_ID
 *
 * [column]
 *     SHAPE_GRP_ID, CLIENT_ID, SHAPE_GRP_CD, SHAPE_GRP_NAME, DECIMAL_EXIST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, B_CLASS_DTL(ByDecimalExistFlg)
 *
 * [referrer table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP_DTL
 *
 * [foreign property]
 *     mClient, bClassDtlByDecimalExistFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mClientList, mProductList, mShapeGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShapeGrpBhv extends AbstractBehaviorWritable<MShapeGrp, MShapeGrpCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MShapeGrpDbm asDBMeta() { return MShapeGrpDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_SHAPE_GRP"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MShapeGrpDbm getMyDBMeta() { return MShapeGrpDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MShapeGrpCB newConditionBean() { return new MShapeGrpCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MShapeGrp newMyEntity() { return new MShapeGrp(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MShapeGrpCB newMyConditionBean() { return new MShapeGrpCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MShapeGrpCB cb) {
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
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().setFoo...(value);
     * MShapeGrp mShapeGrp = <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mShapeGrp != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mShapeGrp.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrp selectEntity(MShapeGrpCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MShapeGrp facadeSelectEntity(MShapeGrpCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrp> OptionalEntity<ENTITY> doSelectOptionalEntity(MShapeGrpCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().set...;
     * MShapeGrp mShapeGrp = <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mShapeGrp.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrp selectEntityWithDeletedCheck(MShapeGrpCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shapeGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrp selectByPKValue(Long shapeGrpId) {
        return facadeSelectByPKValue(shapeGrpId);
    }

    protected MShapeGrp facadeSelectByPKValue(Long shapeGrpId) {
        return doSelectByPK(shapeGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrp> ENTITY doSelectByPK(Long shapeGrpId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shapeGrpId), tp);
    }

    protected <ENTITY extends MShapeGrp> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shapeGrpId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shapeGrpId, tp), shapeGrpId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shapeGrpId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrp selectByPKValueWithDeletedCheck(Long shapeGrpId) {
        return doSelectByPKWithDeletedCheck(shapeGrpId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrp> ENTITY doSelectByPKWithDeletedCheck(Long shapeGrpId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shapeGrpId), tp);
    }

    protected MShapeGrpCB xprepareCBAsPK(Long shapeGrpId) {
        assertObjectNotNull("shapeGrpId", shapeGrpId);
        return newConditionBean().acceptPK(shapeGrpId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MShapeGrp&gt; <span style="color: #553000">mShapeGrpList</span> = <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MShapeGrp> selectList(MShapeGrpCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MShapeGrp&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MShapeGrp mShapeGrp : <span style="color: #553000">page</span>) {
     *     ... = mShapeGrp.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MShapeGrp> selectPage(MShapeGrpCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().set...
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @param entityRowHandler The handler of entity row of MShapeGrp. (NotNull)
     */
    public void selectCursor(MShapeGrpCB cb, EntityRowHandler<MShapeGrp> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeGrpCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeGrpCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MShapeGrp> mShapeGrpList, ReferrerLoaderHandler<LoaderOfMShapeGrp> loaderLambda) {
        xassLRArg(mShapeGrpList, loaderLambda);
        loaderLambda.handle(new LoaderOfMShapeGrp().ready(mShapeGrpList, _behaviorSelector));
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
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MShapeGrp mShapeGrp, ReferrerLoaderHandler<LoaderOfMShapeGrp> loaderLambda) {
        xassLRArg(mShapeGrp, loaderLambda);
        loaderLambda.handle(new LoaderOfMShapeGrp().ready(xnewLRAryLs(mShapeGrp), _behaviorSelector));
    }

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(List<MShapeGrp> mShapeGrpList, ConditionBeanSetupper<MClientCB> refCBLambda) {
        xassLRArg(mShapeGrpList, refCBLambda);
        return doLoadMClientList(mShapeGrpList, new LoadReferrerOption<MClientCB, MClient>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">mShapeGrp</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShapeGrp</span>.<span style="color: #CC4747">getMClientList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(MShapeGrp mShapeGrp, ConditionBeanSetupper<MClientCB> refCBLambda) {
        xassLRArg(mShapeGrp, refCBLambda);
        return doLoadMClientList(xnewLRLs(mShapeGrp), new LoadReferrerOption<MClientCB, MClient>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClient> loadMClientList(MShapeGrp mShapeGrp, LoadReferrerOption<MClientCB, MClient> loadReferrerOption) {
        xassLRArg(mShapeGrp, loadReferrerOption);
        return loadMClientList(xnewLRLs(mShapeGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClient> loadMClientList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MClientCB, MClient> loadReferrerOption) {
        xassLRArg(mShapeGrpList, loadReferrerOption);
        if (mShapeGrpList.isEmpty()) { return (NestedReferrerListGateway<MClient>)EMPTY_NREF_LGWAY; }
        return doLoadMClientList(mShapeGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClient> doLoadMClientList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MClientCB, MClient> option) {
        return helpLoadReferrerInternally(mShapeGrpList, option, "mClientList");
    }

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(List<MShapeGrp> mShapeGrpList, ConditionBeanSetupper<MProductCB> refCBLambda) {
        xassLRArg(mShapeGrpList, refCBLambda);
        return doLoadMProductList(mShapeGrpList, new LoadReferrerOption<MProductCB, MProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">mShapeGrp</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShapeGrp</span>.<span style="color: #CC4747">getMProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(MShapeGrp mShapeGrp, ConditionBeanSetupper<MProductCB> refCBLambda) {
        xassLRArg(mShapeGrp, refCBLambda);
        return doLoadMProductList(xnewLRLs(mShapeGrp), new LoadReferrerOption<MProductCB, MProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(MShapeGrp mShapeGrp, LoadReferrerOption<MProductCB, MProduct> loadReferrerOption) {
        xassLRArg(mShapeGrp, loadReferrerOption);
        return loadMProductList(xnewLRLs(mShapeGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProduct> loadMProductList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MProductCB, MProduct> loadReferrerOption) {
        xassLRArg(mShapeGrpList, loadReferrerOption);
        if (mShapeGrpList.isEmpty()) { return (NestedReferrerListGateway<MProduct>)EMPTY_NREF_LGWAY; }
        return doLoadMProductList(mShapeGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProduct> doLoadMProductList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MProductCB, MProduct> option) {
        return helpLoadReferrerInternally(mShapeGrpList, option, "mProductList");
    }

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">mShapeGrpList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShapeGrp mShapeGrp : <span style="color: #553000">mShapeGrpList</span>) {
     *     ... = mShapeGrp.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(List<MShapeGrp> mShapeGrpList, ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        xassLRArg(mShapeGrpList, refCBLambda);
        return doLoadMShapeGrpDtlList(mShapeGrpList, new LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MShapeGrpDtlList by the set-upper of referrer. <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">loadMShapeGrpDtlList</span>(<span style="color: #553000">mShapeGrp</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShapeGrp</span>.<span style="color: #CC4747">getMShapeGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpId_Asc();
     * </pre>
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(MShapeGrp mShapeGrp, ConditionBeanSetupper<MShapeGrpDtlCB> refCBLambda) {
        xassLRArg(mShapeGrp, refCBLambda);
        return doLoadMShapeGrpDtlList(xnewLRLs(mShapeGrp), new LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShapeGrp The entity of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(MShapeGrp mShapeGrp, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> loadReferrerOption) {
        xassLRArg(mShapeGrp, loadReferrerOption);
        return loadMShapeGrpDtlList(xnewLRLs(mShapeGrp), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeGrpList The entity list of MShapeGrp. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MShapeGrpDtl> loadMShapeGrpDtlList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> loadReferrerOption) {
        xassLRArg(mShapeGrpList, loadReferrerOption);
        if (mShapeGrpList.isEmpty()) { return (NestedReferrerListGateway<MShapeGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMShapeGrpDtlList(mShapeGrpList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MShapeGrpDtl> doLoadMShapeGrpDtlList(List<MShapeGrp> mShapeGrpList, LoadReferrerOption<MShapeGrpDtlCB, MShapeGrpDtl> option) {
        return helpLoadReferrerInternally(mShapeGrpList, option, "mShapeGrpDtlList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClient'.
     * @param mShapeGrpList The list of mShapeGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<MShapeGrp> mShapeGrpList)
    { return helpPulloutInternally(mShapeGrpList, "mClient"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeGrpList The list of mShapeGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDecimalExistFlg(List<MShapeGrp> mShapeGrpList)
    { return helpPulloutInternally(mShapeGrpList, "bClassDtlByDecimalExistFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeGrpList The list of mShapeGrp. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MShapeGrp> mShapeGrpList)
    { return helpPulloutInternally(mShapeGrpList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shapeGrpId.
     * @param mShapeGrpList The list of mShapeGrp. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShapeGrpIdList(List<MShapeGrp> mShapeGrpList)
    { return helpExtractListInternally(mShapeGrpList, "shapeGrpId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShapeGrp.setFoo...(value);
     * mShapeGrp.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrp.set...;</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">insert</span>(mShapeGrp);
     * ... = mShapeGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mShapeGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MShapeGrp mShapeGrp) {
        doInsert(mShapeGrp, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrp.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">update</span>(mShapeGrp);
     * </pre>
     * @param mShapeGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MShapeGrp mShapeGrp) {
        doUpdate(mShapeGrp, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mShapeGrp);
     * </pre>
     * @param mShapeGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MShapeGrp mShapeGrp) {
        doUpdateNonstrict(mShapeGrp, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShapeGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MShapeGrp mShapeGrp) {
        doInsertOrUpdate(mShapeGrp, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShapeGrp The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MShapeGrp mShapeGrp) {
        doInsertOrUpdateNonstrict(mShapeGrp, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">delete</span>(mShapeGrp);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mShapeGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MShapeGrp mShapeGrp) {
        doDelete(mShapeGrp, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mShapeGrp);
     * </pre>
     * @param mShapeGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MShapeGrp mShapeGrp) {
        doDeleteNonstrict(mShapeGrp, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mShapeGrp);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mShapeGrp The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MShapeGrp mShapeGrp) {
        doDeleteNonstrictIgnoreDeleted(mShapeGrp, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MShapeGrp et, final DeleteOption<MShapeGrpCB> op) {
        assertObjectNotNull("mShapeGrp", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     *     mShapeGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrp.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mShapeGrpList.add(mShapeGrp);
     * }
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchInsert</span>(mShapeGrpList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MShapeGrp> mShapeGrpList) {
        return doBatchInsert(mShapeGrpList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     *     mShapeGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShapeGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShapeGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeGrpList.add(mShapeGrp);
     * }
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpList);
     * </pre>
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShapeGrp> mShapeGrpList) {
        return doBatchUpdate(mShapeGrpList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mShapeGrpBhv.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShapeGrp> mShapeGrpList, SpecifyQuery<MShapeGrpCB> colCBLambda) {
        return doBatchUpdate(mShapeGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     *     mShapeGrp.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrp.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShapeGrp.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShapeGrp.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeGrpList.add(mShapeGrp);
     * }
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpList);
     * </pre>
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShapeGrp> mShapeGrpList) {
        return doBatchUpdateNonstrict(mShapeGrpList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeGrpList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShapeGrp> mShapeGrpList, SpecifyQuery<MShapeGrpCB> colCBLambda) {
        return doBatchUpdateNonstrict(mShapeGrpList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MShapeGrp> mShapeGrpList) {
        return doBatchDelete(mShapeGrpList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MShapeGrp> mShapeGrpList) {
        return doBatchDeleteNonstrict(mShapeGrpList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MShapeGrp, MShapeGrpCB&gt;() {
     *     public ConditionBean setup(MShapeGrp entity, MShapeGrpCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MShapeGrp, MShapeGrpCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setPK...(value);</span>
     * mShapeGrp.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrp.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mShapeGrp, cb);
     * </pre>
     * @param mShapeGrp The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MShapeGrp mShapeGrp, MShapeGrpCB cb) {
        return doQueryUpdate(mShapeGrp, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MShapeGrpCB cb = new MShapeGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">queryDelete</span>(mShapeGrp, cb);
     * </pre>
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MShapeGrpCB cb) {
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
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShapeGrp.setFoo...(value);
     * mShapeGrp.setBar...(value);
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mShapeGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mShapeGrp.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mShapeGrp The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, InsertOption<MShapeGrpCB>> opLambda) {
        doInsert(mShapeGrp, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrp.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mShapeGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrp The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> opLambda) {
        doUpdate(mShapeGrp, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * mShapeGrp.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mShapeGrp, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrp The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> opLambda) {
        doUpdateNonstrict(mShapeGrp, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mShapeGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, InsertOption<MShapeGrpCB>> insertOpLambda, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> updateOpLambda) {
        doInsertOrUpdate(mShapeGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mShapeGrp The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, InsertOption<MShapeGrpCB>> insertOpLambda, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mShapeGrp, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mShapeGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, DeleteOption<MShapeGrpCB>> opLambda) {
        doDelete(mShapeGrp, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mShapeGrp The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MShapeGrp mShapeGrp, WritableOptionCall<MShapeGrpCB, DeleteOption<MShapeGrpCB>> opLambda) {
        doDeleteNonstrict(mShapeGrp, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MShapeGrp> mShapeGrpList, WritableOptionCall<MShapeGrpCB, InsertOption<MShapeGrpCB>> opLambda) {
        return doBatchInsert(mShapeGrpList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MShapeGrp> mShapeGrpList, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> opLambda) {
        return doBatchUpdate(mShapeGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MShapeGrp> mShapeGrpList, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> opLambda) {
        return doBatchUpdateNonstrict(mShapeGrpList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MShapeGrp> mShapeGrpList, WritableOptionCall<MShapeGrpCB, DeleteOption<MShapeGrpCB>> opLambda) {
        return doBatchDelete(mShapeGrpList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mShapeGrpList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MShapeGrp> mShapeGrpList, WritableOptionCall<MShapeGrpCB, DeleteOption<MShapeGrpCB>> opLambda) {
        return doBatchDeleteNonstrict(mShapeGrpList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MShapeGrp, MShapeGrpCB> manyArgLambda, WritableOptionCall<MShapeGrpCB, InsertOption<MShapeGrpCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShapeGrp mShapeGrp = <span style="color: #70226C">new</span> MShapeGrp();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setPK...(value);</span>
     * mShapeGrp.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrp.setVersionNo(value);</span>
     * MShapeGrpCB cb = <span style="color: #70226C">new</span> MShapeGrpCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mShapeGrp, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrp The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MShapeGrp mShapeGrp, MShapeGrpCB cb, WritableOptionCall<MShapeGrpCB, UpdateOption<MShapeGrpCB>> opLambda) {
        return doQueryUpdate(mShapeGrp, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MShapeGrp. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MShapeGrpCB cb, WritableOptionCall<MShapeGrpCB, DeleteOption<MShapeGrpCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mShapeGrpBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mShapeGrpBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeGrpBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mShapeGrpBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeGrpBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mShapeGrpBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mShapeGrpBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mShapeGrpBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mShapeGrpBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mShapeGrpBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mShapeGrpBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mShapeGrpBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mShapeGrpBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mShapeGrpBhv.outideSql().removeBlockComment().selectList()
     * mShapeGrpBhv.outideSql().removeLineComment().selectList()
     * mShapeGrpBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MShapeGrpBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MShapeGrpBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MShapeGrp> typeOfSelectedEntity() { return MShapeGrp.class; }
    protected Class<MShapeGrp> typeOfHandlingEntity() { return MShapeGrp.class; }
    protected Class<MShapeGrpCB> typeOfHandlingConditionBean() { return MShapeGrpCB.class; }
}
