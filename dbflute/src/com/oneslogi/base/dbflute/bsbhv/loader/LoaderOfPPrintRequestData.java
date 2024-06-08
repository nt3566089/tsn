package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_PRINT_REQUEST_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_LAYOUT_DATA, SUBREP_LAYOUT_DATA, REPORT_LAYOUT_BINARY, SUBREP_LAYOUT_BINARY, DATA_FOR_REPORT, CULTURE_CD, TIME_ZONE_CD, DATE_TIME_FORMAT, DATE_FORMAT, TIME_FORMAT, NUMBER_FORMAT, CURRENCY_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_ID
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
public class LoaderOfPPrintRequestData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintRequestData> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintRequestDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintRequestData ready(List<PPrintRequestData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintRequestDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintRequestDataBhv.class); return _myBhv; } }

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
    public List<PPrintRequestData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
