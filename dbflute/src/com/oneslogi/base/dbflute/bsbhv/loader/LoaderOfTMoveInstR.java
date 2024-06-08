package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_MOVE_INST_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_H_ID
 *
 * [column]
 *     MOVE_INST_H_ID, INST_OUT_FLG, INST_OUT_USER_ID, INST_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_MOVE_INST_H, B_CLASS_DTL(ByInstOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tMoveInstH, bClassDtlByInstOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMoveInstR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMoveInstR> _selectedList;
    protected BehaviorSelector _selector;
    protected TMoveInstRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMoveInstR ready(List<TMoveInstR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMoveInstRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMoveInstRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfTMoveInstH _foreignTMoveInstHLoader;
    public LoaderOfTMoveInstH pulloutTMoveInstH() {
        if (_foreignTMoveInstHLoader == null)
        { _foreignTMoveInstHLoader = new LoaderOfTMoveInstH().ready(myBhv().pulloutTMoveInstH(_selectedList), _selector); }
        return _foreignTMoveInstHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInstOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInstOutFlg() {
        if (_foreignBClassDtlByInstOutFlgLoader == null)
        { _foreignBClassDtlByInstOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInstOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInstOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMoveInstR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
