package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIPPING_INST as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_ID
 *
 * [column]
 *     SHIPPING_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, EMERGENCY_FLG, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PROCESS_TYPE_CD, DELIV_PLAN_DT, WORK_DT, SHIPPING_DT, DELIVERY_COURSE_CD, DELIV_DT, DELIV_TZ, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, DELIV_ADDRESS_SUPPLY, PICKING_WORK_MESSAGE, PRODUCT_CD, PRODUCT_NM, DEPOSIT_CD, STOCK_TYPE_CD, INST_NUM, LOT, LIMIT_DT, WAREHOUSE_CD, LOCATION_CD, TOTAL_PRICE, TOTAL_TAX, UNIT_PRICE, PRICE, TAX, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_ID
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
public class LoaderOfEShippingInst {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingInst> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingInstBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingInst ready(List<EShippingInst> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingInstBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingInstBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingInst> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
