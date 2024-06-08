package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CENTER_SCREEN as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_SCREEN_ID
 *
 * [column]
 *     CENTER_SCREEN_ID, CENTER_ID, SCREEN_ID, DICT_ID, VISIBLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SCREEN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_DICT, B_SCREEN, V_DICT, V_HT_DICT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, bDict, bScreen, vDict, vHtDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterScreen {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterScreen> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterScreenBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterScreen ready(List<MCenterScreen> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterScreenBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterScreenBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterScreen> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}