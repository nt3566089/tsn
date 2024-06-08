package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_LS_REPORT_PRINTER_BY_SITE as TABLE. <br>
 * <pre>
 * [primary key]
 *     WAREHOUSE_CD
 *
 * [column]
 *     WAREHOUSE_CD, REPORT_FORM_NAME, PRINTER_GROUP, LINE_NO, REPORT_SERVER_NAME, REPORT_PRINTER_NAME, FLOOR, AUTO_FLG, TERMINAL_CD, PRITER_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfPLsReportPrinterBySite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PLsReportPrinterBySite> _selectedList;
    protected BehaviorSelector _selector;
    protected PLsReportPrinterBySiteBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPLsReportPrinterBySite ready(List<PLsReportPrinterBySite> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PLsReportPrinterBySiteBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PLsReportPrinterBySiteBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PLsReportPrinterBySite> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
