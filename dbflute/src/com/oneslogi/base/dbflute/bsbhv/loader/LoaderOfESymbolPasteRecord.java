package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SYMBOL_PASTE_RECORD as TABLE. <br>
 * <pre>
 * [primary key]
 *     E_SYMBOL_PASTE_RECORD_ID
 *
 * [column]
 *     E_SYMBOL_PASTE_RECORD_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, RCV_KEY, PRODUCT_CD, FIRMTRANSPORT_NO, MANUFACTUR_DATE, PRINTER_NO, MAKE_NO, DESIGN_CD, STOCK_TYPE, MAKER_CASE_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_SYMBOL_PASTE_RECORD_ID
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
public class LoaderOfESymbolPasteRecord {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ESymbolPasteRecord> _selectedList;
    protected BehaviorSelector _selector;
    protected ESymbolPasteRecordBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfESymbolPasteRecord ready(List<ESymbolPasteRecord> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ESymbolPasteRecordBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ESymbolPasteRecordBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ESymbolPasteRecord> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
