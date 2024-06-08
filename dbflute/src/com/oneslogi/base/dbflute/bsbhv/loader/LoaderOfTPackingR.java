package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_PACKING_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, STW_OUT_FLG, STW_OUT_USER_ID, STW_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, TAG_DL_URL, INSPECTION_OUT_FLG, INSPECTION_OUT_USER_ID, INSPECTION_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_PACKING_H, B_CLASS_DTL(ByStwOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByTagOutUserId, bUserByInspectionOutUserId, tPackingH, bUserByStwOutUserId, bClassDtlByStwOutFlg, bClassDtlByTagOutFlg, bClassDtlByInspectionOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPackingR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPackingR> _selectedList;
    protected BehaviorSelector _selector;
    protected TPackingRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPackingR ready(List<TPackingR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPackingRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPackingRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserByTagOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByTagOutUserId() {
        if (_foreignBUserByTagOutUserIdLoader == null)
        { _foreignBUserByTagOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByTagOutUserId(_selectedList), _selector); }
        return _foreignBUserByTagOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByInspectionOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByInspectionOutUserId() {
        if (_foreignBUserByInspectionOutUserIdLoader == null)
        { _foreignBUserByInspectionOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByInspectionOutUserId(_selectedList), _selector); }
        return _foreignBUserByInspectionOutUserIdLoader;
    }

    protected LoaderOfTPackingH _foreignTPackingHLoader;
    public LoaderOfTPackingH pulloutTPackingH() {
        if (_foreignTPackingHLoader == null)
        { _foreignTPackingHLoader = new LoaderOfTPackingH().ready(myBhv().pulloutTPackingH(_selectedList), _selector); }
        return _foreignTPackingHLoader;
    }

    protected LoaderOfBUser _foreignBUserByStwOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByStwOutUserId() {
        if (_foreignBUserByStwOutUserIdLoader == null)
        { _foreignBUserByStwOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByStwOutUserId(_selectedList), _selector); }
        return _foreignBUserByStwOutUserIdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStwOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStwOutFlg() {
        if (_foreignBClassDtlByStwOutFlgLoader == null)
        { _foreignBClassDtlByStwOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStwOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStwOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTagOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTagOutFlg() {
        if (_foreignBClassDtlByTagOutFlgLoader == null)
        { _foreignBClassDtlByTagOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTagOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTagOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspectionOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspectionOutFlg() {
        if (_foreignBClassDtlByInspectionOutFlgLoader == null)
        { _foreignBClassDtlByInspectionOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspectionOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspectionOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPackingR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
