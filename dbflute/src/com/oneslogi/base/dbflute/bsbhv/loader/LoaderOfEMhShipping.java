package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_MH_SHIPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     MH_SHIPPING_ID
 *
 * [column]
 *     MH_SHIPPING_ID, DPCD, DLVYMD, DED, PSTNID, SRDED, SRPSTNID, SRLINCD, SRRNK, SSCD, SSNM, ZZMATNR, SLQACB, SLQACT, LINBLK, LOCNO, LOCID, DLVPRTRNK, DLVSNM, DLVDTLSNM, SROPRTCNT, TTSROPRTCNT, TTTOPDEDRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_SHIPPING_ID
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
public class LoaderOfEMhShipping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EMhShipping> _selectedList;
    protected BehaviorSelector _selector;
    protected EMhShippingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEMhShipping ready(List<EMhShipping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EMhShippingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EMhShippingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EMhShipping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
