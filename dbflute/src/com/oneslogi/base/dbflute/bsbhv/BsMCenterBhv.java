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
 * The behavior of M_CENTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, WarehouseGroup, VirtualWhouseFlg, Aname, Address1, Address2, Address3, PostNo, CountryCd, PortCd, DistrictCd, Phone1, Phone2, Fax1, Fax2, WarehouseFlg, RefName, SubcontractFlg, WeightCapacity, Capacity, HULFT_ID, WarehouseCls, CMLRASID, OWN_OR_ANOTHER_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_TIME_ZONE, B_CULTURE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX, M_BOX_GRP, M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CBLK, M_CBRCTG, M_CDRCATT, M_CENTER_CLASS, M_CENTER_COL, M_CENTER_CUSTOMER, M_CENTER_ITEM, M_CENTER_SCREEN, M_CLIENT_CENTER, M_CLIN, M_CORG, M_DELIVERY_COURSE, M_LOCATION, M_MFINVOPERATION, M_MFMONTHCHG, M_MFSTOCKITEM, M_MFWHSTRCT, M_MFWHxITEM, M_NUMBERING_CENTER, M_USER_CENTER, M_USER_LOGIN, M_WAREHOUSE, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_CSRWHADM, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCblkList, mCbrctgList, mCdrcattList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mClinList, mCorgList, mDeliveryCourseList, mLocationList, mMfinvoperationList, mMfmonthchgList, mMfstockitemList, mMfwhstrctList, mMfwhxitemList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tCsrwhadmList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterBhv extends AbstractBehaviorWritable<MCenter, MCenterCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCenterDbm asDBMeta() { return MCenterDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_CENTER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCenterDbm getMyDBMeta() { return MCenterDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCenterCB newConditionBean() { return new MCenterCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCenter newMyEntity() { return new MCenter(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCenterCB newMyConditionBean() { return new MCenterCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCenterCB cb) {
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
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * MCenter mCenter = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCenter != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCenter.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectEntity(MCenterCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCenter facadeSelectEntity(MCenterCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectOptionalEntity(MCenterCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...;
     * MCenter mCenter = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCenter.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectEntityWithDeletedCheck(MCenterCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectByPKValue(Long centerId) {
        return facadeSelectByPKValue(centerId);
    }

    protected MCenter facadeSelectByPKValue(Long centerId) {
        return doSelectByPK(centerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> ENTITY doSelectByPK(Long centerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerId), tp);
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerId, tp), centerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectByPKValueWithDeletedCheck(Long centerId) {
        return doSelectByPKWithDeletedCheck(centerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> ENTITY doSelectByPKWithDeletedCheck(Long centerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerId), tp);
    }

    protected MCenterCB xprepareCBAsPK(Long centerId) {
        assertObjectNotNull("centerId", centerId);
        return newConditionBean().acceptPK(centerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerCd : UQ, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCenter> selectByUniqueOf(String centerCd) {
        return facadeSelectByUniqueOf(centerCd);
    }

    protected OptionalEntity<MCenter> facadeSelectByUniqueOf(String centerCd) {
        return doSelectByUniqueOf(centerCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectByUniqueOf(String centerCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerCd), tp), centerCd);
    }

    protected MCenterCB xprepareCBAsUniqueOf(String centerCd) {
        assertObjectNotNull("centerCd", centerCd);
        return newConditionBean().acceptUniqueOf(centerCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCenter&gt; <span style="color: #553000">mCenterList</span> = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCenter> selectList(MCenterCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCenter&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">page</span>) {
     *     ... = mCenter.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCenter> selectPage(MCenterCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param entityRowHandler The handler of entity row of MCenter. (NotNull)
     */
    public void selectCursor(MCenterCB cb, EntityRowHandler<MCenter> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCenter> mCenterList, ReferrerLoaderHandler<LoaderOfMCenter> loaderLambda) {
        xassLRArg(mCenterList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenter().ready(mCenterList, _behaviorSelector));
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
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCenter mCenter, ReferrerLoaderHandler<LoaderOfMCenter> loaderLambda) {
        xassLRArg(mCenter, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenter().ready(xnewLRAryLs(mCenter), _behaviorSelector));
    }

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * M_BOX by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(List<MCenter> mCenterList, ConditionBeanSetupper<MBoxCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMBoxList(mCenterList, new LoadReferrerOption<MBoxCB, MBox>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * M_BOX by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMBoxList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(MCenter mCenter, ConditionBeanSetupper<MBoxCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMBoxList(xnewLRLs(mCenter), new LoadReferrerOption<MBoxCB, MBox>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(MCenter mCenter, LoadReferrerOption<MBoxCB, MBox> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMBoxList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBox> loadMBoxList(List<MCenter> mCenterList, LoadReferrerOption<MBoxCB, MBox> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MBox>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBox> doLoadMBoxList(List<MCenter> mCenterList, LoadReferrerOption<MBoxCB, MBox> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mBoxList");
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MCenter> mCenterList, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMBoxGrpList(mCenterList, new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MCenter mCenter, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMBoxGrpList(xnewLRLs(mCenter), new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MCenter mCenter, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMBoxGrpList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MCenter> mCenterList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MBoxGrp>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxGrpList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBoxGrp> doLoadMBoxGrpList(List<MCenter> mCenterList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mBoxGrpList");
    }

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierCB</span>.setupSelect...
     *     <span style="color: #553000">carrierCB</span>.query().set...
     *     <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierList(mCenterList, new LoadReferrerOption<MCarrierCB, MCarrier>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierCB</span>.setupSelect...
     *     <span style="color: #553000">carrierCB</span>.query().set...
     *     <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(MCenter mCenter, ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierCB, MCarrier>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(MCenter mCenter, LoadReferrerOption<MCarrierCB, MCarrier> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierCB, MCarrier> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrier>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrier> doLoadMCarrierList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierCB, MCarrier> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierList");
    }

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sgwCB</span>.setupSelect...
     *     <span style="color: #553000">sgwCB</span>.query().set...
     *     <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipSgwList(mCenterList, new LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sgwCB</span>.setupSelect...
     *     <span style="color: #553000">sgwCB</span>.query().set...
     *     <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipSgwList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(MCenter mCenter, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipSgwList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipSgw>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipSgwList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipSgw> doLoadMCarrierSlipSgwList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipSgwList");
    }

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ymtCB</span>.setupSelect...
     *     <span style="color: #553000">ymtCB</span>.query().set...
     *     <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipYmtList(mCenterList, new LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ymtCB</span>.setupSelect...
     *     <span style="color: #553000">ymtCB</span>.query().set...
     *     <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipYmtList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(MCenter mCenter, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipYmtList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipYmt>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipYmtList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipYmt> doLoadMCarrierSlipYmtList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipYmtList");
    }

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">yupkCB</span>.setupSelect...
     *     <span style="color: #553000">yupkCB</span>.query().set...
     *     <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipYupkList(mCenterList, new LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">yupkCB</span>.setupSelect...
     *     <span style="color: #553000">yupkCB</span>.query().set...
     *     <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipYupkList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(MCenter mCenter, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipYupkList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipYupk>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipYupkList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipYupk> doLoadMCarrierSlipYupkList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipYupkList");
    }

    /**
     * Load referrer of MCblkList by the set-upper of referrer. <br>
     * M_CBLK by CENTER_ID, named 'MCblkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCblkList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">cblkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cblkCB</span>.setupSelect...
     *     <span style="color: #553000">cblkCB</span>.query().set...
     *     <span style="color: #553000">cblkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCblkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCblk> loadMCblkList(List<MCenter> mCenterList, ConditionBeanSetupper<MCblkCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCblkList(mCenterList, new LoadReferrerOption<MCblkCB, MCblk>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCblkList by the set-upper of referrer. <br>
     * M_CBLK by CENTER_ID, named 'MCblkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCblkList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">cblkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cblkCB</span>.setupSelect...
     *     <span style="color: #553000">cblkCB</span>.query().set...
     *     <span style="color: #553000">cblkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCblkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCblk> loadMCblkList(MCenter mCenter, ConditionBeanSetupper<MCblkCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCblkList(xnewLRLs(mCenter), new LoadReferrerOption<MCblkCB, MCblk>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCblk> loadMCblkList(MCenter mCenter, LoadReferrerOption<MCblkCB, MCblk> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCblkList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCblk> loadMCblkList(List<MCenter> mCenterList, LoadReferrerOption<MCblkCB, MCblk> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCblk>)EMPTY_NREF_LGWAY; }
        return doLoadMCblkList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCblk> doLoadMCblkList(List<MCenter> mCenterList, LoadReferrerOption<MCblkCB, MCblk> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCblkList");
    }

    /**
     * Load referrer of MCbrctgList by the set-upper of referrer. <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCbrctgList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">cbrctgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cbrctgCB</span>.setupSelect...
     *     <span style="color: #553000">cbrctgCB</span>.query().set...
     *     <span style="color: #553000">cbrctgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCbrctgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCbrctg> loadMCbrctgList(List<MCenter> mCenterList, ConditionBeanSetupper<MCbrctgCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCbrctgList(mCenterList, new LoadReferrerOption<MCbrctgCB, MCbrctg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCbrctgList by the set-upper of referrer. <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCbrctgList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">cbrctgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cbrctgCB</span>.setupSelect...
     *     <span style="color: #553000">cbrctgCB</span>.query().set...
     *     <span style="color: #553000">cbrctgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCbrctgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCbrctg> loadMCbrctgList(MCenter mCenter, ConditionBeanSetupper<MCbrctgCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCbrctgList(xnewLRLs(mCenter), new LoadReferrerOption<MCbrctgCB, MCbrctg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCbrctg> loadMCbrctgList(MCenter mCenter, LoadReferrerOption<MCbrctgCB, MCbrctg> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCbrctgList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCbrctg> loadMCbrctgList(List<MCenter> mCenterList, LoadReferrerOption<MCbrctgCB, MCbrctg> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCbrctg>)EMPTY_NREF_LGWAY; }
        return doLoadMCbrctgList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCbrctg> doLoadMCbrctgList(List<MCenter> mCenterList, LoadReferrerOption<MCbrctgCB, MCbrctg> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCbrctgList");
    }

    /**
     * Load referrer of MCdrcattList by the set-upper of referrer. <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCdrcattList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">cdrcattCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cdrcattCB</span>.setupSelect...
     *     <span style="color: #553000">cdrcattCB</span>.query().set...
     *     <span style="color: #553000">cdrcattCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCdrcattList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCdrcatt> loadMCdrcattList(List<MCenter> mCenterList, ConditionBeanSetupper<MCdrcattCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCdrcattList(mCenterList, new LoadReferrerOption<MCdrcattCB, MCdrcatt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCdrcattList by the set-upper of referrer. <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCdrcattList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">cdrcattCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cdrcattCB</span>.setupSelect...
     *     <span style="color: #553000">cdrcattCB</span>.query().set...
     *     <span style="color: #553000">cdrcattCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCdrcattList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCdrcatt> loadMCdrcattList(MCenter mCenter, ConditionBeanSetupper<MCdrcattCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCdrcattList(xnewLRLs(mCenter), new LoadReferrerOption<MCdrcattCB, MCdrcatt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCdrcatt> loadMCdrcattList(MCenter mCenter, LoadReferrerOption<MCdrcattCB, MCdrcatt> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCdrcattList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCdrcatt> loadMCdrcattList(List<MCenter> mCenterList, LoadReferrerOption<MCdrcattCB, MCdrcatt> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCdrcatt>)EMPTY_NREF_LGWAY; }
        return doLoadMCdrcattList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCdrcatt> doLoadMCdrcattList(List<MCenter> mCenterList, LoadReferrerOption<MCdrcattCB, MCdrcatt> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCdrcattList");
    }

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classCB</span>.setupSelect...
     *     <span style="color: #553000">classCB</span>.query().set...
     *     <span style="color: #553000">classCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterClassList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterClassList(mCenterList, new LoadReferrerOption<MCenterClassCB, MCenterClass>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classCB</span>.setupSelect...
     *     <span style="color: #553000">classCB</span>.query().set...
     *     <span style="color: #553000">classCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterClassList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(MCenter mCenter, ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterClassList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterClassCB, MCenterClass>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(MCenter mCenter, LoadReferrerOption<MCenterClassCB, MCenterClass> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterClassList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(List<MCenter> mCenterList, LoadReferrerOption<MCenterClassCB, MCenterClass> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterClass>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClass> doLoadMCenterClassList(List<MCenter> mCenterList, LoadReferrerOption<MCenterClassCB, MCenterClass> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterClassList");
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterColList(mCenterList, new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(MCenter mCenter, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterColList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(MCenter mCenter, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterColList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<MCenter> mCenterList, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterCol>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterColList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCol> doLoadMCenterColList(List<MCenter> mCenterList, LoadReferrerOption<MCenterColCB, MCenterCol> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterColList");
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterCustomerList(mCenterList, new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCenter mCenter, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterCustomerList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCenter mCenter, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterCustomerList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCenter> mCenterList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterCustomerList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCustomer> doLoadMCenterCustomerList(List<MCenter> mCenterList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterCustomerList");
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterItemList(mCenterList, new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(MCenter mCenter, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterItemList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(MCenter mCenter, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterItemList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<MCenter> mCenterList, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterItem>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterItemList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterItem> doLoadMCenterItemList(List<MCenter> mCenterList, LoadReferrerOption<MCenterItemCB, MCenterItem> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterItemList");
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterScreenList(mCenterList, new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(MCenter mCenter, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterScreenList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(MCenter mCenter, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterScreenList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<MCenter> mCenterList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterScreenList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterScreen> doLoadMCenterScreenList(List<MCenter> mCenterList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterScreenList");
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMClientCenterList(mCenterList, new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMClientCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCenter mCenter, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMClientCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCenter mCenter, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMClientCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCenter> mCenterList, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MClientCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMClientCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCenter> doLoadMClientCenterList(List<MCenter> mCenterList, LoadReferrerOption<MClientCenterCB, MClientCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mClientCenterList");
    }

    /**
     * Load referrer of MClinList by the set-upper of referrer. <br>
     * M_CLIN by CENTER_ID, named 'MClinList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClinList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">clinCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clinCB</span>.setupSelect...
     *     <span style="color: #553000">clinCB</span>.query().set...
     *     <span style="color: #553000">clinCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClinList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClin> loadMClinList(List<MCenter> mCenterList, ConditionBeanSetupper<MClinCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMClinList(mCenterList, new LoadReferrerOption<MClinCB, MClin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClinList by the set-upper of referrer. <br>
     * M_CLIN by CENTER_ID, named 'MClinList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClinList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">clinCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clinCB</span>.setupSelect...
     *     <span style="color: #553000">clinCB</span>.query().set...
     *     <span style="color: #553000">clinCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMClinList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClin> loadMClinList(MCenter mCenter, ConditionBeanSetupper<MClinCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMClinList(xnewLRLs(mCenter), new LoadReferrerOption<MClinCB, MClin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClin> loadMClinList(MCenter mCenter, LoadReferrerOption<MClinCB, MClin> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMClinList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClin> loadMClinList(List<MCenter> mCenterList, LoadReferrerOption<MClinCB, MClin> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MClin>)EMPTY_NREF_LGWAY; }
        return doLoadMClinList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClin> doLoadMClinList(List<MCenter> mCenterList, LoadReferrerOption<MClinCB, MClin> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mClinList");
    }

    /**
     * Load referrer of MCorgList by the set-upper of referrer. <br>
     * M_CORG by CENTER_ID, named 'MCorgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCorgList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">corgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corgCB</span>.setupSelect...
     *     <span style="color: #553000">corgCB</span>.query().set...
     *     <span style="color: #553000">corgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCorgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCorg> loadMCorgList(List<MCenter> mCenterList, ConditionBeanSetupper<MCorgCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCorgList(mCenterList, new LoadReferrerOption<MCorgCB, MCorg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCorgList by the set-upper of referrer. <br>
     * M_CORG by CENTER_ID, named 'MCorgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCorgList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">corgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corgCB</span>.setupSelect...
     *     <span style="color: #553000">corgCB</span>.query().set...
     *     <span style="color: #553000">corgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCorgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCorg> loadMCorgList(MCenter mCenter, ConditionBeanSetupper<MCorgCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCorgList(xnewLRLs(mCenter), new LoadReferrerOption<MCorgCB, MCorg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCorg> loadMCorgList(MCenter mCenter, LoadReferrerOption<MCorgCB, MCorg> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCorgList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCorg> loadMCorgList(List<MCenter> mCenterList, LoadReferrerOption<MCorgCB, MCorg> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCorg>)EMPTY_NREF_LGWAY; }
        return doLoadMCorgList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCorg> doLoadMCorgList(List<MCenter> mCenterList, LoadReferrerOption<MCorgCB, MCorg> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCorgList");
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCenter> mCenterList, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMDeliveryCourseList(mCenterList, new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCenter mCenter, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMDeliveryCourseList(xnewLRLs(mCenter), new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCenter mCenter, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMDeliveryCourseList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCenter> mCenterList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MDeliveryCourse>)EMPTY_NREF_LGWAY; }
        return doLoadMDeliveryCourseList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDeliveryCourse> doLoadMDeliveryCourseList(List<MCenter> mCenterList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mDeliveryCourseList");
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCenter> mCenterList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMLocationList(mCenterList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCenter mCenter, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mCenter), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCenter mCenter, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCenter> mCenterList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MCenter> mCenterList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mLocationList");
    }

    /**
     * Load referrer of MMfinvoperationList by the set-upper of referrer. <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfinvoperationList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">mfinvoperationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfinvoperationCB</span>.setupSelect...
     *     <span style="color: #553000">mfinvoperationCB</span>.query().set...
     *     <span style="color: #553000">mfinvoperationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfinvoperationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfinvoperation> loadMMfinvoperationList(List<MCenter> mCenterList, ConditionBeanSetupper<MMfinvoperationCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMMfinvoperationList(mCenterList, new LoadReferrerOption<MMfinvoperationCB, MMfinvoperation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MMfinvoperationList by the set-upper of referrer. <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfinvoperationList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">mfinvoperationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfinvoperationCB</span>.setupSelect...
     *     <span style="color: #553000">mfinvoperationCB</span>.query().set...
     *     <span style="color: #553000">mfinvoperationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMMfinvoperationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfinvoperation> loadMMfinvoperationList(MCenter mCenter, ConditionBeanSetupper<MMfinvoperationCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMMfinvoperationList(xnewLRLs(mCenter), new LoadReferrerOption<MMfinvoperationCB, MMfinvoperation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfinvoperation> loadMMfinvoperationList(MCenter mCenter, LoadReferrerOption<MMfinvoperationCB, MMfinvoperation> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMMfinvoperationList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MMfinvoperation> loadMMfinvoperationList(List<MCenter> mCenterList, LoadReferrerOption<MMfinvoperationCB, MMfinvoperation> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MMfinvoperation>)EMPTY_NREF_LGWAY; }
        return doLoadMMfinvoperationList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MMfinvoperation> doLoadMMfinvoperationList(List<MCenter> mCenterList, LoadReferrerOption<MMfinvoperationCB, MMfinvoperation> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mMfinvoperationList");
    }

    /**
     * Load referrer of MMfmonthchgList by the set-upper of referrer. <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfmonthchgList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">mfmonthchgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfmonthchgCB</span>.setupSelect...
     *     <span style="color: #553000">mfmonthchgCB</span>.query().set...
     *     <span style="color: #553000">mfmonthchgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfmonthchgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfmonthchg> loadMMfmonthchgList(List<MCenter> mCenterList, ConditionBeanSetupper<MMfmonthchgCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMMfmonthchgList(mCenterList, new LoadReferrerOption<MMfmonthchgCB, MMfmonthchg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MMfmonthchgList by the set-upper of referrer. <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfmonthchgList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">mfmonthchgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfmonthchgCB</span>.setupSelect...
     *     <span style="color: #553000">mfmonthchgCB</span>.query().set...
     *     <span style="color: #553000">mfmonthchgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMMfmonthchgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfmonthchg> loadMMfmonthchgList(MCenter mCenter, ConditionBeanSetupper<MMfmonthchgCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMMfmonthchgList(xnewLRLs(mCenter), new LoadReferrerOption<MMfmonthchgCB, MMfmonthchg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfmonthchg> loadMMfmonthchgList(MCenter mCenter, LoadReferrerOption<MMfmonthchgCB, MMfmonthchg> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMMfmonthchgList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MMfmonthchg> loadMMfmonthchgList(List<MCenter> mCenterList, LoadReferrerOption<MMfmonthchgCB, MMfmonthchg> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MMfmonthchg>)EMPTY_NREF_LGWAY; }
        return doLoadMMfmonthchgList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MMfmonthchg> doLoadMMfmonthchgList(List<MCenter> mCenterList, LoadReferrerOption<MMfmonthchgCB, MMfmonthchg> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mMfmonthchgList");
    }

    /**
     * Load referrer of MMfstockitemList by the set-upper of referrer. <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfstockitemList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">mfstockitemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfstockitemCB</span>.setupSelect...
     *     <span style="color: #553000">mfstockitemCB</span>.query().set...
     *     <span style="color: #553000">mfstockitemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfstockitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfstockitem> loadMMfstockitemList(List<MCenter> mCenterList, ConditionBeanSetupper<MMfstockitemCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMMfstockitemList(mCenterList, new LoadReferrerOption<MMfstockitemCB, MMfstockitem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MMfstockitemList by the set-upper of referrer. <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfstockitemList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">mfstockitemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfstockitemCB</span>.setupSelect...
     *     <span style="color: #553000">mfstockitemCB</span>.query().set...
     *     <span style="color: #553000">mfstockitemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMMfstockitemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfstockitem> loadMMfstockitemList(MCenter mCenter, ConditionBeanSetupper<MMfstockitemCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMMfstockitemList(xnewLRLs(mCenter), new LoadReferrerOption<MMfstockitemCB, MMfstockitem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfstockitem> loadMMfstockitemList(MCenter mCenter, LoadReferrerOption<MMfstockitemCB, MMfstockitem> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMMfstockitemList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MMfstockitem> loadMMfstockitemList(List<MCenter> mCenterList, LoadReferrerOption<MMfstockitemCB, MMfstockitem> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MMfstockitem>)EMPTY_NREF_LGWAY; }
        return doLoadMMfstockitemList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MMfstockitem> doLoadMMfstockitemList(List<MCenter> mCenterList, LoadReferrerOption<MMfstockitemCB, MMfstockitem> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mMfstockitemList");
    }

    /**
     * Load referrer of MMfwhstrctList by the set-upper of referrer. <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfwhstrctList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">mfwhstrctCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfwhstrctCB</span>.setupSelect...
     *     <span style="color: #553000">mfwhstrctCB</span>.query().set...
     *     <span style="color: #553000">mfwhstrctCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfwhstrctList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhstrct> loadMMfwhstrctList(List<MCenter> mCenterList, ConditionBeanSetupper<MMfwhstrctCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMMfwhstrctList(mCenterList, new LoadReferrerOption<MMfwhstrctCB, MMfwhstrct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MMfwhstrctList by the set-upper of referrer. <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfwhstrctList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">mfwhstrctCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mfwhstrctCB</span>.setupSelect...
     *     <span style="color: #553000">mfwhstrctCB</span>.query().set...
     *     <span style="color: #553000">mfwhstrctCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMMfwhstrctList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhstrct> loadMMfwhstrctList(MCenter mCenter, ConditionBeanSetupper<MMfwhstrctCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMMfwhstrctList(xnewLRLs(mCenter), new LoadReferrerOption<MMfwhstrctCB, MMfwhstrct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhstrct> loadMMfwhstrctList(MCenter mCenter, LoadReferrerOption<MMfwhstrctCB, MMfwhstrct> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMMfwhstrctList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MMfwhstrct> loadMMfwhstrctList(List<MCenter> mCenterList, LoadReferrerOption<MMfwhstrctCB, MMfwhstrct> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MMfwhstrct>)EMPTY_NREF_LGWAY; }
        return doLoadMMfwhstrctList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MMfwhstrct> doLoadMMfwhstrctList(List<MCenter> mCenterList, LoadReferrerOption<MMfwhstrctCB, MMfwhstrct> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mMfwhstrctList");
    }

    /**
     * Load referrer of MMfwhxitemList by the set-upper of referrer. <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfwhxitemList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfwhxitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhxitem> loadMMfwhxitemList(List<MCenter> mCenterList, ConditionBeanSetupper<MMfwhxitemCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMMfwhxitemList(mCenterList, new LoadReferrerOption<MMfwhxitemCB, MMfwhxitem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MMfwhxitemList by the set-upper of referrer. <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMMfwhxitemList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMMfwhxitemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhxitem> loadMMfwhxitemList(MCenter mCenter, ConditionBeanSetupper<MMfwhxitemCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMMfwhxitemList(xnewLRLs(mCenter), new LoadReferrerOption<MMfwhxitemCB, MMfwhxitem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MMfwhxitem> loadMMfwhxitemList(MCenter mCenter, LoadReferrerOption<MMfwhxitemCB, MMfwhxitem> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMMfwhxitemList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MMfwhxitem> loadMMfwhxitemList(List<MCenter> mCenterList, LoadReferrerOption<MMfwhxitemCB, MMfwhxitem> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MMfwhxitem>)EMPTY_NREF_LGWAY; }
        return doLoadMMfwhxitemList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MMfwhxitem> doLoadMMfwhxitemList(List<MCenter> mCenterList, LoadReferrerOption<MMfwhxitemCB, MMfwhxitem> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mMfwhxitemList");
    }

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMNumberingCenterList(mCenterList, new LoadReferrerOption<MNumberingCenterCB, MNumberingCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(MCenter mCenter, ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMNumberingCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MNumberingCenterCB, MNumberingCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(MCenter mCenter, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMNumberingCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(List<MCenter> mCenterList, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MNumberingCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMNumberingCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MNumberingCenter> doLoadMNumberingCenterList(List<MCenter> mCenterList, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mNumberingCenterList");
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMUserCenterList(mCenterList, new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMUserCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(MCenter mCenter, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMUserCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(MCenter mCenter, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMUserCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<MCenter> mCenterList, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MUserCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMUserCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserCenter> doLoadMUserCenterList(List<MCenter> mCenterList, LoadReferrerOption<MUserCenterCB, MUserCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mUserCenterList");
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MCenter> mCenterList, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMUserLoginList(mCenterList, new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMUserLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MCenter mCenter, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMUserLoginList(xnewLRLs(mCenter), new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MCenter mCenter, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMUserLoginList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MCenter> mCenterList, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MUserLogin>)EMPTY_NREF_LGWAY; }
        return doLoadMUserLoginList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserLogin> doLoadMUserLoginList(List<MCenter> mCenterList, LoadReferrerOption<MUserLoginCB, MUserLogin> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mUserLoginList");
    }

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseCB</span>.setupSelect...
     *     <span style="color: #553000">warehouseCB</span>.query().set...
     *     <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWarehouseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(List<MCenter> mCenterList, ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMWarehouseList(mCenterList, new LoadReferrerOption<MWarehouseCB, MWarehouse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseCB</span>.setupSelect...
     *     <span style="color: #553000">warehouseCB</span>.query().set...
     *     <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMWarehouseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(MCenter mCenter, ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMWarehouseList(xnewLRLs(mCenter), new LoadReferrerOption<MWarehouseCB, MWarehouse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(MCenter mCenter, LoadReferrerOption<MWarehouseCB, MWarehouse> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMWarehouseList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(List<MCenter> mCenterList, LoadReferrerOption<MWarehouseCB, MWarehouse> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MWarehouse>)EMPTY_NREF_LGWAY; }
        return doLoadMWarehouseList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWarehouse> doLoadMWarehouseList(List<MCenter> mCenterList, LoadReferrerOption<MWarehouseCB, MWarehouse> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mWarehouseList");
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MCenter> mCenterList, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMWebHtInfoList(mCenterList, new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MCenter mCenter, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMWebHtInfoList(xnewLRLs(mCenter), new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MCenter mCenter, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMWebHtInfoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MCenter> mCenterList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MWebHtInfo>)EMPTY_NREF_LGWAY; }
        return doLoadMWebHtInfoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWebHtInfo> doLoadMWebHtInfoList(List<MCenter> mCenterList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mWebHtInfoList");
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTAllocInstHList(mCenterList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MCenter mCenter, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTAllocInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MCenter mCenter, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTAllocInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MCenter> mCenterList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHList(List<MCenter> mCenterList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tAllocInstHList");
    }

    /**
     * Load referrer of TCcopamList by the set-upper of referrer. <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCcopamList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">ccopamCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ccopamCB</span>.setupSelect...
     *     <span style="color: #553000">ccopamCB</span>.query().set...
     *     <span style="color: #553000">ccopamCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCcopamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCcopam> loadTCcopamList(List<MCenter> mCenterList, ConditionBeanSetupper<TCcopamCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTCcopamList(mCenterList, new LoadReferrerOption<TCcopamCB, TCcopam>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCcopamList by the set-upper of referrer. <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCcopamList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">ccopamCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ccopamCB</span>.setupSelect...
     *     <span style="color: #553000">ccopamCB</span>.query().set...
     *     <span style="color: #553000">ccopamCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTCcopamList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCcopam> loadTCcopamList(MCenter mCenter, ConditionBeanSetupper<TCcopamCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTCcopamList(xnewLRLs(mCenter), new LoadReferrerOption<TCcopamCB, TCcopam>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCcopam> loadTCcopamList(MCenter mCenter, LoadReferrerOption<TCcopamCB, TCcopam> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTCcopamList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCcopam> loadTCcopamList(List<MCenter> mCenterList, LoadReferrerOption<TCcopamCB, TCcopam> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TCcopam>)EMPTY_NREF_LGWAY; }
        return doLoadTCcopamList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCcopam> doLoadTCcopamList(List<MCenter> mCenterList, LoadReferrerOption<TCcopamCB, TCcopam> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tCcopamList");
    }

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(List<MCenter> mCenterList, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTCenterSymbolList(mCenterList, new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(MCenter mCenter, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTCenterSymbolList(xnewLRLs(mCenter), new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(MCenter mCenter, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTCenterSymbolList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(List<MCenter> mCenterList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TCenterSymbol>)EMPTY_NREF_LGWAY; }
        return doLoadTCenterSymbolList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCenterSymbol> doLoadTCenterSymbolList(List<MCenter> mCenterList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tCenterSymbolList");
    }

    /**
     * Load referrer of TCordhdrList by the set-upper of referrer. <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCordhdrList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">cordhdrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cordhdrCB</span>.setupSelect...
     *     <span style="color: #553000">cordhdrCB</span>.query().set...
     *     <span style="color: #553000">cordhdrCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCordhdrList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCordhdr> loadTCordhdrList(List<MCenter> mCenterList, ConditionBeanSetupper<TCordhdrCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTCordhdrList(mCenterList, new LoadReferrerOption<TCordhdrCB, TCordhdr>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCordhdrList by the set-upper of referrer. <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCordhdrList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">cordhdrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cordhdrCB</span>.setupSelect...
     *     <span style="color: #553000">cordhdrCB</span>.query().set...
     *     <span style="color: #553000">cordhdrCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTCordhdrList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCordhdr> loadTCordhdrList(MCenter mCenter, ConditionBeanSetupper<TCordhdrCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTCordhdrList(xnewLRLs(mCenter), new LoadReferrerOption<TCordhdrCB, TCordhdr>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCordhdr> loadTCordhdrList(MCenter mCenter, LoadReferrerOption<TCordhdrCB, TCordhdr> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTCordhdrList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCordhdr> loadTCordhdrList(List<MCenter> mCenterList, LoadReferrerOption<TCordhdrCB, TCordhdr> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TCordhdr>)EMPTY_NREF_LGWAY; }
        return doLoadTCordhdrList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCordhdr> doLoadTCordhdrList(List<MCenter> mCenterList, LoadReferrerOption<TCordhdrCB, TCordhdr> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tCordhdrList");
    }

    /**
     * Load referrer of TCsrwhadmList by the set-upper of referrer. <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCsrwhadmList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">csrwhadmCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">csrwhadmCB</span>.setupSelect...
     *     <span style="color: #553000">csrwhadmCB</span>.query().set...
     *     <span style="color: #553000">csrwhadmCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCsrwhadmList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCsrwhadm> loadTCsrwhadmList(List<MCenter> mCenterList, ConditionBeanSetupper<TCsrwhadmCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTCsrwhadmList(mCenterList, new LoadReferrerOption<TCsrwhadmCB, TCsrwhadm>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCsrwhadmList by the set-upper of referrer. <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTCsrwhadmList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">csrwhadmCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">csrwhadmCB</span>.setupSelect...
     *     <span style="color: #553000">csrwhadmCB</span>.query().set...
     *     <span style="color: #553000">csrwhadmCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTCsrwhadmList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCsrwhadm> loadTCsrwhadmList(MCenter mCenter, ConditionBeanSetupper<TCsrwhadmCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTCsrwhadmList(xnewLRLs(mCenter), new LoadReferrerOption<TCsrwhadmCB, TCsrwhadm>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCsrwhadm> loadTCsrwhadmList(MCenter mCenter, LoadReferrerOption<TCsrwhadmCB, TCsrwhadm> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTCsrwhadmList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCsrwhadm> loadTCsrwhadmList(List<MCenter> mCenterList, LoadReferrerOption<TCsrwhadmCB, TCsrwhadm> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TCsrwhadm>)EMPTY_NREF_LGWAY; }
        return doLoadTCsrwhadmList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCsrwhadm> doLoadTCsrwhadmList(List<MCenter> mCenterList, LoadReferrerOption<TCsrwhadmCB, TCsrwhadm> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tCsrwhadmList");
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MCenter> mCenterList, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTEcOrderHList(mCenterList, new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MCenter mCenter, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTEcOrderHList(xnewLRLs(mCenter), new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MCenter mCenter, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTEcOrderHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MCenter> mCenterList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderH>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderH> doLoadTEcOrderHList(List<MCenter> mCenterList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tEcOrderHList");
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MCenter> mCenterList, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTInventoryHList(mCenterList, new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTInventoryHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MCenter mCenter, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTInventoryHList(xnewLRLs(mCenter), new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MCenter mCenter, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTInventoryHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MCenter> mCenterList, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TInventoryH>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryH> doLoadTInventoryHList(List<MCenter> mCenterList, LoadReferrerOption<TInventoryHCB, TInventoryH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tInventoryHList");
    }

    /**
     * Load referrer of TMflastshiplotList by the set-upper of referrer. <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMflastshiplotList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">mflastshiplotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mflastshiplotCB</span>.setupSelect...
     *     <span style="color: #553000">mflastshiplotCB</span>.query().set...
     *     <span style="color: #553000">mflastshiplotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMflastshiplotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMflastshiplot> loadTMflastshiplotList(List<MCenter> mCenterList, ConditionBeanSetupper<TMflastshiplotCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTMflastshiplotList(mCenterList, new LoadReferrerOption<TMflastshiplotCB, TMflastshiplot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMflastshiplotList by the set-upper of referrer. <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMflastshiplotList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">mflastshiplotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mflastshiplotCB</span>.setupSelect...
     *     <span style="color: #553000">mflastshiplotCB</span>.query().set...
     *     <span style="color: #553000">mflastshiplotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTMflastshiplotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMflastshiplot> loadTMflastshiplotList(MCenter mCenter, ConditionBeanSetupper<TMflastshiplotCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTMflastshiplotList(xnewLRLs(mCenter), new LoadReferrerOption<TMflastshiplotCB, TMflastshiplot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMflastshiplot> loadTMflastshiplotList(MCenter mCenter, LoadReferrerOption<TMflastshiplotCB, TMflastshiplot> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTMflastshiplotList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMflastshiplot> loadTMflastshiplotList(List<MCenter> mCenterList, LoadReferrerOption<TMflastshiplotCB, TMflastshiplot> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TMflastshiplot>)EMPTY_NREF_LGWAY; }
        return doLoadTMflastshiplotList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMflastshiplot> doLoadTMflastshiplotList(List<MCenter> mCenterList, LoadReferrerOption<TMflastshiplotCB, TMflastshiplot> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tMflastshiplotList");
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTMoveInstHList(mCenterList, new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MCenter mCenter, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTMoveInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MCenter mCenter, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTMoveInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MCenter> mCenterList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstH> doLoadTMoveInstHList(List<MCenter> mCenterList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tMoveInstHList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MCenter> mCenterList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPackingHList(mCenterList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MCenter mCenter, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(mCenter), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MCenter mCenter, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MCenter> mCenterList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<MCenter> mCenterList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by CENTER_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">palletCB</span>.setupSelect...
     *     <span style="color: #553000">palletCB</span>.query().set...
     *     <span style="color: #553000">palletCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(List<MCenter> mCenterList, ConditionBeanSetupper<TPalletCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPalletList(mCenterList, new LoadReferrerOption<TPalletCB, TPallet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by CENTER_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">palletCB</span>.setupSelect...
     *     <span style="color: #553000">palletCB</span>.query().set...
     *     <span style="color: #553000">palletCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPalletList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(MCenter mCenter, ConditionBeanSetupper<TPalletCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPalletList(xnewLRLs(mCenter), new LoadReferrerOption<TPalletCB, TPallet>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPallet> loadTPalletList(MCenter mCenter, LoadReferrerOption<TPalletCB, TPallet> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPalletList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPallet> loadTPalletList(List<MCenter> mCenterList, LoadReferrerOption<TPalletCB, TPallet> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPallet>)EMPTY_NREF_LGWAY; }
        return doLoadTPalletList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPallet> doLoadTPalletList(List<MCenter> mCenterList, LoadReferrerOption<TPalletCB, TPallet> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPalletList");
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MCenter> mCenterList, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPickingHList(mCenterList, new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPickingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MCenter mCenter, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPickingHList(xnewLRLs(mCenter), new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MCenter mCenter, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPickingHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MCenter> mCenterList, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPickingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingH> doLoadTPickingHList(List<MCenter> mCenterList, LoadReferrerOption<TPickingHCB, TPickingH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPickingHList");
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MCenter> mCenterList, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPicMthdRcmdList(mCenterList, new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MCenter mCenter, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPicMthdRcmdList(xnewLRLs(mCenter), new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MCenter mCenter, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPicMthdRcmdList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MCenter> mCenterList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmd>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmd> doLoadTPicMthdRcmdList(List<MCenter> mCenterList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPicMthdRcmdList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MCenter> mCenterList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTReceivePlanHList(mCenterList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MCenter mCenter, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(mCenter), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MCenter mCenter, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MCenter> mCenterList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<MCenter> mCenterList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MCenter> mCenterList, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTSerialNoList(mCenterList, new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTSerialNoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MCenter mCenter, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTSerialNoList(xnewLRLs(mCenter), new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MCenter mCenter, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTSerialNoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MCenter> mCenterList, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TSerialNo>)EMPTY_NREF_LGWAY; }
        return doLoadTSerialNoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TSerialNo> doLoadTSerialNoList(List<MCenter> mCenterList, LoadReferrerOption<TSerialNoCB, TSerialNo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tSerialNoList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTShippingInstHList(mCenterList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MCenter mCenter, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MCenter mCenter, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MCenter> mCenterList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<MCenter> mCenterList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tShippingInstHList");
    }

    /**
     * Load referrer of TSplinfoList by the set-upper of referrer. <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSplinfoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">splinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">splinfoCB</span>.setupSelect...
     *     <span style="color: #553000">splinfoCB</span>.query().set...
     *     <span style="color: #553000">splinfoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSplinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSplinfo> loadTSplinfoList(List<MCenter> mCenterList, ConditionBeanSetupper<TSplinfoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTSplinfoList(mCenterList, new LoadReferrerOption<TSplinfoCB, TSplinfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TSplinfoList by the set-upper of referrer. <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSplinfoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">splinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">splinfoCB</span>.setupSelect...
     *     <span style="color: #553000">splinfoCB</span>.query().set...
     *     <span style="color: #553000">splinfoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTSplinfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSplinfo> loadTSplinfoList(MCenter mCenter, ConditionBeanSetupper<TSplinfoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTSplinfoList(xnewLRLs(mCenter), new LoadReferrerOption<TSplinfoCB, TSplinfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSplinfo> loadTSplinfoList(MCenter mCenter, LoadReferrerOption<TSplinfoCB, TSplinfo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTSplinfoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TSplinfo> loadTSplinfoList(List<MCenter> mCenterList, LoadReferrerOption<TSplinfoCB, TSplinfo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TSplinfo>)EMPTY_NREF_LGWAY; }
        return doLoadTSplinfoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TSplinfo> doLoadTSplinfoList(List<MCenter> mCenterList, LoadReferrerOption<TSplinfoCB, TSplinfo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tSplinfoList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MCenter> mCenterList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTStoreRecordHList(mCenterList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MCenter mCenter, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(mCenter), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MCenter mCenter, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MCenter> mCenterList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<MCenter> mCenterList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tStoreRecordHList");
    }

    /**
     * Load referrer of TTrallinvList by the set-upper of referrer. <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrallinvList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trallinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trallinvCB</span>.setupSelect...
     *     <span style="color: #553000">trallinvCB</span>.query().set...
     *     <span style="color: #553000">trallinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrallinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinv> loadTTrallinvList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrallinvCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrallinvList(mCenterList, new LoadReferrerOption<TTrallinvCB, TTrallinv>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrallinvList by the set-upper of referrer. <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrallinvList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trallinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trallinvCB</span>.setupSelect...
     *     <span style="color: #553000">trallinvCB</span>.query().set...
     *     <span style="color: #553000">trallinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrallinvList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinv> loadTTrallinvList(MCenter mCenter, ConditionBeanSetupper<TTrallinvCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrallinvList(xnewLRLs(mCenter), new LoadReferrerOption<TTrallinvCB, TTrallinv>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinv> loadTTrallinvList(MCenter mCenter, LoadReferrerOption<TTrallinvCB, TTrallinv> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrallinvList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrallinv> loadTTrallinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrallinvCB, TTrallinv> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrallinv>)EMPTY_NREF_LGWAY; }
        return doLoadTTrallinvList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrallinv> doLoadTTrallinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrallinvCB, TTrallinv> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrallinvList");
    }

    /**
     * Load referrer of TTrallinvhistoryList by the set-upper of referrer. <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrallinvhistoryList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trallinvhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trallinvhistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trallinvhistoryCB</span>.query().set...
     *     <span style="color: #553000">trallinvhistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrallinvhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinvhistory> loadTTrallinvhistoryList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrallinvhistoryCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrallinvhistoryList(mCenterList, new LoadReferrerOption<TTrallinvhistoryCB, TTrallinvhistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrallinvhistoryList by the set-upper of referrer. <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrallinvhistoryList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trallinvhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trallinvhistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trallinvhistoryCB</span>.query().set...
     *     <span style="color: #553000">trallinvhistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrallinvhistoryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinvhistory> loadTTrallinvhistoryList(MCenter mCenter, ConditionBeanSetupper<TTrallinvhistoryCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrallinvhistoryList(xnewLRLs(mCenter), new LoadReferrerOption<TTrallinvhistoryCB, TTrallinvhistory>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrallinvhistory> loadTTrallinvhistoryList(MCenter mCenter, LoadReferrerOption<TTrallinvhistoryCB, TTrallinvhistory> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrallinvhistoryList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrallinvhistory> loadTTrallinvhistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrallinvhistoryCB, TTrallinvhistory> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrallinvhistory>)EMPTY_NREF_LGWAY; }
        return doLoadTTrallinvhistoryList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrallinvhistory> doLoadTTrallinvhistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrallinvhistoryCB, TTrallinvhistory> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrallinvhistoryList");
    }

    /**
     * Load referrer of TTrcaseinventoryList by the set-upper of referrer. <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcaseinventoryList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trcaseinventoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcaseinventoryCB</span>.setupSelect...
     *     <span style="color: #553000">trcaseinventoryCB</span>.query().set...
     *     <span style="color: #553000">trcaseinventoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcaseinventoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcaseinventory> loadTTrcaseinventoryList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrcaseinventoryCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrcaseinventoryList(mCenterList, new LoadReferrerOption<TTrcaseinventoryCB, TTrcaseinventory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrcaseinventoryList by the set-upper of referrer. <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcaseinventoryList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trcaseinventoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcaseinventoryCB</span>.setupSelect...
     *     <span style="color: #553000">trcaseinventoryCB</span>.query().set...
     *     <span style="color: #553000">trcaseinventoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrcaseinventoryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcaseinventory> loadTTrcaseinventoryList(MCenter mCenter, ConditionBeanSetupper<TTrcaseinventoryCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrcaseinventoryList(xnewLRLs(mCenter), new LoadReferrerOption<TTrcaseinventoryCB, TTrcaseinventory>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcaseinventory> loadTTrcaseinventoryList(MCenter mCenter, LoadReferrerOption<TTrcaseinventoryCB, TTrcaseinventory> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrcaseinventoryList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrcaseinventory> loadTTrcaseinventoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrcaseinventoryCB, TTrcaseinventory> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrcaseinventory>)EMPTY_NREF_LGWAY; }
        return doLoadTTrcaseinventoryList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrcaseinventory> doLoadTTrcaseinventoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrcaseinventoryCB, TTrcaseinventory> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrcaseinventoryList");
    }

    /**
     * Load referrer of TTrcasenumList by the set-upper of referrer. <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcasenumList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trcasenumCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcasenumCB</span>.setupSelect...
     *     <span style="color: #553000">trcasenumCB</span>.query().set...
     *     <span style="color: #553000">trcasenumCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcasenumList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasenum> loadTTrcasenumList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrcasenumCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrcasenumList(mCenterList, new LoadReferrerOption<TTrcasenumCB, TTrcasenum>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrcasenumList by the set-upper of referrer. <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcasenumList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trcasenumCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcasenumCB</span>.setupSelect...
     *     <span style="color: #553000">trcasenumCB</span>.query().set...
     *     <span style="color: #553000">trcasenumCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrcasenumList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasenum> loadTTrcasenumList(MCenter mCenter, ConditionBeanSetupper<TTrcasenumCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrcasenumList(xnewLRLs(mCenter), new LoadReferrerOption<TTrcasenumCB, TTrcasenum>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasenum> loadTTrcasenumList(MCenter mCenter, LoadReferrerOption<TTrcasenumCB, TTrcasenum> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrcasenumList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrcasenum> loadTTrcasenumList(List<MCenter> mCenterList, LoadReferrerOption<TTrcasenumCB, TTrcasenum> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrcasenum>)EMPTY_NREF_LGWAY; }
        return doLoadTTrcasenumList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrcasenum> doLoadTTrcasenumList(List<MCenter> mCenterList, LoadReferrerOption<TTrcasenumCB, TTrcasenum> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrcasenumList");
    }

    /**
     * Load referrer of TTrcasestockList by the set-upper of referrer. <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcasestockList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trcasestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcasestockCB</span>.setupSelect...
     *     <span style="color: #553000">trcasestockCB</span>.query().set...
     *     <span style="color: #553000">trcasestockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcasestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasestock> loadTTrcasestockList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrcasestockCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrcasestockList(mCenterList, new LoadReferrerOption<TTrcasestockCB, TTrcasestock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrcasestockList by the set-upper of referrer. <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrcasestockList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trcasestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trcasestockCB</span>.setupSelect...
     *     <span style="color: #553000">trcasestockCB</span>.query().set...
     *     <span style="color: #553000">trcasestockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrcasestockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasestock> loadTTrcasestockList(MCenter mCenter, ConditionBeanSetupper<TTrcasestockCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrcasestockList(xnewLRLs(mCenter), new LoadReferrerOption<TTrcasestockCB, TTrcasestock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrcasestock> loadTTrcasestockList(MCenter mCenter, LoadReferrerOption<TTrcasestockCB, TTrcasestock> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrcasestockList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrcasestock> loadTTrcasestockList(List<MCenter> mCenterList, LoadReferrerOption<TTrcasestockCB, TTrcasestock> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrcasestock>)EMPTY_NREF_LGWAY; }
        return doLoadTTrcasestockList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrcasestock> doLoadTTrcasestockList(List<MCenter> mCenterList, LoadReferrerOption<TTrcasestockCB, TTrcasestock> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrcasestockList");
    }

    /**
     * Load referrer of TTrhanbaiinvList by the set-upper of referrer. <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrhanbaiinvList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trhanbaiinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trhanbaiinvCB</span>.setupSelect...
     *     <span style="color: #553000">trhanbaiinvCB</span>.query().set...
     *     <span style="color: #553000">trhanbaiinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrhanbaiinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrhanbaiinv> loadTTrhanbaiinvList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrhanbaiinvCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrhanbaiinvList(mCenterList, new LoadReferrerOption<TTrhanbaiinvCB, TTrhanbaiinv>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrhanbaiinvList by the set-upper of referrer. <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrhanbaiinvList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trhanbaiinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trhanbaiinvCB</span>.setupSelect...
     *     <span style="color: #553000">trhanbaiinvCB</span>.query().set...
     *     <span style="color: #553000">trhanbaiinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrhanbaiinvList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrhanbaiinv> loadTTrhanbaiinvList(MCenter mCenter, ConditionBeanSetupper<TTrhanbaiinvCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrhanbaiinvList(xnewLRLs(mCenter), new LoadReferrerOption<TTrhanbaiinvCB, TTrhanbaiinv>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrhanbaiinv> loadTTrhanbaiinvList(MCenter mCenter, LoadReferrerOption<TTrhanbaiinvCB, TTrhanbaiinv> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrhanbaiinvList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrhanbaiinv> loadTTrhanbaiinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrhanbaiinvCB, TTrhanbaiinv> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrhanbaiinv>)EMPTY_NREF_LGWAY; }
        return doLoadTTrhanbaiinvList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrhanbaiinv> doLoadTTrhanbaiinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrhanbaiinvCB, TTrhanbaiinv> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrhanbaiinvList");
    }

    /**
     * Load referrer of TTrinvcheckinfoList by the set-upper of referrer. <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvcheckinfoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trinvcheckinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvcheckinfoCB</span>.setupSelect...
     *     <span style="color: #553000">trinvcheckinfoCB</span>.query().set...
     *     <span style="color: #553000">trinvcheckinfoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvcheckinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcheckinfo> loadTTrinvcheckinfoList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrinvcheckinfoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrinvcheckinfoList(mCenterList, new LoadReferrerOption<TTrinvcheckinfoCB, TTrinvcheckinfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrinvcheckinfoList by the set-upper of referrer. <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvcheckinfoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trinvcheckinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvcheckinfoCB</span>.setupSelect...
     *     <span style="color: #553000">trinvcheckinfoCB</span>.query().set...
     *     <span style="color: #553000">trinvcheckinfoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrinvcheckinfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcheckinfo> loadTTrinvcheckinfoList(MCenter mCenter, ConditionBeanSetupper<TTrinvcheckinfoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrinvcheckinfoList(xnewLRLs(mCenter), new LoadReferrerOption<TTrinvcheckinfoCB, TTrinvcheckinfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcheckinfo> loadTTrinvcheckinfoList(MCenter mCenter, LoadReferrerOption<TTrinvcheckinfoCB, TTrinvcheckinfo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrinvcheckinfoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrinvcheckinfo> loadTTrinvcheckinfoList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvcheckinfoCB, TTrinvcheckinfo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrinvcheckinfo>)EMPTY_NREF_LGWAY; }
        return doLoadTTrinvcheckinfoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrinvcheckinfo> doLoadTTrinvcheckinfoList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvcheckinfoCB, TTrinvcheckinfo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrinvcheckinfoList");
    }

    /**
     * Load referrer of TTrinvcorrectList by the set-upper of referrer. <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvcorrectList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trinvcorrectCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvcorrectCB</span>.setupSelect...
     *     <span style="color: #553000">trinvcorrectCB</span>.query().set...
     *     <span style="color: #553000">trinvcorrectCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvcorrectList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcorrect> loadTTrinvcorrectList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrinvcorrectCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrinvcorrectList(mCenterList, new LoadReferrerOption<TTrinvcorrectCB, TTrinvcorrect>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrinvcorrectList by the set-upper of referrer. <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvcorrectList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trinvcorrectCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvcorrectCB</span>.setupSelect...
     *     <span style="color: #553000">trinvcorrectCB</span>.query().set...
     *     <span style="color: #553000">trinvcorrectCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrinvcorrectList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcorrect> loadTTrinvcorrectList(MCenter mCenter, ConditionBeanSetupper<TTrinvcorrectCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrinvcorrectList(xnewLRLs(mCenter), new LoadReferrerOption<TTrinvcorrectCB, TTrinvcorrect>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvcorrect> loadTTrinvcorrectList(MCenter mCenter, LoadReferrerOption<TTrinvcorrectCB, TTrinvcorrect> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrinvcorrectList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrinvcorrect> loadTTrinvcorrectList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvcorrectCB, TTrinvcorrect> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrinvcorrect>)EMPTY_NREF_LGWAY; }
        return doLoadTTrinvcorrectList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrinvcorrect> doLoadTTrinvcorrectList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvcorrectCB, TTrinvcorrect> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrinvcorrectList");
    }

    /**
     * Load referrer of TTrinvreanswerList by the set-upper of referrer. <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvreanswerList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trinvreanswerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvreanswerCB</span>.setupSelect...
     *     <span style="color: #553000">trinvreanswerCB</span>.query().set...
     *     <span style="color: #553000">trinvreanswerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvreanswerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvreanswer> loadTTrinvreanswerList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrinvreanswerCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrinvreanswerList(mCenterList, new LoadReferrerOption<TTrinvreanswerCB, TTrinvreanswer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrinvreanswerList by the set-upper of referrer. <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvreanswerList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trinvreanswerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvreanswerCB</span>.setupSelect...
     *     <span style="color: #553000">trinvreanswerCB</span>.query().set...
     *     <span style="color: #553000">trinvreanswerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrinvreanswerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvreanswer> loadTTrinvreanswerList(MCenter mCenter, ConditionBeanSetupper<TTrinvreanswerCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrinvreanswerList(xnewLRLs(mCenter), new LoadReferrerOption<TTrinvreanswerCB, TTrinvreanswer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvreanswer> loadTTrinvreanswerList(MCenter mCenter, LoadReferrerOption<TTrinvreanswerCB, TTrinvreanswer> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrinvreanswerList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrinvreanswer> loadTTrinvreanswerList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvreanswerCB, TTrinvreanswer> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrinvreanswer>)EMPTY_NREF_LGWAY; }
        return doLoadTTrinvreanswerList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrinvreanswer> doLoadTTrinvreanswerList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvreanswerCB, TTrinvreanswer> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrinvreanswerList");
    }

    /**
     * Load referrer of TTrinvrequestList by the set-upper of referrer. <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvrequestList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trinvrequestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvrequestCB</span>.setupSelect...
     *     <span style="color: #553000">trinvrequestCB</span>.query().set...
     *     <span style="color: #553000">trinvrequestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvrequestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvrequest> loadTTrinvrequestList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrinvrequestCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrinvrequestList(mCenterList, new LoadReferrerOption<TTrinvrequestCB, TTrinvrequest>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrinvrequestList by the set-upper of referrer. <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrinvrequestList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trinvrequestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trinvrequestCB</span>.setupSelect...
     *     <span style="color: #553000">trinvrequestCB</span>.query().set...
     *     <span style="color: #553000">trinvrequestCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrinvrequestList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvrequest> loadTTrinvrequestList(MCenter mCenter, ConditionBeanSetupper<TTrinvrequestCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrinvrequestList(xnewLRLs(mCenter), new LoadReferrerOption<TTrinvrequestCB, TTrinvrequest>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrinvrequest> loadTTrinvrequestList(MCenter mCenter, LoadReferrerOption<TTrinvrequestCB, TTrinvrequest> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrinvrequestList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrinvrequest> loadTTrinvrequestList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvrequestCB, TTrinvrequest> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrinvrequest>)EMPTY_NREF_LGWAY; }
        return doLoadTTrinvrequestList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrinvrequest> doLoadTTrinvrequestList(List<MCenter> mCenterList, LoadReferrerOption<TTrinvrequestCB, TTrinvrequest> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrinvrequestList");
    }

    /**
     * Load referrer of TTritemconvresultList by the set-upper of referrer. <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTritemconvresultList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">tritemconvresultCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tritemconvresultCB</span>.setupSelect...
     *     <span style="color: #553000">tritemconvresultCB</span>.query().set...
     *     <span style="color: #553000">tritemconvresultCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTritemconvresultList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTritemconvresult> loadTTritemconvresultList(List<MCenter> mCenterList, ConditionBeanSetupper<TTritemconvresultCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTritemconvresultList(mCenterList, new LoadReferrerOption<TTritemconvresultCB, TTritemconvresult>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTritemconvresultList by the set-upper of referrer. <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTritemconvresultList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">tritemconvresultCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tritemconvresultCB</span>.setupSelect...
     *     <span style="color: #553000">tritemconvresultCB</span>.query().set...
     *     <span style="color: #553000">tritemconvresultCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTritemconvresultList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTritemconvresult> loadTTritemconvresultList(MCenter mCenter, ConditionBeanSetupper<TTritemconvresultCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTritemconvresultList(xnewLRLs(mCenter), new LoadReferrerOption<TTritemconvresultCB, TTritemconvresult>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTritemconvresult> loadTTritemconvresultList(MCenter mCenter, LoadReferrerOption<TTritemconvresultCB, TTritemconvresult> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTritemconvresultList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTritemconvresult> loadTTritemconvresultList(List<MCenter> mCenterList, LoadReferrerOption<TTritemconvresultCB, TTritemconvresult> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTritemconvresult>)EMPTY_NREF_LGWAY; }
        return doLoadTTritemconvresultList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTritemconvresult> doLoadTTritemconvresultList(List<MCenter> mCenterList, LoadReferrerOption<TTritemconvresultCB, TTritemconvresult> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTritemconvresultList");
    }

    /**
     * Load referrer of TTrjukyuinvList by the set-upper of referrer. <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrjukyuinvList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trjukyuinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trjukyuinvCB</span>.setupSelect...
     *     <span style="color: #553000">trjukyuinvCB</span>.query().set...
     *     <span style="color: #553000">trjukyuinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrjukyuinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrjukyuinv> loadTTrjukyuinvList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrjukyuinvCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrjukyuinvList(mCenterList, new LoadReferrerOption<TTrjukyuinvCB, TTrjukyuinv>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrjukyuinvList by the set-upper of referrer. <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrjukyuinvList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trjukyuinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trjukyuinvCB</span>.setupSelect...
     *     <span style="color: #553000">trjukyuinvCB</span>.query().set...
     *     <span style="color: #553000">trjukyuinvCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrjukyuinvList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrjukyuinv> loadTTrjukyuinvList(MCenter mCenter, ConditionBeanSetupper<TTrjukyuinvCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrjukyuinvList(xnewLRLs(mCenter), new LoadReferrerOption<TTrjukyuinvCB, TTrjukyuinv>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrjukyuinv> loadTTrjukyuinvList(MCenter mCenter, LoadReferrerOption<TTrjukyuinvCB, TTrjukyuinv> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrjukyuinvList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrjukyuinv> loadTTrjukyuinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrjukyuinvCB, TTrjukyuinv> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrjukyuinv>)EMPTY_NREF_LGWAY; }
        return doLoadTTrjukyuinvList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrjukyuinv> doLoadTTrjukyuinvList(List<MCenter> mCenterList, LoadReferrerOption<TTrjukyuinvCB, TTrjukyuinv> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrjukyuinvList");
    }

    /**
     * Load referrer of TTrmanufacturedateList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedateList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trmanufacturedateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedateCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedateCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedate> loadTTrmanufacturedateList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrmanufacturedateCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrmanufacturedateList(mCenterList, new LoadReferrerOption<TTrmanufacturedateCB, TTrmanufacturedate>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrmanufacturedateList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedateList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trmanufacturedateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedateCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedateCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedateCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrmanufacturedateList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedate> loadTTrmanufacturedateList(MCenter mCenter, ConditionBeanSetupper<TTrmanufacturedateCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrmanufacturedateList(xnewLRLs(mCenter), new LoadReferrerOption<TTrmanufacturedateCB, TTrmanufacturedate>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedate> loadTTrmanufacturedateList(MCenter mCenter, LoadReferrerOption<TTrmanufacturedateCB, TTrmanufacturedate> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrmanufacturedateList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrmanufacturedate> loadTTrmanufacturedateList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedateCB, TTrmanufacturedate> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrmanufacturedate>)EMPTY_NREF_LGWAY; }
        return doLoadTTrmanufacturedateList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrmanufacturedate> doLoadTTrmanufacturedateList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedateCB, TTrmanufacturedate> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrmanufacturedateList");
    }

    /**
     * Load referrer of TTrmanufacturedatedetailList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedatedetailList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trmanufacturedatedetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedatedetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatedetail> loadTTrmanufacturedatedetailList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrmanufacturedatedetailCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrmanufacturedatedetailList(mCenterList, new LoadReferrerOption<TTrmanufacturedatedetailCB, TTrmanufacturedatedetail>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrmanufacturedatedetailList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedatedetailList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trmanufacturedatedetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedatedetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrmanufacturedatedetailList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatedetail> loadTTrmanufacturedatedetailList(MCenter mCenter, ConditionBeanSetupper<TTrmanufacturedatedetailCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrmanufacturedatedetailList(xnewLRLs(mCenter), new LoadReferrerOption<TTrmanufacturedatedetailCB, TTrmanufacturedatedetail>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatedetail> loadTTrmanufacturedatedetailList(MCenter mCenter, LoadReferrerOption<TTrmanufacturedatedetailCB, TTrmanufacturedatedetail> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrmanufacturedatedetailList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrmanufacturedatedetail> loadTTrmanufacturedatedetailList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedatedetailCB, TTrmanufacturedatedetail> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrmanufacturedatedetail>)EMPTY_NREF_LGWAY; }
        return doLoadTTrmanufacturedatedetailList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrmanufacturedatedetail> doLoadTTrmanufacturedatedetailList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedatedetailCB, TTrmanufacturedatedetail> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrmanufacturedatedetailList");
    }

    /**
     * Load referrer of TTrmanufacturedatehistoryList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedatehistoryList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trmanufacturedatehistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedatehistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatehistory> loadTTrmanufacturedatehistoryList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrmanufacturedatehistoryCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrmanufacturedatehistoryList(mCenterList, new LoadReferrerOption<TTrmanufacturedatehistoryCB, TTrmanufacturedatehistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrmanufacturedatehistoryList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrmanufacturedatehistoryList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trmanufacturedatehistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().set...
     *     <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrmanufacturedatehistoryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatehistory> loadTTrmanufacturedatehistoryList(MCenter mCenter, ConditionBeanSetupper<TTrmanufacturedatehistoryCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrmanufacturedatehistoryList(xnewLRLs(mCenter), new LoadReferrerOption<TTrmanufacturedatehistoryCB, TTrmanufacturedatehistory>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrmanufacturedatehistory> loadTTrmanufacturedatehistoryList(MCenter mCenter, LoadReferrerOption<TTrmanufacturedatehistoryCB, TTrmanufacturedatehistory> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrmanufacturedatehistoryList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrmanufacturedatehistory> loadTTrmanufacturedatehistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedatehistoryCB, TTrmanufacturedatehistory> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrmanufacturedatehistory>)EMPTY_NREF_LGWAY; }
        return doLoadTTrmanufacturedatehistoryList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrmanufacturedatehistory> doLoadTTrmanufacturedatehistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrmanufacturedatehistoryCB, TTrmanufacturedatehistory> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrmanufacturedatehistoryList");
    }

    /**
     * Load referrer of TTrpallettraceList by the set-upper of referrer. <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrpallettraceList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trpallettraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpallettraceCB</span>.setupSelect...
     *     <span style="color: #553000">trpallettraceCB</span>.query().set...
     *     <span style="color: #553000">trpallettraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrpallettraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpallettrace> loadTTrpallettraceList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrpallettraceCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrpallettraceList(mCenterList, new LoadReferrerOption<TTrpallettraceCB, TTrpallettrace>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrpallettraceList by the set-upper of referrer. <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrpallettraceList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trpallettraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trpallettraceCB</span>.setupSelect...
     *     <span style="color: #553000">trpallettraceCB</span>.query().set...
     *     <span style="color: #553000">trpallettraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrpallettraceList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpallettrace> loadTTrpallettraceList(MCenter mCenter, ConditionBeanSetupper<TTrpallettraceCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrpallettraceList(xnewLRLs(mCenter), new LoadReferrerOption<TTrpallettraceCB, TTrpallettrace>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrpallettrace> loadTTrpallettraceList(MCenter mCenter, LoadReferrerOption<TTrpallettraceCB, TTrpallettrace> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrpallettraceList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrpallettrace> loadTTrpallettraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrpallettraceCB, TTrpallettrace> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrpallettrace>)EMPTY_NREF_LGWAY; }
        return doLoadTTrpallettraceList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrpallettrace> doLoadTTrpallettraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrpallettraceCB, TTrpallettrace> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrpallettraceList");
    }

    /**
     * Load referrer of TTrreversestockList by the set-upper of referrer. <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrreversestockList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trreversestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trreversestockCB</span>.setupSelect...
     *     <span style="color: #553000">trreversestockCB</span>.query().set...
     *     <span style="color: #553000">trreversestockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrreversestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrreversestock> loadTTrreversestockList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrreversestockCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrreversestockList(mCenterList, new LoadReferrerOption<TTrreversestockCB, TTrreversestock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrreversestockList by the set-upper of referrer. <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrreversestockList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trreversestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trreversestockCB</span>.setupSelect...
     *     <span style="color: #553000">trreversestockCB</span>.query().set...
     *     <span style="color: #553000">trreversestockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrreversestockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrreversestock> loadTTrreversestockList(MCenter mCenter, ConditionBeanSetupper<TTrreversestockCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrreversestockList(xnewLRLs(mCenter), new LoadReferrerOption<TTrreversestockCB, TTrreversestock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrreversestock> loadTTrreversestockList(MCenter mCenter, LoadReferrerOption<TTrreversestockCB, TTrreversestock> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrreversestockList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrreversestock> loadTTrreversestockList(List<MCenter> mCenterList, LoadReferrerOption<TTrreversestockCB, TTrreversestock> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrreversestock>)EMPTY_NREF_LGWAY; }
        return doLoadTTrreversestockList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrreversestock> doLoadTTrreversestockList(List<MCenter> mCenterList, LoadReferrerOption<TTrreversestockCB, TTrreversestock> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrreversestockList");
    }

    /**
     * Load referrer of TTrstockdiffhistoryList by the set-upper of referrer. <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrstockdiffhistoryList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trstockdiffhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.query().set...
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrstockdiffhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrstockdiffhistory> loadTTrstockdiffhistoryList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrstockdiffhistoryCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrstockdiffhistoryList(mCenterList, new LoadReferrerOption<TTrstockdiffhistoryCB, TTrstockdiffhistory>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrstockdiffhistoryList by the set-upper of referrer. <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrstockdiffhistoryList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trstockdiffhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.setupSelect...
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.query().set...
     *     <span style="color: #553000">trstockdiffhistoryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrstockdiffhistoryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrstockdiffhistory> loadTTrstockdiffhistoryList(MCenter mCenter, ConditionBeanSetupper<TTrstockdiffhistoryCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrstockdiffhistoryList(xnewLRLs(mCenter), new LoadReferrerOption<TTrstockdiffhistoryCB, TTrstockdiffhistory>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrstockdiffhistory> loadTTrstockdiffhistoryList(MCenter mCenter, LoadReferrerOption<TTrstockdiffhistoryCB, TTrstockdiffhistory> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrstockdiffhistoryList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrstockdiffhistory> loadTTrstockdiffhistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrstockdiffhistoryCB, TTrstockdiffhistory> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrstockdiffhistory>)EMPTY_NREF_LGWAY; }
        return doLoadTTrstockdiffhistoryList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrstockdiffhistory> doLoadTTrstockdiffhistoryList(List<MCenter> mCenterList, LoadReferrerOption<TTrstockdiffhistoryCB, TTrstockdiffhistory> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrstockdiffhistoryList");
    }

    /**
     * Load referrer of TTrsymboltraceList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrsymboltraceList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trsymboltraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trsymboltraceCB</span>.setupSelect...
     *     <span style="color: #553000">trsymboltraceCB</span>.query().set...
     *     <span style="color: #553000">trsymboltraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrsymboltraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltrace> loadTTrsymboltraceList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrsymboltraceCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrsymboltraceList(mCenterList, new LoadReferrerOption<TTrsymboltraceCB, TTrsymboltrace>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrsymboltraceList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrsymboltraceList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trsymboltraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trsymboltraceCB</span>.setupSelect...
     *     <span style="color: #553000">trsymboltraceCB</span>.query().set...
     *     <span style="color: #553000">trsymboltraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrsymboltraceList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltrace> loadTTrsymboltraceList(MCenter mCenter, ConditionBeanSetupper<TTrsymboltraceCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrsymboltraceList(xnewLRLs(mCenter), new LoadReferrerOption<TTrsymboltraceCB, TTrsymboltrace>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltrace> loadTTrsymboltraceList(MCenter mCenter, LoadReferrerOption<TTrsymboltraceCB, TTrsymboltrace> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrsymboltraceList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrsymboltrace> loadTTrsymboltraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrsymboltraceCB, TTrsymboltrace> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrsymboltrace>)EMPTY_NREF_LGWAY; }
        return doLoadTTrsymboltraceList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrsymboltrace> doLoadTTrsymboltraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrsymboltraceCB, TTrsymboltrace> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrsymboltraceList");
    }

    /**
     * Load referrer of TTrsymboltraceextendList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrsymboltraceextendList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trsymboltraceextendCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trsymboltraceextendCB</span>.setupSelect...
     *     <span style="color: #553000">trsymboltraceextendCB</span>.query().set...
     *     <span style="color: #553000">trsymboltraceextendCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrsymboltraceextendList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltraceextend> loadTTrsymboltraceextendList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrsymboltraceextendCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrsymboltraceextendList(mCenterList, new LoadReferrerOption<TTrsymboltraceextendCB, TTrsymboltraceextend>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrsymboltraceextendList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrsymboltraceextendList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trsymboltraceextendCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trsymboltraceextendCB</span>.setupSelect...
     *     <span style="color: #553000">trsymboltraceextendCB</span>.query().set...
     *     <span style="color: #553000">trsymboltraceextendCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrsymboltraceextendList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltraceextend> loadTTrsymboltraceextendList(MCenter mCenter, ConditionBeanSetupper<TTrsymboltraceextendCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrsymboltraceextendList(xnewLRLs(mCenter), new LoadReferrerOption<TTrsymboltraceextendCB, TTrsymboltraceextend>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrsymboltraceextend> loadTTrsymboltraceextendList(MCenter mCenter, LoadReferrerOption<TTrsymboltraceextendCB, TTrsymboltraceextend> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrsymboltraceextendList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrsymboltraceextend> loadTTrsymboltraceextendList(List<MCenter> mCenterList, LoadReferrerOption<TTrsymboltraceextendCB, TTrsymboltraceextend> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrsymboltraceextend>)EMPTY_NREF_LGWAY; }
        return doLoadTTrsymboltraceextendList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrsymboltraceextend> doLoadTTrsymboltraceextendList(List<MCenter> mCenterList, LoadReferrerOption<TTrsymboltraceextendCB, TTrsymboltraceextend> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrsymboltraceextendList");
    }

    /**
     * Load referrer of TTrtraceList by the set-upper of referrer. <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrtraceList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">trtraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trtraceCB</span>.setupSelect...
     *     <span style="color: #553000">trtraceCB</span>.query().set...
     *     <span style="color: #553000">trtraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrtraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrtrace> loadTTrtraceList(List<MCenter> mCenterList, ConditionBeanSetupper<TTrtraceCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTTrtraceList(mCenterList, new LoadReferrerOption<TTrtraceCB, TTrtrace>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrtraceList by the set-upper of referrer. <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTTrtraceList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">trtraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trtraceCB</span>.setupSelect...
     *     <span style="color: #553000">trtraceCB</span>.query().set...
     *     <span style="color: #553000">trtraceCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTTrtraceList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrtrace> loadTTrtraceList(MCenter mCenter, ConditionBeanSetupper<TTrtraceCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTTrtraceList(xnewLRLs(mCenter), new LoadReferrerOption<TTrtraceCB, TTrtrace>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrtrace> loadTTrtraceList(MCenter mCenter, LoadReferrerOption<TTrtraceCB, TTrtrace> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTTrtraceList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrtrace> loadTTrtraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrtraceCB, TTrtrace> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TTrtrace>)EMPTY_NREF_LGWAY; }
        return doLoadTTrtraceList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrtrace> doLoadTTrtraceList(List<MCenter> mCenterList, LoadReferrerOption<TTrtraceCB, TTrtrace> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tTrtraceList");
    }

    /**
     * Load referrer of TYtrsoList by the set-upper of referrer. <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTYtrsoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">ytrsoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ytrsoCB</span>.setupSelect...
     *     <span style="color: #553000">ytrsoCB</span>.query().set...
     *     <span style="color: #553000">ytrsoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTYtrsoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYtrso> loadTYtrsoList(List<MCenter> mCenterList, ConditionBeanSetupper<TYtrsoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTYtrsoList(mCenterList, new LoadReferrerOption<TYtrsoCB, TYtrso>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TYtrsoList by the set-upper of referrer. <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTYtrsoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">ytrsoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ytrsoCB</span>.setupSelect...
     *     <span style="color: #553000">ytrsoCB</span>.query().set...
     *     <span style="color: #553000">ytrsoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTYtrsoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYtrso> loadTYtrsoList(MCenter mCenter, ConditionBeanSetupper<TYtrsoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTYtrsoList(xnewLRLs(mCenter), new LoadReferrerOption<TYtrsoCB, TYtrso>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TYtrso> loadTYtrsoList(MCenter mCenter, LoadReferrerOption<TYtrsoCB, TYtrso> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTYtrsoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TYtrso> loadTYtrsoList(List<MCenter> mCenterList, LoadReferrerOption<TYtrsoCB, TYtrso> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TYtrso>)EMPTY_NREF_LGWAY; }
        return doLoadTYtrsoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TYtrso> doLoadTYtrsoList(List<MCenter> mCenterList, LoadReferrerOption<TYtrsoCB, TYtrso> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tYtrsoList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mCenterList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCenter mCenter, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mCenter), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCenter mCenter, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCenter> mCenterList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MCenter> mCenterList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtLoadingList(mCenterList, new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MCenter mCenter, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtLoadingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MCenter mCenter, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtLoadingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MCenter> mCenterList, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtLoading>)EMPTY_NREF_LGWAY; }
        return doLoadWHtLoadingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtLoading> doLoadWHtLoadingList(List<MCenter> mCenterList, LoadReferrerOption<WHtLoadingCB, WHtLoading> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtLoadingList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mCenterList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MCenter mCenter, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mCenterList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MCenter mCenter, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveStoreList(mCenterList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MCenter mCenter, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveStoreList");
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtSerialReceiveInspList(mCenterList, new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCenter mCenter, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtSerialReceiveInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCenter mCenter, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtSerialReceiveInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialReceiveInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialReceiveInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialReceiveInsp> doLoadWHtSerialReceiveInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtSerialReceiveInspList");
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtSerialShippingInspList(mCenterList, new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCenter mCenter, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtSerialShippingInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCenter mCenter, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtSerialShippingInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialShippingInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialShippingInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialShippingInsp> doLoadWHtSerialShippingInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtSerialShippingInspList");
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtShippingList(mCenterList, new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtShippingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MCenter mCenter, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtShippingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MCenter mCenter, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtShippingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtShipping>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShipping> doLoadWHtShippingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingCB, WHtShipping> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtShippingList");
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtShippingPickingList(mCenterList, new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MCenter mCenter, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtShippingPickingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MCenter mCenter, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtShippingPickingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtShippingPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingPickingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShippingPicking> doLoadWHtShippingPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtShippingPickingList");
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MCenter> mCenterList, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWSglRowShipInspHList(mCenterList, new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MCenter mCenter, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWSglRowShipInspHList(xnewLRLs(mCenter), new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MCenter mCenter, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWSglRowShipInspHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MCenter> mCenterList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspH>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspH> doLoadWSglRowShipInspHList(List<MCenter> mCenterList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wSglRowShipInspHList");
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MCenter> mCenterList, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWShippingInterruptList(mCenterList, new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MCenter mCenter, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWShippingInterruptList(xnewLRLs(mCenter), new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MCenter mCenter, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWShippingInterruptList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MCenter> mCenterList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WShippingInterrupt>)EMPTY_NREF_LGWAY; }
        return doLoadWShippingInterruptList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WShippingInterrupt> doLoadWShippingInterruptList(List<MCenter> mCenterList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wShippingInterruptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BTimeZone'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BTimeZone> pulloutBTimeZone(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bTimeZone"); }

    /**
     * Pull out the list of foreign table 'BCulture'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BCulture> pulloutBCulture(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bCulture"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerId.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterIdList(List<MCenter> mCenterList)
    { return helpExtractListInternally(mCenterList, "centerId"); }

    /**
     * Extract the value list of (single) unique key centerCd.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCenterCdList(List<MCenter> mCenterList)
    { return helpExtractListInternally(mCenterList, "centerCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenter.setFoo...(value);
     * mCenter.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">insert</span>(mCenter);
     * ... = mCenter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCenter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCenter mCenter) {
        doInsert(mCenter, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">update</span>(mCenter);
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCenter mCenter) {
        doUpdate(mCenter, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCenter);
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCenter mCenter) {
        doUpdateNonstrict(mCenter, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCenter mCenter) {
        doInsertOrUpdate(mCenter, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCenter mCenter) {
        doInsertOrUpdateNonstrict(mCenter, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">delete</span>(mCenter);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCenter mCenter) {
        doDelete(mCenter, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCenter);
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCenter mCenter) {
        doDeleteNonstrict(mCenter, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCenter);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCenter mCenter) {
        doDeleteNonstrictIgnoreDeleted(mCenter, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCenter et, final DeleteOption<MCenterCB> op) {
        assertObjectNotNull("mCenter", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCenterList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCenter> mCenterList) {
        return doBatchInsert(mCenterList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList);
     * </pre>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenter> mCenterList) {
        return doBatchUpdate(mCenterList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCenterBhv.<span style="color: #CC4747">batchUpdate</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenter> mCenterList, SpecifyQuery<MCenterCB> colCBLambda) {
        return doBatchUpdate(mCenterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList);
     * </pre>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenter> mCenterList) {
        return doBatchUpdateNonstrict(mCenterList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenter> mCenterList, SpecifyQuery<MCenterCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCenterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCenter> mCenterList) {
        return doBatchDelete(mCenterList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCenter> mCenterList) {
        return doBatchDeleteNonstrict(mCenterList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCenter, MCenterCB&gt;() {
     *     public ConditionBean setup(MCenter entity, MCenterCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCenter, MCenterCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenter.setPK...(value);</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCenter, cb);
     * </pre>
     * @param mCenter The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCenter mCenter, MCenterCB cb) {
        return doQueryUpdate(mCenter, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCenterCB cb = new MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCenter, cb);
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCenterCB cb) {
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
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenter.setFoo...(value);
     * mCenter.setBar...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCenter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCenter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        doInsert(mCenter, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCenter mCenter, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        doUpdate(mCenter, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        doUpdateNonstrict(mCenter, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCenter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> insertOpLambda, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> updateOpLambda) {
        doInsertOrUpdate(mCenter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCenter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> insertOpLambda, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCenter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCenter mCenter, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        doDelete(mCenter, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        doDeleteNonstrict(mCenter, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        return doBatchInsert(mCenterList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doBatchUpdate(mCenterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doBatchUpdateNonstrict(mCenterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doBatchDelete(mCenterList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doBatchDeleteNonstrict(mCenterList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCenter, MCenterCB> manyArgLambda, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenter.setPK...(value);</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCenter, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCenter mCenter, MCenterCB cb, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doQueryUpdate(mCenter, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCenterCB cb, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCenterBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCenterBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCenterBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCenterBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCenterBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCenterBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCenterBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCenterBhv.outideSql().removeBlockComment().selectList()
     * mCenterBhv.outideSql().removeLineComment().selectList()
     * mCenterBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCenterBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCenterBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCenter> typeOfSelectedEntity() { return MCenter.class; }
    protected Class<MCenter> typeOfHandlingEntity() { return MCenter.class; }
    protected Class<MCenterCB> typeOfHandlingConditionBean() { return MCenterCB.class; }
}
