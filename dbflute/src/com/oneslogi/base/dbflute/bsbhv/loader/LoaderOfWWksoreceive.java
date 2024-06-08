package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKSORECEIVE as TABLE. <br>
 * <pre>
 * [primary key]
 *     WKSORECEIVE_ID
 *
 * [column]
 *     WKSORECEIVE_ID, SO_RECEIVE_KEY, SHIPPING_INST_H_ID, LOT_ID, OWNERSONO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKSORECEIVE_ID
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
public class LoaderOfWWksoreceive {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWksoreceive> _selectedList;
    protected BehaviorSelector _selector;
    protected WWksoreceiveBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWksoreceive ready(List<WWksoreceive> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWksoreceiveBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWksoreceiveBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWksoreceive> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
