package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_YAHOO_ORDER as TABLE. <br>
 * YAHOO受注
 * <pre>
 * [primary-key]
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
public abstract class BsTYahooOrderDto implements Serializable {

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
    /** YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _yahooOrderId;

    /** ORDER_ID: {varchar(30)} */
    @JsonKey
    protected String _orderId;

    /** PARENT_ORDER_ID: {varchar(30)} */
    @JsonKey
    protected String _parentOrderId;

    /** DEVICE_TYPE: {varchar(60)} */
    @JsonKey
    protected String _deviceType;

    /** IS_AFFILIATE: {varchar(60)} */
    @JsonKey
    protected String _isAffiliate;

    /** FSP_LICENSE_CODE: {varchar(30)} */
    @JsonKey
    protected String _fspLicenseCode;

    /** FSP_LICENSE_NAME: {varchar(60)} */
    @JsonKey
    protected String _fspLicenseName;

    /** ORDER_TIME: {varchar(30)} */
    @JsonKey
    protected String _orderTime;

    /** ORDER_TIME_UNIX_EPOCH: {varchar(30)} */
    @JsonKey
    protected String _orderTimeUnixEpoch;

    /** USE_POINT_TYPE: {varchar(60)} */
    @JsonKey
    protected String _usePointType;

    /** ORDER_STATUS: {varchar(60)} */
    @JsonKey
    protected String _orderStatus;

    /** STORE_STATUS: {varchar(60)} */
    @JsonKey
    protected String _storeStatus;

    /** REFERER: {varchar(60)} */
    @JsonKey
    protected String _referer;

    /** ENTRY_POINT: {varchar(60)} */
    @JsonKey
    protected String _entryPoint;

    /** CLINK: {varchar(60)} */
    @JsonKey
    protected String _clink;

    /** SUSPECT_MESSAGE: {varchar(60)} */
    @JsonKey
    protected String _suspectMessage;

    /** IS_ITEM_COUPON: {varchar(30)} */
    @JsonKey
    protected String _isItemCoupon;

    /** IS_SHIPPING_COUPON: {varchar(30)} */
    @JsonKey
    protected String _isShippingCoupon;

    /** SHIP_NAME: {varchar(255)} */
    @JsonKey
    protected String _shipName;

    /** SHIP_FIRST_NAME: {varchar(255)} */
    @JsonKey
    protected String _shipFirstName;

    /** SHIP_LAST_NAME: {varchar(255)} */
    @JsonKey
    protected String _shipLastName;

    /** SHIP_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _shipAddress1;

    /** SHIP_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _shipAddress2;

    /** SHIP_CITY: {varchar(255)} */
    @JsonKey
    protected String _shipCity;

    /** SHIP_PREFECTURE: {varchar(255)} */
    @JsonKey
    protected String _shipPrefecture;

    /** SHIP_ZIP_CODE: {varchar(60)} */
    @JsonKey
    protected String _shipZipCode;

    /** SHIP_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipNameKana;

    /** SHIP_FIRST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipFirstNameKana;

    /** SHIP_LAST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipLastNameKana;

    /** SHIP_ADDRESS1_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipAddress1Kana;

    /** SHIP_ADDRESS2_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipAddress2Kana;

    /** SHIP_CITY_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipCityKana;

    /** SHIP_PREFECTURE_KANA: {varchar(255)} */
    @JsonKey
    protected String _shipPrefectureKana;

    /** SHIP_SECTION1_FIELD: {varchar(60)} */
    @JsonKey
    protected String _shipSection1Field;

    /** SHIP_SECTION1_VALUE: {varchar(60)} */
    @JsonKey
    protected String _shipSection1Value;

    /** SHIP_SECTION2_FIELD: {varchar(60)} */
    @JsonKey
    protected String _shipSection2Field;

    /** SHIP_SECTION2_VALUE: {varchar(60)} */
    @JsonKey
    protected String _shipSection2Value;

    /** SHIP_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _shipPhoneNumber;

    /** SHIP_EMG_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _shipEmgPhoneNumber;

    /** SHIP_METHOD: {varchar(60)} */
    @JsonKey
    protected String _shipMethod;

    /** SHIP_METHOD_NAME: {varchar(60)} */
    @JsonKey
    protected String _shipMethodName;

    /** SHIP_REQUEST_DATE: {varchar(60)} */
    @JsonKey
    protected String _shipRequestDate;

    /** SHIP_REQUEST_TIME: {varchar(60)} */
    @JsonKey
    protected String _shipRequestTime;

    /** SHIP_NOTES: {varchar(60)} */
    @JsonKey
    protected String _shipNotes;

    /** ARRIVE_TYPE: {varchar(60)} */
    @JsonKey
    protected String _arriveType;

    /** SHIP_INVOICE_NUMBER1: {varchar(30)} */
    @JsonKey
    protected String _shipInvoiceNumber1;

    /** SHIP_INVOICE_NUMBER2: {varchar(30)} */
    @JsonKey
    protected String _shipInvoiceNumber2;

    /** SHIP_URL: {varchar(60)} */
    @JsonKey
    protected String _shipUrl;

    /** SHIP_DATE: {varchar(30)} */
    @JsonKey
    protected String _shipDate;

    /** GIFT_WRAP_TYPE: {varchar(60)} */
    @JsonKey
    protected String _giftWrapType;

    /** GIFT_WRAP_PAPER_TYPE: {varchar(60)} */
    @JsonKey
    protected String _giftWrapPaperType;

    /** GIFT_WRAP_NAME: {varchar(60)} */
    @JsonKey
    protected String _giftWrapName;

    /** NEED_BILL_SLIP: {varchar(60)} */
    @JsonKey
    protected String _needBillSlip;

    /** NEED_DETAILED_SLIP: {varchar(60)} */
    @JsonKey
    protected String _needDetailedSlip;

    /** NEED_RECEIPT: {varchar(60)} */
    @JsonKey
    protected String _needReceipt;

    /** OPTION1_FIELD: {varchar(60)} */
    @JsonKey
    protected String _option1Field;

    /** OPTION1_VALUE: {varchar(60)} */
    @JsonKey
    protected String _option1Value;

    /** OPTION2_FIELD: {varchar(60)} */
    @JsonKey
    protected String _option2Field;

    /** OPTION2_VALUE: {varchar(60)} */
    @JsonKey
    protected String _option2Value;

    /** GIFT_WRAP_MASSAGE: {varchar(60)} */
    @JsonKey
    protected String _giftWrapMassage;

    /** BILL_NAME: {varchar(255)} */
    @JsonKey
    protected String _billName;

    /** BILL_FIRST_NAME: {varchar(255)} */
    @JsonKey
    protected String _billFirstName;

    /** BILL_LAST_NAME: {varchar(255)} */
    @JsonKey
    protected String _billLastName;

    /** BILL_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _billAddress1;

    /** BILL_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _billAddress2;

    /** BILL_CITY: {varchar(255)} */
    @JsonKey
    protected String _billCity;

    /** BILL_PREFECTURE: {varchar(255)} */
    @JsonKey
    protected String _billPrefecture;

    /** BILL_ZIP_CODE: {varchar(30)} */
    @JsonKey
    protected String _billZipCode;

    /** BILL_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _billNameKana;

    /** BILL_FIRST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _billFirstNameKana;

    /** BILL_LAST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _billLastNameKana;

    /** BILL_ADDRESS1_KANA: {varchar(255)} */
    @JsonKey
    protected String _billAddress1Kana;

    /** BILL_ADDRESS2_KANA: {varchar(255)} */
    @JsonKey
    protected String _billAddress2Kana;

    /** BILL_CITY_KANA: {varchar(255)} */
    @JsonKey
    protected String _billCityKana;

    /** BILL_PREFECTURE_KANA: {varchar(255)} */
    @JsonKey
    protected String _billPrefectureKana;

    /** BILL_SECTION1_FIELD: {varchar(60)} */
    @JsonKey
    protected String _billSection1Field;

    /** BILL_SECTION1_VALUE: {varchar(60)} */
    @JsonKey
    protected String _billSection1Value;

    /** BILL_SECTION2_FIELD: {varchar(60)} */
    @JsonKey
    protected String _billSection2Field;

    /** BILL_SECTION2_VALUE: {varchar(60)} */
    @JsonKey
    protected String _billSection2Value;

    /** BILL_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _billPhoneNumber;

    /** BILL_EMG_PHONE_NUMBER: {varchar(255)} */
    @JsonKey
    protected String _billEmgPhoneNumber;

    /** BILL_MAIL_ADDRESS: {varchar(255)} */
    @JsonKey
    protected String _billMailAddress;

    /** PAY_MATHOD: {varchar(60)} */
    @JsonKey
    protected String _payMathod;

    /** PAY_MATHOD_NAME: {varchar(60)} */
    @JsonKey
    protected String _payMathodName;

    /** PAY_KIND: {varchar(60)} */
    @JsonKey
    protected String _payKind;

    /** CARD_PAY_COUNT: {bigint(19)} */
    @JsonKey
    protected Long _cardPayCount;

    /** CARD_PAY_TYPE: {varchar(60)} */
    @JsonKey
    protected String _cardPayType;

    /** SETTLE_STATUS: {varchar(60)} */
    @JsonKey
    protected String _settleStatus;

    /** SETTLE_ID: {varchar(30)} */
    @JsonKey
    protected String _settleId;

    /** PAY_NO: {varchar(30)} */
    @JsonKey
    protected String _payNo;

    /** PAY_NO_ISSUE_DATE: {varchar(30)} */
    @JsonKey
    protected String _payNoIssueDate;

    /** PAY_DATE: {varchar(30)} */
    @JsonKey
    protected String _payDate;

    /** BUYER_COMMENTS: {varchar(60)} */
    @JsonKey
    protected String _buyerComments;

    /** AGE_CONFIRM: {varchar(60)} */
    @JsonKey
    protected String _ageConfirm;

    /** QUANTITY_DETAIL: {bigint(19)} */
    @JsonKey
    protected Long _quantityDetail;

    /** SHIP_CHARGE: {bigint(19)} */
    @JsonKey
    protected Long _shipCharge;

    /** PAY_CHARGE: {bigint(19)} */
    @JsonKey
    protected Long _payCharge;

    /** GIFT_WRAP_CHARGE: {bigint(19)} */
    @JsonKey
    protected Long _giftWrapCharge;

    /** DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _discount;

    /** ADJUSTMENTS: {bigint(19)} */
    @JsonKey
    protected Long _adjustments;

    /** USE_POINT: {bigint(19)} */
    @JsonKey
    protected Long _usePoint;

    /** GET_POINT: {bigint(19)} */
    @JsonKey
    protected Long _getPoint;

    /** TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _total;

    /** TOTAL_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _totalPrice;

    /** SHIPPING_C_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _shippingCDiscount;

    /** ITEM_C_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _itemCDiscount;

    /** TOTAL_MALL_C_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _totalMallCDiscount;

    /** GET_POINT_CRG_TO_STORE: {bigint(19)} */
    @JsonKey
    protected Long _getPointCrgToStore;

    /** LINE_ID: {varchar(30)} */
    @JsonKey
    protected String _lineId;

    /** QUANTITY: {bigint(19)} */
    @JsonKey
    protected Long _quantity;

    /** ITEM_ID: {varchar(30)} */
    @JsonKey
    protected String _itemId;

    /** SUB_CODE: {varchar(30)} */
    @JsonKey
    protected String _subCode;

    /** TITLE: {varchar(255)} */
    @JsonKey
    protected String _title;

    /** ITEM_OPTION_NAME: {varchar(60)} */
    @JsonKey
    protected String _itemOptionName;

    /** ITEM_OPTION_VALUE: {varchar(60)} */
    @JsonKey
    protected String _itemOptionValue;

    /** SUB_CODE_OPTION: {varchar(60)} */
    @JsonKey
    protected String _subCodeOption;

    /** INSCRIPTION_NAME: {varchar(60)} */
    @JsonKey
    protected String _inscriptionName;

    /** INSCRIPTION_VALUE: {varchar(60)} */
    @JsonKey
    protected String _inscriptionValue;

    /** UNIT_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _unitPrice;

    /** UNIT_GET_POINT: {bigint(19)} */
    @JsonKey
    protected Long _unitGetPoint;

    /** LINE_SUB_TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _lineSubTotal;

    /** LINE_GET_POINT: {bigint(19)} */
    @JsonKey
    protected Long _lineGetPoint;

    /** POINT_FSP_CODE: {varchar(30)} */
    @JsonKey
    protected String _pointFspCode;

    /** ITEM_CONDITION: {varchar(30)} */
    @JsonKey
    protected String _itemCondition;

    /** COUPON_ID: {varchar(30)} */
    @JsonKey
    protected String _couponId;

