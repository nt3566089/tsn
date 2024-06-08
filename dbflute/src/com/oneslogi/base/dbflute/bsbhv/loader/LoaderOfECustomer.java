package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_CUSTOMER as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, ALLOC_ORDER, SHIPPING_STOP_FLG, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, CENTER_CD, DELIVERY_COURSE_CD, DELIVERY_ORDER, DELIVERY_READTIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
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
public class LoaderOfECustomer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ECustomer> _selectedList;
    protected BehaviorSelector _selector;
    protected ECustomerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfECustomer ready(List<ECustomer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ECustomerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ECustomerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ECustomer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
