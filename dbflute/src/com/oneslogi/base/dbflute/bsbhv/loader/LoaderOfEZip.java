package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_ZIP as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZIP_ID
 *
 * [column]
 *     ZIP_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZIP_CD, PUBLIC_CD, ZIP_CD5, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_ID
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
public class LoaderOfEZip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EZip> _selectedList;
    protected BehaviorSelector _selector;
    protected EZipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEZip ready(List<EZip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EZipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EZipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EZip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
