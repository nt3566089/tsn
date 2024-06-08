package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_STOCK_REPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, STORE_NUM_DAY, PICKING_NUM_DAY, MOVE_PLS_NUM_DAY, MOVE_MNS_NUM_DAY, ADJ_PLS_NUM_DAY, ADJ_MNS_NUM_DAY, P_CHARGE_NUM_DAY, P_ALLOC_NUM_DAY, P_MOVE_NUM_DAY, P_TRANSIT_NUM_DAY, STORE_NUM_MONTH, PICKING_NUM_MONTH, MOVE_PLS_NUM_MONTH, MOVE_MNS_NUM_MONTH, ADJ_PLS_NUM_MONTH, ADJ_MNS_NUM_MONTH, P_CHARGE_NUM_MONTH, P_ALLOC_NUM_MONTH, P_MOVE_NUM_MONTH, P_TRANSIT_NUM_MONTH, CHARGE_NUM_10, ALLOC_NUM_10, MOVE_NUM_10, TRANSIT_NUM_10, CHARGE_NUM_15, ALLOC_NUM_15, MOVE_NUM_15, TRANSIT_NUM_15, CHARGE_NUM_20, ALLOC_NUM_20, MOVE_NUM_20, TRANSIT_NUM_20, CHARGE_NUM_LAST, ALLOC_NUM_LAST, MOVE_NUM_LAST, TRANSIT_NUM_LAST, LAST_STORE_DT, LAST_PICKING_DT, LASTRECEIVEDATE, LASTSHIPDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_STOCK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tStock
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStockReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStockReport> _selectedList;
    protected BehaviorSelector _selector;
    protected TStockReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStockReport ready(List<TStockReport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStockReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStockReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStockReport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
