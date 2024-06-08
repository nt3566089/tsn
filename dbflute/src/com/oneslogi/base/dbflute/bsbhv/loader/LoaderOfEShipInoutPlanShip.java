package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIP_INOUT_PLAN_SHIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIP_INOUT_PLAN_SHIP_ID
 *
 * [column]
 *     SHIP_INOUT_PLAN_SHIP_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, WAREHOUSE_CD, REF_NO, SHIP_CD, SHIP_SCH_DATE, SHIP_TO_CD, SHIP_TO_SCH_DATE, DATA_TYPE, ITEM_CD, QTY, SUB_WAREHOUSE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIP_INOUT_PLAN_SHIP_ID
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
public class LoaderOfEShipInoutPlanShip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShipInoutPlanShip> _selectedList;
    protected BehaviorSelector _selector;
    protected EShipInoutPlanShipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShipInoutPlanShip ready(List<EShipInoutPlanShip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShipInoutPlanShipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShipInoutPlanShipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShipInoutPlanShip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
