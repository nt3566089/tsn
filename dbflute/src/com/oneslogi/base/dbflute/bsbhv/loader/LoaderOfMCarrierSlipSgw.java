package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CARRIER_SLIP_SGW as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_SLIP_SGW_ID
 *
 * [column]
 *     CARRIER_SLIP_SGW_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_CUSTOMER_CD, WEB_API_REQUEST_URL, CUSTOMER_ID, LOGIN_PASSWORD, DEPT_CONSIGNOR_NM, CONSIGNOR_TEL_NO, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_NM1, SLIP_CLIENT_NM2, SLIP_SHAPE_CD, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, TRANSPORT_TYPE_SPEED, TRANSPORT_TYPE_ITEM, SETTLEMENT_TYPE, SEAL_TYPE1, SEAL_TYPE2, SEAL_TYPE3, COD_CLS, SEND_CD, API_OKURI_CODE, API_BINSYU_CODE, API_DAIBIKI_FLG, API_DAIBIKI_TYPE, API_WEIGHT_CD_1, API_WEIGHT_CD_2, API_EIDOME_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_SGW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CENTER_CLASS_DTL(ByApiBinsyuCode), B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer table]
 *     M_DELIVERY_COURSE
 *
 * [foreign property]
 *     mCenter, mCenterClassDtlByApiBinsyuCode, mCenterClassDtlByApiDaibikiFlg, mCenterClassDtlByApiDaibikiType, mCenterClassDtlByApiEidomeFlg, mCenterClassDtlByApiWeightCd1, mCenterClassDtlByApiWeightCd2, bClassDtlByCharacterCd, bClassDtlByCodCls, bClassDtlByDelFlg, mCenterClassDtlBySealType1, mCenterClassDtlBySealType2, mCenterClassDtlBySealType3, bClassDtlBySettlementType, mCenterClassDtlBySlipShapeCd, mCenterClassDtlByTransportTypeItem, mCenterClassDtlByTransportTypeSpeed
 *
 * [referrer property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierSlipSgw {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierSlipSgw> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierSlipSgwBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierSlipSgw ready(List<MCarrierSlipSgw> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierSlipSgwBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierSlipSgwBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierSlipSgwList</span>, <span style="color: #553000">sgwLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sgwLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrierSlipSgw mCarrierSlipSgw : <span style="color: #553000">mCarrierSlipSgwList</span>) {
     *     ... = mCarrierSlipSgw.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipSgwId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipSgwId_Asc();
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

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiBinsyuCodeLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiBinsyuCode() {
        if (_foreignMCenterClassDtlByApiBinsyuCodeLoader == null)
        { _foreignMCenterClassDtlByApiBinsyuCodeLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiBinsyuCode(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiBinsyuCodeLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiDaibikiFlgLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiDaibikiFlg() {
        if (_foreignMCenterClassDtlByApiDaibikiFlgLoader == null)
        { _foreignMCenterClassDtlByApiDaibikiFlgLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiDaibikiFlg(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiDaibikiFlgLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiDaibikiTypeLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiDaibikiType() {
        if (_foreignMCenterClassDtlByApiDaibikiTypeLoader == null)
        { _foreignMCenterClassDtlByApiDaibikiTypeLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiDaibikiType(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiDaibikiTypeLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiEidomeFlgLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiEidomeFlg() {
        if (_foreignMCenterClassDtlByApiEidomeFlgLoader == null)
        { _foreignMCenterClassDtlByApiEidomeFlgLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiEidomeFlg(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiEidomeFlgLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiWeightCd1Loader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiWeightCd1() {
        if (_foreignMCenterClassDtlByApiWeightCd1Loader == null)
        { _foreignMCenterClassDtlByApiWeightCd1Loader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiWeightCd1(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiWeightCd1Loader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByApiWeightCd2Loader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByApiWeightCd2() {
        if (_foreignMCenterClassDtlByApiWeightCd2Loader == null)
        { _foreignMCenterClassDtlByApiWeightCd2Loader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByApiWeightCd2(_selectedList), _selector); }
        return _foreignMCenterClassDtlByApiWeightCd2Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCharacterCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCharacterCd() {
        if (_foreignBClassDtlByCharacterCdLoader == null)
        { _foreignBClassDtlByCharacterCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCharacterCd(_selectedList), _selector); }
        return _foreignBClassDtlByCharacterCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCodClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCodCls() {
        if (_foreignBClassDtlByCodClsLoader == null)
        { _foreignBClassDtlByCodClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCodCls(_selectedList), _selector); }
        return _foreignBClassDtlByCodClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlBySealType1Loader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlBySealType1() {
        if (_foreignMCenterClassDtlBySealType1Loader == null)
        { _foreignMCenterClassDtlBySealType1Loader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlBySealType1(_selectedList), _selector); }
        return _foreignMCenterClassDtlBySealType1Loader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlBySealType2Loader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlBySealType2() {
        if (_foreignMCenterClassDtlBySealType2Loader == null)
        { _foreignMCenterClassDtlBySealType2Loader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlBySealType2(_selectedList), _selector); }
        return _foreignMCenterClassDtlBySealType2Loader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlBySealType3Loader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlBySealType3() {
        if (_foreignMCenterClassDtlBySealType3Loader == null)
        { _foreignMCenterClassDtlBySealType3Loader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlBySealType3(_selectedList), _selector); }
        return _foreignMCenterClassDtlBySealType3Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySettlementTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySettlementType() {
        if (_foreignBClassDtlBySettlementTypeLoader == null)
        { _foreignBClassDtlBySettlementTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySettlementType(_selectedList), _selector); }
        return _foreignBClassDtlBySettlementTypeLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlBySlipShapeCdLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlBySlipShapeCd() {
        if (_foreignMCenterClassDtlBySlipShapeCdLoader == null)
        { _foreignMCenterClassDtlBySlipShapeCdLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlBySlipShapeCd(_selectedList), _selector); }
        return _foreignMCenterClassDtlBySlipShapeCdLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByTransportTypeItemLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByTransportTypeItem() {
        if (_foreignMCenterClassDtlByTransportTypeItemLoader == null)
        { _foreignMCenterClassDtlByTransportTypeItemLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByTransportTypeItem(_selectedList), _selector); }
        return _foreignMCenterClassDtlByTransportTypeItemLoader;
    }

    protected LoaderOfMCenterClassDtl _foreignMCenterClassDtlByTransportTypeSpeedLoader;
    public LoaderOfMCenterClassDtl pulloutMCenterClassDtlByTransportTypeSpeed() {
        if (_foreignMCenterClassDtlByTransportTypeSpeedLoader == null)
        { _foreignMCenterClassDtlByTransportTypeSpeedLoader = new LoaderOfMCenterClassDtl().ready(myBhv().pulloutMCenterClassDtlByTransportTypeSpeed(_selectedList), _selector); }
        return _foreignMCenterClassDtlByTransportTypeSpeedLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierSlipSgw> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
