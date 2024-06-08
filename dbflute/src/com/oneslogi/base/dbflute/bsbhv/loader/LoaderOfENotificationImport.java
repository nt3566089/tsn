package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_NOTIFICATION_IMPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     NOTIFICATION_IMPORT_ID
 *
 * [column]
 *     NOTIFICATION_IMPORT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, WAREHOUSECD, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, DATATYPE, PRODUCT_CD, QTY, SUBWAREHOUSECD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NOTIFICATION_IMPORT_ID
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
public class LoaderOfENotificationImport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ENotificationImport> _selectedList;
    protected BehaviorSelector _selector;
    protected ENotificationImportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfENotificationImport ready(List<ENotificationImport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ENotificationImportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ENotificationImportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ENotificationImport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
