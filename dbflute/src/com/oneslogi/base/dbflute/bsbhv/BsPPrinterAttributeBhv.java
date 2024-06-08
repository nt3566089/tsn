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
 * The behavior of P_PRINTER_ATTRIBUTE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [column]
 *     PRINTER_ATTRIBUTE_ID, PRINTER_ID, TRAY_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINTER, B_CLASS_DTL(ByVisible)
 *
 * [referrer table]
 *     P_LAYOUT_PRINT_SETTING, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign property]
 *     pPrinter, bClassDtlByVisible
 *
 * [referrer property]
 *     pLayoutPrintSettingList, pUserAutoPrintSettingByPrinterAttributeIdList, pTerminalAutoPrintSetByPrinterAttributeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrinterAttributeBhv extends AbstractBehaviorWritable<PPrinterAttribute, PPrinterAttributeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public PPrinterAttributeDbm asDBMeta() { return PPrinterAttributeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "P_PRINTER_ATTRIBUTE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public PPrinterAttributeDbm getMyDBMeta() { return PPrinterAttributeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PPrinterAttributeCB newConditionBean() { return new PPrinterAttributeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public PPrinterAttribute newMyEntity() { return new PPrinterAttribute(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public PPrinterAttributeCB newMyConditionBean() { return new PPrinterAttributeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PPrinterAttributeCB cb) {
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
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * PPrinterAttribute pPrinterAttribute = <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (pPrinterAttribute != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = pPrinterAttribute.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinterAttribute selectEntity(PPrinterAttributeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected PPrinterAttribute facadeSelectEntity(PPrinterAttributeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinterAttribute> OptionalEntity<ENTITY> doSelectOptionalEntity(PPrinterAttributeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().set...;
     * PPrinterAttribute pPrinterAttribute = <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = pPrinterAttribute.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinterAttribute selectEntityWithDeletedCheck(PPrinterAttributeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param printerAttributeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinterAttribute selectByPKValue(Long printerAttributeId) {
        return facadeSelectByPKValue(printerAttributeId);
    }

    protected PPrinterAttribute facadeSelectByPKValue(Long printerAttributeId) {
        return doSelectByPK(printerAttributeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinterAttribute> ENTITY doSelectByPK(Long printerAttributeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(printerAttributeId), tp);
    }

    protected <ENTITY extends PPrinterAttribute> OptionalEntity<ENTITY> doSelectOptionalByPK(Long printerAttributeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(printerAttributeId, tp), printerAttributeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param printerAttributeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public PPrinterAttribute selectByPKValueWithDeletedCheck(Long printerAttributeId) {
        return doSelectByPKWithDeletedCheck(printerAttributeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends PPrinterAttribute> ENTITY doSelectByPKWithDeletedCheck(Long printerAttributeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(printerAttributeId), tp);
    }

    protected PPrinterAttributeCB xprepareCBAsPK(Long printerAttributeId) {
        assertObjectNotNull("printerAttributeId", printerAttributeId);
        return newConditionBean().acceptPK(printerAttributeId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;PPrinterAttribute&gt; <span style="color: #553000">pPrinterAttributeList</span> = <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.get...;
     * }
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<PPrinterAttribute> selectList(PPrinterAttributeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;PPrinterAttribute&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">page</span>) {
     *     ... = pPrinterAttribute.get...();
     * }
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<PPrinterAttribute> selectPage(PPrinterAttributeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().set...
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @param entityRowHandler The handler of entity row of PPrinterAttribute. (NotNull)
     */
    public void selectCursor(PPrinterAttributeCB cb, EntityRowHandler<PPrinterAttribute> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrinterAttributeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PPrinterAttributeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<PPrinterAttribute> pPrinterAttributeList, ReferrerLoaderHandler<LoaderOfPPrinterAttribute> loaderLambda) {
        xassLRArg(pPrinterAttributeList, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrinterAttribute().ready(pPrinterAttributeList, _behaviorSelector));
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
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(PPrinterAttribute pPrinterAttribute, ReferrerLoaderHandler<LoaderOfPPrinterAttribute> loaderLambda) {
        xassLRArg(pPrinterAttribute, loaderLambda);
        loaderLambda.handle(new LoaderOfPPrinterAttribute().ready(xnewLRAryLs(pPrinterAttribute), _behaviorSelector));
    }

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(List<PPrinterAttribute> pPrinterAttributeList, ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterAttributeList, refCBLambda);
        return doLoadPLayoutPrintSettingList(pPrinterAttributeList, new LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PLayoutPrintSettingList by the set-upper of referrer. <br>
     * P_LAYOUT_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PLayoutPrintSettingList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPLayoutPrintSettingList</span>(<span style="color: #553000">pPrinterAttribute</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinterAttribute</span>.<span style="color: #CC4747">getPLayoutPrintSettingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(PPrinterAttribute pPrinterAttribute, ConditionBeanSetupper<PLayoutPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterAttribute, refCBLambda);
        return doLoadPLayoutPrintSettingList(xnewLRLs(pPrinterAttribute), new LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(PPrinterAttribute pPrinterAttribute, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterAttribute, loadReferrerOption);
        return loadPLayoutPrintSettingList(xnewLRLs(pPrinterAttribute), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PLayoutPrintSetting> loadPLayoutPrintSettingList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterAttributeList, loadReferrerOption);
        if (pPrinterAttributeList.isEmpty()) { return (NestedReferrerListGateway<PLayoutPrintSetting>)EMPTY_NREF_LGWAY; }
        return doLoadPLayoutPrintSettingList(pPrinterAttributeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PLayoutPrintSetting> doLoadPLayoutPrintSettingList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PLayoutPrintSettingCB, PLayoutPrintSetting> option) {
        return helpLoadReferrerInternally(pPrinterAttributeList, option, "pLayoutPrintSettingList");
    }

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterAttributeIdList</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterAttributeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterAttributeList, refCBLambda);
        return doLoadPUserAutoPrintSettingByPrinterAttributeIdList(pPrinterAttributeList, new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PUserAutoPrintSettingByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_USER_AUTO_PRINT_SETTING by PRINTER_ATTRIBUTE_ID, named 'PUserAutoPrintSettingByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPUserAutoPrintSettingByPrinterAttributeIdList</span>(<span style="color: #553000">pPrinterAttribute</span>, <span style="color: #553000">settingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">settingCB</span>.setupSelect...
     *     <span style="color: #553000">settingCB</span>.query().set...
     *     <span style="color: #553000">settingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinterAttribute</span>.<span style="color: #CC4747">getPUserAutoPrintSettingByPrinterAttributeIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterAttributeIdList(PPrinterAttribute pPrinterAttribute, ConditionBeanSetupper<PUserAutoPrintSettingCB> refCBLambda) {
        xassLRArg(pPrinterAttribute, refCBLambda);
        return doLoadPUserAutoPrintSettingByPrinterAttributeIdList(xnewLRLs(pPrinterAttribute), new LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterAttributeIdList(PPrinterAttribute pPrinterAttribute, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterAttribute, loadReferrerOption);
        return loadPUserAutoPrintSettingByPrinterAttributeIdList(xnewLRLs(pPrinterAttribute), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PUserAutoPrintSetting> loadPUserAutoPrintSettingByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> loadReferrerOption) {
        xassLRArg(pPrinterAttributeList, loadReferrerOption);
        if (pPrinterAttributeList.isEmpty()) { return (NestedReferrerListGateway<PUserAutoPrintSetting>)EMPTY_NREF_LGWAY; }
        return doLoadPUserAutoPrintSettingByPrinterAttributeIdList(pPrinterAttributeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PUserAutoPrintSetting> doLoadPUserAutoPrintSettingByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PUserAutoPrintSettingCB, PUserAutoPrintSetting> option) {
        return helpLoadReferrerInternally(pPrinterAttributeList, option, "pUserAutoPrintSettingByPrinterAttributeIdList");
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterAttributeIdList</span>(<span style="color: #553000">pPrinterAttributeList</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (PPrinterAttribute pPrinterAttribute : <span style="color: #553000">pPrinterAttributeList</span>) {
     *     ... = pPrinterAttribute.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterAttributeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pPrinterAttributeList, refCBLambda);
        return doLoadPTerminalAutoPrintSetByPrinterAttributeIdList(pPrinterAttributeList, new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of PTerminalAutoPrintSetByPrinterAttributeIdList by the set-upper of referrer. <br>
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_ATTRIBUTE_ID, named 'PTerminalAutoPrintSetByPrinterAttributeIdList'.
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">loadPTerminalAutoPrintSetByPrinterAttributeIdList</span>(<span style="color: #553000">pPrinterAttribute</span>, <span style="color: #553000">setCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">setCB</span>.setupSelect...
     *     <span style="color: #553000">setCB</span>.query().set...
     *     <span style="color: #553000">setCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">pPrinterAttribute</span>.<span style="color: #CC4747">getPTerminalAutoPrintSetByPrinterAttributeIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrinterAttributeId_InScope(pkList);
     * cb.query().addOrderBy_PrinterAttributeId_Asc();
     * </pre>
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterAttributeIdList(PPrinterAttribute pPrinterAttribute, ConditionBeanSetupper<PTerminalAutoPrintSetCB> refCBLambda) {
        xassLRArg(pPrinterAttribute, refCBLambda);
        return doLoadPTerminalAutoPrintSetByPrinterAttributeIdList(xnewLRLs(pPrinterAttribute), new LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param pPrinterAttribute The entity of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterAttributeIdList(PPrinterAttribute pPrinterAttribute, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pPrinterAttribute, loadReferrerOption);
        return loadPTerminalAutoPrintSetByPrinterAttributeIdList(xnewLRLs(pPrinterAttribute), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param pPrinterAttributeList The entity list of PPrinterAttribute. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PTerminalAutoPrintSet> loadPTerminalAutoPrintSetByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> loadReferrerOption) {
        xassLRArg(pPrinterAttributeList, loadReferrerOption);
        if (pPrinterAttributeList.isEmpty()) { return (NestedReferrerListGateway<PTerminalAutoPrintSet>)EMPTY_NREF_LGWAY; }
        return doLoadPTerminalAutoPrintSetByPrinterAttributeIdList(pPrinterAttributeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PTerminalAutoPrintSet> doLoadPTerminalAutoPrintSetByPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList, LoadReferrerOption<PTerminalAutoPrintSetCB, PTerminalAutoPrintSet> option) {
        return helpLoadReferrerInternally(pPrinterAttributeList, option, "pTerminalAutoPrintSetByPrinterAttributeIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'PPrinter'.
     * @param pPrinterAttributeList The list of pPrinterAttribute. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<PPrinter> pulloutPPrinter(List<PPrinterAttribute> pPrinterAttributeList)
    { return helpPulloutInternally(pPrinterAttributeList, "pPrinter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param pPrinterAttributeList The list of pPrinterAttribute. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByVisible(List<PPrinterAttribute> pPrinterAttributeList)
    { return helpPulloutInternally(pPrinterAttributeList, "bClassDtlByVisible"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key printerAttributeId.
     * @param pPrinterAttributeList The list of pPrinterAttribute. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPrinterAttributeIdList(List<PPrinterAttribute> pPrinterAttributeList)
    { return helpExtractListInternally(pPrinterAttributeList, "printerAttributeId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrinterAttribute.setFoo...(value);
     * pPrinterAttribute.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.set...;</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">insert</span>(pPrinterAttribute);
     * ... = pPrinterAttribute.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param pPrinterAttribute The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(PPrinterAttribute pPrinterAttribute) {
        doInsert(pPrinterAttribute, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinterAttribute.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinterAttribute.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">update</span>(pPrinterAttribute);
     * </pre>
     * @param pPrinterAttribute The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(PPrinterAttribute pPrinterAttribute) {
        doUpdate(pPrinterAttribute, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinterAttribute.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(pPrinterAttribute);
     * </pre>
     * @param pPrinterAttribute The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(PPrinterAttribute pPrinterAttribute) {
        doUpdateNonstrict(pPrinterAttribute, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrinterAttribute The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(PPrinterAttribute pPrinterAttribute) {
        doInsertOrUpdate(pPrinterAttribute, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param pPrinterAttribute The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(PPrinterAttribute pPrinterAttribute) {
        doInsertOrUpdateNonstrict(pPrinterAttribute, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinterAttribute.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">delete</span>(pPrinterAttribute);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param pPrinterAttribute The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(PPrinterAttribute pPrinterAttribute) {
        doDelete(pPrinterAttribute, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(pPrinterAttribute);
     * </pre>
     * @param pPrinterAttribute The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(PPrinterAttribute pPrinterAttribute) {
        doDeleteNonstrict(pPrinterAttribute, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(pPrinterAttribute);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param pPrinterAttribute The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(PPrinterAttribute pPrinterAttribute) {
        doDeleteNonstrictIgnoreDeleted(pPrinterAttribute, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(PPrinterAttribute et, final DeleteOption<PPrinterAttributeCB> op) {
        assertObjectNotNull("pPrinterAttribute", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     *     pPrinterAttribute.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinterAttribute.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     pPrinterAttributeList.add(pPrinterAttribute);
     * }
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchInsert</span>(pPrinterAttributeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<PPrinterAttribute> pPrinterAttributeList) {
        return doBatchInsert(pPrinterAttributeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     *     pPrinterAttribute.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinterAttribute.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrinterAttribute.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrinterAttribute.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrinterAttributeList.add(pPrinterAttribute);
     * }
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterAttributeList);
     * </pre>
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrinterAttribute> pPrinterAttributeList) {
        return doBatchUpdate(pPrinterAttributeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * pPrinterAttributeBhv.<span style="color: #CC4747">batchUpdate</span>(pPrinterAttributeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterAttributeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<PPrinterAttribute> pPrinterAttributeList, SpecifyQuery<PPrinterAttributeCB> colCBLambda) {
        return doBatchUpdate(pPrinterAttributeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     *     pPrinterAttribute.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         pPrinterAttribute.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         pPrinterAttribute.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//pPrinterAttribute.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     pPrinterAttributeList.add(pPrinterAttribute);
     * }
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(pPrinterAttributeList);
     * </pre>
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrinterAttribute> pPrinterAttributeList) {
        return doBatchUpdateNonstrict(pPrinterAttributeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrinterAttributeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(pPrinterAttributeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<PPrinterAttribute> pPrinterAttributeList, SpecifyQuery<PPrinterAttributeCB> colCBLambda) {
        return doBatchUpdateNonstrict(pPrinterAttributeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<PPrinterAttribute> pPrinterAttributeList) {
        return doBatchDelete(pPrinterAttributeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<PPrinterAttribute> pPrinterAttributeList) {
        return doBatchDeleteNonstrict(pPrinterAttributeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;PPrinterAttribute, PPrinterAttributeCB&gt;() {
     *     public ConditionBean setup(PPrinterAttribute entity, PPrinterAttributeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<PPrinterAttribute, PPrinterAttributeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setPK...(value);</span>
     * pPrinterAttribute.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(pPrinterAttribute, cb);
     * </pre>
     * @param pPrinterAttribute The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(PPrinterAttribute pPrinterAttribute, PPrinterAttributeCB cb) {
        return doQueryUpdate(pPrinterAttribute, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PPrinterAttributeCB cb = new PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">queryDelete</span>(pPrinterAttribute, cb);
     * </pre>
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PPrinterAttributeCB cb) {
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
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * pPrinterAttribute.setFoo...(value);
     * pPrinterAttribute.setBar...(value);
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(pPrinterAttribute, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = pPrinterAttribute.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param pPrinterAttribute The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, InsertOption<PPrinterAttributeCB>> opLambda) {
        doInsert(pPrinterAttribute, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinterAttribute.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * pPrinterAttribute.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(pPrinterAttribute, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinterAttribute The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> opLambda) {
        doUpdate(pPrinterAttribute, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * pPrinterAttribute.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * pPrinterAttribute.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(pPrinterAttribute, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinterAttribute The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> opLambda) {
        doUpdateNonstrict(pPrinterAttribute, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param pPrinterAttribute The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, InsertOption<PPrinterAttributeCB>> insertOpLambda, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> updateOpLambda) {
        doInsertOrUpdate(pPrinterAttribute, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param pPrinterAttribute The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, InsertOption<PPrinterAttributeCB>> insertOpLambda, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(pPrinterAttribute, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param pPrinterAttribute The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, DeleteOption<PPrinterAttributeCB>> opLambda) {
        doDelete(pPrinterAttribute, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param pPrinterAttribute The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(PPrinterAttribute pPrinterAttribute, WritableOptionCall<PPrinterAttributeCB, DeleteOption<PPrinterAttributeCB>> opLambda) {
        doDeleteNonstrict(pPrinterAttribute, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<PPrinterAttribute> pPrinterAttributeList, WritableOptionCall<PPrinterAttributeCB, InsertOption<PPrinterAttributeCB>> opLambda) {
        return doBatchInsert(pPrinterAttributeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<PPrinterAttribute> pPrinterAttributeList, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> opLambda) {
        return doBatchUpdate(pPrinterAttributeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<PPrinterAttribute> pPrinterAttributeList, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> opLambda) {
        return doBatchUpdateNonstrict(pPrinterAttributeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<PPrinterAttribute> pPrinterAttributeList, WritableOptionCall<PPrinterAttributeCB, DeleteOption<PPrinterAttributeCB>> opLambda) {
        return doBatchDelete(pPrinterAttributeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param pPrinterAttributeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<PPrinterAttribute> pPrinterAttributeList, WritableOptionCall<PPrinterAttributeCB, DeleteOption<PPrinterAttributeCB>> opLambda) {
        return doBatchDeleteNonstrict(pPrinterAttributeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<PPrinterAttribute, PPrinterAttributeCB> manyArgLambda, WritableOptionCall<PPrinterAttributeCB, InsertOption<PPrinterAttributeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * PPrinterAttribute pPrinterAttribute = <span style="color: #70226C">new</span> PPrinterAttribute();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setPK...(value);</span>
     * pPrinterAttribute.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//pPrinterAttribute.setVersionNo(value);</span>
     * PPrinterAttributeCB cb = <span style="color: #70226C">new</span> PPrinterAttributeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">pPrinterAttributeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(pPrinterAttribute, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param pPrinterAttribute The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(PPrinterAttribute pPrinterAttribute, PPrinterAttributeCB cb, WritableOptionCall<PPrinterAttributeCB, UpdateOption<PPrinterAttributeCB>> opLambda) {
        return doQueryUpdate(pPrinterAttribute, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of PPrinterAttribute. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PPrinterAttributeCB cb, WritableOptionCall<PPrinterAttributeCB, DeleteOption<PPrinterAttributeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * pPrinterAttributeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * pPrinterAttributeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrinterAttributeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * pPrinterAttributeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * pPrinterAttributeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * pPrinterAttributeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * pPrinterAttributeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * pPrinterAttributeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * pPrinterAttributeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * pPrinterAttributeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * pPrinterAttributeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * pPrinterAttributeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * pPrinterAttributeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * pPrinterAttributeBhv.outideSql().removeBlockComment().selectList()
     * pPrinterAttributeBhv.outideSql().removeLineComment().selectList()
     * pPrinterAttributeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PPrinterAttributeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PPrinterAttributeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends PPrinterAttribute> typeOfSelectedEntity() { return PPrinterAttribute.class; }
    protected Class<PPrinterAttribute> typeOfHandlingEntity() { return PPrinterAttribute.class; }
    protected Class<PPrinterAttributeCB> typeOfHandlingConditionBean() { return PPrinterAttributeCB.class; }
}
