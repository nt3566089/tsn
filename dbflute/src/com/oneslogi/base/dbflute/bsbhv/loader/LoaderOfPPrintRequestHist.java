package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of P_PRINT_REQUEST_HIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRINT_REQUEST_HIST_ID
 *
 * [column]
 *     PRINT_REQUEST_HIST_ID, PRINT_REQUEST_ID, PRINT_REQUEST_NO, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_RESULT_CLASS, PROCESS_INFO, QUEUE_ADD_DT, PRINT_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pPrintRequest, bClassDtlBySheetCollate, bClassDtlByPrintResultClass
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPPrintRequestHist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PPrintRequestHist> _selectedList;
    protected BehaviorSelector _selector;
    protected PPrintRequestHistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPPrintRequestHist ready(List<PPrintRequestHist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PPrintRequestHistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PPrintRequestHistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPPrintRequest _foreignPPrintRequestLoader;
    public LoaderOfPPrintRequest pulloutPPrintRequest() {
        if (_foreignPPrintRequestLoader == null)
        { _foreignPPrintRequestLoader = new LoaderOfPPrintRequest().ready(myBhv().pulloutPPrintRequest(_selectedList), _selector); }
        return _foreignPPrintRequestLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySheetCollateLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySheetCollate() {
        if (_foreignBClassDtlBySheetCollateLoader == null)
        { _foreignBClassDtlBySheetCollateLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySheetCollate(_selectedList), _selector); }
        return _foreignBClassDtlBySheetCollateLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPrintResultClassLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPrintResultClass() {
        if (_foreignBClassDtlByPrintResultClassLoader == null)
        { _foreignBClassDtlByPrintResultClassLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPrintResultClass(_selectedList), _selector); }
        return _foreignBClassDtlByPrintResultClassLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PPrintRequestHist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
