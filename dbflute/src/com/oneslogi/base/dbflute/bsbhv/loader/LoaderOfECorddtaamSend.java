package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_CORDDTAAM_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     CORDDTAAM_SEND_ID
 *
 * [column]
 *     CORDDTAAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, DELIVAY_CENTER_CD, DELIVERY_DATETIME, DIRECTION_CD, PISTON_TYPE, CAP_DIRECTION_CD, CAP_PISTON_TYPE, SORT_LINE_CD, SORT_ORDER, CUSTOMER_CD, CUSTOMER_NM, PRODUCT_CD, SLQACB, SLQACT, LINE_BLOCK, LOCATION_NO, LOCATION_TYPE, DELIVERY_PRINT_RANK, DELIVERY_SEQ_NO, DELIVERY_BRANCH_NO, SORT_WORK_DT, CSROPRTCNT, CUTTOPDIRASSORD, PRODUCT_TYPE, BOX_NO, BOX_NO_SEQ_NO, BOX_TYPE, MERGE_BOX_VISIBLE_TYPE, DM_VISIBLE_TYPE, TOTAL_BOX_CNT, BOX_CARTON_SUM, BOX_CARTON_SORT_NUM, TTTOPDEDRNK, LINE_BLOCK_BOX_NO, LINE_BLOCK_TOTAL_BOX_CNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORDDTAAM_SEND_ID
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
public class LoaderOfECorddtaamSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ECorddtaamSend> _selectedList;
    protected BehaviorSelector _selector;
    protected ECorddtaamSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfECorddtaamSend ready(List<ECorddtaamSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ECorddtaamSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ECorddtaamSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ECorddtaamSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
