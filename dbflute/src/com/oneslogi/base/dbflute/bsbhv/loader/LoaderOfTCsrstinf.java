package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_CSRSTINF as TABLE. <br>
 * <pre>
 * [primary key]
 *     SORT_STATISTICS_INFO_ID
 *
 * [column]
 *     SORT_STATISTICS_INFO_ID, ZZORGNCD, SROPRTYMD, SROPRTCNT, LINBLK, DLVYMD, DPCD, DED, PSTNID, SRLINCD, SRRNK, SRPAT, TTBRQA, SHPQA, SPRQASFTPCL, SPRQATSNBOX, SPRQAJTBOX, SPRQA100BOX, SPRQAHL, SPRQAFUL, SPRQAHLBGBOX, SPRQAHL12BOX, SPRQAHL5BOX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_STATISTICS_INFO_ID
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
public class LoaderOfTCsrstinf {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TCsrstinf> _selectedList;
    protected BehaviorSelector _selector;
    protected TCsrstinfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTCsrstinf ready(List<TCsrstinf> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TCsrstinfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TCsrstinfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TCsrstinf> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
