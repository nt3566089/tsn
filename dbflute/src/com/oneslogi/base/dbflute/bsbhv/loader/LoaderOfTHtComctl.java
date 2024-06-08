package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_HT_COMCTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_COMCTL_ID
 *
 * [column]
 *     HT_COMCTL_ID, MAC_ADDRESS, CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, HT_DATA_KBN, SGY_KEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_COMCTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTHtComctl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<THtComctl> _selectedList;
    protected BehaviorSelector _selector;
    protected THtComctlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTHtComctl ready(List<THtComctl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected THtComctlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(THtComctlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<THtComctl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
