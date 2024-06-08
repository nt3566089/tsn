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
 * The behavior of P_TERMINAL_AUTO_PRINT_SET as TABLE. <br>
 * <pre>
 * [primary key]
 *     TERMINAL_AUTO_PRINT_SET_ID
 *
 * [column]
 *     TERMINAL_AUTO_PRINT_SET_ID, TERMINAL_ASSIGN_CD, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TERMINAL_AUTO_PRINT_SET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT_LAYOUT(ByReportLayoutId), P_PRINTER_GROUP(ByPrinterGroupId), P_PRINTER(ByPrinterId), P_PRINTER_ATTRIBUTE(ByPrinterAttributeId)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pReportLayoutByReportLayoutId, pPrinterGroupByPrinterGroupId, pPrinterByPrinterId, pPrinterAttributeByPrinterAttributeId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPTerminalAutoPrintSetBhv extends AbstractBehaviorWritable<PTerminalAutoPrintSet, PTerminalAutoPrintSetCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PTerminalAutoPrintSetDbm asDBMeta() { return PTerminalAutoPrintSetDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_TERMINAL_AUTO_PRINT_SET"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PTerminalAutoPrintSetDbm getMyDBMeta() { return PTerminalAutoPrintSetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PTerminalAutoPrintSetCB newConditionBean() { return new PTerminalAutoPrintSetCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PTerminalAutoPrintSet newMyEntity() { return new PTerminalAutoPrintSet(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PTerminalAutoPrintSetCB newMyConditionBean() { return new PTerminalAutoPrintSetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PTerminalAutoPrintSetCB cb) {
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
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pTerminalAutoPrintSet != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pTerminalAutoPrintSet.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PTerminalAutoPrintSet selectEntity(PTerminalAutoPrintSetCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PTerminalAutoPrintSet facadeSelectEntity(PTerminalAutoPrintSetCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PTerminalAutoPrintSet> OptionalEntity<ENTITY> doSelectOptionalEntity(PTerminalAutoPrintSetCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().set...;
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pTerminalAutoPrintSet.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PTerminalAutoPrintSet selectEntityWithDeletedCheck(PTerminalAutoPrintSetCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param terminalAutoPrintSetId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PTerminalAutoPrintSet selectByPKValue(Long terminalAutoPrintSetId) {
        return facadeSelectByPKValue(terminalAutoPrintSetId);
    }

    protected PTerminalAutoPrintSet facadeSelectByPKValue(Long terminalAutoPrintSetId) {
        return doSelectByPK(terminalAutoPrintSetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PTerminalAutoPrintSet> ENTITY doSelectByPK(Long terminalAutoPrintSetId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(terminalAutoPrintSetId), tp);
    }

    protected <ENTITY extends PTerminalAutoPrintSet> OptionalEntity<ENTITY> doSelectOptionalByPK(Long terminalAutoPrintSetId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(terminalAutoPrintSetId, tp), terminalAutoPrintSetId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param terminalAutoPrintSetId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PTerminalAutoPrintSet selectByPKValueWithDeletedCheck(Long terminalAutoPrintSetId) {
        return doSelectByPKWithDeletedCheck(terminalAutoPrintSetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PTerminalAutoPrintSet> ENTITY doSelectByPKWithDeletedCheck(Long terminalAutoPrintSetId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(terminalAutoPrintSetId), tp);
    }

    protected PTerminalAutoPrintSetCB xprepareCBAsPK(Long terminalAutoPrintSetId) {
        assertObjectNotNull("terminalAutoPrintSetId", terminalAutoPrintSetId);
        return newConditionBean().acceptPK(terminalAutoPrintSetId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param terminalAssignCd : UQ+, IX, NotNull, varchar(100). (NotNull)
     * @param reportLayoutId : +UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PTerminalAutoPrintSet> selectByUniqueOf(String terminalAssignCd, Long reportLayoutId) {
        return facadeSelectByUniqueOf(terminalAssignCd, reportLayoutId);
    }

    protected OptionalEntity<PTerminalAutoPrintSet> facadeSelectByUniqueOf(String terminalAssignCd, Long reportLayoutId) {
        return doSelectByUniqueOf(terminalAssignCd, reportLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PTerminalAutoPrintSet> OptionalEntity<ENTITY> doSelectByUniqueOf(String terminalAssignCd, Long reportLayoutId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(terminalAssignCd, reportLayoutId), tp), terminalAssignCd, reportLayoutId);
    }

    protected PTerminalAutoPrintSetCB xprepareCBAsUniqueOf(String terminalAssignCd, Long reportLayoutId) {
        assertObjectNotNull("terminalAssignCd", terminalAssignCd);assertObjectNotNull("reportLayoutId", reportLayoutId);
        return newConditionBean().acceptUniqueOf(terminalAssignCd, reportLayoutId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PTerminalAutoPrintSet&gt; <span style="color: #553000">pTerminalAutoPrintSetList</span> = <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PTerminalAutoPrintSet pTerminalAutoPrintSet : <span style="color: #553000">pTerminalAutoPrintSetList</span>) {
     *     ... = pTerminalAutoPrintSet.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PTerminalAutoPrintSet> selectList(PTerminalAutoPrintSetCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PTerminalAutoPrintSet&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PTerminalAutoPrintSet pTerminalAutoPrintSet : <span style="color: #553000">page</span>) {
     *     ... = pTerminalAutoPrintSet.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PTerminalAutoPrintSet> selectPage(PTerminalAutoPrintSetCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().set...
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @param entityRowHandler The handler of entity row of PTerminalAutoPrintSet. (NotNull)
     */
    public void selectCursor(PTerminalAutoPrintSetCB cb, EntityRowHandler<PTerminalAutoPrintSet> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PTerminalAutoPrintSetCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PTerminalAutoPrintSetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pTerminalAutoPrintSetList The entity list of PTerminalAutoPrintSet. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, ReferrerLoaderHandler<LoaderOfPTerminalAutoPrintSet> loaderLambda) {
        xassLRArg(pTerminalAutoPrintSetList, loaderLambda);
        loaderLambda.handle(new LoaderOfPTerminalAutoPrintSet().ready(pTerminalAutoPrintSetList, _behaviorSelector));
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
     * @param pTerminalAutoPrintSet The entity of PTerminalAutoPrintSet. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PTerminalAutoPrintSet pTerminalAutoPrintSet, ReferrerLoaderHandler<LoaderOfPTerminalAutoPrintSet> loaderLambda) {
        xassLRArg(pTerminalAutoPrintSet, loaderLambda);
        loaderLambda.handle(new LoaderOfPTerminalAutoPrintSet().ready(xnewLRAryLs(pTerminalAutoPrintSet), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PReportLayout'.
     * @param pTerminalAutoPrintSetList The list of pTerminalAutoPrintSet. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PReportLayout> pulloutPReportLayoutByReportLayoutId(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList)
    { return helpPulloutInternally(pTerminalAutoPrintSetList, "pReportLayoutByReportLayoutId"); }

    /**
     * Pull out the list of foreign table 'PPrinterGroup'.
     * @param pTerminalAutoPrintSetList The list of pTerminalAutoPrintSet. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinterGroup> pulloutPPrinterGroupByPrinterGroupId(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList)
    { return helpPulloutInternally(pTerminalAutoPrintSetList, "pPrinterGroupByPrinterGroupId"); }

    /**
     * Pull out the list of foreign table 'PPrinter'.
     * @param pTerminalAutoPrintSetList The list of pTerminalAutoPrintSet. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinter> pulloutPPrinterByPrinterId(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList)
    { return helpPulloutInternally(pTerminalAutoPrintSetList, "pPrinterByPrinterId"); }

    /**
     * Pull out the list of foreign table 'PPrinterAttribute'.
     * @param pTerminalAutoPrintSetList The list of pTerminalAutoPrintSet. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinterAttribute> pulloutPPrinterAttributeByPrinterAttributeId(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList)
    { return helpPulloutInternally(pTerminalAutoPrintSetList, "pPrinterAttributeByPrinterAttributeId"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key terminalAutoPrintSetId.
     * @param pTerminalAutoPrintSetList The list of pTerminalAutoPrintSet. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTerminalAutoPrintSetIdList(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList)
    { return helpExtractListInternally(pTerminalAutoPrintSetList, "terminalAutoPrintSetId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pTerminalAutoPrintSet.setFoo...(value);
     * pTerminalAutoPrintSet.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.set...;</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">insert</span>(pTerminalAutoPrintSet);
     * ... = pTerminalAutoPrintSet.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pTerminalAutoPrintSet The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doInsert(pTerminalAutoPrintSet, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pTerminalAutoPrintSet.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pTerminalAutoPrintSet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">update</span>(pTerminalAutoPrintSet);
     * </pre>
     * @param pTerminalAutoPrintSet The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doUpdate(pTerminalAutoPrintSet, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pTerminalAutoPrintSet.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pTerminalAutoPrintSet);
     * </pre>
     * @param pTerminalAutoPrintSet The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doUpdateNonstrict(pTerminalAutoPrintSet, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pTerminalAutoPrintSet The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doInsertOrUpdate(pTerminalAutoPrintSet, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pTerminalAutoPrintSet The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doInsertOrUpdateNonstrict(pTerminalAutoPrintSet, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pTerminalAutoPrintSet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">delete</span>(pTerminalAutoPrintSet);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pTerminalAutoPrintSet The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doDelete(pTerminalAutoPrintSet, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pTerminalAutoPrintSet);
     * </pre>
     * @param pTerminalAutoPrintSet The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doDeleteNonstrict(pTerminalAutoPrintSet, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pTerminalAutoPrintSet);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pTerminalAutoPrintSet The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PTerminalAutoPrintSet pTerminalAutoPrintSet) {
        doDeleteNonstrictIgnoreDeleted(pTerminalAutoPrintSet, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PTerminalAutoPrintSet et, final DeleteOption<PTerminalAutoPrintSetCB> op) {
        assertObjectNotNull("pTerminalAutoPrintSet", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     *     pTerminalAutoPrintSet.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pTerminalAutoPrintSet.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pTerminalAutoPrintSetList.add(pTerminalAutoPrintSet);
     * }
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchInsert</span>(pTerminalAutoPrintSetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList) {
        return doBatchInsert(pTerminalAutoPrintSetList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     *     pTerminalAutoPrintSet.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pTerminalAutoPrintSet.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pTerminalAutoPrintSet.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pTerminalAutoPrintSetList.add(pTerminalAutoPrintSet);
     * }
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pTerminalAutoPrintSetList);
     * </pre>
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList) {
        return doBatchUpdate(pTerminalAutoPrintSetList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pTerminalAutoPrintSetBhv.<span style="color: #CC4747">batchUpdate</span>(pTerminalAutoPrintSetList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pTerminalAutoPrintSetList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, SpecifyQuery<PTerminalAutoPrintSetCB> colCBLambda) {
        return doBatchUpdate(pTerminalAutoPrintSetList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     *     pTerminalAutoPrintSet.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pTerminalAutoPrintSet.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pTerminalAutoPrintSet.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pTerminalAutoPrintSetList.add(pTerminalAutoPrintSet);
     * }
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pTerminalAutoPrintSetList);
     * </pre>
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList) {
        return doBatchUpdateNonstrict(pTerminalAutoPrintSetList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pTerminalAutoPrintSetList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pTerminalAutoPrintSetList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, SpecifyQuery<PTerminalAutoPrintSetCB> colCBLambda) {
        return doBatchUpdateNonstrict(pTerminalAutoPrintSetList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList) {
        return doBatchDelete(pTerminalAutoPrintSetList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList) {
        return doBatchDeleteNonstrict(pTerminalAutoPrintSetList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PTerminalAutoPrintSet, PTerminalAutoPrintSetCB&gt;() {
     *     public ConditionBean setup(PTerminalAutoPrintSet entity, PTerminalAutoPrintSetCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PTerminalAutoPrintSet, PTerminalAutoPrintSetCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setPK...(value);</span>
     * pTerminalAutoPrintSet.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pTerminalAutoPrintSet, cb);
     * </pre>
     * @param pTerminalAutoPrintSet The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PTerminalAutoPrintSet pTerminalAutoPrintSet, PTerminalAutoPrintSetCB cb) {
        return doQueryUpdate(pTerminalAutoPrintSet, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">queryDelete</span>(pTerminalAutoPrintSet, cb);
     * </pre>
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PTerminalAutoPrintSetCB cb) {
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
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pTerminalAutoPrintSet.setFoo...(value);
     * pTerminalAutoPrintSet.setBar...(value);
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pTerminalAutoPrintSet, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pTerminalAutoPrintSet.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pTerminalAutoPrintSet The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, InsertOption<PTerminalAutoPrintSetCB>> opLambda) {
        doInsert(pTerminalAutoPrintSet, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pTerminalAutoPrintSet.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pTerminalAutoPrintSet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pTerminalAutoPrintSet, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pTerminalAutoPrintSet The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> opLambda) {
        doUpdate(pTerminalAutoPrintSet, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * pTerminalAutoPrintSet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pTerminalAutoPrintSet.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pTerminalAutoPrintSet, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pTerminalAutoPrintSet The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> opLambda) {
        doUpdateNonstrict(pTerminalAutoPrintSet, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pTerminalAutoPrintSet The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, InsertOption<PTerminalAutoPrintSetCB>> insertOpLambda, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> updateOpLambda) {
        doInsertOrUpdate(pTerminalAutoPrintSet, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pTerminalAutoPrintSet The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, InsertOption<PTerminalAutoPrintSetCB>> insertOpLambda, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pTerminalAutoPrintSet, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pTerminalAutoPrintSet The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, DeleteOption<PTerminalAutoPrintSetCB>> opLambda) {
        doDelete(pTerminalAutoPrintSet, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pTerminalAutoPrintSet The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PTerminalAutoPrintSet pTerminalAutoPrintSet, WritableOptionCall<PTerminalAutoPrintSetCB, DeleteOption<PTerminalAutoPrintSetCB>> opLambda) {
        doDeleteNonstrict(pTerminalAutoPrintSet, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, WritableOptionCall<PTerminalAutoPrintSetCB, InsertOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doBatchInsert(pTerminalAutoPrintSetList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doBatchUpdate(pTerminalAutoPrintSetList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doBatchUpdateNonstrict(pTerminalAutoPrintSetList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, WritableOptionCall<PTerminalAutoPrintSetCB, DeleteOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doBatchDelete(pTerminalAutoPrintSetList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pTerminalAutoPrintSetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PTerminalAutoPrintSet> pTerminalAutoPrintSetList, WritableOptionCall<PTerminalAutoPrintSetCB, DeleteOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doBatchDeleteNonstrict(pTerminalAutoPrintSetList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PTerminalAutoPrintSet, PTerminalAutoPrintSetCB> manyArgLambda, WritableOptionCall<PTerminalAutoPrintSetCB, InsertOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PTerminalAutoPrintSet pTerminalAutoPrintSet = <span style="color: #70226C">new</span> PTerminalAutoPrintSet();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setPK...(value);</span>
     * pTerminalAutoPrintSet.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pTerminalAutoPrintSet.setVersionNo(value);</span>
     * PTerminalAutoPrintSetCB cb = <span style="color: #70226C">new</span> PTerminalAutoPrintSetCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pTerminalAutoPrintSet, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pTerminalAutoPrintSet The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PTerminalAutoPrintSet pTerminalAutoPrintSet, PTerminalAutoPrintSetCB cb, WritableOptionCall<PTerminalAutoPrintSetCB, UpdateOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doQueryUpdate(pTerminalAutoPrintSet, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PTerminalAutoPrintSet. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PTerminalAutoPrintSetCB cb, WritableOptionCall<PTerminalAutoPrintSetCB, DeleteOption<PTerminalAutoPrintSetCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pTerminalAutoPrintSetBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pTerminalAutoPrintSetBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pTerminalAutoPrintSetBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pTerminalAutoPrintSetBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pTerminalAutoPrintSetBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pTerminalAutoPrintSetBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pTerminalAutoPrintSetBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pTerminalAutoPrintSetBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pTerminalAutoPrintSetBhv.outideSql().removeBlockComment().selectList()
     * pTerminalAutoPrintSetBhv.outideSql().removeLineComment().selectList()
     * pTerminalAutoPrintSetBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PTerminalAutoPrintSetBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PTerminalAutoPrintSetBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PTerminalAutoPrintSet> typeOfSelectedEntity() { return PTerminalAutoPrintSet.class; }
    protected Class<PTerminalAutoPrintSet> typeOfHandlingEntity() { return PTerminalAutoPrintSet.class; }
    protected Class<PTerminalAutoPrintSetCB> typeOfHandlingConditionBean() { return PTerminalAutoPrintSetCB.class; }
}
