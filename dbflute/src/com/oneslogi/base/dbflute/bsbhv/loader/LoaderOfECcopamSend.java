package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_CCOPAM_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     CCOPAM_SEND_ID
 *
 * [column]
 *     CCOPAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CCOPAM_ID, SNNO1, SNNO2, SNNO3, CARNO, SNYMD, ARVYMD, SFCD, STCD, GNLPLTQA, OTPLTQA, PLNCARKND, AMCARKND, SELNO1, SELNO2, SELNO3, TRANNM, TDRELAYID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CCOPAM_SEND_ID
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
public class LoaderOfECcopamSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ECcopamSend> _selectedList;
    protected BehaviorSelector _selector;
    protected ECcopamSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfECcopamSend ready(List<ECcopamSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ECcopamSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ECcopamSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ECcopamSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
