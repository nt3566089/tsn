package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CDRCAUINF as TABLE. <br>
 * <pre>
 * [primary key]
 *     HOUMEN_TOTAL_INFO_ID
 *
 * [column]
 *     HOUMEN_TOTAL_INFO_ID, ZZORGNCD, SROPRTYMD, SROPRTCNT, DLVYMD, DPCD, ZZPSTNID, DED, ZZMATNR, CBQA, CTNUM, ZQACP, ZQACTQA, SSQA, SRRNK, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_TOTAL_INFO_ID
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
public class LoaderOfTCdrcauinf {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCdrcauinf> _selectedList;
    protected BehaviorSelector _selector;
    protected TCdrcauinfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCdrcauinf ready(List<TCdrcauinf> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCdrcauinfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCdrcauinfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCdrcauinf> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
