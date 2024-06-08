package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_RECEIVE_PLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, STOCK_TYPE_CD, PLAN_DEPOSIT_CD, PRODUCT_CD, PRODUCT_NM, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_ID
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
public class LoaderOfEReceivePlan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EReceivePlan> _selectedList;
    protected BehaviorSelector _selector;
    protected EReceivePlanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEReceivePlan ready(List<EReceivePlan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EReceivePlanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EReceivePlanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EReceivePlan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
