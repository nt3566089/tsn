package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRWORK as TABLE. <br>
 * <pre>
 * [primary key]
 *     SEQUENCENO
 *
 * [column]
 *     SEQUENCENO, CLIENT_CD, CENTER_CD, USERCD, TASK_TYPE, TASK_TYPE_DETAIL, WORK_DT, WORKTIME, START_END, WORK_PALLET_QTY, WORK_CASE_QTY, WORK_CARTON_QTY, WORK_QTY, ERRCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SEQUENCENO
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
public class LoaderOfTTrwork {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrwork> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrworkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrwork ready(List<TTrwork> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrworkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrworkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrwork> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
