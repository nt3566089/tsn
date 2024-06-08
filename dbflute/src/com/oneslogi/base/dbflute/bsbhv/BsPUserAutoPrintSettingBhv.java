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
 * The behavior of P_USER_AUTO_PRINT_SETTING as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [column]
 *     USER_AUTO_PRINT_SETTING_ID, USER_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_AUTO_PRINT_SETTING_ID
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
public abstract class BsPUserAutoPrintSettingBhv extends AbstractBehaviorWritable<PUserAutoPrintSetting, PUserAutoPrintSettingCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PUserAutoPrintSettingDbm asDBMeta() { return PUserAutoPrintSettingDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_USER_AUTO_PRINT_SETTING"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PUserAutoPrintSettingDbm getMyDBMeta() { return PUserAutoPrintSettingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PUserAutoPrintSettingCB newConditionBean() { return new PUserAutoPrintSettingCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PUserAutoPrintSetting newMyEntity() { return new PUserAutoPrintSetting(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PUserAutoPrintSettingCB newMyConditionBean() { return new PUserAutoPrintSettingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PUserAutoPrintSettingCB cb) {
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
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pUserAutoPrintSetting != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pUserAutoPrintSetting.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PUserAutoPrintSetting selectEntity(PUserAutoPrintSettingCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PUserAutoPrintSetting facadeSelectEntity(PUserAutoPrintSettingCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PUserAutoPrintSetting> OptionalEntity<ENTITY> doSelectOptionalEntity(PUserAutoPrintSettingCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().set...;
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pUserAutoPrintSetting.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PUserAutoPrintSetting selectEntityWithDeletedCheck(PUserAutoPrintSettingCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param userAutoPrintSettingId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PUserAutoPrintSetting selectByPKValue(Long userAutoPrintSettingId) {
        return facadeSelectByPKValue(userAutoPrintSettingId);
    }

    protected PUserAutoPrintSetting facadeSelectByPKValue(Long userAutoPrintSettingId) {
        return doSelectByPK(userAutoPrintSettingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PUserAutoPrintSetting> ENTITY doSelectByPK(Long userAutoPrintSettingId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(userAutoPrintSettingId), tp);
    }

    protected <ENTITY extends PUserAutoPrintSetting> OptionalEntity<ENTITY> doSelectOptionalByPK(Long userAutoPrintSettingId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(userAutoPrintSettingId, tp), userAutoPrintSettingId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param userAutoPrintSettingId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PUserAutoPrintSetting selectByPKValueWithDeletedCheck(Long userAutoPrintSettingId) {
        return doSelectByPKWithDeletedCheck(userAutoPrintSettingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PUserAutoPrintSetting> ENTITY doSelectByPKWithDeletedCheck(Long userAutoPrintSettingId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(userAutoPrintSettingId), tp);
    }

    protected PUserAutoPrintSettingCB xprepareCBAsPK(Long userAutoPrintSettingId) {
        assertObjectNotNull("userAutoPrintSettingId", userAutoPrintSettingId);
        return newConditionBean().acceptPK(userAutoPrintSettingId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param userId : UQ+, IX, NotNull, bigint(19). (NotNull)
     * @param reportLayoutId : +UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PUserAutoPrintSetting> selectByUniqueOf(Long userId, Long reportLayoutId) {
        return facadeSelectByUniqueOf(userId, reportLayoutId);
    }

    protected OptionalEntity<PUserAutoPrintSetting> facadeSelectByUniqueOf(Long userId, Long reportLayoutId) {
        return doSelectByUniqueOf(userId, reportLayoutId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PUserAutoPrintSetting> OptionalEntity<ENTITY> doSelectByUniqueOf(Long userId, Long reportLayoutId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(userId, reportLayoutId), tp), userId, reportLayoutId);
    }

    protected PUserAutoPrintSettingCB xprepareCBAsUniqueOf(Long userId, Long reportLayoutId) {
        assertObjectNotNull("userId", userId);assertObjectNotNull("reportLayoutId", reportLayoutId);
        return newConditionBean().acceptUniqueOf(userId, reportLayoutId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PUserAutoPrintSetting&gt; <span style="color: #553000">pUserAutoPrintSettingList</span> = <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PUserAutoPrintSetting pUserAutoPrintSetting : <span style="color: #553000">pUserAutoPrintSettingList</span>) {
     *     ... = pUserAutoPrintSetting.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PUserAutoPrintSetting> selectList(PUserAutoPrintSettingCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PUserAutoPrintSetting&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PUserAutoPrintSetting pUserAutoPrintSetting : <span style="color: #553000">page</span>) {
     *     ... = pUserAutoPrintSetting.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PUserAutoPrintSetting> selectPage(PUserAutoPrintSettingCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().set...
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @param entityRowHandler The handler of entity row of PUserAutoPrintSetting. (NotNull)
     */
    public void selectCursor(PUserAutoPrintSettingCB cb, EntityRowHandler<PUserAutoPrintSetting> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PUserAutoPrintSettingCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PUserAutoPrintSettingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pUserAutoPrintSettingList The entity list of PUserAutoPrintSetting. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, ReferrerLoaderHandler<LoaderOfPUserAutoPrintSetting> loaderLambda) {
        xassLRArg(pUserAutoPrintSettingList, loaderLambda);
        loaderLambda.handle(new LoaderOfPUserAutoPrintSetting().ready(pUserAutoPrintSettingList, _behaviorSelector));
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
     * @param pUserAutoPrintSetting The entity of PUserAutoPrintSetting. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PUserAutoPrintSetting pUserAutoPrintSetting, ReferrerLoaderHandler<LoaderOfPUserAutoPrintSetting> loaderLambda) {
        xassLRArg(pUserAutoPrintSetting, loaderLambda);
        loaderLambda.handle(new LoaderOfPUserAutoPrintSetting().ready(xnewLRAryLs(pUserAutoPrintSetting), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PReportLayout'.
     * @param pUserAutoPrintSettingList The list of pUserAutoPrintSetting. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PReportLayout> pulloutPReportLayoutByReportLayoutId(List<PUserAutoPrintSetting> pUserAutoPrintSettingList)
    { return helpPulloutInternally(pUserAutoPrintSettingList, "pReportLayoutByReportLayoutId"); }

    /**
     * Pull out the list of foreign table 'PPrinterGroup'.
     * @param pUserAutoPrintSettingList The list of pUserAutoPrintSetting. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinterGroup> pulloutPPrinterGroupByPrinterGroupId(List<PUserAutoPrintSetting> pUserAutoPrintSettingList)
    { return helpPulloutInternally(pUserAutoPrintSettingList, "pPrinterGroupByPrinterGroupId"); }

    /**
     * Pull out the list of foreign table 'PPrinter'.
     * @param pUserAutoPrintSettingList The list of pUserAutoPrintSetting. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinter> pulloutPPrinterByPrinterId(List<PUserAutoPrintSetting> pUserAutoPrintSettingList)
    { return helpPulloutInternally(pUserAutoPrintSettingList, "pPrinterByPrinterId"); }

    /**
     * Pull out the list of foreign table 'PPrinterAttribute'.
     * @param pUserAutoPrintSettingList The list of pUserAutoPrintSetting. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinterAttribute> pulloutPPrinterAttributeByPrinterAttributeId(List<PUserAutoPrintSetting> pUserAutoPrintSettingList)
    { return helpPulloutInternally(pUserAutoPrintSettingList, "pPrinterAttributeByPrinterAttributeId"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key userAutoPrintSettingId.
     * @param pUserAutoPrintSettingList The list of pUserAutoPrintSetting. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUserAutoPrintSettingIdList(List<PUserAutoPrintSetting> pUserAutoPrintSettingList)
    { return helpExtractListInternally(pUserAutoPrintSettingList, "userAutoPrintSettingId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pUserAutoPrintSetting.setFoo...(value);
     * pUserAutoPrintSetting.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.set...;</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">insert</span>(pUserAutoPrintSetting);
     * ... = pUserAutoPrintSetting.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pUserAutoPrintSetting The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doInsert(pUserAutoPrintSetting, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pUserAutoPrintSetting.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pUserAutoPrintSetting.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">update</span>(pUserAutoPrintSetting);
     * </pre>
     * @param pUserAutoPrintSetting The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doUpdate(pUserAutoPrintSetting, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pUserAutoPrintSetting.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pUserAutoPrintSetting);
     * </pre>
     * @param pUserAutoPrintSetting The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doUpdateNonstrict(pUserAutoPrintSetting, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pUserAutoPrintSetting The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doInsertOrUpdate(pUserAutoPrintSetting, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pUserAutoPrintSetting The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doInsertOrUpdateNonstrict(pUserAutoPrintSetting, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pUserAutoPrintSetting.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">delete</span>(pUserAutoPrintSetting);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pUserAutoPrintSetting The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doDelete(pUserAutoPrintSetting, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pUserAutoPrintSetting);
     * </pre>
     * @param pUserAutoPrintSetting The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doDeleteNonstrict(pUserAutoPrintSetting, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pUserAutoPrintSetting);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pUserAutoPrintSetting The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PUserAutoPrintSetting pUserAutoPrintSetting) {
        doDeleteNonstrictIgnoreDeleted(pUserAutoPrintSetting, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PUserAutoPrintSetting et, final DeleteOption<PUserAutoPrintSettingCB> op) {
        assertObjectNotNull("pUserAutoPrintSetting", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     *     pUserAutoPrintSetting.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pUserAutoPrintSetting.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pUserAutoPrintSettingList.add(pUserAutoPrintSetting);
     * }
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchInsert</span>(pUserAutoPrintSettingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PUserAutoPrintSetting> pUserAutoPrintSettingList) {
        return doBatchInsert(pUserAutoPrintSettingList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     *     pUserAutoPrintSetting.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pUserAutoPrintSetting.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pUserAutoPrintSetting.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pUserAutoPrintSetting.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pUserAutoPrintSettingList.add(pUserAutoPrintSetting);
     * }
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pUserAutoPrintSettingList);
     * </pre>
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PUserAutoPrintSetting> pUserAutoPrintSettingList) {
        return doBatchUpdate(pUserAutoPrintSettingList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pUserAutoPrintSettingBhv.<span style="color: #CC4747">batchUpdate</span>(pUserAutoPrintSettingList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pUserAutoPrintSettingList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, SpecifyQuery<PUserAutoPrintSettingCB> colCBLambda) {
        return doBatchUpdate(pUserAutoPrintSettingList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     *     pUserAutoPrintSetting.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pUserAutoPrintSetting.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pUserAutoPrintSetting.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pUserAutoPrintSetting.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pUserAutoPrintSettingList.add(pUserAutoPrintSetting);
     * }
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pUserAutoPrintSettingList);
     * </pre>
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PUserAutoPrintSetting> pUserAutoPrintSettingList) {
        return doBatchUpdateNonstrict(pUserAutoPrintSettingList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pUserAutoPrintSettingList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pUserAutoPrintSettingList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, SpecifyQuery<PUserAutoPrintSettingCB> colCBLambda) {
        return doBatchUpdateNonstrict(pUserAutoPrintSettingList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PUserAutoPrintSetting> pUserAutoPrintSettingList) {
        return doBatchDelete(pUserAutoPrintSettingList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PUserAutoPrintSetting> pUserAutoPrintSettingList) {
        return doBatchDeleteNonstrict(pUserAutoPrintSettingList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PUserAutoPrintSetting, PUserAutoPrintSettingCB&gt;() {
     *     public ConditionBean setup(PUserAutoPrintSetting entity, PUserAutoPrintSettingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PUserAutoPrintSetting, PUserAutoPrintSettingCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setPK...(value);</span>
     * pUserAutoPrintSetting.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pUserAutoPrintSetting, cb);
     * </pre>
     * @param pUserAutoPrintSetting The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PUserAutoPrintSetting pUserAutoPrintSetting, PUserAutoPrintSettingCB cb) {
        return doQueryUpdate(pUserAutoPrintSetting, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PUserAutoPrintSettingCB cb = new PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">queryDelete</span>(pUserAutoPrintSetting, cb);
     * </pre>
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PUserAutoPrintSettingCB cb) {
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
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pUserAutoPrintSetting.setFoo...(value);
     * pUserAutoPrintSetting.setBar...(value);
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pUserAutoPrintSetting, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pUserAutoPrintSetting.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pUserAutoPrintSetting The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, InsertOption<PUserAutoPrintSettingCB>> opLambda) {
        doInsert(pUserAutoPrintSetting, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pUserAutoPrintSetting.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pUserAutoPrintSetting.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pUserAutoPrintSetting, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pUserAutoPrintSetting The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> opLambda) {
        doUpdate(pUserAutoPrintSetting, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * pUserAutoPrintSetting.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pUserAutoPrintSetting.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pUserAutoPrintSetting, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pUserAutoPrintSetting The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> opLambda) {
        doUpdateNonstrict(pUserAutoPrintSetting, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pUserAutoPrintSetting The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, InsertOption<PUserAutoPrintSettingCB>> insertOpLambda, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> updateOpLambda) {
        doInsertOrUpdate(pUserAutoPrintSetting, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pUserAutoPrintSetting The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, InsertOption<PUserAutoPrintSettingCB>> insertOpLambda, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pUserAutoPrintSetting, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pUserAutoPrintSetting The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, DeleteOption<PUserAutoPrintSettingCB>> opLambda) {
        doDelete(pUserAutoPrintSetting, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pUserAutoPrintSetting The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PUserAutoPrintSetting pUserAutoPrintSetting, WritableOptionCall<PUserAutoPrintSettingCB, DeleteOption<PUserAutoPrintSettingCB>> opLambda) {
        doDeleteNonstrict(pUserAutoPrintSetting, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, WritableOptionCall<PUserAutoPrintSettingCB, InsertOption<PUserAutoPrintSettingCB>> opLambda) {
        return doBatchInsert(pUserAutoPrintSettingList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> opLambda) {
        return doBatchUpdate(pUserAutoPrintSettingList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> opLambda) {
        return doBatchUpdateNonstrict(pUserAutoPrintSettingList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, WritableOptionCall<PUserAutoPrintSettingCB, DeleteOption<PUserAutoPrintSettingCB>> opLambda) {
        return doBatchDelete(pUserAutoPrintSettingList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pUserAutoPrintSettingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PUserAutoPrintSetting> pUserAutoPrintSettingList, WritableOptionCall<PUserAutoPrintSettingCB, DeleteOption<PUserAutoPrintSettingCB>> opLambda) {
        return doBatchDeleteNonstrict(pUserAutoPrintSettingList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PUserAutoPrintSetting, PUserAutoPrintSettingCB> manyArgLambda, WritableOptionCall<PUserAutoPrintSettingCB, InsertOption<PUserAutoPrintSettingCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PUserAutoPrintSetting pUserAutoPrintSetting = <span style="color: #70226C">new</span> PUserAutoPrintSetting();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setPK...(value);</span>
     * pUserAutoPrintSetting.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pUserAutoPrintSetting.setVersionNo(value);</span>
     * PUserAutoPrintSettingCB cb = <span style="color: #70226C">new</span> PUserAutoPrintSettingCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pUserAutoPrintSettingBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pUserAutoPrintSetting, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pUserAutoPrintSetting The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PUserAutoPrintSetting pUserAutoPrintSetting, PUserAutoPrintSettingCB cb, WritableOptionCall<PUserAutoPrintSettingCB, UpdateOption<PUserAutoPrintSettingCB>> opLambda) {
        return doQueryUpdate(pUserAutoPrintSetting, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PUserAutoPrintSetting. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PUserAutoPrintSettingCB cb, WritableOptionCall<PUserAutoPrintSettingCB, DeleteOption<PUserAutoPrintSettingCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pUserAutoPrintSettingBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pUserAutoPrintSettingBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pUserAutoPrintSettingBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pUserAutoPrintSettingBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pUserAutoPrintSettingBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pUserAutoPrintSettingBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pUserAutoPrintSettingBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pUserAutoPrintSettingBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pUserAutoPrintSettingBhv.outideSql().removeBlockComment().selectList()
     * pUserAutoPrintSettingBhv.outideSql().removeLineComment().selectList()
     * pUserAutoPrintSettingBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PUserAutoPrintSettingBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PUserAutoPrintSettingBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PUserAutoPrintSetting> typeOfSelectedEntity() { return PUserAutoPrintSetting.class; }
    protected Class<PUserAutoPrintSetting> typeOfHandlingEntity() { return PUserAutoPrintSetting.class; }
    protected Class<PUserAutoPrintSettingCB> typeOfHandlingConditionBean() { return PUserAutoPrintSettingCB.class; }
}
