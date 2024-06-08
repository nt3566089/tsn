package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of T_AMAZON_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAmazonOrderCQ extends AbstractBsTAmazonOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAmazonOrderCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAmazonOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_AMAZON_ORDER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TAmazonOrderCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TAmazonOrderCIQ xcreateCIQ() {
        TAmazonOrderCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TAmazonOrderCIQ xnewCIQ() {
        return new TAmazonOrderCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_AMAZON_ORDER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TAmazonOrderCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TAmazonOrderCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _amazonOrderId;
    public ConditionValue xdfgetAmazonOrderId()
    { if (_amazonOrderId == null) { _amazonOrderId = nCV(); }
      return _amazonOrderId; }
    protected ConditionValue xgetCValueAmazonOrderId() { return xdfgetAmazonOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AmazonOrderId_Asc() { regOBA("AMAZON_ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AmazonOrderId_Desc() { regOBD("AMAZON_ORDER_ID"); return this; }

    protected ConditionValue _orderId;
    public ConditionValue xdfgetOrderId()
    { if (_orderId == null) { _orderId = nCV(); }
      return _orderId; }
    protected ConditionValue xgetCValueOrderId() { return xdfgetOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_OrderId_Asc() { regOBA("ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_OrderId_Desc() { regOBD("ORDER_ID"); return this; }

    protected ConditionValue _orderItemId;
    public ConditionValue xdfgetOrderItemId()
    { if (_orderItemId == null) { _orderItemId = nCV(); }
      return _orderItemId; }
    protected ConditionValue xgetCValueOrderItemId() { return xdfgetOrderItemId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_OrderItemId_Asc() { regOBA("ORDER_ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_OrderItemId_Desc() { regOBD("ORDER_ITEM_ID"); return this; }

    protected ConditionValue _purchaseDate;
    public ConditionValue xdfgetPurchaseDate()
    { if (_purchaseDate == null) { _purchaseDate = nCV(); }
      return _purchaseDate; }
    protected ConditionValue xgetCValuePurchaseDate() { return xdfgetPurchaseDate(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PurchaseDate_Asc() { regOBA("PURCHASE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PurchaseDate_Desc() { regOBD("PURCHASE_DATE"); return this; }

    protected ConditionValue _paymentsDate;
    public ConditionValue xdfgetPaymentsDate()
    { if (_paymentsDate == null) { _paymentsDate = nCV(); }
      return _paymentsDate; }
    protected ConditionValue xgetCValuePaymentsDate() { return xdfgetPaymentsDate(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentsDate_Asc() { regOBA("PAYMENTS_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentsDate_Desc() { regOBD("PAYMENTS_DATE"); return this; }

    protected ConditionValue _buyerEmail;
    public ConditionValue xdfgetBuyerEmail()
    { if (_buyerEmail == null) { _buyerEmail = nCV(); }
      return _buyerEmail; }
    protected ConditionValue xgetCValueBuyerEmail() { return xdfgetBuyerEmail(); }

    /**
     * Add order-by as ascend. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerEmail_Asc() { regOBA("BUYER_EMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerEmail_Desc() { regOBD("BUYER_EMAIL"); return this; }

    protected ConditionValue _buyerName;
    public ConditionValue xdfgetBuyerName()
    { if (_buyerName == null) { _buyerName = nCV(); }
      return _buyerName; }
    protected ConditionValue xgetCValueBuyerName() { return xdfgetBuyerName(); }

    /**
     * Add order-by as ascend. <br>
     * BUYER_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerName_Asc() { regOBA("BUYER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUYER_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerName_Desc() { regOBD("BUYER_NAME"); return this; }

    protected ConditionValue _buyerPhoneNumber;
    public ConditionValue xdfgetBuyerPhoneNumber()
    { if (_buyerPhoneNumber == null) { _buyerPhoneNumber = nCV(); }
      return _buyerPhoneNumber; }
    protected ConditionValue xgetCValueBuyerPhoneNumber() { return xdfgetBuyerPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerPhoneNumber_Asc() { regOBA("BUYER_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_BuyerPhoneNumber_Desc() { regOBD("BUYER_PHONE_NUMBER"); return this; }

    protected ConditionValue _sku;
    public ConditionValue xdfgetSku()
    { if (_sku == null) { _sku = nCV(); }
      return _sku; }
    protected ConditionValue xgetCValueSku() { return xdfgetSku(); }

    /**
     * Add order-by as ascend. <br>
     * SKU: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Sku_Asc() { regOBA("SKU"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKU: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Sku_Desc() { regOBD("SKU"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _quantityPurchased;
    public ConditionValue xdfgetQuantityPurchased()
    { if (_quantityPurchased == null) { _quantityPurchased = nCV(); }
      return _quantityPurchased; }
    protected ConditionValue xgetCValueQuantityPurchased() { return xdfgetQuantityPurchased(); }

    /**
     * Add order-by as ascend. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_QuantityPurchased_Asc() { regOBA("QUANTITY_PURCHASED"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_QuantityPurchased_Desc() { regOBD("QUANTITY_PURCHASED"); return this; }

    protected ConditionValue _currency;
    public ConditionValue xdfgetCurrency()
    { if (_currency == null) { _currency = nCV(); }
      return _currency; }
    protected ConditionValue xgetCValueCurrency() { return xdfgetCurrency(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENCY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Currency_Asc() { regOBA("CURRENCY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENCY: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Currency_Desc() { regOBD("CURRENCY"); return this; }

    protected ConditionValue _itemPrice;
    public ConditionValue xdfgetItemPrice()
    { if (_itemPrice == null) { _itemPrice = nCV(); }
      return _itemPrice; }
    protected ConditionValue xgetCValueItemPrice() { return xdfgetItemPrice(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPrice_Asc() { regOBA("ITEM_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPrice_Desc() { regOBD("ITEM_PRICE"); return this; }

    protected ConditionValue _itemTax;
    public ConditionValue xdfgetItemTax()
    { if (_itemTax == null) { _itemTax = nCV(); }
      return _itemTax; }
    protected ConditionValue xgetCValueItemTax() { return xdfgetItemTax(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemTax_Asc() { regOBA("ITEM_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemTax_Desc() { regOBD("ITEM_TAX"); return this; }

    protected ConditionValue _shippingPrice;
    public ConditionValue xdfgetShippingPrice()
    { if (_shippingPrice == null) { _shippingPrice = nCV(); }
      return _shippingPrice; }
    protected ConditionValue xgetCValueShippingPrice() { return xdfgetShippingPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShippingPrice_Asc() { regOBA("SHIPPING_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShippingPrice_Desc() { regOBD("SHIPPING_PRICE"); return this; }

    protected ConditionValue _shippingTax;
    public ConditionValue xdfgetShippingTax()
    { if (_shippingTax == null) { _shippingTax = nCV(); }
      return _shippingTax; }
    protected ConditionValue xgetCValueShippingTax() { return xdfgetShippingTax(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShippingTax_Asc() { regOBA("SHIPPING_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShippingTax_Desc() { regOBD("SHIPPING_TAX"); return this; }

    protected ConditionValue _giftWrapPrice;
    public ConditionValue xdfgetGiftWrapPrice()
    { if (_giftWrapPrice == null) { _giftWrapPrice = nCV(); }
      return _giftWrapPrice; }
    protected ConditionValue xgetCValueGiftWrapPrice() { return xdfgetGiftWrapPrice(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapPrice_Asc() { regOBA("GIFT_WRAP_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapPrice_Desc() { regOBD("GIFT_WRAP_PRICE"); return this; }

    protected ConditionValue _giftWrapTax;
    public ConditionValue xdfgetGiftWrapTax()
    { if (_giftWrapTax == null) { _giftWrapTax = nCV(); }
      return _giftWrapTax; }
    protected ConditionValue xgetCValueGiftWrapTax() { return xdfgetGiftWrapTax(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapTax_Asc() { regOBA("GIFT_WRAP_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapTax_Desc() { regOBD("GIFT_WRAP_TAX"); return this; }

    protected ConditionValue _shipServiceLevel;
    public ConditionValue xdfgetShipServiceLevel()
    { if (_shipServiceLevel == null) { _shipServiceLevel = nCV(); }
      return _shipServiceLevel; }
    protected ConditionValue xgetCValueShipServiceLevel() { return xdfgetShipServiceLevel(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipServiceLevel_Asc() { regOBA("SHIP_SERVICE_LEVEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipServiceLevel_Desc() { regOBD("SHIP_SERVICE_LEVEL"); return this; }

    protected ConditionValue _recipientName;
    public ConditionValue xdfgetRecipientName()
    { if (_recipientName == null) { _recipientName = nCV(); }
      return _recipientName; }
    protected ConditionValue xgetCValueRecipientName() { return xdfgetRecipientName(); }

    /**
     * Add order-by as ascend. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_RecipientName_Asc() { regOBA("RECIPIENT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_RecipientName_Desc() { regOBD("RECIPIENT_NAME"); return this; }

    protected ConditionValue _shipAddress1;
    public ConditionValue xdfgetShipAddress1()
    { if (_shipAddress1 == null) { _shipAddress1 = nCV(); }
      return _shipAddress1; }
    protected ConditionValue xgetCValueShipAddress1() { return xdfgetShipAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress1_Asc() { regOBA("SHIP_ADDRESS_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress1_Desc() { regOBD("SHIP_ADDRESS_1"); return this; }

    protected ConditionValue _shipAddress2;
    public ConditionValue xdfgetShipAddress2()
    { if (_shipAddress2 == null) { _shipAddress2 = nCV(); }
      return _shipAddress2; }
    protected ConditionValue xgetCValueShipAddress2() { return xdfgetShipAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress2_Asc() { regOBA("SHIP_ADDRESS_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress2_Desc() { regOBD("SHIP_ADDRESS_2"); return this; }

    protected ConditionValue _shipAddress3;
    public ConditionValue xdfgetShipAddress3()
    { if (_shipAddress3 == null) { _shipAddress3 = nCV(); }
      return _shipAddress3; }
    protected ConditionValue xgetCValueShipAddress3() { return xdfgetShipAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress3_Asc() { regOBA("SHIP_ADDRESS_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipAddress3_Desc() { regOBD("SHIP_ADDRESS_3"); return this; }

    protected ConditionValue _shipCity;
    public ConditionValue xdfgetShipCity()
    { if (_shipCity == null) { _shipCity = nCV(); }
      return _shipCity; }
    protected ConditionValue xgetCValueShipCity() { return xdfgetShipCity(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipCity_Asc() { regOBA("SHIP_CITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipCity_Desc() { regOBD("SHIP_CITY"); return this; }

    protected ConditionValue _shipState;
    public ConditionValue xdfgetShipState()
    { if (_shipState == null) { _shipState = nCV(); }
      return _shipState; }
    protected ConditionValue xgetCValueShipState() { return xdfgetShipState(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_STATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipState_Asc() { regOBA("SHIP_STATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_STATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipState_Desc() { regOBD("SHIP_STATE"); return this; }

    protected ConditionValue _shipPostalCode;
    public ConditionValue xdfgetShipPostalCode()
    { if (_shipPostalCode == null) { _shipPostalCode = nCV(); }
      return _shipPostalCode; }
    protected ConditionValue xgetCValueShipPostalCode() { return xdfgetShipPostalCode(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPostalCode_Asc() { regOBA("SHIP_POSTAL_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPostalCode_Desc() { regOBD("SHIP_POSTAL_CODE"); return this; }

    protected ConditionValue _shipCountry;
    public ConditionValue xdfgetShipCountry()
    { if (_shipCountry == null) { _shipCountry = nCV(); }
      return _shipCountry; }
    protected ConditionValue xgetCValueShipCountry() { return xdfgetShipCountry(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipCountry_Asc() { regOBA("SHIP_COUNTRY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipCountry_Desc() { regOBD("SHIP_COUNTRY"); return this; }

    protected ConditionValue _shipPhoneNumber;
    public ConditionValue xdfgetShipPhoneNumber()
    { if (_shipPhoneNumber == null) { _shipPhoneNumber = nCV(); }
      return _shipPhoneNumber; }
    protected ConditionValue xgetCValueShipPhoneNumber() { return xdfgetShipPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPhoneNumber_Asc() { regOBA("SHIP_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPhoneNumber_Desc() { regOBD("SHIP_PHONE_NUMBER"); return this; }

    protected ConditionValue _giftWrapType;
    public ConditionValue xdfgetGiftWrapType()
    { if (_giftWrapType == null) { _giftWrapType = nCV(); }
      return _giftWrapType; }
    protected ConditionValue xgetCValueGiftWrapType() { return xdfgetGiftWrapType(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapType_Asc() { regOBA("GIFT_WRAP_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftWrapType_Desc() { regOBD("GIFT_WRAP_TYPE"); return this; }

    protected ConditionValue _giftMassageText;
    public ConditionValue xdfgetGiftMassageText()
    { if (_giftMassageText == null) { _giftMassageText = nCV(); }
      return _giftMassageText; }
    protected ConditionValue xgetCValueGiftMassageText() { return xdfgetGiftMassageText(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftMassageText_Asc() { regOBA("GIFT_MASSAGE_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_GiftMassageText_Desc() { regOBD("GIFT_MASSAGE_TEXT"); return this; }

    protected ConditionValue _itemPromotionDiscount;
    public ConditionValue xdfgetItemPromotionDiscount()
    { if (_itemPromotionDiscount == null) { _itemPromotionDiscount = nCV(); }
      return _itemPromotionDiscount; }
    protected ConditionValue xgetCValueItemPromotionDiscount() { return xdfgetItemPromotionDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPromotionDiscount_Asc() { regOBA("ITEM_PROMOTION_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPromotionDiscount_Desc() { regOBD("ITEM_PROMOTION_DISCOUNT"); return this; }

    protected ConditionValue _itemPromotionId;
    public ConditionValue xdfgetItemPromotionId()
    { if (_itemPromotionId == null) { _itemPromotionId = nCV(); }
      return _itemPromotionId; }
    protected ConditionValue xgetCValueItemPromotionId() { return xdfgetItemPromotionId(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPromotionId_Asc() { regOBA("ITEM_PROMOTION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ItemPromotionId_Desc() { regOBD("ITEM_PROMOTION_ID"); return this; }

    protected ConditionValue _shipPromotionDiscount;
    public ConditionValue xdfgetShipPromotionDiscount()
    { if (_shipPromotionDiscount == null) { _shipPromotionDiscount = nCV(); }
      return _shipPromotionDiscount; }
    protected ConditionValue xgetCValueShipPromotionDiscount() { return xdfgetShipPromotionDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPromotionDiscount_Asc() { regOBA("SHIP_PROMOTION_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPromotionDiscount_Desc() { regOBD("SHIP_PROMOTION_DISCOUNT"); return this; }

    protected ConditionValue _shipPromotionId;
    public ConditionValue xdfgetShipPromotionId()
    { if (_shipPromotionId == null) { _shipPromotionId = nCV(); }
      return _shipPromotionId; }
    protected ConditionValue xgetCValueShipPromotionId() { return xdfgetShipPromotionId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPromotionId_Asc() { regOBA("SHIP_PROMOTION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ShipPromotionId_Desc() { regOBD("SHIP_PROMOTION_ID"); return this; }

    protected ConditionValue _deliveryStartDate;
    public ConditionValue xdfgetDeliveryStartDate()
    { if (_deliveryStartDate == null) { _deliveryStartDate = nCV(); }
      return _deliveryStartDate; }
    protected ConditionValue xgetCValueDeliveryStartDate() { return xdfgetDeliveryStartDate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryStartDate_Asc() { regOBA("DELIVERY_START_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryStartDate_Desc() { regOBD("DELIVERY_START_DATE"); return this; }

    protected ConditionValue _deliveryEndDate;
    public ConditionValue xdfgetDeliveryEndDate()
    { if (_deliveryEndDate == null) { _deliveryEndDate = nCV(); }
      return _deliveryEndDate; }
    protected ConditionValue xgetCValueDeliveryEndDate() { return xdfgetDeliveryEndDate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryEndDate_Asc() { regOBA("DELIVERY_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryEndDate_Desc() { regOBD("DELIVERY_END_DATE"); return this; }

    protected ConditionValue _deliveryTimeZone;
    public ConditionValue xdfgetDeliveryTimeZone()
    { if (_deliveryTimeZone == null) { _deliveryTimeZone = nCV(); }
      return _deliveryTimeZone; }
    protected ConditionValue xgetCValueDeliveryTimeZone() { return xdfgetDeliveryTimeZone(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryTimeZone_Asc() { regOBA("DELIVERY_TIME_ZONE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryTimeZone_Desc() { regOBD("DELIVERY_TIME_ZONE"); return this; }

    protected ConditionValue _deliveryInstructions;
    public ConditionValue xdfgetDeliveryInstructions()
    { if (_deliveryInstructions == null) { _deliveryInstructions = nCV(); }
      return _deliveryInstructions; }
    protected ConditionValue xgetCValueDeliveryInstructions() { return xdfgetDeliveryInstructions(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryInstructions_Asc() { regOBA("DELIVERY_INSTRUCTIONS"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DeliveryInstructions_Desc() { regOBD("DELIVERY_INSTRUCTIONS"); return this; }

    protected ConditionValue _paymentMethod;
    public ConditionValue xdfgetPaymentMethod()
    { if (_paymentMethod == null) { _paymentMethod = nCV(); }
      return _paymentMethod; }
    protected ConditionValue xgetCValuePaymentMethod() { return xdfgetPaymentMethod(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentMethod_Asc() { regOBA("PAYMENT_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentMethod_Desc() { regOBD("PAYMENT_METHOD"); return this; }

    protected ConditionValue _codCollectibleAmount;
    public ConditionValue xdfgetCodCollectibleAmount()
    { if (_codCollectibleAmount == null) { _codCollectibleAmount = nCV(); }
      return _codCollectibleAmount; }
    protected ConditionValue xgetCValueCodCollectibleAmount() { return xdfgetCodCollectibleAmount(); }

    /**
     * Add order-by as ascend. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_CodCollectibleAmount_Asc() { regOBA("COD_COLLECTIBLE_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_CodCollectibleAmount_Desc() { regOBD("COD_COLLECTIBLE_AMOUNT"); return this; }

    protected ConditionValue _alreadyPaid;
    public ConditionValue xdfgetAlreadyPaid()
    { if (_alreadyPaid == null) { _alreadyPaid = nCV(); }
      return _alreadyPaid; }
    protected ConditionValue xgetCValueAlreadyPaid() { return xdfgetAlreadyPaid(); }

    /**
     * Add order-by as ascend. <br>
     * ALREADY_PAID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AlreadyPaid_Asc() { regOBA("ALREADY_PAID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALREADY_PAID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AlreadyPaid_Desc() { regOBD("ALREADY_PAID"); return this; }

    protected ConditionValue _paymentMethodFee;
    public ConditionValue xdfgetPaymentMethodFee()
    { if (_paymentMethodFee == null) { _paymentMethodFee = nCV(); }
      return _paymentMethodFee; }
    protected ConditionValue xgetCValuePaymentMethodFee() { return xdfgetPaymentMethodFee(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentMethodFee_Asc() { regOBA("PAYMENT_METHOD_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PaymentMethodFee_Desc() { regOBD("PAYMENT_METHOD_FEE"); return this; }

    protected ConditionValue _scheduledDeliStDate;
    public ConditionValue xdfgetScheduledDeliStDate()
    { if (_scheduledDeliStDate == null) { _scheduledDeliStDate = nCV(); }
      return _scheduledDeliStDate; }
    protected ConditionValue xgetCValueScheduledDeliStDate() { return xdfgetScheduledDeliStDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ScheduledDeliStDate_Asc() { regOBA("SCHEDULED_DELI_ST_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ScheduledDeliStDate_Desc() { regOBD("SCHEDULED_DELI_ST_DATE"); return this; }

    protected ConditionValue _scheduledDeliEdDate;
    public ConditionValue xdfgetScheduledDeliEdDate()
    { if (_scheduledDeliEdDate == null) { _scheduledDeliEdDate = nCV(); }
      return _scheduledDeliEdDate; }
    protected ConditionValue xgetCValueScheduledDeliEdDate() { return xdfgetScheduledDeliEdDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ScheduledDeliEdDate_Asc() { regOBA("SCHEDULED_DELI_ED_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ScheduledDeliEdDate_Desc() { regOBD("SCHEDULED_DELI_ED_DATE"); return this; }

    protected ConditionValue _packingQty;
    public ConditionValue xdfgetPackingQty()
    { if (_packingQty == null) { _packingQty = nCV(); }
      return _packingQty; }
    protected ConditionValue xgetCValuePackingQty() { return xdfgetPackingQty(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PackingQty_Asc() { regOBA("PACKING_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_PackingQty_Desc() { regOBD("PACKING_QTY"); return this; }

    protected ConditionValue _slipItemNm1;
    public ConditionValue xdfgetSlipItemNm1()
    { if (_slipItemNm1 == null) { _slipItemNm1 = nCV(); }
      return _slipItemNm1; }
    protected ConditionValue xgetCValueSlipItemNm1() { return xdfgetSlipItemNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

    protected ConditionValue _slipItemNm2;
    public ConditionValue xdfgetSlipItemNm2()
    { if (_slipItemNm2 == null) { _slipItemNm2 = nCV(); }
      return _slipItemNm2; }
    protected ConditionValue xgetCValueSlipItemNm2() { return xdfgetSlipItemNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

    protected ConditionValue _slipItemNm3;
    public ConditionValue xdfgetSlipItemNm3()
    { if (_slipItemNm3 == null) { _slipItemNm3 = nCV(); }
      return _slipItemNm3; }
    protected ConditionValue xgetCValueSlipItemNm3() { return xdfgetSlipItemNm3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm3_Asc() { regOBA("SLIP_ITEM_NM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm3_Desc() { regOBD("SLIP_ITEM_NM3"); return this; }

    protected ConditionValue _slipItemNm4;
    public ConditionValue xdfgetSlipItemNm4()
    { if (_slipItemNm4 == null) { _slipItemNm4 = nCV(); }
      return _slipItemNm4; }
    protected ConditionValue xgetCValueSlipItemNm4() { return xdfgetSlipItemNm4(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm4_Asc() { regOBA("SLIP_ITEM_NM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm4_Desc() { regOBD("SLIP_ITEM_NM4"); return this; }

    protected ConditionValue _slipItemNm5;
    public ConditionValue xdfgetSlipItemNm5()
    { if (_slipItemNm5 == null) { _slipItemNm5 = nCV(); }
      return _slipItemNm5; }
    protected ConditionValue xgetCValueSlipItemNm5() { return xdfgetSlipItemNm5(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm5_Asc() { regOBA("SLIP_ITEM_NM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemNm5_Desc() { regOBD("SLIP_ITEM_NM5"); return this; }

    protected ConditionValue _slipItemCd1;
    public ConditionValue xdfgetSlipItemCd1()
    { if (_slipItemCd1 == null) { _slipItemCd1 = nCV(); }
      return _slipItemCd1; }
    protected ConditionValue xgetCValueSlipItemCd1() { return xdfgetSlipItemCd1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemCd1_Asc() { regOBA("SLIP_ITEM_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemCd1_Desc() { regOBD("SLIP_ITEM_CD1"); return this; }

    protected ConditionValue _slipItemCd2;
    public ConditionValue xdfgetSlipItemCd2()
    { if (_slipItemCd2 == null) { _slipItemCd2 = nCV(); }
      return _slipItemCd2; }
    protected ConditionValue xgetCValueSlipItemCd2() { return xdfgetSlipItemCd2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemCd2_Asc() { regOBA("SLIP_ITEM_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_SlipItemCd2_Desc() { regOBD("SLIP_ITEM_CD2"); return this; }

    protected ConditionValue _freightHandling1;
    public ConditionValue xdfgetFreightHandling1()
    { if (_freightHandling1 == null) { _freightHandling1 = nCV(); }
      return _freightHandling1; }
    protected ConditionValue xgetCValueFreightHandling1() { return xdfgetFreightHandling1(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_FreightHandling1_Asc() { regOBA("FREIGHT_HANDLING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_FreightHandling1_Desc() { regOBD("FREIGHT_HANDLING1"); return this; }

    protected ConditionValue _freightHandling2;
    public ConditionValue xdfgetFreightHandling2()
    { if (_freightHandling2 == null) { _freightHandling2 = nCV(); }
      return _freightHandling2; }
    protected ConditionValue xgetCValueFreightHandling2() { return xdfgetFreightHandling2(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_FreightHandling2_Asc() { regOBA("FREIGHT_HANDLING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_FreightHandling2_Desc() { regOBD("FREIGHT_HANDLING2"); return this; }

    protected ConditionValue _article;
    public ConditionValue xdfgetArticle()
    { if (_article == null) { _article = nCV(); }
      return _article; }
    protected ConditionValue xgetCValueArticle() { return xdfgetArticle(); }

    /**
     * Add order-by as ascend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Article_Asc() { regOBA("ARTICLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_Article_Desc() { regOBD("ARTICLE"); return this; }

    protected ConditionValue _receiveId;
    public ConditionValue xdfgetReceiveId()
    { if (_receiveId == null) { _receiveId = nCV(); }
      return _receiveId; }
    protected ConditionValue xgetCValueReceiveId() { return xdfgetReceiveId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ReceiveId_Asc() { regOBA("RECEIVE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ReceiveId_Desc() { regOBD("RECEIVE_ID"); return this; }

    protected ConditionValue _rowNo;
    public ConditionValue xdfgetRowNo()
    { if (_rowNo == null) { _rowNo = nCV(); }
      return _rowNo; }
    protected ConditionValue xgetCValueRowNo() { return xdfgetRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _ecOrderBId;
    public ConditionValue xdfgetEcOrderBId()
    { if (_ecOrderBId == null) { _ecOrderBId = nCV(); }
      return _ecOrderBId; }
    protected ConditionValue xgetCValueEcOrderBId() { return xdfgetEcOrderBId(); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_InScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_InScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_InScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_InScopeRelation_TEcOrderB", sq); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_NotInScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_NotInScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_NotInScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_NotInScopeRelation_TEcOrderB", sq); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_EcOrderBId_Asc() { regOBA("EC_ORDER_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_EcOrderBId_Desc() { regOBD("EC_ORDER_B_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTAmazonOrderCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TAmazonOrderCQ bq = (TAmazonOrderCQ)bqs;
        TAmazonOrderCQ uq = (TAmazonOrderCQ)uqs;
        if (bq.hasConditionQueryTEcOrderB()) {
            uq.queryTEcOrderB().reflectRelationOnUnionQuery(bq.queryTEcOrderB(), uq.queryTEcOrderB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderBCQ queryTEcOrderB() {
        return xdfgetConditionQueryTEcOrderB();
    }
    public TEcOrderBCQ xdfgetConditionQueryTEcOrderB() {
        String prop = "tEcOrderB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderB()); xsetupOuterJoinTEcOrderB(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderBCQ xcreateQueryTEcOrderB() {
        String nrp = xresolveNRP("T_AMAZON_ORDER", "tEcOrderB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderB", nrp);
    }
    protected void xsetupOuterJoinTEcOrderB() { xregOutJo("tEcOrderB"); }
    public boolean hasConditionQueryTEcOrderB() { return xhasQueRlMap("tEcOrderB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TAmazonOrderCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TAmazonOrderCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TAmazonOrderCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TAmazonOrderCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TAmazonOrderCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TAmazonOrderCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TAmazonOrderCQ> _myselfExistsMap;
    public Map<String, TAmazonOrderCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TAmazonOrderCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TAmazonOrderCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TAmazonOrderCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TAmazonOrderCB.class.getName(); }
    protected String xCQ() { return TAmazonOrderCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
