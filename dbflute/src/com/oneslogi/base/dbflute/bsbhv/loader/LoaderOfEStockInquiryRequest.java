package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_STOCK_INQUIRY_REQUEST as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_INQUIRY_REQUEST_ID
 *
 * [column]
 *     STOCK_INQUIRY_REQUEST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INV_INQ_NO, INV_INQ_DATE, COMPANY_CD, ITEM_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INQUIRY_REQUEST_ID
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
public class LoaderOfEStockInquiryRequest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EStockInquiryRequest> _selectedList;
    protected BehaviorSelector _selector;
    protected EStockInquiryRequestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEStockInquiryRequest ready(List<EStockInquiryRequest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EStockInquiryRequestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EStockInquiryRequestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EStockInquiryRequest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
