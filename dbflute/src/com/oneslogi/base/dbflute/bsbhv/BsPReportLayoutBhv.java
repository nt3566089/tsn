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
 * The behavior of P_REPORT_LAYOUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_LAYOUT_ID
 *
 * [column]
 *     REPORT_LAYOUT_ID, REPORT_ID, REPORT_LAYOUT_NM, REPORT_LAYOUT_DATA, UPDATABLE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, AUTO_PRINT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_REPORT, B_CLASS_DTL(ByUpdatable), P_LAYOUT_PRINT_SETTING(AsOne), P_SUBREP_LAYOUT(AsOne)
 *
 * [referrer table]
 *     P_REPORT_LAYOUT_ITEM, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET, P_LAYOUT_PRINT_SETTING, P_SUBREP_LAYOUT
 *
 * [foreign property]
 *     pReport, bClassDtlByUpdatable, bClassDtlByAutoPrintTargetFlg, pLayoutPrintSettingAsOne, pSubrepLayoutAsOne
 *
 * [referrer property]
 *     pReportLayoutItemList, pUserAutoPrintSettingByReportLayoutIdList, pTerminalAutoPrintSetByReportLayoutIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPReportLayoutBhv extends AbstractBehaviorWritable<PReportLayout, PReportLayoutCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PReportLayoutDbm asDBMeta() { return PReportLayoutDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_REPORT_LAYOUT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PReportLayoutDbm getMyDBMeta() { return PReportLayoutDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PReportLayoutCB newConditionBean() { return new PReportLayoutCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PReportLayout newMyEntity() { return new PReportLayout(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PReportLayoutCB newMyConditionBean() { return new PReportLayoutCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PReportLayoutCB cb) {
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
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().setFoo...(value);
     * PReportLayout pReportLayout = <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pReportLayout != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pReportLayout.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayout selectEntity(PReportLayoutCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PReportLayout facadeSelectEntity(PReportLayoutCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayout> OptionalEntity<ENTITY> doSelectOptionalEntity(PReportLayoutCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().set...;
     * PReportLayout pReportLayout = <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pReportLayout.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayout selectEntityWithDeletedCheck(PReportLayoutCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param reportLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayout selectByPKValue(Long reportLayoutId) {
        return facadeSelectByPKValue(reportLayoutId);
    }

    protected PReportLayout facadeSelectByPKValue(Long reportLayoutId) {
        return doSelectByPK(reportLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayout> ENTITY doSelectByPK(Long reportLayoutId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(reportLayoutId), tp);
    }

    protected <ENTITY extends PReportLayout> OptionalEntity<ENTITY> doSelectOptionalByPK(Long reportLayoutId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(reportLayoutId, tp), reportLayoutId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param reportLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PReportLayout selectByPKValueWithDeletedCheck(Long reportLayoutId) {
        return doSelectByPKWithDeletedCheck(reportLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayout> ENTITY doSelectByPKWithDeletedCheck(Long reportLayoutId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(reportLayoutId), tp);
    }

    protected PReportLayoutCB xprepareCBAsPK(Long reportLayoutId) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);
        return newConditionBean().acceptPK(reportLayoutId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param reportId : UQ+, IX, NotNull, bigint(19), FK to P_REPORT. (NotNull)
     * @param reportLayoutNm : +UQ, NotNull, varchar(60). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PReportLayout> selectByUniqueOf(Long reportId, String reportLayoutNm) {
        return facadeSelectByUniqueOf(reportId, reportLayoutNm);
    }

    protected OptionalEntity<PReportLayout> facadeSelectByUniqueOf(Long reportId, String reportLayoutNm) {
        return doSelectByUniqueOf(reportId, reportLayoutNm, typeOfSelectedEntity());
    }

    protected <ENTITY extends PReportLayout> OptionalEntity<ENTITY> doSelectByUniqueOf(Long reportId, String reportLayoutNm, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(reportId, reportLayoutNm), tp), reportId, reportLayoutNm);
    }

    protected PReportLayoutCB xprepareCBAsUniqueOf(Long reportId, String reportLayoutNm) {
        assertObjectNotNull("reportId", reportId);assertObjectNotNull("reportLayoutNm", reportLayoutNm);
        return newConditionBean().acceptUniqueOf(reportId, reportLayoutNm);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PReportLayout&gt; <span style="color: #553000">pReportLayoutList</span> = <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PReportLayout> selectList(PReportLayoutCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PReportLayout&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PReportLayout pReportLayout : <span style="color: #553000">page</span>) {
     *     ... = pReportLayout.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PReportLayout> selectPage(PReportLayoutCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().set...
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @param entityRowHandler The handler of entity row of PReportLayout. (NotNull)
     */
    public void selectCursor(PReportLayoutCB cb, EntityRowHandler<PReportLayout> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PReportLayoutCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PReportLayoutCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PReportLayout> pReportLayoutList, ReferrerLoaderHandler<LoaderOfPReportLayout> loaderLambda) {
        xassLRArg(pReportLayoutList, loaderLambda);
        loaderLambda.handle(new LoaderOfPReportLayout().ready(pReportLayoutList, _behaviorSelector));
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
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PReportLayout pReportLayout, ReferrerLoaderHandler<LoaderOfPReportLayout> loaderLambda) {
        xassLRArg(pReportLayout, loaderLambda);
        loaderLambda.handle(new LoaderOfPReportLayout().ready(xnewLRAryLs(pReportLayout), _behaviorSelector));
    }

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(List<PReportLayout> pReportLayoutList, ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        xassLRArg(pReportLayoutList, refCBLambda);
        return doLoadPReportLayoutItemList(pReportLayoutList, new LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PReportLayoutItemList by the set-upper of referrer. <br>
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPReportLayoutItemList</span>(<span style="color: #553000">pReportLayout</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPReportLayoutItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(PReportLayout pReportLayout, ConditionBeanSetupper<PReportLayoutItemCB> refCBLambda) {
        xassLRArg(pReportLayout, refCBLambda);
        return doLoadPReportLayoutItemList(xnewLRLs(pReportLayout), new LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(PReportLayout pReportLayout, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> loadReferrerOption) {
        xassLRArg(pReportLayout, loadReferrerOption);
        return loadPReportLayoutItemList(xnewLRLs(pReportLayout), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PReportLayoutItem> loadPReportLayoutItemList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> loadReferrerOption) {
        xassLRArg(pReportLayoutList, loadReferrerOption);
        if (pReportLayoutList.isEmpty()) { return (NestedReferrerListGateway<PReportLayoutItem>)EMPTY_NREF_LGWAY; }
        return doLoadPReportLayoutItemList(pReportLayoutList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PReportLayoutItem> doLoadPReportLayoutItemList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PReportLayoutItemCB, PReportLayoutItem> option) {
        return helpLoadReferrerInternally(pReportLayoutList, option, "pReportLayoutItemList");
    }

    /**
     * Load referrer of PUserAutoPrintSettingByReportLayoutIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByReportLayoutIdList</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPUserAutoPrintSettingByReportLayoutIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByReportLayoutIdList(List<PReportLayout> pReportLayoutList, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pReportLayoutList, refCBLambda);
        return doLoadPUserAutoPrintSettingByReportLayoutIdList(pReportLayoutList, new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PUserAutoPrintSettingByReportLayoutIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByReportLayoutIdList</span>(<span style="color: #553000">pReportLayout</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPUserAutoPrintSettingByReportLayoutIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByReportLayoutIdList(PReportLayout pReportLayout, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pReportLayout, refCBLambda);
        return doLoadPUserAutoPrintSettingByReportLayoutIdList(xnewLRLs(pReportLayout), new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByReportLayoutIdList(PReportLayout pReportLayout, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pReportLayout, loadReferrerOption);
        return loadPUserAutoPrintSettingByReportLayoutIdList(xnewLRLs(pReportLayout), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByReportLayoutIdList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pReportLayoutList, loadReferrerOption);
        if (pReportLayoutList.isEmpty()) { return (NestedReferrerListGateway<PUserAutoPrintSetting>)EMPTY_NREF_LGWAY; }
        return doLoadPUserAutoPrintSettingByReportLayoutIdList(pReportLayoutList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PUserAutoPrintSetting> doLoadPUserAutoPrintSettingByReportLayoutIdList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> option) {
        return helpLoadReferrerInternally(pReportLayoutList, option, "pUserAutoPrintSettingByReportLayoutIdList");
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByReportLayoutIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByReportLayoutIdList</span>(<span style="color: #553000">pReportLayoutList</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PReportLayout pReportLayout : <span style="color: #553000">pReportLayoutList</span>) {
     *     ... = pReportLayout.<span style="color: #CC4747">getPTerminalAutoPrintSetByReportLayoutIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByReportLayoutIdList(List<PReportLayout> pReportLayoutList, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pReportLayoutList, refCBLambda);
        return doLoadPTerminalAutoPrintSetByReportLayoutIdList(pReportLayoutList, new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByReportLayoutIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByReportLayoutIdList</span>(<span style="color: #553000">pReportLayout</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPTerminalAutoPrintSetByReportLayoutIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportLayoutId_InScope(pkList);
     * cb.query().addOrderBy_ReportLayoutId_Asc();
     * </pre>
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByReportLayoutIdList(PReportLayout pReportLayout, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pReportLayout, refCBLambda);
        return doLoadPTerminalAutoPrintSetByReportLayoutIdList(xnewLRLs(pReportLayout), new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pReportLayout The entity of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByReportLayoutIdList(PReportLayout pReportLayout, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pReportLayout, loadReferrerOption);
        return loadPTerminalAutoPrintSetByReportLayoutIdList(xnewLRLs(pReportLayout), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pReportLayoutList The entity list of PReportLayout. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByReportLayoutIdList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pReportLayoutList, loadReferrerOption);
        if (pReportLayoutList.isEmpty()) { return (NestedReferrerListGateway<PTerminalAutoPrintSet>)EMPTY_NREF_LGWAY; }
        return doLoadPTerminalAutoPrintSetByReportLayoutIdList(pReportLayoutList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PTerminalAutoPrintSet> doLoadPTerminalAutoPrintSetByReportLayoutIdList(List<PReportLayout> pReportLayoutList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> option) {
        return helpLoadReferrerInternally(pReportLayoutList, option, "pTerminalAutoPrintSetByReportLayoutIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PReport'.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PReport> pulloutPReport(List<PReportLayout> pReportLayoutList)
    { return helpPulloutInternally(pReportLayoutList, "pReport"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByUpdatable(List<PReportLayout> pReportLayoutList)
    { return helpPulloutInternally(pReportLayoutList, "bClassDtlByUpdatable"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAutoPrintTargetFlg(List<PReportLayout> pReportLayoutList)
    { return helpPulloutInternally(pReportLayoutList, "bClassDtlByAutoPrintTargetFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'PLayoutPrintSetting'.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PLayoutPrintSetting> pulloutPLayoutPrintSettingAsOne(List<PReportLayout> pReportLayoutList)
    { return helpPulloutInternally(pReportLayoutList, "pLayoutPrintSettingAsOne"); }

    /**
     * Pull out the list of referrer-as-one table 'PSubrepLayout'.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PSubrepLayout> pulloutPSubrepLayoutAsOne(List<PReportLayout> pReportLayoutList)
    { return helpPulloutInternally(pReportLayoutList, "pSubrepLayoutAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key reportLayoutId.
     * @param pReportLayoutList The list of pReportLayout. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReportLayoutIdList(List<PReportLayout> pReportLayoutList)
    { return helpExtractListInternally(pReportLayoutList, "reportLayoutId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pReportLayout.setFoo...(value);
     * pReportLayout.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayout.set...;</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">insert</span>(pReportLayout);
     * ... = pReportLayout.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pReportLayout The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PReportLayout pReportLayout) {
        doInsert(pReportLayout, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayout.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">update</span>(pReportLayout);
     * </pre>
     * @param pReportLayout The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PReportLayout pReportLayout) {
        doUpdate(pReportLayout, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayout.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pReportLayout);
     * </pre>
     * @param pReportLayout The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PReportLayout pReportLayout) {
        doUpdateNonstrict(pReportLayout, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pReportLayout The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PReportLayout pReportLayout) {
        doInsertOrUpdate(pReportLayout, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pReportLayout The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PReportLayout pReportLayout) {
        doInsertOrUpdateNonstrict(pReportLayout, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">delete</span>(pReportLayout);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pReportLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PReportLayout pReportLayout) {
        doDelete(pReportLayout, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pReportLayout);
     * </pre>
     * @param pReportLayout The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PReportLayout pReportLayout) {
        doDeleteNonstrict(pReportLayout, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pReportLayout);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pReportLayout The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PReportLayout pReportLayout) {
        doDeleteNonstrictIgnoreDeleted(pReportLayout, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PReportLayout et, final DeleteOption<PReportLayoutCB> op) {
        assertObjectNotNull("pReportLayout", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     *     pReportLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayout.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pReportLayoutList.add(pReportLayout);
     * }
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchInsert</span>(pReportLayoutList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PReportLayout> pReportLayoutList) {
        return doBatchInsert(pReportLayoutList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     *     pReportLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayout.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pReportLayout.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pReportLayout.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pReportLayoutList.add(pReportLayout);
     * }
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutList);
     * </pre>
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PReportLayout> pReportLayoutList) {
        return doBatchUpdate(pReportLayoutList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pReportLayoutBhv.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PReportLayout> pReportLayoutList, SpecifyQuery<PReportLayoutCB> colCBLambda) {
        return doBatchUpdate(pReportLayoutList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     *     pReportLayout.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pReportLayout.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pReportLayout.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pReportLayout.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pReportLayoutList.add(pReportLayout);
     * }
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pReportLayoutList);
     * </pre>
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PReportLayout> pReportLayoutList) {
        return doBatchUpdateNonstrict(pReportLayoutList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pReportLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pReportLayoutList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PReportLayout> pReportLayoutList, SpecifyQuery<PReportLayoutCB> colCBLambda) {
        return doBatchUpdateNonstrict(pReportLayoutList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PReportLayout> pReportLayoutList) {
        return doBatchDelete(pReportLayoutList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PReportLayout> pReportLayoutList) {
        return doBatchDeleteNonstrict(pReportLayoutList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PReportLayout, PReportLayoutCB&gt;() {
     *     public ConditionBean setup(PReportLayout entity, PReportLayoutCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PReportLayout, PReportLayoutCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pReportLayout.setPK...(value);</span>
     * pReportLayout.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pReportLayout.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pReportLayout.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pReportLayout, cb);
     * </pre>
     * @param pReportLayout The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PReportLayout pReportLayout, PReportLayoutCB cb) {
        return doQueryUpdate(pReportLayout, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PReportLayoutCB cb = new PReportLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">queryDelete</span>(pReportLayout, cb);
     * </pre>
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PReportLayoutCB cb) {
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
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pReportLayout.setFoo...(value);
     * pReportLayout.setBar...(value);
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pReportLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pReportLayout.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pReportLayout The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, InsertOption<PReportLayoutCB>> opLambda) {
        doInsert(pReportLayout, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pReportLayout.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pReportLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayout The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> opLambda) {
        doUpdate(pReportLayout, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * pReportLayout.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pReportLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pReportLayout, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayout The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> opLambda) {
        doUpdateNonstrict(pReportLayout, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pReportLayout The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, InsertOption<PReportLayoutCB>> insertOpLambda, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> updateOpLambda) {
        doInsertOrUpdate(pReportLayout, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pReportLayout The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, InsertOption<PReportLayoutCB>> insertOpLambda, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pReportLayout, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pReportLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, DeleteOption<PReportLayoutCB>> opLambda) {
        doDelete(pReportLayout, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pReportLayout The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PReportLayout pReportLayout, WritableOptionCall<PReportLayoutCB, DeleteOption<PReportLayoutCB>> opLambda) {
        doDeleteNonstrict(pReportLayout, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PReportLayout> pReportLayoutList, WritableOptionCall<PReportLayoutCB, InsertOption<PReportLayoutCB>> opLambda) {
        return doBatchInsert(pReportLayoutList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PReportLayout> pReportLayoutList, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> opLambda) {
        return doBatchUpdate(pReportLayoutList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PReportLayout> pReportLayoutList, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> opLambda) {
        return doBatchUpdateNonstrict(pReportLayoutList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PReportLayout> pReportLayoutList, WritableOptionCall<PReportLayoutCB, DeleteOption<PReportLayoutCB>> opLambda) {
        return doBatchDelete(pReportLayoutList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pReportLayoutList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PReportLayout> pReportLayoutList, WritableOptionCall<PReportLayoutCB, DeleteOption<PReportLayoutCB>> opLambda) {
        return doBatchDeleteNonstrict(pReportLayoutList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PReportLayout, PReportLayoutCB> manyArgLambda, WritableOptionCall<PReportLayoutCB, InsertOption<PReportLayoutCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PReportLayout pReportLayout = <span style="color: #70226C">new</span> PReportLayout();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pReportLayout.setPK...(value);</span>
     * pReportLayout.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pReportLayout.setVersionNo(value);</span>
     * PReportLayoutCB cb = <span style="color: #70226C">new</span> PReportLayoutCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pReportLayoutBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pReportLayout, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pReportLayout The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PReportLayout pReportLayout, PReportLayoutCB cb, WritableOptionCall<PReportLayoutCB, UpdateOption<PReportLayoutCB>> opLambda) {
        return doQueryUpdate(pReportLayout, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PReportLayout. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PReportLayoutCB cb, WritableOptionCall<PReportLayoutCB, DeleteOption<PReportLayoutCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pReportLayoutBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pReportLayoutBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pReportLayoutBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pReportLayoutBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pReportLayoutBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pReportLayoutBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pReportLayoutBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pReportLayoutBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pReportLayoutBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pReportLayoutBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pReportLayoutBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pReportLayoutBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pReportLayoutBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pReportLayoutBhv.outideSql().removeBlockComment().selectList()
     * pReportLayoutBhv.outideSql().removeLineComment().selectList()
     * pReportLayoutBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PReportLayoutBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PReportLayoutBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PReportLayout> typeOfSelectedEntity() { return PReportLayout.class; }
    protected Class<PReportLayout> typeOfHandlingEntity() { return PReportLayout.class; }
    protected Class<PReportLayoutCB> typeOfHandlingConditionBean() { return PReportLayoutCB.class; }
}
