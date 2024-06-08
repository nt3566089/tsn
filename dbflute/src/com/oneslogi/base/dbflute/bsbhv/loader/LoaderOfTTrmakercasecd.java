package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRMAKERCASECD as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRMAKERCASECD_ID
 *
 * [column]
 *     TRMAKERCASECD_ID, SEQNO, RECEIVE_PLAN_H_ID, WAREHOUSECD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, CARRIERNO, CARRIERWBNO, NUMBER_OF_PALLETS, SSCC, CASENO, MAKERCASENO, LOT4, RESULTFLG, RECEIVEDFLG, IFRECEIVEDFLG, SYMBOLNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMAKERCASECD_ID
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
public class LoaderOfTTrmakercasecd {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrmakercasecd> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrmakercasecdBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrmakercasecd ready(List<TTrmakercasecd> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrmakercasecdBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrmakercasecdBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrmakercasecd> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
