package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_STOCK_INQUIRY_ANSWER as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRINVREANSWER_ID
 *
 * [column]
 *     TRINVREANSWER_ID, INVINQNO, INVINQDATE, COMPANYCD, PRODUCT_CD, MANUFACTURDATE, DESIGNCD, STOCKKBN, STOCKQTY, TRANSPORTCD, FIRMCARRYNO, SHIPCD, SHIPSCHDATE, RECEIVEDATE, RCVSCHDATE, EXPECTQTY, GETDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVREANSWER_ID
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
public class LoaderOfEStockInquiryAnswer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EStockInquiryAnswer> _selectedList;
    protected BehaviorSelector _selector;
    protected EStockInquiryAnswerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEStockInquiryAnswer ready(List<EStockInquiryAnswer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EStockInquiryAnswerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EStockInquiryAnswerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EStockInquiryAnswer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
