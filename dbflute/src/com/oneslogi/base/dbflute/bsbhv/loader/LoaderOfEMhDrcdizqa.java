package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_MH_DRCDIZQA as TABLE. <br>
 * <pre>
 * [primary key]
 *     MH_DRCDIZQA_ID
 *
 * [column]
 *     MH_DRCDIZQA_ID, LINBLK, ZNECD, SRRNK, LOCNO, ZZMATNR, DLVYMD, DPCD, DED, PSTNID, COMT, SROPRTCNT, CSROPRTCNT, CINLADDRCSRRNK, ZQACP, ZQACTQA, SSQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_DRCDIZQA_ID
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
public class LoaderOfEMhDrcdizqa {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EMhDrcdizqa> _selectedList;
    protected BehaviorSelector _selector;
    protected EMhDrcdizqaBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEMhDrcdizqa ready(List<EMhDrcdizqa> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EMhDrcdizqaBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EMhDrcdizqaBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EMhDrcdizqa> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
