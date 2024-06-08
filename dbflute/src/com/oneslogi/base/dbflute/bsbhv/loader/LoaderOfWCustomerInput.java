package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of W_CUSTOMER_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_INPUT_ID
 *
 * [column]
 *     CUSTOMER_INPUT_ID, CLIENT_CD, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, CENTER_CD, DELIVERY_COURSE_CD, DELIVERY_ORDER, DELIVERY_READ_TIME, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_INPUT_ID
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
public class LoaderOfWCustomerInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WCustomerInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WCustomerInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWCustomerInput ready(List<WCustomerInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WCustomerInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WCustomerInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WCustomerInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
