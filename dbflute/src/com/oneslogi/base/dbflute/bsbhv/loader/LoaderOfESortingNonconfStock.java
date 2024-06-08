package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SORTING_NONCONF_STOCK as TABLE. <br>
 * <pre>
 * [primary key]
 *     SORTING_NONCONF_STOCK_ID
 *
 * [column]
 *     SORTING_NONCONF_STOCK_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STOCK_DATE, WAREHOUSE_CD, PRODUCT_CD, COMPANY_CD, STOCK_QTY_SIGN, STOCK_QTY, PENDING_ITEM_QTY_SIGN, PENDING_ITEM_QTY, INSPECTION_ITEM_QTY_SIGN, INSPECTION_ITEM_QTY, PRODUCT_NM, OUTPUT_ORDER, INOUT_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORTING_NONCONF_STOCK_ID
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
public class LoaderOfESortingNonconfStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ESortingNonconfStock> _selectedList;
    protected BehaviorSelector _selector;
    protected ESortingNonconfStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfESortingNonconfStock ready(List<ESortingNonconfStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ESortingNonconfStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ESortingNonconfStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ESortingNonconfStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