    /** COUPON_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _couponDiscount;

    /** ORIGINAL_PRICE: {bigint(19)} */
    @JsonKey
    protected Long _originalPrice;

    /** IS_GET_POINT_FIX: {varchar(30)} */
    @JsonKey
    protected String _isGetPointFix;

    /** GET_POINT_FIX_DATE: {varchar(30)} */
    @JsonKey
    protected String _getPointFixDate;

    /** RELEASE_DATE: {varchar(30)} */
    @JsonKey
    protected String _releaseDate;

    /** GET_POINT_TYPE: {varchar(30)} */
    @JsonKey
    protected String _getPointType;

    /** JAN: {varchar(30)} */
    @JsonKey
    protected String _jan;

    /** PRODUCT_ID: {varchar(30)} */
    @JsonKey
    protected String _productId;

    /** POINT_CHARGED_TO_STORE: {bigint(19)} */
    @JsonKey
    protected Long _pointChargedToStore;

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
    public BsTYahooOrderDto() {
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
        if (other == null || !(other instanceof BsTYahooOrderDto)) { return false; }
        final BsTYahooOrderDto otherEntity = (BsTYahooOrderDto)other;
        if (!helpComparingValue(getYahooOrderId(), otherEntity.getYahooOrderId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_YAHOO_ORDER");
        result = xCH(result, getYahooOrderId());
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
        sb.append(c).append(getYahooOrderId());
        sb.append(c).append(getOrderId());
        sb.append(c).append(getParentOrderId());
        sb.append(c).append(getDeviceType());
        sb.append(c).append(getIsAffiliate());
        sb.append(c).append(getFspLicenseCode());
        sb.append(c).append(getFspLicenseName());
        sb.append(c).append(getOrderTime());
        sb.append(c).append(getOrderTimeUnixEpoch());
        sb.append(c).append(getUsePointType());
        sb.append(c).append(getOrderStatus());
        sb.append(c).append(getStoreStatus());
        sb.append(c).append(getReferer());
        sb.append(c).append(getEntryPoint());
        sb.append(c).append(getClink());
        sb.append(c).append(getSuspectMessage());
        sb.append(c).append(getIsItemCoupon());
        sb.append(c).append(getIsShippingCoupon());
        sb.append(c).append(getShipName());
        sb.append(c).append(getShipFirstName());
        sb.append(c).append(getShipLastName());
        sb.append(c).append(getShipAddress1());
        sb.append(c).append(getShipAddress2());
        sb.append(c).append(getShipCity());
        sb.append(c).append(getShipPrefecture());
        sb.append(c).append(getShipZipCode());
        sb.append(c).append(getShipNameKana());
        sb.append(c).append(getShipFirstNameKana());
        sb.append(c).append(getShipLastNameKana());
        sb.append(c).append(getShipAddress1Kana());
        sb.append(c).append(getShipAddress2Kana());
        sb.append(c).append(getShipCityKana());
        sb.append(c).append(getShipPrefectureKana());
        sb.append(c).append(getShipSection1Field());
        sb.append(c).append(getShipSection1Value());
        sb.append(c).append(getShipSection2Field());
        sb.append(c).append(getShipSection2Value());
        sb.append(c).append(getShipPhoneNumber());
        sb.append(c).append(getShipEmgPhoneNumber());
        sb.append(c).append(getShipMethod());
        sb.append(c).append(getShipMethodName());
        sb.append(c).append(getShipRequestDate());
        sb.append(c).append(getShipRequestTime());
        sb.append(c).append(getShipNotes());
        sb.append(c).append(getArriveType());
        sb.append(c).append(getShipInvoiceNumber1());
        sb.append(c).append(getShipInvoiceNumber2());
        sb.append(c).append(getShipUrl());
        sb.append(c).append(getShipDate());
        sb.append(c).append(getGiftWrapType());
        sb.append(c).append(getGiftWrapPaperType());
        sb.append(c).append(getGiftWrapName());
        sb.append(c).append(getNeedBillSlip());
        sb.append(c).append(getNeedDetailedSlip());
        sb.append(c).append(getNeedReceipt());
        sb.append(c).append(getOption1Field());
        sb.append(c).append(getOption1Value());
        sb.append(c).append(getOption2Field());
        sb.append(c).append(getOption2Value());
        sb.append(c).append(getGiftWrapMassage());
        sb.append(c).append(getBillName());
        sb.append(c).append(getBillFirstName());
        sb.append(c).append(getBillLastName());
        sb.append(c).append(getBillAddress1());
        sb.append(c).append(getBillAddress2());
        sb.append(c).append(getBillCity());
        sb.append(c).append(getBillPrefecture());
        sb.append(c).append(getBillZipCode());
        sb.append(c).append(getBillNameKana());
        sb.append(c).append(getBillFirstNameKana());
        sb.append(c).append(getBillLastNameKana());
        sb.append(c).append(getBillAddress1Kana());
        sb.append(c).append(getBillAddress2Kana());
        sb.append(c).append(getBillCityKana());
        sb.append(c).append(getBillPrefectureKana());
        sb.append(c).append(getBillSection1Field());
        sb.append(c).append(getBillSection1Value());
        sb.append(c).append(getBillSection2Field());
        sb.append(c).append(getBillSection2Value());
        sb.append(c).append(getBillPhoneNumber());
        sb.append(c).append(getBillEmgPhoneNumber());
        sb.append(c).append(getBillMailAddress());
        sb.append(c).append(getPayMathod());
        sb.append(c).append(getPayMathodName());
        sb.append(c).append(getPayKind());
        sb.append(c).append(getCardPayCount());
        sb.append(c).append(getCardPayType());
        sb.append(c).append(getSettleStatus());
        sb.append(c).append(getSettleId());
        sb.append(c).append(getPayNo());
        sb.append(c).append(getPayNoIssueDate());
        sb.append(c).append(getPayDate());
        sb.append(c).append(getBuyerComments());
        sb.append(c).append(getAgeConfirm());
        sb.append(c).append(getQuantityDetail());
        sb.append(c).append(getShipCharge());
        sb.append(c).append(getPayCharge());
        sb.append(c).append(getGiftWrapCharge());
        sb.append(c).append(getDiscount());
        sb.append(c).append(getAdjustments());
        sb.append(c).append(getUsePoint());
        sb.append(c).append(getGetPoint());
        sb.append(c).append(getTotal());
        sb.append(c).append(getTotalPrice());
        sb.append(c).append(getShippingCDiscount());
        sb.append(c).append(getItemCDiscount());
        sb.append(c).append(getTotalMallCDiscount());
        sb.append(c).append(getGetPointCrgToStore());
        sb.append(c).append(getLineId());
        sb.append(c).append(getQuantity());
        sb.append(c).append(getItemId());
        sb.append(c).append(getSubCode());
        sb.append(c).append(getTitle());
        sb.append(c).append(getItemOptionName());
        sb.append(c).append(getItemOptionValue());
        sb.append(c).append(getSubCodeOption());
        sb.append(c).append(getInscriptionName());
        sb.append(c).append(getInscriptionValue());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getUnitGetPoint());
        sb.append(c).append(getLineSubTotal());
        sb.append(c).append(getLineGetPoint());
        sb.append(c).append(getPointFspCode());
        sb.append(c).append(getItemCondition());
        sb.append(c).append(getCouponId());
        sb.append(c).append(getCouponDiscount());
        sb.append(c).append(getOriginalPrice());
        sb.append(c).append(getIsGetPointFix());
        sb.append(c).append(getGetPointFixDate());
        sb.append(c).append(getReleaseDate());
        sb.append(c).append(getGetPointType());
        sb.append(c).append(getJan());
        sb.append(c).append(getProductId());
        sb.append(c).append(getPointChargedToStore());
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
     * [get] YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * YAHOO受注ID
     * @return The value of the column 'YAHOO_ORDER_ID'. (NullAllowed)
     */
    public Long getYahooOrderId() {
        return _yahooOrderId;
    }

    /**
     * [set] YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * YAHOO受注ID
     * @param yahooOrderId The value of the column 'YAHOO_ORDER_ID'. (NullAllowed)
     */
    public void setYahooOrderId(Long yahooOrderId) {
        __modifiedProperties.add("yahooOrderId");
        this._yahooOrderId = yahooOrderId;
    }

    /**
     * [get] ORDER_ID: {varchar(30)} <br>
     * 注文ID
     * @return The value of the column 'ORDER_ID'. (NullAllowed)
     */
    public String getOrderId() {
        return _orderId;
    }

    /**
     * [set] ORDER_ID: {varchar(30)} <br>
     * 注文ID
     * @param orderId The value of the column 'ORDER_ID'. (NullAllowed)
     */
    public void setOrderId(String orderId) {
        __modifiedProperties.add("orderId");
        this._orderId = orderId;
    }

    /**
     * [get] PARENT_ORDER_ID: {varchar(30)} <br>
     * 分割元注文ID
     * @return The value of the column 'PARENT_ORDER_ID'. (NullAllowed)
     */
    public String getParentOrderId() {
        return _parentOrderId;
    }

    /**
     * [set] PARENT_ORDER_ID: {varchar(30)} <br>
     * 分割元注文ID
     * @param parentOrderId The value of the column 'PARENT_ORDER_ID'. (NullAllowed)
     */
    public void setParentOrderId(String parentOrderId) {
        __modifiedProperties.add("parentOrderId");
        this._parentOrderId = parentOrderId;
    }

    /**
     * [get] DEVICE_TYPE: {varchar(60)} <br>
     * 注文媒体
     * @return The value of the column 'DEVICE_TYPE'. (NullAllowed)
     */
    public String getDeviceType() {
        return _deviceType;
    }

    /**
     * [set] DEVICE_TYPE: {varchar(60)} <br>
     * 注文媒体
     * @param deviceType The value of the column 'DEVICE_TYPE'. (NullAllowed)
     */
    public void setDeviceType(String deviceType) {
        __modifiedProperties.add("deviceType");
        this._deviceType = deviceType;
    }

    /**
     * [get] IS_AFFILIATE: {varchar(60)} <br>
     * アフェリエイト経由注文種別
     * @return The value of the column 'IS_AFFILIATE'. (NullAllowed)
     */
    public String getIsAffiliate() {
        return _isAffiliate;
    }

    /**
     * [set] IS_AFFILIATE: {varchar(60)} <br>
     * アフェリエイト経由注文種別
     * @param isAffiliate The value of the column 'IS_AFFILIATE'. (NullAllowed)
     */
    public void setIsAffiliate(String isAffiliate) {
        __modifiedProperties.add("isAffiliate");
        this._isAffiliate = isAffiliate;
    }

    /**
     * [get] FSP_LICENSE_CODE: {varchar(30)} <br>
     * スタンプラリーCD
     * @return The value of the column 'FSP_LICENSE_CODE'. (NullAllowed)
     */
    public String getFspLicenseCode() {
        return _fspLicenseCode;
    }

    /**
     * [set] FSP_LICENSE_CODE: {varchar(30)} <br>
     * スタンプラリーCD
     * @param fspLicenseCode The value of the column 'FSP_LICENSE_CODE'. (NullAllowed)
     */
    public void setFspLicenseCode(String fspLicenseCode) {
        __modifiedProperties.add("fspLicenseCode");
        this._fspLicenseCode = fspLicenseCode;
    }

    /**
     * [get] FSP_LICENSE_NAME: {varchar(60)} <br>
     * スタンプラリー名
     * @return The value of the column 'FSP_LICENSE_NAME'. (NullAllowed)
     */
    public String getFspLicenseName() {
        return _fspLicenseName;
    }

    /**
     * [set] FSP_LICENSE_NAME: {varchar(60)} <br>
     * スタンプラリー名
     * @param fspLicenseName The value of the column 'FSP_LICENSE_NAME'. (NullAllowed)
     */
    public void setFspLicenseName(String fspLicenseName) {
        __modifiedProperties.add("fspLicenseName");
        this._fspLicenseName = fspLicenseName;
    }

    /**
     * [get] ORDER_TIME: {varchar(30)} <br>
     * 注文日時
     * @return The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public String getOrderTime() {
        return _orderTime;
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文日時
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public void setOrderTime(String orderTime) {
        __modifiedProperties.add("orderTime");
        this._orderTime = orderTime;
    }

    /**
     * [get] ORDER_TIME_UNIX_EPOCH: {varchar(30)} <br>
     * 注文日時(UnixTime値)
     * @return The value of the column 'ORDER_TIME_UNIX_EPOCH'. (NullAllowed)
     */
    public String getOrderTimeUnixEpoch() {
        return _orderTimeUnixEpoch;
    }

    /**
     * [set] ORDER_TIME_UNIX_EPOCH: {varchar(30)} <br>
     * 注文日時(UnixTime値)
     * @param orderTimeUnixEpoch The value of the column 'ORDER_TIME_UNIX_EPOCH'. (NullAllowed)
     */
    public void setOrderTimeUnixEpoch(String orderTimeUnixEpoch) {
        __modifiedProperties.add("orderTimeUnixEpoch");
        this._orderTimeUnixEpoch = orderTimeUnixEpoch;
    }

    /**
     * [get] USE_POINT_TYPE: {varchar(60)} <br>
     * 利用ポイント種別
     * @return The value of the column 'USE_POINT_TYPE'. (NullAllowed)
     */
    public String getUsePointType() {
        return _usePointType;
    }

    /**
     * [set] USE_POINT_TYPE: {varchar(60)} <br>
     * 利用ポイント種別
     * @param usePointType The value of the column 'USE_POINT_TYPE'. (NullAllowed)
     */
    public void setUsePointType(String usePointType) {
        __modifiedProperties.add("usePointType");
        this._usePointType = usePointType;
    }

    /**
     * [get] ORDER_STATUS: {varchar(60)} <br>
     * 注文ステータス
     * @return The value of the column 'ORDER_STATUS'. (NullAllowed)
     */
    public String getOrderStatus() {
        return _orderStatus;
    }

    /**
     * [set] ORDER_STATUS: {varchar(60)} <br>
     * 注文ステータス
     * @param orderStatus The value of the column 'ORDER_STATUS'. (NullAllowed)
     */
    public void setOrderStatus(String orderStatus) {
        __modifiedProperties.add("orderStatus");
        this._orderStatus = orderStatus;
    }

    /**
     * [get] STORE_STATUS: {varchar(60)} <br>
     * ストアカスタムステータス
     * @return The value of the column 'STORE_STATUS'. (NullAllowed)
     */
    public String getStoreStatus() {
        return _storeStatus;
    }

    /**
     * [set] STORE_STATUS: {varchar(60)} <br>
     * ストアカスタムステータス
     * @param storeStatus The value of the column 'STORE_STATUS'. (NullAllowed)
     */
    public void setStoreStatus(String storeStatus) {
        __modifiedProperties.add("storeStatus");
        this._storeStatus = storeStatus;
    }

    /**
     * [get] REFERER: {varchar(60)} <br>
     * 参照元URL
     * @return The value of the column 'REFERER'. (NullAllowed)
     */
    public String getReferer() {
        return _referer;
    }

    /**
     * [set] REFERER: {varchar(60)} <br>
     * 参照元URL
     * @param referer The value of the column 'REFERER'. (NullAllowed)
     */
    public void setReferer(String referer) {
        __modifiedProperties.add("referer");
        this._referer = referer;
    }

    /**
     * [get] ENTRY_POINT: {varchar(60)} <br>
     * 入力ポイント
     * @return The value of the column 'ENTRY_POINT'. (NullAllowed)
     */
    public String getEntryPoint() {
        return _entryPoint;
    }

    /**
     * [set] ENTRY_POINT: {varchar(60)} <br>
     * 入力ポイント
     * @param entryPoint The value of the column 'ENTRY_POINT'. (NullAllowed)
     */
    public void setEntryPoint(String entryPoint) {
        __modifiedProperties.add("entryPoint");
        this._entryPoint = entryPoint;
    }

    /**
     * [get] CLINK: {varchar(60)} <br>
     * 調査用リンク
     * @return The value of the column 'CLINK'. (NullAllowed)
     */
    public String getClink() {
        return _clink;
    }

    /**
     * [set] CLINK: {varchar(60)} <br>
     * 調査用リンク
     * @param clink The value of the column 'CLINK'. (NullAllowed)
     */
    public void setClink(String clink) {
        __modifiedProperties.add("clink");
        this._clink = clink;
    }

    /**
     * [get] SUSPECT_MESSAGE: {varchar(60)} <br>
     * いたずら注文警告
     * @return The value of the column 'SUSPECT_MESSAGE'. (NullAllowed)
     */
    public String getSuspectMessage() {
        return _suspectMessage;
    }

    /**
     * [set] SUSPECT_MESSAGE: {varchar(60)} <br>
     * いたずら注文警告
     * @param suspectMessage The value of the column 'SUSPECT_MESSAGE'. (NullAllowed)
     */
    public void setSuspectMessage(String suspectMessage) {
        __modifiedProperties.add("suspectMessage");
        this._suspectMessage = suspectMessage;
    }

    /**
     * [get] IS_ITEM_COUPON: {varchar(30)} <br>
     * 定率・定額クーポン利用フラグ
     * @return The value of the column 'IS_ITEM_COUPON'. (NullAllowed)
     */
    public String getIsItemCoupon() {
        return _isItemCoupon;
    }

    /**
     * [set] IS_ITEM_COUPON: {varchar(30)} <br>
     * 定率・定額クーポン利用フラグ
     * @param isItemCoupon The value of the column 'IS_ITEM_COUPON'. (NullAllowed)
     */
    public void setIsItemCoupon(String isItemCoupon) {
        __modifiedProperties.add("isItemCoupon");
        this._isItemCoupon = isItemCoupon;
    }

    /**
     * [get] IS_SHIPPING_COUPON: {varchar(30)} <br>
     * 送料無料クーポン利用フラグ
     * @return The value of the column 'IS_SHIPPING_COUPON'. (NullAllowed)
     */
    public String getIsShippingCoupon() {
        return _isShippingCoupon;
    }

    /**
     * [set] IS_SHIPPING_COUPON: {varchar(30)} <br>
     * 送料無料クーポン利用フラグ
     * @param isShippingCoupon The value of the column 'IS_SHIPPING_COUPON'. (NullAllowed)
     */
    public void setIsShippingCoupon(String isShippingCoupon) {
        __modifiedProperties.add("isShippingCoupon");
        this._isShippingCoupon = isShippingCoupon;
    }

    /**
     * [get] SHIP_NAME: {varchar(255)} <br>
     * お届け先氏名
     * @return The value of the column 'SHIP_NAME'. (NullAllowed)
     */
    public String getShipName() {
        return _shipName;
    }

    /**
     * [set] SHIP_NAME: {varchar(255)} <br>
     * お届け先氏名
     * @param shipName The value of the column 'SHIP_NAME'. (NullAllowed)
     */
    public void setShipName(String shipName) {
        __modifiedProperties.add("shipName");
        this._shipName = shipName;
    }

    /**
     * [get] SHIP_FIRST_NAME: {varchar(255)} <br>
     * お届け先名前
     * @return The value of the column 'SHIP_FIRST_NAME'. (NullAllowed)
     */
    public String getShipFirstName() {
        return _shipFirstName;
    }

    /**
     * [set] SHIP_FIRST_NAME: {varchar(255)} <br>
     * お届け先名前
     * @param shipFirstName The value of the column 'SHIP_FIRST_NAME'. (NullAllowed)
     */
    public void setShipFirstName(String shipFirstName) {
        __modifiedProperties.add("shipFirstName");
        this._shipFirstName = shipFirstName;
    }

    /**
     * [get] SHIP_LAST_NAME: {varchar(255)} <br>
     * お届け先名字
     * @return The value of the column 'SHIP_LAST_NAME'. (NullAllowed)
     */
    public String getShipLastName() {
        return _shipLastName;
    }

    /**
     * [set] SHIP_LAST_NAME: {varchar(255)} <br>
     * お届け先名字
     * @param shipLastName The value of the column 'SHIP_LAST_NAME'. (NullAllowed)
     */
    public void setShipLastName(String shipLastName) {
        __modifiedProperties.add("shipLastName");
        this._shipLastName = shipLastName;
    }

    /**
     * [get] SHIP_ADDRESS1: {varchar(255)} <br>
     * お届け先住所1
     * @return The value of the column 'SHIP_ADDRESS1'. (NullAllowed)
     */
    public String getShipAddress1() {
        return _shipAddress1;
    }

    /**
     * [set] SHIP_ADDRESS1: {varchar(255)} <br>
     * お届け先住所1
     * @param shipAddress1 The value of the column 'SHIP_ADDRESS1'. (NullAllowed)
     */
    public void setShipAddress1(String shipAddress1) {
        __modifiedProperties.add("shipAddress1");
        this._shipAddress1 = shipAddress1;
    }

    /**
     * [get] SHIP_ADDRESS2: {varchar(255)} <br>
     * お届け先住所2
     * @return The value of the column 'SHIP_ADDRESS2'. (NullAllowed)
     */
    public String getShipAddress2() {
        return _shipAddress2;
    }

    /**
     * [set] SHIP_ADDRESS2: {varchar(255)} <br>
     * お届け先住所2
     * @param shipAddress2 The value of the column 'SHIP_ADDRESS2'. (NullAllowed)
     */
    public void setShipAddress2(String shipAddress2) {
        __modifiedProperties.add("shipAddress2");
        this._shipAddress2 = shipAddress2;
    }

    /**
     * [get] SHIP_CITY: {varchar(255)} <br>
     * お届け先市区町村
     * @return The value of the column 'SHIP_CITY'. (NullAllowed)
     */
    public String getShipCity() {
        return _shipCity;
    }

    /**
     * [set] SHIP_CITY: {varchar(255)} <br>
     * お届け先市区町村
     * @param shipCity The value of the column 'SHIP_CITY'. (NullAllowed)
     */
    public void setShipCity(String shipCity) {
        __modifiedProperties.add("shipCity");
        this._shipCity = shipCity;
    }

    /**
     * [get] SHIP_PREFECTURE: {varchar(255)} <br>
     * お届け先都道府県
     * @return The value of the column 'SHIP_PREFECTURE'. (NullAllowed)
     */
    public String getShipPrefecture() {
        return _shipPrefecture;
    }

    /**
     * [set] SHIP_PREFECTURE: {varchar(255)} <br>
     * お届け先都道府県
     * @param shipPrefecture The value of the column 'SHIP_PREFECTURE'. (NullAllowed)
     */
    public void setShipPrefecture(String shipPrefecture) {
        __modifiedProperties.add("shipPrefecture");
        this._shipPrefecture = shipPrefecture;
    }

    /**
     * [get] SHIP_ZIP_CODE: {varchar(60)} <br>
     * お届け先郵便番号
     * @return The value of the column 'SHIP_ZIP_CODE'. (NullAllowed)
     */
    public String getShipZipCode() {
        return _shipZipCode;
    }

    /**
     * [set] SHIP_ZIP_CODE: {varchar(60)} <br>
     * お届け先郵便番号
     * @param shipZipCode The value of the column 'SHIP_ZIP_CODE'. (NullAllowed)
     */
    public void setShipZipCode(String shipZipCode) {
        __modifiedProperties.add("shipZipCode");
        this._shipZipCode = shipZipCode;
    }

    /**
     * [get] SHIP_NAME_KANA: {varchar(255)} <br>
     * お届け先氏名カナ
     * @return The value of the column 'SHIP_NAME_KANA'. (NullAllowed)
     */
    public String getShipNameKana() {
        return _shipNameKana;
    }

    /**
     * [set] SHIP_NAME_KANA: {varchar(255)} <br>
     * お届け先氏名カナ
     * @param shipNameKana The value of the column 'SHIP_NAME_KANA'. (NullAllowed)
     */
    public void setShipNameKana(String shipNameKana) {
        __modifiedProperties.add("shipNameKana");
        this._shipNameKana = shipNameKana;
    }

    /**
     * [get] SHIP_FIRST_NAME_KANA: {varchar(255)} <br>
     * お届け先名前カナ
     * @return The value of the column 'SHIP_FIRST_NAME_KANA'. (NullAllowed)
     */
    public String getShipFirstNameKana() {
        return _shipFirstNameKana;
    }

    /**
     * [set] SHIP_FIRST_NAME_KANA: {varchar(255)} <br>
     * お届け先名前カナ
     * @param shipFirstNameKana The value of the column 'SHIP_FIRST_NAME_KANA'. (NullAllowed)
     */
    public void setShipFirstNameKana(String shipFirstNameKana) {
        __modifiedProperties.add("shipFirstNameKana");
        this._shipFirstNameKana = shipFirstNameKana;
    }

    /**
     * [get] SHIP_LAST_NAME_KANA: {varchar(255)} <br>
     * お届け先名字カナ
     * @return The value of the column 'SHIP_LAST_NAME_KANA'. (NullAllowed)
     */
    public String getShipLastNameKana() {
        return _shipLastNameKana;
    }

    /**
     * [set] SHIP_LAST_NAME_KANA: {varchar(255)} <br>
     * お届け先名字カナ
     * @param shipLastNameKana The value of the column 'SHIP_LAST_NAME_KANA'. (NullAllowed)
     */
    public void setShipLastNameKana(String shipLastNameKana) {
        __modifiedProperties.add("shipLastNameKana");
        this._shipLastNameKana = shipLastNameKana;
    }

    /**
     * [get] SHIP_ADDRESS1_KANA: {varchar(255)} <br>
     * お届け先住所1カナ
     * @return The value of the column 'SHIP_ADDRESS1_KANA'. (NullAllowed)
     */
    public String getShipAddress1Kana() {
        return _shipAddress1Kana;
    }

    /**
     * [set] SHIP_ADDRESS1_KANA: {varchar(255)} <br>
     * お届け先住所1カナ
     * @param shipAddress1Kana The value of the column 'SHIP_ADDRESS1_KANA'. (NullAllowed)
     */
    public void setShipAddress1Kana(String shipAddress1Kana) {
        __modifiedProperties.add("shipAddress1Kana");
        this._shipAddress1Kana = shipAddress1Kana;
    }

    /**
     * [get] SHIP_ADDRESS2_KANA: {varchar(255)} <br>
     * お届け先住所2カナ
     * @return The value of the column 'SHIP_ADDRESS2_KANA'. (NullAllowed)
     */
    public String getShipAddress2Kana() {
        return _shipAddress2Kana;
    }

    /**
     * [set] SHIP_ADDRESS2_KANA: {varchar(255)} <br>
     * お届け先住所2カナ
     * @param shipAddress2Kana The value of the column 'SHIP_ADDRESS2_KANA'. (NullAllowed)
     */
    public void setShipAddress2Kana(String shipAddress2Kana) {
        __modifiedProperties.add("shipAddress2Kana");
        this._shipAddress2Kana = shipAddress2Kana;
    }

    /**
     * [get] SHIP_CITY_KANA: {varchar(255)} <br>
     * お届け先市区町村カナ
     * @return The value of the column 'SHIP_CITY_KANA'. (NullAllowed)
     */
    public String getShipCityKana() {
        return _shipCityKana;
    }

    /**
     * [set] SHIP_CITY_KANA: {varchar(255)} <br>
     * お届け先市区町村カナ
     * @param shipCityKana The value of the column 'SHIP_CITY_KANA'. (NullAllowed)
     */
    public void setShipCityKana(String shipCityKana) {
        __modifiedProperties.add("shipCityKana");
        this._shipCityKana = shipCityKana;
    }

    /**
     * [get] SHIP_PREFECTURE_KANA: {varchar(255)} <br>
     * お届け先都道府県カナ
     * @return The value of the column 'SHIP_PREFECTURE_KANA'. (NullAllowed)
     */
    public String getShipPrefectureKana() {
        return _shipPrefectureKana;
    }

    /**
     * [set] SHIP_PREFECTURE_KANA: {varchar(255)} <br>
     * お届け先都道府県カナ
     * @param shipPrefectureKana The value of the column 'SHIP_PREFECTURE_KANA'. (NullAllowed)
     */
    public void setShipPrefectureKana(String shipPrefectureKana) {
        __modifiedProperties.add("shipPrefectureKana");
        this._shipPrefectureKana = shipPrefectureKana;
    }

    /**
     * [get] SHIP_SECTION1_FIELD: {varchar(60)} <br>
     * お届け先所属1フィールド名
     * @return The value of the column 'SHIP_SECTION1_FIELD'. (NullAllowed)
     */
    public String getShipSection1Field() {
        return _shipSection1Field;
    }

    /**
     * [set] SHIP_SECTION1_FIELD: {varchar(60)} <br>
     * お届け先所属1フィールド名
     * @param shipSection1Field The value of the column 'SHIP_SECTION1_FIELD'. (NullAllowed)
     */
    public void setShipSection1Field(String shipSection1Field) {
        __modifiedProperties.add("shipSection1Field");
        this._shipSection1Field = shipSection1Field;
    }

    /**
     * [get] SHIP_SECTION1_VALUE: {varchar(60)} <br>
     * お届け先所属1フィールド入力内容
     * @return The value of the column 'SHIP_SECTION1_VALUE'. (NullAllowed)
     */
    public String getShipSection1Value() {
        return _shipSection1Value;
    }

    /**
     * [set] SHIP_SECTION1_VALUE: {varchar(60)} <br>
     * お届け先所属1フィールド入力内容
     * @param shipSection1Value The value of the column 'SHIP_SECTION1_VALUE'. (NullAllowed)
     */
    public void setShipSection1Value(String shipSection1Value) {
        __modifiedProperties.add("shipSection1Value");
        this._shipSection1Value = shipSection1Value;
    }

    /**
     * [get] SHIP_SECTION2_FIELD: {varchar(60)} <br>
     * お届け先所属2フィールド名
     * @return The value of the column 'SHIP_SECTION2_FIELD'. (NullAllowed)
     */
    public String getShipSection2Field() {
        return _shipSection2Field;
    }

    /**
     * [set] SHIP_SECTION2_FIELD: {varchar(60)} <br>
     * お届け先所属2フィールド名
     * @param shipSection2Field The value of the column 'SHIP_SECTION2_FIELD'. (NullAllowed)
     */
    public void setShipSection2Field(String shipSection2Field) {
        __modifiedProperties.add("shipSection2Field");
        this._shipSection2Field = shipSection2Field;
    }

    /**
     * [get] SHIP_SECTION2_VALUE: {varchar(60)} <br>
     * お届け先所属2フィールド入力内容
     * @return The value of the column 'SHIP_SECTION2_VALUE'. (NullAllowed)
     */
    public String getShipSection2Value() {
        return _shipSection2Value;
    }

    /**
     * [set] SHIP_SECTION2_VALUE: {varchar(60)} <br>
     * お届け先所属2フィールド入力内容
     * @param shipSection2Value The value of the column 'SHIP_SECTION2_VALUE'. (NullAllowed)
     */
    public void setShipSection2Value(String shipSection2Value) {
        __modifiedProperties.add("shipSection2Value");
        this._shipSection2Value = shipSection2Value;
    }

    /**
     * [get] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号
     * @return The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed)
     */
    public String getShipPhoneNumber() {
        return _shipPhoneNumber;
    }

    /**
     * [set] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号
     * @param shipPhoneNumber The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed)
     */
    public void setShipPhoneNumber(String shipPhoneNumber) {
        __modifiedProperties.add("shipPhoneNumber");
        this._shipPhoneNumber = shipPhoneNumber;
    }

    /**
     * [get] SHIP_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号(緊急)
     * @return The value of the column 'SHIP_EMG_PHONE_NUMBER'. (NullAllowed)
     */
    public String getShipEmgPhoneNumber() {
        return _shipEmgPhoneNumber;
    }

    /**
     * [set] SHIP_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号(緊急)
     * @param shipEmgPhoneNumber The value of the column 'SHIP_EMG_PHONE_NUMBER'. (NullAllowed)
     */
    public void setShipEmgPhoneNumber(String shipEmgPhoneNumber) {
        __modifiedProperties.add("shipEmgPhoneNumber");
        this._shipEmgPhoneNumber = shipEmgPhoneNumber;
    }

    /**
     * [get] SHIP_METHOD: {varchar(60)} <br>
     * お届け方法
     * @return The value of the column 'SHIP_METHOD'. (NullAllowed)
     */
    public String getShipMethod() {
        return _shipMethod;
    }

    /**
     * [set] SHIP_METHOD: {varchar(60)} <br>
     * お届け方法
     * @param shipMethod The value of the column 'SHIP_METHOD'. (NullAllowed)
     */
    public void setShipMethod(String shipMethod) {
        __modifiedProperties.add("shipMethod");
        this._shipMethod = shipMethod;
    }

    /**
     * [get] SHIP_METHOD_NAME: {varchar(60)} <br>
     * お届け方法名称
     * @return The value of the column 'SHIP_METHOD_NAME'. (NullAllowed)
     */
    public String getShipMethodName() {
        return _shipMethodName;
    }

    /**
     * [set] SHIP_METHOD_NAME: {varchar(60)} <br>
     * お届け方法名称
     * @param shipMethodName The value of the column 'SHIP_METHOD_NAME'. (NullAllowed)
     */
    public void setShipMethodName(String shipMethodName) {
        __modifiedProperties.add("shipMethodName");
        this._shipMethodName = shipMethodName;
    }

    /**
     * [get] SHIP_REQUEST_DATE: {varchar(60)} <br>
     * お届け希望日
     * @return The value of the column 'SHIP_REQUEST_DATE'. (NullAllowed)
     */
    public String getShipRequestDate() {
        return _shipRequestDate;
    }

    /**
     * [set] SHIP_REQUEST_DATE: {varchar(60)} <br>
     * お届け希望日
     * @param shipRequestDate The value of the column 'SHIP_REQUEST_DATE'. (NullAllowed)
     */
    public void setShipRequestDate(String shipRequestDate) {
        __modifiedProperties.add("shipRequestDate");
        this._shipRequestDate = shipRequestDate;
    }

    /**
     * [get] SHIP_REQUEST_TIME: {varchar(60)} <br>
     * お届け希望時間帯
     * @return The value of the column 'SHIP_REQUEST_TIME'. (NullAllowed)
     */
    public String getShipRequestTime() {
        return _shipRequestTime;
    }

    /**
     * [set] SHIP_REQUEST_TIME: {varchar(60)} <br>
     * お届け希望時間帯
     * @param shipRequestTime The value of the column 'SHIP_REQUEST_TIME'. (NullAllowed)
     */
    public void setShipRequestTime(String shipRequestTime) {
        __modifiedProperties.add("shipRequestTime");
        this._shipRequestTime = shipRequestTime;
    }

    /**
     * [get] SHIP_NOTES: {varchar(60)} <br>
     * 配送メモ
     * @return The value of the column 'SHIP_NOTES'. (NullAllowed)
     */
    public String getShipNotes() {
        return _shipNotes;
    }

    /**
     * [set] SHIP_NOTES: {varchar(60)} <br>
     * 配送メモ
     * @param shipNotes The value of the column 'SHIP_NOTES'. (NullAllowed)
     */
    public void setShipNotes(String shipNotes) {
        __modifiedProperties.add("shipNotes");
        this._shipNotes = shipNotes;
    }

    /**
     * [get] ARRIVE_TYPE: {varchar(60)} <br>
     * 着荷種別
     * @return The value of the column 'ARRIVE_TYPE'. (NullAllowed)
     */
    public String getArriveType() {
        return _arriveType;
    }

    /**
     * [set] ARRIVE_TYPE: {varchar(60)} <br>
     * 着荷種別
     * @param arriveType The value of the column 'ARRIVE_TYPE'. (NullAllowed)
     */
    public void setArriveType(String arriveType) {
        __modifiedProperties.add("arriveType");
        this._arriveType = arriveType;
    }

    /**
     * [get] SHIP_INVOICE_NUMBER1: {varchar(30)} <br>
     * お問い合わせ伝票番号1
     * @return The value of the column 'SHIP_INVOICE_NUMBER1'. (NullAllowed)
     */
    public String getShipInvoiceNumber1() {
        return _shipInvoiceNumber1;
    }

    /**
     * [set] SHIP_INVOICE_NUMBER1: {varchar(30)} <br>
     * お問い合わせ伝票番号1
     * @param shipInvoiceNumber1 The value of the column 'SHIP_INVOICE_NUMBER1'. (NullAllowed)
     */
    public void setShipInvoiceNumber1(String shipInvoiceNumber1) {
        __modifiedProperties.add("shipInvoiceNumber1");
        this._shipInvoiceNumber1 = shipInvoiceNumber1;
    }

    /**
     * [get] SHIP_INVOICE_NUMBER2: {varchar(30)} <br>
     * お問い合わせ伝票番号2
     * @return The value of the column 'SHIP_INVOICE_NUMBER2'. (NullAllowed)
     */
    public String getShipInvoiceNumber2() {
        return _shipInvoiceNumber2;
    }

    /**
     * [set] SHIP_INVOICE_NUMBER2: {varchar(30)} <br>
     * お問い合わせ伝票番号2
     * @param shipInvoiceNumber2 The value of the column 'SHIP_INVOICE_NUMBER2'. (NullAllowed)
     */
    public void setShipInvoiceNumber2(String shipInvoiceNumber2) {
        __modifiedProperties.add("shipInvoiceNumber2");
        this._shipInvoiceNumber2 = shipInvoiceNumber2;
    }

    /**
     * [get] SHIP_URL: {varchar(60)} <br>
     * 配送会社URL
     * @return The value of the column 'SHIP_URL'. (NullAllowed)
     */
    public String getShipUrl() {
        return _shipUrl;
    }

    /**
     * [set] SHIP_URL: {varchar(60)} <br>
     * 配送会社URL
     * @param shipUrl The value of the column 'SHIP_URL'. (NullAllowed)
     */
    public void setShipUrl(String shipUrl) {
        __modifiedProperties.add("shipUrl");
        this._shipUrl = shipUrl;
    }

    /**
     * [get] SHIP_DATE: {varchar(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public String getShipDate() {
        return _shipDate;
    }

    /**
     * [set] SHIP_DATE: {varchar(30)} <br>
     * 出荷日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public void setShipDate(String shipDate) {
        __modifiedProperties.add("shipDate");
        this._shipDate = shipDate;
    }

    /**
     * [get] GIFT_WRAP_TYPE: {varchar(60)} <br>
     * ギフト包装種類
     * @return The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed)
     */
    public String getGiftWrapType() {
        return _giftWrapType;
    }

    /**
     * [set] GIFT_WRAP_TYPE: {varchar(60)} <br>
     * ギフト包装種類
     * @param giftWrapType The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed)
     */
    public void setGiftWrapType(String giftWrapType) {
        __modifiedProperties.add("giftWrapType");
        this._giftWrapType = giftWrapType;
    }

    /**
     * [get] GIFT_WRAP_PAPER_TYPE: {varchar(60)} <br>
     * のし
     * @return The value of the column 'GIFT_WRAP_PAPER_TYPE'. (NullAllowed)
     */
    public String getGiftWrapPaperType() {
        return _giftWrapPaperType;
    }

    /**
     * [set] GIFT_WRAP_PAPER_TYPE: {varchar(60)} <br>
     * のし
     * @param giftWrapPaperType The value of the column 'GIFT_WRAP_PAPER_TYPE'. (NullAllowed)
     */
    public void setGiftWrapPaperType(String giftWrapPaperType) {
        __modifiedProperties.add("giftWrapPaperType");
        this._giftWrapPaperType = giftWrapPaperType;
    }

    /**
     * [get] GIFT_WRAP_NAME: {varchar(60)} <br>
     * のし名入れ
     * @return The value of the column 'GIFT_WRAP_NAME'. (NullAllowed)
     */
    public String getGiftWrapName() {
        return _giftWrapName;
    }

    /**
     * [set] GIFT_WRAP_NAME: {varchar(60)} <br>
     * のし名入れ
     * @param giftWrapName The value of the column 'GIFT_WRAP_NAME'. (NullAllowed)
     */
    public void setGiftWrapName(String giftWrapName) {
        __modifiedProperties.add("giftWrapName");
        this._giftWrapName = giftWrapName;
    }

    /**
     * [get] NEED_BILL_SLIP: {varchar(60)} <br>
     * 請求書 同梱有無
     * @return The value of the column 'NEED_BILL_SLIP'. (NullAllowed)
     */
    public String getNeedBillSlip() {
        return _needBillSlip;
    }

    /**
     * [set] NEED_BILL_SLIP: {varchar(60)} <br>
     * 請求書 同梱有無
     * @param needBillSlip The value of the column 'NEED_BILL_SLIP'. (NullAllowed)
     */
    public void setNeedBillSlip(String needBillSlip) {
        __modifiedProperties.add("needBillSlip");
        this._needBillSlip = needBillSlip;
    }

    /**
     * [get] NEED_DETAILED_SLIP: {varchar(60)} <br>
     * 明細書・納品書 同梱有無
     * @return The value of the column 'NEED_DETAILED_SLIP'. (NullAllowed)
     */
    public String getNeedDetailedSlip() {
        return _needDetailedSlip;
    }

    /**
     * [set] NEED_DETAILED_SLIP: {varchar(60)} <br>
     * 明細書・納品書 同梱有無
     * @param needDetailedSlip The value of the column 'NEED_DETAILED_SLIP'. (NullAllowed)
     */
    public void setNeedDetailedSlip(String needDetailedSlip) {
        __modifiedProperties.add("needDetailedSlip");
        this._needDetailedSlip = needDetailedSlip;
    }

    /**
     * [get] NEED_RECEIPT: {varchar(60)} <br>
     * 領収書 同梱有無
     * @return The value of the column 'NEED_RECEIPT'. (NullAllowed)
     */
    public String getNeedReceipt() {
        return _needReceipt;
    }

    /**
     * [set] NEED_RECEIPT: {varchar(60)} <br>
     * 領収書 同梱有無
     * @param needReceipt The value of the column 'NEED_RECEIPT'. (NullAllowed)
     */
    public void setNeedReceipt(String needReceipt) {
        __modifiedProperties.add("needReceipt");
        this._needReceipt = needReceipt;
    }

    /**
     * [get] OPTION1_FIELD: {varchar(60)} <br>
     * オプションフィールド1名称
     * @return The value of the column 'OPTION1_FIELD'. (NullAllowed)
     */
    public String getOption1Field() {
        return _option1Field;
    }

    /**
     * [set] OPTION1_FIELD: {varchar(60)} <br>
     * オプションフィールド1名称
     * @param option1Field The value of the column 'OPTION1_FIELD'. (NullAllowed)
     */
    public void setOption1Field(String option1Field) {
        __modifiedProperties.add("option1Field");
        this._option1Field = option1Field;
    }

    /**
     * [get] OPTION1_VALUE: {varchar(60)} <br>
     * オプションフィールド1入力内容
     * @return The value of the column 'OPTION1_VALUE'. (NullAllowed)
     */
    public String getOption1Value() {
        return _option1Value;
    }

    /**
     * [set] OPTION1_VALUE: {varchar(60)} <br>
     * オプションフィールド1入力内容
     * @param option1Value The value of the column 'OPTION1_VALUE'. (NullAllowed)
     */
    public void setOption1Value(String option1Value) {
        __modifiedProperties.add("option1Value");
        this._option1Value = option1Value;
    }

    /**
     * [get] OPTION2_FIELD: {varchar(60)} <br>
     * オプションフィールド2名称
     * @return The value of the column 'OPTION2_FIELD'. (NullAllowed)
     */
    public String getOption2Field() {
        return _option2Field;
    }

    /**
     * [set] OPTION2_FIELD: {varchar(60)} <br>
     * オプションフィールド2名称
     * @param option2Field The value of the column 'OPTION2_FIELD'. (NullAllowed)
     */
    public void setOption2Field(String option2Field) {
        __modifiedProperties.add("option2Field");
        this._option2Field = option2Field;
    }

    /**
     * [get] OPTION2_VALUE: {varchar(60)} <br>
     * オプションフィールド2入力内容
     * @return The value of the column 'OPTION2_VALUE'. (NullAllowed)
     */
    public String getOption2Value() {
        return _option2Value;
    }

    /**
     * [set] OPTION2_VALUE: {varchar(60)} <br>
     * オプションフィールド2入力内容
     * @param option2Value The value of the column 'OPTION2_VALUE'. (NullAllowed)
     */
    public void setOption2Value(String option2Value) {
        __modifiedProperties.add("option2Value");
        this._option2Value = option2Value;
    }

    /**
     * [get] GIFT_WRAP_MASSAGE: {varchar(60)} <br>
     * ギフトメッセージ
     * @return The value of the column 'GIFT_WRAP_MASSAGE'. (NullAllowed)
     */
    public String getGiftWrapMassage() {
        return _giftWrapMassage;
    }

    /**
     * [set] GIFT_WRAP_MASSAGE: {varchar(60)} <br>
     * ギフトメッセージ
     * @param giftWrapMassage The value of the column 'GIFT_WRAP_MASSAGE'. (NullAllowed)
     */
    public void setGiftWrapMassage(String giftWrapMassage) {
        __modifiedProperties.add("giftWrapMassage");
        this._giftWrapMassage = giftWrapMassage;
    }

    /**
     * [get] BILL_NAME: {varchar(255)} <br>
     * ご請求先氏名
     * @return The value of the column 'BILL_NAME'. (NullAllowed)
     */
    public String getBillName() {
        return _billName;
    }

    /**
     * [set] BILL_NAME: {varchar(255)} <br>
     * ご請求先氏名
     * @param billName The value of the column 'BILL_NAME'. (NullAllowed)
     */
    public void setBillName(String billName) {
        __modifiedProperties.add("billName");
        this._billName = billName;
    }

    /**
     * [get] BILL_FIRST_NAME: {varchar(255)} <br>
     * ご請求先名前
     * @return The value of the column 'BILL_FIRST_NAME'. (NullAllowed)
     */
    public String getBillFirstName() {
        return _billFirstName;
    }

    /**
     * [set] BILL_FIRST_NAME: {varchar(255)} <br>
     * ご請求先名前
     * @param billFirstName The value of the column 'BILL_FIRST_NAME'. (NullAllowed)
     */
    public void setBillFirstName(String billFirstName) {
        __modifiedProperties.add("billFirstName");
        this._billFirstName = billFirstName;
    }

    /**
     * [get] BILL_LAST_NAME: {varchar(255)} <br>
     * ご請求先名字
     * @return The value of the column 'BILL_LAST_NAME'. (NullAllowed)
     */
    public String getBillLastName() {
        return _billLastName;
    }

    /**
     * [set] BILL_LAST_NAME: {varchar(255)} <br>
     * ご請求先名字
     * @param billLastName The value of the column 'BILL_LAST_NAME'. (NullAllowed)
     */
    public void setBillLastName(String billLastName) {
        __modifiedProperties.add("billLastName");
        this._billLastName = billLastName;
    }

    /**
     * [get] BILL_ADDRESS1: {varchar(255)} <br>
     * ご請求先住所1
     * @return The value of the column 'BILL_ADDRESS1'. (NullAllowed)
     */
    public String getBillAddress1() {
        return _billAddress1;
    }

    /**
     * [set] BILL_ADDRESS1: {varchar(255)} <br>
     * ご請求先住所1
     * @param billAddress1 The value of the column 'BILL_ADDRESS1'. (NullAllowed)
     */
    public void setBillAddress1(String billAddress1) {
        __modifiedProperties.add("billAddress1");
        this._billAddress1 = billAddress1;
    }

    /**
     * [get] BILL_ADDRESS2: {varchar(255)} <br>
     * ご請求先住所2
     * @return The value of the column 'BILL_ADDRESS2'. (NullAllowed)
     */
    public String getBillAddress2() {
        return _billAddress2;
    }

    /**
     * [set] BILL_ADDRESS2: {varchar(255)} <br>
     * ご請求先住所2
     * @param billAddress2 The value of the column 'BILL_ADDRESS2'. (NullAllowed)
     */
    public void setBillAddress2(String billAddress2) {
        __modifiedProperties.add("billAddress2");
        this._billAddress2 = billAddress2;
    }

    /**
     * [get] BILL_CITY: {varchar(255)} <br>
     * ご請求先市区町村
     * @return The value of the column 'BILL_CITY'. (NullAllowed)
     */
    public String getBillCity() {
        return _billCity;
    }

    /**
     * [set] BILL_CITY: {varchar(255)} <br>
     * ご請求先市区町村
     * @param billCity The value of the column 'BILL_CITY'. (NullAllowed)
     */
    public void setBillCity(String billCity) {
        __modifiedProperties.add("billCity");
        this._billCity = billCity;
    }

    /**
     * [get] BILL_PREFECTURE: {varchar(255)} <br>
     * ご請求先都道府県
     * @return The value of the column 'BILL_PREFECTURE'. (NullAllowed)
     */
    public String getBillPrefecture() {
        return _billPrefecture;
    }

    /**
     * [set] BILL_PREFECTURE: {varchar(255)} <br>
     * ご請求先都道府県
     * @param billPrefecture The value of the column 'BILL_PREFECTURE'. (NullAllowed)
     */
    public void setBillPrefecture(String billPrefecture) {
        __modifiedProperties.add("billPrefecture");
        this._billPrefecture = billPrefecture;
    }

    /**
     * [get] BILL_ZIP_CODE: {varchar(30)} <br>
     * ご請求先郵便番号
     * @return The value of the column 'BILL_ZIP_CODE'. (NullAllowed)
     */
    public String getBillZipCode() {
        return _billZipCode;
    }

    /**
     * [set] BILL_ZIP_CODE: {varchar(30)} <br>
     * ご請求先郵便番号
     * @param billZipCode The value of the column 'BILL_ZIP_CODE'. (NullAllowed)
     */
    public void setBillZipCode(String billZipCode) {
        __modifiedProperties.add("billZipCode");
        this._billZipCode = billZipCode;
    }

    /**
     * [get] BILL_NAME_KANA: {varchar(255)} <br>
     * ご請求先氏名カナ
     * @return The value of the column 'BILL_NAME_KANA'. (NullAllowed)
     */
    public String getBillNameKana() {
        return _billNameKana;
    }

    /**
     * [set] BILL_NAME_KANA: {varchar(255)} <br>
     * ご請求先氏名カナ
     * @param billNameKana The value of the column 'BILL_NAME_KANA'. (NullAllowed)
     */
    public void setBillNameKana(String billNameKana) {
        __modifiedProperties.add("billNameKana");
        this._billNameKana = billNameKana;
    }

    /**
     * [get] BILL_FIRST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名前カナ
     * @return The value of the column 'BILL_FIRST_NAME_KANA'. (NullAllowed)
     */
    public String getBillFirstNameKana() {
        return _billFirstNameKana;
    }

    /**
     * [set] BILL_FIRST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名前カナ
     * @param billFirstNameKana The value of the column 'BILL_FIRST_NAME_KANA'. (NullAllowed)
     */
    public void setBillFirstNameKana(String billFirstNameKana) {
        __modifiedProperties.add("billFirstNameKana");
        this._billFirstNameKana = billFirstNameKana;
    }

    /**
     * [get] BILL_LAST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名字カナ
     * @return The value of the column 'BILL_LAST_NAME_KANA'. (NullAllowed)
     */
    public String getBillLastNameKana() {
        return _billLastNameKana;
    }

    /**
     * [set] BILL_LAST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名字カナ
     * @param billLastNameKana The value of the column 'BILL_LAST_NAME_KANA'. (NullAllowed)
     */
    public void setBillLastNameKana(String billLastNameKana) {
        __modifiedProperties.add("billLastNameKana");
        this._billLastNameKana = billLastNameKana;
    }

    /**
     * [get] BILL_ADDRESS1_KANA: {varchar(255)} <br>
     * ご請求先住所1カナ
     * @return The value of the column 'BILL_ADDRESS1_KANA'. (NullAllowed)
     */
    public String getBillAddress1Kana() {
        return _billAddress1Kana;
    }

    /**
     * [set] BILL_ADDRESS1_KANA: {varchar(255)} <br>
     * ご請求先住所1カナ
     * @param billAddress1Kana The value of the column 'BILL_ADDRESS1_KANA'. (NullAllowed)
     */
    public void setBillAddress1Kana(String billAddress1Kana) {
        __modifiedProperties.add("billAddress1Kana");
        this._billAddress1Kana = billAddress1Kana;
    }

    /**
     * [get] BILL_ADDRESS2_KANA: {varchar(255)} <br>
     * ご請求先住所2カナ
     * @return The value of the column 'BILL_ADDRESS2_KANA'. (NullAllowed)
     */
    public String getBillAddress2Kana() {
        return _billAddress2Kana;
    }

    /**
     * [set] BILL_ADDRESS2_KANA: {varchar(255)} <br>
     * ご請求先住所2カナ
     * @param billAddress2Kana The value of the column 'BILL_ADDRESS2_KANA'. (NullAllowed)
     */
    public void setBillAddress2Kana(String billAddress2Kana) {
        __modifiedProperties.add("billAddress2Kana");
        this._billAddress2Kana = billAddress2Kana;
    }

    /**
     * [get] BILL_CITY_KANA: {varchar(255)} <br>
     * ご請求先市区町村カナ
     * @return The value of the column 'BILL_CITY_KANA'. (NullAllowed)
     */
    public String getBillCityKana() {
        return _billCityKana;
    }

    /**
     * [set] BILL_CITY_KANA: {varchar(255)} <br>
     * ご請求先市区町村カナ
     * @param billCityKana The value of the column 'BILL_CITY_KANA'. (NullAllowed)
     */
    public void setBillCityKana(String billCityKana) {
        __modifiedProperties.add("billCityKana");
        this._billCityKana = billCityKana;
    }

    /**
     * [get] BILL_PREFECTURE_KANA: {varchar(255)} <br>
     * ご請求先都道府県カナ
     * @return The value of the column 'BILL_PREFECTURE_KANA'. (NullAllowed)
     */
    public String getBillPrefectureKana() {
        return _billPrefectureKana;
    }

    /**
     * [set] BILL_PREFECTURE_KANA: {varchar(255)} <br>
     * ご請求先都道府県カナ
     * @param billPrefectureKana The value of the column 'BILL_PREFECTURE_KANA'. (NullAllowed)
     */
    public void setBillPrefectureKana(String billPrefectureKana) {
        __modifiedProperties.add("billPrefectureKana");
        this._billPrefectureKana = billPrefectureKana;
    }

    /**
     * [get] BILL_SECTION1_FIELD: {varchar(60)} <br>
     * ご請求先所属1フィールド名
     * @return The value of the column 'BILL_SECTION1_FIELD'. (NullAllowed)
     */
    public String getBillSection1Field() {
        return _billSection1Field;
    }

    /**
     * [set] BILL_SECTION1_FIELD: {varchar(60)} <br>
     * ご請求先所属1フィールド名
     * @param billSection1Field The value of the column 'BILL_SECTION1_FIELD'. (NullAllowed)
     */
    public void setBillSection1Field(String billSection1Field) {
        __modifiedProperties.add("billSection1Field");
        this._billSection1Field = billSection1Field;
    }

    /**
     * [get] BILL_SECTION1_VALUE: {varchar(60)} <br>
     * ご請求先所属1フィールド入力内容
     * @return The value of the column 'BILL_SECTION1_VALUE'. (NullAllowed)
     */
    public String getBillSection1Value() {
        return _billSection1Value;
    }

    /**
     * [set] BILL_SECTION1_VALUE: {varchar(60)} <br>
     * ご請求先所属1フィールド入力内容
     * @param billSection1Value The value of the column 'BILL_SECTION1_VALUE'. (NullAllowed)
     */
    public void setBillSection1Value(String billSection1Value) {
        __modifiedProperties.add("billSection1Value");
        this._billSection1Value = billSection1Value;
    }

    /**
     * [get] BILL_SECTION2_FIELD: {varchar(60)} <br>
     * ご請求先所属2フィールド名
     * @return The value of the column 'BILL_SECTION2_FIELD'. (NullAllowed)
     */
    public String getBillSection2Field() {
        return _billSection2Field;
    }

    /**
     * [set] BILL_SECTION2_FIELD: {varchar(60)} <br>
     * ご請求先所属2フィールド名
     * @param billSection2Field The value of the column 'BILL_SECTION2_FIELD'. (NullAllowed)
     */
    public void setBillSection2Field(String billSection2Field) {
        __modifiedProperties.add("billSection2Field");
        this._billSection2Field = billSection2Field;
    }

    /**
     * [get] BILL_SECTION2_VALUE: {varchar(60)} <br>
     * ご請求先所属2フィールド入力内容
     * @return The value of the column 'BILL_SECTION2_VALUE'. (NullAllowed)
     */
    public String getBillSection2Value() {
        return _billSection2Value;
    }

    /**
     * [set] BILL_SECTION2_VALUE: {varchar(60)} <br>
     * ご請求先所属2フィールド入力内容
     * @param billSection2Value The value of the column 'BILL_SECTION2_VALUE'. (NullAllowed)
     */
    public void setBillSection2Value(String billSection2Value) {
        __modifiedProperties.add("billSection2Value");
        this._billSection2Value = billSection2Value;
    }

    /**
     * [get] BILL_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号
     * @return The value of the column 'BILL_PHONE_NUMBER'. (NullAllowed)
     */
    public String getBillPhoneNumber() {
        return _billPhoneNumber;
    }

    /**
     * [set] BILL_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号
     * @param billPhoneNumber The value of the column 'BILL_PHONE_NUMBER'. (NullAllowed)
     */
    public void setBillPhoneNumber(String billPhoneNumber) {
        __modifiedProperties.add("billPhoneNumber");
        this._billPhoneNumber = billPhoneNumber;
    }

    /**
     * [get] BILL_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号(緊急)
     * @return The value of the column 'BILL_EMG_PHONE_NUMBER'. (NullAllowed)
     */
    public String getBillEmgPhoneNumber() {
        return _billEmgPhoneNumber;
    }

    /**
     * [set] BILL_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号(緊急)
     * @param billEmgPhoneNumber The value of the column 'BILL_EMG_PHONE_NUMBER'. (NullAllowed)
     */
    public void setBillEmgPhoneNumber(String billEmgPhoneNumber) {
        __modifiedProperties.add("billEmgPhoneNumber");
        this._billEmgPhoneNumber = billEmgPhoneNumber;
    }

    /**
     * [get] BILL_MAIL_ADDRESS: {varchar(255)} <br>
     * ご請求先メールアドレス
     * @return The value of the column 'BILL_MAIL_ADDRESS'. (NullAllowed)
     */
    public String getBillMailAddress() {
        return _billMailAddress;
    }

    /**
     * [set] BILL_MAIL_ADDRESS: {varchar(255)} <br>
     * ご請求先メールアドレス
     * @param billMailAddress The value of the column 'BILL_MAIL_ADDRESS'. (NullAllowed)
     */
    public void setBillMailAddress(String billMailAddress) {
        __modifiedProperties.add("billMailAddress");
        this._billMailAddress = billMailAddress;
    }

    /**
     * [get] PAY_MATHOD: {varchar(60)} <br>
     * お支払方法
     * @return The value of the column 'PAY_MATHOD'. (NullAllowed)
     */
    public String getPayMathod() {
        return _payMathod;
    }

    /**
     * [set] PAY_MATHOD: {varchar(60)} <br>
     * お支払方法
     * @param payMathod The value of the column 'PAY_MATHOD'. (NullAllowed)
     */
    public void setPayMathod(String payMathod) {
        __modifiedProperties.add("payMathod");
        this._payMathod = payMathod;
    }

    /**
     * [get] PAY_MATHOD_NAME: {varchar(60)} <br>
     * お支払方法名称
     * @return The value of the column 'PAY_MATHOD_NAME'. (NullAllowed)
     */
    public String getPayMathodName() {
        return _payMathodName;
    }

    /**
     * [set] PAY_MATHOD_NAME: {varchar(60)} <br>
     * お支払方法名称
     * @param payMathodName The value of the column 'PAY_MATHOD_NAME'. (NullAllowed)
     */
    public void setPayMathodName(String payMathodName) {
        __modifiedProperties.add("payMathodName");
        this._payMathodName = payMathodName;
    }

    /**
     * [get] PAY_KIND: {varchar(60)} <br>
     * お支払方法種別
     * @return The value of the column 'PAY_KIND'. (NullAllowed)
     */
    public String getPayKind() {
        return _payKind;
    }

    /**
     * [set] PAY_KIND: {varchar(60)} <br>
     * お支払方法種別
     * @param payKind The value of the column 'PAY_KIND'. (NullAllowed)
     */
    public void setPayKind(String payKind) {
        __modifiedProperties.add("payKind");
        this._payKind = payKind;
    }

    /**
     * [get] CARD_PAY_COUNT: {bigint(19)} <br>
     * クレジットカードお支払回数
     * @return The value of the column 'CARD_PAY_COUNT'. (NullAllowed)
     */
    public Long getCardPayCount() {
        return _cardPayCount;
    }

    /**
     * [set] CARD_PAY_COUNT: {bigint(19)} <br>
     * クレジットカードお支払回数
     * @param cardPayCount The value of the column 'CARD_PAY_COUNT'. (NullAllowed)
     */
    public void setCardPayCount(Long cardPayCount) {
        __modifiedProperties.add("cardPayCount");
        this._cardPayCount = cardPayCount;
    }

    /**
     * [get] CARD_PAY_TYPE: {varchar(60)} <br>
     * クレジットカードお支払区分
     * @return The value of the column 'CARD_PAY_TYPE'. (NullAllowed)
     */
    public String getCardPayType() {
        return _cardPayType;
    }

    /**
     * [set] CARD_PAY_TYPE: {varchar(60)} <br>
     * クレジットカードお支払区分
     * @param cardPayType The value of the column 'CARD_PAY_TYPE'. (NullAllowed)
     */
    public void setCardPayType(String cardPayType) {
        __modifiedProperties.add("cardPayType");
        this._cardPayType = cardPayType;
    }

    /**
     * [get] SETTLE_STATUS: {varchar(60)} <br>
     * 決済ステータス
     * @return The value of the column 'SETTLE_STATUS'. (NullAllowed)
     */
    public String getSettleStatus() {
        return _settleStatus;
    }

    /**
     * [set] SETTLE_STATUS: {varchar(60)} <br>
     * 決済ステータス
     * @param settleStatus The value of the column 'SETTLE_STATUS'. (NullAllowed)
     */
    public void setSettleStatus(String settleStatus) {
        __modifiedProperties.add("settleStatus");
        this._settleStatus = settleStatus;
    }

    /**
     * [get] SETTLE_ID: {varchar(30)} <br>
     * 決済ID
     * @return The value of the column 'SETTLE_ID'. (NullAllowed)
     */
    public String getSettleId() {
        return _settleId;
    }

    /**
     * [set] SETTLE_ID: {varchar(30)} <br>
     * 決済ID
     * @param settleId The value of the column 'SETTLE_ID'. (NullAllowed)
     */
    public void setSettleId(String settleId) {
        __modifiedProperties.add("settleId");
        this._settleId = settleId;
    }

    /**
     * [get] PAY_NO: {varchar(30)} <br>
     * 支払番号
     * @return The value of the column 'PAY_NO'. (NullAllowed)
     */
    public String getPayNo() {
        return _payNo;
    }

    /**
     * [set] PAY_NO: {varchar(30)} <br>
     * 支払番号
     * @param payNo The value of the column 'PAY_NO'. (NullAllowed)
     */
    public void setPayNo(String payNo) {
        __modifiedProperties.add("payNo");
        this._payNo = payNo;
    }

    /**
     * [get] PAY_NO_ISSUE_DATE: {varchar(30)} <br>
     * 支払番号発行日時
     * @return The value of the column 'PAY_NO_ISSUE_DATE'. (NullAllowed)
     */
    public String getPayNoIssueDate() {
        return _payNoIssueDate;
    }

    /**
     * [set] PAY_NO_ISSUE_DATE: {varchar(30)} <br>
     * 支払番号発行日時
     * @param payNoIssueDate The value of the column 'PAY_NO_ISSUE_DATE'. (NullAllowed)
     */
    public void setPayNoIssueDate(String payNoIssueDate) {
        __modifiedProperties.add("payNoIssueDate");
        this._payNoIssueDate = payNoIssueDate;
    }

    /**
     * [get] PAY_DATE: {varchar(30)} <br>
     * 入金日
     * @return The value of the column 'PAY_DATE'. (NullAllowed)
     */
    public String getPayDate() {
        return _payDate;
    }

    /**
     * [set] PAY_DATE: {varchar(30)} <br>
     * 入金日
     * @param payDate The value of the column 'PAY_DATE'. (NullAllowed)
     */
    public void setPayDate(String payDate) {
        __modifiedProperties.add("payDate");
        this._payDate = payDate;
    }

    /**
     * [get] BUYER_COMMENTS: {varchar(60)} <br>
     * ご要望
     * @return The value of the column 'BUYER_COMMENTS'. (NullAllowed)
     */
    public String getBuyerComments() {
        return _buyerComments;
    }

    /**
     * [set] BUYER_COMMENTS: {varchar(60)} <br>
     * ご要望
     * @param buyerComments The value of the column 'BUYER_COMMENTS'. (NullAllowed)
     */
    public void setBuyerComments(String buyerComments) {
        __modifiedProperties.add("buyerComments");
        this._buyerComments = buyerComments;
    }

    /**
     * [get] AGE_CONFIRM: {varchar(60)} <br>
     * 年齢確認
     * @return The value of the column 'AGE_CONFIRM'. (NullAllowed)
     */
    public String getAgeConfirm() {
        return _ageConfirm;
    }

    /**
     * [set] AGE_CONFIRM: {varchar(60)} <br>
     * 年齢確認
     * @param ageConfirm The value of the column 'AGE_CONFIRM'. (NullAllowed)
     */
    public void setAgeConfirm(String ageConfirm) {
        __modifiedProperties.add("ageConfirm");
        this._ageConfirm = ageConfirm;
    }

    /**
     * [get] QUANTITY_DETAIL: {bigint(19)} <br>
     * 注文商品の数量
     * @return The value of the column 'QUANTITY_DETAIL'. (NullAllowed)
     */
    public Long getQuantityDetail() {
        return _quantityDetail;
    }

    /**
     * [set] QUANTITY_DETAIL: {bigint(19)} <br>
     * 注文商品の数量
     * @param quantityDetail The value of the column 'QUANTITY_DETAIL'. (NullAllowed)
     */
    public void setQuantityDetail(Long quantityDetail) {
        __modifiedProperties.add("quantityDetail");
        this._quantityDetail = quantityDetail;
    }

    /**
     * [get] SHIP_CHARGE: {bigint(19)} <br>
     * 送料
     * @return The value of the column 'SHIP_CHARGE'. (NullAllowed)
     */
    public Long getShipCharge() {
        return _shipCharge;
    }

    /**
     * [set] SHIP_CHARGE: {bigint(19)} <br>
     * 送料
     * @param shipCharge The value of the column 'SHIP_CHARGE'. (NullAllowed)
     */
    public void setShipCharge(Long shipCharge) {
        __modifiedProperties.add("shipCharge");
        this._shipCharge = shipCharge;
    }

    /**
     * [get] PAY_CHARGE: {bigint(19)} <br>
     * 手数料
     * @return The value of the column 'PAY_CHARGE'. (NullAllowed)
     */
    public Long getPayCharge() {
        return _payCharge;
    }

    /**
     * [set] PAY_CHARGE: {bigint(19)} <br>
     * 手数料
     * @param payCharge The value of the column 'PAY_CHARGE'. (NullAllowed)
     */
    public void setPayCharge(Long payCharge) {
        __modifiedProperties.add("payCharge");
        this._payCharge = payCharge;
    }

    /**
     * [get] GIFT_WRAP_CHARGE: {bigint(19)} <br>
     * ギフト包装料
     * @return The value of the column 'GIFT_WRAP_CHARGE'. (NullAllowed)
     */
    public Long getGiftWrapCharge() {
        return _giftWrapCharge;
    }

    /**
     * [set] GIFT_WRAP_CHARGE: {bigint(19)} <br>
     * ギフト包装料
     * @param giftWrapCharge The value of the column 'GIFT_WRAP_CHARGE'. (NullAllowed)
     */
    public void setGiftWrapCharge(Long giftWrapCharge) {
        __modifiedProperties.add("giftWrapCharge");
        this._giftWrapCharge = giftWrapCharge;
    }

    /**
     * [get] DISCOUNT: {bigint(19)} <br>
     * 値引き
     * @return The value of the column 'DISCOUNT'. (NullAllowed)
     */
    public Long getDiscount() {
        return _discount;
    }

    /**
     * [set] DISCOUNT: {bigint(19)} <br>
     * 値引き
     * @param discount The value of the column 'DISCOUNT'. (NullAllowed)
     */
    public void setDiscount(Long discount) {
        __modifiedProperties.add("discount");
        this._discount = discount;
    }

    /**
     * [get] ADJUSTMENTS: {bigint(19)} <br>
     * 調整額
     * @return The value of the column 'ADJUSTMENTS'. (NullAllowed)
     */
    public Long getAdjustments() {
        return _adjustments;
    }

    /**
     * [set] ADJUSTMENTS: {bigint(19)} <br>
     * 調整額
     * @param adjustments The value of the column 'ADJUSTMENTS'. (NullAllowed)
     */
    public void setAdjustments(Long adjustments) {
        __modifiedProperties.add("adjustments");
        this._adjustments = adjustments;
    }

    /**
     * [get] USE_POINT: {bigint(19)} <br>
     * 利用ポイント合計
     * @return The value of the column 'USE_POINT'. (NullAllowed)
     */
    public Long getUsePoint() {
        return _usePoint;
    }

    /**
     * [set] USE_POINT: {bigint(19)} <br>
     * 利用ポイント合計
     * @param usePoint The value of the column 'USE_POINT'. (NullAllowed)
     */
    public void setUsePoint(Long usePoint) {
        __modifiedProperties.add("usePoint");
        this._usePoint = usePoint;
    }

    /**
     * [get] GET_POINT: {bigint(19)} <br>
     * 付与ポイント合計
     * @return The value of the column 'GET_POINT'. (NullAllowed)
     */
    public Long getGetPoint() {
        return _getPoint;
    }

    /**
     * [set] GET_POINT: {bigint(19)} <br>
     * 付与ポイント合計
     * @param getPoint The value of the column 'GET_POINT'. (NullAllowed)
     */
    public void setGetPoint(Long getPoint) {
        __modifiedProperties.add("getPoint");
        this._getPoint = getPoint;
    }

    /**
     * [get] TOTAL: {bigint(19)} <br>
     * 請求金額合計
     * @return The value of the column 'TOTAL'. (NullAllowed)
     */
    public Long getTotal() {
        return _total;
    }

    /**
     * [set] TOTAL: {bigint(19)} <br>
     * 請求金額合計
     * @param total The value of the column 'TOTAL'. (NullAllowed)
     */
    public void setTotal(Long total) {
        __modifiedProperties.add("total");
        this._total = total;
    }

    /**
     * [get] TOTAL_PRICE: {bigint(19)} <br>
     * 注文金額合計
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public Long getTotalPrice() {
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {bigint(19)} <br>
     * 注文金額合計
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public void setTotalPrice(Long totalPrice) {
        __modifiedProperties.add("totalPrice");
        this._totalPrice = totalPrice;
    }

    /**
     * [get] SHIPPING_C_DISCOUNT: {bigint(19)} <br>
     * 送料無料クーポン値引額
     * @return The value of the column 'SHIPPING_C_DISCOUNT'. (NullAllowed)
     */
    public Long getShippingCDiscount() {
        return _shippingCDiscount;
    }

    /**
     * [set] SHIPPING_C_DISCOUNT: {bigint(19)} <br>
     * 送料無料クーポン値引額
     * @param shippingCDiscount The value of the column 'SHIPPING_C_DISCOUNT'. (NullAllowed)
     */
    public void setShippingCDiscount(Long shippingCDiscount) {
        __modifiedProperties.add("shippingCDiscount");
        this._shippingCDiscount = shippingCDiscount;
    }

    /**
     * [get] ITEM_C_DISCOUNT: {bigint(19)} <br>
     * 定額・定率クーポン値引額
     * @return The value of the column 'ITEM_C_DISCOUNT'. (NullAllowed)
     */
    public Long getItemCDiscount() {
        return _itemCDiscount;
    }

    /**
     * [set] ITEM_C_DISCOUNT: {bigint(19)} <br>
     * 定額・定率クーポン値引額
     * @param itemCDiscount The value of the column 'ITEM_C_DISCOUNT'. (NullAllowed)
     */
    public void setItemCDiscount(Long itemCDiscount) {
        __modifiedProperties.add("itemCDiscount");
        this._itemCDiscount = itemCDiscount;
    }

    /**
     * [get] TOTAL_MALL_C_DISCOUNT: {bigint(19)} <br>
     * モールクーポン値引額
     * @return The value of the column 'TOTAL_MALL_C_DISCOUNT'. (NullAllowed)
     */
    public Long getTotalMallCDiscount() {
        return _totalMallCDiscount;
    }

    /**
     * [set] TOTAL_MALL_C_DISCOUNT: {bigint(19)} <br>
     * モールクーポン値引額
     * @param totalMallCDiscount The value of the column 'TOTAL_MALL_C_DISCOUNT'. (NullAllowed)
     */
    public void setTotalMallCDiscount(Long totalMallCDiscount) {
        __modifiedProperties.add("totalMallCDiscount");
        this._totalMallCDiscount = totalMallCDiscount;
    }

    /**
     * [get] GET_POINT_CRG_TO_STORE: {bigint(19)} <br>
     * ストア負担ポイント合計
     * @return The value of the column 'GET_POINT_CRG_TO_STORE'. (NullAllowed)
     */
    public Long getGetPointCrgToStore() {
        return _getPointCrgToStore;
    }

    /**
     * [set] GET_POINT_CRG_TO_STORE: {bigint(19)} <br>
     * ストア負担ポイント合計
     * @param getPointCrgToStore The value of the column 'GET_POINT_CRG_TO_STORE'. (NullAllowed)
     */
    public void setGetPointCrgToStore(Long getPointCrgToStore) {
        __modifiedProperties.add("getPointCrgToStore");
        this._getPointCrgToStore = getPointCrgToStore;
    }

    /**
     * [get] LINE_ID: {varchar(30)} <br>
     * Line ID
     * @return The value of the column 'LINE_ID'. (NullAllowed)
     */
    public String getLineId() {
        return _lineId;
    }

    /**
     * [set] LINE_ID: {varchar(30)} <br>
     * Line ID
     * @param lineId The value of the column 'LINE_ID'. (NullAllowed)
     */
    public void setLineId(String lineId) {
        __modifiedProperties.add("lineId");
        this._lineId = lineId;
    }

    /**
     * [get] QUANTITY: {bigint(19)} <br>
     * 数量
     * @return The value of the column 'QUANTITY'. (NullAllowed)
     */
    public Long getQuantity() {
        return _quantity;
    }

    /**
     * [set] QUANTITY: {bigint(19)} <br>
     * 数量
     * @param quantity The value of the column 'QUANTITY'. (NullAllowed)
     */
    public void setQuantity(Long quantity) {
        __modifiedProperties.add("quantity");
        this._quantity = quantity;
    }

    /**
     * [get] ITEM_ID: {varchar(30)} <br>
     * 商品CD
     * @return The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public String getItemId() {
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {varchar(30)} <br>
     * 商品CD
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public void setItemId(String itemId) {
        __modifiedProperties.add("itemId");
        this._itemId = itemId;
    }

    /**
     * [get] SUB_CODE: {varchar(30)} <br>
     * 商品サブCD
     * @return The value of the column 'SUB_CODE'. (NullAllowed)
     */
    public String getSubCode() {
        return _subCode;
    }

    /**
     * [set] SUB_CODE: {varchar(30)} <br>
     * 商品サブCD
     * @param subCode The value of the column 'SUB_CODE'. (NullAllowed)
     */
    public void setSubCode(String subCode) {
        __modifiedProperties.add("subCode");
        this._subCode = subCode;
    }

    /**
     * [get] TITLE: {varchar(255)} <br>
     * 商品名
     * @return The value of the column 'TITLE'. (NullAllowed)
     */
    public String getTitle() {
        return _title;
    }

    /**
     * [set] TITLE: {varchar(255)} <br>
     * 商品名
     * @param title The value of the column 'TITLE'. (NullAllowed)
     */
    public void setTitle(String title) {
        __modifiedProperties.add("title");
        this._title = title;
    }

    /**
     * [get] ITEM_OPTION_NAME: {varchar(60)} <br>
     * 商品オプション名
     * @return The value of the column 'ITEM_OPTION_NAME'. (NullAllowed)
     */
    public String getItemOptionName() {
        return _itemOptionName;
    }

    /**
     * [set] ITEM_OPTION_NAME: {varchar(60)} <br>
     * 商品オプション名
     * @param itemOptionName The value of the column 'ITEM_OPTION_NAME'. (NullAllowed)
     */
    public void setItemOptionName(String itemOptionName) {
        __modifiedProperties.add("itemOptionName");
        this._itemOptionName = itemOptionName;
    }

    /**
     * [get] ITEM_OPTION_VALUE: {varchar(60)} <br>
     * 商品オプション内容
     * @return The value of the column 'ITEM_OPTION_VALUE'. (NullAllowed)
     */
    public String getItemOptionValue() {
        return _itemOptionValue;
    }

    /**
     * [set] ITEM_OPTION_VALUE: {varchar(60)} <br>
     * 商品オプション内容
     * @param itemOptionValue The value of the column 'ITEM_OPTION_VALUE'. (NullAllowed)
     */
    public void setItemOptionValue(String itemOptionValue) {
        __modifiedProperties.add("itemOptionValue");
        this._itemOptionValue = itemOptionValue;
    }

    /**
     * [get] SUB_CODE_OPTION: {varchar(60)} <br>
     * 商品サブCDオプション内容文字列
     * @return The value of the column 'SUB_CODE_OPTION'. (NullAllowed)
     */
    public String getSubCodeOption() {
        return _subCodeOption;
    }

    /**
     * [set] SUB_CODE_OPTION: {varchar(60)} <br>
     * 商品サブCDオプション内容文字列
     * @param subCodeOption The value of the column 'SUB_CODE_OPTION'. (NullAllowed)
     */
    public void setSubCodeOption(String subCodeOption) {
        __modifiedProperties.add("subCodeOption");
        this._subCodeOption = subCodeOption;
    }

    /**
     * [get] INSCRIPTION_NAME: {varchar(60)} <br>
     * インスクリプション番号
     * @return The value of the column 'INSCRIPTION_NAME'. (NullAllowed)
     */
    public String getInscriptionName() {
        return _inscriptionName;
    }

    /**
     * [set] INSCRIPTION_NAME: {varchar(60)} <br>
     * インスクリプション番号
     * @param inscriptionName The value of the column 'INSCRIPTION_NAME'. (NullAllowed)
     */
    public void setInscriptionName(String inscriptionName) {
        __modifiedProperties.add("inscriptionName");
        this._inscriptionName = inscriptionName;
    }

    /**
     * [get] INSCRIPTION_VALUE: {varchar(60)} <br>
     * インスクリプション内容
     * @return The value of the column 'INSCRIPTION_VALUE'. (NullAllowed)
     */
    public String getInscriptionValue() {
        return _inscriptionValue;
    }

    /**
     * [set] INSCRIPTION_VALUE: {varchar(60)} <br>
     * インスクリプション内容
     * @param inscriptionValue The value of the column 'INSCRIPTION_VALUE'. (NullAllowed)
     */
    public void setInscriptionValue(String inscriptionValue) {
        __modifiedProperties.add("inscriptionValue");
        this._inscriptionValue = inscriptionValue;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 商品販売価格
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public Long getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 商品販売価格
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(Long unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] UNIT_GET_POINT: {bigint(19)} <br>
     * 注文付与ポイント
     * @return The value of the column 'UNIT_GET_POINT'. (NullAllowed)
     */
    public Long getUnitGetPoint() {
        return _unitGetPoint;
    }

    /**
     * [set] UNIT_GET_POINT: {bigint(19)} <br>
     * 注文付与ポイント
     * @param unitGetPoint The value of the column 'UNIT_GET_POINT'. (NullAllowed)
     */
    public void setUnitGetPoint(Long unitGetPoint) {
        __modifiedProperties.add("unitGetPoint");
        this._unitGetPoint = unitGetPoint;
    }

    /**
     * [get] LINE_SUB_TOTAL: {bigint(19)} <br>
     * 商品毎の小計
     * @return The value of the column 'LINE_SUB_TOTAL'. (NullAllowed)
     */
    public Long getLineSubTotal() {
        return _lineSubTotal;
    }

    /**
     * [set] LINE_SUB_TOTAL: {bigint(19)} <br>
     * 商品毎の小計
     * @param lineSubTotal The value of the column 'LINE_SUB_TOTAL'. (NullAllowed)
     */
    public void setLineSubTotal(Long lineSubTotal) {
        __modifiedProperties.add("lineSubTotal");
        this._lineSubTotal = lineSubTotal;
    }

    /**
     * [get] LINE_GET_POINT: {bigint(19)} <br>
     * 商品毎の付与ポイント小計
     * @return The value of the column 'LINE_GET_POINT'. (NullAllowed)
     */
    public Long getLineGetPoint() {
        return _lineGetPoint;
    }

    /**
     * [set] LINE_GET_POINT: {bigint(19)} <br>
     * 商品毎の付与ポイント小計
     * @param lineGetPoint The value of the column 'LINE_GET_POINT'. (NullAllowed)
     */
    public void setLineGetPoint(Long lineGetPoint) {
        __modifiedProperties.add("lineGetPoint");
        this._lineGetPoint = lineGetPoint;
    }

    /**
     * [get] POINT_FSP_CODE: {varchar(30)} <br>
     * 商品付与ポイントCD
     * @return The value of the column 'POINT_FSP_CODE'. (NullAllowed)
     */
    public String getPointFspCode() {
        return _pointFspCode;
    }

    /**
     * [set] POINT_FSP_CODE: {varchar(30)} <br>
     * 商品付与ポイントCD
     * @param pointFspCode The value of the column 'POINT_FSP_CODE'. (NullAllowed)
     */
    public void setPointFspCode(String pointFspCode) {
        __modifiedProperties.add("pointFspCode");
        this._pointFspCode = pointFspCode;
    }

    /**
     * [get] ITEM_CONDITION: {varchar(30)} <br>
     * 商品状態
     * @return The value of the column 'ITEM_CONDITION'. (NullAllowed)
     */
    public String getItemCondition() {
        return _itemCondition;
    }

    /**
     * [set] ITEM_CONDITION: {varchar(30)} <br>
     * 商品状態
     * @param itemCondition The value of the column 'ITEM_CONDITION'. (NullAllowed)
     */
    public void setItemCondition(String itemCondition) {
        __modifiedProperties.add("itemCondition");
        this._itemCondition = itemCondition;
    }

    /**
     * [get] COUPON_ID: {varchar(30)} <br>
     * クーポンID
     * @return The value of the column 'COUPON_ID'. (NullAllowed)
     */
    public String getCouponId() {
        return _couponId;
    }

    /**
     * [set] COUPON_ID: {varchar(30)} <br>
     * クーポンID
     * @param couponId The value of the column 'COUPON_ID'. (NullAllowed)
     */
    public void setCouponId(String couponId) {
        __modifiedProperties.add("couponId");
        this._couponId = couponId;
    }

    /**
     * [get] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用値引額
     * @return The value of the column 'COUPON_DISCOUNT'. (NullAllowed)
     */
    public Long getCouponDiscount() {
        return _couponDiscount;
    }

    /**
     * [set] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用値引額
     * @param couponDiscount The value of the column 'COUPON_DISCOUNT'. (NullAllowed)
     */
    public void setCouponDiscount(Long couponDiscount) {
        __modifiedProperties.add("couponDiscount");
        this._couponDiscount = couponDiscount;
    }

    /**
     * [get] ORIGINAL_PRICE: {bigint(19)} <br>
     * 値引き前単価
     * @return The value of the column 'ORIGINAL_PRICE'. (NullAllowed)
     */
    public Long getOriginalPrice() {
        return _originalPrice;
    }

    /**
     * [set] ORIGINAL_PRICE: {bigint(19)} <br>
     * 値引き前単価
     * @param originalPrice The value of the column 'ORIGINAL_PRICE'. (NullAllowed)
     */
    public void setOriginalPrice(Long originalPrice) {
        __modifiedProperties.add("originalPrice");
        this._originalPrice = originalPrice;
    }

    /**
     * [get] IS_GET_POINT_FIX: {varchar(30)} <br>
     * ポイント確定状態
     * @return The value of the column 'IS_GET_POINT_FIX'. (NullAllowed)
     */
    public String getIsGetPointFix() {
        return _isGetPointFix;
    }

    /**
     * [set] IS_GET_POINT_FIX: {varchar(30)} <br>
     * ポイント確定状態
     * @param isGetPointFix The value of the column 'IS_GET_POINT_FIX'. (NullAllowed)
     */
    public void setIsGetPointFix(String isGetPointFix) {
        __modifiedProperties.add("isGetPointFix");
        this._isGetPointFix = isGetPointFix;
    }

    /**
     * [get] GET_POINT_FIX_DATE: {varchar(30)} <br>
     * ポイント確定予定日
     * @return The value of the column 'GET_POINT_FIX_DATE'. (NullAllowed)
     */
    public String getGetPointFixDate() {
        return _getPointFixDate;
    }

    /**
     * [set] GET_POINT_FIX_DATE: {varchar(30)} <br>
     * ポイント確定予定日
     * @param getPointFixDate The value of the column 'GET_POINT_FIX_DATE'. (NullAllowed)
     */
    public void setGetPointFixDate(String getPointFixDate) {
        __modifiedProperties.add("getPointFixDate");
        this._getPointFixDate = getPointFixDate;
    }

    /**
     * [get] RELEASE_DATE: {varchar(30)} <br>
     * 発売日
     * @return The value of the column 'RELEASE_DATE'. (NullAllowed)
     */
    public String getReleaseDate() {
        return _releaseDate;
    }

    /**
     * [set] RELEASE_DATE: {varchar(30)} <br>
     * 発売日
     * @param releaseDate The value of the column 'RELEASE_DATE'. (NullAllowed)
     */
    public void setReleaseDate(String releaseDate) {
        __modifiedProperties.add("releaseDate");
        this._releaseDate = releaseDate;
    }

    /**
     * [get] GET_POINT_TYPE: {varchar(30)} <br>
     * 付与ポイント種別
     * @return The value of the column 'GET_POINT_TYPE'. (NullAllowed)
     */
    public String getGetPointType() {
        return _getPointType;
    }

    /**
     * [set] GET_POINT_TYPE: {varchar(30)} <br>
     * 付与ポイント種別
     * @param getPointType The value of the column 'GET_POINT_TYPE'. (NullAllowed)
     */
    public void setGetPointType(String getPointType) {
        __modifiedProperties.add("getPointType");
        this._getPointType = getPointType;
    }

    /**
     * [get] JAN: {varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN'. (NullAllowed)
     */
    public String getJan() {
        return _jan;
    }

    /**
     * [set] JAN: {varchar(30)} <br>
     * JANCD
     * @param jan The value of the column 'JAN'. (NullAllowed)
     */
    public void setJan(String jan) {
        __modifiedProperties.add("jan");
        this._jan = jan;
    }

    /**
     * [get] PRODUCT_ID: {varchar(30)} <br>
     * 製品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public String getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {varchar(30)} <br>
     * 製品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(String productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] POINT_CHARGED_TO_STORE: {bigint(19)} <br>
     * 商品毎ストア負担ポイント小計
     * @return The value of the column 'POINT_CHARGED_TO_STORE'. (NullAllowed)
     */
    public Long getPointChargedToStore() {
        return _pointChargedToStore;
    }

    /**
     * [set] POINT_CHARGED_TO_STORE: {bigint(19)} <br>
     * 商品毎ストア負担ポイント小計
     * @param pointChargedToStore The value of the column 'POINT_CHARGED_TO_STORE'. (NullAllowed)
     */
    public void setPointChargedToStore(Long pointChargedToStore) {
        __modifiedProperties.add("pointChargedToStore");
        this._pointChargedToStore = pointChargedToStore;
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
