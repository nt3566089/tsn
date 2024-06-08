package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_WORK as TABLE. <br>
 * <pre>
 * [primary key]
 *     WORK_ID
 *
 * [column]
 *     WORK_ID, CENTER_CD, WORK_USER_CD, WORK_DT, CLOCK_IN_FLG, CLOCK_OUT_FLG, ENTRY_START_DT, ENTRY_START_TM, ENTRY_END_DT, ENTRY_END_TM, BREAK_START_FLG, BREAK_START_DT, BREAK_START_TM, BREAK_END_DT, BREAK_END_TM, FORCED_CLOCK_OUT_FLG, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_ID
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
public class LoaderOfWWork {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WWork> _selectedList;
    protected BehaviorSelector _selector;
    protected WWorkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWWork ready(List<WWork> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WWorkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WWorkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WWork> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
