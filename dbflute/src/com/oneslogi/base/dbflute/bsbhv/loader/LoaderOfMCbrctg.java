package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CBRCTG as TABLE. <br>
 * <pre>
 * [primary key]
 *     CBRCTG_ID
 *
 * [column]
 *     CBRCTG_ID, CENTER_ID, CLIENT_ID, BRCTG, BRCTGNM, TOSPLMGN, PRESPLMGN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CBRCTG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCbrctg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCbrctg> _selectedList;
    protected BehaviorSelector _selector;
    protected MCbrctgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCbrctg ready(List<MCbrctg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCbrctgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCbrctgBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCbrctg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
