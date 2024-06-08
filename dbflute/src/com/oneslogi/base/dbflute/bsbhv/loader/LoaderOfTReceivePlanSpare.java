package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_RECEIVE_PLAN_SPARE as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanSpare {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanSpare> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanSpareBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanSpare ready(List<TReceivePlanSpare> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanSpareBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanSpareBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanB _foreignTReceivePlanBLoader;
    public LoaderOfTReceivePlanB pulloutTReceivePlanB() {
        if (_foreignTReceivePlanBLoader == null)
        { _foreignTReceivePlanBLoader = new LoaderOfTReceivePlanB().ready(myBhv().pulloutTReceivePlanB(_selectedList), _selector); }
        return _foreignTReceivePlanBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanSpare> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
