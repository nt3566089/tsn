package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_RECEIVE_PLAN_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, RPL_OUT_FLG, RPL_OUT_USER_ID, RPL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_H, B_USER, B_CLASS_DTL(ByRplOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanH, bUser, bClassDtlByRplOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanR> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanR ready(List<TReceivePlanR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanH _foreignTReceivePlanHLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanH() {
        if (_foreignTReceivePlanHLoader == null)
        { _foreignTReceivePlanHLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanH(_selectedList), _selector); }
        return _foreignTReceivePlanHLoader;
    }

    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByRplOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByRplOutFlg() {
        if (_foreignBClassDtlByRplOutFlgLoader == null)
        { _foreignBClassDtlByRplOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByRplOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByRplOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
