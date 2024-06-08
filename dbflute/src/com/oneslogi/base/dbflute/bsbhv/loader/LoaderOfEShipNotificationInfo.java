package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIP_NOTIFICATION_INFO as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIP_NOTIFICATION_INFO_ID
 *
 * [column]
 *     SHIP_NOTIFICATION_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, WAREHOUSE_CD, REF_NO, SHIP_CD, SHIP_SCH_DATE, SHIP_TO_CD, SHIP_TO_SCH_DATE, DATA_TYPE, PRODUCT_CD, QTY, SUB_WAREHOUSE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIP_NOTIFICATION_INFO_ID
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
public class LoaderOfEShipNotificationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShipNotificationInfo> _selectedList;
    protected BehaviorSelector _selector;
    protected EShipNotificationInfoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShipNotificationInfo ready(List<EShipNotificationInfo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShipNotificationInfoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShipNotificationInfoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShipNotificationInfo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
