package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_SVF_OUTPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SVF_OUTPUT_ID
 *
 * [column]
 *     SVF_OUTPUT_ID, SEND_CD, SEND_ROW_ID, SENDFLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, CLIENT_CD, HB_KBN, DATA_PARTS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SVF_OUTPUT_ID
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
public class LoaderOfPSvfOutput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PSvfOutput> _selectedList;
    protected BehaviorSelector _selector;
    protected PSvfOutputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPSvfOutput ready(List<PSvfOutput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PSvfOutputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PSvfOutputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PSvfOutput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
