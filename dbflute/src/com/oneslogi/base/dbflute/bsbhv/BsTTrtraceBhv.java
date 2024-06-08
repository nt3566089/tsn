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
 * The behavior of T_TRTRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRTRACE_ID
 *
 * [column]
 *     TRTRACE_ID, TRACEKEY, SNDRCVDATETIME, WAREHOUSECD, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, PRODUCT_CD, ITEMCD_IN, ITEMCD_WH, DESIGNCD_CASE, DESIGNCD_IN, DESIGNCD_WH, SOURCECASECD, SENDFLG, FROMFLG, SUPPLIERRCVNO, MIXEDFLG, SYMBOLPASTDATE, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, MAKERCASENO, LENDFLG, CASEINNUMCALC, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, OTHERREFNO2, ORDERTYPE, LIMITDATENOW, CASECREATETYPE, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, LOCGROUP, LOCCD, SHIPDATE, SHIPTOCD, EXAMSTS, TOKUHANCD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, RESERVEAREA, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, DT_EXTDATA2, PALLET_NO, PICK_LIST_KEY, FRONT_BACK_CASE_CD, CENTER_ID, CLIENT_ID, TRANSPORT_PRIORITY, USE_TYPE, OUTPUT_ORDER, FACTORY_ORDER, WAREHOUSE_ORDER, LINEBLOCK_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrtraceBhv extends AbstractBehaviorWritable<TTrtrace, TTrtraceCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrtraceDbm asDBMeta() { return TTrtraceDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRTRACE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrtraceDbm getMyDBMeta() { return TTrtraceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrtraceCB newConditionBean() { return new TTrtraceCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrtrace newMyEntity() { return new TTrtrace(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrtraceCB newMyConditionBean() { return new TTrtraceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrtraceCB cb) {
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
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().setFoo...(value);
     * TTrtrace tTrtrace = <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrtrace != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrtrace.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrtrace selectEntity(TTrtraceCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrtrace facadeSelectEntity(TTrtraceCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrtrace> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrtraceCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().set...;
     * TTrtrace tTrtrace = <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrtrace.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrtrace selectEntityWithDeletedCheck(TTrtraceCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trtraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrtrace selectByPKValue(Long trtraceId) {
        return facadeSelectByPKValue(trtraceId);
    }

    protected TTrtrace facadeSelectByPKValue(Long trtraceId) {
        return doSelectByPK(trtraceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrtrace> ENTITY doSelectByPK(Long trtraceId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trtraceId), tp);
    }

    protected <ENTITY extends TTrtrace> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trtraceId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trtraceId, tp), trtraceId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trtraceId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrtrace selectByPKValueWithDeletedCheck(Long trtraceId) {
        return doSelectByPKWithDeletedCheck(trtraceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrtrace> ENTITY doSelectByPKWithDeletedCheck(Long trtraceId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trtraceId), tp);
    }

    protected TTrtraceCB xprepareCBAsPK(Long trtraceId) {
        assertObjectNotNull("trtraceId", trtraceId);
        return newConditionBean().acceptPK(trtraceId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrtrace&gt; <span style="color: #553000">tTrtraceList</span> = <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrtrace tTrtrace : <span style="color: #553000">tTrtraceList</span>) {
     *     ... = tTrtrace.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrtrace> selectList(TTrtraceCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrtrace&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrtrace tTrtrace : <span style="color: #553000">page</span>) {
     *     ... = tTrtrace.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrtrace> selectPage(TTrtraceCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrtrace. (NotNull)
     */
    public void selectCursor(TTrtraceCB cb, EntityRowHandler<TTrtrace> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrtraceCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrtraceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrtraceList The entity list of TTrtrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrtrace> tTrtraceList, ReferrerLoaderHandler<LoaderOfTTrtrace> loaderLambda) {
        xassLRArg(tTrtraceList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrtrace().ready(tTrtraceList, _behaviorSelector));
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
     * @param tTrtrace The entity of TTrtrace. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrtrace tTrtrace, ReferrerLoaderHandler<LoaderOfTTrtrace> loaderLambda) {
        xassLRArg(tTrtrace, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrtrace().ready(xnewLRAryLs(tTrtrace), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tTrtraceList The list of tTrtrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TTrtrace> tTrtraceList)
    { return helpPulloutInternally(tTrtraceList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tTrtraceList The list of tTrtrace. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TTrtrace> tTrtraceList)
    { return helpPulloutInternally(tTrtraceList, "mClient"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trtraceId.
     * @param tTrtraceList The list of tTrtrace. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrtraceIdList(List<TTrtrace> tTrtraceList)
    { return helpExtractListInternally(tTrtraceList, "trtraceId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrtrace.setFoo...(value);
     * tTrtrace.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrtrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrtrace.set...;</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">insert</span>(tTrtrace);
     * ... = tTrtrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrtrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrtrace tTrtrace) {
        doInsert(tTrtrace, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrtrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrtrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrtrace.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrtrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">update</span>(tTrtrace);
     * </pre>
     * @param tTrtrace The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrtrace tTrtrace) {
        doUpdate(tTrtrace, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrtrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrtrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrtrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrtrace);
     * </pre>
     * @param tTrtrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrtrace tTrtrace) {
        doUpdateNonstrict(tTrtrace, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrtrace The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrtrace tTrtrace) {
        doInsertOrUpdate(tTrtrace, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrtrace The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrtrace tTrtrace) {
        doInsertOrUpdateNonstrict(tTrtrace, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrtrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">delete</span>(tTrtrace);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrtrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrtrace tTrtrace) {
        doDelete(tTrtrace, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrtrace);
     * </pre>
     * @param tTrtrace The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrtrace tTrtrace) {
        doDeleteNonstrict(tTrtrace, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrtrace);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrtrace The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrtrace tTrtrace) {
        doDeleteNonstrictIgnoreDeleted(tTrtrace, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrtrace et, final DeleteOption<TTrtraceCB> op) {
        assertObjectNotNull("tTrtrace", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     *     tTrtrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrtrace.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrtraceList.add(tTrtrace);
     * }
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrtraceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrtrace> tTrtraceList) {
        return doBatchInsert(tTrtraceList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     *     tTrtrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrtrace.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrtrace.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrtrace.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrtraceList.add(tTrtrace);
     * }
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrtraceList);
     * </pre>
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrtrace> tTrtraceList) {
        return doBatchUpdate(tTrtraceList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrtraceBhv.<span style="color: #CC4747">batchUpdate</span>(tTrtraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrtraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrtrace> tTrtraceList, SpecifyQuery<TTrtraceCB> colCBLambda) {
        return doBatchUpdate(tTrtraceList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     *     tTrtrace.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrtrace.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrtrace.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrtrace.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrtraceList.add(tTrtrace);
     * }
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrtraceList);
     * </pre>
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrtrace> tTrtraceList) {
        return doBatchUpdateNonstrict(tTrtraceList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrtraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrtraceList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrtrace> tTrtraceList, SpecifyQuery<TTrtraceCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrtraceList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrtrace> tTrtraceList) {
        return doBatchDelete(tTrtraceList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrtrace> tTrtraceList) {
        return doBatchDeleteNonstrict(tTrtraceList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrtrace, TTrtraceCB&gt;() {
     *     public ConditionBean setup(TTrtrace entity, TTrtraceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrtrace, TTrtraceCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrtrace.setPK...(value);</span>
     * tTrtrace.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrtrace.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrtrace.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrtrace, cb);
     * </pre>
     * @param tTrtrace The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrtrace tTrtrace, TTrtraceCB cb) {
        return doQueryUpdate(tTrtrace, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrtraceCB cb = new TTrtraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrtrace, cb);
     * </pre>
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrtraceCB cb) {
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
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrtrace.setFoo...(value);
     * tTrtrace.setBar...(value);
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrtrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrtrace.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrtrace The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, InsertOption<TTrtraceCB>> opLambda) {
        doInsert(tTrtrace, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrtrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrtrace.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrtrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrtrace The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> opLambda) {
        doUpdate(tTrtrace, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * tTrtrace.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrtrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrtrace, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrtrace The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> opLambda) {
        doUpdateNonstrict(tTrtrace, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrtrace The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, InsertOption<TTrtraceCB>> insertOpLambda, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> updateOpLambda) {
        doInsertOrUpdate(tTrtrace, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrtrace The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, InsertOption<TTrtraceCB>> insertOpLambda, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrtrace, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrtrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, DeleteOption<TTrtraceCB>> opLambda) {
        doDelete(tTrtrace, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrtrace The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrtrace tTrtrace, WritableOptionCall<TTrtraceCB, DeleteOption<TTrtraceCB>> opLambda) {
        doDeleteNonstrict(tTrtrace, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrtrace> tTrtraceList, WritableOptionCall<TTrtraceCB, InsertOption<TTrtraceCB>> opLambda) {
        return doBatchInsert(tTrtraceList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrtrace> tTrtraceList, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> opLambda) {
        return doBatchUpdate(tTrtraceList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrtrace> tTrtraceList, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrtraceList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrtrace> tTrtraceList, WritableOptionCall<TTrtraceCB, DeleteOption<TTrtraceCB>> opLambda) {
        return doBatchDelete(tTrtraceList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrtraceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrtrace> tTrtraceList, WritableOptionCall<TTrtraceCB, DeleteOption<TTrtraceCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrtraceList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrtrace, TTrtraceCB> manyArgLambda, WritableOptionCall<TTrtraceCB, InsertOption<TTrtraceCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrtrace tTrtrace = <span style="color: #70226C">new</span> TTrtrace();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrtrace.setPK...(value);</span>
     * tTrtrace.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrtrace.setVersionNo(value);</span>
     * TTrtraceCB cb = <span style="color: #70226C">new</span> TTrtraceCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrtraceBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrtrace, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrtrace The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrtrace tTrtrace, TTrtraceCB cb, WritableOptionCall<TTrtraceCB, UpdateOption<TTrtraceCB>> opLambda) {
        return doQueryUpdate(tTrtrace, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrtrace. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrtraceCB cb, WritableOptionCall<TTrtraceCB, DeleteOption<TTrtraceCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrtraceBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrtraceBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrtraceBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrtraceBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrtraceBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrtraceBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrtraceBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrtraceBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrtraceBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrtraceBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrtraceBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrtraceBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrtraceBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrtraceBhv.outideSql().removeBlockComment().selectList()
     * tTrtraceBhv.outideSql().removeLineComment().selectList()
     * tTrtraceBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrtraceBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrtraceBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrtrace> typeOfSelectedEntity() { return TTrtrace.class; }
    protected Class<TTrtrace> typeOfHandlingEntity() { return TTrtrace.class; }
    protected Class<TTrtraceCB> typeOfHandlingConditionBean() { return TTrtraceCB.class; }
}
