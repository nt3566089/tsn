package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CLIENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_ID
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CUSTOMER_ID, SHAPE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, M_SHAPE_GRP, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_CBRCTG, M_CDRCATT, M_CLIENT_CENTER, M_CLIENT_COL, M_CLIENT_ITEM, M_CLIENT_SCREEN, M_CUSTOMER, M_IMPORT_TYPE, M_MFINVOPERATION, M_MFMONTHCHG, M_MFPICKCTL, M_MFRCVDESIGN, M_MFRCVITEM, M_MFWHxITEM, M_PRODUCT, M_SHAPE_GRP, M_USER_CLIENT, M_USER_LOGIN, M_WEB_HT_INFO, T_ALLOC_INST_H, T_CCOPAM, T_CENTER_SYMBOL, T_CORDHDR, T_EC_ORDER_H, T_INVENTORY_H, T_MFLASTSHIPLOT, T_MOVE_INST_H, T_PACKING_H, T_PALLET, T_PICKING_H, T_PIC_MTHD_RCMD, T_RECEIVE_PLAN_H, T_SERIAL_NO, T_SHIPPING_INST_H, T_SPLINFO, T_STOCK, T_STORE_RECORD_H, T_TRALLINV, T_TRALLINVHISTORY, T_TRCASEINVENTORY, T_TRCASENUM, T_TRCASESTOCK, T_TRHANBAIINV, T_TRINVCHECKINFO, T_TRINVCORRECT, T_TRINVREANSWER, T_TRINVREQUEST, T_TRITEMCONVRESULT, T_TRJUKYUINV, T_TRMANUFACTUREDATE, T_TRMANUFACTUREDATEDETAIL, T_TRMANUFACTUREDATEHISTORY, T_TRPALLETTRACE, T_TRREVERSESTOCK, T_TRSTOCKDIFFHISTORY, T_TRSYMBOLTRACE, T_TRSYMBOLTRACEEXTEND, T_TRTRACE, T_YTRSO, W_HT_INVENTORY_INPUT_PROD, W_HT_LOADING, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SERIAL_RECEIVE_INSP, W_HT_SERIAL_SHIPPING_INSP, W_HT_SHIPPING, W_HT_SHIPPING_PICKING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     mCustomer, mShapeGrp, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mCbrctgList, mCdrcattList, mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mMfinvoperationList, mMfmonthchgList, mMfpickctlList, mMfrcvdesignList, mMfrcvitemList, mMfwhxitemList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tCcopamList, tCenterSymbolList, tCordhdrList, tEcOrderHList, tInventoryHList, tMflastshiplotList, tMoveInstHList, tPackingHList, tPalletList, tPickingHList, tPicMthdRcmdList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tSplinfoList, tStockList, tStoreRecordHList, tTrallinvList, tTrallinvhistoryList, tTrcaseinventoryList, tTrcasenumList, tTrcasestockList, tTrhanbaiinvList, tTrinvcheckinfoList, tTrinvcorrectList, tTrinvreanswerList, tTrinvrequestList, tTritemconvresultList, tTrjukyuinvList, tTrmanufacturedateList, tTrmanufacturedatedetailList, tTrmanufacturedatehistoryList, tTrpallettraceList, tTrreversestockList, tTrstockdiffhistoryList, tTrsymboltraceList, tTrsymboltraceextendList, tTrtraceList, tYtrsoList, wHtInventoryInputProdList, wHtLoadingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMClient {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClient> _selectedList;
    protected BehaviorSelector _selector;
    protected MClientBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClient ready(List<MClient> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClientBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClientBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCbrctg> _referrerMCbrctgList;

    /**
     * Load referrer of MCbrctgList by the set-upper of referrer. <br>
     * M_CBRCTG by CLIENT_ID, named 'MCbrctgList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMCbrctgList</span>(<span style="color: #553000">cbrctgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cbrctgCB</span>.setupSelect...
     *         <span style="color: #553000">cbrctgCB</span>.query().set...
     *         <span style="color: #553000">cbrctgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cbrctgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cbrctgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMCbrctgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * M_CDRCATT by CLIENT_ID, named 'MCdrcattList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMCdrcattList</span>(<span style="color: #553000">cdrcattCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cdrcattCB</span>.setupSelect...
     *         <span style="color: #553000">cdrcattCB</span>.query().set...
     *         <span style="color: #553000">cdrcattCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cdrcattLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cdrcattLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMCdrcattList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCdrcatt> loadMCdrcattList(ConditionBeanSetupper<MCdrcattCB> refCBLambda) {
        myBhv().loadMCdrcattList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCdrcattList = refLs);
        return hd -> hd.handle(new LoaderOfMCdrcatt().ready(_referrerMCdrcattList, _selector));
    }

    protected List<MClientCenter> _referrerMClientCenterList;

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCenter> loadMClientCenterList(ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        myBhv().loadMClientCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCenter().ready(_referrerMClientCenterList, _selector));
    }

    protected List<MClientCol> _referrerMClientColList;

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by CLIENT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCol> loadMClientColList(ConditionBeanSetupper<MClientColCB> refCBLambda) {
        myBhv().loadMClientColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientColList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCol().ready(_referrerMClientColList, _selector));
    }

    protected List<MClientItem> _referrerMClientItemList;

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientItem> loadMClientItemList(ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        myBhv().loadMClientItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientItemList = refLs);
        return hd -> hd.handle(new LoaderOfMClientItem().ready(_referrerMClientItemList, _selector));
    }

    protected List<MClientScreen> _referrerMClientScreenList;

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientScreen> loadMClientScreenList(ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        myBhv().loadMClientScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMClientScreen().ready(_referrerMClientScreenList, _selector));
    }

    protected List<MCustomer> _referrerMCustomerList;

    /**
     * Load referrer of MCustomerList by the set-upper of referrer. <br>
     * M_CUSTOMER by CLIENT_ID, named 'MCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomer> loadMCustomerList(ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        myBhv().loadMCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomer().ready(_referrerMCustomerList, _selector));
    }

    protected List<MImportType> _referrerMImportTypeList;

    /**
     * Load referrer of MImportTypeList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMImportTypeList</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMImportTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportType> loadMImportTypeList(ConditionBeanSetupper<MImportTypeCB> refCBLambda) {
        myBhv().loadMImportTypeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeList = refLs);
        return hd -> hd.handle(new LoaderOfMImportType().ready(_referrerMImportTypeList, _selector));
    }

    protected List<MMfinvoperation> _referrerMMfinvoperationList;

    /**
     * Load referrer of MMfinvoperationList by the set-upper of referrer. <br>
     * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfinvoperationList</span>(<span style="color: #553000">mfinvoperationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfinvoperationCB</span>.setupSelect...
     *         <span style="color: #553000">mfinvoperationCB</span>.query().set...
     *         <span style="color: #553000">mfinvoperationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfinvoperationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfinvoperationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfinvoperationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfmonthchgList</span>(<span style="color: #553000">mfmonthchgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfmonthchgCB</span>.setupSelect...
     *         <span style="color: #553000">mfmonthchgCB</span>.query().set...
     *         <span style="color: #553000">mfmonthchgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfmonthchgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfmonthchgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfmonthchgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfmonthchg> loadMMfmonthchgList(ConditionBeanSetupper<MMfmonthchgCB> refCBLambda) {
        myBhv().loadMMfmonthchgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfmonthchgList = refLs);
        return hd -> hd.handle(new LoaderOfMMfmonthchg().ready(_referrerMMfmonthchgList, _selector));
    }

    protected List<MMfpickctl> _referrerMMfpickctlList;

    /**
     * Load referrer of MMfpickctlList by the set-upper of referrer. <br>
     * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfpickctlList</span>(<span style="color: #553000">mfpickctlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfpickctlCB</span>.setupSelect...
     *         <span style="color: #553000">mfpickctlCB</span>.query().set...
     *         <span style="color: #553000">mfpickctlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfpickctlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfpickctlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfpickctlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfpickctl> loadMMfpickctlList(ConditionBeanSetupper<MMfpickctlCB> refCBLambda) {
        myBhv().loadMMfpickctlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfpickctlList = refLs);
        return hd -> hd.handle(new LoaderOfMMfpickctl().ready(_referrerMMfpickctlList, _selector));
    }

    protected List<MMfrcvdesign> _referrerMMfrcvdesignList;

    /**
     * Load referrer of MMfrcvdesignList by the set-upper of referrer. <br>
     * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfrcvdesignList</span>(<span style="color: #553000">mfrcvdesignCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfrcvdesignCB</span>.setupSelect...
     *         <span style="color: #553000">mfrcvdesignCB</span>.query().set...
     *         <span style="color: #553000">mfrcvdesignCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfrcvdesignLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfrcvdesignLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfrcvdesignList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfrcvdesign> loadMMfrcvdesignList(ConditionBeanSetupper<MMfrcvdesignCB> refCBLambda) {
        myBhv().loadMMfrcvdesignList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfrcvdesignList = refLs);
        return hd -> hd.handle(new LoaderOfMMfrcvdesign().ready(_referrerMMfrcvdesignList, _selector));
    }

    protected List<MMfrcvitem> _referrerMMfrcvitemList;

    /**
     * Load referrer of MMfrcvitemList by the set-upper of referrer. <br>
     * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfrcvitemList</span>(<span style="color: #553000">mfrcvitemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mfrcvitemCB</span>.setupSelect...
     *         <span style="color: #553000">mfrcvitemCB</span>.query().set...
     *         <span style="color: #553000">mfrcvitemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mfrcvitemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mfrcvitemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfrcvitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfrcvitem> loadMMfrcvitemList(ConditionBeanSetupper<MMfrcvitemCB> refCBLambda) {
        myBhv().loadMMfrcvitemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfrcvitemList = refLs);
        return hd -> hd.handle(new LoaderOfMMfrcvitem().ready(_referrerMMfrcvitemList, _selector));
    }

    protected List<MMfwhxitem> _referrerMMfwhxitemList;

    /**
     * Load referrer of MMfwhxitemList by the set-upper of referrer. <br>
     * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMMfwhxitemList</span>(<span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">entityCB</span>.setupSelect...
     *         <span style="color: #553000">entityCB</span>.query().set...
     *         <span style="color: #553000">entityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">entityLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    entityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMMfwhxitemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMMfwhxitem> loadMMfwhxitemList(ConditionBeanSetupper<MMfwhxitemCB> refCBLambda) {
        myBhv().loadMMfwhxitemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMMfwhxitemList = refLs);
        return hd -> hd.handle(new LoaderOfMMfwhxitem().ready(_referrerMMfwhxitemList, _selector));
    }

    protected List<MProduct> _referrerMProductList;

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * M_PRODUCT by CLIENT_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProduct> loadMProductList(ConditionBeanSetupper<MProductCB> refCBLambda) {
        myBhv().loadMProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductList = refLs);
        return hd -> hd.handle(new LoaderOfMProduct().ready(_referrerMProductList, _selector));
    }

    protected List<MShapeGrp> _referrerMShapeGrpList;

    /**
     * Load referrer of MShapeGrpList by the set-upper of referrer. <br>
     * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMShapeGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMShapeGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShapeGrp> loadMShapeGrpList(ConditionBeanSetupper<MShapeGrpCB> refCBLambda) {
        myBhv().loadMShapeGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMShapeGrp().ready(_referrerMShapeGrpList, _selector));
    }

    protected List<MUserClient> _referrerMUserClientList;

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserClient> loadMUserClientList(ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        myBhv().loadMUserClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserClientList = refLs);
        return hd -> hd.handle(new LoaderOfMUserClient().ready(_referrerMUserClientList, _selector));
    }

    protected List<MUserLogin> _referrerMUserLoginList;

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserLogin> loadMUserLoginList(ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        myBhv().loadMUserLoginList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserLoginList = refLs);
        return hd -> hd.handle(new LoaderOfMUserLogin().ready(_referrerMUserLoginList, _selector));
    }

    protected List<MWebHtInfo> _referrerMWebHtInfoList;

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_CCOPAM by CLIENT_ID, named 'TCcopamList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTCcopamList</span>(<span style="color: #553000">ccopamCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ccopamCB</span>.setupSelect...
     *         <span style="color: #553000">ccopamCB</span>.query().set...
     *         <span style="color: #553000">ccopamCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ccopamLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ccopamLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTCcopamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">symbolCB</span>.setupSelect...
     *         <span style="color: #553000">symbolCB</span>.query().set...
     *         <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">symbolLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    symbolLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_CORDHDR by CLIENT_ID, named 'TCordhdrList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTCordhdrList</span>(<span style="color: #553000">cordhdrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cordhdrCB</span>.setupSelect...
     *         <span style="color: #553000">cordhdrCB</span>.query().set...
     *         <span style="color: #553000">cordhdrCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cordhdrLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cordhdrLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTCordhdrList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTCordhdr> loadTCordhdrList(ConditionBeanSetupper<TCordhdrCB> refCBLambda) {
        myBhv().loadTCordhdrList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTCordhdrList = refLs);
        return hd -> hd.handle(new LoaderOfTCordhdr().ready(_referrerTCordhdrList, _selector));
    }

    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTMflastshiplotList</span>(<span style="color: #553000">mflastshiplotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mflastshiplotCB</span>.setupSelect...
     *         <span style="color: #553000">mflastshiplotCB</span>.query().set...
     *         <span style="color: #553000">mflastshiplotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mflastshiplotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mflastshiplotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTMflastshiplotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_PACKING_H by CLIENT_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_PALLET by CLIENT_ID, named 'TPalletList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPalletList</span>(<span style="color: #553000">palletCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">palletCB</span>.setupSelect...
     *         <span style="color: #553000">palletCB</span>.query().set...
     *         <span style="color: #553000">palletCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">palletLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    palletLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPalletList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_PICKING_H by CLIENT_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rcmdCB</span>.setupSelect...
     *         <span style="color: #553000">rcmdCB</span>.query().set...
     *         <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rcmdLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rcmdLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_SPLINFO by CLIENT_ID, named 'TSplinfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTSplinfoList</span>(<span style="color: #553000">splinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">splinfoCB</span>.setupSelect...
     *         <span style="color: #553000">splinfoCB</span>.query().set...
     *         <span style="color: #553000">splinfoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">splinfoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    splinfoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTSplinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSplinfo> loadTSplinfoList(ConditionBeanSetupper<TSplinfoCB> refCBLambda) {
        myBhv().loadTSplinfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSplinfoList = refLs);
        return hd -> hd.handle(new LoaderOfTSplinfo().ready(_referrerTSplinfoList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * T_STOCK by CLIENT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRALLINV by CLIENT_ID, named 'TTrallinvList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrallinvList</span>(<span style="color: #553000">trallinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trallinvCB</span>.setupSelect...
     *         <span style="color: #553000">trallinvCB</span>.query().set...
     *         <span style="color: #553000">trallinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trallinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trallinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrallinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrallinvhistoryList</span>(<span style="color: #553000">trallinvhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trallinvhistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trallinvhistoryCB</span>.query().set...
     *         <span style="color: #553000">trallinvhistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trallinvhistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trallinvhistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrallinvhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrcaseinventoryList</span>(<span style="color: #553000">trcaseinventoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcaseinventoryCB</span>.setupSelect...
     *         <span style="color: #553000">trcaseinventoryCB</span>.query().set...
     *         <span style="color: #553000">trcaseinventoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcaseinventoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcaseinventoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrcaseinventoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrcasenumList</span>(<span style="color: #553000">trcasenumCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcasenumCB</span>.setupSelect...
     *         <span style="color: #553000">trcasenumCB</span>.query().set...
     *         <span style="color: #553000">trcasenumCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcasenumLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcasenumLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrcasenumList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrcasestockList</span>(<span style="color: #553000">trcasestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trcasestockCB</span>.setupSelect...
     *         <span style="color: #553000">trcasestockCB</span>.query().set...
     *         <span style="color: #553000">trcasestockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trcasestockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trcasestockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrcasestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrhanbaiinvList</span>(<span style="color: #553000">trhanbaiinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trhanbaiinvCB</span>.setupSelect...
     *         <span style="color: #553000">trhanbaiinvCB</span>.query().set...
     *         <span style="color: #553000">trhanbaiinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trhanbaiinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trhanbaiinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrhanbaiinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrinvcheckinfoList</span>(<span style="color: #553000">trinvcheckinfoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvcheckinfoCB</span>.setupSelect...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().set...
     *         <span style="color: #553000">trinvcheckinfoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvcheckinfoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvcheckinfoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrinvcheckinfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrinvcorrectList</span>(<span style="color: #553000">trinvcorrectCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvcorrectCB</span>.setupSelect...
     *         <span style="color: #553000">trinvcorrectCB</span>.query().set...
     *         <span style="color: #553000">trinvcorrectCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvcorrectLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvcorrectLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrinvcorrectList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrinvreanswerList</span>(<span style="color: #553000">trinvreanswerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvreanswerCB</span>.setupSelect...
     *         <span style="color: #553000">trinvreanswerCB</span>.query().set...
     *         <span style="color: #553000">trinvreanswerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvreanswerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvreanswerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrinvreanswerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrinvrequestList</span>(<span style="color: #553000">trinvrequestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trinvrequestCB</span>.setupSelect...
     *         <span style="color: #553000">trinvrequestCB</span>.query().set...
     *         <span style="color: #553000">trinvrequestCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trinvrequestLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trinvrequestLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrinvrequestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTritemconvresultList</span>(<span style="color: #553000">tritemconvresultCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tritemconvresultCB</span>.setupSelect...
     *         <span style="color: #553000">tritemconvresultCB</span>.query().set...
     *         <span style="color: #553000">tritemconvresultCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tritemconvresultLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tritemconvresultLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTritemconvresultList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrjukyuinvList</span>(<span style="color: #553000">trjukyuinvCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trjukyuinvCB</span>.setupSelect...
     *         <span style="color: #553000">trjukyuinvCB</span>.query().set...
     *         <span style="color: #553000">trjukyuinvCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trjukyuinvLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trjukyuinvLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrjukyuinvList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedateList</span>(<span style="color: #553000">trmanufacturedateCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedateCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedateCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedateCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedateLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedateLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrmanufacturedateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedatedetailList</span>(<span style="color: #553000">trmanufacturedatedetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedatedetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedatedetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedatedetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrmanufacturedatedetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrmanufacturedatehistoryList</span>(<span style="color: #553000">trmanufacturedatehistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().set...
     *         <span style="color: #553000">trmanufacturedatehistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trmanufacturedatehistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trmanufacturedatehistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrmanufacturedatehistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrpallettraceList</span>(<span style="color: #553000">trpallettraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trpallettraceCB</span>.setupSelect...
     *         <span style="color: #553000">trpallettraceCB</span>.query().set...
     *         <span style="color: #553000">trpallettraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trpallettraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trpallettraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrpallettraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrreversestockList</span>(<span style="color: #553000">trreversestockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trreversestockCB</span>.setupSelect...
     *         <span style="color: #553000">trreversestockCB</span>.query().set...
     *         <span style="color: #553000">trreversestockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trreversestockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trreversestockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrreversestockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrstockdiffhistoryList</span>(<span style="color: #553000">trstockdiffhistoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.setupSelect...
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.query().set...
     *         <span style="color: #553000">trstockdiffhistoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trstockdiffhistoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trstockdiffhistoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrstockdiffhistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrsymboltraceList</span>(<span style="color: #553000">trsymboltraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trsymboltraceCB</span>.setupSelect...
     *         <span style="color: #553000">trsymboltraceCB</span>.query().set...
     *         <span style="color: #553000">trsymboltraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trsymboltraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trsymboltraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrsymboltraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrsymboltraceextendList</span>(<span style="color: #553000">trsymboltraceextendCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trsymboltraceextendCB</span>.setupSelect...
     *         <span style="color: #553000">trsymboltraceextendCB</span>.query().set...
     *         <span style="color: #553000">trsymboltraceextendCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trsymboltraceextendLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trsymboltraceextendLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrsymboltraceextendList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_TRTRACE by CLIENT_ID, named 'TTrtraceList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTrtraceList</span>(<span style="color: #553000">trtraceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trtraceCB</span>.setupSelect...
     *         <span style="color: #553000">trtraceCB</span>.query().set...
     *         <span style="color: #553000">trtraceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trtraceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trtraceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTrtraceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * T_YTRSO by CLIENT_ID, named 'TYtrsoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTYtrsoList</span>(<span style="color: #553000">ytrsoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ytrsoCB</span>.setupSelect...
     *         <span style="color: #553000">ytrsoCB</span>.query().set...
     *         <span style="color: #553000">ytrsoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ytrsoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ytrsoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTYtrsoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loadingCB</span>.setupSelect...
     *         <span style="color: #553000">loadingCB</span>.query().set...
     *         <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loadingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loadingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMShapeGrp _foreignMShapeGrpLoader;
    public LoaderOfMShapeGrp pulloutMShapeGrp() {
        if (_foreignMShapeGrpLoader == null)
        { _foreignMShapeGrpLoader = new LoaderOfMShapeGrp().ready(myBhv().pulloutMShapeGrp(_selectedList), _selector); }
        return _foreignMShapeGrpLoader;
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
    public List<MClient> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
