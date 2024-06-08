package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_ZIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZIP_ID
 *
 * [column]
 *     ZIP_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByFlg6)
 *
 * [referrer table]
 *     M_CARRIER_ZIP, T_SHIPPING_INST_H
 *
 * [foreign property]
 *     bClassDtlByFlg6, bClassDtlByFlg5, bClassDtlByCompanyFlg, bClassDtlByDelFlg, bClassDtlByReasonType, bClassDtlByUpdCd, bClassDtlByUpdType, bClassDtlByFlg1, bClassDtlByFlg2, bClassDtlByFlg3, bClassDtlByFlg4
 *
 * [referrer property]
 *     mCarrierZipList, tShippingInstHForDelivList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMZip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MZip> _selectedList;
    protected BehaviorSelector _selector;
    protected MZipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMZip ready(List<MZip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MZipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MZipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCarrierZip> _referrerMCarrierZipList;

    /**
     * Load referrer of MCarrierZipList by the set-upper of referrer. <br>
     * M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mZipList</span>, <span style="color: #553000">zipLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zipLoader</span>.<span style="color: #CC4747">loadMCarrierZipList</span>(<span style="color: #553000">zipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">zipCB</span>.setupSelect...
     *         <span style="color: #553000">zipCB</span>.query().set...
     *         <span style="color: #553000">zipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">zipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    zipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MZip mZip : <span style="color: #553000">mZipList</span>) {
     *     ... = mZip.<span style="color: #CC4747">getMCarrierZipList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setZipId_InScope(pkList);
     * cb.query().addOrderBy_ZipId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierZip> loadMCarrierZipList(ConditionBeanSetupper<MCarrierZipCB> refCBLambda) {
        myBhv().loadMCarrierZipList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierZipList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierZip().ready(_referrerMCarrierZipList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHForDelivList;

    /**
     * Load referrer of TShippingInstHForDelivList by the set-upper of referrer. <br>
     * T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'.
     * <pre>
     * <span style="color: #0000C0">mZipBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mZipList</span>, <span style="color: #553000">zipLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">zipLoader</span>.<span style="color: #CC4747">loadTShippingInstHForDelivList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MZip mZip : <span style="color: #553000">mZipList</span>) {
     *     ... = mZip.<span style="color: #CC4747">getTShippingInstHForDelivList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivZipCd_InScope(pkList);
     * cb.query().addOrderBy_DelivZipCd_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHForDelivList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHForDelivList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHForDelivList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHForDelivList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByFlg6Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg6() {
        if (_foreignBClassDtlByFlg6Loader == null)
        { _foreignBClassDtlByFlg6Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg6(_selectedList), _selector); }
        return _foreignBClassDtlByFlg6Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFlg5Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg5() {
        if (_foreignBClassDtlByFlg5Loader == null)
        { _foreignBClassDtlByFlg5Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg5(_selectedList), _selector); }
        return _foreignBClassDtlByFlg5Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCompanyFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCompanyFlg() {
        if (_foreignBClassDtlByCompanyFlgLoader == null)
        { _foreignBClassDtlByCompanyFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCompanyFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCompanyFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReasonTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReasonType() {
        if (_foreignBClassDtlByReasonTypeLoader == null)
        { _foreignBClassDtlByReasonTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReasonType(_selectedList), _selector); }
        return _foreignBClassDtlByReasonTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUpdCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUpdCd() {
        if (_foreignBClassDtlByUpdCdLoader == null)
        { _foreignBClassDtlByUpdCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUpdCd(_selectedList), _selector); }
        return _foreignBClassDtlByUpdCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUpdTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUpdType() {
        if (_foreignBClassDtlByUpdTypeLoader == null)
        { _foreignBClassDtlByUpdTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUpdType(_selectedList), _selector); }
        return _foreignBClassDtlByUpdTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFlg1Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg1() {
        if (_foreignBClassDtlByFlg1Loader == null)
        { _foreignBClassDtlByFlg1Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg1(_selectedList), _selector); }
        return _foreignBClassDtlByFlg1Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFlg2Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg2() {
        if (_foreignBClassDtlByFlg2Loader == null)
        { _foreignBClassDtlByFlg2Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg2(_selectedList), _selector); }
        return _foreignBClassDtlByFlg2Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFlg3Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg3() {
        if (_foreignBClassDtlByFlg3Loader == null)
        { _foreignBClassDtlByFlg3Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg3(_selectedList), _selector); }
        return _foreignBClassDtlByFlg3Loader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFlg4Loader;
    public LoaderOfBClassDtl pulloutBClassDtlByFlg4() {
        if (_foreignBClassDtlByFlg4Loader == null)
        { _foreignBClassDtlByFlg4Loader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFlg4(_selectedList), _selector); }
        return _foreignBClassDtlByFlg4Loader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MZip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
