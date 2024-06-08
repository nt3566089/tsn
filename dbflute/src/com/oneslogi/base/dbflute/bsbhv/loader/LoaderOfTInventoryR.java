package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_INVENTORY_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_INVENTORY_B, B_USER, B_CLASS_DTL(ByTwlOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tInventoryB, bUser, bClassDtlByTwlOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryR> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryR ready(List<TInventoryR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTInventoryB _foreignTInventoryBLoader;
    public LoaderOfTInventoryB pulloutTInventoryB() {
        if (_foreignTInventoryBLoader == null)
        { _foreignTInventoryBLoader = new LoaderOfTInventoryB().ready(myBhv().pulloutTInventoryB(_selectedList), _selector); }
        return _foreignTInventoryBLoader;
    }

    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTwlOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTwlOutFlg() {
        if (_foreignBClassDtlByTwlOutFlgLoader == null)
        { _foreignBClassDtlByTwlOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTwlOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTwlOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
