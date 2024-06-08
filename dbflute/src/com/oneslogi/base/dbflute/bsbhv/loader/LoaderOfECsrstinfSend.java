package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_CSRSTINF_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     CSRSTINF_SEND_ID
 *
 * [column]
 *     CSRSTINF_SEND_ID, SEND_CD, SEND_ROW_CD, WORK_FLG, SROPRTYMD, SROPRTCNT, LINBLK, DLVYMD, DPCD, DED, PSTNID, SRLINCD, SRRNK, SRPAT, TTBRQA, SHPQA, SPRQASFTPCL, SPRQATSNBOX, SPRQAJTBOX, SPRQA100BOX, SPRQAHL, SPRQAHLBGBOX, SPRQAHL12BOX, SPRQAHL5BOX, SPRQAFUL, ZZORGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CSRSTINF_SEND_ID
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
public class LoaderOfECsrstinfSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ECsrstinfSend> _selectedList;
    protected BehaviorSelector _selector;
    protected ECsrstinfSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfECsrstinfSend ready(List<ECsrstinfSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ECsrstinfSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ECsrstinfSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ECsrstinfSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
