package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_RECEIVE_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, STOCK_ID, PLAN_NUM, PROCESS_NO, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, STORE_LOCATION_CD, STORE_LOCATION_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_STOCK, H_RECEIVE_H, B_CLASS_DTL(ByStoreFlg), H_RECEIVE_SPARE(AsOne)
 *
 * [referrer table]
 *     H_RECEIVE_SPARE
 *
 * [foreign property]
 *     hStock, hReceiveH, bClassDtlByStoreFlg, hReceiveSpareAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHReceiveB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HReceiveB> _selectedList;
    protected BehaviorSelector _selector;
    protected HReceiveBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHReceiveB ready(List<HReceiveB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HReceiveBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HReceiveBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    protected LoaderOfHReceiveH _foreignHReceiveHLoader;
    public LoaderOfHReceiveH pulloutHReceiveH() {
        if (_foreignHReceiveHLoader == null)
        { _foreignHReceiveHLoader = new LoaderOfHReceiveH().ready(myBhv().pulloutHReceiveH(_selectedList), _selector); }
        return _foreignHReceiveHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStoreFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStoreFlg() {
        if (_foreignBClassDtlByStoreFlgLoader == null)
        { _foreignBClassDtlByStoreFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStoreFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStoreFlgLoader;
    }

    protected LoaderOfHReceiveSpare _foreignHReceiveSpareAsOneLoader;
    public LoaderOfHReceiveSpare pulloutHReceiveSpareAsOne() {
        if (_foreignHReceiveSpareAsOneLoader == null)
        { _foreignHReceiveSpareAsOneLoader = new LoaderOfHReceiveSpare().ready(myBhv().pulloutHReceiveSpareAsOne(_selectedList), _selector); }
        return _foreignHReceiveSpareAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HReceiveB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
