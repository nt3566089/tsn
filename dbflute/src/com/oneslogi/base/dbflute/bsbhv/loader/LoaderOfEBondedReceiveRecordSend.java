package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_BONDED_RECEIVE_RECORD_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONDED_RECEIVE_RECORD_SEND_ID
 *
 * [column]
 *     BONDED_RECEIVE_RECORD_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, FROMSUB, SBWAREHOUSECD, REFNO, RECEIVE_PLAN_DT, CARRIERNO, WAREHOUSE_CD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, RECEIVEDQTY1_SUM, LOT2, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, OTHERLOT1, RECORD_TYPE, DOM_REFNO, JTTSFLG, SEQNO, TRANSPORT_TYPE, RECEIVEDATE, RECEIVEDATETIME, LOTNO, RECEIVEDQTY2_SUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_RECEIVE_RECORD_SEND_ID
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
public class LoaderOfEBondedReceiveRecordSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EBondedReceiveRecordSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EBondedReceiveRecordSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEBondedReceiveRecordSend ready(List<EBondedReceiveRecordSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EBondedReceiveRecordSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EBondedReceiveRecordSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EBondedReceiveRecordSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
