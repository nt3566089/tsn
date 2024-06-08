package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of V_HT_DICT as VIEW. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     DICT_ID, DICT_NM, CULTURE_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public class LoaderOfVHtDict {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VHtDict> _selectedList;
    protected BehaviorSelector _selector;
    protected VHtDictBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVHtDict ready(List<VHtDict> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VHtDictBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VHtDictBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VHtDict> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
