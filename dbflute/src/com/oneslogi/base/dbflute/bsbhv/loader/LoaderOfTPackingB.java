package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_PACKING_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_B_ID
 *
 * [column]
 *     PACKING_B_ID, PACKING_H_ID, PICKING_B_ID, ALLOC_INST_B_ID, PACKING_NUM, PICKING_FLG, INSPECTION_FLG, CASE_PICKING_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_ALLOC_INST_B, T_PACKING_H, T_PICKING_B, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tAllocInstB, tPackingH, tPickingB, bClassDtlByInspectionFlg, bClassDtlByPickingFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPackingB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPackingB> _selectedList;
    protected BehaviorSelector _selector;
    protected TPackingBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPackingB ready(List<TPackingB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPackingBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPackingBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTAllocInstB _foreignTAllocInstBLoader;
    public LoaderOfTAllocInstB pulloutTAllocInstB() {
        if (_foreignTAllocInstBLoader == null)
        { _foreignTAllocInstBLoader = new LoaderOfTAllocInstB().ready(myBhv().pulloutTAllocInstB(_selectedList), _selector); }
        return _foreignTAllocInstBLoader;
    }

    protected LoaderOfTPackingH _foreignTPackingHLoader;
    public LoaderOfTPackingH pulloutTPackingH() {
        if (_foreignTPackingHLoader == null)
        { _foreignTPackingHLoader = new LoaderOfTPackingH().ready(myBhv().pulloutTPackingH(_selectedList), _selector); }
        return _foreignTPackingHLoader;
    }

    protected LoaderOfTPickingB _foreignTPickingBLoader;
    public LoaderOfTPickingB pulloutTPickingB() {
        if (_foreignTPickingBLoader == null)
        { _foreignTPickingBLoader = new LoaderOfTPickingB().ready(myBhv().pulloutTPickingB(_selectedList), _selector); }
        return _foreignTPickingBLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspectionFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspectionFlg() {
        if (_foreignBClassDtlByInspectionFlgLoader == null)
        { _foreignBClassDtlByInspectionFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspectionFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspectionFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPickingFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPickingFlg() {
        if (_foreignBClassDtlByPickingFlgLoader == null)
        { _foreignBClassDtlByPickingFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPickingFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPickingFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPackingB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
