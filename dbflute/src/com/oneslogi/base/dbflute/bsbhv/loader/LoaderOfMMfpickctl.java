package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_MFPICKCTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFPICKCTL_ID
 *
 * [column]
 *     MFPICKCTL_ID, CLIENT_ID, PRODUCT_CD, PICKFRDATE, PICKTODATE, PICKRANK1, PICKRANK2, PICKRANK3, PICKRANK4, PICKRANK5, VALIDTYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFPICKCTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMMfpickctl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MMfpickctl> _selectedList;
    protected BehaviorSelector _selector;
    protected MMfpickctlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMMfpickctl ready(List<MMfpickctl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MMfpickctlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MMfpickctlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MMfpickctl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
