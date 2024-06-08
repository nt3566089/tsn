package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_MFCOMPANY_M_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFCOMPANY_M_SEND_ID
 *
 * [column]
 *     MFCOMPANY_M_SEND_ID, COMPANY_CD, ORGNMKJ, ORGNMKN, ANWHNM, ZZFRDATEH, ZZTODATEH, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFCOMPANY_M_SEND_ID
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
public class LoaderOfEMfcompanyMSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EMfcompanyMSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EMfcompanyMSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEMfcompanyMSend ready(List<EMfcompanyMSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EMfcompanyMSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EMfcompanyMSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EMfcompanyMSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
