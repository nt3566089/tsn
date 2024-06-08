package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_RETURNED_RECEIVE_PLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     RETURNED_RECEIVE_PLAN_ID
 *
 * [column]
 *     RETURNED_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEADER_FLG, SORT_BS_CD, DELIVAY_CENTER_CD, ORDER_GROUP, SALE_DATETIME, CUSTOMER_CD, SLIP_TYPE, SLIP_NO, SEQUENCE_NO, ORDER_DATE, SHIPING_DATE, OTORGCD, ORDORGCD, RLYBSCD, DIRECTION_CD, PISTON_ID, DELIVALY_RANK, BULK_DELIVALY_NO, DIVMTD, ZZHDVRID, CUSTOMER_NM, HEADER_PRICE_SALE, ZREGPRCC, TAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, COMPANY_CD, SALE_TYPE, HVRT_REASON, HVRT_INOUT_DATE, CNG_PRT_SLIP_NO, PROCESS_TYPE, EOS_ORD_AFT_FLG, EOS_SLIP_NO, HDRD_BX_TYPE, INOT_RFSL_TYPE, BX_MNT_RFSL_TYPE, REPORT_MERFE_TIMING, REPORT_OUT_DATETIME, CLIENT_ID, KWMENG, STATUS_CD, STG_VAL, DETAIL_PRICE_SALE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_RECEIVE_PLAN_ID
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
public class LoaderOfEReturnedReceivePlan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EReturnedReceivePlan> _selectedList;
    protected BehaviorSelector _selector;
    protected EReturnedReceivePlanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEReturnedReceivePlan ready(List<EReturnedReceivePlan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EReturnedReceivePlanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EReturnedReceivePlanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EReturnedReceivePlan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
