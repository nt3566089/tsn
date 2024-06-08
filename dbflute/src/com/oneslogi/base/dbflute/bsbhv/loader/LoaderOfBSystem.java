package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_SYSTEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     SYSTEM_ID
 *
 * [column]
 *     SYSTEM_ID, SYSTEM_NM, TIME_ZONE_ID, PASSWORD, SALT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SYSTEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_TIME_ZONE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bTimeZone
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBSystem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BSystem> _selectedList;
    protected BehaviorSelector _selector;
    protected BSystemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBSystem ready(List<BSystem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BSystemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BSystemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBTimeZone _foreignBTimeZoneLoader;
    public LoaderOfBTimeZone pulloutBTimeZone() {
        if (_foreignBTimeZoneLoader == null)
        { _foreignBTimeZoneLoader = new LoaderOfBTimeZone().ready(myBhv().pulloutBTimeZone(_selectedList), _selector); }
        return _foreignBTimeZoneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BSystem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
