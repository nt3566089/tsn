package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_INVENTORY_INP_HIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_INP_HIST_ID
 *
 * [column]
 *     INVENTORY_INP_HIST_ID, INPUT_DT, INVENTORY_B_ID, INVENTORY_NUM, LAST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INP_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_INVENTORY_B, B_CLASS_DTL(ByLastFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tInventoryB, bClassDtlByLastFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryInpHist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryInpHist> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryInpHistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryInpHist ready(List<TInventoryInpHist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryInpHistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryInpHistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTInventoryB _foreignTInventoryBLoader;
    public LoaderOfTInventoryB pulloutTInventoryB() {
        if (_foreignTInventoryBLoader == null)
        { _foreignTInventoryBLoader = new LoaderOfTInventoryB().ready(myBhv().pulloutTInventoryB(_selectedList), _selector); }
        return _foreignTInventoryBLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLastFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLastFlg() {
        if (_foreignBClassDtlByLastFlgLoader == null)
        { _foreignBClassDtlByLastFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLastFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLastFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryInpHist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
