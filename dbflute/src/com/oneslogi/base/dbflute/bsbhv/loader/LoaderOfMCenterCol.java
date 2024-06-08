package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CENTER_COL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_COL_ID
 *
 * [column]
 *     CENTER_COL_ID, CENTER_ID, COL_ID, DICT_ID, VISIBLE, EDITABLE, NECESSARY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_COL, B_DICT, M_CENTER, V_DICT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCol, bDict, mCenter, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCenterCol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenterCol> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterColBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenterCol ready(List<MCenterCol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterColBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterColBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCol _foreignBColLoader;
    public LoaderOfBCol pulloutBCol() {
        if (_foreignBColLoader == null)
        { _foreignBColLoader = new LoaderOfBCol().ready(myBhv().pulloutBCol(_selectedList), _selector); }
        return _foreignBColLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenterCol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
