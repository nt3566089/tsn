package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_MOVE_INST_B_SUB as TABLE. <br>
 * <pre>
 * [primary key]
 *     T_MOVE_INST_B_SUB_ID
 *
 * [column]
 *     T_MOVE_INST_B_SUB_ID, T_MOVE_INST_B_ID, TRPALLET_ID, TRSYMBOL_ID, MOVE_INST_STATUS, INST_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_MOVE_INST_B_SUB_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_MOVE_INST_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tMoveInstB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMoveInstBSub {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMoveInstBSub> _selectedList;
    protected BehaviorSelector _selector;
    protected TMoveInstBSubBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMoveInstBSub ready(List<TMoveInstBSub> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMoveInstBSubBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMoveInstBSubBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTMoveInstB _foreignTMoveInstBLoader;
    public LoaderOfTMoveInstB pulloutTMoveInstB() {
        if (_foreignTMoveInstBLoader == null)
        { _foreignTMoveInstBLoader = new LoaderOfTMoveInstB().ready(myBhv().pulloutTMoveInstB(_selectedList), _selector); }
        return _foreignTMoveInstBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMoveInstBSub> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
