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
 * The behavior of P_PRINTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTER_ID
 *
 * [column]
 *     PRINTER_ID, PRINTER_GROUP_ID, PRINTER_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER_GROUP, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER_ATTRIBUTE, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     pPrinterGroup, bClassDtlByVisible
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pPrinterAttributeList, pUserAutoPrintSettingByPrinterIdList, pTerminalAutoPrintSetByPrinterIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrinterBhv extends AbstractBehaviorWritable<PPrinter, PPrinterCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PPrinterDbm asDBMeta() { return PPrinterDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_PRINTER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PPrinterDbm getMyDBMeta() { return PPrinterDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PPrinterCB newConditionBean() { return new PPrinterCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PPrinter newMyEntity() { return new PPrinter(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PPrinterCB newMyConditionBean() { return new PPrinterCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PPrinterCB cb) {
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
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().setFoo...(value);
     * PPrinter pPrinter = <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pPrinter != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pPrinter.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinter selectEntity(PPrinterCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PPrinter facadeSelectEntity(PPrinterCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinter> OptionalEntity<ENTITY> doSelectOptionalEntity(PPrinterCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().set...;
     * PPrinter pPrinter = <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pPrinter.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinter selectEntityWithDeletedCheck(PPrinterCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param printerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinter selectByPKValue(Long printerId) {
        return facadeSelectByPKValue(printerId);
    }

    protected PPrinter facadeSelectByPKValue(Long printerId) {
        return doSelectByPK(printerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinter> ENTITY doSelectByPK(Long printerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(printerId), tp);
    }

    protected <ENTITY extends PPrinter> OptionalEntity<ENTITY> doSelectOptionalByPK(Long printerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(printerId, tp), printerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param printerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinter selectByPKValueWithDeletedCheck(Long printerId) {
        return doSelectByPKWithDeletedCheck(printerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinter> ENTITY doSelectByPKWithDeletedCheck(Long printerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(printerId), tp);
    }

    protected PPrinterCB xprepareCBAsPK(Long printerId) {
        assertObjectNotNull("printerId", printerId);
        return newConditionBean().acceptPK(printerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param printerGroupId : UQ+, IX, NotNull, bigint(19), FK to P_PRINTER_GROUP. (NotNull)
     * @param printerNm : +UQ, NotNull, varchar(60). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<PPrinter> selectByUniqueOf(Long printerGroupId, String printerNm) {
        return facadeSelectByUniqueOf(printerGroupId, printerNm);
    }

    protected OptionalEntity<PPrinter> facadeSelectByUniqueOf(Long printerGroupId, String printerNm) {
        return doSelectByUniqueOf(printerGroupId, printerNm, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinter> OptionalEntity<ENTITY> doSelectByUniqueOf(Long printerGroupId, String printerNm, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(printerGroupId, printerNm), tp), printerGroupId, printerNm);
    }

    protected PPrinterCB xprepareCBAsUniqueOf(Long printerGroupId, String printerNm) {
        assertObjectNotNull("printerGroupId", printerGroupId);assertObjectNotNull("printerNm", printerNm);
        return newConditionBean().acceptUniqueOf(printerGroupId, printerNm);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PPrinter&gt; <span style="color: #553000">pPrinterList</span> = <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PPrinter> selectList(PPrinterCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PPrinter&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">page</span>) {
     *     ... = pPrinter.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PPrinter> selectPage(PPrinterCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().set...
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @param entityRowHandler The handler of entity row of PPrinter. (NotNull)
     */
    public void selectCursor(PPrinterCB cb, EntityRowHandler<PPrinter> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrinterCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrinterCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PPrinter> pPrinterList, ReferrerLoaderHandler<LoaderOfPPrinter> loaderLambda) {
        xassLRArg(pPrinterList, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrinter().ready(pPrinterList, _behaviorSelector));
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
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PPrinter pPrinter, ReferrerLoaderHandler<LoaderOfPPrinter> loaderLambda) {
        xassLRArg(pPrinter, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrinter().ready(xnewLRAryLs(pPrinter), _behaviorSelector));
    }

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(List<PPrinter> pPrinterList, ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterList, refCBLambda);
        return doLoadPLayoutPrintSettingList(pPrinterList, new LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">pPrinter</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinter</span>.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(PPrinter pPrinter, ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinter, refCBLambda);
        return doLoadPLayoutPrintSettingList(xnewLRLs(pPrinter), new LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(PPrinter pPrinter, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinter, loadReferrerOption);
        return loadPLayoutPrintSettingList(xnewLRLs(pPrinter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(List<PPrinter> pPrinterList, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterList, loadReferrerOption);
        if (pPrinterList.isEmpty()) { return (NestedReferrerListGateway<PLayoutPrintSetting>)EMPTY_NREF_LGWAY; }
        return doLoadPLayoutPrintSettingList(pPrinterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PLayoutPrintSetting> doLoadPLayoutPrintSettingList(List<PPrinter> pPrinterList, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> option) {
        return helpLoadReferrerInternally(pPrinterList, option, "pLayoutPrintSettingList");
    }

    /**
     * Load referrer of PPrinterAttributeList by the set-upper of referrer. <br>
     * P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPPrinterAttributeList</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeCB</span>.setupSelect...
     *     <span style="color: #553000">attributeCB</span>.query().set...
     *     <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPPrinterAttributeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PPrinterAttribute> loadPPrinterAttributeList(List<PPrinter> pPrinterList, ConditionBeanSetupper<PPrinterAttributeCB> refCBLambda) {
        xassLRArg(pPrinterList, refCBLambda);
        return doLoadPPrinterAttributeList(pPrinterList, new LoadReferrerOption<PPrinterAttributeCB, PPrinterAttribute>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PPrinterAttributeList by the set-upper of referrer. <br>
     * P_PRINTER_ATTRIBUTE by PRINTER_ID, named 'PPrinterAttributeList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPPrinterAttributeList</span>(<span style="color: #553000">pPrinter</span>, <span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeCB</span>.setupSelect...
     *     <span style="color: #553000">attributeCB</span>.query().set...
     *     <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinter</span>.<span style="color: #CC4747">getPPrinterAttributeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PPrinterAttribute> loadPPrinterAttributeList(PPrinter pPrinter, ConditionBeanSetupper<PPrinterAttributeCB> refCBLambda) {
        xassLRArg(pPrinter, refCBLambda);
        return doLoadPPrinterAttributeList(xnewLRLs(pPrinter), new LoadReferrerOption<PPrinterAttributeCB, PPrinterAttribute>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PPrinterAttribute> loadPPrinterAttributeList(PPrinter pPrinter, LoadReferrerOption<PPrinterAttributeCB, PPrinterAttribute> loadReferrerOption) {
        xassLRArg(pPrinter, loadReferrerOption);
        return loadPPrinterAttributeList(xnewLRLs(pPrinter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PPrinterAttribute> loadPPrinterAttributeList(List<PPrinter> pPrinterList, LoadReferrerOption<PPrinterAttributeCB, PPrinterAttribute> loadReferrerOption) {
        xassLRArg(pPrinterList, loadReferrerOption);
        if (pPrinterList.isEmpty()) { return (NestedReferrerListGateway<PPrinterAttribute>)EMPTY_NREF_LGWAY; }
        return doLoadPPrinterAttributeList(pPrinterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PPrinterAttribute> doLoadPPrinterAttributeList(List<PPrinter> pPrinterList, LoadReferrerOption<PPrinterAttributeCB, PPrinterAttribute> option) {
        return helpLoadReferrerInternally(pPrinterList, option, "pPrinterAttributeList");
    }

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterIdList</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterIdList(List<PPrinter> pPrinterList, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterList, refCBLambda);
        return doLoadPUserAutoPrintSettingByPrinterIdList(pPrinterList, new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ID, named 'PUserAutoPrintSettingByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterIdList</span>(<span style="color: #553000">pPrinter</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinter</span>.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterIdList(PPrinter pPrinter, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinter, refCBLambda);
        return doLoadPUserAutoPrintSettingByPrinterIdList(xnewLRLs(pPrinter), new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterIdList(PPrinter pPrinter, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinter, loadReferrerOption);
        return loadPUserAutoPrintSettingByPrinterIdList(xnewLRLs(pPrinter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterIdList(List<PPrinter> pPrinterList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterList, loadReferrerOption);
        if (pPrinterList.isEmpty()) { return (NestedReferrerListGateway<PUserAutoPrintSetting>)EMPTY_NREF_LGWAY; }
        return doLoadPUserAutoPrintSettingByPrinterIdList(pPrinterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PUserAutoPrintSetting> doLoadPUserAutoPrintSettingByPrinterIdList(List<PPrinter> pPrinterList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> option) {
        return helpLoadReferrerInternally(pPrinterList, option, "pUserAutoPrintSettingByPrinterIdList");
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterIdList</span>(<span style="color: #553000">pPrinterList</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinter pPrinter : <span style="color: #553000">pPrinterList</span>) {
     *     ... = pPrinter.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterIdList(List<PPrinter> pPrinterList, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pPrinterList, refCBLambda);
        return doLoadPTerminalAutoPrintSetByPrinterIdList(pPrinterList, new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ID, named 'PTerminalAutoPrintSetByPrinterIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterIdList</span>(<span style="color: #553000">pPrinter</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinter</span>.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterId_InScope(pkList);
     * cb.query().addOrderBy_PrinterId_Asc();
     * </pre>
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterIdList(PPrinter pPrinter, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pPrinter, refCBLambda);
        return doLoadPTerminalAutoPrintSetByPrinterIdList(xnewLRLs(pPrinter), new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinter The entity of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterIdList(PPrinter pPrinter, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pPrinter, loadReferrerOption);
        return loadPTerminalAutoPrintSetByPrinterIdList(xnewLRLs(pPrinter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterList The entity list of PPrinter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterIdList(List<PPrinter> pPrinterList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pPrinterList, loadReferrerOption);
        if (pPrinterList.isEmpty()) { return (NestedReferrerListGateway<PTerminalAutoPrintSet>)EMPTY_NREF_LGWAY; }
        return doLoadPTerminalAutoPrintSetByPrinterIdList(pPrinterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PTerminalAutoPrintSet> doLoadPTerminalAutoPrintSetByPrinterIdList(List<PPrinter> pPrinterList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> option) {
        return helpLoadReferrerInternally(pPrinterList, option, "pTerminalAutoPrintSetByPrinterIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PPrinterGroup'.
     * @param pPrinterList The list of pPrinter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinterGroup> pulloutPPrinterGroup(List<PPrinter> pPrinterList)
    { return helpPulloutInternally(pPrinterList, "pPrinterGroup"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pPrinterList The list of pPrinter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByVisible(List<PPrinter> pPrinterList)
    { return helpPulloutInternally(pPrinterList, "bClassDtlByVisible"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key printerId.
     * @param pPrinterList The list of pPrinter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPrinterIdList(List<PPrinter> pPrinterList)
    { return helpExtractListInternally(pPrinterList, "printerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrinter.setFoo...(value);
     * pPrinter.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinter.set...;</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">insert</span>(pPrinter);
     * ... = pPrinter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pPrinter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PPrinter pPrinter) {
        doInsert(pPrinter, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinter.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">update</span>(pPrinter);
     * </pre>
     * @param pPrinter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PPrinter pPrinter) {
        doUpdate(pPrinter, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pPrinter);
     * </pre>
     * @param pPrinter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PPrinter pPrinter) {
        doUpdateNonstrict(pPrinter, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrinter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PPrinter pPrinter) {
        doInsertOrUpdate(pPrinter, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrinter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PPrinter pPrinter) {
        doInsertOrUpdateNonstrict(pPrinter, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">delete</span>(pPrinter);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pPrinter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PPrinter pPrinter) {
        doDelete(pPrinter, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pPrinter);
     * </pre>
     * @param pPrinter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PPrinter pPrinter) {
        doDeleteNonstrict(pPrinter, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pPrinter);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pPrinter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PPrinter pPrinter) {
        doDeleteNonstrictIgnoreDeleted(pPrinter, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PPrinter et, final DeleteOption<PPrinterCB> op) {
        assertObjectNotNull("pPrinter", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     *     pPrinter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinter.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pPrinterList.add(pPrinter);
     * }
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchInsert</span>(pPrinterList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PPrinter> pPrinterList) {
        return doBatchInsert(pPrinterList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     *     pPrinter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrinter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrinter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrinterList.add(pPrinter);
     * }
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterList);
     * </pre>
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrinter> pPrinterList) {
        return doBatchUpdate(pPrinterList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pPrinterBhv.<span style="color: #CC4747">batchUpdate</span>(pPrinterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrinter> pPrinterList, SpecifyQuery<PPrinterCB> colCBLambda) {
        return doBatchUpdate(pPrinterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     *     pPrinter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrinter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrinter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrinterList.add(pPrinter);
     * }
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterList);
     * </pre>
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrinter> pPrinterList) {
        return doBatchUpdateNonstrict(pPrinterList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrinterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrinterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrinter> pPrinterList, SpecifyQuery<PPrinterCB> colCBLambda) {
        return doBatchUpdateNonstrict(pPrinterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PPrinter> pPrinterList) {
        return doBatchDelete(pPrinterList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PPrinter> pPrinterList) {
        return doBatchDeleteNonstrict(pPrinterList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PPrinter, PPrinterCB&gt;() {
     *     public ConditionBean setup(PPrinter entity, PPrinterCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PPrinter, PPrinterCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrinter.setPK...(value);</span>
     * pPrinter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pPrinter, cb);
     * </pre>
     * @param pPrinter The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PPrinter pPrinter, PPrinterCB cb) {
        return doQueryUpdate(pPrinter, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PPrinterCB cb = new PPrinterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">queryDelete</span>(pPrinter, cb);
     * </pre>
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PPrinterCB cb) {
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
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrinter.setFoo...(value);
     * pPrinter.setBar...(value);
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pPrinter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pPrinter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pPrinter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PPrinter pPrinter, WritableOptionCall<PPrinterCB, InsertOption<PPrinterCB>> opLambda) {
        doInsert(pPrinter, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pPrinter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PPrinter pPrinter, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> opLambda) {
        doUpdate(pPrinter, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * pPrinter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pPrinter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PPrinter pPrinter, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> opLambda) {
        doUpdateNonstrict(pPrinter, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pPrinter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PPrinter pPrinter, WritableOptionCall<PPrinterCB, InsertOption<PPrinterCB>> insertOpLambda, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> updateOpLambda) {
        doInsertOrUpdate(pPrinter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pPrinter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PPrinter pPrinter, WritableOptionCall<PPrinterCB, InsertOption<PPrinterCB>> insertOpLambda, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pPrinter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pPrinter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PPrinter pPrinter, WritableOptionCall<PPrinterCB, DeleteOption<PPrinterCB>> opLambda) {
        doDelete(pPrinter, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pPrinter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PPrinter pPrinter, WritableOptionCall<PPrinterCB, DeleteOption<PPrinterCB>> opLambda) {
        doDeleteNonstrict(pPrinter, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PPrinter> pPrinterList, WritableOptionCall<PPrinterCB, InsertOption<PPrinterCB>> opLambda) {
        return doBatchInsert(pPrinterList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PPrinter> pPrinterList, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> opLambda) {
        return doBatchUpdate(pPrinterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PPrinter> pPrinterList, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> opLambda) {
        return doBatchUpdateNonstrict(pPrinterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PPrinter> pPrinterList, WritableOptionCall<PPrinterCB, DeleteOption<PPrinterCB>> opLambda) {
        return doBatchDelete(pPrinterList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pPrinterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PPrinter> pPrinterList, WritableOptionCall<PPrinterCB, DeleteOption<PPrinterCB>> opLambda) {
        return doBatchDeleteNonstrict(pPrinterList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PPrinter, PPrinterCB> manyArgLambda, WritableOptionCall<PPrinterCB, InsertOption<PPrinterCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrinter pPrinter = <span style="color: #70226C">new</span> PPrinter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrinter.setPK...(value);</span>
     * pPrinter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinter.setVersionNo(value);</span>
     * PPrinterCB cb = <span style="color: #70226C">new</span> PPrinterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pPrinter, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinter The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PPrinter pPrinter, PPrinterCB cb, WritableOptionCall<PPrinterCB, UpdateOption<PPrinterCB>> opLambda) {
        return doQueryUpdate(pPrinter, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PPrinter. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PPrinterCB cb, WritableOptionCall<PPrinterCB, DeleteOption<PPrinterCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pPrinterBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pPrinterBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrinterBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pPrinterBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrinterBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pPrinterBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pPrinterBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pPrinterBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pPrinterBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pPrinterBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pPrinterBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pPrinterBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pPrinterBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pPrinterBhv.outideSql().removeBlockComment().selectList()
     * pPrinterBhv.outideSql().removeLineComment().selectList()
     * pPrinterBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PPrinterBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PPrinterBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PPrinter> typeOfSelectedEntity() { return PPrinter.class; }
    protected Class<PPrinter> typeOfHandlingEntity() { return PPrinter.class; }
    protected Class<PPrinterCB> typeOfHandlingConditionBean() { return PPrinterCB.class; }
}
