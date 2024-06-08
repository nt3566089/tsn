package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRREFNOCTL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRREFNOCTL_ID
 *
 * [column]
 *     TRREFNOCTL_ID, REFNO, PLANRCVFLG, DTLRCVFLG, TRRCVADDFLG, CENTER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRREFNOCTL_ID
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
public class LoaderOfTTrrefnoctl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrefnoctl> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrefnoctlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrefnoctl ready(List<TTrrefnoctl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrefnoctlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrefnoctlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrefnoctl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
