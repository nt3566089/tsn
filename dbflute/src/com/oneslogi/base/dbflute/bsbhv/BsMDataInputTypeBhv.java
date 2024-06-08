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
 * The behavior of M_DATA_INPUT_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DATA_INPUT_TYPE_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_ID, DATA_INPUT_TYPE_CD, DATA_INPUT_TYPE_NM, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataInputTypeCd)
 *
 * [referrer table]
 *     M_DATA_INPUT_TYPE_B
 *
 * [foreign property]
 *     bClassDtlByDataInputTypeCd
 *
 * [referrer property]
 *     mDataInputTypeBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMDataInputTypeBhv extends AbstractBehaviorWritable<MDataInputType, MDataInputTypeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MDataInputTypeDbm asDBMeta() { return MDataInputTypeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_DATA_INPUT_TYPE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MDataInputTypeDbm getMyDBMeta() { return MDataInputTypeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MDataInputTypeCB newConditionBean() { return new MDataInputTypeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MDataInputType newMyEntity() { return new MDataInputType(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MDataInputTypeCB newMyConditionBean() { return new MDataInputTypeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MDataInputTypeCB cb) {
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
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * MDataInputType mDataInputType = <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mDataInputType != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mDataInputType.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDataInputType selectEntity(MDataInputTypeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MDataInputType facadeSelectEntity(MDataInputTypeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDataInputType> OptionalEntity<ENTITY> doSelectOptionalEntity(MDataInputTypeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().set...;
     * MDataInputType mDataInputType = <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mDataInputType.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDataInputType selectEntityWithDeletedCheck(MDataInputTypeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param dataInputTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDataInputType selectByPKValue(Long dataInputTypeId) {
        return facadeSelectByPKValue(dataInputTypeId);
    }

    protected MDataInputType facadeSelectByPKValue(Long dataInputTypeId) {
        return doSelectByPK(dataInputTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDataInputType> ENTITY doSelectByPK(Long dataInputTypeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(dataInputTypeId), tp);
    }

    protected <ENTITY extends MDataInputType> OptionalEntity<ENTITY> doSelectOptionalByPK(Long dataInputTypeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(dataInputTypeId, tp), dataInputTypeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param dataInputTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MDataInputType selectByPKValueWithDeletedCheck(Long dataInputTypeId) {
        return doSelectByPKWithDeletedCheck(dataInputTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MDataInputType> ENTITY doSelectByPKWithDeletedCheck(Long dataInputTypeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(dataInputTypeId), tp);
    }

    protected MDataInputTypeCB xprepareCBAsPK(Long dataInputTypeId) {
        assertObjectNotNull("dataInputTypeId", dataInputTypeId);
        return newConditionBean().acceptPK(dataInputTypeId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MDataInputType&gt; <span style="color: #553000">mDataInputTypeList</span> = <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MDataInputType mDataInputType : <span style="color: #553000">mDataInputTypeList</span>) {
     *     ... = mDataInputType.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MDataInputType> selectList(MDataInputTypeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MDataInputType&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MDataInputType mDataInputType : <span style="color: #553000">page</span>) {
     *     ... = mDataInputType.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MDataInputType> selectPage(MDataInputTypeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().set...
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @param entityRowHandler The handler of entity row of MDataInputType. (NotNull)
     */
    public void selectCursor(MDataInputTypeCB cb, EntityRowHandler<MDataInputType> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MDataInputTypeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MDataInputTypeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mDataInputTypeList The entity list of MDataInputType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MDataInputType> mDataInputTypeList, ReferrerLoaderHandler<LoaderOfMDataInputType> loaderLambda) {
        xassLRArg(mDataInputTypeList, loaderLambda);
        loaderLambda.handle(new LoaderOfMDataInputType().ready(mDataInputTypeList, _behaviorSelector));
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
     * @param mDataInputType The entity of MDataInputType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MDataInputType mDataInputType, ReferrerLoaderHandler<LoaderOfMDataInputType> loaderLambda) {
        xassLRArg(mDataInputType, loaderLambda);
        loaderLambda.handle(new LoaderOfMDataInputType().ready(xnewLRAryLs(mDataInputType), _behaviorSelector));
    }

    /**
     * Load referrer of MDataInputTypeBList by the set-upper of referrer. <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">loadMDataInputTypeBList</span>(<span style="color: #553000">mDataInputTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MDataInputType mDataInputType : <span style="color: #553000">mDataInputTypeList</span>) {
     *     ... = mDataInputType.<span style="color: #CC4747">getMDataInputTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataInputTypeId_InScope(pkList);
     * cb.query().addOrderBy_DataInputTypeId_Asc();
     * </pre>
     * @param mDataInputTypeList The entity list of MDataInputType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDataInputTypeB> loadMDataInputTypeBList(List<MDataInputType> mDataInputTypeList, ConditionBeanSetupper<MDataInputTypeBCB> refCBLambda) {
        xassLRArg(mDataInputTypeList, refCBLambda);
        return doLoadMDataInputTypeBList(mDataInputTypeList, new LoadReferrerOption<MDataInputTypeBCB, MDataInputTypeB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDataInputTypeBList by the set-upper of referrer. <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">loadMDataInputTypeBList</span>(<span style="color: #553000">mDataInputType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mDataInputType</span>.<span style="color: #CC4747">getMDataInputTypeBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataInputTypeId_InScope(pkList);
     * cb.query().addOrderBy_DataInputTypeId_Asc();
     * </pre>
     * @param mDataInputType The entity of MDataInputType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDataInputTypeB> loadMDataInputTypeBList(MDataInputType mDataInputType, ConditionBeanSetupper<MDataInputTypeBCB> refCBLambda) {
        xassLRArg(mDataInputType, refCBLambda);
        return doLoadMDataInputTypeBList(xnewLRLs(mDataInputType), new LoadReferrerOption<MDataInputTypeBCB, MDataInputTypeB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mDataInputType The entity of MDataInputType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDataInputTypeB> loadMDataInputTypeBList(MDataInputType mDataInputType, LoadReferrerOption<MDataInputTypeBCB, MDataInputTypeB> loadReferrerOption) {
        xassLRArg(mDataInputType, loadReferrerOption);
        return loadMDataInputTypeBList(xnewLRLs(mDataInputType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mDataInputTypeList The entity list of MDataInputType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDataInputTypeB> loadMDataInputTypeBList(List<MDataInputType> mDataInputTypeList, LoadReferrerOption<MDataInputTypeBCB, MDataInputTypeB> loadReferrerOption) {
        xassLRArg(mDataInputTypeList, loadReferrerOption);
        if (mDataInputTypeList.isEmpty()) { return (NestedReferrerListGateway<MDataInputTypeB>)EMPTY_NREF_LGWAY; }
        return doLoadMDataInputTypeBList(mDataInputTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDataInputTypeB> doLoadMDataInputTypeBList(List<MDataInputType> mDataInputTypeList, LoadReferrerOption<MDataInputTypeBCB, MDataInputTypeB> option) {
        return helpLoadReferrerInternally(mDataInputTypeList, option, "mDataInputTypeBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mDataInputTypeList The list of mDataInputType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDataInputTypeCd(List<MDataInputType> mDataInputTypeList)
    { return helpPulloutInternally(mDataInputTypeList, "bClassDtlByDataInputTypeCd"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key dataInputTypeId.
     * @param mDataInputTypeList The list of mDataInputType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDataInputTypeIdList(List<MDataInputType> mDataInputTypeList)
    { return helpExtractListInternally(mDataInputTypeList, "dataInputTypeId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mDataInputType.setFoo...(value);
     * mDataInputType.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDataInputType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDataInputType.set...;</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">insert</span>(mDataInputType);
     * ... = mDataInputType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mDataInputType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MDataInputType mDataInputType) {
        doInsert(mDataInputType, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDataInputType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDataInputType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDataInputType.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDataInputType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">update</span>(mDataInputType);
     * </pre>
     * @param mDataInputType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MDataInputType mDataInputType) {
        doUpdate(mDataInputType, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDataInputType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDataInputType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDataInputType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mDataInputType);
     * </pre>
     * @param mDataInputType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MDataInputType mDataInputType) {
        doUpdateNonstrict(mDataInputType, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mDataInputType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MDataInputType mDataInputType) {
        doInsertOrUpdate(mDataInputType, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mDataInputType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MDataInputType mDataInputType) {
        doInsertOrUpdateNonstrict(mDataInputType, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDataInputType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">delete</span>(mDataInputType);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mDataInputType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MDataInputType mDataInputType) {
        doDelete(mDataInputType, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mDataInputType);
     * </pre>
     * @param mDataInputType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MDataInputType mDataInputType) {
        doDeleteNonstrict(mDataInputType, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mDataInputType);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mDataInputType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MDataInputType mDataInputType) {
        doDeleteNonstrictIgnoreDeleted(mDataInputType, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MDataInputType et, final DeleteOption<MDataInputTypeCB> op) {
        assertObjectNotNull("mDataInputType", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     *     mDataInputType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDataInputType.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mDataInputTypeList.add(mDataInputType);
     * }
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchInsert</span>(mDataInputTypeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MDataInputType> mDataInputTypeList) {
        return doBatchInsert(mDataInputTypeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     *     mDataInputType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDataInputType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mDataInputType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mDataInputType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mDataInputTypeList.add(mDataInputType);
     * }
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDataInputTypeList);
     * </pre>
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MDataInputType> mDataInputTypeList) {
        return doBatchUpdate(mDataInputTypeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mDataInputTypeBhv.<span style="color: #CC4747">batchUpdate</span>(mDataInputTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDataInputTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MDataInputType> mDataInputTypeList, SpecifyQuery<MDataInputTypeCB> colCBLambda) {
        return doBatchUpdate(mDataInputTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     *     mDataInputType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mDataInputType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mDataInputType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mDataInputType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mDataInputTypeList.add(mDataInputType);
     * }
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mDataInputTypeList);
     * </pre>
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MDataInputType> mDataInputTypeList) {
        return doBatchUpdateNonstrict(mDataInputTypeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mDataInputTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mDataInputTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MDataInputType> mDataInputTypeList, SpecifyQuery<MDataInputTypeCB> colCBLambda) {
        return doBatchUpdateNonstrict(mDataInputTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MDataInputType> mDataInputTypeList) {
        return doBatchDelete(mDataInputTypeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MDataInputType> mDataInputTypeList) {
        return doBatchDeleteNonstrict(mDataInputTypeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MDataInputType, MDataInputTypeCB&gt;() {
     *     public ConditionBean setup(MDataInputType entity, MDataInputTypeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MDataInputType, MDataInputTypeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mDataInputType.setPK...(value);</span>
     * mDataInputType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mDataInputType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mDataInputType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mDataInputType, cb);
     * </pre>
     * @param mDataInputType The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MDataInputType mDataInputType, MDataInputTypeCB cb) {
        return doQueryUpdate(mDataInputType, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MDataInputTypeCB cb = new MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(mDataInputType, cb);
     * </pre>
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MDataInputTypeCB cb) {
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
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mDataInputType.setFoo...(value);
     * mDataInputType.setBar...(value);
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mDataInputType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mDataInputType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mDataInputType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, InsertOption<MDataInputTypeCB>> opLambda) {
        doInsert(mDataInputType, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDataInputType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mDataInputType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mDataInputType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mDataInputType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> opLambda) {
        doUpdate(mDataInputType, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * mDataInputType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mDataInputType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mDataInputType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mDataInputType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> opLambda) {
        doUpdateNonstrict(mDataInputType, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mDataInputType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, InsertOption<MDataInputTypeCB>> insertOpLambda, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> updateOpLambda) {
        doInsertOrUpdate(mDataInputType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mDataInputType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, InsertOption<MDataInputTypeCB>> insertOpLambda, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mDataInputType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mDataInputType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, DeleteOption<MDataInputTypeCB>> opLambda) {
        doDelete(mDataInputType, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mDataInputType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MDataInputType mDataInputType, WritableOptionCall<MDataInputTypeCB, DeleteOption<MDataInputTypeCB>> opLambda) {
        doDeleteNonstrict(mDataInputType, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MDataInputType> mDataInputTypeList, WritableOptionCall<MDataInputTypeCB, InsertOption<MDataInputTypeCB>> opLambda) {
        return doBatchInsert(mDataInputTypeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MDataInputType> mDataInputTypeList, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> opLambda) {
        return doBatchUpdate(mDataInputTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MDataInputType> mDataInputTypeList, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> opLambda) {
        return doBatchUpdateNonstrict(mDataInputTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MDataInputType> mDataInputTypeList, WritableOptionCall<MDataInputTypeCB, DeleteOption<MDataInputTypeCB>> opLambda) {
        return doBatchDelete(mDataInputTypeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mDataInputTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MDataInputType> mDataInputTypeList, WritableOptionCall<MDataInputTypeCB, DeleteOption<MDataInputTypeCB>> opLambda) {
        return doBatchDeleteNonstrict(mDataInputTypeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MDataInputType, MDataInputTypeCB> manyArgLambda, WritableOptionCall<MDataInputTypeCB, InsertOption<MDataInputTypeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MDataInputType mDataInputType = <span style="color: #70226C">new</span> MDataInputType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mDataInputType.setPK...(value);</span>
     * mDataInputType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mDataInputType.setVersionNo(value);</span>
     * MDataInputTypeCB cb = <span style="color: #70226C">new</span> MDataInputTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mDataInputType, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mDataInputType The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MDataInputType mDataInputType, MDataInputTypeCB cb, WritableOptionCall<MDataInputTypeCB, UpdateOption<MDataInputTypeCB>> opLambda) {
        return doQueryUpdate(mDataInputType, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MDataInputType. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MDataInputTypeCB cb, WritableOptionCall<MDataInputTypeCB, DeleteOption<MDataInputTypeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mDataInputTypeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mDataInputTypeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mDataInputTypeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mDataInputTypeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mDataInputTypeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mDataInputTypeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mDataInputTypeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mDataInputTypeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mDataInputTypeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mDataInputTypeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mDataInputTypeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mDataInputTypeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mDataInputTypeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mDataInputTypeBhv.outideSql().removeBlockComment().selectList()
     * mDataInputTypeBhv.outideSql().removeLineComment().selectList()
     * mDataInputTypeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MDataInputTypeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MDataInputTypeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MDataInputType> typeOfSelectedEntity() { return MDataInputType.class; }
    protected Class<MDataInputType> typeOfHandlingEntity() { return MDataInputType.class; }
    protected Class<MDataInputTypeCB> typeOfHandlingConditionBean() { return MDataInputTypeCB.class; }
}
