package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_MOVE_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, INOUT_TYPE, STOCK_ID, PROCESS_NO, MOVE_DT, MOVE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_MOVE_H, H_STOCK, B_CLASS_DTL(ByInoutType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hMoveH, hStock, bClassDtlByInoutType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHMoveB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HMoveB> _selectedList;
    protected BehaviorSelector _selector;
    protected HMoveBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHMoveB ready(List<HMoveB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HMoveBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HMoveBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHMoveH _foreignHMoveHLoader;
    public LoaderOfHMoveH pulloutHMoveH() {
        if (_foreignHMoveHLoader == null)
        { _foreignHMoveHLoader = new LoaderOfHMoveH().ready(myBhv().pulloutHMoveH(_selectedList), _selector); }
        return _foreignHMoveHLoader;
    }

    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInoutTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInoutType() {
        if (_foreignBClassDtlByInoutTypeLoader == null)
        { _foreignBClassDtlByInoutTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInoutType(_selectedList), _selector); }
        return _foreignBClassDtlByInoutTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HMoveB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
