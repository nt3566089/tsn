package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_CENTER_STOCK_INFO_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEQNO, PROCESS_DT, WAREHOUSE_CD, WAREHOUSE_NAME, ITEM_CD, ITEM_NAME, LIMIT_DATE, DESIGN_CD, INV_TYPE, INV_NUM, TRANSPORT_CD, FIRMTRANSPORT_CD, SOURCE_CD, SOURCE_NAME, SCH_DATE, RECEIVE_DATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_SORT, USE_TYPE, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_STOCK_INFO_SEND_ID
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
public class LoaderOfECenterStockInfoSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ECenterStockInfoSend> _selectedList;
    protected BehaviorSelector _selector;
    protected ECenterStockInfoSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfECenterStockInfoSend ready(List<ECenterStockInfoSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ECenterStockInfoSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ECenterStockInfoSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ECenterStockInfoSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
