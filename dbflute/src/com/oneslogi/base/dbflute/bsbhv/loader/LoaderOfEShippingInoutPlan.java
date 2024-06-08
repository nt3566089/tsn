package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIPPING_INOUT_PLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INOUT_PLAN_ID
 *
 * [column]
 *     SHIPPING_INOUT_PLAN_ID, SEND_CD, SEND_LOW_CD, WORK_FLG, CENTER_CD, SBWAREHOUSECD, SUPPLIERRCVNO, EXAMKBN, EXAMDATE, EXAMEND, PRODUCT_CD, LOT1, BEFZAIKOINV, BEFLOT4, BEFLOT3, AFTZAIKOINV, AFTLOT4, AFTLOT3, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INOUT_PLAN_ID
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
public class LoaderOfEShippingInoutPlan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingInoutPlan> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingInoutPlanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingInoutPlan ready(List<EShippingInoutPlan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingInoutPlanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingInoutPlanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingInoutPlan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
