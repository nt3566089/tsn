package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_STOCK_RECORD_RECEIVE as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_RECORD_RECEIVE_ID
 *
 * [column]
 *     STOCK_RECORD_RECEIVE_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STOCK_DATE, WAREHOUSE_CD, PRODUCT_CD, COMPANY_CD, STOCK_QTY_SIGN, STOCK_QTY, DAMAGE_ITEM_QTY_SIGN, DAMAGE_ITEM_QTY, REFUND_ITEM_QTY_SIGN, REFUND_ITEM_QTY, STORAGE_LOCATION, SKU_CD, QUANTITY_UNIT, BAT_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_RECORD_RECEIVE_ID
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
public class LoaderOfEStockRecordReceive {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EStockRecordReceive> _selectedList;
    protected BehaviorSelector _selector;
    protected EStockRecordReceiveBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEStockRecordReceive ready(List<EStockRecordReceive> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EStockRecordReceiveBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EStockRecordReceiveBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EStockRecordReceive> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
