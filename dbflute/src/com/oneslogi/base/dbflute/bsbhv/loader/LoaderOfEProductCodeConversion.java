package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_PRODUCT_CODE_CONVERSION as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_CODE_CONVERSION_ID
 *
 * [column]
 *     PRODUCT_CODE_CONVERSION_ID, JTTSFLG, COMPANYCD, ITEMCD_FROM, ITEMCD_TO, QTY, SEND_CD, WORK_FLG, CENTER_CD, SEND_ROW_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfEProductCodeConversion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EProductCodeConversion> _selectedList;
    protected BehaviorSelector _selector;
    protected EProductCodeConversionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEProductCodeConversion ready(List<EProductCodeConversion> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EProductCodeConversionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EProductCodeConversionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EProductCodeConversion> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
