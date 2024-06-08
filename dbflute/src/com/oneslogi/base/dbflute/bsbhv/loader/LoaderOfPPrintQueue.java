package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_PRINT_QUEUE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_QUEUE_ID
 *
 * [column]
 *     PRINT_QUEUE_ID, PRINT_REQUEST_ID, PRINTER_GROUP_ID, PRINT_QUEUE_STATUS, PRINTER_NM, TRAY_NM, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_QUEUE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(ByPrintQueueStatus)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest, bClassDtlByPrintQueueStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrintQueue {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintQueue> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintQueueBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintQueue ready(List<PPrintQueue> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintQueueBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintQueueBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrintRequest _foreignPPrintRequestLoader;
    public LoaderOfPPrintRequest pulloutPPrintRequest() {
        if (_foreignPPrintRequestLoader == null)
        { _foreignPPrintRequestLoader = new LoaderOfPPrintRequest().ready(myBhv().pulloutPPrintRequest(_selectedList), _selector); }
        return _foreignPPrintRequestLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPrintQueueStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintQueueStatus() {
        if (_foreignBClassDtlByPrintQueueStatusLoader == null)
        { _foreignBClassDtlByPrintQueueStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintQueueStatus(_selectedList), _selector); }
        return _foreignBClassDtlByPrintQueueStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrintQueue> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
