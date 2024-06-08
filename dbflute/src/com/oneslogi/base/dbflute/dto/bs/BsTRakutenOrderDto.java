package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_RAKUTEN_ORDER as TABLE. <br>
 * 楽天RMS受注
 * <pre>
 * [primary-key]
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
public abstract class BsTRakutenOrderDto implements Serializable {

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
    /** RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _rakutenOrderId;

    /** ORDER_NO: {varchar(100)} */
    @JsonKey
    protected String _orderNo;

    /** ORDER_STATUS: {varchar(30)} */
    @JsonKey
    protected String _orderStatus;

    /** CARD_STATUS: {varchar(30)} */
    @JsonKey
    protected String _cardStatus;

    /** PAYMENT_DT: {varchar(30)} */
    @JsonKey
    protected String _paymentDt;

    /** SHIPPING_DT: {varchar(30)} */
    @JsonKey
    protected String _shippingDt;

    /** DELIV_TZ: {varchar(30)} */
    @JsonKey
    protected String _delivTz;

    /** DELIV_DT: {varchar(30)} */
    @JsonKey
    protected String _delivDt;

    /** PERSON_IN_CHARGE: {varchar(30)} */
    @JsonKey
    protected String _personInCharge;

    /** SINGLE_MEMO: {varchar(255)} */
    @JsonKey
    protected String _singleMemo;

    /** MAIL_INPUT: {varchar(255)} */
    @JsonKey
    protected String _mailInput;

    /** FIRST_PAYMENT: {bigint(19)} */
    @JsonKey
    protected Long _firstPayment;

    /** TERMINAL: {varchar(100)} */
    @JsonKey
    protected String _terminal;

    /** MAIL_CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _mailCarrierCd;

    /** GIFT_FLG: {char(1)} */
    @JsonKey
    protected String _giftFlg;

    /** RAKUTEN_ORDER_COMMENT: {varchar(255)} */
    @JsonKey
    protected String _rakutenOrderComment;

    /** ORDER_DATETIME: {varchar(30)} */
    @JsonKey
    protected String _orderDatetime;

    /** MULTI_DELIV_FLG: {char(1)} */
    @JsonKey
    protected String _multiDelivFlg;

    /** ALERT_FLG: {char(1)} */
    @JsonKey
    protected String _alertFlg;

    /** MEMBER_FLG: {char(1)} */
    @JsonKey
    protected String _memberFlg;

    /** TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _total;

    /** TAX: {bigint(19)} */
    @JsonKey
    protected Long _tax;

    /** CARRIAGE: {bigint(19)} */
    @JsonKey
    protected Long _carriage;

    /** COD: {bigint(19)} */
    @JsonKey
    protected Long _cod;

    /** AMOUNT_BILLED: {bigint(19)} */
    @JsonKey
    protected Long _amountBilled;

    /** TOTAL_AMOUNT: {bigint(19)} */
    @JsonKey
    protected Long _totalAmount;

    /** COMBINE_ID: {varchar(30)} */
    @JsonKey
    protected String _combineId;

    /** COMBINE_STATUS: {varchar(30)} */
    @JsonKey
    protected String _combineStatus;

    /** COMBINE_TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _combineTotal;

    /** COMBINE_CARRIAGE: {bigint(19)} */
    @JsonKey
    protected Long _combineCarriage;

    /** COMBINE_COD: {bigint(19)} */
    @JsonKey
    protected Long _combineCod;

    /** COMBINE_TAX: {bigint(19)} */
    @JsonKey
    protected Long _combineTax;

    /** COMBINE_BILLED: {bigint(19)} */
    @JsonKey
    protected Long _combineBilled;

    /** COMBINE_AMOUNT: {bigint(19)} */
    @JsonKey
    protected Long _combineAmount;

    /** COMBINE_BANK_FEE: {bigint(19)} */
    @JsonKey
    protected Long _combineBankFee;

    /** COMBINE_POINT_USE: {bigint(19)} */
    @JsonKey
    protected Long _combinePointUse;

    /** MAIL_FLG: {char(1)} */
    @JsonKey
    protected String _mailFlg;

    /** ORDER_DT: {varchar(30)} */
    @JsonKey
    protected String _orderDt;

    /** ORDER_TIME: {varchar(30)} */
    @JsonKey
    protected String _orderTime;

    /** MOBILE_PAYMENT_NO: {varchar(30)} */
    @JsonKey
    protected String _mobilePaymentNo;

    /** HISTORY_MOD_FLG: {varchar(30)} */
    @JsonKey
    protected String _historyModFlg;

    /** HISTORY_ICON_FLG: {char(1)} */
    @JsonKey
    protected String _historyIconFlg;

    /** HISTORY_MAIL_FLG: {char(1)} */
    @JsonKey
    protected String _historyMailFlg;

    /** DELIV_MATCH_FLG: {char(1)} */
    @JsonKey
    protected String _delivMatchFlg;

    /** POINT_USE_FLG: {char(1)} */
    @JsonKey
    protected String _pointUseFlg;

    /** ORDER_ZIP_CD1: {varchar(30)} */
    @JsonKey
    protected String _orderZipCd1;

    /** ORDER_ZIP_CD2: {varchar(30)} */
    @JsonKey
    protected String _orderZipCd2;

    /** ORDER_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _orderAddress1;

    /** ORDER_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _orderAddress2;

    /** ORDER_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _orderAddress3;

    /** ORDER_CUSTOMER_NM1: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerNm1;

    /** ORDER_CUSTOMER_NM2: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerNm2;

    /** ORDER_CUSTOMER_KN1: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerKn1;

    /** ORDER_CUSTOMER_KN2: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerKn2;

    /** ORDER_TEL_NO1: {varchar(255)} */
    @JsonKey
    protected String _orderTelNo1;

    /** ORDER_TEL_NO2: {varchar(255)} */
    @JsonKey
    protected String _orderTelNo2;

    /** ORDER_TEL_NO3: {varchar(255)} */
    @JsonKey
    protected String _orderTelNo3;

    /** MAIL_ADDRESS: {varchar(255)} */
    @JsonKey
    protected String _mailAddress;

    /** ORDER_SEX: {varchar(30)} */
    @JsonKey
    protected String _orderSex;

    /** ORDER_BIRTHDAY: {varchar(30)} */
    @JsonKey
    protected String _orderBirthday;

    /** PAYMENT_METHOD: {varchar(255)} */
    @JsonKey
    protected String _paymentMethod;

    /** CARD_TYPE: {varchar(100)} */
    @JsonKey
    protected String _cardType;

    /** CARD_NO: {varchar(255)} */
    @JsonKey
    protected String _cardNo;

    /** CARD_NM: {varchar(255)} */
    @JsonKey
    protected String _cardNm;

    /** CARD_AVAILABLE: {varchar(255)} */
    @JsonKey
    protected String _cardAvailable;

    /** CARD_INST: {varchar(30)} */
    @JsonKey
    protected String _cardInst;

    /** CARD_INST_COMMENT: {varchar(255)} */
    @JsonKey
    protected String _cardInstComment;

    /** DELIV_METHOD: {varchar(255)} */
    @JsonKey
    protected String _delivMethod;

    /** DELIV_TYPE: {varchar(255)} */
    @JsonKey
    protected String _delivType;

    /** POINT_USE: {bigint(19)} */
    @JsonKey
    protected Long _pointUse;

    /** POINT_CONDITION: {varchar(30)} */
    @JsonKey
    protected String _pointCondition;

    /** POINT_STATUS: {varchar(30)} */
    @JsonKey
    protected String _pointStatus;

    /** BANK_STATUS: {varchar(30)} */
    @JsonKey
    protected String _bankStatus;

    /** BANK_FEE_FLG: {char(1)} */
    @JsonKey
    protected String _bankFeeFlg;

    /** BANK_FEE: {bigint(19)} */
    @JsonKey
    protected Long _bankFee;

    /** WRAPPING_TITLE_P: {varchar(255)} */
    @JsonKey
    protected String _wrappingTitleP;

    /** WRAPPING_NM_P: {varchar(255)} */
    @JsonKey
    protected String _wrappingNmP;

    /** WRAPPING_FEE_P: {bigint(19)} */
    @JsonKey
    protected Long _wrappingFeeP;

    /** WRAPPING_TAX_P: {bigint(19)} */
    @JsonKey
    protected Long _wrappingTaxP;

    /** WRAPPING_TITLE_R: {varchar(255)} */
    @JsonKey
    protected String _wrappingTitleR;

    /** WRAPPING_NM_R: {varchar(255)} */
    @JsonKey
    protected String _wrappingNmR;

    /** WRAPPING_FEE_R: {bigint(19)} */
    @JsonKey
    protected Long _wrappingFeeR;

    /** WRAPPING_TAX_R: {bigint(19)} */
    @JsonKey
    protected Long _wrappingTaxR;

    /** DELIV_CARRIAGE: {bigint(19)} */
    @JsonKey
    protected Long _delivCarriage;

    /** DELIV_COD: {bigint(19)} */
    @JsonKey
    protected Long _delivCod;

    /** DELIV_TAX: {bigint(19)} */
    @JsonKey
    protected Long _delivTax;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** DELIV_TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _delivTotal;

    /** NOSHI: {varchar(255)} */
    @JsonKey
    protected String _noshi;

    /** DELIV_ZIP_CD1: {varchar(30)} */
    @JsonKey
    protected String _delivZipCd1;

    /** DELIV_ZIP_CD2: {varchar(30)} */
    @JsonKey
    protected String _delivZipCd2;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** DELIV_CUSTOMER_NM1: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm2;

    /** DELIV_CUSTOMER_KN1: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerKn1;

    /** DELIV_CUSTOMER_KN2: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerKn2;

    /** DELIV_TEL_NO1: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo1;

    /** DELIV_TEL_NO2: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo2;

    /** DELIV_TEL_NO3: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo3;

    /** PRODUCT_ID: {varchar(30)} */
    @JsonKey
    protected String _productId;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_NO: {varchar(100)} */
    @JsonKey
    protected String _productNo;

    /** PRODUCT_URL: {varchar(100)} */
    @JsonKey
    protected String _productUrl;

    /** UNIT_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _unitPrice;

    /** ORDER_NUM: {bigint(19)} */
    @JsonKey
    protected Long _orderNum;

    /** PRODUCT_CARRIAGE: {bigint(19)} */
    @JsonKey
    protected Long _productCarriage;

    /** PRODUCT_TAX: {bigint(19)} */
    @JsonKey
    protected Long _productTax;

    /** PRODUCT_COD: {bigint(19)} */
    @JsonKey
    protected Long _productCod;

    /** ITEM_CHOICE: {varchar(255)} */
    @JsonKey
    protected String _itemChoice;

    /** POINT_SCALE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pointScale;

    /** POINT_TYPE: {varchar(100)} */
    @JsonKey
    protected String _pointType;

    /** RECORD_NUMBER: {bigint(19)} */
    @JsonKey
    protected Long _recordNumber;

    /** DELIVERY_INFO: {varchar(100)} */
    @JsonKey
    protected String _deliveryInfo;

