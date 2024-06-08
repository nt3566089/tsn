package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CARRIER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_COMMON_CARRIER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_CARRIER_BOX, M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mCarrierBoxList, mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrier {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrier> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrier ready(List<MCarrier> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCarrierBox> _referrerMCarrierBoxList;

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by CARRIER_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">boxCB</span>.setupSelect...
     *         <span style="color: #553000">boxCB</span>.query().set...
     *         <span style="color: #553000">boxCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">boxLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    boxLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierBox> loadMCarrierBoxList(ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        myBhv().loadMCarrierBoxList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierBoxList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierBox().ready(_referrerMCarrierBoxList, _selector));
    }

    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDeliveryCourse> loadMDeliveryCourseList(ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        myBhv().loadMDeliveryCourseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDeliveryCourseList = refLs);
        return hd -> hd.handle(new LoaderOfMDeliveryCourse().ready(_referrerMDeliveryCourseList, _selector));
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

    protected LoaderOfMCommonCarrier _foreignMCommonCarrierLoader;
    public LoaderOfMCommonCarrier pulloutMCommonCarrier() {
        if (_foreignMCommonCarrierLoader == null)
        { _foreignMCommonCarrierLoader = new LoaderOfMCommonCarrier().ready(myBhv().pulloutMCommonCarrier(_selectedList), _selector); }
        return _foreignMCommonCarrierLoader;
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
    public List<MCarrier> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
