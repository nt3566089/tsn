package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of H_STOCK_REPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_REPORT_ID
 *
 * [column]
 *     STOCK_REPORT_ID, HIST_DT, STOCK_ID, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, STORE_NUM_DAY, PICKING_NUM_DAY, MOVE_PLS_NUM_DAY, MOVE_MNS_NUM_DAY, ADJ_PLS_NUM_DAY, ADJ_MNS_NUM_DAY, P_CHARGE_NUM_DAY, P_ALLOC_NUM_DAY, P_MOVE_NUM_DAY, P_TRANSIT_NUM_DAY, STORE_NUM_MONTH, PICKING_NUM_MONTH, MOVE_PLS_NUM_MONTH, MOVE_MNS_NUM_MONTH, ADJ_PLS_NUM_MONTH, ADJ_MNS_NUM_MONTH, P_CHARGE_NUM_MONTH, P_ALLOC_NUM_MONTH, P_MOVE_NUM_MONTH, P_TRANSIT_NUM_MONTH, CHARGE_NUM_10, ALLOC_NUM_10, MOVE_NUM_10, TRANSIT_NUM_10, CHARGE_NUM_15, ALLOC_NUM_15, MOVE_NUM_15, TRANSIT_NUM_15, CHARGE_NUM_20, ALLOC_NUM_20, MOVE_NUM_20, TRANSIT_NUM_20, CHARGE_NUM_LAST, ALLOC_NUM_LAST, MOVE_NUM_LAST, TRANSIT_NUM_LAST, LAST_STORE_DT, LAST_PICKING_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_REPORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_STOCK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hStock
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHStockReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HStockReport> _selectedList;
    protected BehaviorSelector _selector;
    protected HStockReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHStockReport ready(List<HStockReport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HStockReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HStockReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HStockReport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
