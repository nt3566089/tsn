package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_YAHOO_ORDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     YAHOO_ORDER_ID
 *
 * [column]
 *     YAHOO_ORDER_ID, ORDER_ID, PARENT_ORDER_ID, DEVICE_TYPE, IS_AFFILIATE, FSP_LICENSE_CODE, FSP_LICENSE_NAME, ORDER_TIME, ORDER_TIME_UNIX_EPOCH, USE_POINT_TYPE, ORDER_STATUS, STORE_STATUS, REFERER, ENTRY_POINT, CLINK, SUSPECT_MESSAGE, IS_ITEM_COUPON, IS_SHIPPING_COUPON, SHIP_NAME, SHIP_FIRST_NAME, SHIP_LAST_NAME, SHIP_ADDRESS1, SHIP_ADDRESS2, SHIP_CITY, SHIP_PREFECTURE, SHIP_ZIP_CODE, SHIP_NAME_KANA, SHIP_FIRST_NAME_KANA, SHIP_LAST_NAME_KANA, SHIP_ADDRESS1_KANA, SHIP_ADDRESS2_KANA, SHIP_CITY_KANA, SHIP_PREFECTURE_KANA, SHIP_SECTION1_FIELD, SHIP_SECTION1_VALUE, SHIP_SECTION2_FIELD, SHIP_SECTION2_VALUE, SHIP_PHONE_NUMBER, SHIP_EMG_PHONE_NUMBER, SHIP_METHOD, SHIP_METHOD_NAME, SHIP_REQUEST_DATE, SHIP_REQUEST_TIME, SHIP_NOTES, ARRIVE_TYPE, SHIP_INVOICE_NUMBER1, SHIP_INVOICE_NUMBER2, SHIP_URL, SHIP_DATE, GIFT_WRAP_TYPE, GIFT_WRAP_PAPER_TYPE, GIFT_WRAP_NAME, NEED_BILL_SLIP, NEED_DETAILED_SLIP, NEED_RECEIPT, OPTION1_FIELD, OPTION1_VALUE, OPTION2_FIELD, OPTION2_VALUE, GIFT_WRAP_MASSAGE, BILL_NAME, BILL_FIRST_NAME, BILL_LAST_NAME, BILL_ADDRESS1, BILL_ADDRESS2, BILL_CITY, BILL_PREFECTURE, BILL_ZIP_CODE, BILL_NAME_KANA, BILL_FIRST_NAME_KANA, BILL_LAST_NAME_KANA, BILL_ADDRESS1_KANA, BILL_ADDRESS2_KANA, BILL_CITY_KANA, BILL_PREFECTURE_KANA, BILL_SECTION1_FIELD, BILL_SECTION1_VALUE, BILL_SECTION2_FIELD, BILL_SECTION2_VALUE, BILL_PHONE_NUMBER, BILL_EMG_PHONE_NUMBER, BILL_MAIL_ADDRESS, PAY_MATHOD, PAY_MATHOD_NAME, PAY_KIND, CARD_PAY_COUNT, CARD_PAY_TYPE, SETTLE_STATUS, SETTLE_ID, PAY_NO, PAY_NO_ISSUE_DATE, PAY_DATE, BUYER_COMMENTS, AGE_CONFIRM, QUANTITY_DETAIL, SHIP_CHARGE, PAY_CHARGE, GIFT_WRAP_CHARGE, DISCOUNT, ADJUSTMENTS, USE_POINT, GET_POINT, TOTAL, TOTAL_PRICE, SHIPPING_C_DISCOUNT, ITEM_C_DISCOUNT, TOTAL_MALL_C_DISCOUNT, GET_POINT_CRG_TO_STORE, LINE_ID, QUANTITY, ITEM_ID, SUB_CODE, TITLE, ITEM_OPTION_NAME, ITEM_OPTION_VALUE, SUB_CODE_OPTION, INSCRIPTION_NAME, INSCRIPTION_VALUE, UNIT_PRICE, UNIT_GET_POINT, LINE_SUB_TOTAL, LINE_GET_POINT, POINT_FSP_CODE, ITEM_CONDITION, COUPON_ID, COUPON_DISCOUNT, ORIGINAL_PRICE, IS_GET_POINT_FIX, GET_POINT_FIX_DATE, RELEASE_DATE, GET_POINT_TYPE, JAN, PRODUCT_ID, POINT_CHARGED_TO_STORE, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     YAHOO_ORDER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tEcOrderB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTYahooOrder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TYahooOrder> _selectedList;
    protected BehaviorSelector _selector;
    protected TYahooOrderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTYahooOrder ready(List<TYahooOrder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TYahooOrderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TYahooOrderBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTEcOrderB _foreignTEcOrderBLoader;
    public LoaderOfTEcOrderB pulloutTEcOrderB() {
        if (_foreignTEcOrderBLoader == null)
        { _foreignTEcOrderBLoader = new LoaderOfTEcOrderB().ready(myBhv().pulloutTEcOrderB(_selectedList), _selector); }
        return _foreignTEcOrderBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TYahooOrder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
