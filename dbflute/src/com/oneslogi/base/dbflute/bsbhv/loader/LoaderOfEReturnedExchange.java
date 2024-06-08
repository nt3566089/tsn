package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_RETURNED_EXCHANGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     RETURNED_EXCHANGE_ID
 *
 * [column]
 *     RETURNED_EXCHANGE_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, RCVTYPE, SYHN_KBN, RECORD_TYPE, SUPPLIERRCVNO, SEQNO, WORK_TYPE, OTHERREFNO1, RMANO, OTHERREFNO3, SUPPLIERCD, FROMADDRESS2, FROMADDRESS1, IFITEMCD, RECEIVEDQTY1, PRICE_WHOLESALE, LOT2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_EXCHANGE_ID
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
public class LoaderOfEReturnedExchange {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EReturnedExchange> _selectedList;
    protected BehaviorSelector _selector;
    protected EReturnedExchangeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEReturnedExchange ready(List<EReturnedExchange> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EReturnedExchangeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EReturnedExchangeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EReturnedExchange> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
