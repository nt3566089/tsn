package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_ZIP_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, ADDRESS1, ADDRESS2, ADDRESS3, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
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
public class LoaderOfWZipInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WZipInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WZipInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWZipInput ready(List<WZipInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WZipInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WZipInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WZipInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
