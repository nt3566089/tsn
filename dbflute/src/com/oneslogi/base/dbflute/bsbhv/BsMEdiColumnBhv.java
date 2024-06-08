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
 * The behavior of M_EDI_COLUMN as TABLE. <br>
 * <pre>
 * [primary key]
 *     EDI_COLUMN_ID
 *
 * [column]
 *     EDI_COLUMN_ID, EDI_ID, EDI_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EDI_COLUMN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_EDI
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B
 *
 * [foreign property]
 *     mEdi
 *
 * [referrer property]
 *     mImportTypeBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMEdiColumnBhv extends AbstractBehaviorWritable<MEdiColumn, MEdiColumnCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MEdiColumnDbm asDBMeta() { return MEdiColumnDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_EDI_COLUMN"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MEdiColumnDbm getMyDBMeta() { return MEdiColumnDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MEdiColumnCB newConditionBean() { return new MEdiColumnCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MEdiColumn newMyEntity() { return new MEdiColumn(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MEdiColumnCB newMyConditionBean() { return new MEdiColumnCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MEdiColumnCB cb) {
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
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().setFoo...(value);
     * MEdiColumn mEdiColumn = <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mEdiColumn != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mEdiColumn.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MEdiColumn selectEntity(MEdiColumnCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MEdiColumn facadeSelectEntity(MEdiColumnCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MEdiColumn> OptionalEntity<ENTITY> doSelectOptionalEntity(MEdiColumnCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().set...;
     * MEdiColumn mEdiColumn = <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mEdiColumn.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MEdiColumn selectEntityWithDeletedCheck(MEdiColumnCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param ediColumnId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MEdiColumn selectByPKValue(Long ediColumnId) {
        return facadeSelectByPKValue(ediColumnId);
    }

    protected MEdiColumn facadeSelectByPKValue(Long ediColumnId) {
        return doSelectByPK(ediColumnId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MEdiColumn> ENTITY doSelectByPK(Long ediColumnId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(ediColumnId), tp);
    }

    protected <ENTITY extends MEdiColumn> OptionalEntity<ENTITY> doSelectOptionalByPK(Long ediColumnId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(ediColumnId, tp), ediColumnId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param ediColumnId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MEdiColumn selectByPKValueWithDeletedCheck(Long ediColumnId) {
        return doSelectByPKWithDeletedCheck(ediColumnId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MEdiColumn> ENTITY doSelectByPKWithDeletedCheck(Long ediColumnId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(ediColumnId), tp);
    }

    protected MEdiColumnCB xprepareCBAsPK(Long ediColumnId) {
        assertObjectNotNull("ediColumnId", ediColumnId);
        return newConditionBean().acceptPK(ediColumnId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MEdiColumn&gt; <span style="color: #553000">mEdiColumnList</span> = <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MEdiColumn mEdiColumn : <span style="color: #553000">mEdiColumnList</span>) {
     *     ... = mEdiColumn.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MEdiColumn> selectList(MEdiColumnCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MEdiColumn&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MEdiColumn mEdiColumn : <span style="color: #553000">page</span>) {
     *     ... = mEdiColumn.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MEdiColumn> selectPage(MEdiColumnCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().set...
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @param entityRowHandler The handler of entity row of MEdiColumn. (NotNull)
     */
    public void selectCursor(MEdiColumnCB cb, EntityRowHandler<MEdiColumn> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MEdiColumnCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MEdiColumnCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mEdiColumnList The entity list of MEdiColumn. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MEdiColumn> mEdiColumnList, ReferrerLoaderHandler<LoaderOfMEdiColumn> loaderLambda) {
        xassLRArg(mEdiColumnList, loaderLambda);
        loaderLambda.handle(new LoaderOfMEdiColumn().ready(mEdiColumnList, _behaviorSelector));
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
     * @param mEdiColumn The entity of MEdiColumn. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MEdiColumn mEdiColumn, ReferrerLoaderHandler<LoaderOfMEdiColumn> loaderLambda) {
        xassLRArg(mEdiColumn, loaderLambda);
        loaderLambda.handle(new LoaderOfMEdiColumn().ready(xnewLRAryLs(mEdiColumn), _behaviorSelector));
    }

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">mEdiColumnList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MEdiColumn mEdiColumn : <span style="color: #553000">mEdiColumnList</span>) {
     *     ... = mEdiColumn.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEdiColumnId_InScope(pkList);
     * cb.query().addOrderBy_EdiColumnId_Asc();
     * </pre>
     * @param mEdiColumnList The entity list of MEdiColumn. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(List<MEdiColumn> mEdiColumnList, ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        xassLRArg(mEdiColumnList, refCBLambda);
        return doLoadMImportTypeBList(mEdiColumnList, new LoadReferrerOption<MImportTypeBCB, MImportTypeB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">mEdiColumn</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mEdiColumn</span>.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEdiColumnId_InScope(pkList);
     * cb.query().addOrderBy_EdiColumnId_Asc();
     * </pre>
     * @param mEdiColumn The entity of MEdiColumn. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(MEdiColumn mEdiColumn, ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        xassLRArg(mEdiColumn, refCBLambda);
        return doLoadMImportTypeBList(xnewLRLs(mEdiColumn), new LoadReferrerOption<MImportTypeBCB, MImportTypeB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mEdiColumn The entity of MEdiColumn. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(MEdiColumn mEdiColumn, LoadReferrerOption<MImportTypeBCB, MImportTypeB> loadReferrerOption) {
        xassLRArg(mEdiColumn, loadReferrerOption);
        return loadMImportTypeBList(xnewLRLs(mEdiColumn), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mEdiColumnList The entity list of MEdiColumn. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(List<MEdiColumn> mEdiColumnList, LoadReferrerOption<MImportTypeBCB, MImportTypeB> loadReferrerOption) {
        xassLRArg(mEdiColumnList, loadReferrerOption);
        if (mEdiColumnList.isEmpty()) { return (NestedReferrerListGateway<MImportTypeB>)EMPTY_NREF_LGWAY; }
        return doLoadMImportTypeBList(mEdiColumnList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MImportTypeB> doLoadMImportTypeBList(List<MEdiColumn> mEdiColumnList, LoadReferrerOption<MImportTypeBCB, MImportTypeB> option) {
        return helpLoadReferrerInternally(mEdiColumnList, option, "mImportTypeBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MEdi'.
     * @param mEdiColumnList The list of mEdiColumn. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MEdi> pulloutMEdi(List<MEdiColumn> mEdiColumnList)
    { return helpPulloutInternally(mEdiColumnList, "mEdi"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key ediColumnId.
     * @param mEdiColumnList The list of mEdiColumn. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractEdiColumnIdList(List<MEdiColumn> mEdiColumnList)
    { return helpExtractListInternally(mEdiColumnList, "ediColumnId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mEdiColumn.setFoo...(value);
     * mEdiColumn.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mEdiColumn.set...;</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">insert</span>(mEdiColumn);
     * ... = mEdiColumn.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mEdiColumn The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MEdiColumn mEdiColumn) {
        doInsert(mEdiColumn, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mEdiColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mEdiColumn.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mEdiColumn.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">update</span>(mEdiColumn);
     * </pre>
     * @param mEdiColumn The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MEdiColumn mEdiColumn) {
        doUpdate(mEdiColumn, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mEdiColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mEdiColumn.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mEdiColumn);
     * </pre>
     * @param mEdiColumn The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MEdiColumn mEdiColumn) {
        doUpdateNonstrict(mEdiColumn, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mEdiColumn The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MEdiColumn mEdiColumn) {
        doInsertOrUpdate(mEdiColumn, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mEdiColumn The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MEdiColumn mEdiColumn) {
        doInsertOrUpdateNonstrict(mEdiColumn, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mEdiColumn.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">delete</span>(mEdiColumn);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mEdiColumn The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MEdiColumn mEdiColumn) {
        doDelete(mEdiColumn, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mEdiColumn);
     * </pre>
     * @param mEdiColumn The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MEdiColumn mEdiColumn) {
        doDeleteNonstrict(mEdiColumn, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mEdiColumn);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mEdiColumn The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MEdiColumn mEdiColumn) {
        doDeleteNonstrictIgnoreDeleted(mEdiColumn, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MEdiColumn et, final DeleteOption<MEdiColumnCB> op) {
        assertObjectNotNull("mEdiColumn", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     *     mEdiColumn.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mEdiColumn.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mEdiColumnList.add(mEdiColumn);
     * }
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchInsert</span>(mEdiColumnList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MEdiColumn> mEdiColumnList) {
        return doBatchInsert(mEdiColumnList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     *     mEdiColumn.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mEdiColumn.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mEdiColumn.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mEdiColumn.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mEdiColumnList.add(mEdiColumn);
     * }
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mEdiColumnList);
     * </pre>
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MEdiColumn> mEdiColumnList) {
        return doBatchUpdate(mEdiColumnList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mEdiColumnBhv.<span style="color: #CC4747">batchUpdate</span>(mEdiColumnList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mEdiColumnList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MEdiColumn> mEdiColumnList, SpecifyQuery<MEdiColumnCB> colCBLambda) {
        return doBatchUpdate(mEdiColumnList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     *     mEdiColumn.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mEdiColumn.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mEdiColumn.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mEdiColumn.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mEdiColumnList.add(mEdiColumn);
     * }
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mEdiColumnList);
     * </pre>
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MEdiColumn> mEdiColumnList) {
        return doBatchUpdateNonstrict(mEdiColumnList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mEdiColumnList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mEdiColumnList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MEdiColumn> mEdiColumnList, SpecifyQuery<MEdiColumnCB> colCBLambda) {
        return doBatchUpdateNonstrict(mEdiColumnList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MEdiColumn> mEdiColumnList) {
        return doBatchDelete(mEdiColumnList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MEdiColumn> mEdiColumnList) {
        return doBatchDeleteNonstrict(mEdiColumnList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MEdiColumn, MEdiColumnCB&gt;() {
     *     public ConditionBean setup(MEdiColumn entity, MEdiColumnCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MEdiColumn, MEdiColumnCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setPK...(value);</span>
     * mEdiColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mEdiColumn.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mEdiColumn, cb);
     * </pre>
     * @param mEdiColumn The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MEdiColumn mEdiColumn, MEdiColumnCB cb) {
        return doQueryUpdate(mEdiColumn, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MEdiColumnCB cb = new MEdiColumnCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">queryDelete</span>(mEdiColumn, cb);
     * </pre>
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MEdiColumnCB cb) {
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
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mEdiColumn.setFoo...(value);
     * mEdiColumn.setBar...(value);
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mEdiColumn, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mEdiColumn.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mEdiColumn The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, InsertOption<MEdiColumnCB>> opLambda) {
        doInsert(mEdiColumn, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mEdiColumn.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mEdiColumn.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mEdiColumn, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mEdiColumn The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> opLambda) {
        doUpdate(mEdiColumn, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * mEdiColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mEdiColumn.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mEdiColumn, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mEdiColumn The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> opLambda) {
        doUpdateNonstrict(mEdiColumn, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mEdiColumn The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, InsertOption<MEdiColumnCB>> insertOpLambda, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> updateOpLambda) {
        doInsertOrUpdate(mEdiColumn, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mEdiColumn The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, InsertOption<MEdiColumnCB>> insertOpLambda, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mEdiColumn, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mEdiColumn The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, DeleteOption<MEdiColumnCB>> opLambda) {
        doDelete(mEdiColumn, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mEdiColumn The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MEdiColumn mEdiColumn, WritableOptionCall<MEdiColumnCB, DeleteOption<MEdiColumnCB>> opLambda) {
        doDeleteNonstrict(mEdiColumn, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MEdiColumn> mEdiColumnList, WritableOptionCall<MEdiColumnCB, InsertOption<MEdiColumnCB>> opLambda) {
        return doBatchInsert(mEdiColumnList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MEdiColumn> mEdiColumnList, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> opLambda) {
        return doBatchUpdate(mEdiColumnList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MEdiColumn> mEdiColumnList, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> opLambda) {
        return doBatchUpdateNonstrict(mEdiColumnList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MEdiColumn> mEdiColumnList, WritableOptionCall<MEdiColumnCB, DeleteOption<MEdiColumnCB>> opLambda) {
        return doBatchDelete(mEdiColumnList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mEdiColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MEdiColumn> mEdiColumnList, WritableOptionCall<MEdiColumnCB, DeleteOption<MEdiColumnCB>> opLambda) {
        return doBatchDeleteNonstrict(mEdiColumnList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MEdiColumn, MEdiColumnCB> manyArgLambda, WritableOptionCall<MEdiColumnCB, InsertOption<MEdiColumnCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MEdiColumn mEdiColumn = <span style="color: #70226C">new</span> MEdiColumn();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setPK...(value);</span>
     * mEdiColumn.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mEdiColumn.setVersionNo(value);</span>
     * MEdiColumnCB cb = <span style="color: #70226C">new</span> MEdiColumnCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mEdiColumn, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mEdiColumn The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MEdiColumn mEdiColumn, MEdiColumnCB cb, WritableOptionCall<MEdiColumnCB, UpdateOption<MEdiColumnCB>> opLambda) {
        return doQueryUpdate(mEdiColumn, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MEdiColumn. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MEdiColumnCB cb, WritableOptionCall<MEdiColumnCB, DeleteOption<MEdiColumnCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mEdiColumnBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mEdiColumnBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mEdiColumnBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mEdiColumnBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mEdiColumnBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mEdiColumnBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mEdiColumnBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mEdiColumnBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mEdiColumnBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mEdiColumnBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mEdiColumnBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mEdiColumnBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mEdiColumnBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mEdiColumnBhv.outideSql().removeBlockComment().selectList()
     * mEdiColumnBhv.outideSql().removeLineComment().selectList()
     * mEdiColumnBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MEdiColumnBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MEdiColumnBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MEdiColumn> typeOfSelectedEntity() { return MEdiColumn.class; }
    protected Class<MEdiColumn> typeOfHandlingEntity() { return MEdiColumn.class; }
    protected Class<MEdiColumnCB> typeOfHandlingConditionBean() { return MEdiColumnCB.class; }
}
