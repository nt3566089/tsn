package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_BOX as TABLE. <br>
 * <pre>
 * [primary key]
 *     BOX_ID
 *
 * [column]
 *     BOX_ID, CENTER_ID, BOX_CD, BOX_NM, LENGTH, WIDTH, HEIGHT, VOLUME, VOLUME_RATE, PERMIT_VOLUME, PERMIT_WEIGHT, BOX_TYPE, BXOSZL, BXOSZW, BXOSZH, BXWEIGHT, bxcpy, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP, M_BOX_GRP_DTL, M_CARRIER_BOX, M_PARAM, T_PACKING_H, W_HT_SHIPPING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpList, mBoxGrpDtlList, mCarrierBoxList, mParamList, tPackingHList, wHtShippingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMBox {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MBox> _selectedList;
    protected BehaviorSelector _selector;
    protected MBoxBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMBox ready(List<MBox> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MBoxBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MBoxBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MBoxGrp> _referrerMBoxGrpList;

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStandardBoxId_InScope(pkList);
     * cb.query().addOrderBy_StandardBoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBoxGrp> loadMBoxGrpList(ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        myBhv().loadMBoxGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMBoxGrp().ready(_referrerMBoxGrpList, _selector));
    }

    protected List<MBoxGrpDtl> _referrerMBoxGrpDtlList;

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBoxGrpDtl> loadMBoxGrpDtlList(ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        myBhv().loadMBoxGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfMBoxGrpDtl().ready(_referrerMBoxGrpDtlList, _selector));
    }

    protected List<MCarrierBox> _referrerMCarrierBoxList;

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">boxCB</span>.setupSelect...
     *         <span style="color: #553000">boxCB</span>.query().set...
     *         <span style="color: #553000">boxCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">boxLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    boxLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierBox> loadMCarrierBoxList(ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        myBhv().loadMCarrierBoxList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierBoxList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierBox().ready(_referrerMCarrierBoxList, _selector));
    }

    protected List<MParam> _referrerMParamList;

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">paramCB</span>.setupSelect...
     *         <span style="color: #553000">paramCB</span>.query().set...
     *         <span style="color: #553000">paramCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">paramLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    paramLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDefaultBoxId_InScope(pkList);
     * cb.query().addOrderBy_DefaultBoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMParam> loadMParamList(ConditionBeanSetupper<MParamCB> refCBLambda) {
        myBhv().loadMParamList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMParamList = refLs);
        return hd -> hd.handle(new LoaderOfMParam().ready(_referrerMParamList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHList;

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<WHtShipping> _referrerWHtShippingList;

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShipping> loadWHtShippingList(ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        myBhv().loadWHtShippingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShipping().ready(_referrerWHtShippingList, _selector));
    }

    protected List<WSglRowShipInspH> _referrerWSglRowShipInspHList;

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
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
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
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
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
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
    public List<MBox> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
