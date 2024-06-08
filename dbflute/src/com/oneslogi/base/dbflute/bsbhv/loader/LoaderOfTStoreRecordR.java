package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_STORE_RECORD_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_RECORD_OUT_FLG, RECEIVE_RECORD_OUT_USER_ID, RECEIVE_RECORD_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_STORE_RECORD_H, B_CLASS_DTL(ByReceiveRecordOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tStoreRecordH, bClassDtlByReceiveRecordOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStoreRecordR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStoreRecordR> _selectedList;
    protected BehaviorSelector _selector;
    protected TStoreRecordRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStoreRecordR ready(List<TStoreRecordR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStoreRecordRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStoreRecordRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfTStoreRecordH _foreignTStoreRecordHLoader;
    public LoaderOfTStoreRecordH pulloutTStoreRecordH() {
        if (_foreignTStoreRecordHLoader == null)
        { _foreignTStoreRecordHLoader = new LoaderOfTStoreRecordH().ready(myBhv().pulloutTStoreRecordH(_selectedList), _selector); }
        return _foreignTStoreRecordHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveRecordOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveRecordOutFlg() {
        if (_foreignBClassDtlByReceiveRecordOutFlgLoader == null)
        { _foreignBClassDtlByReceiveRecordOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveRecordOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveRecordOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStoreRecordR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
