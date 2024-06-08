package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_BARCODE_LABEL as TABLE. <br>
 * <pre>
 * [primary key]
 *     BARCODE_LABEL_ID
 *
 * [column]
 *     BARCODE_LABEL_ID, RECEIVE_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, BARCODE, BARCODE_NM, BARCODE_LABEL_COMMENT, OUTPUT_CNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BARCODE_LABEL_ID
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
public class LoaderOfEBarcodeLabel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EBarcodeLabel> _selectedList;
    protected BehaviorSelector _selector;
    protected EBarcodeLabelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEBarcodeLabel ready(List<EBarcodeLabel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EBarcodeLabelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EBarcodeLabelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EBarcodeLabel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
