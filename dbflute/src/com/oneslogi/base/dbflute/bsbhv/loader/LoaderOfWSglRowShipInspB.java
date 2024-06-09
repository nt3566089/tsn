package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_SGL_ROW_SHIP_INSP_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_B_ID, SGL_ROW_SHIP_INSP_H_ID, PICKING_H_ID, USER_ID, INSPECTED_NUM, INSPECTION_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PICKING_H, W_SGL_ROW_SHIP_INSP_H, B_USER, B_CLASS_DTL(ByInspectionFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPickingH, wSglRowShipInspH, bUser, bClassDtlByInspectionFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWSglRowShipInspB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WSglRowShipInspB> _selectedList;
    protected BehaviorSelector _selector;
    protected WSglRowShipInspBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWSglRowShipInspB ready(List<WSglRowShipInspB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WSglRowShipInspBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WSglRowShipInspBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfWSglRowShipInspH _foreignWSglRowShipInspHLoader;
    public LoaderOfWSglRowShipInspH pulloutWSglRowShipInspH() {
        if (_foreignWSglRowShipInspHLoader == null)
        { _foreignWSglRowShipInspHLoader = new LoaderOfWSglRowShipInspH().ready(myBhv().pulloutWSglRowShipInspH(_selectedList), _selector); }
        return _foreignWSglRowShipInspHLoader;
    }

    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspectionFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspectionFlg() {
        if (_foreignBClassDtlByInspectionFlgLoader == null)
        { _foreignBClassDtlByInspectionFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspectionFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspectionFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WSglRowShipInspB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
