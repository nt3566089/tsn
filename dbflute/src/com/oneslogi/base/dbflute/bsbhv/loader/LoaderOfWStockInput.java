package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_STOCK_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_INPUT_ID
 *
 * [column]
 *     STOCK_INPUT_ID, CLIENT_CD, CENTER_CD, WAREHOUSE_CD, PRODUCT_CD, STOCK_TYPE_CD, LOCATION_CD, DEPOSIT_CD, PROCESS_TYPE_CD, LOT_CD, STORE_LABEL_NO, SUPPLIER_CD, LIMIT_DT, INST_NUM, STOCK_INPUT_COMMENT, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INPUT_ID
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
public class LoaderOfWStockInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WStockInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WStockInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWStockInput ready(List<WStockInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WStockInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WStockInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WStockInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
