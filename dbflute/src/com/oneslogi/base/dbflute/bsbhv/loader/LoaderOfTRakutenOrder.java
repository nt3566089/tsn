package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_RAKUTEN_ORDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     RAKUTEN_ORDER_ID
 *
 * [column]
 *     RAKUTEN_ORDER_ID, ORDER_NO, ORDER_STATUS, CARD_STATUS, PAYMENT_DT, SHIPPING_DT, DELIV_TZ, DELIV_DT, PERSON_IN_CHARGE, SINGLE_MEMO, MAIL_INPUT, FIRST_PAYMENT, TERMINAL, MAIL_CARRIER_CD, GIFT_FLG, RAKUTEN_ORDER_COMMENT, ORDER_DATETIME, MULTI_DELIV_FLG, ALERT_FLG, MEMBER_FLG, TOTAL, TAX, CARRIAGE, COD, AMOUNT_BILLED, TOTAL_AMOUNT, COMBINE_ID, COMBINE_STATUS, COMBINE_TOTAL, COMBINE_CARRIAGE, COMBINE_COD, COMBINE_TAX, COMBINE_BILLED, COMBINE_AMOUNT, COMBINE_BANK_FEE, COMBINE_POINT_USE, MAIL_FLG, ORDER_DT, ORDER_TIME, MOBILE_PAYMENT_NO, HISTORY_MOD_FLG, HISTORY_ICON_FLG, HISTORY_MAIL_FLG, DELIV_MATCH_FLG, POINT_USE_FLG, ORDER_ZIP_CD1, ORDER_ZIP_CD2, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM1, ORDER_CUSTOMER_NM2, ORDER_CUSTOMER_KN1, ORDER_CUSTOMER_KN2, ORDER_TEL_NO1, ORDER_TEL_NO2, ORDER_TEL_NO3, MAIL_ADDRESS, ORDER_SEX, ORDER_BIRTHDAY, PAYMENT_METHOD, CARD_TYPE, CARD_NO, CARD_NM, CARD_AVAILABLE, CARD_INST, CARD_INST_COMMENT, DELIV_METHOD, DELIV_TYPE, POINT_USE, POINT_CONDITION, POINT_STATUS, BANK_STATUS, BANK_FEE_FLG, BANK_FEE, WRAPPING_TITLE_P, WRAPPING_NM_P, WRAPPING_FEE_P, WRAPPING_TAX_P, WRAPPING_TITLE_R, WRAPPING_NM_R, WRAPPING_FEE_R, WRAPPING_TAX_R, DELIV_CARRIAGE, DELIV_COD, DELIV_TAX, CARRIER_TRACE_NUM, DELIV_TOTAL, NOSHI, DELIV_ZIP_CD1, DELIV_ZIP_CD2, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_CUSTOMER_KN1, DELIV_CUSTOMER_KN2, DELIV_TEL_NO1, DELIV_TEL_NO2, DELIV_TEL_NO3, PRODUCT_ID, PRODUCT_NM, PRODUCT_NO, PRODUCT_URL, UNIT_PRICE, ORDER_NUM, PRODUCT_CARRIAGE, PRODUCT_TAX, PRODUCT_COD, ITEM_CHOICE, POINT_SCALE, POINT_TYPE, RECORD_NUMBER, DELIVERY_INFO, STOCK_TYPE, WRAPPING_TYPE_P, WRAPPING_TYPE_R, TOMORROW_FLG, COUPON_USE, SHOP_COUPON_USE, RAKUTEN_COUPON_USE, COMBINE_COUPON_USE, DELIV_COMPANY, PHAMACE_FLG, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RAKUTEN_ORDER_ID
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
public class LoaderOfTRakutenOrder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TRakutenOrder> _selectedList;
    protected BehaviorSelector _selector;
    protected TRakutenOrderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTRakutenOrder ready(List<TRakutenOrder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TRakutenOrderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TRakutenOrderBhv.class); return _myBhv; } }

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
    public List<TRakutenOrder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
