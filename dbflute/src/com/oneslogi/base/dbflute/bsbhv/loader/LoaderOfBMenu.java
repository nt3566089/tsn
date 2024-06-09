package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_MENU as TABLE. <br>
 * <pre>
 * [primary key]
 *     MENU_ID
 *
 * [column]
 *     MENU_ID, MENU_GRP_ID, SCREEN_ID, DICT_ID, URL_PATH, VIEW_ORDER, TARGET_WINDOW, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_MENU_GRP, B_SCREEN, V_DICT, V_HT_DICT, B_CLASS_DTL(ByTargetWindow)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bDict, bMenuGrp, bScreen, vDict, vHtDict, bClassDtlByTargetWindow
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBMenu {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BMenu> _selectedList;
    protected BehaviorSelector _selector;
    protected BMenuBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBMenu ready(List<BMenu> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BMenuBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BMenuBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfBMenuGrp _foreignBMenuGrpLoader;
    public LoaderOfBMenuGrp pulloutBMenuGrp() {
        if (_foreignBMenuGrpLoader == null)
        { _foreignBMenuGrpLoader = new LoaderOfBMenuGrp().ready(myBhv().pulloutBMenuGrp(_selectedList), _selector); }
        return _foreignBMenuGrpLoader;
    }

    protected LoaderOfBScreen _foreignBScreenLoader;
    public LoaderOfBScreen pulloutBScreen() {
        if (_foreignBScreenLoader == null)
        { _foreignBScreenLoader = new LoaderOfBScreen().ready(myBhv().pulloutBScreen(_selectedList), _selector); }
        return _foreignBScreenLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfVHtDict _foreignVHtDictLoader;
    public LoaderOfVHtDict pulloutVHtDict() {
        if (_foreignVHtDictLoader == null)
        { _foreignVHtDictLoader = new LoaderOfVHtDict().ready(myBhv().pulloutVHtDict(_selectedList), _selector); }
        return _foreignVHtDictLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTargetWindowLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTargetWindow() {
        if (_foreignBClassDtlByTargetWindowLoader == null)
        { _foreignBClassDtlByTargetWindowLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTargetWindow(_selectedList), _selector); }
        return _foreignBClassDtlByTargetWindowLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BMenu> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
