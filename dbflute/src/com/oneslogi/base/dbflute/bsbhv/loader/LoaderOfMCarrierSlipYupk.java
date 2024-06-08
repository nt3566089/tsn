package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_CARRIER_SLIP_YUPK as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [column]
 *     CARRIER_SLIP_YUPK_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, POST_TYPE, COOL_TYPE, COD_TYPE, CARRIER_TYPE, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_NM1, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_MAIL, NO_UPSIDE_DOWN_CLS, NO_STOCK_CLS, SLIP_PRODUCT_SIZE_CLS, SLIP_PRODUCT_NO, SLIP_ITEM_NM, SHIP_RESERVE_DATA_MARK, DELI_CERT_PRE_YEARS, SEND_NM, PRODUCT_TYPE_CODE, POST_BIZ_CARD_CUSTOMER_NO, SHIPPING_COMPANY_CODE, SHIPMENT_CODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YUPK_ID
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
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCodType, bClassDtlByCoolType, bClassDtlByDelFlg, bClassDtlByNoStockCls, bClassDtlByNoUpsideDownCls, bClassDtlByPostType
 *
 * [referrer property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierSlipYupk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierSlipYupk> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierSlipYupkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierSlipYupk ready(List<MCarrierSlipYupk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierSlipYupkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierSlipYupkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierSlipYupkList</span>, <span style="color: #553000">yupkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">yupkLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrierSlipYupk mCarrierSlipYupk : <span style="color: #553000">mCarrierSlipYupkList</span>) {
     *     ... = mCarrierSlipYupk.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierSlipYupkId_InScope(pkList);
     * cb.query().addOrderBy_CarrierSlipYupkId_Asc();
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

    protected LoaderOfBClassDtl _foreignBClassDtlByCodTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCodType() {
        if (_foreignBClassDtlByCodTypeLoader == null)
        { _foreignBClassDtlByCodTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCodType(_selectedList), _selector); }
        return _foreignBClassDtlByCodTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCoolTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCoolType() {
        if (_foreignBClassDtlByCoolTypeLoader == null)
        { _foreignBClassDtlByCoolTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCoolType(_selectedList), _selector); }
        return _foreignBClassDtlByCoolTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByNoStockClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByNoStockCls() {
        if (_foreignBClassDtlByNoStockClsLoader == null)
        { _foreignBClassDtlByNoStockClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByNoStockCls(_selectedList), _selector); }
        return _foreignBClassDtlByNoStockClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByNoUpsideDownClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByNoUpsideDownCls() {
        if (_foreignBClassDtlByNoUpsideDownClsLoader == null)
        { _foreignBClassDtlByNoUpsideDownClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByNoUpsideDownCls(_selectedList), _selector); }
        return _foreignBClassDtlByNoUpsideDownClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPostTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPostType() {
        if (_foreignBClassDtlByPostTypeLoader == null)
        { _foreignBClassDtlByPostTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPostType(_selectedList), _selector); }
        return _foreignBClassDtlByPostTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierSlipYupk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
