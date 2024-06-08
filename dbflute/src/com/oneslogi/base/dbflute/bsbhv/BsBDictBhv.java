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
 * The behavior of B_DICT as TABLE. <br>
 * <pre>
 * [primary key]
 *     DICT_ID
 *
 * [column]
 *     DICT_ID, DICT_NM, DATA_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataType), B_DICT_VALID(AsOne), M_HT_DICT(AsOne)
 *
 * [referrer table]
 *     B_ARG, B_CLASS_DTL, B_COL, B_CULTURE, B_DICT_CULTURE, B_ITEM, B_MENU, B_MENU_GRP, B_ROLE, B_ROLE_GRP, B_SCREEN, M_CENTER_CLASS_DTL, M_CENTER_COL, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_PROCESS_TYPE, M_SHAPE, M_STOCK_TYPE, P_REPORT_LAYOUT_ITEM, P_SUBREP_LAYOUT_ITEM, B_DICT_VALID, M_HT_DICT
 *
 * [foreign property]
 *     bClassDtlByDataType, bDictValidAsOne, mHtDictAsOne
 *
 * [referrer property]
 *     bArgList, bClassDtlList, bColList, bCultureList, bDictCultureList, bItemList, bMenuList, bMenuGrpList, bRoleList, bRoleGrpList, bScreenList, mCenterClassDtlList, mCenterColList, mCenterItemList, mCenterScreenList, mClientColList, mClientItemList, mClientScreenList, mProcessTypeList, mShapeByShapeDictIdList, mShapeByShapeUnitDictIdList, mStockTypeList, pReportLayoutItemList, pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBDictBhv extends AbstractBehaviorWritable<BDict, BDictCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BDictDbm asDBMeta() { return BDictDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_DICT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BDictDbm getMyDBMeta() { return BDictDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BDictCB newConditionBean() { return new BDictCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BDict newMyEntity() { return new BDict(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BDictCB newMyConditionBean() { return new BDictCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BDictCB cb) {
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
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().setFoo...(value);
     * BDict bDict = <span style="color: #0000C0">bDictBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bDict != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bDict.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BDict selectEntity(BDictCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BDict facadeSelectEntity(BDictCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BDict> OptionalEntity<ENTITY> doSelectOptionalEntity(BDictCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().set...;
     * BDict bDict = <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bDict.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BDict selectEntityWithDeletedCheck(BDictCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param dictId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BDict selectByPKValue(Long dictId) {
        return facadeSelectByPKValue(dictId);
    }

    protected BDict facadeSelectByPKValue(Long dictId) {
        return doSelectByPK(dictId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BDict> ENTITY doSelectByPK(Long dictId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(dictId), tp);
    }

    protected <ENTITY extends BDict> OptionalEntity<ENTITY> doSelectOptionalByPK(Long dictId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(dictId, tp), dictId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param dictId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BDict selectByPKValueWithDeletedCheck(Long dictId) {
        return doSelectByPKWithDeletedCheck(dictId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BDict> ENTITY doSelectByPKWithDeletedCheck(Long dictId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(dictId), tp);
    }

    protected BDictCB xprepareCBAsPK(Long dictId) {
        assertObjectNotNull("dictId", dictId);
        return newConditionBean().acceptPK(dictId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param dictNm : UQ, NotNull, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BDict> selectByUniqueOf(String dictNm) {
        return facadeSelectByUniqueOf(dictNm);
    }

    protected OptionalEntity<BDict> facadeSelectByUniqueOf(String dictNm) {
        return doSelectByUniqueOf(dictNm, typeOfSelectedEntity());
    }

    protected <ENTITY extends BDict> OptionalEntity<ENTITY> doSelectByUniqueOf(String dictNm, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(dictNm), tp), dictNm);
    }

    protected BDictCB xprepareCBAsUniqueOf(String dictNm) {
        assertObjectNotNull("dictNm", dictNm);
        return newConditionBean().acceptUniqueOf(dictNm);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BDict&gt; <span style="color: #553000">bDictList</span> = <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BDict> selectList(BDictCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BDict&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">page</span>) {
     *     ... = bDict.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BDict> selectPage(BDictCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().set...
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @param entityRowHandler The handler of entity row of BDict. (NotNull)
     */
    public void selectCursor(BDictCB cb, EntityRowHandler<BDict> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BDictCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BDictCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BDict> bDictList, ReferrerLoaderHandler<LoaderOfBDict> loaderLambda) {
        xassLRArg(bDictList, loaderLambda);
        loaderLambda.handle(new LoaderOfBDict().ready(bDictList, _behaviorSelector));
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
     * @param bDict The entity of BDict. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BDict bDict, ReferrerLoaderHandler<LoaderOfBDict> loaderLambda) {
        xassLRArg(bDict, loaderLambda);
        loaderLambda.handle(new LoaderOfBDict().ready(xnewLRAryLs(bDict), _behaviorSelector));
    }

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by DICT_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">argCB</span>.setupSelect...
     *     <span style="color: #553000">argCB</span>.query().set...
     *     <span style="color: #553000">argCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBArgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(List<BDict> bDictList, ConditionBeanSetupper<BArgCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBArgList(bDictList, new LoadReferrerOption<BArgCB, BArg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by DICT_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">argCB</span>.setupSelect...
     *     <span style="color: #553000">argCB</span>.query().set...
     *     <span style="color: #553000">argCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBArgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(BDict bDict, ConditionBeanSetupper<BArgCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBArgList(xnewLRLs(bDict), new LoadReferrerOption<BArgCB, BArg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BArg> loadBArgList(BDict bDict, LoadReferrerOption<BArgCB, BArg> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBArgList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BArg> loadBArgList(List<BDict> bDictList, LoadReferrerOption<BArgCB, BArg> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BArg>)EMPTY_NREF_LGWAY; }
        return doLoadBArgList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BArg> doLoadBArgList(List<BDict> bDictList, LoadReferrerOption<BArgCB, BArg> option) {
        return helpLoadReferrerInternally(bDictList, option, "bArgList");
    }

    /**
     * Load referrer of BClassDtlList by the set-upper of referrer. <br>
     * B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBClassDtlList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassDtl> loadBClassDtlList(List<BDict> bDictList, ConditionBeanSetupper<BClassDtlCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBClassDtlList(bDictList, new LoadReferrerOption<BClassDtlCB, BClassDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BClassDtlList by the set-upper of referrer. <br>
     * B_CLASS_DTL by DICT_ID, named 'BClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBClassDtlList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBClassDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassDtl> loadBClassDtlList(BDict bDict, ConditionBeanSetupper<BClassDtlCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBClassDtlList(xnewLRLs(bDict), new LoadReferrerOption<BClassDtlCB, BClassDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BClassDtl> loadBClassDtlList(BDict bDict, LoadReferrerOption<BClassDtlCB, BClassDtl> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBClassDtlList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BClassDtl> loadBClassDtlList(List<BDict> bDictList, LoadReferrerOption<BClassDtlCB, BClassDtl> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BClassDtl>)EMPTY_NREF_LGWAY; }
        return doLoadBClassDtlList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BClassDtl> doLoadBClassDtlList(List<BDict> bDictList, LoadReferrerOption<BClassDtlCB, BClassDtl> option) {
        return helpLoadReferrerInternally(bDictList, option, "bClassDtlList");
    }

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by DICT_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(List<BDict> bDictList, ConditionBeanSetupper<BColCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBColList(bDictList, new LoadReferrerOption<BColCB, BCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColList by the set-upper of referrer. <br>
     * B_COL by DICT_ID, named 'BColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBColList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(BDict bDict, ConditionBeanSetupper<BColCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBColList(xnewLRLs(bDict), new LoadReferrerOption<BColCB, BCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCol> loadBColList(BDict bDict, LoadReferrerOption<BColCB, BCol> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBColList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BCol> loadBColList(List<BDict> bDictList, LoadReferrerOption<BColCB, BCol> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BCol>)EMPTY_NREF_LGWAY; }
        return doLoadBColList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BCol> doLoadBColList(List<BDict> bDictList, LoadReferrerOption<BColCB, BCol> option) {
        return helpLoadReferrerInternally(bDictList, option, "bColList");
    }

    /**
     * Load referrer of BCultureList by the set-upper of referrer. <br>
     * B_CULTURE by DICT_ID, named 'BCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBCultureList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureList(List<BDict> bDictList, ConditionBeanSetupper<BCultureCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBCultureList(bDictList, new LoadReferrerOption<BCultureCB, BCulture>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BCultureList by the set-upper of referrer. <br>
     * B_CULTURE by DICT_ID, named 'BCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBCultureList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBCultureList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureList(BDict bDict, ConditionBeanSetupper<BCultureCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBCultureList(xnewLRLs(bDict), new LoadReferrerOption<BCultureCB, BCulture>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BCulture> loadBCultureList(BDict bDict, LoadReferrerOption<BCultureCB, BCulture> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBCultureList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BCulture> loadBCultureList(List<BDict> bDictList, LoadReferrerOption<BCultureCB, BCulture> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BCulture>)EMPTY_NREF_LGWAY; }
        return doLoadBCultureList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BCulture> doLoadBCultureList(List<BDict> bDictList, LoadReferrerOption<BCultureCB, BCulture> option) {
        return helpLoadReferrerInternally(bDictList, option, "bCultureList");
    }

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBDictCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(List<BDict> bDictList, ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBDictCultureList(bDictList, new LoadReferrerOption<BDictCultureCB, BDictCulture>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureCB</span>.setupSelect...
     *     <span style="color: #553000">cultureCB</span>.query().set...
     *     <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBDictCultureList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(BDict bDict, ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBDictCultureList(xnewLRLs(bDict), new LoadReferrerOption<BDictCultureCB, BDictCulture>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(BDict bDict, LoadReferrerOption<BDictCultureCB, BDictCulture> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBDictCultureList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BDictCulture> loadBDictCultureList(List<BDict> bDictList, LoadReferrerOption<BDictCultureCB, BDictCulture> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BDictCulture>)EMPTY_NREF_LGWAY; }
        return doLoadBDictCultureList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BDictCulture> doLoadBDictCultureList(List<BDict> bDictList, LoadReferrerOption<BDictCultureCB, BDictCulture> option) {
        return helpLoadReferrerInternally(bDictList, option, "bDictCultureList");
    }

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by DICT_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(List<BDict> bDictList, ConditionBeanSetupper<BItemCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBItemList(bDictList, new LoadReferrerOption<BItemCB, BItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BItemList by the set-upper of referrer. <br>
     * B_ITEM by DICT_ID, named 'BItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBItemList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(BDict bDict, ConditionBeanSetupper<BItemCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBItemList(xnewLRLs(bDict), new LoadReferrerOption<BItemCB, BItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BItem> loadBItemList(BDict bDict, LoadReferrerOption<BItemCB, BItem> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBItemList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BItem> loadBItemList(List<BDict> bDictList, LoadReferrerOption<BItemCB, BItem> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BItem>)EMPTY_NREF_LGWAY; }
        return doLoadBItemList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BItem> doLoadBItemList(List<BDict> bDictList, LoadReferrerOption<BItemCB, BItem> option) {
        return helpLoadReferrerInternally(bDictList, option, "bItemList");
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by DICT_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBMenuList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BDict> bDictList, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBMenuList(bDictList, new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMenuList by the set-upper of referrer. <br>
     * B_MENU by DICT_ID, named 'BMenuList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBMenuList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">menuCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">menuCB</span>.setupSelect...
     *     <span style="color: #553000">menuCB</span>.query().set...
     *     <span style="color: #553000">menuCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBMenuList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BDict bDict, ConditionBeanSetupper<BMenuCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBMenuList(xnewLRLs(bDict), new LoadReferrerOption<BMenuCB, BMenu>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenu> loadBMenuList(BDict bDict, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBMenuList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMenu> loadBMenuList(List<BDict> bDictList, LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BMenu>)EMPTY_NREF_LGWAY; }
        return doLoadBMenuList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMenu> doLoadBMenuList(List<BDict> bDictList, LoadReferrerOption<BMenuCB, BMenu> option) {
        return helpLoadReferrerInternally(bDictList, option, "bMenuList");
    }

    /**
     * Load referrer of BMenuGrpList by the set-upper of referrer. <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBMenuGrpList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBMenuGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpList(List<BDict> bDictList, ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBMenuGrpList(bDictList, new LoadReferrerOption<BMenuGrpCB, BMenuGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BMenuGrpList by the set-upper of referrer. <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBMenuGrpList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBMenuGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpList(BDict bDict, ConditionBeanSetupper<BMenuGrpCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBMenuGrpList(xnewLRLs(bDict), new LoadReferrerOption<BMenuGrpCB, BMenuGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpList(BDict bDict, LoadReferrerOption<BMenuGrpCB, BMenuGrp> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBMenuGrpList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BMenuGrp> loadBMenuGrpList(List<BDict> bDictList, LoadReferrerOption<BMenuGrpCB, BMenuGrp> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BMenuGrp>)EMPTY_NREF_LGWAY; }
        return doLoadBMenuGrpList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BMenuGrp> doLoadBMenuGrpList(List<BDict> bDictList, LoadReferrerOption<BMenuGrpCB, BMenuGrp> option) {
        return helpLoadReferrerInternally(bDictList, option, "bMenuGrpList");
    }

    /**
     * Load referrer of BRoleList by the set-upper of referrer. <br>
     * B_ROLE by DICT_ID, named 'BRoleList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBRoleList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRole> loadBRoleList(List<BDict> bDictList, ConditionBeanSetupper<BRoleCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBRoleList(bDictList, new LoadReferrerOption<BRoleCB, BRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BRoleList by the set-upper of referrer. <br>
     * B_ROLE by DICT_ID, named 'BRoleList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBRoleList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRole> loadBRoleList(BDict bDict, ConditionBeanSetupper<BRoleCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBRoleList(xnewLRLs(bDict), new LoadReferrerOption<BRoleCB, BRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRole> loadBRoleList(BDict bDict, LoadReferrerOption<BRoleCB, BRole> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBRoleList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BRole> loadBRoleList(List<BDict> bDictList, LoadReferrerOption<BRoleCB, BRole> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BRole>)EMPTY_NREF_LGWAY; }
        return doLoadBRoleList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BRole> doLoadBRoleList(List<BDict> bDictList, LoadReferrerOption<BRoleCB, BRole> option) {
        return helpLoadReferrerInternally(bDictList, option, "bRoleList");
    }

    /**
     * Load referrer of BRoleGrpList by the set-upper of referrer. <br>
     * B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBRoleGrpList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBRoleGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrp> loadBRoleGrpList(List<BDict> bDictList, ConditionBeanSetupper<BRoleGrpCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBRoleGrpList(bDictList, new LoadReferrerOption<BRoleGrpCB, BRoleGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BRoleGrpList by the set-upper of referrer. <br>
     * B_ROLE_GRP by DICT_ID, named 'BRoleGrpList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBRoleGrpList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBRoleGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrp> loadBRoleGrpList(BDict bDict, ConditionBeanSetupper<BRoleGrpCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBRoleGrpList(xnewLRLs(bDict), new LoadReferrerOption<BRoleGrpCB, BRoleGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BRoleGrp> loadBRoleGrpList(BDict bDict, LoadReferrerOption<BRoleGrpCB, BRoleGrp> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBRoleGrpList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BRoleGrp> loadBRoleGrpList(List<BDict> bDictList, LoadReferrerOption<BRoleGrpCB, BRoleGrp> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BRoleGrp>)EMPTY_NREF_LGWAY; }
        return doLoadBRoleGrpList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BRoleGrp> doLoadBRoleGrpList(List<BDict> bDictList, LoadReferrerOption<BRoleGrpCB, BRoleGrp> option) {
        return helpLoadReferrerInternally(bDictList, option, "bRoleGrpList");
    }

    /**
     * Load referrer of BScreenList by the set-upper of referrer. <br>
     * B_SCREEN by DICT_ID, named 'BScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBScreenList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getBScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreen> loadBScreenList(List<BDict> bDictList, ConditionBeanSetupper<BScreenCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadBScreenList(bDictList, new LoadReferrerOption<BScreenCB, BScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BScreenList by the set-upper of referrer. <br>
     * B_SCREEN by DICT_ID, named 'BScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadBScreenList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getBScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreen> loadBScreenList(BDict bDict, ConditionBeanSetupper<BScreenCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadBScreenList(xnewLRLs(bDict), new LoadReferrerOption<BScreenCB, BScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BScreen> loadBScreenList(BDict bDict, LoadReferrerOption<BScreenCB, BScreen> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadBScreenList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BScreen> loadBScreenList(List<BDict> bDictList, LoadReferrerOption<BScreenCB, BScreen> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<BScreen>)EMPTY_NREF_LGWAY; }
        return doLoadBScreenList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BScreen> doLoadBScreenList(List<BDict> bDictList, LoadReferrerOption<BScreenCB, BScreen> option) {
        return helpLoadReferrerInternally(bDictList, option, "bScreenList");
    }

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(List<BDict> bDictList, ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMCenterClassDtlList(bDictList, new LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassDtlList by the set-upper of referrer. <br>
     * M_CENTER_CLASS_DTL by DICT_ID, named 'MCenterClassDtlList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterClassDtlList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMCenterClassDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(BDict bDict, ConditionBeanSetupper<MCenterClassDtlCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMCenterClassDtlList(xnewLRLs(bDict), new LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(BDict bDict, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMCenterClassDtlList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClassDtl> loadMCenterClassDtlList(List<BDict> bDictList, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MCenterClassDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassDtlList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClassDtl> doLoadMCenterClassDtlList(List<BDict> bDictList, LoadReferrerOption<MCenterClassDtlCB, MCenterClassDtl> option) {
        return helpLoadReferrerInternally(bDictList, option, "mCenterClassDtlList");
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<BDict> bDictList, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMCenterColList(bDictList, new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by DICT_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMCenterColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(BDict bDict, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMCenterColList(xnewLRLs(bDict), new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(BDict bDict, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMCenterColList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<BDict> bDictList, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MCenterCol>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterColList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCol> doLoadMCenterColList(List<BDict> bDictList, LoadReferrerOption<MCenterColCB, MCenterCol> option) {
        return helpLoadReferrerInternally(bDictList, option, "mCenterColList");
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<BDict> bDictList, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMCenterItemList(bDictList, new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by DICT_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMCenterItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(BDict bDict, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMCenterItemList(xnewLRLs(bDict), new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(BDict bDict, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMCenterItemList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<BDict> bDictList, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MCenterItem>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterItemList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterItem> doLoadMCenterItemList(List<BDict> bDictList, LoadReferrerOption<MCenterItemCB, MCenterItem> option) {
        return helpLoadReferrerInternally(bDictList, option, "mCenterItemList");
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<BDict> bDictList, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMCenterScreenList(bDictList, new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by DICT_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(BDict bDict, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMCenterScreenList(xnewLRLs(bDict), new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(BDict bDict, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMCenterScreenList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<BDict> bDictList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MCenterScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterScreenList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterScreen> doLoadMCenterScreenList(List<BDict> bDictList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> option) {
        return helpLoadReferrerInternally(bDictList, option, "mCenterScreenList");
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<BDict> bDictList, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMClientColList(bDictList, new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by DICT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMClientColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(BDict bDict, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMClientColList(xnewLRLs(bDict), new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(BDict bDict, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMClientColList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<BDict> bDictList, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MClientCol>)EMPTY_NREF_LGWAY; }
        return doLoadMClientColList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCol> doLoadMClientColList(List<BDict> bDictList, LoadReferrerOption<MClientColCB, MClientCol> option) {
        return helpLoadReferrerInternally(bDictList, option, "mClientColList");
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<BDict> bDictList, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMClientItemList(bDictList, new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by DICT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMClientItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(BDict bDict, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMClientItemList(xnewLRLs(bDict), new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(BDict bDict, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMClientItemList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<BDict> bDictList, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MClientItem>)EMPTY_NREF_LGWAY; }
        return doLoadMClientItemList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientItem> doLoadMClientItemList(List<BDict> bDictList, LoadReferrerOption<MClientItemCB, MClientItem> option) {
        return helpLoadReferrerInternally(bDictList, option, "mClientItemList");
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<BDict> bDictList, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMClientScreenList(bDictList, new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by DICT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMClientScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(BDict bDict, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMClientScreenList(xnewLRLs(bDict), new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(BDict bDict, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMClientScreenList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<BDict> bDictList, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MClientScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMClientScreenList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientScreen> doLoadMClientScreenList(List<BDict> bDictList, LoadReferrerOption<MClientScreenCB, MClientScreen> option) {
        return helpLoadReferrerInternally(bDictList, option, "mClientScreenList");
    }

    /**
     * Load referrer of MProcessTypeList by the set-upper of referrer. <br>
     * M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMProcessTypeList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMProcessTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(List<BDict> bDictList, ConditionBeanSetupper<MProcessTypeCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMProcessTypeList(bDictList, new LoadReferrerOption<MProcessTypeCB, MProcessType>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProcessTypeList by the set-upper of referrer. <br>
     * M_PROCESS_TYPE by DICT_ID, named 'MProcessTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMProcessTypeList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMProcessTypeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(BDict bDict, ConditionBeanSetupper<MProcessTypeCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMProcessTypeList(xnewLRLs(bDict), new LoadReferrerOption<MProcessTypeCB, MProcessType>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(BDict bDict, LoadReferrerOption<MProcessTypeCB, MProcessType> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMProcessTypeList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProcessType> loadMProcessTypeList(List<BDict> bDictList, LoadReferrerOption<MProcessTypeCB, MProcessType> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MProcessType>)EMPTY_NREF_LGWAY; }
        return doLoadMProcessTypeList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProcessType> doLoadMProcessTypeList(List<BDict> bDictList, LoadReferrerOption<MProcessTypeCB, MProcessType> option) {
        return helpLoadReferrerInternally(bDictList, option, "mProcessTypeList");
    }

    /**
     * Load referrer of MShapeByShapeDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMShapeByShapeDictIdList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMShapeByShapeDictIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeDictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeDictIdList(List<BDict> bDictList, ConditionBeanSetupper<MShapeCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMShapeByShapeDictIdList(bDictList, new LoadReferrerOption<MShapeCB, MShape>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MShapeByShapeDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_DICT_ID, named 'MShapeByShapeDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMShapeByShapeDictIdList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMShapeByShapeDictIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeDictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeDictIdList(BDict bDict, ConditionBeanSetupper<MShapeCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMShapeByShapeDictIdList(xnewLRLs(bDict), new LoadReferrerOption<MShapeCB, MShape>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeDictIdList(BDict bDict, LoadReferrerOption<MShapeCB, MShape> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMShapeByShapeDictIdList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MShape> loadMShapeByShapeDictIdList(List<BDict> bDictList, LoadReferrerOption<MShapeCB, MShape> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MShape>)EMPTY_NREF_LGWAY; }
        return doLoadMShapeByShapeDictIdList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MShape> doLoadMShapeByShapeDictIdList(List<BDict> bDictList, LoadReferrerOption<MShapeCB, MShape> option) {
        return helpLoadReferrerInternally(bDictList, option, "mShapeByShapeDictIdList");
    }

    /**
     * Load referrer of MShapeByShapeUnitDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMShapeByShapeUnitDictIdList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMShapeByShapeUnitDictIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeUnitDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeUnitDictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeUnitDictIdList(List<BDict> bDictList, ConditionBeanSetupper<MShapeCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMShapeByShapeUnitDictIdList(bDictList, new LoadReferrerOption<MShapeCB, MShape>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MShapeByShapeUnitDictIdList by the set-upper of referrer. <br>
     * M_SHAPE by SHAPE_UNIT_DICT_ID, named 'MShapeByShapeUnitDictIdList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMShapeByShapeUnitDictIdList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMShapeByShapeUnitDictIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShapeUnitDictId_InScope(pkList);
     * cb.query().addOrderBy_ShapeUnitDictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeUnitDictIdList(BDict bDict, ConditionBeanSetupper<MShapeCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMShapeByShapeUnitDictIdList(xnewLRLs(bDict), new LoadReferrerOption<MShapeCB, MShape>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShape> loadMShapeByShapeUnitDictIdList(BDict bDict, LoadReferrerOption<MShapeCB, MShape> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMShapeByShapeUnitDictIdList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MShape> loadMShapeByShapeUnitDictIdList(List<BDict> bDictList, LoadReferrerOption<MShapeCB, MShape> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MShape>)EMPTY_NREF_LGWAY; }
        return doLoadMShapeByShapeUnitDictIdList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MShape> doLoadMShapeByShapeUnitDictIdList(List<BDict> bDictList, LoadReferrerOption<MShapeCB, MShape> option) {
        return helpLoadReferrerInternally(bDictList, option, "mShapeByShapeUnitDictIdList");
    }

    /**
     * Load referrer of MStockTypeList by the set-upper of referrer. <br>
     * M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMStockTypeList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getMStockTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MStockType> loadMStockTypeList(List<BDict> bDictList, ConditionBeanSetupper<MStockTypeCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadMStockTypeList(bDictList, new LoadReferrerOption<MStockTypeCB, MStockType>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MStockTypeList by the set-upper of referrer. <br>
     * M_STOCK_TYPE by DICT_ID, named 'MStockTypeList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadMStockTypeList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getMStockTypeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MStockType> loadMStockTypeList(BDict bDict, ConditionBeanSetupper<MStockTypeCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadMStockTypeList(xnewLRLs(bDict), new LoadReferrerOption<MStockTypeCB, MStockType>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MStockType> loadMStockTypeList(BDict bDict, LoadReferrerOption<MStockTypeCB, MStockType> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadMStockTypeList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MStockType> loadMStockTypeList(List<BDict> bDictList, LoadReferrerOption<MStockTypeCB, MStockType> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<MStockType>)EMPTY_NREF_LGWAY; }
        return doLoadMStockTypeList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MStockType> doLoadMStockTypeList(List<BDict> bDictList, LoadReferrerOption<MStockTypeCB, MStockType> option) {
        return helpLoadReferrerInternally(bDictList, option, "mStockTypeList");
    }

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(List<BDict> bDictList, ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadPReportLayoutItemList(bDictList, new LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(BDict bDict, ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadPReportLayoutItemList(xnewLRLs(bDict), new LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(BDict bDict, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadPReportLayoutItemList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(List<BDict> bDictList, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<PReportLayoutItem>)EMPTY_NREF_LGWAY; }
        return doLoadPReportLayoutItemList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PReportLayoutItem> doLoadPReportLayoutItemList(List<BDict> bDictList, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> option) {
        return helpLoadReferrerInternally(bDictList, option, "pReportLayoutItemList");
    }

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">bDictList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BDict bDict : <span style="color: #553000">bDictList</span>) {
     *     ... = bDict.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDictList The entity list of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(List<BDict> bDictList, ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        xassLRArg(bDictList, refCBLambda);
        return doLoadPSubrepLayoutItemList(bDictList, new LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PSubrepLayoutItemList by the set-upper of referrer. <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">loadPSubrepLayoutItemList</span>(<span style="color: #553000">bDict</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bDict</span>.<span style="color: #CC4747">getPSubrepLayoutItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDictId_InScope(pkList);
     * cb.query().addOrderBy_DictId_Asc();
     * </pre>
     * @param bDict The entity of BDict. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(BDict bDict, ConditionBeanSetupper<PSubrepLayoutItemCB> refCBLambda) {
        xassLRArg(bDict, refCBLambda);
        return doLoadPSubrepLayoutItemList(xnewLRLs(bDict), new LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bDict The entity of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(BDict bDict, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> loadReferrerOption) {
        xassLRArg(bDict, loadReferrerOption);
        return loadPSubrepLayoutItemList(xnewLRLs(bDict), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bDictList The entity list of BDict. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PSubrepLayoutItem> loadPSubrepLayoutItemList(List<BDict> bDictList, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> loadReferrerOption) {
        xassLRArg(bDictList, loadReferrerOption);
        if (bDictList.isEmpty()) { return (NestedReferrerListGateway<PSubrepLayoutItem>)EMPTY_NREF_LGWAY; }
        return doLoadPSubrepLayoutItemList(bDictList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PSubrepLayoutItem> doLoadPSubrepLayoutItemList(List<BDict> bDictList, LoadReferrerOption<PSubrepLayoutItemCB, PSubrepLayoutItem> option) {
        return helpLoadReferrerInternally(bDictList, option, "pSubrepLayoutItemList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bDictList The list of bDict. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDataType(List<BDict> bDictList)
    { return helpPulloutInternally(bDictList, "bClassDtlByDataType"); }

    /**
     * Pull out the list of referrer-as-one table 'BDictValid'.
     * @param bDictList The list of bDict. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDictValid> pulloutBDictValidAsOne(List<BDict> bDictList)
    { return helpPulloutInternally(bDictList, "bDictValidAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'MHtDict'.
     * @param bDictList The list of bDict. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MHtDict> pulloutMHtDictAsOne(List<BDict> bDictList)
    { return helpPulloutInternally(bDictList, "mHtDictAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key dictId.
     * @param bDictList The list of bDict. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDictIdList(List<BDict> bDictList)
    { return helpExtractListInternally(bDictList, "dictId"); }

    /**
     * Extract the value list of (single) unique key dictNm.
     * @param bDictList The list of bDict. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractDictNmList(List<BDict> bDictList)
    { return helpExtractListInternally(bDictList, "dictNm"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bDict.setFoo...(value);
     * bDict.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bDict.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bDict.set...;</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">insert</span>(bDict);
     * ... = bDict.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bDict The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BDict bDict) {
        doInsert(bDict, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bDict.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bDict.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bDict.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bDict.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">update</span>(bDict);
     * </pre>
     * @param bDict The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BDict bDict) {
        doUpdate(bDict, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bDict.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bDict.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bDict.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bDict);
     * </pre>
     * @param bDict The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BDict bDict) {
        doUpdateNonstrict(bDict, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bDict The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BDict bDict) {
        doInsertOrUpdate(bDict, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bDict The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BDict bDict) {
        doInsertOrUpdateNonstrict(bDict, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bDict.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">delete</span>(bDict);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bDict The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BDict bDict) {
        doDelete(bDict, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bDict);
     * </pre>
     * @param bDict The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BDict bDict) {
        doDeleteNonstrict(bDict, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bDict);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bDict The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BDict bDict) {
        doDeleteNonstrictIgnoreDeleted(bDict, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BDict et, final DeleteOption<BDictCB> op) {
        assertObjectNotNull("bDict", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BDict bDict = <span style="color: #70226C">new</span> BDict();
     *     bDict.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bDict.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bDictList.add(bDict);
     * }
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchInsert</span>(bDictList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BDict> bDictList) {
        return doBatchInsert(bDictList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BDict bDict = <span style="color: #70226C">new</span> BDict();
     *     bDict.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bDict.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bDict.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bDict.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bDictList.add(bDict);
     * }
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bDictList);
     * </pre>
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BDict> bDictList) {
        return doBatchUpdate(bDictList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bDictBhv.<span style="color: #CC4747">batchUpdate</span>(bDictList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bDictList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BDict> bDictList, SpecifyQuery<BDictCB> colCBLambda) {
        return doBatchUpdate(bDictList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BDict bDict = <span style="color: #70226C">new</span> BDict();
     *     bDict.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bDict.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bDict.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bDict.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bDictList.add(bDict);
     * }
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bDictList);
     * </pre>
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BDict> bDictList) {
        return doBatchUpdateNonstrict(bDictList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bDictList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bDictList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BDict> bDictList, SpecifyQuery<BDictCB> colCBLambda) {
        return doBatchUpdateNonstrict(bDictList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BDict> bDictList) {
        return doBatchDelete(bDictList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BDict> bDictList) {
        return doBatchDeleteNonstrict(bDictList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BDict, BDictCB&gt;() {
     *     public ConditionBean setup(BDict entity, BDictCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BDict, BDictCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bDict.setPK...(value);</span>
     * bDict.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bDict.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bDict.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bDict, cb);
     * </pre>
     * @param bDict The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BDict bDict, BDictCB cb) {
        return doQueryUpdate(bDict, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BDictCB cb = new BDictCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">queryDelete</span>(bDict, cb);
     * </pre>
     * @param cb The condition-bean of BDict. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BDictCB cb) {
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
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bDict.setFoo...(value);
     * bDict.setBar...(value);
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bDict, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bDict.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bDict The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BDict bDict, WritableOptionCall<BDictCB, InsertOption<BDictCB>> opLambda) {
        doInsert(bDict, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bDict.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bDict.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bDict, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bDict The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BDict bDict, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> opLambda) {
        doUpdate(bDict, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * bDict.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bDict.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bDict, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bDict The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BDict bDict, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> opLambda) {
        doUpdateNonstrict(bDict, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bDict The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BDict bDict, WritableOptionCall<BDictCB, InsertOption<BDictCB>> insertOpLambda, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> updateOpLambda) {
        doInsertOrUpdate(bDict, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bDict The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BDict bDict, WritableOptionCall<BDictCB, InsertOption<BDictCB>> insertOpLambda, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bDict, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bDict The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BDict bDict, WritableOptionCall<BDictCB, DeleteOption<BDictCB>> opLambda) {
        doDelete(bDict, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bDict The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BDict bDict, WritableOptionCall<BDictCB, DeleteOption<BDictCB>> opLambda) {
        doDeleteNonstrict(bDict, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BDict> bDictList, WritableOptionCall<BDictCB, InsertOption<BDictCB>> opLambda) {
        return doBatchInsert(bDictList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BDict> bDictList, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> opLambda) {
        return doBatchUpdate(bDictList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BDict> bDictList, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> opLambda) {
        return doBatchUpdateNonstrict(bDictList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BDict> bDictList, WritableOptionCall<BDictCB, DeleteOption<BDictCB>> opLambda) {
        return doBatchDelete(bDictList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bDictList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BDict> bDictList, WritableOptionCall<BDictCB, DeleteOption<BDictCB>> opLambda) {
        return doBatchDeleteNonstrict(bDictList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BDict, BDictCB> manyArgLambda, WritableOptionCall<BDictCB, InsertOption<BDictCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BDict bDict = <span style="color: #70226C">new</span> BDict();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bDict.setPK...(value);</span>
     * bDict.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bDict.setVersionNo(value);</span>
     * BDictCB cb = <span style="color: #70226C">new</span> BDictCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bDictBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bDict, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bDict The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BDict. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BDict bDict, BDictCB cb, WritableOptionCall<BDictCB, UpdateOption<BDictCB>> opLambda) {
        return doQueryUpdate(bDict, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BDict. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BDictCB cb, WritableOptionCall<BDictCB, DeleteOption<BDictCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bDictBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bDictBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bDictBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bDictBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bDictBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bDictBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bDictBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bDictBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bDictBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bDictBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bDictBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bDictBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bDictBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bDictBhv.outideSql().removeBlockComment().selectList()
     * bDictBhv.outideSql().removeLineComment().selectList()
     * bDictBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BDictBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BDictBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BDict> typeOfSelectedEntity() { return BDict.class; }
    protected Class<BDict> typeOfHandlingEntity() { return BDict.class; }
    protected Class<BDictCB> typeOfHandlingConditionBean() { return BDictCB.class; }
}
