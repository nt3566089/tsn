package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_PRINT_REQUEST_BINARY as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_REQUEST_BINARY_ID
 *
 * [column]
 *     PRINT_REQUEST_BINARY_ID, PRINT_REQUEST_ID, SRC_FILE_INDEX, REPORT_BINARY, PRINT_CUSTOM_RANGE_FLG, PRINT_FIRST_PAGE, PRINT_LAST_PAGE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_BINARY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrintRequestBinary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintRequestBinary> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintRequestBinaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintRequestBinary ready(List<PPrintRequestBinary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintRequestBinaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintRequestBinaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrintRequest _foreignPPrintRequestLoader;
    public LoaderOfPPrintRequest pulloutPPrintRequest() {
        if (_foreignPPrintRequestLoader == null)
        { _foreignPPrintRequestLoader = new LoaderOfPPrintRequest().ready(myBhv().pulloutPPrintRequest(_selectedList), _selector); }
        return _foreignPPrintRequestLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrintRequestBinary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
