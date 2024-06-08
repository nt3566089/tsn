package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_SHOP_IMPORT_SEND as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHOP_IMPORT_SEND_ID
 *
 * [column]
 *     SHOP_IMPORT_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, WAREHOUSE_SNAME, FACTORY_CD, FACTORY_SNAME, ITEM_CD_CASE, ITEM_SNAME_CASE, ITEM_CD_WH, ITEM_SNAME_WH, RCV_KEY, MACHINE_NO, CREATE_NO, LIMIT_DATE_NOW, DESIGN_CD_CASE, FIRMTRANSPORT_NO, MANUFACTURE_CD, OTHER_LOT1, CASE_CREATE_TYPE, CODE_SNAME, RECEIVE_DATE, ARRIVAL_PORT_DATE, SHIP_NAME, INIT_NUM, MIXED_FLG, LEND_FLG, LOC_GROUP, LOC_CD, SHIP_DATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, SHIP_TO_CD, SHIP_TO_SNAME, CREATE_DATETIME, TRACE_TYPE, TRACE_TYPE_SNAME, EXAM_STS, CASE_IN_NUM, SHIPPING_NUM, ASSORT_DATETIME, LINE_BLOCK, ASSORTED_UNIT, ASSORTED_INDEX, OPERATION_CODE, OPERATION_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, SUPPLIER_RCV_NO, TOKUHAN_CD, TOKUHAN_SNAME, MAKER_CASE_NO, CASE_ITF_NO, CASE_BARCODE_VALIANT, CASE_LOT4, CASE_CENTER_NO, CASE_PACK_NO, CASE_PACK_TIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIER_NO, ORDER_NO, SRC_CD, BL_NO, INVOICE_NO, SSCC, CASE_NO, INV_NUM, SORT_NUM, ADOPT_NUM, DELIVERY_DATETIME, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_IMPORT_SEND_ID
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
public class LoaderOfEShopImportSend {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShopImportSend> _selectedList;
    protected BehaviorSelector _selector;
    protected EShopImportSendBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShopImportSend ready(List<EShopImportSend> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShopImportSendBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShopImportSendBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShopImportSend> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
