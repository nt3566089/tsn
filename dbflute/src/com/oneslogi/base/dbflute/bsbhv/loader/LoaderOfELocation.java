package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_LOCATION as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, LOCATION_CD, LOCATION_NM, WAREHOUSE_CD, ZONE_CD, LOCATION_TYPE, PICKING_LOCATION_FLG, ALLOC_NG_FLG, PICKING_ORDER, ALLOC_ORDER, CLIENT_CD, REPLENISH_PRODUCT_CD, REPLENISH_STOCK_TYPE_CD, REPLENISH_DEPOSIT_CD, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_CD, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
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
public class LoaderOfELocation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ELocation> _selectedList;
    protected BehaviorSelector _selector;
    protected ELocationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfELocation ready(List<ELocation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ELocationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ELocationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ELocation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
