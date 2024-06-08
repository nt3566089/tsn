package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_COMMON_CARRIER as TABLE. <br>
 * <pre>
 * [primary key]
 *     COMMON_CARRIER_ID
 *
 * [column]
 *     COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, ARRIVAL_STORE_BARCODE, ARRIVAL_STORE_START_BIT, ARRIVAL_STORE_END_BIT, ARRIVAL_STORE_FORMAT, TRACKING_BARCODE, TRACKING_START_BIT, TRACKING_END_BIT, BOL_OUTPUT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMON_CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByArrivalStoreFormat)
 *
 * [referrer table]
 *     M_CARRIER, M_CARRIER_ZIP
 *
 * [foreign property]
 *     bClassDtlByArrivalStoreFormat, bClassDtlByBolOutputTargetFlg
 *
 * [referrer property]
 *     mCarrierList, mCarrierZipList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCommonCarrier {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCommonCarrier> _selectedList;
    protected BehaviorSelector _selector;
    protected MCommonCarrierBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCommonCarrier ready(List<MCommonCarrier> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCommonCarrierBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCommonCarrierBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCarrier> _referrerMCarrierList;

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCommonCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCommonCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">carrierCB</span>.setupSelect...
     *         <span style="color: #553000">carrierCB</span>.query().set...
     *         <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">carrierLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    carrierLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCommonCarrier mCommonCarrier : <span style="color: #553000">mCommonCarrierList</span>) {
     *     ... = mCommonCarrier.<span style="color: #CC4747">getMCarrierList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCommonCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CommonCarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrier> loadMCarrierList(ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        myBhv().loadMCarrierList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrier().ready(_referrerMCarrierList, _selector));
    }

    protected List<MCarrierZip> _referrerMCarrierZipList;

    /**
     * Load referrer of MCarrierZipList by the set-upper of referrer. <br>
     * M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipList'.
     * <pre>
     * <span style="color: #0000C0">mCommonCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCommonCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierZipList</span>(<span style="color: #553000">zipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">zipCB</span>.setupSelect...
     *         <span style="color: #553000">zipCB</span>.query().set...
     *         <span style="color: #553000">zipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">zipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    zipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCommonCarrier mCommonCarrier : <span style="color: #553000">mCommonCarrierList</span>) {
     *     ... = mCommonCarrier.<span style="color: #CC4747">getMCarrierZipList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCommonCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CommonCarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierZip> loadMCarrierZipList(ConditionBeanSetupper<MCarrierZipCB> refCBLambda) {
        myBhv().loadMCarrierZipList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierZipList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierZip().ready(_referrerMCarrierZipList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByArrivalStoreFormatLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByArrivalStoreFormat() {
        if (_foreignBClassDtlByArrivalStoreFormatLoader == null)
        { _foreignBClassDtlByArrivalStoreFormatLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByArrivalStoreFormat(_selectedList), _selector); }
        return _foreignBClassDtlByArrivalStoreFormatLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByBolOutputTargetFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByBolOutputTargetFlg() {
        if (_foreignBClassDtlByBolOutputTargetFlgLoader == null)
        { _foreignBClassDtlByBolOutputTargetFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByBolOutputTargetFlg(_selectedList), _selector); }
        return _foreignBClassDtlByBolOutputTargetFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCommonCarrier> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
