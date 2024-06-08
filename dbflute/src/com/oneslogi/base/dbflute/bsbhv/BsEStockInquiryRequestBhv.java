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
 * The behavior of E_STOCK_INQUIRY_REQUEST as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_INQUIRY_REQUEST_ID
 *
 * [column]
 *     STOCK_INQUIRY_REQUEST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INV_INQ_NO, INV_INQ_DATE, COMPANY_CD, ITEM_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INQUIRY_REQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEStockInquiryRequestBhv extends AbstractBehaviorWritable<EStockInquiryRequest, EStockInquiryRequestCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public EStockInquiryRequestDbm asDBMeta() { return EStockInquiryRequestDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "E_STOCK_INQUIRY_REQUEST"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EStockInquiryRequestDbm getMyDBMeta() { return EStockInquiryRequestDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public EStockInquiryRequestCB newConditionBean() { return new EStockInquiryRequestCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EStockInquiryRequest newMyEntity() { return new EStockInquiryRequest(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EStockInquiryRequestCB newMyConditionBean() { return new EStockInquiryRequestCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(EStockInquiryRequestCB cb) {
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
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (eStockInquiryRequest != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = eStockInquiryRequest.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EStockInquiryRequest selectEntity(EStockInquiryRequestCB cb) {
        return facadeSelectEntity(cb);
    }

    protected EStockInquiryRequest facadeSelectEntity(EStockInquiryRequestCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends EStockInquiryRequest> OptionalEntity<ENTITY> doSelectOptionalEntity(EStockInquiryRequestCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().set...;
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = eStockInquiryRequest.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EStockInquiryRequest selectEntityWithDeletedCheck(EStockInquiryRequestCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param stockInquiryRequestId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EStockInquiryRequest selectByPKValue(Long stockInquiryRequestId) {
        return facadeSelectByPKValue(stockInquiryRequestId);
    }

    protected EStockInquiryRequest facadeSelectByPKValue(Long stockInquiryRequestId) {
        return doSelectByPK(stockInquiryRequestId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EStockInquiryRequest> ENTITY doSelectByPK(Long stockInquiryRequestId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(stockInquiryRequestId), tp);
    }

    protected <ENTITY extends EStockInquiryRequest> OptionalEntity<ENTITY> doSelectOptionalByPK(Long stockInquiryRequestId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(stockInquiryRequestId, tp), stockInquiryRequestId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stockInquiryRequestId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EStockInquiryRequest selectByPKValueWithDeletedCheck(Long stockInquiryRequestId) {
        return doSelectByPKWithDeletedCheck(stockInquiryRequestId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EStockInquiryRequest> ENTITY doSelectByPKWithDeletedCheck(Long stockInquiryRequestId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(stockInquiryRequestId), tp);
    }

    protected EStockInquiryRequestCB xprepareCBAsPK(Long stockInquiryRequestId) {
        assertObjectNotNull("stockInquiryRequestId", stockInquiryRequestId);
        return newConditionBean().acceptPK(stockInquiryRequestId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param receiveCd : UQ+, IX, NotNull, varchar(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, bigint(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<EStockInquiryRequest> selectByUniqueOf(String receiveCd, Long receiveRowId) {
        return facadeSelectByUniqueOf(receiveCd, receiveRowId);
    }

    protected OptionalEntity<EStockInquiryRequest> facadeSelectByUniqueOf(String receiveCd, Long receiveRowId) {
        return doSelectByUniqueOf(receiveCd, receiveRowId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EStockInquiryRequest> OptionalEntity<ENTITY> doSelectByUniqueOf(String receiveCd, Long receiveRowId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(receiveCd, receiveRowId), tp), receiveCd, receiveRowId);
    }

    protected EStockInquiryRequestCB xprepareCBAsUniqueOf(String receiveCd, Long receiveRowId) {
        assertObjectNotNull("receiveCd", receiveCd);assertObjectNotNull("receiveRowId", receiveRowId);
        return newConditionBean().acceptUniqueOf(receiveCd, receiveRowId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;EStockInquiryRequest&gt; <span style="color: #553000">eStockInquiryRequestList</span> = <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (EStockInquiryRequest eStockInquiryRequest : <span style="color: #553000">eStockInquiryRequestList</span>) {
     *     ... = eStockInquiryRequest.get...;
     * }
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EStockInquiryRequest> selectList(EStockInquiryRequestCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EStockInquiryRequest&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (EStockInquiryRequest eStockInquiryRequest : <span style="color: #553000">page</span>) {
     *     ... = eStockInquiryRequest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EStockInquiryRequest> selectPage(EStockInquiryRequestCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().set...
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @param entityRowHandler The handler of entity row of EStockInquiryRequest. (NotNull)
     */
    public void selectCursor(EStockInquiryRequestCB cb, EntityRowHandler<EStockInquiryRequest> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EStockInquiryRequestCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EStockInquiryRequestCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param eStockInquiryRequestList The entity list of EStockInquiryRequest. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<EStockInquiryRequest> eStockInquiryRequestList, ReferrerLoaderHandler<LoaderOfEStockInquiryRequest> loaderLambda) {
        xassLRArg(eStockInquiryRequestList, loaderLambda);
        loaderLambda.handle(new LoaderOfEStockInquiryRequest().ready(eStockInquiryRequestList, _behaviorSelector));
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
     * @param eStockInquiryRequest The entity of EStockInquiryRequest. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(EStockInquiryRequest eStockInquiryRequest, ReferrerLoaderHandler<LoaderOfEStockInquiryRequest> loaderLambda) {
        xassLRArg(eStockInquiryRequest, loaderLambda);
        loaderLambda.handle(new LoaderOfEStockInquiryRequest().ready(xnewLRAryLs(eStockInquiryRequest), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key stockInquiryRequestId.
     * @param eStockInquiryRequestList The list of eStockInquiryRequest. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractStockInquiryRequestIdList(List<EStockInquiryRequest> eStockInquiryRequestList)
    { return helpExtractListInternally(eStockInquiryRequestList, "stockInquiryRequestId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eStockInquiryRequest.setFoo...(value);
     * eStockInquiryRequest.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.set...;</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">insert</span>(eStockInquiryRequest);
     * ... = eStockInquiryRequest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param eStockInquiryRequest The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(EStockInquiryRequest eStockInquiryRequest) {
        doInsert(eStockInquiryRequest, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eStockInquiryRequest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eStockInquiryRequest.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">update</span>(eStockInquiryRequest);
     * </pre>
     * @param eStockInquiryRequest The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(EStockInquiryRequest eStockInquiryRequest) {
        doUpdate(eStockInquiryRequest, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eStockInquiryRequest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(eStockInquiryRequest);
     * </pre>
     * @param eStockInquiryRequest The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(EStockInquiryRequest eStockInquiryRequest) {
        doUpdateNonstrict(eStockInquiryRequest, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eStockInquiryRequest The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(EStockInquiryRequest eStockInquiryRequest) {
        doInsertOrUpdate(eStockInquiryRequest, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eStockInquiryRequest The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(EStockInquiryRequest eStockInquiryRequest) {
        doInsertOrUpdateNonstrict(eStockInquiryRequest, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eStockInquiryRequest.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">delete</span>(eStockInquiryRequest);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param eStockInquiryRequest The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EStockInquiryRequest eStockInquiryRequest) {
        doDelete(eStockInquiryRequest, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(eStockInquiryRequest);
     * </pre>
     * @param eStockInquiryRequest The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(EStockInquiryRequest eStockInquiryRequest) {
        doDeleteNonstrict(eStockInquiryRequest, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(eStockInquiryRequest);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param eStockInquiryRequest The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(EStockInquiryRequest eStockInquiryRequest) {
        doDeleteNonstrictIgnoreDeleted(eStockInquiryRequest, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(EStockInquiryRequest et, final DeleteOption<EStockInquiryRequestCB> op) {
        assertObjectNotNull("eStockInquiryRequest", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     *     eStockInquiryRequest.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eStockInquiryRequest.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     eStockInquiryRequestList.add(eStockInquiryRequest);
     * }
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchInsert</span>(eStockInquiryRequestList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<EStockInquiryRequest> eStockInquiryRequestList) {
        return doBatchInsert(eStockInquiryRequestList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     *     eStockInquiryRequest.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eStockInquiryRequest.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eStockInquiryRequest.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eStockInquiryRequest.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eStockInquiryRequestList.add(eStockInquiryRequest);
     * }
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eStockInquiryRequestList);
     * </pre>
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EStockInquiryRequest> eStockInquiryRequestList) {
        return doBatchUpdate(eStockInquiryRequestList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * eStockInquiryRequestBhv.<span style="color: #CC4747">batchUpdate</span>(eStockInquiryRequestList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eStockInquiryRequestList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EStockInquiryRequest> eStockInquiryRequestList, SpecifyQuery<EStockInquiryRequestCB> colCBLambda) {
        return doBatchUpdate(eStockInquiryRequestList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     *     eStockInquiryRequest.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eStockInquiryRequest.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eStockInquiryRequest.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eStockInquiryRequest.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eStockInquiryRequestList.add(eStockInquiryRequest);
     * }
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eStockInquiryRequestList);
     * </pre>
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EStockInquiryRequest> eStockInquiryRequestList) {
        return doBatchUpdateNonstrict(eStockInquiryRequestList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eStockInquiryRequestList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eStockInquiryRequestList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EStockInquiryRequest> eStockInquiryRequestList, SpecifyQuery<EStockInquiryRequestCB> colCBLambda) {
        return doBatchUpdateNonstrict(eStockInquiryRequestList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<EStockInquiryRequest> eStockInquiryRequestList) {
        return doBatchDelete(eStockInquiryRequestList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<EStockInquiryRequest> eStockInquiryRequestList) {
        return doBatchDeleteNonstrict(eStockInquiryRequestList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;EStockInquiryRequest, EStockInquiryRequestCB&gt;() {
     *     public ConditionBean setup(EStockInquiryRequest entity, EStockInquiryRequestCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EStockInquiryRequest, EStockInquiryRequestCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setPK...(value);</span>
     * eStockInquiryRequest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">queryUpdate</span>(eStockInquiryRequest, cb);
     * </pre>
     * @param eStockInquiryRequest The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EStockInquiryRequest eStockInquiryRequest, EStockInquiryRequestCB cb) {
        return doQueryUpdate(eStockInquiryRequest, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * EStockInquiryRequestCB cb = new EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">queryDelete</span>(eStockInquiryRequest, cb);
     * </pre>
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EStockInquiryRequestCB cb) {
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
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eStockInquiryRequest.setFoo...(value);
     * eStockInquiryRequest.setBar...(value);
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">varyingInsert</span>(eStockInquiryRequest, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = eStockInquiryRequest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param eStockInquiryRequest The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, InsertOption<EStockInquiryRequestCB>> opLambda) {
        doInsert(eStockInquiryRequest, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eStockInquiryRequest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eStockInquiryRequest.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(eStockInquiryRequest, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eStockInquiryRequest The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> opLambda) {
        doUpdate(eStockInquiryRequest, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * eStockInquiryRequest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eStockInquiryRequest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(eStockInquiryRequest, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eStockInquiryRequest The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> opLambda) {
        doUpdateNonstrict(eStockInquiryRequest, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param eStockInquiryRequest The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, InsertOption<EStockInquiryRequestCB>> insertOpLambda, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> updateOpLambda) {
        doInsertOrUpdate(eStockInquiryRequest, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param eStockInquiryRequest The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, InsertOption<EStockInquiryRequestCB>> insertOpLambda, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(eStockInquiryRequest, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param eStockInquiryRequest The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, DeleteOption<EStockInquiryRequestCB>> opLambda) {
        doDelete(eStockInquiryRequest, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param eStockInquiryRequest The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(EStockInquiryRequest eStockInquiryRequest, WritableOptionCall<EStockInquiryRequestCB, DeleteOption<EStockInquiryRequestCB>> opLambda) {
        doDeleteNonstrict(eStockInquiryRequest, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<EStockInquiryRequest> eStockInquiryRequestList, WritableOptionCall<EStockInquiryRequestCB, InsertOption<EStockInquiryRequestCB>> opLambda) {
        return doBatchInsert(eStockInquiryRequestList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<EStockInquiryRequest> eStockInquiryRequestList, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> opLambda) {
        return doBatchUpdate(eStockInquiryRequestList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<EStockInquiryRequest> eStockInquiryRequestList, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> opLambda) {
        return doBatchUpdateNonstrict(eStockInquiryRequestList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<EStockInquiryRequest> eStockInquiryRequestList, WritableOptionCall<EStockInquiryRequestCB, DeleteOption<EStockInquiryRequestCB>> opLambda) {
        return doBatchDelete(eStockInquiryRequestList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param eStockInquiryRequestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<EStockInquiryRequest> eStockInquiryRequestList, WritableOptionCall<EStockInquiryRequestCB, DeleteOption<EStockInquiryRequestCB>> opLambda) {
        return doBatchDeleteNonstrict(eStockInquiryRequestList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<EStockInquiryRequest, EStockInquiryRequestCB> manyArgLambda, WritableOptionCall<EStockInquiryRequestCB, InsertOption<EStockInquiryRequestCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EStockInquiryRequest eStockInquiryRequest = <span style="color: #70226C">new</span> EStockInquiryRequest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setPK...(value);</span>
     * eStockInquiryRequest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eStockInquiryRequest.setVersionNo(value);</span>
     * EStockInquiryRequestCB cb = <span style="color: #70226C">new</span> EStockInquiryRequestCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eStockInquiryRequestBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(eStockInquiryRequest, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param eStockInquiryRequest The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EStockInquiryRequest eStockInquiryRequest, EStockInquiryRequestCB cb, WritableOptionCall<EStockInquiryRequestCB, UpdateOption<EStockInquiryRequestCB>> opLambda) {
        return doQueryUpdate(eStockInquiryRequest, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of EStockInquiryRequest. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EStockInquiryRequestCB cb, WritableOptionCall<EStockInquiryRequestCB, DeleteOption<EStockInquiryRequestCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * eStockInquiryRequestBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * eStockInquiryRequestBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eStockInquiryRequestBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * eStockInquiryRequestBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eStockInquiryRequestBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * eStockInquiryRequestBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * eStockInquiryRequestBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * eStockInquiryRequestBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * eStockInquiryRequestBhv.outideSql().removeBlockComment().selectList()
     * eStockInquiryRequestBhv.outideSql().removeLineComment().selectList()
     * eStockInquiryRequestBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<EStockInquiryRequestBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<EStockInquiryRequestBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends EStockInquiryRequest> typeOfSelectedEntity() { return EStockInquiryRequest.class; }
    protected Class<EStockInquiryRequest> typeOfHandlingEntity() { return EStockInquiryRequest.class; }
    protected Class<EStockInquiryRequestCB> typeOfHandlingConditionBean() { return EStockInquiryRequestCB.class; }
}
