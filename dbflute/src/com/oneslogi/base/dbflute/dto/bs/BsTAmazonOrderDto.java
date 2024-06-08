package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_AMAZON_ORDER as TABLE. <br>
 * Amazon受注
 * <pre>
 * [primary-key]
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
 * [foreign-table]
 *     T_EC_ORDER_B
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tEcOrderB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTAmazonOrderDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _amazonOrderId;

    /** ORDER_ID: {varchar(30)} */
    @JsonKey
    protected String _orderId;

    /** ORDER_ITEM_ID: {varchar(30)} */
    @JsonKey
    protected String _orderItemId;

    /** PURCHASE_DATE: {varchar(30)} */
    @JsonKey
    protected String _purchaseDate;

    /** PAYMENTS_DATE: {varchar(30)} */
    @JsonKey
    protected String _paymentsDate;

    /** BUYER_EMAIL: {varchar(255)} */
    @JsonKey
    protected String _buyerEmail;

    /** BUYER_NAME: {varchar(255)} */
    @JsonKey
    protected String _buyerName;

    /** BUYER_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _buyerPhoneNumber;

    /** SKU: {varchar(30)} */
    @JsonKey
    protected String _sku;

    /** PRODUCT_NAME: {varchar(255)} */
    @JsonKey
    protected String _productName;

    /** QUANTITY_PURCHASED: {bigint(19)} */
    @JsonKey
    protected Long _quantityPurchased;

    /** CURRENCY: {varchar(60)} */
    @JsonKey
    protected String _currency;

    /** ITEM_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _itemPrice;

    /** ITEM_TAX: {bigint(19)} */
    @JsonKey
    protected Long _itemTax;

    /** SHIPPING_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _shippingPrice;

    /** SHIPPING_TAX: {bigint(19)} */
    @JsonKey
    protected Long _shippingTax;

    /** GIFT_WRAP_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _giftWrapPrice;

    /** GIFT_WRAP_TAX: {bigint(19)} */
    @JsonKey
    protected Long _giftWrapTax;

    /** SHIP_SERVICE_LEVEL: {varchar(60)} */
    @JsonKey
    protected String _shipServiceLevel;

    /** RECIPIENT_NAME: {varchar(255)} */
    @JsonKey
    protected String _recipientName;

    /** SHIP_ADDRESS_1: {varchar(255)} */
    @JsonKey
    protected String _shipAddress1;

    /** SHIP_ADDRESS_2: {varchar(255)} */
    @JsonKey
    protected String _shipAddress2;

    /** SHIP_ADDRESS_3: {varchar(255)} */
    @JsonKey
    protected String _shipAddress3;

    /** SHIP_CITY: {varchar(255)} */
    @JsonKey
    protected String _shipCity;

    /** SHIP_STATE: {varchar(255)} */
    @JsonKey
    protected String _shipState;

    /** SHIP_POSTAL_CODE: {varchar(30)} */
    @JsonKey
    protected String _shipPostalCode;

    /** SHIP_COUNTRY: {varchar(30)} */
    @JsonKey
    protected String _shipCountry;

    /** SHIP_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _shipPhoneNumber;

    /** GIFT_WRAP_TYPE: {varchar(30)} */
    @JsonKey
    protected String _giftWrapType;

    /** GIFT_MASSAGE_TEXT: {varchar(60)} */
    @JsonKey
    protected String _giftMassageText;

    /** ITEM_PROMOTION_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _itemPromotionDiscount;

    /** ITEM_PROMOTION_ID: {varchar(30)} */
    @JsonKey
    protected String _itemPromotionId;

    /** SHIP_PROMOTION_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _shipPromotionDiscount;

    /** SHIP_PROMOTION_ID: {varchar(30)} */
    @JsonKey
    protected String _shipPromotionId;

    /** DELIVERY_START_DATE: {varchar(30)} */
    @JsonKey
    protected String _deliveryStartDate;

    /** DELIVERY_END_DATE: {varchar(30)} */
    @JsonKey
    protected String _deliveryEndDate;

    /** DELIVERY_TIME_ZONE: {varchar(30)} */
    @JsonKey
    protected String _deliveryTimeZone;

    /** DELIVERY_INSTRUCTIONS: {varchar(60)} */
    @JsonKey
    protected String _deliveryInstructions;

    /** PAYMENT_METHOD: {varchar(60)} */
    @JsonKey
    protected String _paymentMethod;

    /** COD_COLLECTIBLE_AMOUNT: {bigint(19)} */
    @JsonKey
    protected Long _codCollectibleAmount;

    /** ALREADY_PAID: {bigint(19)} */
    @JsonKey
    protected Long _alreadyPaid;

    /** PAYMENT_METHOD_FEE: {bigint(19)} */
    @JsonKey
    protected Long _paymentMethodFee;

    /** SCHEDULED_DELI_ST_DATE: {varchar(30)} */
    @JsonKey
    protected String _scheduledDeliStDate;

    /** SCHEDULED_DELI_ED_DATE: {varchar(30)} */
    @JsonKey
    protected String _scheduledDeliEdDate;

    /** PACKING_QTY: {bigint(19)} */
    @JsonKey
    protected Long _packingQty;

    /** SLIP_ITEM_NM1: {varchar(2147483647)} */
    @JsonKey
    protected String _slipItemNm1;

    /** SLIP_ITEM_NM2: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm2;

    /** SLIP_ITEM_NM3: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm3;

    /** SLIP_ITEM_NM4: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm4;

    /** SLIP_ITEM_NM5: {varchar(255)} */
    @JsonKey
    protected String _slipItemNm5;

    /** SLIP_ITEM_CD1: {varchar(30)} */
    @JsonKey
    protected String _slipItemCd1;

    /** SLIP_ITEM_CD2: {varchar(30)} */
    @JsonKey
    protected String _slipItemCd2;

    /** FREIGHT_HANDLING1: {varchar(30)} */
    @JsonKey
    protected String _freightHandling1;

    /** FREIGHT_HANDLING2: {varchar(30)} */
    @JsonKey
    protected String _freightHandling2;

    /** ARTICLE: {varchar(255)} */
    @JsonKey
    protected String _article;

    /** RECEIVE_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _receiveId;

    /** ROW_NO: {bigint(19)} */
    @JsonKey
    protected Long _rowNo;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** IMPORT_FLG: {char(1)} */
    @JsonKey
    protected String _importFlg;

    /** IMPORT_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _importTypeId;

    /** EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} */
    @JsonKey
    protected Long _ecOrderBId;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAmazonOrderDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected TEcOrderBDto _tEcOrderB;

    public TEcOrderBDto getTEcOrderB() {
        return _tEcOrderB;
    }

    public void setTEcOrderB(TEcOrderBDto tEcOrderB) {
        this._tEcOrderB = tEcOrderB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTAmazonOrderDto)) { return false; }
        final BsTAmazonOrderDto otherEntity = (BsTAmazonOrderDto)other;
        if (!helpComparingValue(getAmazonOrderId(), otherEntity.getAmazonOrderId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_AMAZON_ORDER");
        result = xCH(result, getAmazonOrderId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getAmazonOrderId());
        sb.append(c).append(getOrderId());
        sb.append(c).append(getOrderItemId());
        sb.append(c).append(getPurchaseDate());
        sb.append(c).append(getPaymentsDate());
        sb.append(c).append(getBuyerEmail());
        sb.append(c).append(getBuyerName());
        sb.append(c).append(getBuyerPhoneNumber());
        sb.append(c).append(getSku());
        sb.append(c).append(getProductName());
        sb.append(c).append(getQuantityPurchased());
        sb.append(c).append(getCurrency());
        sb.append(c).append(getItemPrice());
        sb.append(c).append(getItemTax());
        sb.append(c).append(getShippingPrice());
        sb.append(c).append(getShippingTax());
        sb.append(c).append(getGiftWrapPrice());
        sb.append(c).append(getGiftWrapTax());
        sb.append(c).append(getShipServiceLevel());
        sb.append(c).append(getRecipientName());
        sb.append(c).append(getShipAddress1());
        sb.append(c).append(getShipAddress2());
        sb.append(c).append(getShipAddress3());
        sb.append(c).append(getShipCity());
        sb.append(c).append(getShipState());
        sb.append(c).append(getShipPostalCode());
        sb.append(c).append(getShipCountry());
        sb.append(c).append(getShipPhoneNumber());
        sb.append(c).append(getGiftWrapType());
        sb.append(c).append(getGiftMassageText());
        sb.append(c).append(getItemPromotionDiscount());
        sb.append(c).append(getItemPromotionId());
        sb.append(c).append(getShipPromotionDiscount());
        sb.append(c).append(getShipPromotionId());
        sb.append(c).append(getDeliveryStartDate());
        sb.append(c).append(getDeliveryEndDate());
        sb.append(c).append(getDeliveryTimeZone());
        sb.append(c).append(getDeliveryInstructions());
        sb.append(c).append(getPaymentMethod());
        sb.append(c).append(getCodCollectibleAmount());
        sb.append(c).append(getAlreadyPaid());
        sb.append(c).append(getPaymentMethodFee());
        sb.append(c).append(getScheduledDeliStDate());
        sb.append(c).append(getScheduledDeliEdDate());
        sb.append(c).append(getPackingQty());
        sb.append(c).append(getSlipItemNm1());
        sb.append(c).append(getSlipItemNm2());
        sb.append(c).append(getSlipItemNm3());
        sb.append(c).append(getSlipItemNm4());
        sb.append(c).append(getSlipItemNm5());
        sb.append(c).append(getSlipItemCd1());
        sb.append(c).append(getSlipItemCd2());
        sb.append(c).append(getFreightHandling1());
        sb.append(c).append(getFreightHandling2());
        sb.append(c).append(getArticle());
        sb.append(c).append(getReceiveId());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getImportTypeId());
        sb.append(c).append(getEcOrderBId());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * Amazon受注ID
     * @return The value of the column 'AMAZON_ORDER_ID'. (NullAllowed)
     */
    public Long getAmazonOrderId() {
        return _amazonOrderId;
    }

    /**
     * [set] AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * Amazon受注ID
     * @param amazonOrderId The value of the column 'AMAZON_ORDER_ID'. (NullAllowed)
     */
    public void setAmazonOrderId(Long amazonOrderId) {
        __modifiedProperties.add("amazonOrderId");
        this._amazonOrderId = amazonOrderId;
    }

    /**
     * [get] ORDER_ID: {varchar(30)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_ID'. (NullAllowed)
     */
    public String getOrderId() {
        return _orderId;
    }

    /**
     * [set] ORDER_ID: {varchar(30)} <br>
     * 受注番号
     * @param orderId The value of the column 'ORDER_ID'. (NullAllowed)
     */
    public void setOrderId(String orderId) {
        __modifiedProperties.add("orderId");
        this._orderId = orderId;
    }

    /**
     * [get] ORDER_ITEM_ID: {varchar(30)} <br>
     * Amazon商品ID
     * @return The value of the column 'ORDER_ITEM_ID'. (NullAllowed)
     */
    public String getOrderItemId() {
        return _orderItemId;
    }

    /**
     * [set] ORDER_ITEM_ID: {varchar(30)} <br>
     * Amazon商品ID
     * @param orderItemId The value of the column 'ORDER_ITEM_ID'. (NullAllowed)
     */
    public void setOrderItemId(String orderItemId) {
        __modifiedProperties.add("orderItemId");
        this._orderItemId = orderItemId;
    }

    /**
     * [get] PURCHASE_DATE: {varchar(30)} <br>
     * 受注日時
     * @return The value of the column 'PURCHASE_DATE'. (NullAllowed)
     */
    public String getPurchaseDate() {
        return _purchaseDate;
    }

    /**
     * [set] PURCHASE_DATE: {varchar(30)} <br>
     * 受注日時
     * @param purchaseDate The value of the column 'PURCHASE_DATE'. (NullAllowed)
     */
    public void setPurchaseDate(String purchaseDate) {
        __modifiedProperties.add("purchaseDate");
        this._purchaseDate = purchaseDate;
    }

    /**
     * [get] PAYMENTS_DATE: {varchar(30)} <br>
     * 注文完了日時
     * @return The value of the column 'PAYMENTS_DATE'. (NullAllowed)
     */
    public String getPaymentsDate() {
        return _paymentsDate;
    }

    /**
     * [set] PAYMENTS_DATE: {varchar(30)} <br>
     * 注文完了日時
     * @param paymentsDate The value of the column 'PAYMENTS_DATE'. (NullAllowed)
     */
    public void setPaymentsDate(String paymentsDate) {
        __modifiedProperties.add("paymentsDate");
        this._paymentsDate = paymentsDate;
    }

    /**
     * [get] BUYER_EMAIL: {varchar(255)} <br>
     * 注文者Eメールアドレス
     * @return The value of the column 'BUYER_EMAIL'. (NullAllowed)
     */
    public String getBuyerEmail() {
        return _buyerEmail;
    }

    /**
     * [set] BUYER_EMAIL: {varchar(255)} <br>
     * 注文者Eメールアドレス
     * @param buyerEmail The value of the column 'BUYER_EMAIL'. (NullAllowed)
     */
    public void setBuyerEmail(String buyerEmail) {
        __modifiedProperties.add("buyerEmail");
        this._buyerEmail = buyerEmail;
    }

    /**
     * [get] BUYER_NAME: {varchar(255)} <br>
     * 注文者名称(フルネーム)
     * @return The value of the column 'BUYER_NAME'. (NullAllowed)
     */
    public String getBuyerName() {
        return _buyerName;
    }

    /**
     * [set] BUYER_NAME: {varchar(255)} <br>
     * 注文者名称(フルネーム)
     * @param buyerName The value of the column 'BUYER_NAME'. (NullAllowed)
     */
    public void setBuyerName(String buyerName) {
        __modifiedProperties.add("buyerName");
        this._buyerName = buyerName;
    }

    /**
     * [get] BUYER_PHONE_NUMBER: {varchar(255)} <br>
     * 注文者電話番号(数値のみ)
     * @return The value of the column 'BUYER_PHONE_NUMBER'. (NullAllowed)
     */
    public String getBuyerPhoneNumber() {
        return _buyerPhoneNumber;
    }

    /**
     * [set] BUYER_PHONE_NUMBER: {varchar(255)} <br>
     * 注文者電話番号(数値のみ)
     * @param buyerPhoneNumber The value of the column 'BUYER_PHONE_NUMBER'. (NullAllowed)
     */
    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        __modifiedProperties.add("buyerPhoneNumber");
        this._buyerPhoneNumber = buyerPhoneNumber;
    }

    /**
     * [get] SKU: {varchar(30)} <br>
     * 商品ID
     * @return The value of the column 'SKU'. (NullAllowed)
     */
    public String getSku() {
        return _sku;
    }

    /**
     * [set] SKU: {varchar(30)} <br>
     * 商品ID
     * @param sku The value of the column 'SKU'. (NullAllowed)
     */
    public void setSku(String sku) {
        __modifiedProperties.add("sku");
        this._sku = sku;
    }

    /**
     * [get] PRODUCT_NAME: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {varchar(255)} <br>
     * 商品名称
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public void setProductName(String productName) {
        __modifiedProperties.add("productName");
        this._productName = productName;
    }

    /**
     * [get] QUANTITY_PURCHASED: {bigint(19)} <br>
     * 購入数
     * @return The value of the column 'QUANTITY_PURCHASED'. (NullAllowed)
     */
    public Long getQuantityPurchased() {
        return _quantityPurchased;
    }

    /**
     * [set] QUANTITY_PURCHASED: {bigint(19)} <br>
     * 購入数
     * @param quantityPurchased The value of the column 'QUANTITY_PURCHASED'. (NullAllowed)
     */
    public void setQuantityPurchased(Long quantityPurchased) {
        __modifiedProperties.add("quantityPurchased");
        this._quantityPurchased = quantityPurchased;
    }

    /**
     * [get] CURRENCY: {varchar(60)} <br>
     * 決済通貨
     * @return The value of the column 'CURRENCY'. (NullAllowed)
     */
    public String getCurrency() {
        return _currency;
    }

    /**
     * [set] CURRENCY: {varchar(60)} <br>
     * 決済通貨
     * @param currency The value of the column 'CURRENCY'. (NullAllowed)
     */
    public void setCurrency(String currency) {
        __modifiedProperties.add("currency");
        this._currency = currency;
    }

    /**
     * [get] ITEM_PRICE: {bigint(19)} <br>
     * 商品金額
     * @return The value of the column 'ITEM_PRICE'. (NullAllowed)
     */
    public Long getItemPrice() {
        return _itemPrice;
    }

    /**
     * [set] ITEM_PRICE: {bigint(19)} <br>
     * 商品金額
     * @param itemPrice The value of the column 'ITEM_PRICE'. (NullAllowed)
     */
    public void setItemPrice(Long itemPrice) {
        __modifiedProperties.add("itemPrice");
        this._itemPrice = itemPrice;
    }

    /**
     * [get] ITEM_TAX: {bigint(19)} <br>
     * 商品税額
     * @return The value of the column 'ITEM_TAX'. (NullAllowed)
     */
    public Long getItemTax() {
        return _itemTax;
    }

    /**
     * [set] ITEM_TAX: {bigint(19)} <br>
     * 商品税額
     * @param itemTax The value of the column 'ITEM_TAX'. (NullAllowed)
     */
    public void setItemTax(Long itemTax) {
        __modifiedProperties.add("itemTax");
        this._itemTax = itemTax;
    }

    /**
     * [get] SHIPPING_PRICE: {bigint(19)} <br>
     * 配送料金額
     * @return The value of the column 'SHIPPING_PRICE'. (NullAllowed)
     */
    public Long getShippingPrice() {
        return _shippingPrice;
    }

    /**
     * [set] SHIPPING_PRICE: {bigint(19)} <br>
     * 配送料金額
     * @param shippingPrice The value of the column 'SHIPPING_PRICE'. (NullAllowed)
     */
    public void setShippingPrice(Long shippingPrice) {
        __modifiedProperties.add("shippingPrice");
        this._shippingPrice = shippingPrice;
    }

    /**
     * [get] SHIPPING_TAX: {bigint(19)} <br>
     * 配送料税額
     * @return The value of the column 'SHIPPING_TAX'. (NullAllowed)
     */
    public Long getShippingTax() {
        return _shippingTax;
    }

    /**
     * [set] SHIPPING_TAX: {bigint(19)} <br>
     * 配送料税額
     * @param shippingTax The value of the column 'SHIPPING_TAX'. (NullAllowed)
     */
    public void setShippingTax(Long shippingTax) {
        __modifiedProperties.add("shippingTax");
        this._shippingTax = shippingTax;
    }

    /**
     * [get] GIFT_WRAP_PRICE: {bigint(19)} <br>
     * ギフト包装金額
     * @return The value of the column 'GIFT_WRAP_PRICE'. (NullAllowed)
     */
    public Long getGiftWrapPrice() {
        return _giftWrapPrice;
    }

    /**
     * [set] GIFT_WRAP_PRICE: {bigint(19)} <br>
     * ギフト包装金額
     * @param giftWrapPrice The value of the column 'GIFT_WRAP_PRICE'. (NullAllowed)
     */
    public void setGiftWrapPrice(Long giftWrapPrice) {
        __modifiedProperties.add("giftWrapPrice");
        this._giftWrapPrice = giftWrapPrice;
    }

    /**
     * [get] GIFT_WRAP_TAX: {bigint(19)} <br>
     * ギフト包装税額
     * @return The value of the column 'GIFT_WRAP_TAX'. (NullAllowed)
     */
    public Long getGiftWrapTax() {
        return _giftWrapTax;
    }

    /**
     * [set] GIFT_WRAP_TAX: {bigint(19)} <br>
     * ギフト包装税額
     * @param giftWrapTax The value of the column 'GIFT_WRAP_TAX'. (NullAllowed)
     */
    public void setGiftWrapTax(Long giftWrapTax) {
        __modifiedProperties.add("giftWrapTax");
        this._giftWrapTax = giftWrapTax;
    }

    /**
     * [get] SHIP_SERVICE_LEVEL: {varchar(60)} <br>
     * フルフィルメントサービス
     * @return The value of the column 'SHIP_SERVICE_LEVEL'. (NullAllowed)
     */
    public String getShipServiceLevel() {
        return _shipServiceLevel;
    }

    /**
     * [set] SHIP_SERVICE_LEVEL: {varchar(60)} <br>
     * フルフィルメントサービス
     * @param shipServiceLevel The value of the column 'SHIP_SERVICE_LEVEL'. (NullAllowed)
     */
    public void setShipServiceLevel(String shipServiceLevel) {
        __modifiedProperties.add("shipServiceLevel");
        this._shipServiceLevel = shipServiceLevel;
    }

    /**
     * [get] RECIPIENT_NAME: {varchar(255)} <br>
     * 送付先名称
     * @return The value of the column 'RECIPIENT_NAME'. (NullAllowed)
     */
    public String getRecipientName() {
        return _recipientName;
    }

    /**
     * [set] RECIPIENT_NAME: {varchar(255)} <br>
     * 送付先名称
     * @param recipientName The value of the column 'RECIPIENT_NAME'. (NullAllowed)
     */
    public void setRecipientName(String recipientName) {
        __modifiedProperties.add("recipientName");
        this._recipientName = recipientName;
    }

    /**
     * [get] SHIP_ADDRESS_1: {varchar(255)} <br>
     * 配送先住所1
     * @return The value of the column 'SHIP_ADDRESS_1'. (NullAllowed)
     */
    public String getShipAddress1() {
        return _shipAddress1;
    }

    /**
     * [set] SHIP_ADDRESS_1: {varchar(255)} <br>
     * 配送先住所1
     * @param shipAddress1 The value of the column 'SHIP_ADDRESS_1'. (NullAllowed)
     */
    public void setShipAddress1(String shipAddress1) {
        __modifiedProperties.add("shipAddress1");
        this._shipAddress1 = shipAddress1;
    }

    /**
     * [get] SHIP_ADDRESS_2: {varchar(255)} <br>
     * 配送先住所2
     * @return The value of the column 'SHIP_ADDRESS_2'. (NullAllowed)
     */
    public String getShipAddress2() {
        return _shipAddress2;
    }

    /**
     * [set] SHIP_ADDRESS_2: {varchar(255)} <br>
     * 配送先住所2
     * @param shipAddress2 The value of the column 'SHIP_ADDRESS_2'. (NullAllowed)
     */
    public void setShipAddress2(String shipAddress2) {
        __modifiedProperties.add("shipAddress2");
        this._shipAddress2 = shipAddress2;
    }

    /**
     * [get] SHIP_ADDRESS_3: {varchar(255)} <br>
     * 配送先住所3
     * @return The value of the column 'SHIP_ADDRESS_3'. (NullAllowed)
     */
    public String getShipAddress3() {
        return _shipAddress3;
    }

    /**
     * [set] SHIP_ADDRESS_3: {varchar(255)} <br>
     * 配送先住所3
     * @param shipAddress3 The value of the column 'SHIP_ADDRESS_3'. (NullAllowed)
     */
    public void setShipAddress3(String shipAddress3) {
        __modifiedProperties.add("shipAddress3");
        this._shipAddress3 = shipAddress3;
    }

    /**
     * [get] SHIP_CITY: {varchar(255)} <br>
     * 配送先市区町村
     * @return The value of the column 'SHIP_CITY'. (NullAllowed)
     */
    public String getShipCity() {
        return _shipCity;
    }

    /**
     * [set] SHIP_CITY: {varchar(255)} <br>
     * 配送先市区町村
     * @param shipCity The value of the column 'SHIP_CITY'. (NullAllowed)
     */
    public void setShipCity(String shipCity) {
        __modifiedProperties.add("shipCity");
        this._shipCity = shipCity;
    }

    /**
     * [get] SHIP_STATE: {varchar(255)} <br>
     * 配送先都道府県
     * @return The value of the column 'SHIP_STATE'. (NullAllowed)
     */
    public String getShipState() {
        return _shipState;
    }

    /**
     * [set] SHIP_STATE: {varchar(255)} <br>
     * 配送先都道府県
     * @param shipState The value of the column 'SHIP_STATE'. (NullAllowed)
     */
    public void setShipState(String shipState) {
        __modifiedProperties.add("shipState");
        this._shipState = shipState;
    }

    /**
     * [get] SHIP_POSTAL_CODE: {varchar(30)} <br>
     * 配送先郵便番号
     * @return The value of the column 'SHIP_POSTAL_CODE'. (NullAllowed)
     */
    public String getShipPostalCode() {
        return _shipPostalCode;
    }

    /**
     * [set] SHIP_POSTAL_CODE: {varchar(30)} <br>
     * 配送先郵便番号
     * @param shipPostalCode The value of the column 'SHIP_POSTAL_CODE'. (NullAllowed)
     */
    public void setShipPostalCode(String shipPostalCode) {
        __modifiedProperties.add("shipPostalCode");
        this._shipPostalCode = shipPostalCode;
    }

    /**
     * [get] SHIP_COUNTRY: {varchar(30)} <br>
     * 国別CD
     * @return The value of the column 'SHIP_COUNTRY'. (NullAllowed)
     */
    public String getShipCountry() {
        return _shipCountry;
    }

    /**
     * [set] SHIP_COUNTRY: {varchar(30)} <br>
     * 国別CD
     * @param shipCountry The value of the column 'SHIP_COUNTRY'. (NullAllowed)
     */
    public void setShipCountry(String shipCountry) {
        __modifiedProperties.add("shipCountry");
        this._shipCountry = shipCountry;
    }

    /**
     * [get] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * 配送先電話番号
     * @return The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed)
     */
    public String getShipPhoneNumber() {
        return _shipPhoneNumber;
    }

    /**
     * [set] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * 配送先電話番号
     * @param shipPhoneNumber The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed)
     */
    public void setShipPhoneNumber(String shipPhoneNumber) {
        __modifiedProperties.add("shipPhoneNumber");
        this._shipPhoneNumber = shipPhoneNumber;
    }

    /**
     * [get] GIFT_WRAP_TYPE: {varchar(30)} <br>
     * ギフト包装ID
     * @return The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed)
     */
    public String getGiftWrapType() {
        return _giftWrapType;
    }

    /**
     * [set] GIFT_WRAP_TYPE: {varchar(30)} <br>
     * ギフト包装ID
     * @param giftWrapType The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed)
     */
    public void setGiftWrapType(String giftWrapType) {
        __modifiedProperties.add("giftWrapType");
        this._giftWrapType = giftWrapType;
    }

    /**
     * [get] GIFT_MASSAGE_TEXT: {varchar(60)} <br>
     * ギフトメッセージ
     * @return The value of the column 'GIFT_MASSAGE_TEXT'. (NullAllowed)
     */
    public String getGiftMassageText() {
        return _giftMassageText;
    }

    /**
     * [set] GIFT_MASSAGE_TEXT: {varchar(60)} <br>
     * ギフトメッセージ
     * @param giftMassageText The value of the column 'GIFT_MASSAGE_TEXT'. (NullAllowed)
     */
    public void setGiftMassageText(String giftMassageText) {
        __modifiedProperties.add("giftMassageText");
        this._giftMassageText = giftMassageText;
    }

    /**
     * [get] ITEM_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 商品プロモーション割引額
     * @return The value of the column 'ITEM_PROMOTION_DISCOUNT'. (NullAllowed)
     */
    public Long getItemPromotionDiscount() {
        return _itemPromotionDiscount;
    }

    /**
     * [set] ITEM_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 商品プロモーション割引額
     * @param itemPromotionDiscount The value of the column 'ITEM_PROMOTION_DISCOUNT'. (NullAllowed)
     */
    public void setItemPromotionDiscount(Long itemPromotionDiscount) {
        __modifiedProperties.add("itemPromotionDiscount");
        this._itemPromotionDiscount = itemPromotionDiscount;
    }

    /**
     * [get] ITEM_PROMOTION_ID: {varchar(30)} <br>
     * 商品プロモーションID
     * @return The value of the column 'ITEM_PROMOTION_ID'. (NullAllowed)
     */
    public String getItemPromotionId() {
        return _itemPromotionId;
    }

    /**
     * [set] ITEM_PROMOTION_ID: {varchar(30)} <br>
     * 商品プロモーションID
     * @param itemPromotionId The value of the column 'ITEM_PROMOTION_ID'. (NullAllowed)
     */
    public void setItemPromotionId(String itemPromotionId) {
        __modifiedProperties.add("itemPromotionId");
        this._itemPromotionId = itemPromotionId;
    }

    /**
     * [get] SHIP_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 配送プロモーション割引額
     * @return The value of the column 'SHIP_PROMOTION_DISCOUNT'. (NullAllowed)
     */
    public Long getShipPromotionDiscount() {
        return _shipPromotionDiscount;
    }

    /**
     * [set] SHIP_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 配送プロモーション割引額
     * @param shipPromotionDiscount The value of the column 'SHIP_PROMOTION_DISCOUNT'. (NullAllowed)
     */
    public void setShipPromotionDiscount(Long shipPromotionDiscount) {
        __modifiedProperties.add("shipPromotionDiscount");
        this._shipPromotionDiscount = shipPromotionDiscount;
    }

    /**
     * [get] SHIP_PROMOTION_ID: {varchar(30)} <br>
     * 配送プロモーションID
     * @return The value of the column 'SHIP_PROMOTION_ID'. (NullAllowed)
     */
    public String getShipPromotionId() {
        return _shipPromotionId;
    }

    /**
     * [set] SHIP_PROMOTION_ID: {varchar(30)} <br>
     * 配送プロモーションID
     * @param shipPromotionId The value of the column 'SHIP_PROMOTION_ID'. (NullAllowed)
     */
    public void setShipPromotionId(String shipPromotionId) {
        __modifiedProperties.add("shipPromotionId");
        this._shipPromotionId = shipPromotionId;
    }

    /**
     * [get] DELIVERY_START_DATE: {varchar(30)} <br>
     * 配送予定日時(最速)
     * @return The value of the column 'DELIVERY_START_DATE'. (NullAllowed)
     */
    public String getDeliveryStartDate() {
        return _deliveryStartDate;
    }

    /**
     * [set] DELIVERY_START_DATE: {varchar(30)} <br>
     * 配送予定日時(最速)
     * @param deliveryStartDate The value of the column 'DELIVERY_START_DATE'. (NullAllowed)
     */
    public void setDeliveryStartDate(String deliveryStartDate) {
        __modifiedProperties.add("deliveryStartDate");
        this._deliveryStartDate = deliveryStartDate;
    }

    /**
     * [get] DELIVERY_END_DATE: {varchar(30)} <br>
     * 配送予定日時(最遅)
     * @return The value of the column 'DELIVERY_END_DATE'. (NullAllowed)
     */
    public String getDeliveryEndDate() {
        return _deliveryEndDate;
    }

    /**
     * [set] DELIVERY_END_DATE: {varchar(30)} <br>
     * 配送予定日時(最遅)
     * @param deliveryEndDate The value of the column 'DELIVERY_END_DATE'. (NullAllowed)
     */
    public void setDeliveryEndDate(String deliveryEndDate) {
        __modifiedProperties.add("deliveryEndDate");
        this._deliveryEndDate = deliveryEndDate;
    }

    /**
     * [get] DELIVERY_TIME_ZONE: {varchar(30)} <br>
     * 配送日時タイムゾーン
     * @return The value of the column 'DELIVERY_TIME_ZONE'. (NullAllowed)
     */
    public String getDeliveryTimeZone() {
        return _deliveryTimeZone;
    }

    /**
     * [set] DELIVERY_TIME_ZONE: {varchar(30)} <br>
     * 配送日時タイムゾーン
     * @param deliveryTimeZone The value of the column 'DELIVERY_TIME_ZONE'. (NullAllowed)
     */
    public void setDeliveryTimeZone(String deliveryTimeZone) {
        __modifiedProperties.add("deliveryTimeZone");
        this._deliveryTimeZone = deliveryTimeZone;
    }

    /**
     * [get] DELIVERY_INSTRUCTIONS: {varchar(60)} <br>
     * 配送特記事項
     * @return The value of the column 'DELIVERY_INSTRUCTIONS'. (NullAllowed)
     */
    public String getDeliveryInstructions() {
        return _deliveryInstructions;
    }

    /**
     * [set] DELIVERY_INSTRUCTIONS: {varchar(60)} <br>
     * 配送特記事項
     * @param deliveryInstructions The value of the column 'DELIVERY_INSTRUCTIONS'. (NullAllowed)
     */
    public void setDeliveryInstructions(String deliveryInstructions) {
        __modifiedProperties.add("deliveryInstructions");
        this._deliveryInstructions = deliveryInstructions;
    }

    /**
     * [get] PAYMENT_METHOD: {varchar(60)} <br>
     * 支払方法
     * @return The value of the column 'PAYMENT_METHOD'. (NullAllowed)
     */
    public String getPaymentMethod() {
        return _paymentMethod;
    }

    /**
     * [set] PAYMENT_METHOD: {varchar(60)} <br>
     * 支払方法
     * @param paymentMethod The value of the column 'PAYMENT_METHOD'. (NullAllowed)
     */
    public void setPaymentMethod(String paymentMethod) {
        __modifiedProperties.add("paymentMethod");
        this._paymentMethod = paymentMethod;
    }

    /**
     * [get] COD_COLLECTIBLE_AMOUNT: {bigint(19)} <br>
     * 代金引換金額
     * @return The value of the column 'COD_COLLECTIBLE_AMOUNT'. (NullAllowed)
     */
    public Long getCodCollectibleAmount() {
        return _codCollectibleAmount;
    }

    /**
     * [set] COD_COLLECTIBLE_AMOUNT: {bigint(19)} <br>
     * 代金引換金額
     * @param codCollectibleAmount The value of the column 'COD_COLLECTIBLE_AMOUNT'. (NullAllowed)
     */
    public void setCodCollectibleAmount(Long codCollectibleAmount) {
        __modifiedProperties.add("codCollectibleAmount");
        this._codCollectibleAmount = codCollectibleAmount;
    }

    /**
     * [get] ALREADY_PAID: {bigint(19)} <br>
     * 代金引換Amazonギフト前払金額
     * @return The value of the column 'ALREADY_PAID'. (NullAllowed)
     */
    public Long getAlreadyPaid() {
        return _alreadyPaid;
    }

    /**
     * [set] ALREADY_PAID: {bigint(19)} <br>
     * 代金引換Amazonギフト前払金額
     * @param alreadyPaid The value of the column 'ALREADY_PAID'. (NullAllowed)
     */
    public void setAlreadyPaid(Long alreadyPaid) {
        __modifiedProperties.add("alreadyPaid");
        this._alreadyPaid = alreadyPaid;
    }

    /**
     * [get] PAYMENT_METHOD_FEE: {bigint(19)} <br>
     * 支払方法別手数料
     * @return The value of the column 'PAYMENT_METHOD_FEE'. (NullAllowed)
     */
    public Long getPaymentMethodFee() {
        return _paymentMethodFee;
    }

    /**
     * [set] PAYMENT_METHOD_FEE: {bigint(19)} <br>
     * 支払方法別手数料
     * @param paymentMethodFee The value of the column 'PAYMENT_METHOD_FEE'. (NullAllowed)
     */
    public void setPaymentMethodFee(Long paymentMethodFee) {
        __modifiedProperties.add("paymentMethodFee");
        this._paymentMethodFee = paymentMethodFee;
    }

    /**
     * [get] SCHEDULED_DELI_ST_DATE: {varchar(30)} <br>
     * 納品指定日時(最速)
     * @return The value of the column 'SCHEDULED_DELI_ST_DATE'. (NullAllowed)
     */
    public String getScheduledDeliStDate() {
        return _scheduledDeliStDate;
    }

    /**
     * [set] SCHEDULED_DELI_ST_DATE: {varchar(30)} <br>
     * 納品指定日時(最速)
     * @param scheduledDeliStDate The value of the column 'SCHEDULED_DELI_ST_DATE'. (NullAllowed)
     */
    public void setScheduledDeliStDate(String scheduledDeliStDate) {
        __modifiedProperties.add("scheduledDeliStDate");
        this._scheduledDeliStDate = scheduledDeliStDate;
    }

    /**
     * [get] SCHEDULED_DELI_ED_DATE: {varchar(30)} <br>
     * 納品指定日時(最遅)
     * @return The value of the column 'SCHEDULED_DELI_ED_DATE'. (NullAllowed)
     */
    public String getScheduledDeliEdDate() {
        return _scheduledDeliEdDate;
    }

    /**
     * [set] SCHEDULED_DELI_ED_DATE: {varchar(30)} <br>
     * 納品指定日時(最遅)
     * @param scheduledDeliEdDate The value of the column 'SCHEDULED_DELI_ED_DATE'. (NullAllowed)
     */
    public void setScheduledDeliEdDate(String scheduledDeliEdDate) {
        __modifiedProperties.add("scheduledDeliEdDate");
        this._scheduledDeliEdDate = scheduledDeliEdDate;
    }

    /**
     * [get] PACKING_QTY: {bigint(19)} <br>
     * 個口数
     * @return The value of the column 'PACKING_QTY'. (NullAllowed)
     */
    public Long getPackingQty() {
        return _packingQty;
    }

    /**
     * [set] PACKING_QTY: {bigint(19)} <br>
     * 個口数
     * @param packingQty The value of the column 'PACKING_QTY'. (NullAllowed)
     */
    public void setPackingQty(Long packingQty) {
        __modifiedProperties.add("packingQty");
        this._packingQty = packingQty;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public String getSlipItemNm1() {
        return _slipItemNm1;
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        __modifiedProperties.add("slipItemNm1");
        this._slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public String getSlipItemNm2() {
        return _slipItemNm2;
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        __modifiedProperties.add("slipItemNm2");
        this._slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @return The value of the column 'SLIP_ITEM_NM3'. (NullAllowed)
     */
    public String getSlipItemNm3() {
        return _slipItemNm3;
    }

    /**
     * [set] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @param slipItemNm3 The value of the column 'SLIP_ITEM_NM3'. (NullAllowed)
     */
    public void setSlipItemNm3(String slipItemNm3) {
        __modifiedProperties.add("slipItemNm3");
        this._slipItemNm3 = slipItemNm3;
    }

    /**
     * [get] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @return The value of the column 'SLIP_ITEM_NM4'. (NullAllowed)
     */
    public String getSlipItemNm4() {
        return _slipItemNm4;
    }

    /**
     * [set] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @param slipItemNm4 The value of the column 'SLIP_ITEM_NM4'. (NullAllowed)
     */
    public void setSlipItemNm4(String slipItemNm4) {
        __modifiedProperties.add("slipItemNm4");
        this._slipItemNm4 = slipItemNm4;
    }

    /**
     * [get] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @return The value of the column 'SLIP_ITEM_NM5'. (NullAllowed)
     */
    public String getSlipItemNm5() {
        return _slipItemNm5;
    }

    /**
     * [set] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @param slipItemNm5 The value of the column 'SLIP_ITEM_NM5'. (NullAllowed)
     */
    public void setSlipItemNm5(String slipItemNm5) {
        __modifiedProperties.add("slipItemNm5");
        this._slipItemNm5 = slipItemNm5;
    }

    /**
     * [get] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @return The value of the column 'SLIP_ITEM_CD1'. (NullAllowed)
     */
    public String getSlipItemCd1() {
        return _slipItemCd1;
    }

    /**
     * [set] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @param slipItemCd1 The value of the column 'SLIP_ITEM_CD1'. (NullAllowed)
     */
    public void setSlipItemCd1(String slipItemCd1) {
        __modifiedProperties.add("slipItemCd1");
        this._slipItemCd1 = slipItemCd1;
    }

    /**
     * [get] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @return The value of the column 'SLIP_ITEM_CD2'. (NullAllowed)
     */
    public String getSlipItemCd2() {
        return _slipItemCd2;
    }

    /**
     * [set] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @param slipItemCd2 The value of the column 'SLIP_ITEM_CD2'. (NullAllowed)
     */
    public void setSlipItemCd2(String slipItemCd2) {
        __modifiedProperties.add("slipItemCd2");
        this._slipItemCd2 = slipItemCd2;
    }

    /**
     * [get] FREIGHT_HANDLING1: {varchar(30)} <br>
     * 荷扱い1
     * @return The value of the column 'FREIGHT_HANDLING1'. (NullAllowed)
     */
    public String getFreightHandling1() {
        return _freightHandling1;
    }

    /**
     * [set] FREIGHT_HANDLING1: {varchar(30)} <br>
     * 荷扱い1
     * @param freightHandling1 The value of the column 'FREIGHT_HANDLING1'. (NullAllowed)
     */
    public void setFreightHandling1(String freightHandling1) {
        __modifiedProperties.add("freightHandling1");
        this._freightHandling1 = freightHandling1;
    }

    /**
     * [get] FREIGHT_HANDLING2: {varchar(30)} <br>
     * 荷扱い2
     * @return The value of the column 'FREIGHT_HANDLING2'. (NullAllowed)
     */
    public String getFreightHandling2() {
        return _freightHandling2;
    }

    /**
     * [set] FREIGHT_HANDLING2: {varchar(30)} <br>
     * 荷扱い2
     * @param freightHandling2 The value of the column 'FREIGHT_HANDLING2'. (NullAllowed)
     */
    public void setFreightHandling2(String freightHandling2) {
        __modifiedProperties.add("freightHandling2");
        this._freightHandling2 = freightHandling2;
    }

    /**
     * [get] ARTICLE: {varchar(255)} <br>
     * 記事
     * @return The value of the column 'ARTICLE'. (NullAllowed)
     */
    public String getArticle() {
        return _article;
    }

    /**
     * [set] ARTICLE: {varchar(255)} <br>
     * 記事
     * @param article The value of the column 'ARTICLE'. (NullAllowed)
     */
    public void setArticle(String article) {
        __modifiedProperties.add("article");
        this._article = article;
    }

    /**
     * [get] RECEIVE_ID: {IX, bigint(19)} <br>
     * 受信ID
     * @return The value of the column 'RECEIVE_ID'. (NullAllowed)
     */
    public Long getReceiveId() {
        return _receiveId;
    }

    /**
     * [set] RECEIVE_ID: {IX, bigint(19)} <br>
     * 受信ID
     * @param receiveId The value of the column 'RECEIVE_ID'. (NullAllowed)
     */
    public void setReceiveId(Long receiveId) {
        __modifiedProperties.add("receiveId");
        this._receiveId = receiveId;
    }

    /**
     * [get] ROW_NO: {bigint(19)} <br>
     * 行No.
     * @return The value of the column 'ROW_NO'. (NullAllowed)
     */
    public Long getRowNo() {
        return _rowNo;
    }

    /**
     * [set] ROW_NO: {bigint(19)} <br>
     * 行No.
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed)
     */
    public void setRowNo(Long rowNo) {
        __modifiedProperties.add("rowNo");
        this._rowNo = rowNo;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * 取込フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * 取込フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public Long getImportTypeId() {
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public void setImportTypeId(Long importTypeId) {
        __modifiedProperties.add("importTypeId");
        this._importTypeId = importTypeId;
    }

    /**
     * [get] EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} <br>
     * EC受注ボディID
     * @return The value of the column 'EC_ORDER_B_ID'. (NullAllowed)
     */
    public Long getEcOrderBId() {
        return _ecOrderBId;
    }

    /**
     * [set] EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} <br>
     * EC受注ボディID
     * @param ecOrderBId The value of the column 'EC_ORDER_B_ID'. (NullAllowed)
     */
    public void setEcOrderBId(Long ecOrderBId) {
        __modifiedProperties.add("ecOrderBId");
        this._ecOrderBId = ecOrderBId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
