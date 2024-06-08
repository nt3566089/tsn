package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CARRIER_SLIP_YMT as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_SLIP_YMT_ID
 *
 * [column]
 *     CARRIER_SLIP_YMT_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_TYPE, COOL_CLS, HONORIFIC, PACKING_SHOW_FLG, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_ADDRESS4, SLIP_CLIENT_NM, SLIP_ITEM_CD1, SLIP_ITEM_NM1, SLIP_ITEM_CD2, SLIP_ITEM_NM2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, BILLING_CUSTOMER_CD, FARE_NO, SEND_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YMT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCoolCls, bClassDtlByDelFlg, bClassDtlByPackingShowFlg, bClassDtlBySlipType
 *
 * [referrer property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierSlipYmt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierSlipYmt> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierSlipYmtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierSlipYmt ready(List<MCarrierSlipYmt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierSlipYmtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierSlipYmtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierSlipYmtList</span>, <span style="color: #553000">ymtLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ymtLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrierSlipYmt mCarrierSlipYmt : <span style="color: #553000">mCarrierSlipYmtList</span>) {
     *     ... = mCarrierSlipYmt.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipYmtId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipYmtId_Asc();
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

    protected LoaderOfBClassDtl _foreignBClassDtlByCharacterCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCharacterCd() {
        if (_foreignBClassDtlByCharacterCdLoader == null)
        { _foreignBClassDtlByCharacterCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCharacterCd(_selectedList), _selector); }
        return _foreignBClassDtlByCharacterCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCoolClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCoolCls() {
        if (_foreignBClassDtlByCoolClsLoader == null)
        { _foreignBClassDtlByCoolClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCoolCls(_selectedList), _selector); }
        return _foreignBClassDtlByCoolClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingShowFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingShowFlg() {
        if (_foreignBClassDtlByPackingShowFlgLoader == null)
        { _foreignBClassDtlByPackingShowFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingShowFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPackingShowFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySlipTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySlipType() {
        if (_foreignBClassDtlBySlipTypeLoader == null)
        { _foreignBClassDtlBySlipTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySlipType(_selectedList), _selector); }
        return _foreignBClassDtlBySlipTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierSlipYmt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
