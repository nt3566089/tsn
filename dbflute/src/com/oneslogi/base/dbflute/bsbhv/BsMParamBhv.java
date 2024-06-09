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
 * The behavior of M_PARAM as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_CENTER_ID
 *
 * [column]
 *     CLIENT_CENTER_ID, DELIVERY_COURSE_ID, STORE_DT_FLG, STORE_NO_FLG, MERGE_CLS, T_KEEPING_DAYS, H_KEEPING_DAYS, D_KEEPING_DAYS, OVER_STORE_NUM_FLG, PAST_STORE_DT_FLG, USE_HT_SHIP_FLG, ALLOC_SORT_KEY, RG_REPLENISH_UNIT_CLS, EM_REPLENISH_UNIT_CLS, EM_REPLENISH_ZONE_ID, EM_REPLENISH_ALLOC_CLS, PACKING_CAL_CLS, PACKING_PROCESS_CLS, PRODUCT_PART_PACKING, DECIMAL_PRODUCT_PACKING, PACKING_BOX_GROUP_ID, TOTAL_PIC_FLG, MULTI_PIC_CLS, BACKET_COL_NUM, BACKET_ROW_NUM, CASE_PIC_FLG, SGL_ROW_PIC_FLG, SGL_ROW_PIC_MAX_INST_NUM, PIC_MTHD_RCMD_FLG, PIC_MTHD_RCMD_BREAK_KEY, PIC_MTHD_RCMD_API_KEY, PIC_MTHD_RCMD_MLT_PL_OUT, PIC_MTHD_RCMD_SPL_SL_OUT, PRODUCT_LABEL_OUT_UNIT, RESULT_AFTER_PRODUCT_LABEL, RESULT_AFTER_PRODUCT_TARGET, PRODUCT_LABEL_JAN_BARCODE, PRODUCT_LABEL_PROD_BARCODE, PRODUCT_LABEL_JAN_STARTBIT, PRODUCT_LABEL_JAN_ENDBIT, PRODUCT_LABEL_PROD_STARTBIT, PRODUCT_LABEL_PROD_ENDBIT, BOX_SELECT_SKIP, DEFAULT_BOX_ID, ERROR_SOUND_PLAY_FLG, WARN_SOUND_PLAY_FLG, INSP_SOUND_PLAY_FLG, INSP_COMP_SOUND_PLAY_FLG, AFTER_TAG_OUT_FLG, TAG_DELIVERY_OUT_FLG, AFTER_DELIV_SLIP_OUT_FLG, AFTER_DELIV_SLIP_OUT_TGT, SGL_ROW_INSP_AFTER_OUT_CLS, HT_CHAR_READ_FLG, HT_LOT_INPUT_TYPE, HT_SERIAL_INPUT_TYPE, INSPECTION_LABEL_OUT_FLG, AUTO_SHIP_INST_FLG, STOCK_OUT_AUTO_INST_FLG, AUTO_EMG_SET_FLG, AUTO_EMG_SET_TGT, AUTO_EMG_SET_MINUTE, STOCK_OUT_INST_CXL_FLG, STOCK_OUT_ALLOC_CLS, STOCK_OUT_INST_SPLIT_FLG, CES_INTEGRATION_FLG, PACKING_SLIP_AUTO_OUTPUT_FLG, CENTER_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT_CENTER, M_BOX, M_DELIVERY_COURSE, M_ZONE, M_BOX_GRP, B_CLASS_DTL(ByAfterTagOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClientCenter, mBox, mDeliveryCourse, mZone, mBoxGrp, bClassDtlByAfterTagOutFlg, bClassDtlByAfterDelivSlipOutFlg, bClassDtlByAfterDelivSlipOutTgt, bClassDtlBySglRowInspAfterOutCls, bClassDtlByBoxSelectSkip, bClassDtlByCasePicFlg, bClassDtlByDelFlg, bClassDtlByHtCharReadFlg, bClassDtlByMergeCls, bClassDtlByMultiPicCls, bClassDtlByOverStoreNumFlg, bClassDtlByPackingCalCls, bClassDtlByPackingProcessCls, bClassDtlByPastStoreDtFlg, bClassDtlByProductLabelJanBarcode, bClassDtlByProductLabelOutUnit, bClassDtlByProductLabelProdBarcode, bClassDtlByProductPartPacking, bClassDtlByDecimalProductPacking, bClassDtlByEmReplenishAllocCls, bClassDtlByRgReplenishUnitCls, bClassDtlByEmReplenishUnitCls, bClassDtlByResultAfterProductLabel, bClassDtlByResultAfterProductTarget, bClassDtlByStoreDtFlg, bClassDtlByStoreNoFlg, bClassDtlByTagDeliveryOutFlg, bClassDtlByUseHtShipFlg, bClassDtlByInspectionLabelOutFlg, bClassDtlBySglRowPicFlg, bClassDtlByTotalPicFlg, bClassDtlByPicMthdRcmdFlg, bClassDtlByPicMthdRcmdBreakKey, bClassDtlByAutoShipInstFlg, bClassDtlByStockOutAutoInstFlg, bClassDtlByAutoEmgSetFlg, bClassDtlByAutoEmgSetTgt, bClassDtlByStockOutAllocCls, bClassDtlByStockOutInstCxlFlg, bClassDtlByStockOutInstSplitFlg, bClassDtlByPicMthdRcmdMltPlOut, bClassDtlByPicMthdRcmdSplSlOut, bClassDtlByErrorSoundPlayFlg, bClassDtlByWarnSoundPlayFlg, bClassDtlByInspSoundPlayFlg, bClassDtlByInspCompSoundPlayFlg, bClassDtlByCesIntegrationFlg, bClassDtlByPackingSlipAutoOutputFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMParamBhv extends AbstractBehaviorWritable<MParam, MParamCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MParamDbm asDBMeta() { return MParamDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_PARAM"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MParamDbm getMyDBMeta() { return MParamDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MParamCB newConditionBean() { return new MParamCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MParam newMyEntity() { return new MParam(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MParamCB newMyConditionBean() { return new MParamCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MParamCB cb) {
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
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().setFoo...(value);
     * MParam mParam = <span style="color: #0000C0">mParamBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mParam != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mParam.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MParam selectEntity(MParamCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MParam facadeSelectEntity(MParamCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MParam> OptionalEntity<ENTITY> doSelectOptionalEntity(MParamCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().set...;
     * MParam mParam = <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mParam.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MParam selectEntityWithDeletedCheck(MParamCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param clientCenterId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MParam selectByPKValue(Long clientCenterId) {
        return facadeSelectByPKValue(clientCenterId);
    }

    protected MParam facadeSelectByPKValue(Long clientCenterId) {
        return doSelectByPK(clientCenterId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MParam> ENTITY doSelectByPK(Long clientCenterId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(clientCenterId), tp);
    }

    protected <ENTITY extends MParam> OptionalEntity<ENTITY> doSelectOptionalByPK(Long clientCenterId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(clientCenterId, tp), clientCenterId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clientCenterId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MParam selectByPKValueWithDeletedCheck(Long clientCenterId) {
        return doSelectByPKWithDeletedCheck(clientCenterId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MParam> ENTITY doSelectByPKWithDeletedCheck(Long clientCenterId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(clientCenterId), tp);
    }

    protected MParamCB xprepareCBAsPK(Long clientCenterId) {
        assertObjectNotNull("clientCenterId", clientCenterId);
        return newConditionBean().acceptPK(clientCenterId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MParam&gt; <span style="color: #553000">mParamList</span> = <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MParam mParam : <span style="color: #553000">mParamList</span>) {
     *     ... = mParam.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MParam> selectList(MParamCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MParam&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MParam mParam : <span style="color: #553000">page</span>) {
     *     ... = mParam.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MParam> selectPage(MParamCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().set...
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @param entityRowHandler The handler of entity row of MParam. (NotNull)
     */
    public void selectCursor(MParamCB cb, EntityRowHandler<MParam> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MParamCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MParamCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mParamList The entity list of MParam. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MParam> mParamList, ReferrerLoaderHandler<LoaderOfMParam> loaderLambda) {
        xassLRArg(mParamList, loaderLambda);
        loaderLambda.handle(new LoaderOfMParam().ready(mParamList, _behaviorSelector));
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
     * @param mParam The entity of MParam. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MParam mParam, ReferrerLoaderHandler<LoaderOfMParam> loaderLambda) {
        xassLRArg(mParam, loaderLambda);
        loaderLambda.handle(new LoaderOfMParam().ready(xnewLRAryLs(mParam), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClientCenter'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClientCenter> pulloutMClientCenter(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "mClientCenter"); }

    /**
     * Pull out the list of foreign table 'MBox'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MBox> pulloutMBox(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "mBox"); }

    /**
     * Pull out the list of foreign table 'MDeliveryCourse'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MDeliveryCourse> pulloutMDeliveryCourse(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "mDeliveryCourse"); }

    /**
     * Pull out the list of foreign table 'MZone'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MZone> pulloutMZone(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "mZone"); }

    /**
     * Pull out the list of foreign table 'MBoxGrp'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MBoxGrp> pulloutMBoxGrp(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "mBoxGrp"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAfterTagOutFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAfterTagOutFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAfterDelivSlipOutFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAfterDelivSlipOutFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAfterDelivSlipOutTgt(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAfterDelivSlipOutTgt"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySglRowInspAfterOutCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlBySglRowInspAfterOutCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByBoxSelectSkip(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByBoxSelectSkip"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCasePicFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByCasePicFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByHtCharReadFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByHtCharReadFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMergeCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByMergeCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMultiPicCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByMultiPicCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByOverStoreNumFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByOverStoreNumFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPackingCalCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPackingCalCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPackingProcessCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPackingProcessCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPastStoreDtFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPastStoreDtFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByProductLabelJanBarcode(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByProductLabelJanBarcode"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByProductLabelOutUnit(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByProductLabelOutUnit"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByProductLabelProdBarcode(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByProductLabelProdBarcode"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByProductPartPacking(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByProductPartPacking"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDecimalProductPacking(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByDecimalProductPacking"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEmReplenishAllocCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByEmReplenishAllocCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByRgReplenishUnitCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByRgReplenishUnitCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEmReplenishUnitCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByEmReplenishUnitCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByResultAfterProductLabel(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByResultAfterProductLabel"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByResultAfterProductTarget(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByResultAfterProductTarget"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStoreDtFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStoreDtFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStoreNoFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStoreNoFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTagDeliveryOutFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByTagDeliveryOutFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByUseHtShipFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByUseHtShipFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInspectionLabelOutFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByInspectionLabelOutFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySglRowPicFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlBySglRowPicFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTotalPicFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByTotalPicFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPicMthdRcmdFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPicMthdRcmdFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPicMthdRcmdBreakKey(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPicMthdRcmdBreakKey"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAutoShipInstFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAutoShipInstFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockOutAutoInstFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStockOutAutoInstFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAutoEmgSetFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAutoEmgSetFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByAutoEmgSetTgt(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByAutoEmgSetTgt"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockOutAllocCls(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStockOutAllocCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockOutInstCxlFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStockOutInstCxlFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByStockOutInstSplitFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByStockOutInstSplitFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPicMthdRcmdMltPlOut(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPicMthdRcmdMltPlOut"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPicMthdRcmdSplSlOut(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPicMthdRcmdSplSlOut"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorSoundPlayFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByErrorSoundPlayFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByWarnSoundPlayFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByWarnSoundPlayFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInspSoundPlayFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByInspSoundPlayFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInspCompSoundPlayFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByInspCompSoundPlayFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCesIntegrationFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByCesIntegrationFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPackingSlipAutoOutputFlg(List<MParam> mParamList)
    { return helpPulloutInternally(mParamList, "bClassDtlByPackingSlipAutoOutputFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key clientCenterId.
     * @param mParamList The list of mParam. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractClientCenterIdList(List<MParam> mParamList)
    { return helpExtractListInternally(mParamList, "clientCenterId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mParam.setFoo...(value);
     * mParam.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mParam.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mParam.set...;</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">insert</span>(mParam);
     * ... = mParam.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mParam The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MParam mParam) {
        doInsert(mParam, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mParam.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mParam.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mParam.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mParam.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">update</span>(mParam);
     * </pre>
     * @param mParam The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MParam mParam) {
        doUpdate(mParam, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mParam.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mParam.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mParam.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mParam);
     * </pre>
     * @param mParam The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MParam mParam) {
        doUpdateNonstrict(mParam, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mParam The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MParam mParam) {
        doInsertOrUpdate(mParam, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mParam The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MParam mParam) {
        doInsertOrUpdateNonstrict(mParam, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mParam.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">delete</span>(mParam);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mParam The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MParam mParam) {
        doDelete(mParam, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mParam);
     * </pre>
     * @param mParam The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MParam mParam) {
        doDeleteNonstrict(mParam, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mParam);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mParam The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MParam mParam) {
        doDeleteNonstrictIgnoreDeleted(mParam, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MParam et, final DeleteOption<MParamCB> op) {
        assertObjectNotNull("mParam", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MParam mParam = <span style="color: #70226C">new</span> MParam();
     *     mParam.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mParam.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mParamList.add(mParam);
     * }
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchInsert</span>(mParamList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MParam> mParamList) {
        return doBatchInsert(mParamList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MParam mParam = <span style="color: #70226C">new</span> MParam();
     *     mParam.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mParam.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mParam.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mParam.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mParamList.add(mParam);
     * }
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mParamList);
     * </pre>
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MParam> mParamList) {
        return doBatchUpdate(mParamList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mParamBhv.<span style="color: #CC4747">batchUpdate</span>(mParamList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mParamList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MParam> mParamList, SpecifyQuery<MParamCB> colCBLambda) {
        return doBatchUpdate(mParamList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MParam mParam = <span style="color: #70226C">new</span> MParam();
     *     mParam.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mParam.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mParam.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mParam.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mParamList.add(mParam);
     * }
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mParamList);
     * </pre>
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MParam> mParamList) {
        return doBatchUpdateNonstrict(mParamList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mParamList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mParamList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MParam> mParamList, SpecifyQuery<MParamCB> colCBLambda) {
        return doBatchUpdateNonstrict(mParamList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MParam> mParamList) {
        return doBatchDelete(mParamList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MParam> mParamList) {
        return doBatchDeleteNonstrict(mParamList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MParam, MParamCB&gt;() {
     *     public ConditionBean setup(MParam entity, MParamCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MParam, MParamCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mParam.setPK...(value);</span>
     * mParam.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mParam.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mParam.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mParam, cb);
     * </pre>
     * @param mParam The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MParam mParam, MParamCB cb) {
        return doQueryUpdate(mParam, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MParamCB cb = new MParamCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">queryDelete</span>(mParam, cb);
     * </pre>
     * @param cb The condition-bean of MParam. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MParamCB cb) {
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
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mParam.setFoo...(value);
     * mParam.setBar...(value);
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mParam, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mParam.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mParam The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MParam mParam, WritableOptionCall<MParamCB, InsertOption<MParamCB>> opLambda) {
        doInsert(mParam, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mParam.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mParam.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mParam, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mParam The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MParam mParam, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> opLambda) {
        doUpdate(mParam, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * mParam.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mParam.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mParam, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mParam The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MParam mParam, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> opLambda) {
        doUpdateNonstrict(mParam, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mParam The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MParam mParam, WritableOptionCall<MParamCB, InsertOption<MParamCB>> insertOpLambda, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> updateOpLambda) {
        doInsertOrUpdate(mParam, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mParam The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MParam mParam, WritableOptionCall<MParamCB, InsertOption<MParamCB>> insertOpLambda, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mParam, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mParam The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MParam mParam, WritableOptionCall<MParamCB, DeleteOption<MParamCB>> opLambda) {
        doDelete(mParam, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mParam The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MParam mParam, WritableOptionCall<MParamCB, DeleteOption<MParamCB>> opLambda) {
        doDeleteNonstrict(mParam, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MParam> mParamList, WritableOptionCall<MParamCB, InsertOption<MParamCB>> opLambda) {
        return doBatchInsert(mParamList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MParam> mParamList, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> opLambda) {
        return doBatchUpdate(mParamList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MParam> mParamList, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> opLambda) {
        return doBatchUpdateNonstrict(mParamList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MParam> mParamList, WritableOptionCall<MParamCB, DeleteOption<MParamCB>> opLambda) {
        return doBatchDelete(mParamList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mParamList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MParam> mParamList, WritableOptionCall<MParamCB, DeleteOption<MParamCB>> opLambda) {
        return doBatchDeleteNonstrict(mParamList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MParam, MParamCB> manyArgLambda, WritableOptionCall<MParamCB, InsertOption<MParamCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MParam mParam = <span style="color: #70226C">new</span> MParam();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mParam.setPK...(value);</span>
     * mParam.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mParam.setVersionNo(value);</span>
     * MParamCB cb = <span style="color: #70226C">new</span> MParamCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mParamBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mParam, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mParam The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MParam. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MParam mParam, MParamCB cb, WritableOptionCall<MParamCB, UpdateOption<MParamCB>> opLambda) {
        return doQueryUpdate(mParam, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MParam. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MParamCB cb, WritableOptionCall<MParamCB, DeleteOption<MParamCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mParamBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mParamBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mParamBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mParamBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mParamBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mParamBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mParamBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mParamBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mParamBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mParamBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mParamBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mParamBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mParamBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mParamBhv.outideSql().removeBlockComment().selectList()
     * mParamBhv.outideSql().removeLineComment().selectList()
     * mParamBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MParamBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MParamBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MParam> typeOfSelectedEntity() { return MParam.class; }
    protected Class<MParam> typeOfHandlingEntity() { return MParam.class; }
    protected Class<MParamCB> typeOfHandlingConditionBean() { return MParamCB.class; }
}
