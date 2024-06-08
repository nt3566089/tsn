package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_DELIVERY_COURSE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DELIVERY_COURSE_ID
 *
 * [column]
 *     DELIVERY_COURSE_ID, CENTER_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, CARRIER_SLIP_YMT_ID, CARRIER_SLIP_SGW_ID, CARRIER_SLIP_YUPK_ID, TRACKING_NUMBERING_KEY, TRACKING_NUMBERING_AFTER_KEY, TRACKING_NUMBERING_UNIT, TAG_TYPE, TAG_TYPE_AFTER, TAG_DATA_TYPE, PAYMENT_TERM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIVERY_COURSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CARRIER_SLIP_YUPK, M_CENTER, M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, B_CLASS_DTL(ByDelFlg), M_CENTER_CLASS_DTL(ByTagDataType)
 *
 * [referrer table]
 *     M_CENTER_CUSTOMER, M_PARAM, T_ALLOC_INST_H, T_SHIPPING_INST_H, W_HT_LOADING
 *
 * [foreign property]
 *     mCarrierSlipYupk, mCenter, mCarrier, mCarrierSlipSgw, mCarrierSlipYmt, bClassDtlByDelFlg, mCenterClassDtlByTagDataType, mCenterClassDtlByTagType, mCenterClassDtlByTagTypeAfter, bClassDtlByTrackingNumberingUnit, bClassDtlByPaymentTerm
 *
 * [referrer property]
 *     mCenterCustomerList, mParamList, tAllocInstHList, tShippingInstHList, wHtLoadingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMDeliveryCourse {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MDeliveryCourse> _selectedList;
    protected BehaviorSelector _selector;
    protected MDeliveryCourseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMDeliveryCourse ready(List<MDeliveryCourse> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MDeliveryCourseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MDeliveryCourseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCenterCustomer> _referrerMCenterCustomerList;

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCustomer> loadMCenterCustomerList(ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        myBhv().loadMCenterCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCustomer().ready(_referrerMCenterCustomerList, _selector));
    }

    protected List<MParam> _referrerMParamList;

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">paramCB</span>.setupSelect...
     *         <span style="color: #553000">paramCB</span>.query().set...
     *         <span style="color: #553000">paramCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">paramLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    paramLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMParam> loadMParamList(ConditionBeanSetupper<MParamCB> refCBLambda) {
        myBhv().loadMParamList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMParamList = refLs);
        return hd -> hd.handle(new LoaderOfMParam().ready(_referrerMParamList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHList;

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHList;

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHList, _selector));
    }

    protected List<WHtLoading> _referrerWHtLoadingList;

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mDeliveryCourseBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDeliveryCourseList</span>, <span style="color: #553000">courseLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseLoader</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loadingCB</span>.setupSelect...
     *         <span style="color: #553000">loadingCB</span>.query().set...
     *         <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loadingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loadingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDeliveryCourse mDeliveryCourse : <span style="color: #553000">mDeliveryCourseList</span>) {
     *     ... = mDeliveryCourse.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeliveryCourseId_InScope(pkList);
     * cb.query().addOrderBy_DeliveryCourseId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtLoading> loadWHtLoadingList(ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        myBhv().loadWHtLoadingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtLoadingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtLoading().ready(_referrerWHtLoadingList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCarrierSlipYupk _foreignMCarrierSlipYupkLoader;
    public LoaderOfMCarrierSlipYupk pulloutMCarrierSlipYupk() {
        if (_foreignMCarrierSlipYupkLoader == null)
        { _foreignMCarrierSlipYupkLoader = new LoaderOfMCarrierSlipYupk().ready(myBhv().pulloutMCarrierSlipYupk(_selectedList), _selector); }
        return _foreignMCarrierSlipYupkLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMCarrier _foreignMCarrierLoader;
    public LoaderOfMCarrier pulloutMCarrier() {
        if (_foreignMCarrierLoader == null)
        { _foreignMCarrierLoader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrier(_selectedList), _selector); }
        return _foreignMCarrierLoader;
    }

    protected LoaderOfMCarrierSlipSgw _foreignMCarrierSlipSgwLoader;
    public LoaderOfMCarrierSlipSgw pulloutMCarrierSlipSgw() {
        if (_foreignMCarrierSlipSgwLoader == null)
        { _foreignMCarrierSlipSgwLoader = new LoaderOfMCarrierSlipSgw().ready(myBhv().pulloutMCarrierSlipSgw(_selectedList), _selector); }
        return _foreignMCarrierSlipSgwLoader;
    }

    protected LoaderOfMCarrierSlipYmt _foreignMCarrierSlipYmtLoader;
    public LoaderOfMCarrierSlipYmt pulloutMCarrierSlipYmt() {
        if (_foreignMCarrierSlipYmtLoader == null)
        { _foreignMCarrierSlipYmtLoader = new LoaderOfMCarrierSlipYmt().ready(myBhv().pulloutMCarrierSlipYmt(_selectedList), _selector); }
        return _foreignMCarrierSlipYmtLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByTagDataTypeLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByTagDataType() {
        if (_foreignMCenterClassDtlByTagDataTypeLoader == null)
        { _foreignMCenterClassDtlByTagDataTypeLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByTagDataType(_selectedList), _selector); }
        return _foreignMCenterClassDtlByTagDataTypeLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByTagTypeLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByTagType() {
        if (_foreignMCenterClassDtlByTagTypeLoader == null)
        { _foreignMCenterClassDtlByTagTypeLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByTagType(_selectedList), _selector); }
        return _foreignMCenterClassDtlByTagTypeLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByTagTypeAfterLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByTagTypeAfter() {
        if (_foreignMCenterClassDtlByTagTypeAfterLoader == null)
        { _foreignMCenterClassDtlByTagTypeAfterLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByTagTypeAfter(_selectedList), _selector); }
        return _foreignMCenterClassDtlByTagTypeAfterLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTrackingNumberingUnitLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTrackingNumberingUnit() {
        if (_foreignBClassDtlByTrackingNumberingUnitLoader == null)
        { _foreignBClassDtlByTrackingNumberingUnitLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTrackingNumberingUnit(_selectedList), _selector); }
        return _foreignBClassDtlByTrackingNumberingUnitLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPaymentTermLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPaymentTerm() {
        if (_foreignBClassDtlByPaymentTermLoader == null)
        { _foreignBClassDtlByPaymentTermLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPaymentTerm(_selectedList), _selector); }
        return _foreignBClassDtlByPaymentTermLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MDeliveryCourse> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
