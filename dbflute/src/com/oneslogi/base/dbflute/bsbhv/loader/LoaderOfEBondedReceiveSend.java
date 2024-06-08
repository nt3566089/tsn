package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_BONDED_RECEIVE_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONDED_RECEIVE_RECORD_SEND_ID
 *
 * [column]
 *     BONDED_RECEIVE_RECORD_SEND_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_RECEIVE_RECORD_SEND_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEBondedReceiveSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EBondedReceiveSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EBondedReceiveSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEBondedReceiveSend ready(List<EBondedReceiveSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EBondedReceiveSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EBondedReceiveSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EBondedReceiveSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
