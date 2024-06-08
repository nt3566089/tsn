package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_BTRPICK as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_INST_ID
 *
 * [column]
 *     PICKING_INST_ID, PICKBATCHKEY, PICKBATCHTYPE, PICKBATCHGROUP, PICKDATE, PICKSTARTDATE, NOTES, SHIPDATE, DELIVSCHDATE, ALLOCGROUP, SOID, PICKLINETOTAL, PICKINGWAY, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_ID
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
public class LoaderOfTBtrpick {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBtrpick> _selectedList;
    protected BehaviorSelector _selector;
    protected TBtrpickBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBtrpick ready(List<TBtrpick> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBtrpickBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBtrpickBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBtrpick> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
