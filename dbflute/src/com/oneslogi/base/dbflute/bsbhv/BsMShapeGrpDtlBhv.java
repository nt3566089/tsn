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
 * The behavior of M_SHAPE_GRP_DTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHAPE_GRP_DTL_ID
 *
 * [column]
 *     SHAPE_GRP_DTL_ID, SHAPE_GRP_ID, SHAPE_ID, GTIN14_SYMBOL, CASE_PICK_FLG, SHAPE_SORT, EM_REPLENISH_SHAPE_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_SHAPE, M_SHAPE_GRP, B_CLASS_DTL(ByCasePickFlg)
 *
 * [referrer table]
 *     M_PRODUCT_SHAPE
 *
 * [foreign property]
 *     mShape, mShapeGrp, bClassDtlByCasePickFlg, bClassDtlByEmReplenishShapeFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mProductShapeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShapeGrpDtlBhv extends AbstractBehaviorWritable<MShapeGrpDtl, MShapeGrpDtlCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MShapeGrpDtlDbm asDBMeta() { return MShapeGrpDtlDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_SHAPE_GRP_DTL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MShapeGrpDtlDbm getMyDBMeta() { return MShapeGrpDtlDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MShapeGrpDtlCB newConditionBean() { return new MShapeGrpDtlCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MShapeGrpDtl newMyEntity() { return new MShapeGrpDtl(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MShapeGrpDtlCB newMyConditionBean() { return new MShapeGrpDtlCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MShapeGrpDtlCB cb) {
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
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mShapeGrpDtl != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mShapeGrpDtl.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrpDtl selectEntity(MShapeGrpDtlCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MShapeGrpDtl facadeSelectEntity(MShapeGrpDtlCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrpDtl> OptionalEntity<ENTITY> doSelectOptionalEntity(MShapeGrpDtlCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().set...;
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mShapeGrpDtl.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrpDtl selectEntityWithDeletedCheck(MShapeGrpDtlCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shapeGrpDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrpDtl selectByPKValue(Long shapeGrpDtlId) {
        return facadeSelectByPKValue(shapeGrpDtlId);
    }

    protected MShapeGrpDtl facadeSelectByPKValue(Long shapeGrpDtlId) {
        return doSelectByPK(shapeGrpDtlId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrpDtl> ENTITY doSelectByPK(Long shapeGrpDtlId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shapeGrpDtlId), tp);
    }

    protected <ENTITY extends MShapeGrpDtl> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shapeGrpDtlId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shapeGrpDtlId, tp), shapeGrpDtlId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shapeGrpDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MShapeGrpDtl selectByPKValueWithDeletedCheck(Long shapeGrpDtlId) {
        return doSelectByPKWithDeletedCheck(shapeGrpDtlId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MShapeGrpDtl> ENTITY doSelectByPKWithDeletedCheck(Long shapeGrpDtlId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shapeGrpDtlId), tp);
    }

    protected MShapeGrpDtlCB xprepareCBAsPK(Long shapeGrpDtlId) {
        assertObjectNotNull("shapeGrpDtlId", shapeGrpDtlId);
        return newConditionBean().acceptPK(shapeGrpDtlId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MShapeGrpDtl&gt; <span style="color: #553000">mShapeGrpDtlList</span> = <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MShapeGrpDtl mShapeGrpDtl : <span style="color: #553000">mShapeGrpDtlList</span>) {
     *     ... = mShapeGrpDtl.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MShapeGrpDtl> selectList(MShapeGrpDtlCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MShapeGrpDtl&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MShapeGrpDtl mShapeGrpDtl : <span style="color: #553000">page</span>) {
     *     ... = mShapeGrpDtl.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MShapeGrpDtl> selectPage(MShapeGrpDtlCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().set...
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @param entityRowHandler The handler of entity row of MShapeGrpDtl. (NotNull)
     */
    public void selectCursor(MShapeGrpDtlCB cb, EntityRowHandler<MShapeGrpDtl> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeGrpDtlCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MShapeGrpDtlCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mShapeGrpDtlList The entity list of MShapeGrpDtl. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MShapeGrpDtl> mShapeGrpDtlList, ReferrerLoaderHandler<LoaderOfMShapeGrpDtl> loaderLambda) {
        xassLRArg(mShapeGrpDtlList, loaderLambda);
        loaderLambda.handle(new LoaderOfMShapeGrpDtl().ready(mShapeGrpDtlList, _behaviorSelector));
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
     * @param mShapeGrpDtl The entity of MShapeGrpDtl. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MShapeGrpDtl mShapeGrpDtl, ReferrerLoaderHandler<LoaderOfMShapeGrpDtl> loaderLambda) {
        xassLRArg(mShapeGrpDtl, loaderLambda);
        loaderLambda.handle(new LoaderOfMShapeGrpDtl().ready(xnewLRAryLs(mShapeGrpDtl), _behaviorSelector));
    }

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">mShapeGrpDtlList</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MShapeGrpDtl mShapeGrpDtl : <span style="color: #553000">mShapeGrpDtlList</span>) {
     *     ... = mShapeGrpDtl.<span style="color: #CC4747">getMProductShapeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpDtlId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpDtlId_Asc();
     * </pre>
     * @param mShapeGrpDtlList The entity list of MShapeGrpDtl. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(List<MShapeGrpDtl> mShapeGrpDtlList, ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        xassLRArg(mShapeGrpDtlList, refCBLambda);
        return doLoadMProductShapeList(mShapeGrpDtlList, new LoadReferrerOption<MProductShapeCB, MProductShape>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">mShapeGrpDtl</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getMProductShapeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeGrpDtlId_InScope(pkList);
     * cb.query().addOrderBy_ShapeGrpDtlId_Asc();
     * </pre>
     * @param mShapeGrpDtl The entity of MShapeGrpDtl. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(MShapeGrpDtl mShapeGrpDtl, ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        xassLRArg(mShapeGrpDtl, refCBLambda);
        return doLoadMProductShapeList(xnewLRLs(mShapeGrpDtl), new LoadReferrerOption<MProductShapeCB, MProductShape>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mShapeGrpDtl The entity of MShapeGrpDtl. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(MShapeGrpDtl mShapeGrpDtl, LoadReferrerOption<MProductShapeCB, MProductShape> loadReferrerOption) {
        xassLRArg(mShapeGrpDtl, loadReferrerOption);
        return loadMProductShapeList(xnewLRLs(mShapeGrpDtl), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mShapeGrpDtlList The entity list of MShapeGrpDtl. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(List<MShapeGrpDtl> mShapeGrpDtlList, LoadReferrerOption<MProductShapeCB, MProductShape> loadReferrerOption) {
        xassLRArg(mShapeGrpDtlList, loadReferrerOption);
        if (mShapeGrpDtlList.isEmpty()) { return (NestedReferrerListGateway<MProductShape>)EMPTY_NREF_LGWAY; }
        return doLoadMProductShapeList(mShapeGrpDtlList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProductShape> doLoadMProductShapeList(List<MShapeGrpDtl> mShapeGrpDtlList, LoadReferrerOption<MProductShapeCB, MProductShape> option) {
        return helpLoadReferrerInternally(mShapeGrpDtlList, option, "mProductShapeList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShape'.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShape> pulloutMShape(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpPulloutInternally(mShapeGrpDtlList, "mShape"); }

    /**
     * Pull out the list of foreign table 'MShapeGrp'.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShapeGrp> pulloutMShapeGrp(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpPulloutInternally(mShapeGrpDtlList, "mShapeGrp"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCasePickFlg(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpPulloutInternally(mShapeGrpDtlList, "bClassDtlByCasePickFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEmReplenishShapeFlg(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpPulloutInternally(mShapeGrpDtlList, "bClassDtlByEmReplenishShapeFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpPulloutInternally(mShapeGrpDtlList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shapeGrpDtlId.
     * @param mShapeGrpDtlList The list of mShapeGrpDtl. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShapeGrpDtlIdList(List<MShapeGrpDtl> mShapeGrpDtlList)
    { return helpExtractListInternally(mShapeGrpDtlList, "shapeGrpDtlId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShapeGrpDtl.setFoo...(value);
     * mShapeGrpDtl.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.set...;</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">insert</span>(mShapeGrpDtl);
     * ... = mShapeGrpDtl.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mShapeGrpDtl The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MShapeGrpDtl mShapeGrpDtl) {
        doInsert(mShapeGrpDtl, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrpDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrpDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">update</span>(mShapeGrpDtl);
     * </pre>
     * @param mShapeGrpDtl The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MShapeGrpDtl mShapeGrpDtl) {
        doUpdate(mShapeGrpDtl, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrpDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mShapeGrpDtl);
     * </pre>
     * @param mShapeGrpDtl The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MShapeGrpDtl mShapeGrpDtl) {
        doUpdateNonstrict(mShapeGrpDtl, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShapeGrpDtl The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MShapeGrpDtl mShapeGrpDtl) {
        doInsertOrUpdate(mShapeGrpDtl, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mShapeGrpDtl The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MShapeGrpDtl mShapeGrpDtl) {
        doInsertOrUpdateNonstrict(mShapeGrpDtl, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrpDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">delete</span>(mShapeGrpDtl);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mShapeGrpDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MShapeGrpDtl mShapeGrpDtl) {
        doDelete(mShapeGrpDtl, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mShapeGrpDtl);
     * </pre>
     * @param mShapeGrpDtl The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MShapeGrpDtl mShapeGrpDtl) {
        doDeleteNonstrict(mShapeGrpDtl, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mShapeGrpDtl);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mShapeGrpDtl The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MShapeGrpDtl mShapeGrpDtl) {
        doDeleteNonstrictIgnoreDeleted(mShapeGrpDtl, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MShapeGrpDtl et, final DeleteOption<MShapeGrpDtlCB> op) {
        assertObjectNotNull("mShapeGrpDtl", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     *     mShapeGrpDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrpDtl.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mShapeGrpDtlList.add(mShapeGrpDtl);
     * }
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchInsert</span>(mShapeGrpDtlList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MShapeGrpDtl> mShapeGrpDtlList) {
        return doBatchInsert(mShapeGrpDtlList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     *     mShapeGrpDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrpDtl.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShapeGrpDtl.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShapeGrpDtl.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeGrpDtlList.add(mShapeGrpDtl);
     * }
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpDtlList);
     * </pre>
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShapeGrpDtl> mShapeGrpDtlList) {
        return doBatchUpdate(mShapeGrpDtlList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mShapeGrpDtlBhv.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MShapeGrpDtl> mShapeGrpDtlList, SpecifyQuery<MShapeGrpDtlCB> colCBLambda) {
        return doBatchUpdate(mShapeGrpDtlList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     *     mShapeGrpDtl.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mShapeGrpDtl.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mShapeGrpDtl.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mShapeGrpDtl.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mShapeGrpDtlList.add(mShapeGrpDtl);
     * }
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mShapeGrpDtlList);
     * </pre>
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShapeGrpDtl> mShapeGrpDtlList) {
        return doBatchUpdateNonstrict(mShapeGrpDtlList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeGrpDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mShapeGrpDtlList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MShapeGrpDtl> mShapeGrpDtlList, SpecifyQuery<MShapeGrpDtlCB> colCBLambda) {
        return doBatchUpdateNonstrict(mShapeGrpDtlList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MShapeGrpDtl> mShapeGrpDtlList) {
        return doBatchDelete(mShapeGrpDtlList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MShapeGrpDtl> mShapeGrpDtlList) {
        return doBatchDeleteNonstrict(mShapeGrpDtlList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MShapeGrpDtl, MShapeGrpDtlCB&gt;() {
     *     public ConditionBean setup(MShapeGrpDtl entity, MShapeGrpDtlCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MShapeGrpDtl, MShapeGrpDtlCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setPK...(value);</span>
     * mShapeGrpDtl.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mShapeGrpDtl, cb);
     * </pre>
     * @param mShapeGrpDtl The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MShapeGrpDtl mShapeGrpDtl, MShapeGrpDtlCB cb) {
        return doQueryUpdate(mShapeGrpDtl, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MShapeGrpDtlCB cb = new MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">queryDelete</span>(mShapeGrpDtl, cb);
     * </pre>
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MShapeGrpDtlCB cb) {
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
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mShapeGrpDtl.setFoo...(value);
     * mShapeGrpDtl.setBar...(value);
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mShapeGrpDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mShapeGrpDtl.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mShapeGrpDtl The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, InsertOption<MShapeGrpDtlCB>> opLambda) {
        doInsert(mShapeGrpDtl, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrpDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mShapeGrpDtl.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mShapeGrpDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrpDtl The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> opLambda) {
        doUpdate(mShapeGrpDtl, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * mShapeGrpDtl.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mShapeGrpDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mShapeGrpDtl, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrpDtl The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> opLambda) {
        doUpdateNonstrict(mShapeGrpDtl, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mShapeGrpDtl The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, InsertOption<MShapeGrpDtlCB>> insertOpLambda, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> updateOpLambda) {
        doInsertOrUpdate(mShapeGrpDtl, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mShapeGrpDtl The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, InsertOption<MShapeGrpDtlCB>> insertOpLambda, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mShapeGrpDtl, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mShapeGrpDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, DeleteOption<MShapeGrpDtlCB>> opLambda) {
        doDelete(mShapeGrpDtl, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mShapeGrpDtl The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MShapeGrpDtl mShapeGrpDtl, WritableOptionCall<MShapeGrpDtlCB, DeleteOption<MShapeGrpDtlCB>> opLambda) {
        doDeleteNonstrict(mShapeGrpDtl, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MShapeGrpDtl> mShapeGrpDtlList, WritableOptionCall<MShapeGrpDtlCB, InsertOption<MShapeGrpDtlCB>> opLambda) {
        return doBatchInsert(mShapeGrpDtlList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MShapeGrpDtl> mShapeGrpDtlList, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> opLambda) {
        return doBatchUpdate(mShapeGrpDtlList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MShapeGrpDtl> mShapeGrpDtlList, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> opLambda) {
        return doBatchUpdateNonstrict(mShapeGrpDtlList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MShapeGrpDtl> mShapeGrpDtlList, WritableOptionCall<MShapeGrpDtlCB, DeleteOption<MShapeGrpDtlCB>> opLambda) {
        return doBatchDelete(mShapeGrpDtlList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mShapeGrpDtlList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MShapeGrpDtl> mShapeGrpDtlList, WritableOptionCall<MShapeGrpDtlCB, DeleteOption<MShapeGrpDtlCB>> opLambda) {
        return doBatchDeleteNonstrict(mShapeGrpDtlList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MShapeGrpDtl, MShapeGrpDtlCB> manyArgLambda, WritableOptionCall<MShapeGrpDtlCB, InsertOption<MShapeGrpDtlCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MShapeGrpDtl mShapeGrpDtl = <span style="color: #70226C">new</span> MShapeGrpDtl();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setPK...(value);</span>
     * mShapeGrpDtl.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mShapeGrpDtl.setVersionNo(value);</span>
     * MShapeGrpDtlCB cb = <span style="color: #70226C">new</span> MShapeGrpDtlCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mShapeGrpDtl, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mShapeGrpDtl The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MShapeGrpDtl mShapeGrpDtl, MShapeGrpDtlCB cb, WritableOptionCall<MShapeGrpDtlCB, UpdateOption<MShapeGrpDtlCB>> opLambda) {
        return doQueryUpdate(mShapeGrpDtl, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MShapeGrpDtl. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MShapeGrpDtlCB cb, WritableOptionCall<MShapeGrpDtlCB, DeleteOption<MShapeGrpDtlCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mShapeGrpDtlBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mShapeGrpDtlBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeGrpDtlBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mShapeGrpDtlBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mShapeGrpDtlBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mShapeGrpDtlBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mShapeGrpDtlBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mShapeGrpDtlBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mShapeGrpDtlBhv.outideSql().removeBlockComment().selectList()
     * mShapeGrpDtlBhv.outideSql().removeLineComment().selectList()
     * mShapeGrpDtlBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MShapeGrpDtlBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MShapeGrpDtlBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MShapeGrpDtl> typeOfSelectedEntity() { return MShapeGrpDtl.class; }
    protected Class<MShapeGrpDtl> typeOfHandlingEntity() { return MShapeGrpDtl.class; }
    protected Class<MShapeGrpDtlCB> typeOfHandlingConditionBean() { return MShapeGrpDtlCB.class; }
}
