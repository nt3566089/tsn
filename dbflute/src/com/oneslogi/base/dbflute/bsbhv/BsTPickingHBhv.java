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
 * The behavior of T_PICKING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PICKING_STATUS, DELIV_UNIT_NO, PICKING_WORK_NO, ALLOC_INST_H_ID, FORCE_FIXED_FLG, PICKING_GROUP_NO, SGL_ROW_PIC_FLG, SHIPPING_FIXED_DT, CENTER_TRANSIT_FLG, PACKING_CAL_CLS, BOL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, M_CENTER, M_CLIENT, T_ALLOC_INST_H, B_CLASS_DTL(ByCenterTransitFlg), T_PICKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_H, T_PICKING_B, T_PIC_MTHD_RCMD_DATA, T_RECEIVE_PLAN_H, W_SGL_ROW_SHIP_INSP_B, T_PICKING_R
 *
 * [foreign property]
 *     mProcessType, mCenter, mClient, tAllocInstH, bClassDtlByCenterTransitFlg, bClassDtlByForceFixedFlg, bClassDtlByPackingCalCls, bClassDtlByPickingStatus, bClassDtlBySglRowPicFlg, tPickingRAsOne
 *
 * [referrer property]
 *     tPackingHList, tPickingBList, tPicMthdRcmdDataList, tReceivePlanHList, wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPickingHBhv extends AbstractBehaviorWritable<TPickingH, TPickingHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** Bill of Ladingを取得します。 */
    public static final String PATH_selectSqlBillOfLadingPrint = "selectSqlBillOfLadingPrint";
    /** Bill of Lading発行画面　出庫作業№単位で1行です。 */
    public static final String PATH_selectSqlBillOfLadingPrintSelect = "selectSqlBillOfLadingPrintSelect";
    /** Bill of Ladingを取得します。 */
    public static final String PATH_selectSqlBillOfLadingPrintSubReport = "selectSqlBillOfLadingPrintSubReport";
    /** 納品明細を取得します。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlDeliverySlipListPrint = "selectSqlDeliverySlipListPrint";
    /** マッチング変換のデータを取得します。 */
    public static final String PATH_selectSqlMatchingUintnumList = "selectSqlMatchingUintnumList";
    /** マルチピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlMultiPickingListPrint = "selectSqlMultiPickingListPrint";
    /** Packing Slipを取得します。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlPackingSlipListPrint = "selectSqlPackingSlipListPrint";
    /** ピッキングリスト発行画面　出庫作業№単位で1行です。 */
    public static final String PATH_selectSqlPickingListPrint = "selectSqlPickingListPrint";
    /** 出荷確定一覧 */
    public static final String PATH_selectSqlShippingConfirmList = "selectSqlShippingConfirmList";
    /** 送り状データ出力。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlShippingTagDataOutput = "selectSqlShippingTagDataOutput";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TPickingHDbm asDBMeta() { return TPickingHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_PICKING_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TPickingHDbm getMyDBMeta() { return TPickingHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TPickingHCB newConditionBean() { return new TPickingHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TPickingH newMyEntity() { return new TPickingH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TPickingHCB newMyConditionBean() { return new TPickingHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TPickingHCB cb) {
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
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().setFoo...(value);
     * TPickingH tPickingH = <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tPickingH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tPickingH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPickingH selectEntity(TPickingHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TPickingH facadeSelectEntity(TPickingHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPickingH> OptionalEntity<ENTITY> doSelectOptionalEntity(TPickingHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().set...;
     * TPickingH tPickingH = <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tPickingH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPickingH selectEntityWithDeletedCheck(TPickingHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param pickingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPickingH selectByPKValue(Long pickingHId) {
        return facadeSelectByPKValue(pickingHId);
    }

    protected TPickingH facadeSelectByPKValue(Long pickingHId) {
        return doSelectByPK(pickingHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPickingH> ENTITY doSelectByPK(Long pickingHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(pickingHId), tp);
    }

    protected <ENTITY extends TPickingH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long pickingHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(pickingHId, tp), pickingHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param pickingHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPickingH selectByPKValueWithDeletedCheck(Long pickingHId) {
        return doSelectByPKWithDeletedCheck(pickingHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPickingH> ENTITY doSelectByPKWithDeletedCheck(Long pickingHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(pickingHId), tp);
    }

    protected TPickingHCB xprepareCBAsPK(Long pickingHId) {
        assertObjectNotNull("pickingHId", pickingHId);
        return newConditionBean().acceptPK(pickingHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TPickingH&gt; <span style="color: #553000">tPickingHList</span> = <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TPickingH> selectList(TPickingHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TPickingH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">page</span>) {
     *     ... = tPickingH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TPickingH> selectPage(TPickingHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @param entityRowHandler The handler of entity row of TPickingH. (NotNull)
     */
    public void selectCursor(TPickingHCB cb, EntityRowHandler<TPickingH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPickingHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPickingHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TPickingH> tPickingHList, ReferrerLoaderHandler<LoaderOfTPickingH> loaderLambda) {
        xassLRArg(tPickingHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTPickingH().ready(tPickingHList, _behaviorSelector));
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
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TPickingH tPickingH, ReferrerLoaderHandler<LoaderOfTPickingH> loaderLambda) {
        xassLRArg(tPickingH, loaderLambda);
        loaderLambda.handle(new LoaderOfTPickingH().ready(xnewLRAryLs(tPickingH), _behaviorSelector));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<TPickingH> tPickingHList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(tPickingHList, refCBLambda);
        return doLoadTPackingHList(tPickingHList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">tPickingH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(TPickingH tPickingH, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(tPickingH, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(tPickingH), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(TPickingH tPickingH, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(tPickingH, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(tPickingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<TPickingH> tPickingHList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(tPickingHList, loadReferrerOption);
        if (tPickingHList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(tPickingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<TPickingH> tPickingHList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(tPickingHList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TPickingH> tPickingHList, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tPickingHList, refCBLambda);
        return doLoadTPickingBList(tPickingHList, new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">tPickingH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTPickingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TPickingH tPickingH, ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        xassLRArg(tPickingH, refCBLambda);
        return doLoadTPickingBList(xnewLRLs(tPickingH), new LoadReferrerOption<TPickingBCB, TPickingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(TPickingH tPickingH, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tPickingH, loadReferrerOption);
        return loadTPickingBList(xnewLRLs(tPickingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingB> loadTPickingBList(List<TPickingH> tPickingHList, LoadReferrerOption<TPickingBCB, TPickingB> loadReferrerOption) {
        xassLRArg(tPickingHList, loadReferrerOption);
        if (tPickingHList.isEmpty()) { return (NestedReferrerListGateway<TPickingB>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingBList(tPickingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingB> doLoadTPickingBList(List<TPickingH> tPickingHList, LoadReferrerOption<TPickingBCB, TPickingB> option) {
        return helpLoadReferrerInternally(tPickingHList, option, "tPickingBList");
    }

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dataCB</span>.setupSelect...
     *     <span style="color: #553000">dataCB</span>.query().set...
     *     <span style="color: #553000">dataCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(List<TPickingH> tPickingHList, ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        xassLRArg(tPickingHList, refCBLambda);
        return doLoadTPicMthdRcmdDataList(tPickingHList, new LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">tPickingH</span>, <span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dataCB</span>.setupSelect...
     *     <span style="color: #553000">dataCB</span>.query().set...
     *     <span style="color: #553000">dataCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(TPickingH tPickingH, ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        xassLRArg(tPickingH, refCBLambda);
        return doLoadTPicMthdRcmdDataList(xnewLRLs(tPickingH), new LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(TPickingH tPickingH, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> loadReferrerOption) {
        xassLRArg(tPickingH, loadReferrerOption);
        return loadTPicMthdRcmdDataList(xnewLRLs(tPickingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(List<TPickingH> tPickingHList, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> loadReferrerOption) {
        xassLRArg(tPickingHList, loadReferrerOption);
        if (tPickingHList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmdData>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdDataList(tPickingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmdData> doLoadTPicMthdRcmdDataList(List<TPickingH> tPickingHList, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> option) {
        return helpLoadReferrerInternally(tPickingHList, option, "tPicMthdRcmdDataList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<TPickingH> tPickingHList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(tPickingHList, refCBLambda);
        return doLoadTReceivePlanHList(tPickingHList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">tPickingH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(TPickingH tPickingH, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(tPickingH, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(tPickingH), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(TPickingH tPickingH, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(tPickingH, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(tPickingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<TPickingH> tPickingHList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(tPickingHList, loadReferrerOption);
        if (tPickingHList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(tPickingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<TPickingH> tPickingHList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(tPickingHList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<TPickingH> tPickingHList, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(tPickingHList, refCBLambda);
        return doLoadWSglRowShipInspBList(tPickingHList, new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">tPickingH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPickingH</span>.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(TPickingH tPickingH, ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        xassLRArg(tPickingH, refCBLambda);
        return doLoadWSglRowShipInspBList(xnewLRLs(tPickingH), new LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPickingH The entity of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(TPickingH tPickingH, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(tPickingH, loadReferrerOption);
        return loadWSglRowShipInspBList(xnewLRLs(tPickingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPickingHList The entity list of TPickingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspB> loadWSglRowShipInspBList(List<TPickingH> tPickingHList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> loadReferrerOption) {
        xassLRArg(tPickingHList, loadReferrerOption);
        if (tPickingHList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspB>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspBList(tPickingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspB> doLoadWSglRowShipInspBList(List<TPickingH> tPickingHList, LoadReferrerOption<WSglRowShipInspBCB, WSglRowShipInspB> option) {
        return helpLoadReferrerInternally(tPickingHList, option, "wSglRowShipInspBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'TAllocInstH'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TAllocInstH> pulloutTAllocInstH(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "tAllocInstH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByCenterTransitFlg(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "bClassDtlByCenterTransitFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByForceFixedFlg(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "bClassDtlByForceFixedFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPackingCalCls(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "bClassDtlByPackingCalCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPickingStatus(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "bClassDtlByPickingStatus"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlBySglRowPicFlg(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "bClassDtlBySglRowPicFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'TPickingR'.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPickingR> pulloutTPickingRAsOne(List<TPickingH> tPickingHList)
    { return helpPulloutInternally(tPickingHList, "tPickingRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key pickingHId.
     * @param tPickingHList The list of tPickingH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPickingHIdList(List<TPickingH> tPickingHList)
    { return helpExtractListInternally(tPickingHList, "pickingHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPickingH.setFoo...(value);
     * tPickingH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPickingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPickingH.set...;</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">insert</span>(tPickingH);
     * ... = tPickingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tPickingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TPickingH tPickingH) {
        doInsert(tPickingH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPickingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPickingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPickingH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPickingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">update</span>(tPickingH);
     * </pre>
     * @param tPickingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TPickingH tPickingH) {
        doUpdate(tPickingH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPickingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPickingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPickingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tPickingH);
     * </pre>
     * @param tPickingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TPickingH tPickingH) {
        doUpdateNonstrict(tPickingH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPickingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TPickingH tPickingH) {
        doInsertOrUpdate(tPickingH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPickingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TPickingH tPickingH) {
        doInsertOrUpdateNonstrict(tPickingH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPickingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">delete</span>(tPickingH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tPickingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TPickingH tPickingH) {
        doDelete(tPickingH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tPickingH);
     * </pre>
     * @param tPickingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TPickingH tPickingH) {
        doDeleteNonstrict(tPickingH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tPickingH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tPickingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TPickingH tPickingH) {
        doDeleteNonstrictIgnoreDeleted(tPickingH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TPickingH et, final DeleteOption<TPickingHCB> op) {
        assertObjectNotNull("tPickingH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     *     tPickingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPickingH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tPickingHList.add(tPickingH);
     * }
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tPickingHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TPickingH> tPickingHList) {
        return doBatchInsert(tPickingHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     *     tPickingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPickingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPickingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPickingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPickingHList.add(tPickingH);
     * }
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPickingHList);
     * </pre>
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPickingH> tPickingHList) {
        return doBatchUpdate(tPickingHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tPickingHBhv.<span style="color: #CC4747">batchUpdate</span>(tPickingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPickingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPickingH> tPickingHList, SpecifyQuery<TPickingHCB> colCBLambda) {
        return doBatchUpdate(tPickingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     *     tPickingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPickingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPickingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPickingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPickingHList.add(tPickingH);
     * }
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPickingHList);
     * </pre>
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPickingH> tPickingHList) {
        return doBatchUpdateNonstrict(tPickingHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPickingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPickingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPickingH> tPickingHList, SpecifyQuery<TPickingHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tPickingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TPickingH> tPickingHList) {
        return doBatchDelete(tPickingHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TPickingH> tPickingHList) {
        return doBatchDeleteNonstrict(tPickingHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TPickingH, TPickingHCB&gt;() {
     *     public ConditionBean setup(TPickingH entity, TPickingHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TPickingH, TPickingHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPickingH.setPK...(value);</span>
     * tPickingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPickingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPickingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tPickingH, cb);
     * </pre>
     * @param tPickingH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TPickingH tPickingH, TPickingHCB cb) {
        return doQueryUpdate(tPickingH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TPickingHCB cb = new TPickingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tPickingH, cb);
     * </pre>
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TPickingHCB cb) {
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
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPickingH.setFoo...(value);
     * tPickingH.setBar...(value);
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tPickingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tPickingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tPickingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TPickingH tPickingH, WritableOptionCall<TPickingHCB, InsertOption<TPickingHCB>> opLambda) {
        doInsert(tPickingH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPickingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPickingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tPickingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPickingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TPickingH tPickingH, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> opLambda) {
        doUpdate(tPickingH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * tPickingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPickingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tPickingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPickingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TPickingH tPickingH, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> opLambda) {
        doUpdateNonstrict(tPickingH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tPickingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TPickingH tPickingH, WritableOptionCall<TPickingHCB, InsertOption<TPickingHCB>> insertOpLambda, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> updateOpLambda) {
        doInsertOrUpdate(tPickingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tPickingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TPickingH tPickingH, WritableOptionCall<TPickingHCB, InsertOption<TPickingHCB>> insertOpLambda, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tPickingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tPickingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TPickingH tPickingH, WritableOptionCall<TPickingHCB, DeleteOption<TPickingHCB>> opLambda) {
        doDelete(tPickingH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tPickingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TPickingH tPickingH, WritableOptionCall<TPickingHCB, DeleteOption<TPickingHCB>> opLambda) {
        doDeleteNonstrict(tPickingH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TPickingH> tPickingHList, WritableOptionCall<TPickingHCB, InsertOption<TPickingHCB>> opLambda) {
        return doBatchInsert(tPickingHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TPickingH> tPickingHList, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> opLambda) {
        return doBatchUpdate(tPickingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TPickingH> tPickingHList, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> opLambda) {
        return doBatchUpdateNonstrict(tPickingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TPickingH> tPickingHList, WritableOptionCall<TPickingHCB, DeleteOption<TPickingHCB>> opLambda) {
        return doBatchDelete(tPickingHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tPickingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TPickingH> tPickingHList, WritableOptionCall<TPickingHCB, DeleteOption<TPickingHCB>> opLambda) {
        return doBatchDeleteNonstrict(tPickingHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TPickingH, TPickingHCB> manyArgLambda, WritableOptionCall<TPickingHCB, InsertOption<TPickingHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPickingH tPickingH = <span style="color: #70226C">new</span> TPickingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPickingH.setPK...(value);</span>
     * tPickingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPickingH.setVersionNo(value);</span>
     * TPickingHCB cb = <span style="color: #70226C">new</span> TPickingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tPickingH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tPickingH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TPickingH tPickingH, TPickingHCB cb, WritableOptionCall<TPickingHCB, UpdateOption<TPickingHCB>> opLambda) {
        return doQueryUpdate(tPickingH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TPickingH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TPickingHCB cb, WritableOptionCall<TPickingHCB, DeleteOption<TPickingHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tPickingHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tPickingHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPickingHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tPickingHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPickingHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tPickingHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tPickingHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tPickingHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tPickingHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tPickingHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tPickingHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tPickingHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tPickingHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tPickingHBhv.outideSql().removeBlockComment().selectList()
     * tPickingHBhv.outideSql().removeLineComment().selectList()
     * tPickingHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TPickingHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TPickingHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TPickingH> typeOfSelectedEntity() { return TPickingH.class; }
    protected Class<TPickingH> typeOfHandlingEntity() { return TPickingH.class; }
    protected Class<TPickingHCB> typeOfHandlingConditionBean() { return TPickingHCB.class; }
}
