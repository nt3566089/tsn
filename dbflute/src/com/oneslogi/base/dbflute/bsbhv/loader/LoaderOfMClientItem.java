package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CLIENT_ITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_ITEM_ID
 *
 * [column]
 *     CLIENT_ITEM_ID, CLIENT_ID, ITEM_ID, DICT_ID, VISIBLE, EDITABLE, NECESSARY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_ITEM, M_CLIENT, B_DICT, V_DICT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bItem, mClient, bDict, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMClientItem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClientItem> _selectedList;
    protected BehaviorSelector _selector;
    protected MClientItemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClientItem ready(List<MClientItem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClientItemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClientItemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBItem _foreignBItemLoader;
    public LoaderOfBItem pulloutBItem() {
        if (_foreignBItemLoader == null)
        { _foreignBItemLoader = new LoaderOfBItem().ready(myBhv().pulloutBItem(_selectedList), _selector); }
        return _foreignBItemLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
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
    public List<MClientItem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
