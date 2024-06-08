package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_LOCATION_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOCATION_INPUT_ID
 *
 * [column]
 *     LOCATION_INPUT_ID, CENTER_CD, WAREHOUSE_CD, ZONE_CD, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, RESTOCK_PRODUCT_CD, RESTOCK_STOCK_TYPE_CD, RESTOCK_DEPOSIT_CD, RESTOCK_SHAPE_CD, RESTOCK_POINT_NUM, MAX_STORE_SHAPE_CD, MAX_STORE_NUM, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_INPUT_ID
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
public class LoaderOfWLocationInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WLocationInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WLocationInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWLocationInput ready(List<WLocationInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WLocationInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WLocationInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WLocationInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
