package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_RECEIVE_RECORD_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_RECORD_SEND_ID
 *
 * [column]
 *     RECEIVE_RECORD_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, USERNUM1, RECORD_TYPE, JTTSFLG, REFNO, SEQNO, TRANSPORT_TYPE, SUPPLIERCD, WAREHOUSE_CD, RECEIVEDATE, RECEIVEDATETIME, PRODUCT_CD, LOTNO, EXPECT_QTY_SUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_RECORD_SEND_ID
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
public class LoaderOfEReceiveRecordSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EReceiveRecordSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EReceiveRecordSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEReceiveRecordSend ready(List<EReceiveRecordSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EReceiveRecordSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EReceiveRecordSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EReceiveRecordSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
