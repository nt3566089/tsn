package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_DUTY_FREE_INOUT_RESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     DUTY_FREE_INOUT_RESULT_ID
 *
 * [column]
 *     DUTY_FREE_INOUT_RESULT_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, SYMBOL_FACTORY_CD, SYMBOL_ITEM_CD, SYMBOL_SKU, SYMBOL_RECEIVE_CD, SYMBOL_PRODUCT_MARK, SYMBOL_ORDERNO, SYMBOL_PRINTERNO, SYMBOL_MAKENO, SYMBOL_LOT4, SYMBOL_MAKETIME, SYMBOL_CIRCULATION_ID, TRANSPORT_CD, PALLET_ID, INIT_NUM, CREATE_DATETIME, SORTING_DATETIME, TRACE_TYPE, LINE_BLOCK, ASSORT_ED_UNIT, ASSORT_ED_INDEX, OPERATION_CODE, CASE_IN_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, DIST_WAREHOUSE_CD, SYMBOL_RCV_KEY, ITEM_CD, DESIGN_CD, RESESRVE_AREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DUTY_FREE_INOUT_RESULT_ID
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
public class LoaderOfEDutyFreeInoutResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EDutyFreeInoutResult> _selectedList;
    protected BehaviorSelector _selector;
    protected EDutyFreeInoutResultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEDutyFreeInoutResult ready(List<EDutyFreeInoutResult> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EDutyFreeInoutResultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EDutyFreeInoutResultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EDutyFreeInoutResult> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
