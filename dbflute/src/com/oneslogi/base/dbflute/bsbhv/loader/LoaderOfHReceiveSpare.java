package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_RECEIVE_SPARE as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     H_RECEIVE_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hReceiveB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHReceiveSpare {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HReceiveSpare> _selectedList;
    protected BehaviorSelector _selector;
    protected HReceiveSpareBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHReceiveSpare ready(List<HReceiveSpare> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HReceiveSpareBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HReceiveSpareBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHReceiveB _foreignHReceiveBLoader;
    public LoaderOfHReceiveB pulloutHReceiveB() {
        if (_foreignHReceiveBLoader == null)
        { _foreignHReceiveBLoader = new LoaderOfHReceiveB().ready(myBhv().pulloutHReceiveB(_selectedList), _selector); }
        return _foreignHReceiveBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HReceiveSpare> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
