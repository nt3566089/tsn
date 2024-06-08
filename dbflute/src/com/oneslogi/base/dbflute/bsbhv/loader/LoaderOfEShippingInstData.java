package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHIPPING_INST_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_DATA_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INSTRUCTIONS_DATE, OWNER_DIRECT_NO, SALES_TYPE, SHIPTO_CODE, PRODUCT_CD, EXPECT_QTY, UNIT_PRICE, PLAN_PRICE_TOTAL, PLAN_NAME, PLANPOST, PLAN_ADRESS1, PLAN_ADRESS2, PLAN_PRODUCT_NAME, WAREHOUSE_PLANT, WAREHOUSE_PLANT_NAME, ORDER_DATE, DELIVERY_DATE, PURCHASE_NO, ORDER_NUMBER, ITEM_LINE_NO, SKU_CODE, CARDBOARD, CARTON, TOTAL_QTY, NOTE, RESERVE2, RESERVE3, RESERVE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_ID
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
public class LoaderOfEShippingInstData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingInstData> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingInstDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingInstData ready(List<EShippingInstData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingInstDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingInstDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingInstData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
