package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSORTCTNTRACE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID
 *
 * [column]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID, SEQNO, CENTER_SYMBOL_ID, FROM_CENTER_SYMBOL_ID, MOVEQTYBOWL, SORTEDQTYBOWL, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID
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
public class LoaderOfTTrsortctntrace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsortctntrace> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsortctntraceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsortctntrace ready(List<TTrsortctntrace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsortctntraceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsortctntraceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsortctntrace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
