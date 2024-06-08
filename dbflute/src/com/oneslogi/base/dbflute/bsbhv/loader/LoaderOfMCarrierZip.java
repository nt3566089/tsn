package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CARRIER_ZIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_ZIP_ID
 *
 * [column]
 *     CARRIER_ZIP_ID, COMMON_CARRIER_ID, ZIP_ID, ARRIVAL_STORE_CD, ARRIVAL_STORE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_COMMON_CARRIER, M_ZIP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCommonCarrier, mZip
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierZip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierZip> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierZipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierZip ready(List<MCarrierZip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierZipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierZipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCommonCarrier _foreignMCommonCarrierLoader;
    public LoaderOfMCommonCarrier pulloutMCommonCarrier() {
        if (_foreignMCommonCarrierLoader == null)
        { _foreignMCommonCarrierLoader = new LoaderOfMCommonCarrier().ready(myBhv().pulloutMCommonCarrier(_selectedList), _selector); }
        return _foreignMCommonCarrierLoader;
    }

    protected LoaderOfMZip _foreignMZipLoader;
    public LoaderOfMZip pulloutMZip() {
        if (_foreignMZipLoader == null)
        { _foreignMZipLoader = new LoaderOfMZip().ready(myBhv().pulloutMZip(_selectedList), _selector); }
        return _foreignMZipLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierZip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