    /** STOCK_TYPE: {varchar(100)} */
    @JsonKey
    protected String _stockType;

    /** WRAPPING_TYPE_P: {varchar(255)} */
    @JsonKey
    protected String _wrappingTypeP;

    /** WRAPPING_TYPE_R: {varchar(255)} */
    @JsonKey
    protected String _wrappingTypeR;

    /** TOMORROW_FLG: {varchar(30)} */
    @JsonKey
    protected String _tomorrowFlg;

    /** COUPON_USE: {bigint(19)} */
    @JsonKey
    protected Long _couponUse;

    /** SHOP_COUPON_USE: {bigint(19)} */
    @JsonKey
    protected Long _shopCouponUse;

    /** RAKUTEN_COUPON_USE: {bigint(19)} */
    @JsonKey
    protected Long _rakutenCouponUse;

    /** COMBINE_COUPON_USE: {bigint(19)} */
    @JsonKey
    protected Long _combineCouponUse;

    /** DELIV_COMPANY: {varchar(255)} */
    @JsonKey
    protected String _delivCompany;

    /** PHAMACE_FLG: {char(1)} */
    @JsonKey
    protected String _phamaceFlg;

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
    public BsTRakutenOrderDto() {
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
        if (other == null || !(other instanceof BsTRakutenOrderDto)) { return false; }
        final BsTRakutenOrderDto otherEntity = (BsTRakutenOrderDto)other;
        if (!helpComparingValue(getRakutenOrderId(), otherEntity.getRakutenOrderId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_RAKUTEN_ORDER");
        result = xCH(result, getRakutenOrderId());
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
        sb.append(c).append(getRakutenOrderId());
        sb.append(c).append(getOrderNo());
        sb.append(c).append(getOrderStatus());
        sb.append(c).append(getCardStatus());
        sb.append(c).append(getPaymentDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getPersonInCharge());
        sb.append(c).append(getSingleMemo());
        sb.append(c).append(getMailInput());
        sb.append(c).append(getFirstPayment());
        sb.append(c).append(getTerminal());
        sb.append(c).append(getMailCarrierCd());
        sb.append(c).append(getGiftFlg());
        sb.append(c).append(getRakutenOrderComment());
        sb.append(c).append(getOrderDatetime());
        sb.append(c).append(getMultiDelivFlg());
        sb.append(c).append(getAlertFlg());
        sb.append(c).append(getMemberFlg());
        sb.append(c).append(getTotal());
        sb.append(c).append(getTax());
        sb.append(c).append(getCarriage());
        sb.append(c).append(getCod());
        sb.append(c).append(getAmountBilled());
        sb.append(c).append(getTotalAmount());
        sb.append(c).append(getCombineId());
        sb.append(c).append(getCombineStatus());
        sb.append(c).append(getCombineTotal());
        sb.append(c).append(getCombineCarriage());
        sb.append(c).append(getCombineCod());
        sb.append(c).append(getCombineTax());
        sb.append(c).append(getCombineBilled());
        sb.append(c).append(getCombineAmount());
        sb.append(c).append(getCombineBankFee());
        sb.append(c).append(getCombinePointUse());
        sb.append(c).append(getMailFlg());
        sb.append(c).append(getOrderDt());
        sb.append(c).append(getOrderTime());
        sb.append(c).append(getMobilePaymentNo());
        sb.append(c).append(getHistoryModFlg());
        sb.append(c).append(getHistoryIconFlg());
        sb.append(c).append(getHistoryMailFlg());
        sb.append(c).append(getDelivMatchFlg());
        sb.append(c).append(getPointUseFlg());
        sb.append(c).append(getOrderZipCd1());
        sb.append(c).append(getOrderZipCd2());
        sb.append(c).append(getOrderAddress1());
        sb.append(c).append(getOrderAddress2());
        sb.append(c).append(getOrderAddress3());
        sb.append(c).append(getOrderCustomerNm1());
        sb.append(c).append(getOrderCustomerNm2());
        sb.append(c).append(getOrderCustomerKn1());
        sb.append(c).append(getOrderCustomerKn2());
        sb.append(c).append(getOrderTelNo1());
        sb.append(c).append(getOrderTelNo2());
        sb.append(c).append(getOrderTelNo3());
        sb.append(c).append(getMailAddress());
        sb.append(c).append(getOrderSex());
        sb.append(c).append(getOrderBirthday());
        sb.append(c).append(getPaymentMethod());
        sb.append(c).append(getCardType());
        sb.append(c).append(getCardNo());
        sb.append(c).append(getCardNm());
        sb.append(c).append(getCardAvailable());
        sb.append(c).append(getCardInst());
        sb.append(c).append(getCardInstComment());
        sb.append(c).append(getDelivMethod());
        sb.append(c).append(getDelivType());
        sb.append(c).append(getPointUse());
        sb.append(c).append(getPointCondition());
        sb.append(c).append(getPointStatus());
        sb.append(c).append(getBankStatus());
        sb.append(c).append(getBankFeeFlg());
        sb.append(c).append(getBankFee());
        sb.append(c).append(getWrappingTitleP());
        sb.append(c).append(getWrappingNmP());
        sb.append(c).append(getWrappingFeeP());
        sb.append(c).append(getWrappingTaxP());
        sb.append(c).append(getWrappingTitleR());
        sb.append(c).append(getWrappingNmR());
        sb.append(c).append(getWrappingFeeR());
        sb.append(c).append(getWrappingTaxR());
        sb.append(c).append(getDelivCarriage());
        sb.append(c).append(getDelivCod());
        sb.append(c).append(getDelivTax());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getDelivTotal());
        sb.append(c).append(getNoshi());
        sb.append(c).append(getDelivZipCd1());
        sb.append(c).append(getDelivZipCd2());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivCustomerNm1());
        sb.append(c).append(getDelivCustomerNm2());
        sb.append(c).append(getDelivCustomerKn1());
        sb.append(c).append(getDelivCustomerKn2());
        sb.append(c).append(getDelivTelNo1());
        sb.append(c).append(getDelivTelNo2());
        sb.append(c).append(getDelivTelNo3());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductNo());
        sb.append(c).append(getProductUrl());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getOrderNum());
        sb.append(c).append(getProductCarriage());
        sb.append(c).append(getProductTax());
        sb.append(c).append(getProductCod());
        sb.append(c).append(getItemChoice());
        sb.append(c).append(getPointScale());
        sb.append(c).append(getPointType());
        sb.append(c).append(getRecordNumber());
        sb.append(c).append(getDeliveryInfo());
        sb.append(c).append(getStockType());
        sb.append(c).append(getWrappingTypeP());
        sb.append(c).append(getWrappingTypeR());
        sb.append(c).append(getTomorrowFlg());
        sb.append(c).append(getCouponUse());
        sb.append(c).append(getShopCouponUse());
        sb.append(c).append(getRakutenCouponUse());
        sb.append(c).append(getCombineCouponUse());
        sb.append(c).append(getDelivCompany());
        sb.append(c).append(getPhamaceFlg());
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
     * [get] RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 楽天RMS受注ID
     * @return The value of the column 'RAKUTEN_ORDER_ID'. (NullAllowed)
     */
    public Long getRakutenOrderId() {
        return _rakutenOrderId;
    }

    /**
     * [set] RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 楽天RMS受注ID
     * @param rakutenOrderId The value of the column 'RAKUTEN_ORDER_ID'. (NullAllowed)
     */
    public void setRakutenOrderId(Long rakutenOrderId) {
        __modifiedProperties.add("rakutenOrderId");
        this._rakutenOrderId = rakutenOrderId;
    }

    /**
     * [get] ORDER_NO: {varchar(100)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public String getOrderNo() {
        return _orderNo;
    }

    /**
     * [set] ORDER_NO: {varchar(100)} <br>
     * 受注番号
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public void setOrderNo(String orderNo) {
        __modifiedProperties.add("orderNo");
        this._orderNo = orderNo;
    }

    /**
     * [get] ORDER_STATUS: {varchar(30)} <br>
     * 受注ステータス
     * @return The value of the column 'ORDER_STATUS'. (NullAllowed)
     */
    public String getOrderStatus() {
        return _orderStatus;
    }

    /**
     * [set] ORDER_STATUS: {varchar(30)} <br>
     * 受注ステータス
     * @param orderStatus The value of the column 'ORDER_STATUS'. (NullAllowed)
     */
    public void setOrderStatus(String orderStatus) {
        __modifiedProperties.add("orderStatus");
        this._orderStatus = orderStatus;
    }

    /**
     * [get] CARD_STATUS: {varchar(30)} <br>
     * カード決済ステータス
     * @return The value of the column 'CARD_STATUS'. (NullAllowed)
     */
    public String getCardStatus() {
        return _cardStatus;
    }

    /**
     * [set] CARD_STATUS: {varchar(30)} <br>
     * カード決済ステータス
     * @param cardStatus The value of the column 'CARD_STATUS'. (NullAllowed)
     */
    public void setCardStatus(String cardStatus) {
        __modifiedProperties.add("cardStatus");
        this._cardStatus = cardStatus;
    }

    /**
     * [get] PAYMENT_DT: {varchar(30)} <br>
     * 入金日
     * @return The value of the column 'PAYMENT_DT'. (NullAllowed)
     */
    public String getPaymentDt() {
        return _paymentDt;
    }

    /**
     * [set] PAYMENT_DT: {varchar(30)} <br>
     * 入金日
     * @param paymentDt The value of the column 'PAYMENT_DT'. (NullAllowed)
     */
    public void setPaymentDt(String paymentDt) {
        __modifiedProperties.add("paymentDt");
        this._paymentDt = paymentDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(30)} <br>
     * 配送日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {varchar(30)} <br>
     * 配送日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30)} <br>
     * お届け時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {varchar(30)} <br>
     * お届け時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] DELIV_DT: {varchar(30)} <br>
     * お届け日指定
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {varchar(30)} <br>
     * お届け日指定
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] PERSON_IN_CHARGE: {varchar(30)} <br>
     * 担当者
     * @return The value of the column 'PERSON_IN_CHARGE'. (NullAllowed)
     */
    public String getPersonInCharge() {
        return _personInCharge;
    }

    /**
     * [set] PERSON_IN_CHARGE: {varchar(30)} <br>
     * 担当者
     * @param personInCharge The value of the column 'PERSON_IN_CHARGE'. (NullAllowed)
     */
    public void setPersonInCharge(String personInCharge) {
        __modifiedProperties.add("personInCharge");
        this._personInCharge = personInCharge;
    }

    /**
     * [get] SINGLE_MEMO: {varchar(255)} <br>
     * ひとことメモ
     * @return The value of the column 'SINGLE_MEMO'. (NullAllowed)
     */
    public String getSingleMemo() {
        return _singleMemo;
    }

    /**
     * [set] SINGLE_MEMO: {varchar(255)} <br>
     * ひとことメモ
     * @param singleMemo The value of the column 'SINGLE_MEMO'. (NullAllowed)
     */
    public void setSingleMemo(String singleMemo) {
        __modifiedProperties.add("singleMemo");
        this._singleMemo = singleMemo;
    }

    /**
     * [get] MAIL_INPUT: {varchar(255)} <br>
     * メール差込文(お客様へのメッセージ)
     * @return The value of the column 'MAIL_INPUT'. (NullAllowed)
     */
    public String getMailInput() {
        return _mailInput;
    }

    /**
     * [set] MAIL_INPUT: {varchar(255)} <br>
     * メール差込文(お客様へのメッセージ)
     * @param mailInput The value of the column 'MAIL_INPUT'. (NullAllowed)
     */
    public void setMailInput(String mailInput) {
        __modifiedProperties.add("mailInput");
        this._mailInput = mailInput;
    }

    /**
     * [get] FIRST_PAYMENT: {bigint(19)} <br>
     * 初期購入合計金額
     * @return The value of the column 'FIRST_PAYMENT'. (NullAllowed)
     */
    public Long getFirstPayment() {
        return _firstPayment;
    }

    /**
     * [set] FIRST_PAYMENT: {bigint(19)} <br>
     * 初期購入合計金額
     * @param firstPayment The value of the column 'FIRST_PAYMENT'. (NullAllowed)
     */
    public void setFirstPayment(Long firstPayment) {
        __modifiedProperties.add("firstPayment");
        this._firstPayment = firstPayment;
    }

    /**
     * [get] TERMINAL: {varchar(100)} <br>
     * 利用端末
     * @return The value of the column 'TERMINAL'. (NullAllowed)
     */
    public String getTerminal() {
        return _terminal;
    }

    /**
     * [set] TERMINAL: {varchar(100)} <br>
     * 利用端末
     * @param terminal The value of the column 'TERMINAL'. (NullAllowed)
     */
    public void setTerminal(String terminal) {
        __modifiedProperties.add("terminal");
        this._terminal = terminal;
    }

    /**
     * [get] MAIL_CARRIER_CD: {varchar(30)} <br>
     * メールキャリアCD
     * @return The value of the column 'MAIL_CARRIER_CD'. (NullAllowed)
     */
    public String getMailCarrierCd() {
        return _mailCarrierCd;
    }

    /**
     * [set] MAIL_CARRIER_CD: {varchar(30)} <br>
     * メールキャリアCD
     * @param mailCarrierCd The value of the column 'MAIL_CARRIER_CD'. (NullAllowed)
     */
    public void setMailCarrierCd(String mailCarrierCd) {
        __modifiedProperties.add("mailCarrierCd");
        this._mailCarrierCd = mailCarrierCd;
    }

    /**
     * [get] GIFT_FLG: {char(1)} <br>
     * ギフトチェック（0:なし/1:あり）
     * @return The value of the column 'GIFT_FLG'. (NullAllowed)
     */
    public String getGiftFlg() {
        return _giftFlg;
    }

    /**
     * [set] GIFT_FLG: {char(1)} <br>
     * ギフトチェック（0:なし/1:あり）
     * @param giftFlg The value of the column 'GIFT_FLG'. (NullAllowed)
     */
    public void setGiftFlg(String giftFlg) {
        __modifiedProperties.add("giftFlg");
        this._giftFlg = giftFlg;
    }

    /**
     * [get] RAKUTEN_ORDER_COMMENT: {varchar(255)} <br>
     * コメント
     * @return The value of the column 'RAKUTEN_ORDER_COMMENT'. (NullAllowed)
     */
    public String getRakutenOrderComment() {
        return _rakutenOrderComment;
    }

    /**
     * [set] RAKUTEN_ORDER_COMMENT: {varchar(255)} <br>
     * コメント
     * @param rakutenOrderComment The value of the column 'RAKUTEN_ORDER_COMMENT'. (NullAllowed)
     */
    public void setRakutenOrderComment(String rakutenOrderComment) {
        __modifiedProperties.add("rakutenOrderComment");
        this._rakutenOrderComment = rakutenOrderComment;
    }

    /**
     * [get] ORDER_DATETIME: {varchar(30)} <br>
     * 注文日時
     * @return The value of the column 'ORDER_DATETIME'. (NullAllowed)
     */
    public String getOrderDatetime() {
        return _orderDatetime;
    }

    /**
     * [set] ORDER_DATETIME: {varchar(30)} <br>
     * 注文日時
     * @param orderDatetime The value of the column 'ORDER_DATETIME'. (NullAllowed)
     */
    public void setOrderDatetime(String orderDatetime) {
        __modifiedProperties.add("orderDatetime");
        this._orderDatetime = orderDatetime;
    }

    /**
     * [get] MULTI_DELIV_FLG: {char(1)} <br>
     * 複数送付先フラグ
     * @return The value of the column 'MULTI_DELIV_FLG'. (NullAllowed)
     */
    public String getMultiDelivFlg() {
        return _multiDelivFlg;
    }

    /**
     * [set] MULTI_DELIV_FLG: {char(1)} <br>
     * 複数送付先フラグ
     * @param multiDelivFlg The value of the column 'MULTI_DELIV_FLG'. (NullAllowed)
     */
    public void setMultiDelivFlg(String multiDelivFlg) {
        __modifiedProperties.add("multiDelivFlg");
        this._multiDelivFlg = multiDelivFlg;
    }

    /**
     * [get] ALERT_FLG: {char(1)} <br>
     * 警告表示フラグ
     * @return The value of the column 'ALERT_FLG'. (NullAllowed)
     */
    public String getAlertFlg() {
        return _alertFlg;
    }

    /**
     * [set] ALERT_FLG: {char(1)} <br>
     * 警告表示フラグ
     * @param alertFlg The value of the column 'ALERT_FLG'. (NullAllowed)
     */
    public void setAlertFlg(String alertFlg) {
        __modifiedProperties.add("alertFlg");
        this._alertFlg = alertFlg;
    }

    /**
     * [get] MEMBER_FLG: {char(1)} <br>
     * 楽天会員フラグ
     * @return The value of the column 'MEMBER_FLG'. (NullAllowed)
     */
    public String getMemberFlg() {
        return _memberFlg;
    }

    /**
     * [set] MEMBER_FLG: {char(1)} <br>
     * 楽天会員フラグ
     * @param memberFlg The value of the column 'MEMBER_FLG'. (NullAllowed)
     */
    public void setMemberFlg(String memberFlg) {
        __modifiedProperties.add("memberFlg");
        this._memberFlg = memberFlg;
    }

    /**
     * [get] TOTAL: {bigint(19)} <br>
     * 合計
     * @return The value of the column 'TOTAL'. (NullAllowed)
     */
    public Long getTotal() {
        return _total;
    }

    /**
     * [set] TOTAL: {bigint(19)} <br>
     * 合計
     * @param total The value of the column 'TOTAL'. (NullAllowed)
     */
    public void setTotal(Long total) {
        __modifiedProperties.add("total");
        this._total = total;
    }

    /**
     * [get] TAX: {bigint(19)} <br>
     * 消費税(-99999=無効値)
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public Long getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {bigint(19)} <br>
     * 消費税(-99999=無効値)
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(Long tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] CARRIAGE: {bigint(19)} <br>
     * 送料(-99999=無効値)
     * @return The value of the column 'CARRIAGE'. (NullAllowed)
     */
    public Long getCarriage() {
        return _carriage;
    }

    /**
     * [set] CARRIAGE: {bigint(19)} <br>
     * 送料(-99999=無効値)
     * @param carriage The value of the column 'CARRIAGE'. (NullAllowed)
     */
    public void setCarriage(Long carriage) {
        __modifiedProperties.add("carriage");
        this._carriage = carriage;
    }

    /**
     * [get] COD: {bigint(19)} <br>
     * 代引料(-99999=無効値)
     * @return The value of the column 'COD'. (NullAllowed)
     */
    public Long getCod() {
        return _cod;
    }

    /**
     * [set] COD: {bigint(19)} <br>
     * 代引料(-99999=無効値)
     * @param cod The value of the column 'COD'. (NullAllowed)
     */
    public void setCod(Long cod) {
        __modifiedProperties.add("cod");
        this._cod = cod;
    }

    /**
     * [get] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額(-99999=無効値)
     * @return The value of the column 'AMOUNT_BILLED'. (NullAllowed)
     */
    public Long getAmountBilled() {
        return _amountBilled;
    }

    /**
     * [set] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額(-99999=無効値)
     * @param amountBilled The value of the column 'AMOUNT_BILLED'. (NullAllowed)
     */
    public void setAmountBilled(Long amountBilled) {
        __modifiedProperties.add("amountBilled");
        this._amountBilled = amountBilled;
    }

    /**
     * [get] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額(-99999=無効値)
     * @return The value of the column 'TOTAL_AMOUNT'. (NullAllowed)
     */
    public Long getTotalAmount() {
        return _totalAmount;
    }

    /**
     * [set] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額(-99999=無効値)
     * @param totalAmount The value of the column 'TOTAL_AMOUNT'. (NullAllowed)
     */
    public void setTotalAmount(Long totalAmount) {
        __modifiedProperties.add("totalAmount");
        this._totalAmount = totalAmount;
    }

    /**
     * [get] COMBINE_ID: {varchar(30)} <br>
     * 同梱ID
     * @return The value of the column 'COMBINE_ID'. (NullAllowed)
     */
    public String getCombineId() {
        return _combineId;
    }

    /**
     * [set] COMBINE_ID: {varchar(30)} <br>
     * 同梱ID
     * @param combineId The value of the column 'COMBINE_ID'. (NullAllowed)
     */
    public void setCombineId(String combineId) {
        __modifiedProperties.add("combineId");
        this._combineId = combineId;
    }

    /**
     * [get] COMBINE_STATUS: {varchar(30)} <br>
     * 同梱ステータス
     * @return The value of the column 'COMBINE_STATUS'. (NullAllowed)
     */
    public String getCombineStatus() {
        return _combineStatus;
    }

    /**
     * [set] COMBINE_STATUS: {varchar(30)} <br>
     * 同梱ステータス
     * @param combineStatus The value of the column 'COMBINE_STATUS'. (NullAllowed)
     */
    public void setCombineStatus(String combineStatus) {
        __modifiedProperties.add("combineStatus");
        this._combineStatus = combineStatus;
    }

    /**
     * [get] COMBINE_TOTAL: {bigint(19)} <br>
     * 同梱商品合計金額
     * @return The value of the column 'COMBINE_TOTAL'. (NullAllowed)
     */
    public Long getCombineTotal() {
        return _combineTotal;
    }

    /**
     * [set] COMBINE_TOTAL: {bigint(19)} <br>
     * 同梱商品合計金額
     * @param combineTotal The value of the column 'COMBINE_TOTAL'. (NullAllowed)
     */
    public void setCombineTotal(Long combineTotal) {
        __modifiedProperties.add("combineTotal");
        this._combineTotal = combineTotal;
    }

    /**
     * [get] COMBINE_CARRIAGE: {bigint(19)} <br>
     * 同梱送料合計
     * @return The value of the column 'COMBINE_CARRIAGE'. (NullAllowed)
     */
    public Long getCombineCarriage() {
        return _combineCarriage;
    }

    /**
     * [set] COMBINE_CARRIAGE: {bigint(19)} <br>
     * 同梱送料合計
     * @param combineCarriage The value of the column 'COMBINE_CARRIAGE'. (NullAllowed)
     */
    public void setCombineCarriage(Long combineCarriage) {
        __modifiedProperties.add("combineCarriage");
        this._combineCarriage = combineCarriage;
    }

    /**
     * [get] COMBINE_COD: {bigint(19)} <br>
     * 同梱代引料合計
     * @return The value of the column 'COMBINE_COD'. (NullAllowed)
     */
    public Long getCombineCod() {
        return _combineCod;
    }

    /**
     * [set] COMBINE_COD: {bigint(19)} <br>
     * 同梱代引料合計
     * @param combineCod The value of the column 'COMBINE_COD'. (NullAllowed)
     */
    public void setCombineCod(Long combineCod) {
        __modifiedProperties.add("combineCod");
        this._combineCod = combineCod;
    }

    /**
     * [get] COMBINE_TAX: {bigint(19)} <br>
     * 同梱消費税合計
     * @return The value of the column 'COMBINE_TAX'. (NullAllowed)
     */
    public Long getCombineTax() {
        return _combineTax;
    }

    /**
     * [set] COMBINE_TAX: {bigint(19)} <br>
     * 同梱消費税合計
     * @param combineTax The value of the column 'COMBINE_TAX'. (NullAllowed)
     */
    public void setCombineTax(Long combineTax) {
        __modifiedProperties.add("combineTax");
        this._combineTax = combineTax;
    }

    /**
     * [get] COMBINE_BILLED: {bigint(19)} <br>
     * 同梱請求金額
     * @return The value of the column 'COMBINE_BILLED'. (NullAllowed)
     */
    public Long getCombineBilled() {
        return _combineBilled;
    }

    /**
     * [set] COMBINE_BILLED: {bigint(19)} <br>
     * 同梱請求金額
     * @param combineBilled The value of the column 'COMBINE_BILLED'. (NullAllowed)
     */
    public void setCombineBilled(Long combineBilled) {
        __modifiedProperties.add("combineBilled");
        this._combineBilled = combineBilled;
    }

    /**
     * [get] COMBINE_AMOUNT: {bigint(19)} <br>
     * 同梱合計金額
     * @return The value of the column 'COMBINE_AMOUNT'. (NullAllowed)
     */
    public Long getCombineAmount() {
        return _combineAmount;
    }

    /**
     * [set] COMBINE_AMOUNT: {bigint(19)} <br>
     * 同梱合計金額
     * @param combineAmount The value of the column 'COMBINE_AMOUNT'. (NullAllowed)
     */
    public void setCombineAmount(Long combineAmount) {
        __modifiedProperties.add("combineAmount");
        this._combineAmount = combineAmount;
    }

    /**
     * [get] COMBINE_BANK_FEE: {bigint(19)} <br>
     * 同梱楽天バンク決済振替手数料
     * @return The value of the column 'COMBINE_BANK_FEE'. (NullAllowed)
     */
    public Long getCombineBankFee() {
        return _combineBankFee;
    }

    /**
     * [set] COMBINE_BANK_FEE: {bigint(19)} <br>
     * 同梱楽天バンク決済振替手数料
     * @param combineBankFee The value of the column 'COMBINE_BANK_FEE'. (NullAllowed)
     */
    public void setCombineBankFee(Long combineBankFee) {
        __modifiedProperties.add("combineBankFee");
        this._combineBankFee = combineBankFee;
    }

    /**
     * [get] COMBINE_POINT_USE: {bigint(19)} <br>
     * 同梱ポイント利用合計
     * @return The value of the column 'COMBINE_POINT_USE'. (NullAllowed)
     */
    public Long getCombinePointUse() {
        return _combinePointUse;
    }

    /**
     * [set] COMBINE_POINT_USE: {bigint(19)} <br>
     * 同梱ポイント利用合計
     * @param combinePointUse The value of the column 'COMBINE_POINT_USE'. (NullAllowed)
     */
    public void setCombinePointUse(Long combinePointUse) {
        __modifiedProperties.add("combinePointUse");
        this._combinePointUse = combinePointUse;
    }

    /**
     * [get] MAIL_FLG: {char(1)} <br>
     * メールフラグ
     * @return The value of the column 'MAIL_FLG'. (NullAllowed)
     */
    public String getMailFlg() {
        return _mailFlg;
    }

    /**
     * [set] MAIL_FLG: {char(1)} <br>
     * メールフラグ
     * @param mailFlg The value of the column 'MAIL_FLG'. (NullAllowed)
     */
    public void setMailFlg(String mailFlg) {
        __modifiedProperties.add("mailFlg");
        this._mailFlg = mailFlg;
    }

    /**
     * [get] ORDER_DT: {varchar(30)} <br>
     * 注文日
     * @return The value of the column 'ORDER_DT'. (NullAllowed)
     */
    public String getOrderDt() {
        return _orderDt;
    }

    /**
     * [set] ORDER_DT: {varchar(30)} <br>
     * 注文日
     * @param orderDt The value of the column 'ORDER_DT'. (NullAllowed)
     */
    public void setOrderDt(String orderDt) {
        __modifiedProperties.add("orderDt");
        this._orderDt = orderDt;
    }

    /**
     * [get] ORDER_TIME: {varchar(30)} <br>
     * 注文時間
     * @return The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public String getOrderTime() {
        return _orderTime;
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文時間
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public void setOrderTime(String orderTime) {
        __modifiedProperties.add("orderTime");
        this._orderTime = orderTime;
    }

    /**
     * [get] MOBILE_PAYMENT_NO: {varchar(30)} <br>
     * モバイルキャリア決済番号
     * @return The value of the column 'MOBILE_PAYMENT_NO'. (NullAllowed)
     */
    public String getMobilePaymentNo() {
        return _mobilePaymentNo;
    }

    /**
     * [set] MOBILE_PAYMENT_NO: {varchar(30)} <br>
     * モバイルキャリア決済番号
     * @param mobilePaymentNo The value of the column 'MOBILE_PAYMENT_NO'. (NullAllowed)
     */
    public void setMobilePaymentNo(String mobilePaymentNo) {
        __modifiedProperties.add("mobilePaymentNo");
        this._mobilePaymentNo = mobilePaymentNo;
    }

    /**
     * [get] HISTORY_MOD_FLG: {varchar(30)} <br>
     * 購入履歴修正可否タイプ
     * @return The value of the column 'HISTORY_MOD_FLG'. (NullAllowed)
     */
    public String getHistoryModFlg() {
        return _historyModFlg;
    }

    /**
     * [set] HISTORY_MOD_FLG: {varchar(30)} <br>
     * 購入履歴修正可否タイプ
     * @param historyModFlg The value of the column 'HISTORY_MOD_FLG'. (NullAllowed)
     */
    public void setHistoryModFlg(String historyModFlg) {
        __modifiedProperties.add("historyModFlg");
        this._historyModFlg = historyModFlg;
    }

    /**
     * [get] HISTORY_ICON_FLG: {char(1)} <br>
     * 購入履歴修正アイコンフラグ
     * @return The value of the column 'HISTORY_ICON_FLG'. (NullAllowed)
     */
    public String getHistoryIconFlg() {
        return _historyIconFlg;
    }

    /**
     * [set] HISTORY_ICON_FLG: {char(1)} <br>
     * 購入履歴修正アイコンフラグ
     * @param historyIconFlg The value of the column 'HISTORY_ICON_FLG'. (NullAllowed)
     */
    public void setHistoryIconFlg(String historyIconFlg) {
        __modifiedProperties.add("historyIconFlg");
        this._historyIconFlg = historyIconFlg;
    }

    /**
     * [get] HISTORY_MAIL_FLG: {char(1)} <br>
     * 購入履歴修正催促メールフラグ
     * @return The value of the column 'HISTORY_MAIL_FLG'. (NullAllowed)
     */
    public String getHistoryMailFlg() {
        return _historyMailFlg;
    }

    /**
     * [set] HISTORY_MAIL_FLG: {char(1)} <br>
     * 購入履歴修正催促メールフラグ
     * @param historyMailFlg The value of the column 'HISTORY_MAIL_FLG'. (NullAllowed)
     */
    public void setHistoryMailFlg(String historyMailFlg) {
        __modifiedProperties.add("historyMailFlg");
        this._historyMailFlg = historyMailFlg;
    }

    /**
     * [get] DELIV_MATCH_FLG: {char(1)} <br>
     * 送付先一致フラグ
     * @return The value of the column 'DELIV_MATCH_FLG'. (NullAllowed)
     */
    public String getDelivMatchFlg() {
        return _delivMatchFlg;
    }

    /**
     * [set] DELIV_MATCH_FLG: {char(1)} <br>
     * 送付先一致フラグ
     * @param delivMatchFlg The value of the column 'DELIV_MATCH_FLG'. (NullAllowed)
     */
    public void setDelivMatchFlg(String delivMatchFlg) {
        __modifiedProperties.add("delivMatchFlg");
        this._delivMatchFlg = delivMatchFlg;
    }

    /**
     * [get] POINT_USE_FLG: {char(1)} <br>
     * ポイント利用有無
     * @return The value of the column 'POINT_USE_FLG'. (NullAllowed)
     */
    public String getPointUseFlg() {
        return _pointUseFlg;
    }

    /**
     * [set] POINT_USE_FLG: {char(1)} <br>
     * ポイント利用有無
     * @param pointUseFlg The value of the column 'POINT_USE_FLG'. (NullAllowed)
     */
    public void setPointUseFlg(String pointUseFlg) {
        __modifiedProperties.add("pointUseFlg");
        this._pointUseFlg = pointUseFlg;
    }

    /**
     * [get] ORDER_ZIP_CD1: {varchar(30)} <br>
     * 注文者郵便番号1
     * @return The value of the column 'ORDER_ZIP_CD1'. (NullAllowed)
     */
    public String getOrderZipCd1() {
        return _orderZipCd1;
    }

    /**
     * [set] ORDER_ZIP_CD1: {varchar(30)} <br>
     * 注文者郵便番号1
     * @param orderZipCd1 The value of the column 'ORDER_ZIP_CD1'. (NullAllowed)
     */
    public void setOrderZipCd1(String orderZipCd1) {
        __modifiedProperties.add("orderZipCd1");
        this._orderZipCd1 = orderZipCd1;
    }

    /**
     * [get] ORDER_ZIP_CD2: {varchar(30)} <br>
     * 注文者郵便番号2
     * @return The value of the column 'ORDER_ZIP_CD2'. (NullAllowed)
     */
    public String getOrderZipCd2() {
        return _orderZipCd2;
    }

    /**
     * [set] ORDER_ZIP_CD2: {varchar(30)} <br>
     * 注文者郵便番号2
     * @param orderZipCd2 The value of the column 'ORDER_ZIP_CD2'. (NullAllowed)
     */
    public void setOrderZipCd2(String orderZipCd2) {
        __modifiedProperties.add("orderZipCd2");
        this._orderZipCd2 = orderZipCd2;
    }

    /**
     * [get] ORDER_ADDRESS1: {varchar(255)} <br>
     * 注文者住所：都道府県
     * @return The value of the column 'ORDER_ADDRESS1'. (NullAllowed)
     */
    public String getOrderAddress1() {
        return _orderAddress1;
    }

    /**
     * [set] ORDER_ADDRESS1: {varchar(255)} <br>
     * 注文者住所：都道府県
     * @param orderAddress1 The value of the column 'ORDER_ADDRESS1'. (NullAllowed)
     */
    public void setOrderAddress1(String orderAddress1) {
        __modifiedProperties.add("orderAddress1");
        this._orderAddress1 = orderAddress1;
    }

    /**
     * [get] ORDER_ADDRESS2: {varchar(255)} <br>
     * 注文者住所：都市区
     * @return The value of the column 'ORDER_ADDRESS2'. (NullAllowed)
     */
    public String getOrderAddress2() {
        return _orderAddress2;
    }

    /**
     * [set] ORDER_ADDRESS2: {varchar(255)} <br>
     * 注文者住所：都市区
     * @param orderAddress2 The value of the column 'ORDER_ADDRESS2'. (NullAllowed)
     */
    public void setOrderAddress2(String orderAddress2) {
        __modifiedProperties.add("orderAddress2");
        this._orderAddress2 = orderAddress2;
    }

    /**
     * [get] ORDER_ADDRESS3: {varchar(255)} <br>
     * 注文者住所：町以降
     * @return The value of the column 'ORDER_ADDRESS3'. (NullAllowed)
     */
    public String getOrderAddress3() {
        return _orderAddress3;
    }

    /**
     * [set] ORDER_ADDRESS3: {varchar(255)} <br>
     * 注文者住所：町以降
     * @param orderAddress3 The value of the column 'ORDER_ADDRESS3'. (NullAllowed)
     */
    public void setOrderAddress3(String orderAddress3) {
        __modifiedProperties.add("orderAddress3");
        this._orderAddress3 = orderAddress3;
    }

    /**
     * [get] ORDER_CUSTOMER_NM1: {varchar(255)} <br>
     * 注文者名字
     * @return The value of the column 'ORDER_CUSTOMER_NM1'. (NullAllowed)
     */
    public String getOrderCustomerNm1() {
        return _orderCustomerNm1;
    }

    /**
     * [set] ORDER_CUSTOMER_NM1: {varchar(255)} <br>
     * 注文者名字
     * @param orderCustomerNm1 The value of the column 'ORDER_CUSTOMER_NM1'. (NullAllowed)
     */
    public void setOrderCustomerNm1(String orderCustomerNm1) {
        __modifiedProperties.add("orderCustomerNm1");
        this._orderCustomerNm1 = orderCustomerNm1;
    }

    /**
     * [get] ORDER_CUSTOMER_NM2: {varchar(255)} <br>
     * 注文者名前
     * @return The value of the column 'ORDER_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getOrderCustomerNm2() {
        return _orderCustomerNm2;
    }

    /**
     * [set] ORDER_CUSTOMER_NM2: {varchar(255)} <br>
     * 注文者名前
     * @param orderCustomerNm2 The value of the column 'ORDER_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setOrderCustomerNm2(String orderCustomerNm2) {
        __modifiedProperties.add("orderCustomerNm2");
        this._orderCustomerNm2 = orderCustomerNm2;
    }

    /**
     * [get] ORDER_CUSTOMER_KN1: {varchar(255)} <br>
     * 注文者名字フリガナ
     * @return The value of the column 'ORDER_CUSTOMER_KN1'. (NullAllowed)
     */
    public String getOrderCustomerKn1() {
        return _orderCustomerKn1;
    }

    /**
     * [set] ORDER_CUSTOMER_KN1: {varchar(255)} <br>
     * 注文者名字フリガナ
     * @param orderCustomerKn1 The value of the column 'ORDER_CUSTOMER_KN1'. (NullAllowed)
     */
    public void setOrderCustomerKn1(String orderCustomerKn1) {
        __modifiedProperties.add("orderCustomerKn1");
        this._orderCustomerKn1 = orderCustomerKn1;
    }

    /**
     * [get] ORDER_CUSTOMER_KN2: {varchar(255)} <br>
     * 注文者名前フリガナ
     * @return The value of the column 'ORDER_CUSTOMER_KN2'. (NullAllowed)
     */
    public String getOrderCustomerKn2() {
        return _orderCustomerKn2;
    }

    /**
     * [set] ORDER_CUSTOMER_KN2: {varchar(255)} <br>
     * 注文者名前フリガナ
     * @param orderCustomerKn2 The value of the column 'ORDER_CUSTOMER_KN2'. (NullAllowed)
     */
    public void setOrderCustomerKn2(String orderCustomerKn2) {
        __modifiedProperties.add("orderCustomerKn2");
        this._orderCustomerKn2 = orderCustomerKn2;
    }

    /**
     * [get] ORDER_TEL_NO1: {varchar(255)} <br>
     * 注文者電話番号1
     * @return The value of the column 'ORDER_TEL_NO1'. (NullAllowed)
     */
    public String getOrderTelNo1() {
        return _orderTelNo1;
    }

    /**
     * [set] ORDER_TEL_NO1: {varchar(255)} <br>
     * 注文者電話番号1
     * @param orderTelNo1 The value of the column 'ORDER_TEL_NO1'. (NullAllowed)
     */
    public void setOrderTelNo1(String orderTelNo1) {
        __modifiedProperties.add("orderTelNo1");
        this._orderTelNo1 = orderTelNo1;
    }

    /**
     * [get] ORDER_TEL_NO2: {varchar(255)} <br>
     * 注文者電話番号2
     * @return The value of the column 'ORDER_TEL_NO2'. (NullAllowed)
     */
    public String getOrderTelNo2() {
        return _orderTelNo2;
    }

    /**
     * [set] ORDER_TEL_NO2: {varchar(255)} <br>
     * 注文者電話番号2
     * @param orderTelNo2 The value of the column 'ORDER_TEL_NO2'. (NullAllowed)
     */
    public void setOrderTelNo2(String orderTelNo2) {
        __modifiedProperties.add("orderTelNo2");
        this._orderTelNo2 = orderTelNo2;
    }

    /**
     * [get] ORDER_TEL_NO3: {varchar(255)} <br>
     * 注文者電話番号3
     * @return The value of the column 'ORDER_TEL_NO3'. (NullAllowed)
     */
    public String getOrderTelNo3() {
        return _orderTelNo3;
    }

    /**
     * [set] ORDER_TEL_NO3: {varchar(255)} <br>
     * 注文者電話番号3
     * @param orderTelNo3 The value of the column 'ORDER_TEL_NO3'. (NullAllowed)
     */
    public void setOrderTelNo3(String orderTelNo3) {
        __modifiedProperties.add("orderTelNo3");
        this._orderTelNo3 = orderTelNo3;
    }

    /**
     * [get] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed)
     */
    public String getMailAddress() {
        return _mailAddress;
    }

    /**
     * [set] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed)
     */
    public void setMailAddress(String mailAddress) {
        __modifiedProperties.add("mailAddress");
        this._mailAddress = mailAddress;
    }

    /**
     * [get] ORDER_SEX: {varchar(30)} <br>
     * 注文者性別
     * @return The value of the column 'ORDER_SEX'. (NullAllowed)
     */
    public String getOrderSex() {
        return _orderSex;
    }

    /**
     * [set] ORDER_SEX: {varchar(30)} <br>
     * 注文者性別
     * @param orderSex The value of the column 'ORDER_SEX'. (NullAllowed)
     */
    public void setOrderSex(String orderSex) {
        __modifiedProperties.add("orderSex");
        this._orderSex = orderSex;
    }

    /**
     * [get] ORDER_BIRTHDAY: {varchar(30)} <br>
     * 注文者誕生日
     * @return The value of the column 'ORDER_BIRTHDAY'. (NullAllowed)
     */
    public String getOrderBirthday() {
        return _orderBirthday;
    }

    /**
     * [set] ORDER_BIRTHDAY: {varchar(30)} <br>
     * 注文者誕生日
     * @param orderBirthday The value of the column 'ORDER_BIRTHDAY'. (NullAllowed)
     */
    public void setOrderBirthday(String orderBirthday) {
        __modifiedProperties.add("orderBirthday");
        this._orderBirthday = orderBirthday;
    }

    /**
     * [get] PAYMENT_METHOD: {varchar(255)} <br>
     * 決済方法
     * @return The value of the column 'PAYMENT_METHOD'. (NullAllowed)
     */
    public String getPaymentMethod() {
        return _paymentMethod;
    }

    /**
     * [set] PAYMENT_METHOD: {varchar(255)} <br>
     * 決済方法
     * @param paymentMethod The value of the column 'PAYMENT_METHOD'. (NullAllowed)
     */
    public void setPaymentMethod(String paymentMethod) {
        __modifiedProperties.add("paymentMethod");
        this._paymentMethod = paymentMethod;
    }

    /**
     * [get] CARD_TYPE: {varchar(100)} <br>
     * クレジットカード種類
     * @return The value of the column 'CARD_TYPE'. (NullAllowed)
     */
    public String getCardType() {
        return _cardType;
    }

    /**
     * [set] CARD_TYPE: {varchar(100)} <br>
     * クレジットカード種類
     * @param cardType The value of the column 'CARD_TYPE'. (NullAllowed)
     */
    public void setCardType(String cardType) {
        __modifiedProperties.add("cardType");
        this._cardType = cardType;
    }

    /**
     * [get] CARD_NO: {varchar(255)} <br>
     * クレジットカード番号
     * @return The value of the column 'CARD_NO'. (NullAllowed)
     */
    public String getCardNo() {
        return _cardNo;
    }

    /**
     * [set] CARD_NO: {varchar(255)} <br>
     * クレジットカード番号
     * @param cardNo The value of the column 'CARD_NO'. (NullAllowed)
     */
    public void setCardNo(String cardNo) {
        __modifiedProperties.add("cardNo");
        this._cardNo = cardNo;
    }

    /**
     * [get] CARD_NM: {varchar(255)} <br>
     * クレジットカード名義人
     * @return The value of the column 'CARD_NM'. (NullAllowed)
     */
    public String getCardNm() {
        return _cardNm;
    }

    /**
     * [set] CARD_NM: {varchar(255)} <br>
     * クレジットカード名義人
     * @param cardNm The value of the column 'CARD_NM'. (NullAllowed)
     */
    public void setCardNm(String cardNm) {
        __modifiedProperties.add("cardNm");
        this._cardNm = cardNm;
    }

    /**
     * [get] CARD_AVAILABLE: {varchar(255)} <br>
     * クレジットカード有効期限
     * @return The value of the column 'CARD_AVAILABLE'. (NullAllowed)
     */
    public String getCardAvailable() {
        return _cardAvailable;
    }

    /**
     * [set] CARD_AVAILABLE: {varchar(255)} <br>
     * クレジットカード有効期限
     * @param cardAvailable The value of the column 'CARD_AVAILABLE'. (NullAllowed)
     */
    public void setCardAvailable(String cardAvailable) {
        __modifiedProperties.add("cardAvailable");
        this._cardAvailable = cardAvailable;
    }

    /**
     * [get] CARD_INST: {varchar(30)} <br>
     * クレジットカード分割選択
     * @return The value of the column 'CARD_INST'. (NullAllowed)
     */
    public String getCardInst() {
        return _cardInst;
    }

    /**
     * [set] CARD_INST: {varchar(30)} <br>
     * クレジットカード分割選択
     * @param cardInst The value of the column 'CARD_INST'. (NullAllowed)
     */
    public void setCardInst(String cardInst) {
        __modifiedProperties.add("cardInst");
        this._cardInst = cardInst;
    }

    /**
     * [get] CARD_INST_COMMENT: {varchar(255)} <br>
     * クレジットカード分割備考
     * @return The value of the column 'CARD_INST_COMMENT'. (NullAllowed)
     */
    public String getCardInstComment() {
        return _cardInstComment;
    }

    /**
     * [set] CARD_INST_COMMENT: {varchar(255)} <br>
     * クレジットカード分割備考
     * @param cardInstComment The value of the column 'CARD_INST_COMMENT'. (NullAllowed)
     */
    public void setCardInstComment(String cardInstComment) {
        __modifiedProperties.add("cardInstComment");
        this._cardInstComment = cardInstComment;
    }

    /**
     * [get] DELIV_METHOD: {varchar(255)} <br>
     * 配送方法
     * @return The value of the column 'DELIV_METHOD'. (NullAllowed)
     */
    public String getDelivMethod() {
        return _delivMethod;
    }

    /**
     * [set] DELIV_METHOD: {varchar(255)} <br>
     * 配送方法
     * @param delivMethod The value of the column 'DELIV_METHOD'. (NullAllowed)
     */
    public void setDelivMethod(String delivMethod) {
        __modifiedProperties.add("delivMethod");
        this._delivMethod = delivMethod;
    }

    /**
     * [get] DELIV_TYPE: {varchar(255)} <br>
     * 配送区分
     * @return The value of the column 'DELIV_TYPE'. (NullAllowed)
     */
    public String getDelivType() {
        return _delivType;
    }

    /**
     * [set] DELIV_TYPE: {varchar(255)} <br>
     * 配送区分
     * @param delivType The value of the column 'DELIV_TYPE'. (NullAllowed)
     */
    public void setDelivType(String delivType) {
        __modifiedProperties.add("delivType");
        this._delivType = delivType;
    }

    /**
     * [get] POINT_USE: {bigint(19)} <br>
     * ポイント利用額
     * @return The value of the column 'POINT_USE'. (NullAllowed)
     */
    public Long getPointUse() {
        return _pointUse;
    }

    /**
     * [set] POINT_USE: {bigint(19)} <br>
     * ポイント利用額
     * @param pointUse The value of the column 'POINT_USE'. (NullAllowed)
     */
    public void setPointUse(Long pointUse) {
        __modifiedProperties.add("pointUse");
        this._pointUse = pointUse;
    }

    /**
     * [get] POINT_CONDITION: {varchar(30)} <br>
     * ポイント利用条件
     * @return The value of the column 'POINT_CONDITION'. (NullAllowed)
     */
    public String getPointCondition() {
        return _pointCondition;
    }

    /**
     * [set] POINT_CONDITION: {varchar(30)} <br>
     * ポイント利用条件
     * @param pointCondition The value of the column 'POINT_CONDITION'. (NullAllowed)
     */
    public void setPointCondition(String pointCondition) {
        __modifiedProperties.add("pointCondition");
        this._pointCondition = pointCondition;
    }

    /**
     * [get] POINT_STATUS: {varchar(30)} <br>
     * ポイントステータス
     * @return The value of the column 'POINT_STATUS'. (NullAllowed)
     */
    public String getPointStatus() {
        return _pointStatus;
    }

    /**
     * [set] POINT_STATUS: {varchar(30)} <br>
     * ポイントステータス
     * @param pointStatus The value of the column 'POINT_STATUS'. (NullAllowed)
     */
    public void setPointStatus(String pointStatus) {
        __modifiedProperties.add("pointStatus");
        this._pointStatus = pointStatus;
    }

    /**
     * [get] BANK_STATUS: {varchar(30)} <br>
     * 楽天バンク決済ステータス
     * @return The value of the column 'BANK_STATUS'. (NullAllowed)
     */
    public String getBankStatus() {
        return _bankStatus;
    }

    /**
     * [set] BANK_STATUS: {varchar(30)} <br>
     * 楽天バンク決済ステータス
     * @param bankStatus The value of the column 'BANK_STATUS'. (NullAllowed)
     */
    public void setBankStatus(String bankStatus) {
        __modifiedProperties.add("bankStatus");
        this._bankStatus = bankStatus;
    }

    /**
     * [get] BANK_FEE_FLG: {char(1)} <br>
     * 楽天バンク振替手数料負担区分
     * @return The value of the column 'BANK_FEE_FLG'. (NullAllowed)
     */
    public String getBankFeeFlg() {
        return _bankFeeFlg;
    }

    /**
     * [set] BANK_FEE_FLG: {char(1)} <br>
     * 楽天バンク振替手数料負担区分
     * @param bankFeeFlg The value of the column 'BANK_FEE_FLG'. (NullAllowed)
     */
    public void setBankFeeFlg(String bankFeeFlg) {
        __modifiedProperties.add("bankFeeFlg");
        this._bankFeeFlg = bankFeeFlg;
    }

    /**
     * [get] BANK_FEE: {bigint(19)} <br>
     * 楽天バンク決済手数料
     * @return The value of the column 'BANK_FEE'. (NullAllowed)
     */
    public Long getBankFee() {
        return _bankFee;
    }

    /**
     * [set] BANK_FEE: {bigint(19)} <br>
     * 楽天バンク決済手数料
     * @param bankFee The value of the column 'BANK_FEE'. (NullAllowed)
     */
    public void setBankFee(Long bankFee) {
        __modifiedProperties.add("bankFee");
        this._bankFee = bankFee;
    }

    /**
     * [get] WRAPPING_TITLE_P: {varchar(255)} <br>
     * ラッピングタイトル(包装紙)
     * @return The value of the column 'WRAPPING_TITLE_P'. (NullAllowed)
     */
    public String getWrappingTitleP() {
        return _wrappingTitleP;
    }

    /**
     * [set] WRAPPING_TITLE_P: {varchar(255)} <br>
     * ラッピングタイトル(包装紙)
     * @param wrappingTitleP The value of the column 'WRAPPING_TITLE_P'. (NullAllowed)
     */
    public void setWrappingTitleP(String wrappingTitleP) {
        __modifiedProperties.add("wrappingTitleP");
        this._wrappingTitleP = wrappingTitleP;
    }

    /**
     * [get] WRAPPING_NM_P: {varchar(255)} <br>
     * ラッピング名(包装紙)
     * @return The value of the column 'WRAPPING_NM_P'. (NullAllowed)
     */
    public String getWrappingNmP() {
        return _wrappingNmP;
    }

    /**
     * [set] WRAPPING_NM_P: {varchar(255)} <br>
     * ラッピング名(包装紙)
     * @param wrappingNmP The value of the column 'WRAPPING_NM_P'. (NullAllowed)
     */
    public void setWrappingNmP(String wrappingNmP) {
        __modifiedProperties.add("wrappingNmP");
        this._wrappingNmP = wrappingNmP;
    }

    /**
     * [get] WRAPPING_FEE_P: {bigint(19)} <br>
     * ラッピング料金(包装紙)
     * @return The value of the column 'WRAPPING_FEE_P'. (NullAllowed)
     */
    public Long getWrappingFeeP() {
        return _wrappingFeeP;
    }

    /**
     * [set] WRAPPING_FEE_P: {bigint(19)} <br>
     * ラッピング料金(包装紙)
     * @param wrappingFeeP The value of the column 'WRAPPING_FEE_P'. (NullAllowed)
     */
    public void setWrappingFeeP(Long wrappingFeeP) {
        __modifiedProperties.add("wrappingFeeP");
        this._wrappingFeeP = wrappingFeeP;
    }

    /**
     * [get] WRAPPING_TAX_P: {bigint(19)} <br>
     * 税込別(包装紙)
     * @return The value of the column 'WRAPPING_TAX_P'. (NullAllowed)
     */
    public Long getWrappingTaxP() {
        return _wrappingTaxP;
    }

    /**
     * [set] WRAPPING_TAX_P: {bigint(19)} <br>
     * 税込別(包装紙)
     * @param wrappingTaxP The value of the column 'WRAPPING_TAX_P'. (NullAllowed)
     */
    public void setWrappingTaxP(Long wrappingTaxP) {
        __modifiedProperties.add("wrappingTaxP");
        this._wrappingTaxP = wrappingTaxP;
    }

    /**
     * [get] WRAPPING_TITLE_R: {varchar(255)} <br>
     * ラッピングタイトル(リボン)
     * @return The value of the column 'WRAPPING_TITLE_R'. (NullAllowed)
     */
    public String getWrappingTitleR() {
        return _wrappingTitleR;
    }

    /**
     * [set] WRAPPING_TITLE_R: {varchar(255)} <br>
     * ラッピングタイトル(リボン)
     * @param wrappingTitleR The value of the column 'WRAPPING_TITLE_R'. (NullAllowed)
     */
    public void setWrappingTitleR(String wrappingTitleR) {
        __modifiedProperties.add("wrappingTitleR");
        this._wrappingTitleR = wrappingTitleR;
    }

    /**
     * [get] WRAPPING_NM_R: {varchar(255)} <br>
     * ラッピング名(リボン)
     * @return The value of the column 'WRAPPING_NM_R'. (NullAllowed)
     */
    public String getWrappingNmR() {
        return _wrappingNmR;
    }

    /**
     * [set] WRAPPING_NM_R: {varchar(255)} <br>
     * ラッピング名(リボン)
     * @param wrappingNmR The value of the column 'WRAPPING_NM_R'. (NullAllowed)
     */
    public void setWrappingNmR(String wrappingNmR) {
        __modifiedProperties.add("wrappingNmR");
        this._wrappingNmR = wrappingNmR;
    }

    /**
     * [get] WRAPPING_FEE_R: {bigint(19)} <br>
     * ラッピング料金(リボン)
     * @return The value of the column 'WRAPPING_FEE_R'. (NullAllowed)
     */
    public Long getWrappingFeeR() {
        return _wrappingFeeR;
    }

    /**
     * [set] WRAPPING_FEE_R: {bigint(19)} <br>
     * ラッピング料金(リボン)
     * @param wrappingFeeR The value of the column 'WRAPPING_FEE_R'. (NullAllowed)
     */
    public void setWrappingFeeR(Long wrappingFeeR) {
        __modifiedProperties.add("wrappingFeeR");
        this._wrappingFeeR = wrappingFeeR;
    }

    /**
     * [get] WRAPPING_TAX_R: {bigint(19)} <br>
     * 税込別(リボン)
     * @return The value of the column 'WRAPPING_TAX_R'. (NullAllowed)
     */
    public Long getWrappingTaxR() {
        return _wrappingTaxR;
    }

    /**
     * [set] WRAPPING_TAX_R: {bigint(19)} <br>
     * 税込別(リボン)
     * @param wrappingTaxR The value of the column 'WRAPPING_TAX_R'. (NullAllowed)
     */
    public void setWrappingTaxR(Long wrappingTaxR) {
        __modifiedProperties.add("wrappingTaxR");
        this._wrappingTaxR = wrappingTaxR;
    }

    /**
     * [get] DELIV_CARRIAGE: {bigint(19)} <br>
     * 送付先送料
     * @return The value of the column 'DELIV_CARRIAGE'. (NullAllowed)
     */
    public Long getDelivCarriage() {
        return _delivCarriage;
    }

    /**
     * [set] DELIV_CARRIAGE: {bigint(19)} <br>
     * 送付先送料
     * @param delivCarriage The value of the column 'DELIV_CARRIAGE'. (NullAllowed)
     */
    public void setDelivCarriage(Long delivCarriage) {
        __modifiedProperties.add("delivCarriage");
        this._delivCarriage = delivCarriage;
    }

    /**
     * [get] DELIV_COD: {bigint(19)} <br>
     * 送付先代引料
     * @return The value of the column 'DELIV_COD'. (NullAllowed)
     */
    public Long getDelivCod() {
        return _delivCod;
    }

    /**
     * [set] DELIV_COD: {bigint(19)} <br>
     * 送付先代引料
     * @param delivCod The value of the column 'DELIV_COD'. (NullAllowed)
     */
    public void setDelivCod(Long delivCod) {
        __modifiedProperties.add("delivCod");
        this._delivCod = delivCod;
    }

    /**
     * [get] DELIV_TAX: {bigint(19)} <br>
     * 送付先消費税
     * @return The value of the column 'DELIV_TAX'. (NullAllowed)
     */
    public Long getDelivTax() {
        return _delivTax;
    }

    /**
     * [set] DELIV_TAX: {bigint(19)} <br>
     * 送付先消費税
     * @param delivTax The value of the column 'DELIV_TAX'. (NullAllowed)
     */
    public void setDelivTax(Long delivTax) {
        __modifiedProperties.add("delivTax");
        this._delivTax = delivTax;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * お荷物伝票番号
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * お荷物伝票番号
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] DELIV_TOTAL: {bigint(19)} <br>
     * 送付先商品合計金額
     * @return The value of the column 'DELIV_TOTAL'. (NullAllowed)
     */
    public Long getDelivTotal() {
        return _delivTotal;
    }

    /**
     * [set] DELIV_TOTAL: {bigint(19)} <br>
     * 送付先商品合計金額
     * @param delivTotal The value of the column 'DELIV_TOTAL'. (NullAllowed)
     */
    public void setDelivTotal(Long delivTotal) {
        __modifiedProperties.add("delivTotal");
        this._delivTotal = delivTotal;
    }

    /**
     * [get] NOSHI: {varchar(255)} <br>
     * のし
     * @return The value of the column 'NOSHI'. (NullAllowed)
     */
    public String getNoshi() {
        return _noshi;
    }

    /**
     * [set] NOSHI: {varchar(255)} <br>
     * のし
     * @param noshi The value of the column 'NOSHI'. (NullAllowed)
     */
    public void setNoshi(String noshi) {
        __modifiedProperties.add("noshi");
        this._noshi = noshi;
    }

    /**
     * [get] DELIV_ZIP_CD1: {varchar(30)} <br>
     * 送付先郵便番号1
     * @return The value of the column 'DELIV_ZIP_CD1'. (NullAllowed)
     */
    public String getDelivZipCd1() {
        return _delivZipCd1;
    }

    /**
     * [set] DELIV_ZIP_CD1: {varchar(30)} <br>
     * 送付先郵便番号1
     * @param delivZipCd1 The value of the column 'DELIV_ZIP_CD1'. (NullAllowed)
     */
    public void setDelivZipCd1(String delivZipCd1) {
        __modifiedProperties.add("delivZipCd1");
        this._delivZipCd1 = delivZipCd1;
    }

    /**
     * [get] DELIV_ZIP_CD2: {varchar(30)} <br>
     * 送付先郵便番号2
     * @return The value of the column 'DELIV_ZIP_CD2'. (NullAllowed)
     */
    public String getDelivZipCd2() {
        return _delivZipCd2;
    }

    /**
     * [set] DELIV_ZIP_CD2: {varchar(30)} <br>
     * 送付先郵便番号2
     * @param delivZipCd2 The value of the column 'DELIV_ZIP_CD2'. (NullAllowed)
     */
    public void setDelivZipCd2(String delivZipCd2) {
        __modifiedProperties.add("delivZipCd2");
        this._delivZipCd2 = delivZipCd2;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * 送付先住所：都道府県
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * 送付先住所：都道府県
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * 送付先住所：都市区
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * 送付先住所：都市区
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * 送付先住所：町以降
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * 送付先住所：町以降
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {varchar(255)} <br>
     * 送付先名字
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public String getDelivCustomerNm1() {
        return _delivCustomerNm1;
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {varchar(255)} <br>
     * 送付先名字
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        __modifiedProperties.add("delivCustomerNm1");
        this._delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {varchar(255)} <br>
     * 送付先名前
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getDelivCustomerNm2() {
        return _delivCustomerNm2;
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {varchar(255)} <br>
     * 送付先名前
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        __modifiedProperties.add("delivCustomerNm2");
        this._delivCustomerNm2 = delivCustomerNm2;
    }

    /**
     * [get] DELIV_CUSTOMER_KN1: {varchar(255)} <br>
     * 送付先名字フリガナ
     * @return The value of the column 'DELIV_CUSTOMER_KN1'. (NullAllowed)
     */
    public String getDelivCustomerKn1() {
        return _delivCustomerKn1;
    }

    /**
     * [set] DELIV_CUSTOMER_KN1: {varchar(255)} <br>
     * 送付先名字フリガナ
     * @param delivCustomerKn1 The value of the column 'DELIV_CUSTOMER_KN1'. (NullAllowed)
     */
    public void setDelivCustomerKn1(String delivCustomerKn1) {
        __modifiedProperties.add("delivCustomerKn1");
        this._delivCustomerKn1 = delivCustomerKn1;
    }

    /**
     * [get] DELIV_CUSTOMER_KN2: {varchar(255)} <br>
     * 送付先名前フリガナ
     * @return The value of the column 'DELIV_CUSTOMER_KN2'. (NullAllowed)
     */
    public String getDelivCustomerKn2() {
        return _delivCustomerKn2;
    }

    /**
     * [set] DELIV_CUSTOMER_KN2: {varchar(255)} <br>
     * 送付先名前フリガナ
     * @param delivCustomerKn2 The value of the column 'DELIV_CUSTOMER_KN2'. (NullAllowed)
     */
    public void setDelivCustomerKn2(String delivCustomerKn2) {
        __modifiedProperties.add("delivCustomerKn2");
        this._delivCustomerKn2 = delivCustomerKn2;
    }

    /**
     * [get] DELIV_TEL_NO1: {varchar(255)} <br>
     * 送付先電話番号1
     * @return The value of the column 'DELIV_TEL_NO1'. (NullAllowed)
     */
    public String getDelivTelNo1() {
        return _delivTelNo1;
    }

    /**
     * [set] DELIV_TEL_NO1: {varchar(255)} <br>
     * 送付先電話番号1
     * @param delivTelNo1 The value of the column 'DELIV_TEL_NO1'. (NullAllowed)
     */
    public void setDelivTelNo1(String delivTelNo1) {
        __modifiedProperties.add("delivTelNo1");
        this._delivTelNo1 = delivTelNo1;
    }

    /**
     * [get] DELIV_TEL_NO2: {varchar(255)} <br>
     * 送付先電話番号2
     * @return The value of the column 'DELIV_TEL_NO2'. (NullAllowed)
     */
    public String getDelivTelNo2() {
        return _delivTelNo2;
    }

    /**
     * [set] DELIV_TEL_NO2: {varchar(255)} <br>
     * 送付先電話番号2
     * @param delivTelNo2 The value of the column 'DELIV_TEL_NO2'. (NullAllowed)
     */
    public void setDelivTelNo2(String delivTelNo2) {
        __modifiedProperties.add("delivTelNo2");
        this._delivTelNo2 = delivTelNo2;
    }

    /**
     * [get] DELIV_TEL_NO3: {varchar(255)} <br>
     * 送付先電話番号3
     * @return The value of the column 'DELIV_TEL_NO3'. (NullAllowed)
     */
    public String getDelivTelNo3() {
        return _delivTelNo3;
    }

    /**
     * [set] DELIV_TEL_NO3: {varchar(255)} <br>
     * 送付先電話番号3
     * @param delivTelNo3 The value of the column 'DELIV_TEL_NO3'. (NullAllowed)
     */
    public void setDelivTelNo3(String delivTelNo3) {
        __modifiedProperties.add("delivTelNo3");
        this._delivTelNo3 = delivTelNo3;
    }

    /**
     * [get] PRODUCT_ID: {varchar(30)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public String getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {varchar(30)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(String productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_NO: {varchar(100)} <br>
     * 商品番号
     * @return The value of the column 'PRODUCT_NO'. (NullAllowed)
     */
    public String getProductNo() {
        return _productNo;
    }

    /**
     * [set] PRODUCT_NO: {varchar(100)} <br>
     * 商品番号
     * @param productNo The value of the column 'PRODUCT_NO'. (NullAllowed)
     */
    public void setProductNo(String productNo) {
        __modifiedProperties.add("productNo");
        this._productNo = productNo;
    }

    /**
     * [get] PRODUCT_URL: {varchar(100)} <br>
     * 商品URL
     * @return The value of the column 'PRODUCT_URL'. (NullAllowed)
     */
    public String getProductUrl() {
        return _productUrl;
    }

    /**
     * [set] PRODUCT_URL: {varchar(100)} <br>
     * 商品URL
     * @param productUrl The value of the column 'PRODUCT_URL'. (NullAllowed)
     */
    public void setProductUrl(String productUrl) {
        __modifiedProperties.add("productUrl");
        this._productUrl = productUrl;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public Long getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(Long unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'ORDER_NUM'. (NullAllowed)
     */
    public Long getOrderNum() {
        return _orderNum;
    }

    /**
     * [set] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @param orderNum The value of the column 'ORDER_NUM'. (NullAllowed)
     */
    public void setOrderNum(Long orderNum) {
        __modifiedProperties.add("orderNum");
        this._orderNum = orderNum;
    }

    /**
     * [get] PRODUCT_CARRIAGE: {bigint(19)} <br>
     * 送料込別
     * @return The value of the column 'PRODUCT_CARRIAGE'. (NullAllowed)
     */
    public Long getProductCarriage() {
        return _productCarriage;
    }

    /**
     * [set] PRODUCT_CARRIAGE: {bigint(19)} <br>
     * 送料込別
     * @param productCarriage The value of the column 'PRODUCT_CARRIAGE'. (NullAllowed)
     */
    public void setProductCarriage(Long productCarriage) {
        __modifiedProperties.add("productCarriage");
        this._productCarriage = productCarriage;
    }

    /**
     * [get] PRODUCT_TAX: {bigint(19)} <br>
     * 税込別
     * @return The value of the column 'PRODUCT_TAX'. (NullAllowed)
     */
    public Long getProductTax() {
        return _productTax;
    }

    /**
     * [set] PRODUCT_TAX: {bigint(19)} <br>
     * 税込別
     * @param productTax The value of the column 'PRODUCT_TAX'. (NullAllowed)
     */
    public void setProductTax(Long productTax) {
        __modifiedProperties.add("productTax");
        this._productTax = productTax;
    }

    /**
     * [get] PRODUCT_COD: {bigint(19)} <br>
     * 代引手数料込別
     * @return The value of the column 'PRODUCT_COD'. (NullAllowed)
     */
    public Long getProductCod() {
        return _productCod;
    }

    /**
     * [set] PRODUCT_COD: {bigint(19)} <br>
     * 代引手数料込別
     * @param productCod The value of the column 'PRODUCT_COD'. (NullAllowed)
     */
    public void setProductCod(Long productCod) {
        __modifiedProperties.add("productCod");
        this._productCod = productCod;
    }

    /**
     * [get] ITEM_CHOICE: {varchar(255)} <br>
     * 項目・選択肢
     * @return The value of the column 'ITEM_CHOICE'. (NullAllowed)
     */
    public String getItemChoice() {
        return _itemChoice;
    }

    /**
     * [set] ITEM_CHOICE: {varchar(255)} <br>
     * 項目・選択肢
     * @param itemChoice The value of the column 'ITEM_CHOICE'. (NullAllowed)
     */
    public void setItemChoice(String itemChoice) {
        __modifiedProperties.add("itemChoice");
        this._itemChoice = itemChoice;
    }

    /**
     * [get] POINT_SCALE: {decimal(16, 6)} <br>
     * ポイント倍率
     * @return The value of the column 'POINT_SCALE'. (NullAllowed)
     */
    public java.math.BigDecimal getPointScale() {
        return _pointScale;
    }

    /**
     * [set] POINT_SCALE: {decimal(16, 6)} <br>
     * ポイント倍率
     * @param pointScale The value of the column 'POINT_SCALE'. (NullAllowed)
     */
    public void setPointScale(java.math.BigDecimal pointScale) {
        __modifiedProperties.add("pointScale");
        this._pointScale = pointScale;
    }

    /**
     * [get] POINT_TYPE: {varchar(100)} <br>
     * ポイントタイプ
     * @return The value of the column 'POINT_TYPE'. (NullAllowed)
     */
    public String getPointType() {
        return _pointType;
    }

    /**
     * [set] POINT_TYPE: {varchar(100)} <br>
     * ポイントタイプ
     * @param pointType The value of the column 'POINT_TYPE'. (NullAllowed)
     */
    public void setPointType(String pointType) {
        __modifiedProperties.add("pointType");
        this._pointType = pointType;
    }

    /**
     * [get] RECORD_NUMBER: {bigint(19)} <br>
     * レコードナンバー
     * @return The value of the column 'RECORD_NUMBER'. (NullAllowed)
     */
    public Long getRecordNumber() {
        return _recordNumber;
    }

    /**
     * [set] RECORD_NUMBER: {bigint(19)} <br>
     * レコードナンバー
     * @param recordNumber The value of the column 'RECORD_NUMBER'. (NullAllowed)
     */
    public void setRecordNumber(Long recordNumber) {
        __modifiedProperties.add("recordNumber");
        this._recordNumber = recordNumber;
    }

    /**
     * [get] DELIVERY_INFO: {varchar(100)} <br>
     * 納期情報
     * @return The value of the column 'DELIVERY_INFO'. (NullAllowed)
     */
    public String getDeliveryInfo() {
        return _deliveryInfo;
    }

    /**
     * [set] DELIVERY_INFO: {varchar(100)} <br>
     * 納期情報
     * @param deliveryInfo The value of the column 'DELIVERY_INFO'. (NullAllowed)
     */
    public void setDeliveryInfo(String deliveryInfo) {
        __modifiedProperties.add("deliveryInfo");
        this._deliveryInfo = deliveryInfo;
    }

    /**
     * [get] STOCK_TYPE: {varchar(100)} <br>
     * 在庫タイプ
     * @return The value of the column 'STOCK_TYPE'. (NullAllowed)
     */
    public String getStockType() {
        return _stockType;
    }

    /**
     * [set] STOCK_TYPE: {varchar(100)} <br>
     * 在庫タイプ
     * @param stockType The value of the column 'STOCK_TYPE'. (NullAllowed)
     */
    public void setStockType(String stockType) {
        __modifiedProperties.add("stockType");
        this._stockType = stockType;
    }

    /**
     * [get] WRAPPING_TYPE_P: {varchar(255)} <br>
     * ラッピング種類(包装紙)
     * @return The value of the column 'WRAPPING_TYPE_P'. (NullAllowed)
     */
    public String getWrappingTypeP() {
        return _wrappingTypeP;
    }

    /**
     * [set] WRAPPING_TYPE_P: {varchar(255)} <br>
     * ラッピング種類(包装紙)
     * @param wrappingTypeP The value of the column 'WRAPPING_TYPE_P'. (NullAllowed)
     */
    public void setWrappingTypeP(String wrappingTypeP) {
        __modifiedProperties.add("wrappingTypeP");
        this._wrappingTypeP = wrappingTypeP;
    }

    /**
     * [get] WRAPPING_TYPE_R: {varchar(255)} <br>
     * ラッピング種類(リボン)
     * @return The value of the column 'WRAPPING_TYPE_R'. (NullAllowed)
     */
    public String getWrappingTypeR() {
        return _wrappingTypeR;
    }

    /**
     * [set] WRAPPING_TYPE_R: {varchar(255)} <br>
     * ラッピング種類(リボン)
     * @param wrappingTypeR The value of the column 'WRAPPING_TYPE_R'. (NullAllowed)
     */
    public void setWrappingTypeR(String wrappingTypeR) {
        __modifiedProperties.add("wrappingTypeR");
        this._wrappingTypeR = wrappingTypeR;
    }

    /**
     * [get] TOMORROW_FLG: {varchar(30)} <br>
     * あす楽希望
     * @return The value of the column 'TOMORROW_FLG'. (NullAllowed)
     */
    public String getTomorrowFlg() {
        return _tomorrowFlg;
    }

    /**
     * [set] TOMORROW_FLG: {varchar(30)} <br>
     * あす楽希望
     * @param tomorrowFlg The value of the column 'TOMORROW_FLG'. (NullAllowed)
     */
    public void setTomorrowFlg(String tomorrowFlg) {
        __modifiedProperties.add("tomorrowFlg");
        this._tomorrowFlg = tomorrowFlg;
    }

    /**
     * [get] COUPON_USE: {bigint(19)} <br>
     * クーポン利用額
     * @return The value of the column 'COUPON_USE'. (NullAllowed)
     */
    public Long getCouponUse() {
        return _couponUse;
    }

    /**
     * [set] COUPON_USE: {bigint(19)} <br>
     * クーポン利用額
     * @param couponUse The value of the column 'COUPON_USE'. (NullAllowed)
     */
    public void setCouponUse(Long couponUse) {
        __modifiedProperties.add("couponUse");
        this._couponUse = couponUse;
    }

    /**
     * [get] SHOP_COUPON_USE: {bigint(19)} <br>
     * 店舗発行クーポン利用額
     * @return The value of the column 'SHOP_COUPON_USE'. (NullAllowed)
     */
    public Long getShopCouponUse() {
        return _shopCouponUse;
    }

    /**
     * [set] SHOP_COUPON_USE: {bigint(19)} <br>
     * 店舗発行クーポン利用額
     * @param shopCouponUse The value of the column 'SHOP_COUPON_USE'. (NullAllowed)
     */
    public void setShopCouponUse(Long shopCouponUse) {
        __modifiedProperties.add("shopCouponUse");
        this._shopCouponUse = shopCouponUse;
    }

    /**
     * [get] RAKUTEN_COUPON_USE: {bigint(19)} <br>
     * 楽天発行クーポン利用額
     * @return The value of the column 'RAKUTEN_COUPON_USE'. (NullAllowed)
     */
    public Long getRakutenCouponUse() {
        return _rakutenCouponUse;
    }

    /**
     * [set] RAKUTEN_COUPON_USE: {bigint(19)} <br>
     * 楽天発行クーポン利用額
     * @param rakutenCouponUse The value of the column 'RAKUTEN_COUPON_USE'. (NullAllowed)
     */
    public void setRakutenCouponUse(Long rakutenCouponUse) {
        __modifiedProperties.add("rakutenCouponUse");
        this._rakutenCouponUse = rakutenCouponUse;
    }

    /**
     * [get] COMBINE_COUPON_USE: {bigint(19)} <br>
     * 同梱注文クーポン利用額
     * @return The value of the column 'COMBINE_COUPON_USE'. (NullAllowed)
     */
    public Long getCombineCouponUse() {
        return _combineCouponUse;
    }

    /**
     * [set] COMBINE_COUPON_USE: {bigint(19)} <br>
     * 同梱注文クーポン利用額
     * @param combineCouponUse The value of the column 'COMBINE_COUPON_USE'. (NullAllowed)
     */
    public void setCombineCouponUse(Long combineCouponUse) {
        __modifiedProperties.add("combineCouponUse");
        this._combineCouponUse = combineCouponUse;
    }

    /**
     * [get] DELIV_COMPANY: {varchar(255)} <br>
     * 配送会社
     * @return The value of the column 'DELIV_COMPANY'. (NullAllowed)
     */
    public String getDelivCompany() {
        return _delivCompany;
    }

    /**
     * [set] DELIV_COMPANY: {varchar(255)} <br>
     * 配送会社
     * @param delivCompany The value of the column 'DELIV_COMPANY'. (NullAllowed)
     */
    public void setDelivCompany(String delivCompany) {
        __modifiedProperties.add("delivCompany");
        this._delivCompany = delivCompany;
    }

    /**
     * [get] PHAMACE_FLG: {char(1)} <br>
     * 薬事フラグ
     * @return The value of the column 'PHAMACE_FLG'. (NullAllowed)
     */
    public String getPhamaceFlg() {
        return _phamaceFlg;
    }

    /**
     * [set] PHAMACE_FLG: {char(1)} <br>
     * 薬事フラグ
     * @param phamaceFlg The value of the column 'PHAMACE_FLG'. (NullAllowed)
     */
    public void setPhamaceFlg(String phamaceFlg) {
        __modifiedProperties.add("phamaceFlg");
        this._phamaceFlg = phamaceFlg;
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
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public Long getImportTypeId() {
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別ID
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
