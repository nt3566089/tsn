package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CENTER as TABLE. <br>
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
public class LoaderOfMCenter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenter> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenter ready(List<MCenter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MBox> _referrerMBoxList;

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * M_BOX by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">boxCB</span>.setupSelect...
     *         <span style="color: #553000">boxCB</span>.query().set...
     *         <span style="color: #553000">boxCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">boxLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    boxLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBox> loadMBoxList(ConditionBeanSetupper<MBoxCB> refCBLambda) {
        myBhv().loadMBoxList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxList = refLs);
        return hd -> hd.handle(new LoaderOfMBox().ready(_referrerMBoxList, _selector));
    }

    protected List<MBoxGrp> _referrerMBoxGrpList;

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBoxGrp> loadMBoxGrpList(ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        myBhv().loadMBoxGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMBoxGrp().ready(_referrerMBoxGrpList, _selector));
    }

    protected List<MCarrier> _referrerMCarrierList;

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">carrierCB</span>.setupSelect...
     *         <span style="color: #553000">carrierCB</span>.query().set...
     *         <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">carrierLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    carrierLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrier> loadMCarrierList(ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        myBhv().loadMCarrierList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrier().ready(_referrerMCarrierList, _selector));
    }

    protected List<MCarrierSlipSgw> _referrerMCarrierSlipSgwList;

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">sgwCB</span>.setupSelect...
     *         <span style="color: #553000">sgwCB</span>.query().set...
     *         <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">sgwLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    sgwLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipSgw> loadMCarrierSlipSgwList(ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        myBhv().loadMCarrierSlipSgwList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipSgwList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipSgw().ready(_referrerMCarrierSlipSgwList, _selector));
    }

    protected List<MCarrierSlipYmt> _referrerMCarrierSlipYmtList;

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ymtCB</span>.setupSelect...
     *         <span style="color: #553000">ymtCB</span>.query().set...
     *         <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ymtLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ymtLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipYmt> loadMCarrierSlipYmtList(ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        myBhv().loadMCarrierSlipYmtList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipYmtList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipYmt().ready(_referrerMCarrierSlipYmtList, _selector));
    }

    protected List<MCarrierSlipYupk> _referrerMCarrierSlipYupkList;

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">yupkCB</span>.setupSelect...
     *         <span style="color: #553000">yupkCB</span>.query().set...
     *         <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">yupkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    yupkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipYupk> loadMCarrierSlipYupkList(ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        myBhv().loadMCarrierSlipYupkList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipYupkList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipYupk().ready(_referrerMCarrierSlipYupkList, _selector));
    }

    protected List<MCblk> _referrerMCblkList;

    /**
     * Load referrer of MCblkList by the set-upper of referrer. <br>
     * M_CBLK by CENTER_ID, named 'MCblkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCblkList</span>(<span style="color: #553000">cblkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cblkCB</span>.setupSelect...
     *         <span style="color: #553000">cblkCB</span>.query().set...
     *         <span style="color: #553000">cblkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cblkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cblkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCblkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCblk> loadMCblkList(ConditionBeanSetupper<MCblkCB> refCBLambda) {
        myBhv().loadMCblkList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCblkList = refLs);
        return hd -> hd.handle(new LoaderOfMCblk().ready(_referrerMCblkList, _selector));
    }

    protected List<MCbrctg> _referrerMCbrctgList;

    /**
     * Load referrer of MCbrctgList by the set-upper of referrer. <br>
     * M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCbrctgList</span>(<span style="color: #553000">cbrctgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cbrctgCB</span>.setupSelect...
     *         <span style="color: #553000">cbrctgCB</span>.query().set...
     *         <span style="color: #553000">cbrctgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cbrctgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cbrctgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCbrctgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCbrctg> loadMCbrctgList(ConditionBeanSetupper<MCbrctgCB> refCBLambda) {
        myBhv().loadMCbrctgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCbrctgList = refLs);
        return hd -> hd.handle(new LoaderOfMCbrctg().ready(_referrerMCbrctgList, _selector));
    }

    protected List<MCdrcatt> _referrerMCdrcattList;

    /**
     * Load referrer of MCdrcattList by the set-upper of referrer. <br>
     * M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCdrcattList</span>(<span style="color: #553000">cdrcattCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cdrcattCB</span>.setupSelect...
     *         <span style="color: #553000">cdrcattCB</span>.query().set...
     *         <span style="color: #553000">cdrcattCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cdrcattLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cdrcattLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCdrcattList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCdrcatt> loadMCdrcattList(ConditionBeanSetupper<MCdrcattCB> refCBLambda) {
        myBhv().loadMCdrcattList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCdrcattList = refLs);
        return hd -> hd.handle(new LoaderOfMCdrcatt().ready(_referrerMCdrcattList, _selector));
    }

    protected List<MCenterClass> _referrerMCenterClassList;

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">classCB</span>.setupSelect...
     *         <span style="color: #553000">classCB</span>.query().set...
     *         <span style="color: #553000">classCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">classLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    classLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterClassList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClass> loadMCenterClassList(ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        myBhv().loadMCenterClassList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClass().ready(_referrerMCenterClassList, _selector));
    }

    protected List<MCenterCol> _referrerMCenterColList;

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCol> loadMCenterColList(ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        myBhv().loadMCenterColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterColList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCol().ready(_referrerMCenterColList, _selector));
    }

    protected List<MCenterCustomer> _referrerMCenterCustomerList;

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCustomer> loadMCenterCustomerList(ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        myBhv().loadMCenterCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCustomer().ready(_referrerMCenterCustomerList, _selector));
    }

    protected List<MCenterItem> _referrerMCenterItemList;

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterItem> loadMCenterItemList(ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        myBhv().loadMCenterItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterItemList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterItem().ready(_referrerMCenterItemList, _selector));
    }

    protected List<MCenterScreen> _referrerMCenterScreenList;

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterScreen> loadMCenterScreenList(ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        myBhv().loadMCenterScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterScreen().ready(_referrerMCenterScreenList, _selector));
    }

    protected List<MClientCenter> _referrerMClientCenterList;

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCenter> loadMClientCenterList(ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        myBhv().loadMClientCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCenter().ready(_referrerMClientCenterList, _selector));
    }

    protected List<MClin> _referrerMClinList;

    /**
     * Load referrer of MClinList by the set-upper of referrer. <br>
     * M_CLIN by CENTER_ID, named 'MClinList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMClinList</span>(<span style="color: #553000">clinCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clinCB</span>.setupSelect...
     *         <span style="color: #553000">clinCB</span>.query().set...
     *         <span style="color: #553000">clinCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clinLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clinLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClinList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClin> loadMClinList(ConditionBeanSetupper<MClinCB> refCBLambda) {
        myBhv().loadMClinList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClinList = refLs);
        return hd -> hd.handle(new LoaderOfMClin().ready(_referrerMClinList, _selector));
    }

    protected List<MCorg> _referrerMCorgList;

    /**
     * Load referrer of MCorgList by the set-upper of referrer. <br>
     * M_CORG by CENTER_ID, named 'MCorgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCorgList</span>(<span style="color: #553000">corgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">corgCB</span>.setupSelect...
     *         <span style="color: #553000">corgCB</span>.query().set...
     *         <span style="color: #553000">corgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">corgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    corgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCorgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCorg> loadMCorgList(ConditionBeanSetupper<MCorgCB> refCBLambda) {
        myBhv().loadMCorgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCorgList = refLs);
        return hd -> hd.handle(new LoaderOfMCorg().ready(_referrerMCorgList, _selector));
    }

    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDeliveryCourse> loadMDeliveryCourseList(ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        myBhv().loadMDeliveryCourseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDeliveryCourseList = refLs);
        return hd -> hd.handle(new LoaderOfMDeliveryCourse().ready(_referrerMDeliveryCourseList, _selector));
    }

    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * M_LOCATION by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MMfinvoperation> _referrerMMfinvoperationList;

    /**
     * Load referrer of MMfinvoperationList by the set-upper of referrer. <br>
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMMfinvoperationList</span>(<span style="color: #553000">mfinvoperationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfinvoperationCB</span>.setupSelect...
     *         <span style="color: #553000">mfinvoperationCB</span>.query().set...
     *         <span style="color: #553000">mfinvoperationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfinvoperationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfinvoperationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfinvoperationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfinvoperation> loadMMfinvoperationList(ConditionBeanSetupper<MMfinvoperationCB> refCBLambda) {
        myBhv().loadMMfinvoperationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfinvoperationList = refLs);
        return hd -> hd.handle(new LoaderOfMMfinvoperation().ready(_referrerMMfinvoperationList, _selector));
    }

    protected List<MMfmonthchg> _referrerMMfmonthchgList;

    /**
     * Load referrer of MMfmonthchgList by the set-upper of referrer. <br>
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMMfmonthchgList</span>(<span style="color: #553000">mfmonthchgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfmonthchgCB</span>.setupSelect...
     *         <span style="color: #553000">mfmonthchgCB</span>.query().set...
     *         <span style="color: #553000">mfmonthchgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfmonthchgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfmonthchgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfmonthchgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfmonthchg> loadMMfmonthchgList(ConditionBeanSetupper<MMfmonthchgCB> refCBLambda) {
        myBhv().loadMMfmonthchgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfmonthchgList = refLs);
        return hd -> hd.handle(new LoaderOfMMfmonthchg().ready(_referrerMMfmonthchgList, _selector));
    }

    protected List<MMfstockitem> _referrerMMfstockitemList;

    /**
     * Load referrer of MMfstockitemList by the set-upper of referrer. <br>
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMMfstockitemList</span>(<span style="color: #553000">mfstockitemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfstockitemCB</span>.setupSelect...
     *         <span style="color: #553000">mfstockitemCB</span>.query().set...
     *         <span style="color: #553000">mfstockitemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfstockitemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfstockitemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfstockitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfstockitem> loadMMfstockitemList(ConditionBeanSetupper<MMfstockitemCB> refCBLambda) {
        myBhv().loadMMfstockitemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfstockitemList = refLs);
        return hd -> hd.handle(new LoaderOfMMfstockitem().ready(_referrerMMfstockitemList, _selector));
    }

    protected List<MMfwhstrct> _referrerMMfwhstrctList;

    /**
     * Load referrer of MMfwhstrctList by the set-upper of referrer. <br>
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMMfwhstrctList</span>(<span style="color: #553000">mfwhstrctCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfwhstrctCB</span>.setupSelect...
     *         <span style="color: #553000">mfwhstrctCB</span>.query().set...
     *         <span style="color: #553000">mfwhstrctCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfwhstrctLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfwhstrctLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfwhstrctList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfwhstrct> loadMMfwhstrctList(ConditionBeanSetupper<MMfwhstrctCB> refCBLambda) {
        myBhv().loadMMfwhstrctList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfwhstrctList = refLs);
        return hd -> hd.handle(new LoaderOfMMfwhstrct().ready(_referrerMMfwhstrctList, _selector));
    }

    protected List<MMfwhxitem> _referrerMMfwhxitemList;

    /**
     * Load referrer of MMfwhxitemList by the set-upper of referrer. <br>
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMMfwhxitemList</span>(<span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">entityCB</span>.setupSelect...
     *         <span style="color: #553000">entityCB</span>.query().set...
     *         <span style="color: #553000">entityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">entityLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    entityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMMfwhxitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfwhxitem> loadMMfwhxitemList(ConditionBeanSetupper<MMfwhxitemCB> refCBLambda) {
        myBhv().loadMMfwhxitemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfwhxitemList = refLs);
        return hd -> hd.handle(new LoaderOfMMfwhxitem().ready(_referrerMMfwhxitemList, _selector));
    }

    protected List<MNumberingCenter> _referrerMNumberingCenterList;

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMNumberingCenter> loadMNumberingCenterList(ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        myBhv().loadMNumberingCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMNumberingCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMNumberingCenter().ready(_referrerMNumberingCenterList, _selector));
    }

    protected List<MUserCenter> _referrerMUserCenterList;

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserCenter> loadMUserCenterList(ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        myBhv().loadMUserCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMUserCenter().ready(_referrerMUserCenterList, _selector));
    }

    protected List<MUserLogin> _referrerMUserLoginList;

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserLogin> loadMUserLoginList(ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        myBhv().loadMUserLoginList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserLoginList = refLs);
        return hd -> hd.handle(new LoaderOfMUserLogin().ready(_referrerMUserLoginList, _selector));
    }

    protected List<MWarehouse> _referrerMWarehouseList;

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">warehouseCB</span>.setupSelect...
     *         <span style="color: #553000">warehouseCB</span>.query().set...
     *         <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">warehouseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    warehouseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWarehouseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWarehouse> loadMWarehouseList(ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        myBhv().loadMWarehouseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWarehouseList = refLs);
        return hd -> hd.handle(new LoaderOfMWarehouse().ready(_referrerMWarehouseList, _selector));
    }

    protected List<MWebHtInfo> _referrerMWebHtInfoList;

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWebHtInfo> loadMWebHtInfoList(ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        myBhv().loadMWebHtInfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWebHtInfoList = refLs);
        return hd -> hd.handle(new LoaderOfMWebHtInfo().ready(_referrerMWebHtInfoList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHList;

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHList, _selector));
    }

    protected List<TCcopam> _referrerTCcopamList;

    /**
     * Load referrer of TCcopamList by the set-upper of referrer. <br>
     * T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTCcopamList</span>(<span style="color: #553000">ccopamCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ccopamCB</span>.setupSelect...
     *         <span style="color: #553000">ccopamCB</span>.query().set...
     *         <span style="color: #553000">ccopamCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ccopamLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ccopamLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCcopamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCcopam> loadTCcopamList(ConditionBeanSetupper<TCcopamCB> refCBLambda) {
        myBhv().loadTCcopamList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCcopamList = refLs);
        return hd -> hd.handle(new LoaderOfTCcopam().ready(_referrerTCcopamList, _selector));
    }

    protected List<TCenterSymbol> _referrerTCenterSymbolList;

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">symbolCB</span>.setupSelect...
     *         <span style="color: #553000">symbolCB</span>.query().set...
     *         <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">symbolLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    symbolLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCenterSymbol> loadTCenterSymbolList(ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        myBhv().loadTCenterSymbolList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCenterSymbolList = refLs);
        return hd -> hd.handle(new LoaderOfTCenterSymbol().ready(_referrerTCenterSymbolList, _selector));
    }

    protected List<TCordhdr> _referrerTCordhdrList;

    /**
     * Load referrer of TCordhdrList by the set-upper of referrer. <br>
     * T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTCordhdrList</span>(<span style="color: #553000">cordhdrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cordhdrCB</span>.setupSelect...
     *         <span style="color: #553000">cordhdrCB</span>.query().set...
     *         <span style="color: #553000">cordhdrCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cordhdrLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cordhdrLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCordhdrList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCordhdr> loadTCordhdrList(ConditionBeanSetupper<TCordhdrCB> refCBLambda) {
        myBhv().loadTCordhdrList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCordhdrList = refLs);
        return hd -> hd.handle(new LoaderOfTCordhdr().ready(_referrerTCordhdrList, _selector));
    }

    protected List<TCsrwhadm> _referrerTCsrwhadmList;

    /**
     * Load referrer of TCsrwhadmList by the set-upper of referrer. <br>
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTCsrwhadmList</span>(<span style="color: #553000">csrwhadmCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">csrwhadmCB</span>.setupSelect...
     *         <span style="color: #553000">csrwhadmCB</span>.query().set...
     *         <span style="color: #553000">csrwhadmCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">csrwhadmLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    csrwhadmLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTCsrwhadmList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCsrwhadm> loadTCsrwhadmList(ConditionBeanSetupper<TCsrwhadmCB> refCBLambda) {
        myBhv().loadTCsrwhadmList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCsrwhadmList = refLs);
        return hd -> hd.handle(new LoaderOfTCsrwhadm().ready(_referrerTCsrwhadmList, _selector));
    }

    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderH> loadTEcOrderHList(ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        myBhv().loadTEcOrderHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderHList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderH().ready(_referrerTEcOrderHList, _selector));
    }

    protected List<TInventoryH> _referrerTInventoryHList;

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryH> loadTInventoryHList(ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        myBhv().loadTInventoryHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryHList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryH().ready(_referrerTInventoryHList, _selector));
    }

    protected List<TMflastshiplot> _referrerTMflastshiplotList;

    /**
     * Load referrer of TMflastshiplotList by the set-upper of referrer. <br>
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTMflastshiplotList</span>(<span style="color: #553000">mflastshiplotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mflastshiplotCB</span>.setupSelect...
     *         <span style="color: #553000">mflastshiplotCB</span>.query().set...
     *         <span style="color: #553000">mflastshiplotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mflastshiplotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mflastshiplotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMflastshiplotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMflastshiplot> loadTMflastshiplotList(ConditionBeanSetupper<TMflastshiplotCB> refCBLambda) {
        myBhv().loadTMflastshiplotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMflastshiplotList = refLs);
        return hd -> hd.handle(new LoaderOfTMflastshiplot().ready(_referrerTMflastshiplotList, _selector));
    }

    protected List<TMoveInstH> _referrerTMoveInstHList;

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstH> loadTMoveInstHList(ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        myBhv().loadTMoveInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstH().ready(_referrerTMoveInstHList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHList;

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<TPallet> _referrerTPalletList;

    /**
     * Load referrer of TPalletList by the set-upper of referrer. <br>
     * T_PALLET by CENTER_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">palletCB</span>.setupSelect...
     *         <span style="color: #553000">palletCB</span>.query().set...
     *         <span style="color: #553000">palletCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">palletLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    palletLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPallet> loadTPalletList(ConditionBeanSetupper<TPalletCB> refCBLambda) {
        myBhv().loadTPalletList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPalletList = refLs);
        return hd -> hd.handle(new LoaderOfTPallet().ready(_referrerTPalletList, _selector));
    }

    protected List<TPickingH> _referrerTPickingHList;

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingH> loadTPickingHList(ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        myBhv().loadTPickingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingH().ready(_referrerTPickingHList, _selector));
    }

    protected List<TPicMthdRcmd> _referrerTPicMthdRcmdList;

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rcmdCB</span>.setupSelect...
     *         <span style="color: #553000">rcmdCB</span>.query().set...
     *         <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rcmdLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rcmdLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmd> loadTPicMthdRcmdList(ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmd().ready(_referrerTPicMthdRcmdList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHList;

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHList, _selector));
    }

    protected List<TSerialNo> _referrerTSerialNoList;

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSerialNo> loadTSerialNoList(ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        myBhv().loadTSerialNoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSerialNoList = refLs);
        return hd -> hd.handle(new LoaderOfTSerialNo().ready(_referrerTSerialNoList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHList;

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHList, _selector));
    }

    protected List<TSplinfo> _referrerTSplinfoList;

    /**
     * Load referrer of TSplinfoList by the set-upper of referrer. <br>
     * T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTSplinfoList</span>(<span style="color: #553000">splinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">splinfoCB</span>.setupSelect...
     *         <span style="color: #553000">splinfoCB</span>.query().set...
     *         <span style="color: #553000">splinfoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">splinfoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    splinfoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSplinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSplinfo> loadTSplinfoList(ConditionBeanSetupper<TSplinfoCB> refCBLambda) {
        myBhv().loadTSplinfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSplinfoList = refLs);
        return hd -> hd.handle(new LoaderOfTSplinfo().ready(_referrerTSplinfoList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHList, _selector));
    }

    protected List<TTrallinv> _referrerTTrallinvList;

    /**
     * Load referrer of TTrallinvList by the set-upper of referrer. <br>
     * T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrallinvList</span>(<span style="color: #553000">trallinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trallinvCB</span>.setupSelect...
     *         <span style="color: #553000">trallinvCB</span>.query().set...
     *         <span style="color: #553000">trallinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trallinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trallinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrallinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrallinv> loadTTrallinvList(ConditionBeanSetupper<TTrallinvCB> refCBLambda) {
        myBhv().loadTTrallinvList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrallinvList = refLs);
        return hd -> hd.handle(new LoaderOfTTrallinv().ready(_referrerTTrallinvList, _selector));
    }

    protected List<TTrallinvhistory> _referrerTTrallinvhistoryList;

    /**
     * Load referrer of TTrallinvhistoryList by the set-upper of referrer. <br>
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrallinvhistoryList</span>(<span style="color: #553000">trallinvhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trallinvhistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trallinvhistoryCB</span>.query().set...
     *         <span style="color: #553000">trallinvhistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trallinvhistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trallinvhistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrallinvhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrallinvhistory> loadTTrallinvhistoryList(ConditionBeanSetupper<TTrallinvhistoryCB> refCBLambda) {
        myBhv().loadTTrallinvhistoryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrallinvhistoryList = refLs);
        return hd -> hd.handle(new LoaderOfTTrallinvhistory().ready(_referrerTTrallinvhistoryList, _selector));
    }

    protected List<TTrcaseinventory> _referrerTTrcaseinventoryList;

    /**
     * Load referrer of TTrcaseinventoryList by the set-upper of referrer. <br>
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrcaseinventoryList</span>(<span style="color: #553000">trcaseinventoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcaseinventoryCB</span>.setupSelect...
     *         <span style="color: #553000">trcaseinventoryCB</span>.query().set...
     *         <span style="color: #553000">trcaseinventoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcaseinventoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcaseinventoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcaseinventoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrcaseinventory> loadTTrcaseinventoryList(ConditionBeanSetupper<TTrcaseinventoryCB> refCBLambda) {
        myBhv().loadTTrcaseinventoryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrcaseinventoryList = refLs);
        return hd -> hd.handle(new LoaderOfTTrcaseinventory().ready(_referrerTTrcaseinventoryList, _selector));
    }

    protected List<TTrcasenum> _referrerTTrcasenumList;

    /**
     * Load referrer of TTrcasenumList by the set-upper of referrer. <br>
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrcasenumList</span>(<span style="color: #553000">trcasenumCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcasenumCB</span>.setupSelect...
     *         <span style="color: #553000">trcasenumCB</span>.query().set...
     *         <span style="color: #553000">trcasenumCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcasenumLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcasenumLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcasenumList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrcasenum> loadTTrcasenumList(ConditionBeanSetupper<TTrcasenumCB> refCBLambda) {
        myBhv().loadTTrcasenumList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrcasenumList = refLs);
        return hd -> hd.handle(new LoaderOfTTrcasenum().ready(_referrerTTrcasenumList, _selector));
    }

    protected List<TTrcasestock> _referrerTTrcasestockList;

    /**
     * Load referrer of TTrcasestockList by the set-upper of referrer. <br>
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrcasestockList</span>(<span style="color: #553000">trcasestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcasestockCB</span>.setupSelect...
     *         <span style="color: #553000">trcasestockCB</span>.query().set...
     *         <span style="color: #553000">trcasestockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcasestockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcasestockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrcasestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrcasestock> loadTTrcasestockList(ConditionBeanSetupper<TTrcasestockCB> refCBLambda) {
        myBhv().loadTTrcasestockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrcasestockList = refLs);
        return hd -> hd.handle(new LoaderOfTTrcasestock().ready(_referrerTTrcasestockList, _selector));
    }

    protected List<TTrhanbaiinv> _referrerTTrhanbaiinvList;

    /**
     * Load referrer of TTrhanbaiinvList by the set-upper of referrer. <br>
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrhanbaiinvList</span>(<span style="color: #553000">trhanbaiinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trhanbaiinvCB</span>.setupSelect...
     *         <span style="color: #553000">trhanbaiinvCB</span>.query().set...
     *         <span style="color: #553000">trhanbaiinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trhanbaiinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trhanbaiinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrhanbaiinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrhanbaiinv> loadTTrhanbaiinvList(ConditionBeanSetupper<TTrhanbaiinvCB> refCBLambda) {
        myBhv().loadTTrhanbaiinvList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrhanbaiinvList = refLs);
        return hd -> hd.handle(new LoaderOfTTrhanbaiinv().ready(_referrerTTrhanbaiinvList, _selector));
    }

    protected List<TTrinvcheckinfo> _referrerTTrinvcheckinfoList;

    /**
     * Load referrer of TTrinvcheckinfoList by the set-upper of referrer. <br>
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrinvcheckinfoList</span>(<span style="color: #553000">trinvcheckinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvcheckinfoCB</span>.setupSelect...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().set...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvcheckinfoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvcheckinfoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvcheckinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrinvcheckinfo> loadTTrinvcheckinfoList(ConditionBeanSetupper<TTrinvcheckinfoCB> refCBLambda) {
        myBhv().loadTTrinvcheckinfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrinvcheckinfoList = refLs);
        return hd -> hd.handle(new LoaderOfTTrinvcheckinfo().ready(_referrerTTrinvcheckinfoList, _selector));
    }

    protected List<TTrinvcorrect> _referrerTTrinvcorrectList;

    /**
     * Load referrer of TTrinvcorrectList by the set-upper of referrer. <br>
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrinvcorrectList</span>(<span style="color: #553000">trinvcorrectCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvcorrectCB</span>.setupSelect...
     *         <span style="color: #553000">trinvcorrectCB</span>.query().set...
     *         <span style="color: #553000">trinvcorrectCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvcorrectLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvcorrectLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvcorrectList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrinvcorrect> loadTTrinvcorrectList(ConditionBeanSetupper<TTrinvcorrectCB> refCBLambda) {
        myBhv().loadTTrinvcorrectList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrinvcorrectList = refLs);
        return hd -> hd.handle(new LoaderOfTTrinvcorrect().ready(_referrerTTrinvcorrectList, _selector));
    }

    protected List<TTrinvreanswer> _referrerTTrinvreanswerList;

    /**
     * Load referrer of TTrinvreanswerList by the set-upper of referrer. <br>
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrinvreanswerList</span>(<span style="color: #553000">trinvreanswerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvreanswerCB</span>.setupSelect...
     *         <span style="color: #553000">trinvreanswerCB</span>.query().set...
     *         <span style="color: #553000">trinvreanswerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvreanswerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvreanswerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvreanswerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrinvreanswer> loadTTrinvreanswerList(ConditionBeanSetupper<TTrinvreanswerCB> refCBLambda) {
        myBhv().loadTTrinvreanswerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrinvreanswerList = refLs);
        return hd -> hd.handle(new LoaderOfTTrinvreanswer().ready(_referrerTTrinvreanswerList, _selector));
    }

    protected List<TTrinvrequest> _referrerTTrinvrequestList;

    /**
     * Load referrer of TTrinvrequestList by the set-upper of referrer. <br>
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrinvrequestList</span>(<span style="color: #553000">trinvrequestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvrequestCB</span>.setupSelect...
     *         <span style="color: #553000">trinvrequestCB</span>.query().set...
     *         <span style="color: #553000">trinvrequestCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvrequestLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvrequestLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrinvrequestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrinvrequest> loadTTrinvrequestList(ConditionBeanSetupper<TTrinvrequestCB> refCBLambda) {
        myBhv().loadTTrinvrequestList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrinvrequestList = refLs);
        return hd -> hd.handle(new LoaderOfTTrinvrequest().ready(_referrerTTrinvrequestList, _selector));
    }

    protected List<TTritemconvresult> _referrerTTritemconvresultList;

    /**
     * Load referrer of TTritemconvresultList by the set-upper of referrer. <br>
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTritemconvresultList</span>(<span style="color: #553000">tritemconvresultCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tritemconvresultCB</span>.setupSelect...
     *         <span style="color: #553000">tritemconvresultCB</span>.query().set...
     *         <span style="color: #553000">tritemconvresultCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tritemconvresultLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tritemconvresultLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTritemconvresultList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTritemconvresult> loadTTritemconvresultList(ConditionBeanSetupper<TTritemconvresultCB> refCBLambda) {
        myBhv().loadTTritemconvresultList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTritemconvresultList = refLs);
        return hd -> hd.handle(new LoaderOfTTritemconvresult().ready(_referrerTTritemconvresultList, _selector));
    }

    protected List<TTrjukyuinv> _referrerTTrjukyuinvList;

    /**
     * Load referrer of TTrjukyuinvList by the set-upper of referrer. <br>
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrjukyuinvList</span>(<span style="color: #553000">trjukyuinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trjukyuinvCB</span>.setupSelect...
     *         <span style="color: #553000">trjukyuinvCB</span>.query().set...
     *         <span style="color: #553000">trjukyuinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trjukyuinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trjukyuinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrjukyuinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrjukyuinv> loadTTrjukyuinvList(ConditionBeanSetupper<TTrjukyuinvCB> refCBLambda) {
        myBhv().loadTTrjukyuinvList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrjukyuinvList = refLs);
        return hd -> hd.handle(new LoaderOfTTrjukyuinv().ready(_referrerTTrjukyuinvList, _selector));
    }

    protected List<TTrmanufacturedate> _referrerTTrmanufacturedateList;

    /**
     * Load referrer of TTrmanufacturedateList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedateList</span>(<span style="color: #553000">trmanufacturedateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedateCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedateCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedateCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedateLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedateLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrmanufacturedate> loadTTrmanufacturedateList(ConditionBeanSetupper<TTrmanufacturedateCB> refCBLambda) {
        myBhv().loadTTrmanufacturedateList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrmanufacturedateList = refLs);
        return hd -> hd.handle(new LoaderOfTTrmanufacturedate().ready(_referrerTTrmanufacturedateList, _selector));
    }

    protected List<TTrmanufacturedatedetail> _referrerTTrmanufacturedatedetailList;

    /**
     * Load referrer of TTrmanufacturedatedetailList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedatedetailList</span>(<span style="color: #553000">trmanufacturedatedetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedatedetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedatedetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedatedetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrmanufacturedatedetail> loadTTrmanufacturedatedetailList(ConditionBeanSetupper<TTrmanufacturedatedetailCB> refCBLambda) {
        myBhv().loadTTrmanufacturedatedetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrmanufacturedatedetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrmanufacturedatedetail().ready(_referrerTTrmanufacturedatedetailList, _selector));
    }

    protected List<TTrmanufacturedatehistory> _referrerTTrmanufacturedatehistoryList;

    /**
     * Load referrer of TTrmanufacturedatehistoryList by the set-upper of referrer. <br>
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedatehistoryList</span>(<span style="color: #553000">trmanufacturedatehistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedatehistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedatehistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrmanufacturedatehistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrmanufacturedatehistory> loadTTrmanufacturedatehistoryList(ConditionBeanSetupper<TTrmanufacturedatehistoryCB> refCBLambda) {
        myBhv().loadTTrmanufacturedatehistoryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrmanufacturedatehistoryList = refLs);
        return hd -> hd.handle(new LoaderOfTTrmanufacturedatehistory().ready(_referrerTTrmanufacturedatehistoryList, _selector));
    }

    protected List<TTrpallettrace> _referrerTTrpallettraceList;

    /**
     * Load referrer of TTrpallettraceList by the set-upper of referrer. <br>
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrpallettraceList</span>(<span style="color: #553000">trpallettraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trpallettraceCB</span>.setupSelect...
     *         <span style="color: #553000">trpallettraceCB</span>.query().set...
     *         <span style="color: #553000">trpallettraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trpallettraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trpallettraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrpallettraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrpallettrace> loadTTrpallettraceList(ConditionBeanSetupper<TTrpallettraceCB> refCBLambda) {
        myBhv().loadTTrpallettraceList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrpallettraceList = refLs);
        return hd -> hd.handle(new LoaderOfTTrpallettrace().ready(_referrerTTrpallettraceList, _selector));
    }

    protected List<TTrreversestock> _referrerTTrreversestockList;

    /**
     * Load referrer of TTrreversestockList by the set-upper of referrer. <br>
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrreversestockList</span>(<span style="color: #553000">trreversestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trreversestockCB</span>.setupSelect...
     *         <span style="color: #553000">trreversestockCB</span>.query().set...
     *         <span style="color: #553000">trreversestockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trreversestockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trreversestockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrreversestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrreversestock> loadTTrreversestockList(ConditionBeanSetupper<TTrreversestockCB> refCBLambda) {
        myBhv().loadTTrreversestockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrreversestockList = refLs);
        return hd -> hd.handle(new LoaderOfTTrreversestock().ready(_referrerTTrreversestockList, _selector));
    }

    protected List<TTrstockdiffhistory> _referrerTTrstockdiffhistoryList;

    /**
     * Load referrer of TTrstockdiffhistoryList by the set-upper of referrer. <br>
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrstockdiffhistoryList</span>(<span style="color: #553000">trstockdiffhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.query().set...
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trstockdiffhistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trstockdiffhistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrstockdiffhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrstockdiffhistory> loadTTrstockdiffhistoryList(ConditionBeanSetupper<TTrstockdiffhistoryCB> refCBLambda) {
        myBhv().loadTTrstockdiffhistoryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrstockdiffhistoryList = refLs);
        return hd -> hd.handle(new LoaderOfTTrstockdiffhistory().ready(_referrerTTrstockdiffhistoryList, _selector));
    }

    protected List<TTrsymboltrace> _referrerTTrsymboltraceList;

    /**
     * Load referrer of TTrsymboltraceList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrsymboltraceList</span>(<span style="color: #553000">trsymboltraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trsymboltraceCB</span>.setupSelect...
     *         <span style="color: #553000">trsymboltraceCB</span>.query().set...
     *         <span style="color: #553000">trsymboltraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trsymboltraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trsymboltraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrsymboltraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrsymboltrace> loadTTrsymboltraceList(ConditionBeanSetupper<TTrsymboltraceCB> refCBLambda) {
        myBhv().loadTTrsymboltraceList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrsymboltraceList = refLs);
        return hd -> hd.handle(new LoaderOfTTrsymboltrace().ready(_referrerTTrsymboltraceList, _selector));
    }

    protected List<TTrsymboltraceextend> _referrerTTrsymboltraceextendList;

    /**
     * Load referrer of TTrsymboltraceextendList by the set-upper of referrer. <br>
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrsymboltraceextendList</span>(<span style="color: #553000">trsymboltraceextendCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trsymboltraceextendCB</span>.setupSelect...
     *         <span style="color: #553000">trsymboltraceextendCB</span>.query().set...
     *         <span style="color: #553000">trsymboltraceextendCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trsymboltraceextendLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trsymboltraceextendLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrsymboltraceextendList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrsymboltraceextend> loadTTrsymboltraceextendList(ConditionBeanSetupper<TTrsymboltraceextendCB> refCBLambda) {
        myBhv().loadTTrsymboltraceextendList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrsymboltraceextendList = refLs);
        return hd -> hd.handle(new LoaderOfTTrsymboltraceextend().ready(_referrerTTrsymboltraceextendList, _selector));
    }

    protected List<TTrtrace> _referrerTTrtraceList;

    /**
     * Load referrer of TTrtraceList by the set-upper of referrer. <br>
     * T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTTrtraceList</span>(<span style="color: #553000">trtraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trtraceCB</span>.setupSelect...
     *         <span style="color: #553000">trtraceCB</span>.query().set...
     *         <span style="color: #553000">trtraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trtraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trtraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTTrtraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrtrace> loadTTrtraceList(ConditionBeanSetupper<TTrtraceCB> refCBLambda) {
        myBhv().loadTTrtraceList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrtraceList = refLs);
        return hd -> hd.handle(new LoaderOfTTrtrace().ready(_referrerTTrtraceList, _selector));
    }

    protected List<TYtrso> _referrerTYtrsoList;

    /**
     * Load referrer of TYtrsoList by the set-upper of referrer. <br>
     * T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTYtrsoList</span>(<span style="color: #553000">ytrsoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ytrsoCB</span>.setupSelect...
     *         <span style="color: #553000">ytrsoCB</span>.query().set...
     *         <span style="color: #553000">ytrsoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ytrsoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ytrsoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTYtrsoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTYtrso> loadTYtrsoList(ConditionBeanSetupper<TYtrsoCB> refCBLambda) {
        myBhv().loadTYtrsoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTYtrsoList = refLs);
        return hd -> hd.handle(new LoaderOfTYtrso().ready(_referrerTYtrsoList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtLoading> _referrerWHtLoadingList;

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loadingCB</span>.setupSelect...
     *         <span style="color: #553000">loadingCB</span>.query().set...
     *         <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loadingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loadingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtLoading> loadWHtLoadingList(ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        myBhv().loadWHtLoadingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtLoadingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtLoading().ready(_referrerWHtLoadingList, _selector));
    }

    protected List<WHtReceiveInspection> _referrerWHtReceiveInspectionList;

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveInspection> loadWHtReceiveInspectionList(ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        myBhv().loadWHtReceiveInspectionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveInspectionList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveInspection().ready(_referrerWHtReceiveInspectionList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspList;

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspList, _selector));
    }

    protected List<WHtReceiveStore> _referrerWHtReceiveStoreList;

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    protected List<WHtSerialReceiveInsp> _referrerWHtSerialReceiveInspList;

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtSerialReceiveInsp> loadWHtSerialReceiveInspList(ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        myBhv().loadWHtSerialReceiveInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtSerialReceiveInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtSerialReceiveInsp().ready(_referrerWHtSerialReceiveInspList, _selector));
    }

    protected List<WHtSerialShippingInsp> _referrerWHtSerialShippingInspList;

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtSerialShippingInsp> loadWHtSerialShippingInspList(ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        myBhv().loadWHtSerialShippingInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtSerialShippingInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtSerialShippingInsp().ready(_referrerWHtSerialShippingInspList, _selector));
    }

    protected List<WHtShipping> _referrerWHtShippingList;

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShipping> loadWHtShippingList(ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        myBhv().loadWHtShippingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShipping().ready(_referrerWHtShippingList, _selector));
    }

    protected List<WHtShippingPicking> _referrerWHtShippingPickingList;

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShippingPicking> loadWHtShippingPickingList(ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        myBhv().loadWHtShippingPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShippingPicking().ready(_referrerWHtShippingPickingList, _selector));
    }

    protected List<WSglRowShipInspH> _referrerWSglRowShipInspHList;

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspH> loadWSglRowShipInspHList(ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        myBhv().loadWSglRowShipInspHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspHList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspH().ready(_referrerWSglRowShipInspHList, _selector));
    }

    protected List<WShippingInterrupt> _referrerWShippingInterruptList;

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWShippingInterrupt> loadWShippingInterruptList(ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        myBhv().loadWShippingInterruptList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWShippingInterruptList = refLs);
        return hd -> hd.handle(new LoaderOfWShippingInterrupt().ready(_referrerWShippingInterruptList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBTimeZone _foreignBTimeZoneLoader;
    public LoaderOfBTimeZone pulloutBTimeZone() {
        if (_foreignBTimeZoneLoader == null)
        { _foreignBTimeZoneLoader = new LoaderOfBTimeZone().ready(myBhv().pulloutBTimeZone(_selectedList), _selector); }
        return _foreignBTimeZoneLoader;
    }

    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
