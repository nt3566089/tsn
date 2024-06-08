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
 * The behavior of P_PRINT_REQUEST_HIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_REQUEST_HIST_ID
 *
 * [column]
 *     PRINT_REQUEST_HIST_ID, PRINT_REQUEST_ID, PRINT_REQUEST_NO, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_RESULT_CLASS, PROCESS_INFO, QUEUE_ADD_DT, PRINT_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest, bClassDtlBySheetCollate, bClassDtlByPrintResultClass
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrintRequestHistBhv extends AbstractBehaviorWritable<PPrintRequestHist, PPrintRequestHistCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PPrintRequestHistDbm asDBMeta() { return PPrintRequestHistDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_PRINT_REQUEST_HIST"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PPrintRequestHistDbm getMyDBMeta() { return PPrintRequestHistDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PPrintRequestHistCB newConditionBean() { return new PPrintRequestHistCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PPrintRequestHist newMyEntity() { return new PPrintRequestHist(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PPrintRequestHistCB newMyConditionBean() { return new PPrintRequestHistCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PPrintRequestHistCB cb) {
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
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * PPrintRequestHist pPrintRequestHist = <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pPrintRequestHist != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pPrintRequestHist.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrintRequestHist selectEntity(PPrintRequestHistCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PPrintRequestHist facadeSelectEntity(PPrintRequestHistCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrintRequestHist> OptionalEntity<ENTITY> doSelectOptionalEntity(PPrintRequestHistCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().set...;
     * PPrintRequestHist pPrintRequestHist = <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pPrintRequestHist.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrintRequestHist selectEntityWithDeletedCheck(PPrintRequestHistCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param printRequestHistId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrintRequestHist selectByPKValue(Long printRequestHistId) {
        return facadeSelectByPKValue(printRequestHistId);
    }

    protected PPrintRequestHist facadeSelectByPKValue(Long printRequestHistId) {
        return doSelectByPK(printRequestHistId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrintRequestHist> ENTITY doSelectByPK(Long printRequestHistId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(printRequestHistId), tp);
    }

    protected <ENTITY extends PPrintRequestHist> OptionalEntity<ENTITY> doSelectOptionalByPK(Long printRequestHistId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(printRequestHistId, tp), printRequestHistId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param printRequestHistId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrintRequestHist selectByPKValueWithDeletedCheck(Long printRequestHistId) {
        return doSelectByPKWithDeletedCheck(printRequestHistId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrintRequestHist> ENTITY doSelectByPKWithDeletedCheck(Long printRequestHistId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(printRequestHistId), tp);
    }

    protected PPrintRequestHistCB xprepareCBAsPK(Long printRequestHistId) {
        assertObjectNotNull("printRequestHistId", printRequestHistId);
        return newConditionBean().acceptPK(printRequestHistId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param printRequestId : UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST. (NotNull)
     * @param printRequestNo : +UQ, NotNull, bigint(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PPrintRequestHist> selectByUniqueOf(Long printRequestId, Long printRequestNo) {
        return facadeSelectByUniqueOf(printRequestId, printRequestNo);
    }

    protected OptionalEntity<PPrintRequestHist> facadeSelectByUniqueOf(Long printRequestId, Long printRequestNo) {
        return doSelectByUniqueOf(printRequestId, printRequestNo, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrintRequestHist> OptionalEntity<ENTITY> doSelectByUniqueOf(Long printRequestId, Long printRequestNo, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(printRequestId, printRequestNo), tp), printRequestId, printRequestNo);
    }

    protected PPrintRequestHistCB xprepareCBAsUniqueOf(Long printRequestId, Long printRequestNo) {
        assertObjectNotNull("printRequestId", printRequestId);assertObjectNotNull("printRequestNo", printRequestNo);
        return newConditionBean().acceptUniqueOf(printRequestId, printRequestNo);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PPrintRequestHist&gt; <span style="color: #553000">pPrintRequestHistList</span> = <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PPrintRequestHist pPrintRequestHist : <span style="color: #553000">pPrintRequestHistList</span>) {
     *     ... = pPrintRequestHist.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PPrintRequestHist> selectList(PPrintRequestHistCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PPrintRequestHist&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PPrintRequestHist pPrintRequestHist : <span style="color: #553000">page</span>) {
     *     ... = pPrintRequestHist.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PPrintRequestHist> selectPage(PPrintRequestHistCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().set...
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @param entityRowHandler The handler of entity row of PPrintRequestHist. (NotNull)
     */
    public void selectCursor(PPrintRequestHistCB cb, EntityRowHandler<PPrintRequestHist> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrintRequestHistCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrintRequestHistCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pPrintRequestHistList The entity list of PPrintRequestHist. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PPrintRequestHist> pPrintRequestHistList, ReferrerLoaderHandler<LoaderOfPPrintRequestHist> loaderLambda) {
        xassLRArg(pPrintRequestHistList, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrintRequestHist().ready(pPrintRequestHistList, _behaviorSelector));
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
     * @param pPrintRequestHist The entity of PPrintRequestHist. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PPrintRequestHist pPrintRequestHist, ReferrerLoaderHandler<LoaderOfPPrintRequestHist> loaderLambda) {
        xassLRArg(pPrintRequestHist, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrintRequestHist().ready(xnewLRAryLs(pPrintRequestHist), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PPrintRequest'.
     * @param pPrintRequestHistList The list of pPrintRequestHist. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrintRequest> pulloutPPrintRequest(List<PPrintRequestHist> pPrintRequestHistList)
    { return helpPulloutInternally(pPrintRequestHistList, "pPrintRequest"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pPrintRequestHistList The list of pPrintRequestHist. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySheetCollate(List<PPrintRequestHist> pPrintRequestHistList)
    { return helpPulloutInternally(pPrintRequestHistList, "bClassDtlBySheetCollate"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pPrintRequestHistList The list of pPrintRequestHist. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPrintResultClass(List<PPrintRequestHist> pPrintRequestHistList)
    { return helpPulloutInternally(pPrintRequestHistList, "bClassDtlByPrintResultClass"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key printRequestHistId.
     * @param pPrintRequestHistList The list of pPrintRequestHist. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPrintRequestHistIdList(List<PPrintRequestHist> pPrintRequestHistList)
    { return helpExtractListInternally(pPrintRequestHistList, "printRequestHistId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrintRequestHist.setFoo...(value);
     * pPrintRequestHist.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.set...;</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">insert</span>(pPrintRequestHist);
     * ... = pPrintRequestHist.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pPrintRequestHist The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PPrintRequestHist pPrintRequestHist) {
        doInsert(pPrintRequestHist, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrintRequestHist.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrintRequestHist.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">update</span>(pPrintRequestHist);
     * </pre>
     * @param pPrintRequestHist The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PPrintRequestHist pPrintRequestHist) {
        doUpdate(pPrintRequestHist, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrintRequestHist.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pPrintRequestHist);
     * </pre>
     * @param pPrintRequestHist The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PPrintRequestHist pPrintRequestHist) {
        doUpdateNonstrict(pPrintRequestHist, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrintRequestHist The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PPrintRequestHist pPrintRequestHist) {
        doInsertOrUpdate(pPrintRequestHist, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrintRequestHist The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PPrintRequestHist pPrintRequestHist) {
        doInsertOrUpdateNonstrict(pPrintRequestHist, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrintRequestHist.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">delete</span>(pPrintRequestHist);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pPrintRequestHist The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PPrintRequestHist pPrintRequestHist) {
        doDelete(pPrintRequestHist, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pPrintRequestHist);
     * </pre>
     * @param pPrintRequestHist The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PPrintRequestHist pPrintRequestHist) {
        doDeleteNonstrict(pPrintRequestHist, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pPrintRequestHist);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pPrintRequestHist The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PPrintRequestHist pPrintRequestHist) {
        doDeleteNonstrictIgnoreDeleted(pPrintRequestHist, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PPrintRequestHist et, final DeleteOption<PPrintRequestHistCB> op) {
        assertObjectNotNull("pPrintRequestHist", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     *     pPrintRequestHist.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrintRequestHist.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pPrintRequestHistList.add(pPrintRequestHist);
     * }
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchInsert</span>(pPrintRequestHistList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PPrintRequestHist> pPrintRequestHistList) {
        return doBatchInsert(pPrintRequestHistList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     *     pPrintRequestHist.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrintRequestHist.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrintRequestHist.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrintRequestHist.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrintRequestHistList.add(pPrintRequestHist);
     * }
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrintRequestHistList);
     * </pre>
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrintRequestHist> pPrintRequestHistList) {
        return doBatchUpdate(pPrintRequestHistList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pPrintRequestHistBhv.<span style="color: #CC4747">batchUpdate</span>(pPrintRequestHistList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrintRequestHistList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrintRequestHist> pPrintRequestHistList, SpecifyQuery<PPrintRequestHistCB> colCBLambda) {
        return doBatchUpdate(pPrintRequestHistList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     *     pPrintRequestHist.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrintRequestHist.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrintRequestHist.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrintRequestHist.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrintRequestHistList.add(pPrintRequestHist);
     * }
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrintRequestHistList);
     * </pre>
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrintRequestHist> pPrintRequestHistList) {
        return doBatchUpdateNonstrict(pPrintRequestHistList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrintRequestHistList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrintRequestHistList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrintRequestHist> pPrintRequestHistList, SpecifyQuery<PPrintRequestHistCB> colCBLambda) {
        return doBatchUpdateNonstrict(pPrintRequestHistList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PPrintRequestHist> pPrintRequestHistList) {
        return doBatchDelete(pPrintRequestHistList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PPrintRequestHist> pPrintRequestHistList) {
        return doBatchDeleteNonstrict(pPrintRequestHistList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PPrintRequestHist, PPrintRequestHistCB&gt;() {
     *     public ConditionBean setup(PPrintRequestHist entity, PPrintRequestHistCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PPrintRequestHist, PPrintRequestHistCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setPK...(value);</span>
     * pPrintRequestHist.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pPrintRequestHist, cb);
     * </pre>
     * @param pPrintRequestHist The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PPrintRequestHist pPrintRequestHist, PPrintRequestHistCB cb) {
        return doQueryUpdate(pPrintRequestHist, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PPrintRequestHistCB cb = new PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">queryDelete</span>(pPrintRequestHist, cb);
     * </pre>
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PPrintRequestHistCB cb) {
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
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrintRequestHist.setFoo...(value);
     * pPrintRequestHist.setBar...(value);
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pPrintRequestHist, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pPrintRequestHist.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pPrintRequestHist The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, InsertOption<PPrintRequestHistCB>> opLambda) {
        doInsert(pPrintRequestHist, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrintRequestHist.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrintRequestHist.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pPrintRequestHist, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrintRequestHist The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> opLambda) {
        doUpdate(pPrintRequestHist, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * pPrintRequestHist.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrintRequestHist.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pPrintRequestHist, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrintRequestHist The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> opLambda) {
        doUpdateNonstrict(pPrintRequestHist, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pPrintRequestHist The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, InsertOption<PPrintRequestHistCB>> insertOpLambda, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> updateOpLambda) {
        doInsertOrUpdate(pPrintRequestHist, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pPrintRequestHist The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, InsertOption<PPrintRequestHistCB>> insertOpLambda, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pPrintRequestHist, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pPrintRequestHist The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, DeleteOption<PPrintRequestHistCB>> opLambda) {
        doDelete(pPrintRequestHist, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pPrintRequestHist The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PPrintRequestHist pPrintRequestHist, WritableOptionCall<PPrintRequestHistCB, DeleteOption<PPrintRequestHistCB>> opLambda) {
        doDeleteNonstrict(pPrintRequestHist, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PPrintRequestHist> pPrintRequestHistList, WritableOptionCall<PPrintRequestHistCB, InsertOption<PPrintRequestHistCB>> opLambda) {
        return doBatchInsert(pPrintRequestHistList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PPrintRequestHist> pPrintRequestHistList, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> opLambda) {
        return doBatchUpdate(pPrintRequestHistList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PPrintRequestHist> pPrintRequestHistList, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> opLambda) {
        return doBatchUpdateNonstrict(pPrintRequestHistList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PPrintRequestHist> pPrintRequestHistList, WritableOptionCall<PPrintRequestHistCB, DeleteOption<PPrintRequestHistCB>> opLambda) {
        return doBatchDelete(pPrintRequestHistList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pPrintRequestHistList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PPrintRequestHist> pPrintRequestHistList, WritableOptionCall<PPrintRequestHistCB, DeleteOption<PPrintRequestHistCB>> opLambda) {
        return doBatchDeleteNonstrict(pPrintRequestHistList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PPrintRequestHist, PPrintRequestHistCB> manyArgLambda, WritableOptionCall<PPrintRequestHistCB, InsertOption<PPrintRequestHistCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrintRequestHist pPrintRequestHist = <span style="color: #70226C">new</span> PPrintRequestHist();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setPK...(value);</span>
     * pPrintRequestHist.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrintRequestHist.setVersionNo(value);</span>
     * PPrintRequestHistCB cb = <span style="color: #70226C">new</span> PPrintRequestHistCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrintRequestHistBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pPrintRequestHist, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrintRequestHist The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PPrintRequestHist pPrintRequestHist, PPrintRequestHistCB cb, WritableOptionCall<PPrintRequestHistCB, UpdateOption<PPrintRequestHistCB>> opLambda) {
        return doQueryUpdate(pPrintRequestHist, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PPrintRequestHist. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PPrintRequestHistCB cb, WritableOptionCall<PPrintRequestHistCB, DeleteOption<PPrintRequestHistCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pPrintRequestHistBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pPrintRequestHistBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrintRequestHistBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pPrintRequestHistBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrintRequestHistBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pPrintRequestHistBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pPrintRequestHistBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pPrintRequestHistBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pPrintRequestHistBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pPrintRequestHistBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pPrintRequestHistBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pPrintRequestHistBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pPrintRequestHistBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pPrintRequestHistBhv.outideSql().removeBlockComment().selectList()
     * pPrintRequestHistBhv.outideSql().removeLineComment().selectList()
     * pPrintRequestHistBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PPrintRequestHistBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PPrintRequestHistBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PPrintRequestHist> typeOfSelectedEntity() { return PPrintRequestHist.class; }
    protected Class<PPrintRequestHist> typeOfHandlingEntity() { return PPrintRequestHist.class; }
    protected Class<PPrintRequestHistCB> typeOfHandlingConditionBean() { return PPrintRequestHistCB.class; }
}
