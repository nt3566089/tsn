package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_DRCDIZQA as TABLE. <br>
 * <pre>
 * [primary key]
 *     HOUMEN_REMAINING_ID
 *
 * [column]
 *     HOUMEN_REMAINING_ID, ZZORGNCD, LINBLK, SRRNK, LOCID, ZZMATNR, DLVYMD, DPCD, DED, PSTNID, COMT, SROPRTCNT, CSROPRTCNT, CINLADDRCSRRNK, ZQACP, ZQACTQA, SSQA, DSCB, DSCT, SRLIN, STOCKDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_REMAINING_ID
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
public class LoaderOfTDrcdizqa {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TDrcdizqa> _selectedList;
    protected BehaviorSelector _selector;
    protected TDrcdizqaBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTDrcdizqa ready(List<TDrcdizqa> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TDrcdizqaBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TDrcdizqaBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TDrcdizqa> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
