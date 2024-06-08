package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CCUSAUINF as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_TOTAL_INFO_ID
 *
 * [column]
 *     CLIENT_TOTAL_INFO_ID, ZZORGNCD, DPCD, DLVYMD, DED, ZZPSTNID, SROPRTYMD, SROPRTCNT, DLVSNM, DLVDTLSNM, SSCD, SSNM, SRQACB, SRQACBLIN, SRQACBBLK, SRQACBDM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_TOTAL_INFO_ID
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
public class LoaderOfTCcusauinf {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCcusauinf> _selectedList;
    protected BehaviorSelector _selector;
    protected TCcusauinfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCcusauinf ready(List<TCcusauinf> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCcusauinfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCcusauinfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCcusauinf> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
