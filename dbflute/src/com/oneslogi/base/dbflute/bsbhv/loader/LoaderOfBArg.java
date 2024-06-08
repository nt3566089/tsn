package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_ARG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ARG_ID
 *
 * [column]
 *     ARG_ID, FUNC_ID, ARG_CD, DICT_ID, ARG_TYPE, NECESSARY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_FUNC, B_DICT, V_HT_DICT, B_ARG_VALID(AsOne)
 *
 * [referrer table]
 *     B_ARG_VALID
 *
 * [foreign property]
 *     bFunc, bDict, vHtDict, bArgValidAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBArg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BArg> _selectedList;
    protected BehaviorSelector _selector;
    protected BArgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBArg ready(List<BArg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BArgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BArgBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBFunc _foreignBFuncLoader;
    public LoaderOfBFunc pulloutBFunc() {
        if (_foreignBFuncLoader == null)
        { _foreignBFuncLoader = new LoaderOfBFunc().ready(myBhv().pulloutBFunc(_selectedList), _selector); }
        return _foreignBFuncLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfVHtDict _foreignVHtDictLoader;
    public LoaderOfVHtDict pulloutVHtDict() {
        if (_foreignVHtDictLoader == null)
        { _foreignVHtDictLoader = new LoaderOfVHtDict().ready(myBhv().pulloutVHtDict(_selectedList), _selector); }
        return _foreignVHtDictLoader;
    }

    protected LoaderOfBArgValid _foreignBArgValidAsOneLoader;
    public LoaderOfBArgValid pulloutBArgValidAsOne() {
        if (_foreignBArgValidAsOneLoader == null)
        { _foreignBArgValidAsOneLoader = new LoaderOfBArgValid().ready(myBhv().pulloutBArgValidAsOne(_selectedList), _selector); }
        return _foreignBArgValidAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BArg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
