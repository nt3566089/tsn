package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_M_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_M_SEND_ID
 *
 * [column]
 *     PRODUCT_M_SEND_ID, COMPANY_CD, PRODUCT_CD, BRFNFL, BRFNHF, BRANFL, BRANHF, IOID_CLS, OTRNK, BRCTG, NUMCT, CTNUM, CBCT, PATCBQA, CTBCDID, CTBCD, CBBCDID, CBBCD, FWBRID, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, ZZFRDATEH, ZZTODATEH, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_M_SEND_ID
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
public class LoaderOfEProductMSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductMSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductMSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductMSend ready(List<EProductMSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductMSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductMSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductMSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
