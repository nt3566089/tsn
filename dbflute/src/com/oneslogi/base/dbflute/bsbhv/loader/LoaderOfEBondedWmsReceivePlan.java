package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_BONDED_WMS_RECEIVE_PLAN as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONDED_WMS_RECEIVE_PLAN_ID
 *
 * [column]
 *     BONDED_WMS_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, NOTES, SBWAREHOUSECD, SUPPLIERRCVNO, RCVSCHDATE, CARRIERNO, SHIPTOCD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, EXPECTQTY1, FROMFAX, BATJMFYM, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, BL_NO, CARRIERNAME, FROMEMAIL, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_WMS_RECEIVE_PLAN_ID
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
public class LoaderOfEBondedWmsReceivePlan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EBondedWmsReceivePlan> _selectedList;
    protected BehaviorSelector _selector;
    protected EBondedWmsReceivePlanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEBondedWmsReceivePlan ready(List<EBondedWmsReceivePlan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EBondedWmsReceivePlanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EBondedWmsReceivePlanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EBondedWmsReceivePlan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
