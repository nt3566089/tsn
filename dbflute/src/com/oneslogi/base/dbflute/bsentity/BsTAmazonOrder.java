package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of T_AMAZON_ORDER as TABLE. <br>
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long amazonOrderId = entity.getAmazonOrderId();
 * String orderId = entity.getOrderId();
 * String orderItemId = entity.getOrderItemId();
 * String purchaseDate = entity.getPurchaseDate();
 * String paymentsDate = entity.getPaymentsDate();
 * String buyerEmail = entity.getBuyerEmail();
 * String buyerName = entity.getBuyerName();
 * String buyerPhoneNumber = entity.getBuyerPhoneNumber();
 * String sku = entity.getSku();
 * String productName = entity.getProductName();
 * Long quantityPurchased = entity.getQuantityPurchased();
 * String currency = entity.getCurrency();
 * Long itemPrice = entity.getItemPrice();
 * Long itemTax = entity.getItemTax();
 * Long shippingPrice = entity.getShippingPrice();
 * Long shippingTax = entity.getShippingTax();
 * Long giftWrapPrice = entity.getGiftWrapPrice();
 * Long giftWrapTax = entity.getGiftWrapTax();
 * String shipServiceLevel = entity.getShipServiceLevel();
 * String recipientName = entity.getRecipientName();
 * String shipAddress1 = entity.getShipAddress1();
 * String shipAddress2 = entity.getShipAddress2();
 * String shipAddress3 = entity.getShipAddress3();
 * String shipCity = entity.getShipCity();
 * String shipState = entity.getShipState();
 * String shipPostalCode = entity.getShipPostalCode();
 * String shipCountry = entity.getShipCountry();
 * String shipPhoneNumber = entity.getShipPhoneNumber();
 * String giftWrapType = entity.getGiftWrapType();
 * String giftMassageText = entity.getGiftMassageText();
 * Long itemPromotionDiscount = entity.getItemPromotionDiscount();
 * String itemPromotionId = entity.getItemPromotionId();
 * Long shipPromotionDiscount = entity.getShipPromotionDiscount();
 * String shipPromotionId = entity.getShipPromotionId();
 * String deliveryStartDate = entity.getDeliveryStartDate();
 * String deliveryEndDate = entity.getDeliveryEndDate();
 * String deliveryTimeZone = entity.getDeliveryTimeZone();
 * String deliveryInstructions = entity.getDeliveryInstructions();
 * String paymentMethod = entity.getPaymentMethod();
 * Long codCollectibleAmount = entity.getCodCollectibleAmount();
 * Long alreadyPaid = entity.getAlreadyPaid();
 * Long paymentMethodFee = entity.getPaymentMethodFee();
 * String scheduledDeliStDate = entity.getScheduledDeliStDate();
 * String scheduledDeliEdDate = entity.getScheduledDeliEdDate();
 * Long packingQty = entity.getPackingQty();
 * String slipItemNm1 = entity.getSlipItemNm1();
 * String slipItemNm2 = entity.getSlipItemNm2();
 * String slipItemNm3 = entity.getSlipItemNm3();
 * String slipItemNm4 = entity.getSlipItemNm4();
 * String slipItemNm5 = entity.getSlipItemNm5();
 * String slipItemCd1 = entity.getSlipItemCd1();
 * String slipItemCd2 = entity.getSlipItemCd2();
 * String freightHandling1 = entity.getFreightHandling1();
 * String freightHandling2 = entity.getFreightHandling2();
 * String article = entity.getArticle();
 * Long receiveId = entity.getReceiveId();
 * Long rowNo = entity.getRowNo();
 * String errorFlg = entity.getErrorFlg();
 * String importFlg = entity.getImportFlg();
 * Long importTypeId = entity.getImportTypeId();
 * Long ecOrderBId = entity.getEcOrderBId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setAmazonOrderId(amazonOrderId);
 * entity.setOrderId(orderId);
 * entity.setOrderItemId(orderItemId);
 * entity.setPurchaseDate(purchaseDate);
 * entity.setPaymentsDate(paymentsDate);
 * entity.setBuyerEmail(buyerEmail);
 * entity.setBuyerName(buyerName);
 * entity.setBuyerPhoneNumber(buyerPhoneNumber);
 * entity.setSku(sku);
 * entity.setProductName(productName);
 * entity.setQuantityPurchased(quantityPurchased);
 * entity.setCurrency(currency);
 * entity.setItemPrice(itemPrice);
 * entity.setItemTax(itemTax);
 * entity.setShippingPrice(shippingPrice);
 * entity.setShippingTax(shippingTax);
 * entity.setGiftWrapPrice(giftWrapPrice);
 * entity.setGiftWrapTax(giftWrapTax);
 * entity.setShipServiceLevel(shipServiceLevel);
 * entity.setRecipientName(recipientName);
 * entity.setShipAddress1(shipAddress1);
 * entity.setShipAddress2(shipAddress2);
 * entity.setShipAddress3(shipAddress3);
 * entity.setShipCity(shipCity);
 * entity.setShipState(shipState);
 * entity.setShipPostalCode(shipPostalCode);
 * entity.setShipCountry(shipCountry);
 * entity.setShipPhoneNumber(shipPhoneNumber);
 * entity.setGiftWrapType(giftWrapType);
 * entity.setGiftMassageText(giftMassageText);
 * entity.setItemPromotionDiscount(itemPromotionDiscount);
 * entity.setItemPromotionId(itemPromotionId);
 * entity.setShipPromotionDiscount(shipPromotionDiscount);
 * entity.setShipPromotionId(shipPromotionId);
 * entity.setDeliveryStartDate(deliveryStartDate);
 * entity.setDeliveryEndDate(deliveryEndDate);
 * entity.setDeliveryTimeZone(deliveryTimeZone);
 * entity.setDeliveryInstructions(deliveryInstructions);
 * entity.setPaymentMethod(paymentMethod);
 * entity.setCodCollectibleAmount(codCollectibleAmount);
 * entity.setAlreadyPaid(alreadyPaid);
 * entity.setPaymentMethodFee(paymentMethodFee);
 * entity.setScheduledDeliStDate(scheduledDeliStDate);
 * entity.setScheduledDeliEdDate(scheduledDeliEdDate);
 * entity.setPackingQty(packingQty);
 * entity.setSlipItemNm1(slipItemNm1);
 * entity.setSlipItemNm2(slipItemNm2);
 * entity.setSlipItemNm3(slipItemNm3);
 * entity.setSlipItemNm4(slipItemNm4);
 * entity.setSlipItemNm5(slipItemNm5);
 * entity.setSlipItemCd1(slipItemCd1);
 * entity.setSlipItemCd2(slipItemCd2);
 * entity.setFreightHandling1(freightHandling1);
 * entity.setFreightHandling2(freightHandling2);
 * entity.setArticle(article);
 * entity.setReceiveId(receiveId);
 * entity.setRowNo(rowNo);
 * entity.setErrorFlg(errorFlg);
 * entity.setImportFlg(importFlg);
 * entity.setImportTypeId(importTypeId);
 * entity.setEcOrderBId(ecOrderBId);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTAmazonOrder extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _amazonOrderId;

    /** ORDER_ID: {varchar(30)} */
    protected String _orderId;

    /** ORDER_ITEM_ID: {varchar(30)} */
    protected String _orderItemId;

    /** PURCHASE_DATE: {varchar(30)} */
    protected String _purchaseDate;

    /** PAYMENTS_DATE: {varchar(30)} */
    protected String _paymentsDate;

    /** BUYER_EMAIL: {varchar(255)} */
    protected String _buyerEmail;

    /** BUYER_NAME: {varchar(255)} */
    protected String _buyerName;

    /** BUYER_PHONE_NUMBER: {varchar(255)} */
    protected String _buyerPhoneNumber;

    /** SKU: {varchar(30)} */
    protected String _sku;

    /** PRODUCT_NAME: {varchar(255)} */
    protected String _productName;

    /** QUANTITY_PURCHASED: {bigint(19)} */
    protected Long _quantityPurchased;

    /** CURRENCY: {varchar(60)} */
    protected String _currency;

    /** ITEM_PRICE: {bigint(19)} */
    protected Long _itemPrice;

    /** ITEM_TAX: {bigint(19)} */
    protected Long _itemTax;

    /** SHIPPING_PRICE: {bigint(19)} */
    protected Long _shippingPrice;

    /** SHIPPING_TAX: {bigint(19)} */
    protected Long _shippingTax;

    /** GIFT_WRAP_PRICE: {bigint(19)} */
    protected Long _giftWrapPrice;

    /** GIFT_WRAP_TAX: {bigint(19)} */
    protected Long _giftWrapTax;

    /** SHIP_SERVICE_LEVEL: {varchar(60)} */
    protected String _shipServiceLevel;

    /** RECIPIENT_NAME: {varchar(255)} */
    protected String _recipientName;

    /** SHIP_ADDRESS_1: {varchar(255)} */
    protected String _shipAddress1;

    /** SHIP_ADDRESS_2: {varchar(255)} */
    protected String _shipAddress2;

    /** SHIP_ADDRESS_3: {varchar(255)} */
    protected String _shipAddress3;

    /** SHIP_CITY: {varchar(255)} */
    protected String _shipCity;

    /** SHIP_STATE: {varchar(255)} */
    protected String _shipState;

    /** SHIP_POSTAL_CODE: {varchar(30)} */
    protected String _shipPostalCode;

    /** SHIP_COUNTRY: {varchar(30)} */
    protected String _shipCountry;

    /** SHIP_PHONE_NUMBER: {varchar(255)} */
    protected String _shipPhoneNumber;

    /** GIFT_WRAP_TYPE: {varchar(30)} */
    protected String _giftWrapType;

    /** GIFT_MASSAGE_TEXT: {varchar(60)} */
    protected String _giftMassageText;

    /** ITEM_PROMOTION_DISCOUNT: {bigint(19)} */
    protected Long _itemPromotionDiscount;

    /** ITEM_PROMOTION_ID: {varchar(30)} */
    protected String _itemPromotionId;

    /** SHIP_PROMOTION_DISCOUNT: {bigint(19)} */
    protected Long _shipPromotionDiscount;

    /** SHIP_PROMOTION_ID: {varchar(30)} */
    protected String _shipPromotionId;

    /** DELIVERY_START_DATE: {varchar(30)} */
    protected String _deliveryStartDate;

    /** DELIVERY_END_DATE: {varchar(30)} */
    protected String _deliveryEndDate;

    /** DELIVERY_TIME_ZONE: {varchar(30)} */
    protected String _deliveryTimeZone;

    /** DELIVERY_INSTRUCTIONS: {varchar(60)} */
    protected String _deliveryInstructions;

    /** PAYMENT_METHOD: {varchar(60)} */
    protected String _paymentMethod;

    /** COD_COLLECTIBLE_AMOUNT: {bigint(19)} */
    protected Long _codCollectibleAmount;

    /** ALREADY_PAID: {bigint(19)} */
    protected Long _alreadyPaid;

    /** PAYMENT_METHOD_FEE: {bigint(19)} */
    protected Long _paymentMethodFee;

    /** SCHEDULED_DELI_ST_DATE: {varchar(30)} */
    protected String _scheduledDeliStDate;

    /** SCHEDULED_DELI_ED_DATE: {varchar(30)} */
    protected String _scheduledDeliEdDate;

    /** PACKING_QTY: {bigint(19)} */
    protected Long _packingQty;

    /** SLIP_ITEM_NM1: {varchar(2147483647)} */
    protected String _slipItemNm1;

    /** SLIP_ITEM_NM2: {varchar(255)} */
    protected String _slipItemNm2;

    /** SLIP_ITEM_NM3: {varchar(255)} */
    protected String _slipItemNm3;

    /** SLIP_ITEM_NM4: {varchar(255)} */
    protected String _slipItemNm4;

    /** SLIP_ITEM_NM5: {varchar(255)} */
    protected String _slipItemNm5;

    /** SLIP_ITEM_CD1: {varchar(30)} */
    protected String _slipItemCd1;

    /** SLIP_ITEM_CD2: {varchar(30)} */
    protected String _slipItemCd2;

    /** FREIGHT_HANDLING1: {varchar(30)} */
    protected String _freightHandling1;

    /** FREIGHT_HANDLING2: {varchar(30)} */
    protected String _freightHandling2;

    /** ARTICLE: {varchar(255)} */
    protected String _article;

    /** RECEIVE_ID: {IX, bigint(19)} */
    protected Long _receiveId;

    /** ROW_NO: {bigint(19)} */
    protected Long _rowNo;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** IMPORT_FLG: {char(1)} */
    protected String _importFlg;

    /** IMPORT_TYPE_ID: {bigint(19)} */
    protected Long _importTypeId;

    /** EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} */
    protected Long _ecOrderBId;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "T_AMAZON_ORDER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_amazonOrderId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'. */
    protected TEcOrderB _tEcOrderB;

    /**
     * [get] T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'. <br>
     * @return The entity of foreign property 'TEcOrderB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TEcOrderB getTEcOrderB() {
        return _tEcOrderB;
    }

    /**
     * [set] T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @param tEcOrderB The entity of foreign property 'TEcOrderB'. (NullAllowed)
     */
    public void setTEcOrderB(TEcOrderB tEcOrderB) {
        _tEcOrderB = tEcOrderB;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTAmazonOrder) {
            BsTAmazonOrder other = (BsTAmazonOrder)obj;
            if (!xSV(_amazonOrderId, other._amazonOrderId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _amazonOrderId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tEcOrderB != null)
        { sb.append(li).append(xbRDS(_tEcOrderB, "tEcOrderB")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_amazonOrderId));
        sb.append(dm).append(xfND(_orderId));
        sb.append(dm).append(xfND(_orderItemId));
        sb.append(dm).append(xfND(_purchaseDate));
        sb.append(dm).append(xfND(_paymentsDate));
        sb.append(dm).append(xfND(_buyerEmail));
        sb.append(dm).append(xfND(_buyerName));
        sb.append(dm).append(xfND(_buyerPhoneNumber));
        sb.append(dm).append(xfND(_sku));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_quantityPurchased));
        sb.append(dm).append(xfND(_currency));
        sb.append(dm).append(xfND(_itemPrice));
        sb.append(dm).append(xfND(_itemTax));
        sb.append(dm).append(xfND(_shippingPrice));
        sb.append(dm).append(xfND(_shippingTax));
        sb.append(dm).append(xfND(_giftWrapPrice));
        sb.append(dm).append(xfND(_giftWrapTax));
        sb.append(dm).append(xfND(_shipServiceLevel));
        sb.append(dm).append(xfND(_recipientName));
        sb.append(dm).append(xfND(_shipAddress1));
        sb.append(dm).append(xfND(_shipAddress2));
        sb.append(dm).append(xfND(_shipAddress3));
        sb.append(dm).append(xfND(_shipCity));
        sb.append(dm).append(xfND(_shipState));
        sb.append(dm).append(xfND(_shipPostalCode));
        sb.append(dm).append(xfND(_shipCountry));
        sb.append(dm).append(xfND(_shipPhoneNumber));
        sb.append(dm).append(xfND(_giftWrapType));
        sb.append(dm).append(xfND(_giftMassageText));
        sb.append(dm).append(xfND(_itemPromotionDiscount));
        sb.append(dm).append(xfND(_itemPromotionId));
        sb.append(dm).append(xfND(_shipPromotionDiscount));
        sb.append(dm).append(xfND(_shipPromotionId));
        sb.append(dm).append(xfND(_deliveryStartDate));
        sb.append(dm).append(xfND(_deliveryEndDate));
        sb.append(dm).append(xfND(_deliveryTimeZone));
        sb.append(dm).append(xfND(_deliveryInstructions));
        sb.append(dm).append(xfND(_paymentMethod));
        sb.append(dm).append(xfND(_codCollectibleAmount));
        sb.append(dm).append(xfND(_alreadyPaid));
        sb.append(dm).append(xfND(_paymentMethodFee));
        sb.append(dm).append(xfND(_scheduledDeliStDate));
        sb.append(dm).append(xfND(_scheduledDeliEdDate));
        sb.append(dm).append(xfND(_packingQty));
        sb.append(dm).append(xfND(_slipItemNm1));
        sb.append(dm).append(xfND(_slipItemNm2));
        sb.append(dm).append(xfND(_slipItemNm3));
        sb.append(dm).append(xfND(_slipItemNm4));
        sb.append(dm).append(xfND(_slipItemNm5));
        sb.append(dm).append(xfND(_slipItemCd1));
        sb.append(dm).append(xfND(_slipItemCd2));
        sb.append(dm).append(xfND(_freightHandling1));
        sb.append(dm).append(xfND(_freightHandling2));
        sb.append(dm).append(xfND(_article));
        sb.append(dm).append(xfND(_receiveId));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_importTypeId));
        sb.append(dm).append(xfND(_ecOrderBId));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_tEcOrderB != null)
        { sb.append(dm).append("tEcOrderB"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TAmazonOrder clone() {
        return (TAmazonOrder)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * Amazon受注ID
     * @return The value of the column 'AMAZON_ORDER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAmazonOrderId() {
        checkSpecifiedProperty("amazonOrderId");
        return _amazonOrderId;
    }

    /**
     * [set] AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * Amazon受注ID
     * @param amazonOrderId The value of the column 'AMAZON_ORDER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAmazonOrderId(Long amazonOrderId) {
        registerModifiedProperty("amazonOrderId");
        _amazonOrderId = amazonOrderId;
    }

    /**
     * [get] ORDER_ID: {varchar(30)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderId() {
        checkSpecifiedProperty("orderId");
        return convertEmptyToNull(_orderId);
    }

    /**
     * [set] ORDER_ID: {varchar(30)} <br>
     * 受注番号
     * @param orderId The value of the column 'ORDER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderId(String orderId) {
        registerModifiedProperty("orderId");
        _orderId = orderId;
    }

    /**
     * [get] ORDER_ITEM_ID: {varchar(30)} <br>
     * Amazon商品ID
     * @return The value of the column 'ORDER_ITEM_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderItemId() {
        checkSpecifiedProperty("orderItemId");
        return convertEmptyToNull(_orderItemId);
    }

    /**
     * [set] ORDER_ITEM_ID: {varchar(30)} <br>
     * Amazon商品ID
     * @param orderItemId The value of the column 'ORDER_ITEM_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderItemId(String orderItemId) {
        registerModifiedProperty("orderItemId");
        _orderItemId = orderItemId;
    }

    /**
     * [get] PURCHASE_DATE: {varchar(30)} <br>
     * 受注日時
     * @return The value of the column 'PURCHASE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchaseDate() {
        checkSpecifiedProperty("purchaseDate");
        return convertEmptyToNull(_purchaseDate);
    }

    /**
     * [set] PURCHASE_DATE: {varchar(30)} <br>
     * 受注日時
     * @param purchaseDate The value of the column 'PURCHASE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseDate(String purchaseDate) {
        registerModifiedProperty("purchaseDate");
        _purchaseDate = purchaseDate;
    }

    /**
     * [get] PAYMENTS_DATE: {varchar(30)} <br>
     * 注文完了日時
     * @return The value of the column 'PAYMENTS_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentsDate() {
        checkSpecifiedProperty("paymentsDate");
        return convertEmptyToNull(_paymentsDate);
    }

    /**
     * [set] PAYMENTS_DATE: {varchar(30)} <br>
     * 注文完了日時
     * @param paymentsDate The value of the column 'PAYMENTS_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentsDate(String paymentsDate) {
        registerModifiedProperty("paymentsDate");
        _paymentsDate = paymentsDate;
    }

    /**
     * [get] BUYER_EMAIL: {varchar(255)} <br>
     * 注文者Eメールアドレス
     * @return The value of the column 'BUYER_EMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getBuyerEmail() {
        checkSpecifiedProperty("buyerEmail");
        return convertEmptyToNull(_buyerEmail);
    }

    /**
     * [set] BUYER_EMAIL: {varchar(255)} <br>
     * 注文者Eメールアドレス
     * @param buyerEmail The value of the column 'BUYER_EMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBuyerEmail(String buyerEmail) {
        registerModifiedProperty("buyerEmail");
        _buyerEmail = buyerEmail;
    }

    /**
     * [get] BUYER_NAME: {varchar(255)} <br>
     * 注文者名称(フルネーム)
     * @return The value of the column 'BUYER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBuyerName() {
        checkSpecifiedProperty("buyerName");
        return convertEmptyToNull(_buyerName);
    }

    /**
     * [set] BUYER_NAME: {varchar(255)} <br>
     * 注文者名称(フルネーム)
     * @param buyerName The value of the column 'BUYER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBuyerName(String buyerName) {
        registerModifiedProperty("buyerName");
        _buyerName = buyerName;
    }

    /**
     * [get] BUYER_PHONE_NUMBER: {varchar(255)} <br>
     * 注文者電話番号(数値のみ)
     * @return The value of the column 'BUYER_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getBuyerPhoneNumber() {
        checkSpecifiedProperty("buyerPhoneNumber");
        return convertEmptyToNull(_buyerPhoneNumber);
    }

    /**
     * [set] BUYER_PHONE_NUMBER: {varchar(255)} <br>
     * 注文者電話番号(数値のみ)
     * @param buyerPhoneNumber The value of the column 'BUYER_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        registerModifiedProperty("buyerPhoneNumber");
        _buyerPhoneNumber = buyerPhoneNumber;
    }

    /**
     * [get] SKU: {varchar(30)} <br>
     * 商品ID
     * @return The value of the column 'SKU'. (NullAllowed even if selected: for no constraint)
     */
    public String getSku() {
        checkSpecifiedProperty("sku");
        return convertEmptyToNull(_sku);
    }

    /**
     * [set] SKU: {varchar(30)} <br>
     * 商品ID
     * @param sku The value of the column 'SKU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSku(String sku) {
        registerModifiedProperty("sku");
        _sku = sku;
    }

    /**
     * [get] PRODUCT_NAME: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return convertEmptyToNull(_productName);
    }

    /**
     * [set] PRODUCT_NAME: {varchar(255)} <br>
     * 商品名称
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] QUANTITY_PURCHASED: {bigint(19)} <br>
     * 購入数
     * @return The value of the column 'QUANTITY_PURCHASED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getQuantityPurchased() {
        checkSpecifiedProperty("quantityPurchased");
        return _quantityPurchased;
    }

    /**
     * [set] QUANTITY_PURCHASED: {bigint(19)} <br>
     * 購入数
     * @param quantityPurchased The value of the column 'QUANTITY_PURCHASED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuantityPurchased(Long quantityPurchased) {
        registerModifiedProperty("quantityPurchased");
        _quantityPurchased = quantityPurchased;
    }

    /**
     * [get] CURRENCY: {varchar(60)} <br>
     * 決済通貨
     * @return The value of the column 'CURRENCY'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrency() {
        checkSpecifiedProperty("currency");
        return convertEmptyToNull(_currency);
    }

    /**
     * [set] CURRENCY: {varchar(60)} <br>
     * 決済通貨
     * @param currency The value of the column 'CURRENCY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrency(String currency) {
        registerModifiedProperty("currency");
        _currency = currency;
    }

    /**
     * [get] ITEM_PRICE: {bigint(19)} <br>
     * 商品金額
     * @return The value of the column 'ITEM_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemPrice() {
        checkSpecifiedProperty("itemPrice");
        return _itemPrice;
    }

    /**
     * [set] ITEM_PRICE: {bigint(19)} <br>
     * 商品金額
     * @param itemPrice The value of the column 'ITEM_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemPrice(Long itemPrice) {
        registerModifiedProperty("itemPrice");
        _itemPrice = itemPrice;
    }

    /**
     * [get] ITEM_TAX: {bigint(19)} <br>
     * 商品税額
     * @return The value of the column 'ITEM_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemTax() {
        checkSpecifiedProperty("itemTax");
        return _itemTax;
    }

    /**
     * [set] ITEM_TAX: {bigint(19)} <br>
     * 商品税額
     * @param itemTax The value of the column 'ITEM_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemTax(Long itemTax) {
        registerModifiedProperty("itemTax");
        _itemTax = itemTax;
    }

    /**
     * [get] SHIPPING_PRICE: {bigint(19)} <br>
     * 配送料金額
     * @return The value of the column 'SHIPPING_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingPrice() {
        checkSpecifiedProperty("shippingPrice");
        return _shippingPrice;
    }

    /**
     * [set] SHIPPING_PRICE: {bigint(19)} <br>
     * 配送料金額
     * @param shippingPrice The value of the column 'SHIPPING_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPrice(Long shippingPrice) {
        registerModifiedProperty("shippingPrice");
        _shippingPrice = shippingPrice;
    }

    /**
     * [get] SHIPPING_TAX: {bigint(19)} <br>
     * 配送料税額
     * @return The value of the column 'SHIPPING_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingTax() {
        checkSpecifiedProperty("shippingTax");
        return _shippingTax;
    }

    /**
     * [set] SHIPPING_TAX: {bigint(19)} <br>
     * 配送料税額
     * @param shippingTax The value of the column 'SHIPPING_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTax(Long shippingTax) {
        registerModifiedProperty("shippingTax");
        _shippingTax = shippingTax;
    }

    /**
     * [get] GIFT_WRAP_PRICE: {bigint(19)} <br>
     * ギフト包装金額
     * @return The value of the column 'GIFT_WRAP_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGiftWrapPrice() {
        checkSpecifiedProperty("giftWrapPrice");
        return _giftWrapPrice;
    }

    /**
     * [set] GIFT_WRAP_PRICE: {bigint(19)} <br>
     * ギフト包装金額
     * @param giftWrapPrice The value of the column 'GIFT_WRAP_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapPrice(Long giftWrapPrice) {
        registerModifiedProperty("giftWrapPrice");
        _giftWrapPrice = giftWrapPrice;
    }

    /**
     * [get] GIFT_WRAP_TAX: {bigint(19)} <br>
     * ギフト包装税額
     * @return The value of the column 'GIFT_WRAP_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGiftWrapTax() {
        checkSpecifiedProperty("giftWrapTax");
        return _giftWrapTax;
    }

    /**
     * [set] GIFT_WRAP_TAX: {bigint(19)} <br>
     * ギフト包装税額
     * @param giftWrapTax The value of the column 'GIFT_WRAP_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapTax(Long giftWrapTax) {
        registerModifiedProperty("giftWrapTax");
        _giftWrapTax = giftWrapTax;
    }

    /**
     * [get] SHIP_SERVICE_LEVEL: {varchar(60)} <br>
     * フルフィルメントサービス
     * @return The value of the column 'SHIP_SERVICE_LEVEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipServiceLevel() {
        checkSpecifiedProperty("shipServiceLevel");
        return convertEmptyToNull(_shipServiceLevel);
    }

    /**
     * [set] SHIP_SERVICE_LEVEL: {varchar(60)} <br>
     * フルフィルメントサービス
     * @param shipServiceLevel The value of the column 'SHIP_SERVICE_LEVEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipServiceLevel(String shipServiceLevel) {
        registerModifiedProperty("shipServiceLevel");
        _shipServiceLevel = shipServiceLevel;
    }

    /**
     * [get] RECIPIENT_NAME: {varchar(255)} <br>
     * 送付先名称
     * @return The value of the column 'RECIPIENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecipientName() {
        checkSpecifiedProperty("recipientName");
        return convertEmptyToNull(_recipientName);
    }

    /**
     * [set] RECIPIENT_NAME: {varchar(255)} <br>
     * 送付先名称
     * @param recipientName The value of the column 'RECIPIENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecipientName(String recipientName) {
        registerModifiedProperty("recipientName");
        _recipientName = recipientName;
    }

    /**
     * [get] SHIP_ADDRESS_1: {varchar(255)} <br>
     * 配送先住所1
     * @return The value of the column 'SHIP_ADDRESS_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress1() {
        checkSpecifiedProperty("shipAddress1");
        return convertEmptyToNull(_shipAddress1);
    }

    /**
     * [set] SHIP_ADDRESS_1: {varchar(255)} <br>
     * 配送先住所1
     * @param shipAddress1 The value of the column 'SHIP_ADDRESS_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress1(String shipAddress1) {
        registerModifiedProperty("shipAddress1");
        _shipAddress1 = shipAddress1;
    }

    /**
     * [get] SHIP_ADDRESS_2: {varchar(255)} <br>
     * 配送先住所2
     * @return The value of the column 'SHIP_ADDRESS_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress2() {
        checkSpecifiedProperty("shipAddress2");
        return convertEmptyToNull(_shipAddress2);
    }

    /**
     * [set] SHIP_ADDRESS_2: {varchar(255)} <br>
     * 配送先住所2
     * @param shipAddress2 The value of the column 'SHIP_ADDRESS_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress2(String shipAddress2) {
        registerModifiedProperty("shipAddress2");
        _shipAddress2 = shipAddress2;
    }

    /**
     * [get] SHIP_ADDRESS_3: {varchar(255)} <br>
     * 配送先住所3
     * @return The value of the column 'SHIP_ADDRESS_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress3() {
        checkSpecifiedProperty("shipAddress3");
        return convertEmptyToNull(_shipAddress3);
    }

    /**
     * [set] SHIP_ADDRESS_3: {varchar(255)} <br>
     * 配送先住所3
     * @param shipAddress3 The value of the column 'SHIP_ADDRESS_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress3(String shipAddress3) {
        registerModifiedProperty("shipAddress3");
        _shipAddress3 = shipAddress3;
    }

    /**
     * [get] SHIP_CITY: {varchar(255)} <br>
     * 配送先市区町村
     * @return The value of the column 'SHIP_CITY'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCity() {
        checkSpecifiedProperty("shipCity");
        return convertEmptyToNull(_shipCity);
    }

    /**
     * [set] SHIP_CITY: {varchar(255)} <br>
     * 配送先市区町村
     * @param shipCity The value of the column 'SHIP_CITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCity(String shipCity) {
        registerModifiedProperty("shipCity");
        _shipCity = shipCity;
    }

    /**
     * [get] SHIP_STATE: {varchar(255)} <br>
     * 配送先都道府県
     * @return The value of the column 'SHIP_STATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipState() {
        checkSpecifiedProperty("shipState");
        return convertEmptyToNull(_shipState);
    }

    /**
     * [set] SHIP_STATE: {varchar(255)} <br>
     * 配送先都道府県
     * @param shipState The value of the column 'SHIP_STATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipState(String shipState) {
        registerModifiedProperty("shipState");
        _shipState = shipState;
    }

    /**
     * [get] SHIP_POSTAL_CODE: {varchar(30)} <br>
     * 配送先郵便番号
     * @return The value of the column 'SHIP_POSTAL_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPostalCode() {
        checkSpecifiedProperty("shipPostalCode");
        return convertEmptyToNull(_shipPostalCode);
    }

    /**
     * [set] SHIP_POSTAL_CODE: {varchar(30)} <br>
     * 配送先郵便番号
     * @param shipPostalCode The value of the column 'SHIP_POSTAL_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPostalCode(String shipPostalCode) {
        registerModifiedProperty("shipPostalCode");
        _shipPostalCode = shipPostalCode;
    }

    /**
     * [get] SHIP_COUNTRY: {varchar(30)} <br>
     * 国別CD
     * @return The value of the column 'SHIP_COUNTRY'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCountry() {
        checkSpecifiedProperty("shipCountry");
        return convertEmptyToNull(_shipCountry);
    }

    /**
     * [set] SHIP_COUNTRY: {varchar(30)} <br>
     * 国別CD
     * @param shipCountry The value of the column 'SHIP_COUNTRY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCountry(String shipCountry) {
        registerModifiedProperty("shipCountry");
        _shipCountry = shipCountry;
    }

    /**
     * [get] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * 配送先電話番号
     * @return The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPhoneNumber() {
        checkSpecifiedProperty("shipPhoneNumber");
        return convertEmptyToNull(_shipPhoneNumber);
    }

    /**
     * [set] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * 配送先電話番号
     * @param shipPhoneNumber The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPhoneNumber(String shipPhoneNumber) {
        registerModifiedProperty("shipPhoneNumber");
        _shipPhoneNumber = shipPhoneNumber;
    }

    /**
     * [get] GIFT_WRAP_TYPE: {varchar(30)} <br>
     * ギフト包装ID
     * @return The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftWrapType() {
        checkSpecifiedProperty("giftWrapType");
        return convertEmptyToNull(_giftWrapType);
    }

    /**
     * [set] GIFT_WRAP_TYPE: {varchar(30)} <br>
     * ギフト包装ID
     * @param giftWrapType The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapType(String giftWrapType) {
        registerModifiedProperty("giftWrapType");
        _giftWrapType = giftWrapType;
    }

    /**
     * [get] GIFT_MASSAGE_TEXT: {varchar(60)} <br>
     * ギフトメッセージ
     * @return The value of the column 'GIFT_MASSAGE_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftMassageText() {
        checkSpecifiedProperty("giftMassageText");
        return convertEmptyToNull(_giftMassageText);
    }

    /**
     * [set] GIFT_MASSAGE_TEXT: {varchar(60)} <br>
     * ギフトメッセージ
     * @param giftMassageText The value of the column 'GIFT_MASSAGE_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftMassageText(String giftMassageText) {
        registerModifiedProperty("giftMassageText");
        _giftMassageText = giftMassageText;
    }

    /**
     * [get] ITEM_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 商品プロモーション割引額
     * @return The value of the column 'ITEM_PROMOTION_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemPromotionDiscount() {
        checkSpecifiedProperty("itemPromotionDiscount");
        return _itemPromotionDiscount;
    }

    /**
     * [set] ITEM_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 商品プロモーション割引額
     * @param itemPromotionDiscount The value of the column 'ITEM_PROMOTION_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemPromotionDiscount(Long itemPromotionDiscount) {
        registerModifiedProperty("itemPromotionDiscount");
        _itemPromotionDiscount = itemPromotionDiscount;
    }

    /**
     * [get] ITEM_PROMOTION_ID: {varchar(30)} <br>
     * 商品プロモーションID
     * @return The value of the column 'ITEM_PROMOTION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemPromotionId() {
        checkSpecifiedProperty("itemPromotionId");
        return convertEmptyToNull(_itemPromotionId);
    }

    /**
     * [set] ITEM_PROMOTION_ID: {varchar(30)} <br>
     * 商品プロモーションID
     * @param itemPromotionId The value of the column 'ITEM_PROMOTION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemPromotionId(String itemPromotionId) {
        registerModifiedProperty("itemPromotionId");
        _itemPromotionId = itemPromotionId;
    }

    /**
     * [get] SHIP_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 配送プロモーション割引額
     * @return The value of the column 'SHIP_PROMOTION_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShipPromotionDiscount() {
        checkSpecifiedProperty("shipPromotionDiscount");
        return _shipPromotionDiscount;
    }

    /**
     * [set] SHIP_PROMOTION_DISCOUNT: {bigint(19)} <br>
     * 配送プロモーション割引額
     * @param shipPromotionDiscount The value of the column 'SHIP_PROMOTION_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPromotionDiscount(Long shipPromotionDiscount) {
        registerModifiedProperty("shipPromotionDiscount");
        _shipPromotionDiscount = shipPromotionDiscount;
    }

    /**
     * [get] SHIP_PROMOTION_ID: {varchar(30)} <br>
     * 配送プロモーションID
     * @return The value of the column 'SHIP_PROMOTION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPromotionId() {
        checkSpecifiedProperty("shipPromotionId");
        return convertEmptyToNull(_shipPromotionId);
    }

    /**
     * [set] SHIP_PROMOTION_ID: {varchar(30)} <br>
     * 配送プロモーションID
     * @param shipPromotionId The value of the column 'SHIP_PROMOTION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPromotionId(String shipPromotionId) {
        registerModifiedProperty("shipPromotionId");
        _shipPromotionId = shipPromotionId;
    }

    /**
     * [get] DELIVERY_START_DATE: {varchar(30)} <br>
     * 配送予定日時(最速)
     * @return The value of the column 'DELIVERY_START_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryStartDate() {
        checkSpecifiedProperty("deliveryStartDate");
        return convertEmptyToNull(_deliveryStartDate);
    }

    /**
     * [set] DELIVERY_START_DATE: {varchar(30)} <br>
     * 配送予定日時(最速)
     * @param deliveryStartDate The value of the column 'DELIVERY_START_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryStartDate(String deliveryStartDate) {
        registerModifiedProperty("deliveryStartDate");
        _deliveryStartDate = deliveryStartDate;
    }

    /**
     * [get] DELIVERY_END_DATE: {varchar(30)} <br>
     * 配送予定日時(最遅)
     * @return The value of the column 'DELIVERY_END_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryEndDate() {
        checkSpecifiedProperty("deliveryEndDate");
        return convertEmptyToNull(_deliveryEndDate);
    }

    /**
     * [set] DELIVERY_END_DATE: {varchar(30)} <br>
     * 配送予定日時(最遅)
     * @param deliveryEndDate The value of the column 'DELIVERY_END_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryEndDate(String deliveryEndDate) {
        registerModifiedProperty("deliveryEndDate");
        _deliveryEndDate = deliveryEndDate;
    }

    /**
     * [get] DELIVERY_TIME_ZONE: {varchar(30)} <br>
     * 配送日時タイムゾーン
     * @return The value of the column 'DELIVERY_TIME_ZONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryTimeZone() {
        checkSpecifiedProperty("deliveryTimeZone");
        return convertEmptyToNull(_deliveryTimeZone);
    }

    /**
     * [set] DELIVERY_TIME_ZONE: {varchar(30)} <br>
     * 配送日時タイムゾーン
     * @param deliveryTimeZone The value of the column 'DELIVERY_TIME_ZONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryTimeZone(String deliveryTimeZone) {
        registerModifiedProperty("deliveryTimeZone");
        _deliveryTimeZone = deliveryTimeZone;
    }

    /**
     * [get] DELIVERY_INSTRUCTIONS: {varchar(60)} <br>
     * 配送特記事項
     * @return The value of the column 'DELIVERY_INSTRUCTIONS'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryInstructions() {
        checkSpecifiedProperty("deliveryInstructions");
        return convertEmptyToNull(_deliveryInstructions);
    }

    /**
     * [set] DELIVERY_INSTRUCTIONS: {varchar(60)} <br>
     * 配送特記事項
     * @param deliveryInstructions The value of the column 'DELIVERY_INSTRUCTIONS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryInstructions(String deliveryInstructions) {
        registerModifiedProperty("deliveryInstructions");
        _deliveryInstructions = deliveryInstructions;
    }

    /**
     * [get] PAYMENT_METHOD: {varchar(60)} <br>
     * 支払方法
     * @return The value of the column 'PAYMENT_METHOD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentMethod() {
        checkSpecifiedProperty("paymentMethod");
        return convertEmptyToNull(_paymentMethod);
    }

    /**
     * [set] PAYMENT_METHOD: {varchar(60)} <br>
     * 支払方法
     * @param paymentMethod The value of the column 'PAYMENT_METHOD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentMethod(String paymentMethod) {
        registerModifiedProperty("paymentMethod");
        _paymentMethod = paymentMethod;
    }

    /**
     * [get] COD_COLLECTIBLE_AMOUNT: {bigint(19)} <br>
     * 代金引換金額
     * @return The value of the column 'COD_COLLECTIBLE_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCodCollectibleAmount() {
        checkSpecifiedProperty("codCollectibleAmount");
        return _codCollectibleAmount;
    }

    /**
     * [set] COD_COLLECTIBLE_AMOUNT: {bigint(19)} <br>
     * 代金引換金額
     * @param codCollectibleAmount The value of the column 'COD_COLLECTIBLE_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodCollectibleAmount(Long codCollectibleAmount) {
        registerModifiedProperty("codCollectibleAmount");
        _codCollectibleAmount = codCollectibleAmount;
    }

    /**
     * [get] ALREADY_PAID: {bigint(19)} <br>
     * 代金引換Amazonギフト前払金額
     * @return The value of the column 'ALREADY_PAID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAlreadyPaid() {
        checkSpecifiedProperty("alreadyPaid");
        return _alreadyPaid;
    }

    /**
     * [set] ALREADY_PAID: {bigint(19)} <br>
     * 代金引換Amazonギフト前払金額
     * @param alreadyPaid The value of the column 'ALREADY_PAID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAlreadyPaid(Long alreadyPaid) {
        registerModifiedProperty("alreadyPaid");
        _alreadyPaid = alreadyPaid;
    }

    /**
     * [get] PAYMENT_METHOD_FEE: {bigint(19)} <br>
     * 支払方法別手数料
     * @return The value of the column 'PAYMENT_METHOD_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPaymentMethodFee() {
        checkSpecifiedProperty("paymentMethodFee");
        return _paymentMethodFee;
    }

    /**
     * [set] PAYMENT_METHOD_FEE: {bigint(19)} <br>
     * 支払方法別手数料
     * @param paymentMethodFee The value of the column 'PAYMENT_METHOD_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentMethodFee(Long paymentMethodFee) {
        registerModifiedProperty("paymentMethodFee");
        _paymentMethodFee = paymentMethodFee;
    }

    /**
     * [get] SCHEDULED_DELI_ST_DATE: {varchar(30)} <br>
     * 納品指定日時(最速)
     * @return The value of the column 'SCHEDULED_DELI_ST_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getScheduledDeliStDate() {
        checkSpecifiedProperty("scheduledDeliStDate");
        return convertEmptyToNull(_scheduledDeliStDate);
    }

    /**
     * [set] SCHEDULED_DELI_ST_DATE: {varchar(30)} <br>
     * 納品指定日時(最速)
     * @param scheduledDeliStDate The value of the column 'SCHEDULED_DELI_ST_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScheduledDeliStDate(String scheduledDeliStDate) {
        registerModifiedProperty("scheduledDeliStDate");
        _scheduledDeliStDate = scheduledDeliStDate;
    }

    /**
     * [get] SCHEDULED_DELI_ED_DATE: {varchar(30)} <br>
     * 納品指定日時(最遅)
     * @return The value of the column 'SCHEDULED_DELI_ED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getScheduledDeliEdDate() {
        checkSpecifiedProperty("scheduledDeliEdDate");
        return convertEmptyToNull(_scheduledDeliEdDate);
    }

    /**
     * [set] SCHEDULED_DELI_ED_DATE: {varchar(30)} <br>
     * 納品指定日時(最遅)
     * @param scheduledDeliEdDate The value of the column 'SCHEDULED_DELI_ED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScheduledDeliEdDate(String scheduledDeliEdDate) {
        registerModifiedProperty("scheduledDeliEdDate");
        _scheduledDeliEdDate = scheduledDeliEdDate;
    }

    /**
     * [get] PACKING_QTY: {bigint(19)} <br>
     * 個口数
     * @return The value of the column 'PACKING_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingQty() {
        checkSpecifiedProperty("packingQty");
        return _packingQty;
    }

    /**
     * [set] PACKING_QTY: {bigint(19)} <br>
     * 個口数
     * @param packingQty The value of the column 'PACKING_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingQty(Long packingQty) {
        registerModifiedProperty("packingQty");
        _packingQty = packingQty;
    }

    /**
     * [get] SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * 品名1
     * @return The value of the column 'SLIP_ITEM_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm1() {
        checkSpecifiedProperty("slipItemNm1");
        return convertEmptyToNull(_slipItemNm1);
    }

    /**
     * [set] SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * 品名1
     * @param slipItemNm1 The value of the column 'SLIP_ITEM_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm1(String slipItemNm1) {
        registerModifiedProperty("slipItemNm1");
        _slipItemNm1 = slipItemNm1;
    }

    /**
     * [get] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @return The value of the column 'SLIP_ITEM_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm2() {
        checkSpecifiedProperty("slipItemNm2");
        return convertEmptyToNull(_slipItemNm2);
    }

    /**
     * [set] SLIP_ITEM_NM2: {varchar(255)} <br>
     * 品名2
     * @param slipItemNm2 The value of the column 'SLIP_ITEM_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm2(String slipItemNm2) {
        registerModifiedProperty("slipItemNm2");
        _slipItemNm2 = slipItemNm2;
    }

    /**
     * [get] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @return The value of the column 'SLIP_ITEM_NM3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm3() {
        checkSpecifiedProperty("slipItemNm3");
        return convertEmptyToNull(_slipItemNm3);
    }

    /**
     * [set] SLIP_ITEM_NM3: {varchar(255)} <br>
     * 品名3
     * @param slipItemNm3 The value of the column 'SLIP_ITEM_NM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm3(String slipItemNm3) {
        registerModifiedProperty("slipItemNm3");
        _slipItemNm3 = slipItemNm3;
    }

    /**
     * [get] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @return The value of the column 'SLIP_ITEM_NM4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm4() {
        checkSpecifiedProperty("slipItemNm4");
        return convertEmptyToNull(_slipItemNm4);
    }

    /**
     * [set] SLIP_ITEM_NM4: {varchar(255)} <br>
     * 品名4
     * @param slipItemNm4 The value of the column 'SLIP_ITEM_NM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm4(String slipItemNm4) {
        registerModifiedProperty("slipItemNm4");
        _slipItemNm4 = slipItemNm4;
    }

    /**
     * [get] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @return The value of the column 'SLIP_ITEM_NM5'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemNm5() {
        checkSpecifiedProperty("slipItemNm5");
        return convertEmptyToNull(_slipItemNm5);
    }

    /**
     * [set] SLIP_ITEM_NM5: {varchar(255)} <br>
     * 品名5
     * @param slipItemNm5 The value of the column 'SLIP_ITEM_NM5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemNm5(String slipItemNm5) {
        registerModifiedProperty("slipItemNm5");
        _slipItemNm5 = slipItemNm5;
    }

    /**
     * [get] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @return The value of the column 'SLIP_ITEM_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemCd1() {
        checkSpecifiedProperty("slipItemCd1");
        return convertEmptyToNull(_slipItemCd1);
    }

    /**
     * [set] SLIP_ITEM_CD1: {varchar(30)} <br>
     * 品名CD1
     * @param slipItemCd1 The value of the column 'SLIP_ITEM_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemCd1(String slipItemCd1) {
        registerModifiedProperty("slipItemCd1");
        _slipItemCd1 = slipItemCd1;
    }

    /**
     * [get] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @return The value of the column 'SLIP_ITEM_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipItemCd2() {
        checkSpecifiedProperty("slipItemCd2");
        return convertEmptyToNull(_slipItemCd2);
    }

    /**
     * [set] SLIP_ITEM_CD2: {varchar(30)} <br>
     * 品名CD2
     * @param slipItemCd2 The value of the column 'SLIP_ITEM_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipItemCd2(String slipItemCd2) {
        registerModifiedProperty("slipItemCd2");
        _slipItemCd2 = slipItemCd2;
    }

    /**
     * [get] FREIGHT_HANDLING1: {varchar(30)} <br>
     * 荷扱い1
     * @return The value of the column 'FREIGHT_HANDLING1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightHandling1() {
        checkSpecifiedProperty("freightHandling1");
        return convertEmptyToNull(_freightHandling1);
    }

    /**
     * [set] FREIGHT_HANDLING1: {varchar(30)} <br>
     * 荷扱い1
     * @param freightHandling1 The value of the column 'FREIGHT_HANDLING1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightHandling1(String freightHandling1) {
        registerModifiedProperty("freightHandling1");
        _freightHandling1 = freightHandling1;
    }

    /**
     * [get] FREIGHT_HANDLING2: {varchar(30)} <br>
     * 荷扱い2
     * @return The value of the column 'FREIGHT_HANDLING2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightHandling2() {
        checkSpecifiedProperty("freightHandling2");
        return convertEmptyToNull(_freightHandling2);
    }

    /**
     * [set] FREIGHT_HANDLING2: {varchar(30)} <br>
     * 荷扱い2
     * @param freightHandling2 The value of the column 'FREIGHT_HANDLING2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightHandling2(String freightHandling2) {
        registerModifiedProperty("freightHandling2");
        _freightHandling2 = freightHandling2;
    }

    /**
     * [get] ARTICLE: {varchar(255)} <br>
     * 記事
     * @return The value of the column 'ARTICLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticle() {
        checkSpecifiedProperty("article");
        return convertEmptyToNull(_article);
    }

    /**
     * [set] ARTICLE: {varchar(255)} <br>
     * 記事
     * @param article The value of the column 'ARTICLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticle(String article) {
        registerModifiedProperty("article");
        _article = article;
    }

    /**
     * [get] RECEIVE_ID: {IX, bigint(19)} <br>
     * 受信ID
     * @return The value of the column 'RECEIVE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveId() {
        checkSpecifiedProperty("receiveId");
        return _receiveId;
    }

    /**
     * [set] RECEIVE_ID: {IX, bigint(19)} <br>
     * 受信ID
     * @param receiveId The value of the column 'RECEIVE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveId(Long receiveId) {
        registerModifiedProperty("receiveId");
        _receiveId = receiveId;
    }

    /**
     * [get] ROW_NO: {bigint(19)} <br>
     * 行No.
     * @return The value of the column 'ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRowNo() {
        checkSpecifiedProperty("rowNo");
        return _rowNo;
    }

    /**
     * [set] ROW_NO: {bigint(19)} <br>
     * 行No.
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRowNo(Long rowNo) {
        registerModifiedProperty("rowNo");
        _rowNo = rowNo;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * 取込フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * 取込フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getImportTypeId() {
        checkSpecifiedProperty("importTypeId");
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportTypeId(Long importTypeId) {
        registerModifiedProperty("importTypeId");
        _importTypeId = importTypeId;
    }

    /**
     * [get] EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} <br>
     * EC受注ボディID
     * @return The value of the column 'EC_ORDER_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEcOrderBId() {
        checkSpecifiedProperty("ecOrderBId");
        return _ecOrderBId;
    }

    /**
     * [set] EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B} <br>
     * EC受注ボディID
     * @param ecOrderBId The value of the column 'EC_ORDER_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderBId(Long ecOrderBId) {
        registerModifiedProperty("ecOrderBId");
        _ecOrderBId = ecOrderBId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
