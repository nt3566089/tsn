package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_PICKING_H as TABLE. <br>
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
 *     T_ALLOC_INST_H, M_CENTER, M_CLIENT, M_PROCESS_TYPE, B_CLASS_DTL(ByCenterTransitFlg), T_PICKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_H, T_PICKING_B, T_PIC_MTHD_RCMD_DATA, T_RECEIVE_PLAN_H, W_SGL_ROW_SHIP_INSP_B, T_PICKING_R
 *
 * [foreign property]
 *     tAllocInstH, mCenter, mClient, mProcessType, bClassDtlByCenterTransitFlg, bClassDtlByForceFixedFlg, bClassDtlByPackingCalCls, bClassDtlByPickingStatus, bClassDtlBySglRowPicFlg, tPickingRAsOne
 *
 * [referrer property]
 *     tPackingHList, tPickingBList, tPicMthdRcmdDataList, tReceivePlanHList, wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPickingH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPickingH> _selectedList;
    protected BehaviorSelector _selector;
    protected TPickingHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPickingH ready(List<TPickingH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPickingHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPickingHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPackingH> _referrerTPackingHList;

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by PICKING_H_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * T_PICKING_B by PICKING_H_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TPicMthdRcmdData> _referrerTPicMthdRcmdDataList;

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PICKING_H_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dataCB</span>.setupSelect...
     *         <span style="color: #553000">dataCB</span>.query().set...
     *         <span style="color: #553000">dataCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dataLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dataLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmdData> loadTPicMthdRcmdDataList(ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdDataList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdDataList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmdData().ready(_referrerTPicMthdRcmdDataList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHList;

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_H by PICKING_H_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHList, _selector));
    }

    protected List<WSglRowShipInspB> _referrerWSglRowShipInspBList;

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by PICKING_H_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">tPickingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPickingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPickingH tPickingH : <span style="color: #553000">tPickingHList</span>) {
     *     ... = tPickingH.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPickingHId_InScope(pkList);
     * cb.query().addOrderBy_PickingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspB> loadWSglRowShipInspBList(ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        myBhv().loadWSglRowShipInspBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspBList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspB().ready(_referrerWSglRowShipInspBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTAllocInstH _foreignTAllocInstHLoader;
    public LoaderOfTAllocInstH pulloutTAllocInstH() {
        if (_foreignTAllocInstHLoader == null)
        { _foreignTAllocInstHLoader = new LoaderOfTAllocInstH().ready(myBhv().pulloutTAllocInstH(_selectedList), _selector); }
        return _foreignTAllocInstHLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCenterTransitFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCenterTransitFlg() {
        if (_foreignBClassDtlByCenterTransitFlgLoader == null)
        { _foreignBClassDtlByCenterTransitFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCenterTransitFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCenterTransitFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByForceFixedFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByForceFixedFlg() {
        if (_foreignBClassDtlByForceFixedFlgLoader == null)
        { _foreignBClassDtlByForceFixedFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByForceFixedFlg(_selectedList), _selector); }
        return _foreignBClassDtlByForceFixedFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingCalClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingCalCls() {
        if (_foreignBClassDtlByPackingCalClsLoader == null)
        { _foreignBClassDtlByPackingCalClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingCalCls(_selectedList), _selector); }
        return _foreignBClassDtlByPackingCalClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPickingStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPickingStatus() {
        if (_foreignBClassDtlByPickingStatusLoader == null)
        { _foreignBClassDtlByPickingStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPickingStatus(_selectedList), _selector); }
        return _foreignBClassDtlByPickingStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySglRowPicFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySglRowPicFlg() {
        if (_foreignBClassDtlBySglRowPicFlgLoader == null)
        { _foreignBClassDtlBySglRowPicFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySglRowPicFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySglRowPicFlgLoader;
    }

    protected LoaderOfTPickingR _foreignTPickingRAsOneLoader;
    public LoaderOfTPickingR pulloutTPickingRAsOne() {
        if (_foreignTPickingRAsOneLoader == null)
        { _foreignTPickingRAsOneLoader = new LoaderOfTPickingR().ready(myBhv().pulloutTPickingRAsOne(_selectedList), _selector); }
        return _foreignTPickingRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPickingH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
