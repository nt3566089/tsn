package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_PRINT_SERVICE as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_SERVICE_ID
 *
 * [column]
 *     PRINT_SERVICE_ID, PRINT_SERVICE_NM, TERMINAL_NM, MAC_ADDRESS, PRINTER_GROUP_ID, PRINT_SERVICE_STATUS, START_DT, END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByPrintServiceStatus)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlByPrintServiceStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrintService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintService> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintService ready(List<PPrintService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintServiceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByPrintServiceStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintServiceStatus() {
        if (_foreignBClassDtlByPrintServiceStatusLoader == null)
        { _foreignBClassDtlByPrintServiceStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintServiceStatus(_selectedList), _selector); }
        return _foreignBClassDtlByPrintServiceStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrintService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
