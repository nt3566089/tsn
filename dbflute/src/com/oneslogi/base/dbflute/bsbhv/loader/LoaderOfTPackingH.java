package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_PACKING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PACKING_STATUS, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, BOX_ID, GROSS_WEIGHT, TOTAL_VOLUME, MIXED_FLG, MULTI_PIC_FLG, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO, SEEDING_NO, LOADING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_H, M_BOX, M_CENTER, M_CLIENT, T_PICKING_H, M_PROCESS_TYPE, B_USER(ByUpdUser), B_CLASS_DTL(ByLoadingFlg), T_PACKING_R(AsOne)
 *
 * [referrer table]
 *     T_PACKING_B, T_PIC_MTHD_RCMD_CART, T_PACKING_R
 *
 * [foreign property]
 *     tAllocInstH, mBox, mCenter, mClient, tPickingH, mProcessType, bUserByUpdUser, bClassDtlByLoadingFlg, bClassDtlByMixedFlg, bClassDtlByMultiPicFlg, bClassDtlByPackingStatus, tPackingRAsOne
 *
 * [referrer property]
 *     tPackingBList, tPicMthdRcmdCartList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPackingH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPackingH> _selectedList;
    protected BehaviorSelector _selector;
    protected TPackingHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPackingH ready(List<TPackingH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPackingHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPackingHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPackingB> _referrerTPackingBList;

    /**
     * Load referrer of TPackingBList by the set-upper of referrer. <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPackingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPackingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPackingH tPackingH : <span style="color: #553000">tPackingHList</span>) {
     *     ... = tPackingH.<span style="color: #CC4747">getTPackingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingB> loadTPackingBList(ConditionBeanSetupper<TPackingBCB> refCBLambda) {
        myBhv().loadTPackingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingB().ready(_referrerTPackingBList, _selector));
    }

    protected List<TPicMthdRcmdCart> _referrerTPicMthdRcmdCartList;

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPackingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPackingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cartCB</span>.setupSelect...
     *         <span style="color: #553000">cartCB</span>.query().set...
     *         <span style="color: #553000">cartCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cartLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cartLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPackingH tPackingH : <span style="color: #553000">tPackingHList</span>) {
     *     ... = tPackingH.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingHId_InScope(pkList);
     * cb.query().addOrderBy_PackingHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmdCart> loadTPicMthdRcmdCartList(ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdCartList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdCartList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmdCart().ready(_referrerTPicMthdRcmdCartList, _selector));
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

    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
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

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfBUser _foreignBUserByUpdUserLoader;
    public LoaderOfBUser pulloutBUserByUpdUser() {
        if (_foreignBUserByUpdUserLoader == null)
        { _foreignBUserByUpdUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByUpdUser(_selectedList), _selector); }
        return _foreignBUserByUpdUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLoadingFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLoadingFlg() {
        if (_foreignBClassDtlByLoadingFlgLoader == null)
        { _foreignBClassDtlByLoadingFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLoadingFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLoadingFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMixedFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMixedFlg() {
        if (_foreignBClassDtlByMixedFlgLoader == null)
        { _foreignBClassDtlByMixedFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMixedFlg(_selectedList), _selector); }
        return _foreignBClassDtlByMixedFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMultiPicFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMultiPicFlg() {
        if (_foreignBClassDtlByMultiPicFlgLoader == null)
        { _foreignBClassDtlByMultiPicFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMultiPicFlg(_selectedList), _selector); }
        return _foreignBClassDtlByMultiPicFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingStatus() {
        if (_foreignBClassDtlByPackingStatusLoader == null)
        { _foreignBClassDtlByPackingStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingStatus(_selectedList), _selector); }
        return _foreignBClassDtlByPackingStatusLoader;
    }

    protected LoaderOfTPackingR _foreignTPackingRAsOneLoader;
    public LoaderOfTPackingR pulloutTPackingRAsOne() {
        if (_foreignTPackingRAsOneLoader == null)
        { _foreignTPackingRAsOneLoader = new LoaderOfTPackingR().ready(myBhv().pulloutTPackingRAsOne(_selectedList), _selector); }
        return _foreignTPackingRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPackingH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
