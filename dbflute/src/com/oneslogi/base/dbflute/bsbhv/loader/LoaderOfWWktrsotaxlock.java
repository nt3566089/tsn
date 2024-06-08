package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WKTRSOTAXLOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     WAREHOUSECD
 *
 * [column]
 *     WAREHOUSECD, LOCKCOUNTER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfWWktrsotaxlock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWktrsotaxlock> _selectedList;
    protected BehaviorSelector _selector;
    protected WWktrsotaxlockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWktrsotaxlock ready(List<WWktrsotaxlock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWktrsotaxlockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWktrsotaxlockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWktrsotaxlock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
