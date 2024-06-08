package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_AMAZON_ORDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     AMAZON_ORDER_ID
 *
 * [column]
 *     AMAZON_ORDER_ID, ORDER_ID, ORDER_ITEM_ID, PURCHASE_DATE, PAYMENTS_DATE, BUYER_EMAIL, BUYER_NAME, BUYER_PHONE_NUMBER, SKU, PRODUCT_NAME, QUANTITY_PURCHASED, CURRENCY, ITEM_PRICE, ITEM_TAX, SHIPPING_PRICE, SHIPPING_TAX, GIFT_WRAP_PRICE, GIFT_WRAP_TAX, SHIP_SERVICE_LEVEL, RECIPIENT_NAME, SHIP_ADDRESS_1, SHIP_ADDRESS_2, SHIP_ADDRESS_3, SHIP_CITY, SHIP_STATE, SHIP_POSTAL_CODE, SHIP_COUNTRY, SHIP_PHONE_NUMBER, GIFT_WRAP_TYPE, GIFT_MASSAGE_TEXT, ITEM_PROMOTION_DISCOUNT, ITEM_PROMOTION_ID, SHIP_PROMOTION_DISCOUNT, SHIP_PROMOTION_ID, DELIVERY_START_DATE, DELIVERY_END_DATE, DELIVERY_TIME_ZONE, DELIVERY_INSTRUCTIONS, PAYMENT_METHOD, COD_COLLECTIBLE_AMOUNT, ALREADY_PAID, PAYMENT_METHOD_FEE, SCHEDULED_DELI_ST_DATE, SCHEDULED_DELI_ED_DATE, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     AMAZON_ORDER_ID
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
public class LoaderOfTAmazonOrder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TAmazonOrder> _selectedList;
    protected BehaviorSelector _selector;
    protected TAmazonOrderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTAmazonOrder ready(List<TAmazonOrder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TAmazonOrderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TAmazonOrderBhv.class); return _myBhv; } }

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
    public List<TAmazonOrder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
