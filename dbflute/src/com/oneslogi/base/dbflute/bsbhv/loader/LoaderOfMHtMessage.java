package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_HT_MESSAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     MESSAGE_ID
 *
 * [column]
 *     MESSAGE_ID, MESSAGE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MESSAGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_MESSAGE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bMessage
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMHtMessage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MHtMessage> _selectedList;
    protected BehaviorSelector _selector;
    protected MHtMessageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMHtMessage ready(List<MHtMessage> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MHtMessageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MHtMessageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBMessage _foreignBMessageLoader;
    public LoaderOfBMessage pulloutBMessage() {
        if (_foreignBMessageLoader == null)
        { _foreignBMessageLoader = new LoaderOfBMessage().ready(myBhv().pulloutBMessage(_selectedList), _selector); }
        return _foreignBMessageLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MHtMessage> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
