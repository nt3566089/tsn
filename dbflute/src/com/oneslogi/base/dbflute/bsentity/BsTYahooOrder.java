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
 * The entity of T_YAHOO_ORDER as TABLE. <br>
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
 * Long yahooOrderId = entity.getYahooOrderId();
 * String orderId = entity.getOrderId();
 * String parentOrderId = entity.getParentOrderId();
 * String deviceType = entity.getDeviceType();
 * String isAffiliate = entity.getIsAffiliate();
 * String fspLicenseCode = entity.getFspLicenseCode();
 * String fspLicenseName = entity.getFspLicenseName();
 * String orderTime = entity.getOrderTime();
 * String orderTimeUnixEpoch = entity.getOrderTimeUnixEpoch();
 * String usePointType = entity.getUsePointType();
 * String orderStatus = entity.getOrderStatus();
 * String storeStatus = entity.getStoreStatus();
 * String referer = entity.getReferer();
 * String entryPoint = entity.getEntryPoint();
 * String clink = entity.getClink();
 * String suspectMessage = entity.getSuspectMessage();
 * String isItemCoupon = entity.getIsItemCoupon();
 * String isShippingCoupon = entity.getIsShippingCoupon();
 * String shipName = entity.getShipName();
 * String shipFirstName = entity.getShipFirstName();
 * String shipLastName = entity.getShipLastName();
 * String shipAddress1 = entity.getShipAddress1();
 * String shipAddress2 = entity.getShipAddress2();
 * String shipCity = entity.getShipCity();
 * String shipPrefecture = entity.getShipPrefecture();
 * String shipZipCode = entity.getShipZipCode();
 * String shipNameKana = entity.getShipNameKana();
 * String shipFirstNameKana = entity.getShipFirstNameKana();
 * String shipLastNameKana = entity.getShipLastNameKana();
 * String shipAddress1Kana = entity.getShipAddress1Kana();
 * String shipAddress2Kana = entity.getShipAddress2Kana();
 * String shipCityKana = entity.getShipCityKana();
 * String shipPrefectureKana = entity.getShipPrefectureKana();
 * String shipSection1Field = entity.getShipSection1Field();
 * String shipSection1Value = entity.getShipSection1Value();
 * String shipSection2Field = entity.getShipSection2Field();
 * String shipSection2Value = entity.getShipSection2Value();
 * String shipPhoneNumber = entity.getShipPhoneNumber();
 * String shipEmgPhoneNumber = entity.getShipEmgPhoneNumber();
 * String shipMethod = entity.getShipMethod();
 * String shipMethodName = entity.getShipMethodName();
 * String shipRequestDate = entity.getShipRequestDate();
 * String shipRequestTime = entity.getShipRequestTime();
 * String shipNotes = entity.getShipNotes();
 * String arriveType = entity.getArriveType();
 * String shipInvoiceNumber1 = entity.getShipInvoiceNumber1();
 * String shipInvoiceNumber2 = entity.getShipInvoiceNumber2();
 * String shipUrl = entity.getShipUrl();
 * String shipDate = entity.getShipDate();
 * String giftWrapType = entity.getGiftWrapType();
 * String giftWrapPaperType = entity.getGiftWrapPaperType();
 * String giftWrapName = entity.getGiftWrapName();
 * String needBillSlip = entity.getNeedBillSlip();
 * String needDetailedSlip = entity.getNeedDetailedSlip();
 * String needReceipt = entity.getNeedReceipt();
 * String option1Field = entity.getOption1Field();
 * String option1Value = entity.getOption1Value();
 * String option2Field = entity.getOption2Field();
 * String option2Value = entity.getOption2Value();
 * String giftWrapMassage = entity.getGiftWrapMassage();
 * String billName = entity.getBillName();
 * String billFirstName = entity.getBillFirstName();
 * String billLastName = entity.getBillLastName();
 * String billAddress1 = entity.getBillAddress1();
 * String billAddress2 = entity.getBillAddress2();
 * String billCity = entity.getBillCity();
 * String billPrefecture = entity.getBillPrefecture();
 * String billZipCode = entity.getBillZipCode();
 * String billNameKana = entity.getBillNameKana();
 * String billFirstNameKana = entity.getBillFirstNameKana();
 * String billLastNameKana = entity.getBillLastNameKana();
 * String billAddress1Kana = entity.getBillAddress1Kana();
 * String billAddress2Kana = entity.getBillAddress2Kana();
 * String billCityKana = entity.getBillCityKana();
 * String billPrefectureKana = entity.getBillPrefectureKana();
 * String billSection1Field = entity.getBillSection1Field();
 * String billSection1Value = entity.getBillSection1Value();
 * String billSection2Field = entity.getBillSection2Field();
 * String billSection2Value = entity.getBillSection2Value();
 * String billPhoneNumber = entity.getBillPhoneNumber();
 * String billEmgPhoneNumber = entity.getBillEmgPhoneNumber();
 * String billMailAddress = entity.getBillMailAddress();
 * String payMathod = entity.getPayMathod();
 * String payMathodName = entity.getPayMathodName();
 * String payKind = entity.getPayKind();
 * Long cardPayCount = entity.getCardPayCount();
 * String cardPayType = entity.getCardPayType();
 * String settleStatus = entity.getSettleStatus();
 * String settleId = entity.getSettleId();
 * String payNo = entity.getPayNo();
 * String payNoIssueDate = entity.getPayNoIssueDate();
 * String payDate = entity.getPayDate();
 * String buyerComments = entity.getBuyerComments();
 * String ageConfirm = entity.getAgeConfirm();
 * Long quantityDetail = entity.getQuantityDetail();
 * Long shipCharge = entity.getShipCharge();
 * Long payCharge = entity.getPayCharge();
 * Long giftWrapCharge = entity.getGiftWrapCharge();
 * Long discount = entity.getDiscount();
 * Long adjustments = entity.getAdjustments();
 * Long usePoint = entity.getUsePoint();
 * Long getPoint = entity.getGetPoint();
 * Long total = entity.getTotal();
 * Long totalPrice = entity.getTotalPrice();
 * Long shippingCDiscount = entity.getShippingCDiscount();
 * Long itemCDiscount = entity.getItemCDiscount();
 * Long totalMallCDiscount = entity.getTotalMallCDiscount();
 * Long getPointCrgToStore = entity.getGetPointCrgToStore();
 * String lineId = entity.getLineId();
 * Long quantity = entity.getQuantity();
 * String itemId = entity.getItemId();
 * String subCode = entity.getSubCode();
 * String title = entity.getTitle();
 * String itemOptionName = entity.getItemOptionName();
 * String itemOptionValue = entity.getItemOptionValue();
 * String subCodeOption = entity.getSubCodeOption();
 * String inscriptionName = entity.getInscriptionName();
 * String inscriptionValue = entity.getInscriptionValue();
 * Long unitPrice = entity.getUnitPrice();
 * Long unitGetPoint = entity.getUnitGetPoint();
 * Long lineSubTotal = entity.getLineSubTotal();
 * Long lineGetPoint = entity.getLineGetPoint();
 * String pointFspCode = entity.getPointFspCode();
 * String itemCondition = entity.getItemCondition();
 * String couponId = entity.getCouponId();
 * Long couponDiscount = entity.getCouponDiscount();
 * Long originalPrice = entity.getOriginalPrice();
 * String isGetPointFix = entity.getIsGetPointFix();
 * String getPointFixDate = entity.getGetPointFixDate();
 * String releaseDate = entity.getReleaseDate();
 * String getPointType = entity.getGetPointType();
 * String jan = entity.getJan();
 * String productId = entity.getProductId();
 * Long pointChargedToStore = entity.getPointChargedToStore();
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
 * entity.setYahooOrderId(yahooOrderId);
 * entity.setOrderId(orderId);
 * entity.setParentOrderId(parentOrderId);
 * entity.setDeviceType(deviceType);
 * entity.setIsAffiliate(isAffiliate);
 * entity.setFspLicenseCode(fspLicenseCode);
 * entity.setFspLicenseName(fspLicenseName);
 * entity.setOrderTime(orderTime);
 * entity.setOrderTimeUnixEpoch(orderTimeUnixEpoch);
 * entity.setUsePointType(usePointType);
 * entity.setOrderStatus(orderStatus);
 * entity.setStoreStatus(storeStatus);
 * entity.setReferer(referer);
 * entity.setEntryPoint(entryPoint);
 * entity.setClink(clink);
 * entity.setSuspectMessage(suspectMessage);
 * entity.setIsItemCoupon(isItemCoupon);
 * entity.setIsShippingCoupon(isShippingCoupon);
 * entity.setShipName(shipName);
 * entity.setShipFirstName(shipFirstName);
 * entity.setShipLastName(shipLastName);
 * entity.setShipAddress1(shipAddress1);
 * entity.setShipAddress2(shipAddress2);
 * entity.setShipCity(shipCity);
 * entity.setShipPrefecture(shipPrefecture);
 * entity.setShipZipCode(shipZipCode);
 * entity.setShipNameKana(shipNameKana);
 * entity.setShipFirstNameKana(shipFirstNameKana);
 * entity.setShipLastNameKana(shipLastNameKana);
 * entity.setShipAddress1Kana(shipAddress1Kana);
 * entity.setShipAddress2Kana(shipAddress2Kana);
 * entity.setShipCityKana(shipCityKana);
 * entity.setShipPrefectureKana(shipPrefectureKana);
 * entity.setShipSection1Field(shipSection1Field);
 * entity.setShipSection1Value(shipSection1Value);
 * entity.setShipSection2Field(shipSection2Field);
 * entity.setShipSection2Value(shipSection2Value);
 * entity.setShipPhoneNumber(shipPhoneNumber);
 * entity.setShipEmgPhoneNumber(shipEmgPhoneNumber);
 * entity.setShipMethod(shipMethod);
 * entity.setShipMethodName(shipMethodName);
 * entity.setShipRequestDate(shipRequestDate);
 * entity.setShipRequestTime(shipRequestTime);
 * entity.setShipNotes(shipNotes);
 * entity.setArriveType(arriveType);
 * entity.setShipInvoiceNumber1(shipInvoiceNumber1);
 * entity.setShipInvoiceNumber2(shipInvoiceNumber2);
 * entity.setShipUrl(shipUrl);
 * entity.setShipDate(shipDate);
 * entity.setGiftWrapType(giftWrapType);
 * entity.setGiftWrapPaperType(giftWrapPaperType);
 * entity.setGiftWrapName(giftWrapName);
 * entity.setNeedBillSlip(needBillSlip);
 * entity.setNeedDetailedSlip(needDetailedSlip);
 * entity.setNeedReceipt(needReceipt);
 * entity.setOption1Field(option1Field);
 * entity.setOption1Value(option1Value);
 * entity.setOption2Field(option2Field);
 * entity.setOption2Value(option2Value);
 * entity.setGiftWrapMassage(giftWrapMassage);
 * entity.setBillName(billName);
 * entity.setBillFirstName(billFirstName);
 * entity.setBillLastName(billLastName);
 * entity.setBillAddress1(billAddress1);
 * entity.setBillAddress2(billAddress2);
 * entity.setBillCity(billCity);
 * entity.setBillPrefecture(billPrefecture);
 * entity.setBillZipCode(billZipCode);
 * entity.setBillNameKana(billNameKana);
 * entity.setBillFirstNameKana(billFirstNameKana);
 * entity.setBillLastNameKana(billLastNameKana);
 * entity.setBillAddress1Kana(billAddress1Kana);
 * entity.setBillAddress2Kana(billAddress2Kana);
 * entity.setBillCityKana(billCityKana);
 * entity.setBillPrefectureKana(billPrefectureKana);
 * entity.setBillSection1Field(billSection1Field);
 * entity.setBillSection1Value(billSection1Value);
 * entity.setBillSection2Field(billSection2Field);
 * entity.setBillSection2Value(billSection2Value);
 * entity.setBillPhoneNumber(billPhoneNumber);
 * entity.setBillEmgPhoneNumber(billEmgPhoneNumber);
 * entity.setBillMailAddress(billMailAddress);
 * entity.setPayMathod(payMathod);
 * entity.setPayMathodName(payMathodName);
 * entity.setPayKind(payKind);
 * entity.setCardPayCount(cardPayCount);
 * entity.setCardPayType(cardPayType);
 * entity.setSettleStatus(settleStatus);
 * entity.setSettleId(settleId);
 * entity.setPayNo(payNo);
 * entity.setPayNoIssueDate(payNoIssueDate);
 * entity.setPayDate(payDate);
 * entity.setBuyerComments(buyerComments);
 * entity.setAgeConfirm(ageConfirm);
 * entity.setQuantityDetail(quantityDetail);
 * entity.setShipCharge(shipCharge);
 * entity.setPayCharge(payCharge);
 * entity.setGiftWrapCharge(giftWrapCharge);
 * entity.setDiscount(discount);
 * entity.setAdjustments(adjustments);
 * entity.setUsePoint(usePoint);
 * entity.setGetPoint(getPoint);
 * entity.setTotal(total);
 * entity.setTotalPrice(totalPrice);
 * entity.setShippingCDiscount(shippingCDiscount);
 * entity.setItemCDiscount(itemCDiscount);
 * entity.setTotalMallCDiscount(totalMallCDiscount);
 * entity.setGetPointCrgToStore(getPointCrgToStore);
 * entity.setLineId(lineId);
 * entity.setQuantity(quantity);
 * entity.setItemId(itemId);
 * entity.setSubCode(subCode);
 * entity.setTitle(title);
 * entity.setItemOptionName(itemOptionName);
 * entity.setItemOptionValue(itemOptionValue);
 * entity.setSubCodeOption(subCodeOption);
 * entity.setInscriptionName(inscriptionName);
 * entity.setInscriptionValue(inscriptionValue);
 * entity.setUnitPrice(unitPrice);
 * entity.setUnitGetPoint(unitGetPoint);
 * entity.setLineSubTotal(lineSubTotal);
 * entity.setLineGetPoint(lineGetPoint);
 * entity.setPointFspCode(pointFspCode);
 * entity.setItemCondition(itemCondition);
 * entity.setCouponId(couponId);
 * entity.setCouponDiscount(couponDiscount);
 * entity.setOriginalPrice(originalPrice);
 * entity.setIsGetPointFix(isGetPointFix);
 * entity.setGetPointFixDate(getPointFixDate);
 * entity.setReleaseDate(releaseDate);
 * entity.setGetPointType(getPointType);
 * entity.setJan(jan);
 * entity.setProductId(productId);
 * entity.setPointChargedToStore(pointChargedToStore);
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
public abstract class BsTYahooOrder extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _yahooOrderId;

    /** ORDER_ID: {varchar(30)} */
    protected String _orderId;

    /** PARENT_ORDER_ID: {varchar(30)} */
    protected String _parentOrderId;

    /** DEVICE_TYPE: {varchar(60)} */
    protected String _deviceType;

    /** IS_AFFILIATE: {varchar(60)} */
    protected String _isAffiliate;

    /** FSP_LICENSE_CODE: {varchar(30)} */
    protected String _fspLicenseCode;

    /** FSP_LICENSE_NAME: {varchar(60)} */
    protected String _fspLicenseName;

    /** ORDER_TIME: {varchar(30)} */
    protected String _orderTime;

    /** ORDER_TIME_UNIX_EPOCH: {varchar(30)} */
    protected String _orderTimeUnixEpoch;

    /** USE_POINT_TYPE: {varchar(60)} */
    protected String _usePointType;

    /** ORDER_STATUS: {varchar(60)} */
    protected String _orderStatus;

    /** STORE_STATUS: {varchar(60)} */
    protected String _storeStatus;

    /** REFERER: {varchar(60)} */
    protected String _referer;

    /** ENTRY_POINT: {varchar(60)} */
    protected String _entryPoint;

    /** CLINK: {varchar(60)} */
    protected String _clink;

    /** SUSPECT_MESSAGE: {varchar(60)} */
    protected String _suspectMessage;

    /** IS_ITEM_COUPON: {varchar(30)} */
    protected String _isItemCoupon;

    /** IS_SHIPPING_COUPON: {varchar(30)} */
    protected String _isShippingCoupon;

    /** SHIP_NAME: {varchar(255)} */
    protected String _shipName;

    /** SHIP_FIRST_NAME: {varchar(255)} */
    protected String _shipFirstName;

    /** SHIP_LAST_NAME: {varchar(255)} */
    protected String _shipLastName;

    /** SHIP_ADDRESS1: {varchar(255)} */
    protected String _shipAddress1;

    /** SHIP_ADDRESS2: {varchar(255)} */
    protected String _shipAddress2;

    /** SHIP_CITY: {varchar(255)} */
    protected String _shipCity;

    /** SHIP_PREFECTURE: {varchar(255)} */
    protected String _shipPrefecture;

    /** SHIP_ZIP_CODE: {varchar(60)} */
    protected String _shipZipCode;

    /** SHIP_NAME_KANA: {varchar(255)} */
    protected String _shipNameKana;

    /** SHIP_FIRST_NAME_KANA: {varchar(255)} */
    protected String _shipFirstNameKana;

    /** SHIP_LAST_NAME_KANA: {varchar(255)} */
    protected String _shipLastNameKana;

    /** SHIP_ADDRESS1_KANA: {varchar(255)} */
    protected String _shipAddress1Kana;

    /** SHIP_ADDRESS2_KANA: {varchar(255)} */
    protected String _shipAddress2Kana;

    /** SHIP_CITY_KANA: {varchar(255)} */
    protected String _shipCityKana;

    /** SHIP_PREFECTURE_KANA: {varchar(255)} */
    protected String _shipPrefectureKana;

    /** SHIP_SECTION1_FIELD: {varchar(60)} */
    protected String _shipSection1Field;

    /** SHIP_SECTION1_VALUE: {varchar(60)} */
    protected String _shipSection1Value;

    /** SHIP_SECTION2_FIELD: {varchar(60)} */
    protected String _shipSection2Field;

    /** SHIP_SECTION2_VALUE: {varchar(60)} */
    protected String _shipSection2Value;

    /** SHIP_PHONE_NUMBER: {varchar(255)} */
    protected String _shipPhoneNumber;

    /** SHIP_EMG_PHONE_NUMBER: {varchar(255)} */
    protected String _shipEmgPhoneNumber;

    /** SHIP_METHOD: {varchar(60)} */
    protected String _shipMethod;

    /** SHIP_METHOD_NAME: {varchar(60)} */
    protected String _shipMethodName;

    /** SHIP_REQUEST_DATE: {varchar(60)} */
    protected String _shipRequestDate;

    /** SHIP_REQUEST_TIME: {varchar(60)} */
    protected String _shipRequestTime;

    /** SHIP_NOTES: {varchar(60)} */
    protected String _shipNotes;

    /** ARRIVE_TYPE: {varchar(60)} */
    protected String _arriveType;

    /** SHIP_INVOICE_NUMBER1: {varchar(30)} */
    protected String _shipInvoiceNumber1;

    /** SHIP_INVOICE_NUMBER2: {varchar(30)} */
    protected String _shipInvoiceNumber2;

    /** SHIP_URL: {varchar(60)} */
    protected String _shipUrl;

    /** SHIP_DATE: {varchar(30)} */
    protected String _shipDate;

    /** GIFT_WRAP_TYPE: {varchar(60)} */
    protected String _giftWrapType;

    /** GIFT_WRAP_PAPER_TYPE: {varchar(60)} */
    protected String _giftWrapPaperType;

    /** GIFT_WRAP_NAME: {varchar(60)} */
    protected String _giftWrapName;

    /** NEED_BILL_SLIP: {varchar(60)} */
    protected String _needBillSlip;

    /** NEED_DETAILED_SLIP: {varchar(60)} */
    protected String _needDetailedSlip;

    /** NEED_RECEIPT: {varchar(60)} */
    protected String _needReceipt;

    /** OPTION1_FIELD: {varchar(60)} */
    protected String _option1Field;

    /** OPTION1_VALUE: {varchar(60)} */
    protected String _option1Value;

    /** OPTION2_FIELD: {varchar(60)} */
    protected String _option2Field;

    /** OPTION2_VALUE: {varchar(60)} */
    protected String _option2Value;

    /** GIFT_WRAP_MASSAGE: {varchar(60)} */
    protected String _giftWrapMassage;

    /** BILL_NAME: {varchar(255)} */
    protected String _billName;

    /** BILL_FIRST_NAME: {varchar(255)} */
    protected String _billFirstName;

    /** BILL_LAST_NAME: {varchar(255)} */
    protected String _billLastName;

    /** BILL_ADDRESS1: {varchar(255)} */
    protected String _billAddress1;

    /** BILL_ADDRESS2: {varchar(255)} */
    protected String _billAddress2;

    /** BILL_CITY: {varchar(255)} */
    protected String _billCity;

    /** BILL_PREFECTURE: {varchar(255)} */
    protected String _billPrefecture;

    /** BILL_ZIP_CODE: {varchar(30)} */
    protected String _billZipCode;

    /** BILL_NAME_KANA: {varchar(255)} */
    protected String _billNameKana;

    /** BILL_FIRST_NAME_KANA: {varchar(255)} */
    protected String _billFirstNameKana;

    /** BILL_LAST_NAME_KANA: {varchar(255)} */
    protected String _billLastNameKana;

    /** BILL_ADDRESS1_KANA: {varchar(255)} */
    protected String _billAddress1Kana;

    /** BILL_ADDRESS2_KANA: {varchar(255)} */
    protected String _billAddress2Kana;

    /** BILL_CITY_KANA: {varchar(255)} */
    protected String _billCityKana;

    /** BILL_PREFECTURE_KANA: {varchar(255)} */
    protected String _billPrefectureKana;

    /** BILL_SECTION1_FIELD: {varchar(60)} */
    protected String _billSection1Field;

    /** BILL_SECTION1_VALUE: {varchar(60)} */
    protected String _billSection1Value;

    /** BILL_SECTION2_FIELD: {varchar(60)} */
    protected String _billSection2Field;

    /** BILL_SECTION2_VALUE: {varchar(60)} */
    protected String _billSection2Value;

    /** BILL_PHONE_NUMBER: {varchar(255)} */
    protected String _billPhoneNumber;

    /** BILL_EMG_PHONE_NUMBER: {varchar(255)} */
    protected String _billEmgPhoneNumber;

    /** BILL_MAIL_ADDRESS: {varchar(255)} */
    protected String _billMailAddress;

    /** PAY_MATHOD: {varchar(60)} */
    protected String _payMathod;

    /** PAY_MATHOD_NAME: {varchar(60)} */
    protected String _payMathodName;

    /** PAY_KIND: {varchar(60)} */
    protected String _payKind;

    /** CARD_PAY_COUNT: {bigint(19)} */
    protected Long _cardPayCount;

    /** CARD_PAY_TYPE: {varchar(60)} */
    protected String _cardPayType;

    /** SETTLE_STATUS: {varchar(60)} */
    protected String _settleStatus;

    /** SETTLE_ID: {varchar(30)} */
    protected String _settleId;

    /** PAY_NO: {varchar(30)} */
    protected String _payNo;

    /** PAY_NO_ISSUE_DATE: {varchar(30)} */
    protected String _payNoIssueDate;

    /** PAY_DATE: {varchar(30)} */
    protected String _payDate;

    /** BUYER_COMMENTS: {varchar(60)} */
    protected String _buyerComments;

    /** AGE_CONFIRM: {varchar(60)} */
    protected String _ageConfirm;

    /** QUANTITY_DETAIL: {bigint(19)} */
    protected Long _quantityDetail;

    /** SHIP_CHARGE: {bigint(19)} */
    protected Long _shipCharge;

    /** PAY_CHARGE: {bigint(19)} */
    protected Long _payCharge;

    /** GIFT_WRAP_CHARGE: {bigint(19)} */
    protected Long _giftWrapCharge;

    /** DISCOUNT: {bigint(19)} */
    protected Long _discount;

    /** ADJUSTMENTS: {bigint(19)} */
    protected Long _adjustments;

    /** USE_POINT: {bigint(19)} */
    protected Long _usePoint;

    /** GET_POINT: {bigint(19)} */
    protected Long _getPoint;

    /** TOTAL: {bigint(19)} */
    protected Long _total;

    /** TOTAL_PRICE: {bigint(19)} */
    protected Long _totalPrice;

    /** SHIPPING_C_DISCOUNT: {bigint(19)} */
    protected Long _shippingCDiscount;

    /** ITEM_C_DISCOUNT: {bigint(19)} */
    protected Long _itemCDiscount;

    /** TOTAL_MALL_C_DISCOUNT: {bigint(19)} */
    protected Long _totalMallCDiscount;

    /** GET_POINT_CRG_TO_STORE: {bigint(19)} */
    protected Long _getPointCrgToStore;

    /** LINE_ID: {varchar(30)} */
    protected String _lineId;

    /** QUANTITY: {bigint(19)} */
    protected Long _quantity;

    /** ITEM_ID: {varchar(30)} */
    protected String _itemId;

    /** SUB_CODE: {varchar(30)} */
    protected String _subCode;

    /** TITLE: {varchar(255)} */
    protected String _title;

    /** ITEM_OPTION_NAME: {varchar(60)} */
    protected String _itemOptionName;

    /** ITEM_OPTION_VALUE: {varchar(60)} */
    protected String _itemOptionValue;

    /** SUB_CODE_OPTION: {varchar(60)} */
    protected String _subCodeOption;

    /** INSCRIPTION_NAME: {varchar(60)} */
    protected String _inscriptionName;

    /** INSCRIPTION_VALUE: {varchar(60)} */
    protected String _inscriptionValue;

    /** UNIT_PRICE: {bigint(19)} */
    protected Long _unitPrice;

    /** UNIT_GET_POINT: {bigint(19)} */
    protected Long _unitGetPoint;

    /** LINE_SUB_TOTAL: {bigint(19)} */
    protected Long _lineSubTotal;

    /** LINE_GET_POINT: {bigint(19)} */
    protected Long _lineGetPoint;

    /** POINT_FSP_CODE: {varchar(30)} */
    protected String _pointFspCode;

    /** ITEM_CONDITION: {varchar(30)} */
    protected String _itemCondition;

    /** COUPON_ID: {varchar(30)} */
    protected String _couponId;

    /** COUPON_DISCOUNT: {bigint(19)} */
    protected Long _couponDiscount;

    /** ORIGINAL_PRICE: {bigint(19)} */
    protected Long _originalPrice;

    /** IS_GET_POINT_FIX: {varchar(30)} */
    protected String _isGetPointFix;

    /** GET_POINT_FIX_DATE: {varchar(30)} */
    protected String _getPointFixDate;

    /** RELEASE_DATE: {varchar(30)} */
    protected String _releaseDate;

    /** GET_POINT_TYPE: {varchar(30)} */
    protected String _getPointType;

    /** JAN: {varchar(30)} */
    protected String _jan;

    /** PRODUCT_ID: {varchar(30)} */
    protected String _productId;

    /** POINT_CHARGED_TO_STORE: {bigint(19)} */
    protected Long _pointChargedToStore;

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
        return "T_YAHOO_ORDER";
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
        if (_yahooOrderId == null) { return false; }
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
        if (obj instanceof BsTYahooOrder) {
            BsTYahooOrder other = (BsTYahooOrder)obj;
            if (!xSV(_yahooOrderId, other._yahooOrderId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _yahooOrderId);
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
        sb.append(dm).append(xfND(_yahooOrderId));
        sb.append(dm).append(xfND(_orderId));
        sb.append(dm).append(xfND(_parentOrderId));
        sb.append(dm).append(xfND(_deviceType));
        sb.append(dm).append(xfND(_isAffiliate));
        sb.append(dm).append(xfND(_fspLicenseCode));
        sb.append(dm).append(xfND(_fspLicenseName));
        sb.append(dm).append(xfND(_orderTime));
        sb.append(dm).append(xfND(_orderTimeUnixEpoch));
        sb.append(dm).append(xfND(_usePointType));
        sb.append(dm).append(xfND(_orderStatus));
        sb.append(dm).append(xfND(_storeStatus));
        sb.append(dm).append(xfND(_referer));
        sb.append(dm).append(xfND(_entryPoint));
        sb.append(dm).append(xfND(_clink));
        sb.append(dm).append(xfND(_suspectMessage));
        sb.append(dm).append(xfND(_isItemCoupon));
        sb.append(dm).append(xfND(_isShippingCoupon));
        sb.append(dm).append(xfND(_shipName));
        sb.append(dm).append(xfND(_shipFirstName));
        sb.append(dm).append(xfND(_shipLastName));
        sb.append(dm).append(xfND(_shipAddress1));
        sb.append(dm).append(xfND(_shipAddress2));
        sb.append(dm).append(xfND(_shipCity));
        sb.append(dm).append(xfND(_shipPrefecture));
        sb.append(dm).append(xfND(_shipZipCode));
        sb.append(dm).append(xfND(_shipNameKana));
        sb.append(dm).append(xfND(_shipFirstNameKana));
        sb.append(dm).append(xfND(_shipLastNameKana));
        sb.append(dm).append(xfND(_shipAddress1Kana));
        sb.append(dm).append(xfND(_shipAddress2Kana));
        sb.append(dm).append(xfND(_shipCityKana));
        sb.append(dm).append(xfND(_shipPrefectureKana));
        sb.append(dm).append(xfND(_shipSection1Field));
        sb.append(dm).append(xfND(_shipSection1Value));
        sb.append(dm).append(xfND(_shipSection2Field));
        sb.append(dm).append(xfND(_shipSection2Value));
        sb.append(dm).append(xfND(_shipPhoneNumber));
        sb.append(dm).append(xfND(_shipEmgPhoneNumber));
        sb.append(dm).append(xfND(_shipMethod));
        sb.append(dm).append(xfND(_shipMethodName));
        sb.append(dm).append(xfND(_shipRequestDate));
        sb.append(dm).append(xfND(_shipRequestTime));
        sb.append(dm).append(xfND(_shipNotes));
        sb.append(dm).append(xfND(_arriveType));
        sb.append(dm).append(xfND(_shipInvoiceNumber1));
        sb.append(dm).append(xfND(_shipInvoiceNumber2));
        sb.append(dm).append(xfND(_shipUrl));
        sb.append(dm).append(xfND(_shipDate));
        sb.append(dm).append(xfND(_giftWrapType));
        sb.append(dm).append(xfND(_giftWrapPaperType));
        sb.append(dm).append(xfND(_giftWrapName));
        sb.append(dm).append(xfND(_needBillSlip));
        sb.append(dm).append(xfND(_needDetailedSlip));
        sb.append(dm).append(xfND(_needReceipt));
        sb.append(dm).append(xfND(_option1Field));
        sb.append(dm).append(xfND(_option1Value));
        sb.append(dm).append(xfND(_option2Field));
        sb.append(dm).append(xfND(_option2Value));
        sb.append(dm).append(xfND(_giftWrapMassage));
        sb.append(dm).append(xfND(_billName));
        sb.append(dm).append(xfND(_billFirstName));
        sb.append(dm).append(xfND(_billLastName));
        sb.append(dm).append(xfND(_billAddress1));
        sb.append(dm).append(xfND(_billAddress2));
        sb.append(dm).append(xfND(_billCity));
        sb.append(dm).append(xfND(_billPrefecture));
        sb.append(dm).append(xfND(_billZipCode));
        sb.append(dm).append(xfND(_billNameKana));
        sb.append(dm).append(xfND(_billFirstNameKana));
        sb.append(dm).append(xfND(_billLastNameKana));
        sb.append(dm).append(xfND(_billAddress1Kana));
        sb.append(dm).append(xfND(_billAddress2Kana));
        sb.append(dm).append(xfND(_billCityKana));
        sb.append(dm).append(xfND(_billPrefectureKana));
        sb.append(dm).append(xfND(_billSection1Field));
        sb.append(dm).append(xfND(_billSection1Value));
        sb.append(dm).append(xfND(_billSection2Field));
        sb.append(dm).append(xfND(_billSection2Value));
        sb.append(dm).append(xfND(_billPhoneNumber));
        sb.append(dm).append(xfND(_billEmgPhoneNumber));
        sb.append(dm).append(xfND(_billMailAddress));
        sb.append(dm).append(xfND(_payMathod));
        sb.append(dm).append(xfND(_payMathodName));
        sb.append(dm).append(xfND(_payKind));
        sb.append(dm).append(xfND(_cardPayCount));
        sb.append(dm).append(xfND(_cardPayType));
        sb.append(dm).append(xfND(_settleStatus));
        sb.append(dm).append(xfND(_settleId));
        sb.append(dm).append(xfND(_payNo));
        sb.append(dm).append(xfND(_payNoIssueDate));
        sb.append(dm).append(xfND(_payDate));
        sb.append(dm).append(xfND(_buyerComments));
        sb.append(dm).append(xfND(_ageConfirm));
        sb.append(dm).append(xfND(_quantityDetail));
        sb.append(dm).append(xfND(_shipCharge));
        sb.append(dm).append(xfND(_payCharge));
        sb.append(dm).append(xfND(_giftWrapCharge));
        sb.append(dm).append(xfND(_discount));
        sb.append(dm).append(xfND(_adjustments));
        sb.append(dm).append(xfND(_usePoint));
        sb.append(dm).append(xfND(_getPoint));
        sb.append(dm).append(xfND(_total));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_shippingCDiscount));
        sb.append(dm).append(xfND(_itemCDiscount));
        sb.append(dm).append(xfND(_totalMallCDiscount));
        sb.append(dm).append(xfND(_getPointCrgToStore));
        sb.append(dm).append(xfND(_lineId));
        sb.append(dm).append(xfND(_quantity));
        sb.append(dm).append(xfND(_itemId));
        sb.append(dm).append(xfND(_subCode));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_itemOptionName));
        sb.append(dm).append(xfND(_itemOptionValue));
        sb.append(dm).append(xfND(_subCodeOption));
        sb.append(dm).append(xfND(_inscriptionName));
        sb.append(dm).append(xfND(_inscriptionValue));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_unitGetPoint));
        sb.append(dm).append(xfND(_lineSubTotal));
        sb.append(dm).append(xfND(_lineGetPoint));
        sb.append(dm).append(xfND(_pointFspCode));
        sb.append(dm).append(xfND(_itemCondition));
        sb.append(dm).append(xfND(_couponId));
        sb.append(dm).append(xfND(_couponDiscount));
        sb.append(dm).append(xfND(_originalPrice));
        sb.append(dm).append(xfND(_isGetPointFix));
        sb.append(dm).append(xfND(_getPointFixDate));
        sb.append(dm).append(xfND(_releaseDate));
        sb.append(dm).append(xfND(_getPointType));
        sb.append(dm).append(xfND(_jan));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_pointChargedToStore));
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
    public TYahooOrder clone() {
        return (TYahooOrder)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * YAHOO受注ID
     * @return The value of the column 'YAHOO_ORDER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getYahooOrderId() {
        checkSpecifiedProperty("yahooOrderId");
        return _yahooOrderId;
    }

    /**
     * [set] YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * YAHOO受注ID
     * @param yahooOrderId The value of the column 'YAHOO_ORDER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setYahooOrderId(Long yahooOrderId) {
        registerModifiedProperty("yahooOrderId");
        _yahooOrderId = yahooOrderId;
    }

    /**
     * [get] ORDER_ID: {varchar(30)} <br>
     * 注文ID
     * @return The value of the column 'ORDER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderId() {
        checkSpecifiedProperty("orderId");
        return convertEmptyToNull(_orderId);
    }

    /**
     * [set] ORDER_ID: {varchar(30)} <br>
     * 注文ID
     * @param orderId The value of the column 'ORDER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderId(String orderId) {
        registerModifiedProperty("orderId");
        _orderId = orderId;
    }

    /**
     * [get] PARENT_ORDER_ID: {varchar(30)} <br>
     * 分割元注文ID
     * @return The value of the column 'PARENT_ORDER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentOrderId() {
        checkSpecifiedProperty("parentOrderId");
        return convertEmptyToNull(_parentOrderId);
    }

    /**
     * [set] PARENT_ORDER_ID: {varchar(30)} <br>
     * 分割元注文ID
     * @param parentOrderId The value of the column 'PARENT_ORDER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentOrderId(String parentOrderId) {
        registerModifiedProperty("parentOrderId");
        _parentOrderId = parentOrderId;
    }

    /**
     * [get] DEVICE_TYPE: {varchar(60)} <br>
     * 注文媒体
     * @return The value of the column 'DEVICE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeviceType() {
        checkSpecifiedProperty("deviceType");
        return convertEmptyToNull(_deviceType);
    }

    /**
     * [set] DEVICE_TYPE: {varchar(60)} <br>
     * 注文媒体
     * @param deviceType The value of the column 'DEVICE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeviceType(String deviceType) {
        registerModifiedProperty("deviceType");
        _deviceType = deviceType;
    }

    /**
     * [get] IS_AFFILIATE: {varchar(60)} <br>
     * アフェリエイト経由注文種別
     * @return The value of the column 'IS_AFFILIATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsAffiliate() {
        checkSpecifiedProperty("isAffiliate");
        return convertEmptyToNull(_isAffiliate);
    }

    /**
     * [set] IS_AFFILIATE: {varchar(60)} <br>
     * アフェリエイト経由注文種別
     * @param isAffiliate The value of the column 'IS_AFFILIATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsAffiliate(String isAffiliate) {
        registerModifiedProperty("isAffiliate");
        _isAffiliate = isAffiliate;
    }

    /**
     * [get] FSP_LICENSE_CODE: {varchar(30)} <br>
     * スタンプラリーCD
     * @return The value of the column 'FSP_LICENSE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getFspLicenseCode() {
        checkSpecifiedProperty("fspLicenseCode");
        return convertEmptyToNull(_fspLicenseCode);
    }

    /**
     * [set] FSP_LICENSE_CODE: {varchar(30)} <br>
     * スタンプラリーCD
     * @param fspLicenseCode The value of the column 'FSP_LICENSE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFspLicenseCode(String fspLicenseCode) {
        registerModifiedProperty("fspLicenseCode");
        _fspLicenseCode = fspLicenseCode;
    }

    /**
     * [get] FSP_LICENSE_NAME: {varchar(60)} <br>
     * スタンプラリー名
     * @return The value of the column 'FSP_LICENSE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFspLicenseName() {
        checkSpecifiedProperty("fspLicenseName");
        return convertEmptyToNull(_fspLicenseName);
    }

    /**
     * [set] FSP_LICENSE_NAME: {varchar(60)} <br>
     * スタンプラリー名
     * @param fspLicenseName The value of the column 'FSP_LICENSE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFspLicenseName(String fspLicenseName) {
        registerModifiedProperty("fspLicenseName");
        _fspLicenseName = fspLicenseName;
    }

    /**
     * [get] ORDER_TIME: {varchar(30)} <br>
     * 注文日時
     * @return The value of the column 'ORDER_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTime() {
        checkSpecifiedProperty("orderTime");
        return convertEmptyToNull(_orderTime);
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文日時
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTime(String orderTime) {
        registerModifiedProperty("orderTime");
        _orderTime = orderTime;
    }

    /**
     * [get] ORDER_TIME_UNIX_EPOCH: {varchar(30)} <br>
     * 注文日時(UnixTime値)
     * @return The value of the column 'ORDER_TIME_UNIX_EPOCH'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTimeUnixEpoch() {
        checkSpecifiedProperty("orderTimeUnixEpoch");
        return convertEmptyToNull(_orderTimeUnixEpoch);
    }

    /**
     * [set] ORDER_TIME_UNIX_EPOCH: {varchar(30)} <br>
     * 注文日時(UnixTime値)
     * @param orderTimeUnixEpoch The value of the column 'ORDER_TIME_UNIX_EPOCH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTimeUnixEpoch(String orderTimeUnixEpoch) {
        registerModifiedProperty("orderTimeUnixEpoch");
        _orderTimeUnixEpoch = orderTimeUnixEpoch;
    }

    /**
     * [get] USE_POINT_TYPE: {varchar(60)} <br>
     * 利用ポイント種別
     * @return The value of the column 'USE_POINT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsePointType() {
        checkSpecifiedProperty("usePointType");
        return convertEmptyToNull(_usePointType);
    }

    /**
     * [set] USE_POINT_TYPE: {varchar(60)} <br>
     * 利用ポイント種別
     * @param usePointType The value of the column 'USE_POINT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsePointType(String usePointType) {
        registerModifiedProperty("usePointType");
        _usePointType = usePointType;
    }

    /**
     * [get] ORDER_STATUS: {varchar(60)} <br>
     * 注文ステータス
     * @return The value of the column 'ORDER_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderStatus() {
        checkSpecifiedProperty("orderStatus");
        return convertEmptyToNull(_orderStatus);
    }

    /**
     * [set] ORDER_STATUS: {varchar(60)} <br>
     * 注文ステータス
     * @param orderStatus The value of the column 'ORDER_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderStatus(String orderStatus) {
        registerModifiedProperty("orderStatus");
        _orderStatus = orderStatus;
    }

    /**
     * [get] STORE_STATUS: {varchar(60)} <br>
     * ストアカスタムステータス
     * @return The value of the column 'STORE_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreStatus() {
        checkSpecifiedProperty("storeStatus");
        return convertEmptyToNull(_storeStatus);
    }

    /**
     * [set] STORE_STATUS: {varchar(60)} <br>
     * ストアカスタムステータス
     * @param storeStatus The value of the column 'STORE_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreStatus(String storeStatus) {
        registerModifiedProperty("storeStatus");
        _storeStatus = storeStatus;
    }

    /**
     * [get] REFERER: {varchar(60)} <br>
     * 参照元URL
     * @return The value of the column 'REFERER'. (NullAllowed even if selected: for no constraint)
     */
    public String getReferer() {
        checkSpecifiedProperty("referer");
        return convertEmptyToNull(_referer);
    }

    /**
     * [set] REFERER: {varchar(60)} <br>
     * 参照元URL
     * @param referer The value of the column 'REFERER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReferer(String referer) {
        registerModifiedProperty("referer");
        _referer = referer;
    }

    /**
     * [get] ENTRY_POINT: {varchar(60)} <br>
     * 入力ポイント
     * @return The value of the column 'ENTRY_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public String getEntryPoint() {
        checkSpecifiedProperty("entryPoint");
        return convertEmptyToNull(_entryPoint);
    }

    /**
     * [set] ENTRY_POINT: {varchar(60)} <br>
     * 入力ポイント
     * @param entryPoint The value of the column 'ENTRY_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryPoint(String entryPoint) {
        registerModifiedProperty("entryPoint");
        _entryPoint = entryPoint;
    }

    /**
     * [get] CLINK: {varchar(60)} <br>
     * 調査用リンク
     * @return The value of the column 'CLINK'. (NullAllowed even if selected: for no constraint)
     */
    public String getClink() {
        checkSpecifiedProperty("clink");
        return convertEmptyToNull(_clink);
    }

    /**
     * [set] CLINK: {varchar(60)} <br>
     * 調査用リンク
     * @param clink The value of the column 'CLINK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClink(String clink) {
        registerModifiedProperty("clink");
        _clink = clink;
    }

    /**
     * [get] SUSPECT_MESSAGE: {varchar(60)} <br>
     * いたずら注文警告
     * @return The value of the column 'SUSPECT_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuspectMessage() {
        checkSpecifiedProperty("suspectMessage");
        return convertEmptyToNull(_suspectMessage);
    }

    /**
     * [set] SUSPECT_MESSAGE: {varchar(60)} <br>
     * いたずら注文警告
     * @param suspectMessage The value of the column 'SUSPECT_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuspectMessage(String suspectMessage) {
        registerModifiedProperty("suspectMessage");
        _suspectMessage = suspectMessage;
    }

    /**
     * [get] IS_ITEM_COUPON: {varchar(30)} <br>
     * 定率・定額クーポン利用フラグ
     * @return The value of the column 'IS_ITEM_COUPON'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsItemCoupon() {
        checkSpecifiedProperty("isItemCoupon");
        return convertEmptyToNull(_isItemCoupon);
    }

    /**
     * [set] IS_ITEM_COUPON: {varchar(30)} <br>
     * 定率・定額クーポン利用フラグ
     * @param isItemCoupon The value of the column 'IS_ITEM_COUPON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsItemCoupon(String isItemCoupon) {
        registerModifiedProperty("isItemCoupon");
        _isItemCoupon = isItemCoupon;
    }

    /**
     * [get] IS_SHIPPING_COUPON: {varchar(30)} <br>
     * 送料無料クーポン利用フラグ
     * @return The value of the column 'IS_SHIPPING_COUPON'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsShippingCoupon() {
        checkSpecifiedProperty("isShippingCoupon");
        return convertEmptyToNull(_isShippingCoupon);
    }

    /**
     * [set] IS_SHIPPING_COUPON: {varchar(30)} <br>
     * 送料無料クーポン利用フラグ
     * @param isShippingCoupon The value of the column 'IS_SHIPPING_COUPON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsShippingCoupon(String isShippingCoupon) {
        registerModifiedProperty("isShippingCoupon");
        _isShippingCoupon = isShippingCoupon;
    }

    /**
     * [get] SHIP_NAME: {varchar(255)} <br>
     * お届け先氏名
     * @return The value of the column 'SHIP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipName() {
        checkSpecifiedProperty("shipName");
        return convertEmptyToNull(_shipName);
    }

    /**
     * [set] SHIP_NAME: {varchar(255)} <br>
     * お届け先氏名
     * @param shipName The value of the column 'SHIP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipName(String shipName) {
        registerModifiedProperty("shipName");
        _shipName = shipName;
    }

    /**
     * [get] SHIP_FIRST_NAME: {varchar(255)} <br>
     * お届け先名前
     * @return The value of the column 'SHIP_FIRST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipFirstName() {
        checkSpecifiedProperty("shipFirstName");
        return convertEmptyToNull(_shipFirstName);
    }

    /**
     * [set] SHIP_FIRST_NAME: {varchar(255)} <br>
     * お届け先名前
     * @param shipFirstName The value of the column 'SHIP_FIRST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipFirstName(String shipFirstName) {
        registerModifiedProperty("shipFirstName");
        _shipFirstName = shipFirstName;
    }

    /**
     * [get] SHIP_LAST_NAME: {varchar(255)} <br>
     * お届け先名字
     * @return The value of the column 'SHIP_LAST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipLastName() {
        checkSpecifiedProperty("shipLastName");
        return convertEmptyToNull(_shipLastName);
    }

    /**
     * [set] SHIP_LAST_NAME: {varchar(255)} <br>
     * お届け先名字
     * @param shipLastName The value of the column 'SHIP_LAST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipLastName(String shipLastName) {
        registerModifiedProperty("shipLastName");
        _shipLastName = shipLastName;
    }

    /**
     * [get] SHIP_ADDRESS1: {varchar(255)} <br>
     * お届け先住所1
     * @return The value of the column 'SHIP_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress1() {
        checkSpecifiedProperty("shipAddress1");
        return convertEmptyToNull(_shipAddress1);
    }

    /**
     * [set] SHIP_ADDRESS1: {varchar(255)} <br>
     * お届け先住所1
     * @param shipAddress1 The value of the column 'SHIP_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress1(String shipAddress1) {
        registerModifiedProperty("shipAddress1");
        _shipAddress1 = shipAddress1;
    }

    /**
     * [get] SHIP_ADDRESS2: {varchar(255)} <br>
     * お届け先住所2
     * @return The value of the column 'SHIP_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress2() {
        checkSpecifiedProperty("shipAddress2");
        return convertEmptyToNull(_shipAddress2);
    }

    /**
     * [set] SHIP_ADDRESS2: {varchar(255)} <br>
     * お届け先住所2
     * @param shipAddress2 The value of the column 'SHIP_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress2(String shipAddress2) {
        registerModifiedProperty("shipAddress2");
        _shipAddress2 = shipAddress2;
    }

    /**
     * [get] SHIP_CITY: {varchar(255)} <br>
     * お届け先市区町村
     * @return The value of the column 'SHIP_CITY'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCity() {
        checkSpecifiedProperty("shipCity");
        return convertEmptyToNull(_shipCity);
    }

    /**
     * [set] SHIP_CITY: {varchar(255)} <br>
     * お届け先市区町村
     * @param shipCity The value of the column 'SHIP_CITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCity(String shipCity) {
        registerModifiedProperty("shipCity");
        _shipCity = shipCity;
    }

    /**
     * [get] SHIP_PREFECTURE: {varchar(255)} <br>
     * お届け先都道府県
     * @return The value of the column 'SHIP_PREFECTURE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPrefecture() {
        checkSpecifiedProperty("shipPrefecture");
        return convertEmptyToNull(_shipPrefecture);
    }

    /**
     * [set] SHIP_PREFECTURE: {varchar(255)} <br>
     * お届け先都道府県
     * @param shipPrefecture The value of the column 'SHIP_PREFECTURE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPrefecture(String shipPrefecture) {
        registerModifiedProperty("shipPrefecture");
        _shipPrefecture = shipPrefecture;
    }

    /**
     * [get] SHIP_ZIP_CODE: {varchar(60)} <br>
     * お届け先郵便番号
     * @return The value of the column 'SHIP_ZIP_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipZipCode() {
        checkSpecifiedProperty("shipZipCode");
        return convertEmptyToNull(_shipZipCode);
    }

    /**
     * [set] SHIP_ZIP_CODE: {varchar(60)} <br>
     * お届け先郵便番号
     * @param shipZipCode The value of the column 'SHIP_ZIP_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipZipCode(String shipZipCode) {
        registerModifiedProperty("shipZipCode");
        _shipZipCode = shipZipCode;
    }

    /**
     * [get] SHIP_NAME_KANA: {varchar(255)} <br>
     * お届け先氏名カナ
     * @return The value of the column 'SHIP_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipNameKana() {
        checkSpecifiedProperty("shipNameKana");
        return convertEmptyToNull(_shipNameKana);
    }

    /**
     * [set] SHIP_NAME_KANA: {varchar(255)} <br>
     * お届け先氏名カナ
     * @param shipNameKana The value of the column 'SHIP_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipNameKana(String shipNameKana) {
        registerModifiedProperty("shipNameKana");
        _shipNameKana = shipNameKana;
    }

    /**
     * [get] SHIP_FIRST_NAME_KANA: {varchar(255)} <br>
     * お届け先名前カナ
     * @return The value of the column 'SHIP_FIRST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipFirstNameKana() {
        checkSpecifiedProperty("shipFirstNameKana");
        return convertEmptyToNull(_shipFirstNameKana);
    }

    /**
     * [set] SHIP_FIRST_NAME_KANA: {varchar(255)} <br>
     * お届け先名前カナ
     * @param shipFirstNameKana The value of the column 'SHIP_FIRST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipFirstNameKana(String shipFirstNameKana) {
        registerModifiedProperty("shipFirstNameKana");
        _shipFirstNameKana = shipFirstNameKana;
    }

    /**
     * [get] SHIP_LAST_NAME_KANA: {varchar(255)} <br>
     * お届け先名字カナ
     * @return The value of the column 'SHIP_LAST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipLastNameKana() {
        checkSpecifiedProperty("shipLastNameKana");
        return convertEmptyToNull(_shipLastNameKana);
    }

    /**
     * [set] SHIP_LAST_NAME_KANA: {varchar(255)} <br>
     * お届け先名字カナ
     * @param shipLastNameKana The value of the column 'SHIP_LAST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipLastNameKana(String shipLastNameKana) {
        registerModifiedProperty("shipLastNameKana");
        _shipLastNameKana = shipLastNameKana;
    }

    /**
     * [get] SHIP_ADDRESS1_KANA: {varchar(255)} <br>
     * お届け先住所1カナ
     * @return The value of the column 'SHIP_ADDRESS1_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress1Kana() {
        checkSpecifiedProperty("shipAddress1Kana");
        return convertEmptyToNull(_shipAddress1Kana);
    }

    /**
     * [set] SHIP_ADDRESS1_KANA: {varchar(255)} <br>
     * お届け先住所1カナ
     * @param shipAddress1Kana The value of the column 'SHIP_ADDRESS1_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress1Kana(String shipAddress1Kana) {
        registerModifiedProperty("shipAddress1Kana");
        _shipAddress1Kana = shipAddress1Kana;
    }

    /**
     * [get] SHIP_ADDRESS2_KANA: {varchar(255)} <br>
     * お届け先住所2カナ
     * @return The value of the column 'SHIP_ADDRESS2_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipAddress2Kana() {
        checkSpecifiedProperty("shipAddress2Kana");
        return convertEmptyToNull(_shipAddress2Kana);
    }

    /**
     * [set] SHIP_ADDRESS2_KANA: {varchar(255)} <br>
     * お届け先住所2カナ
     * @param shipAddress2Kana The value of the column 'SHIP_ADDRESS2_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipAddress2Kana(String shipAddress2Kana) {
        registerModifiedProperty("shipAddress2Kana");
        _shipAddress2Kana = shipAddress2Kana;
    }

    /**
     * [get] SHIP_CITY_KANA: {varchar(255)} <br>
     * お届け先市区町村カナ
     * @return The value of the column 'SHIP_CITY_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCityKana() {
        checkSpecifiedProperty("shipCityKana");
        return convertEmptyToNull(_shipCityKana);
    }

    /**
     * [set] SHIP_CITY_KANA: {varchar(255)} <br>
     * お届け先市区町村カナ
     * @param shipCityKana The value of the column 'SHIP_CITY_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCityKana(String shipCityKana) {
        registerModifiedProperty("shipCityKana");
        _shipCityKana = shipCityKana;
    }

    /**
     * [get] SHIP_PREFECTURE_KANA: {varchar(255)} <br>
     * お届け先都道府県カナ
     * @return The value of the column 'SHIP_PREFECTURE_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPrefectureKana() {
        checkSpecifiedProperty("shipPrefectureKana");
        return convertEmptyToNull(_shipPrefectureKana);
    }

    /**
     * [set] SHIP_PREFECTURE_KANA: {varchar(255)} <br>
     * お届け先都道府県カナ
     * @param shipPrefectureKana The value of the column 'SHIP_PREFECTURE_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPrefectureKana(String shipPrefectureKana) {
        registerModifiedProperty("shipPrefectureKana");
        _shipPrefectureKana = shipPrefectureKana;
    }

    /**
     * [get] SHIP_SECTION1_FIELD: {varchar(60)} <br>
     * お届け先所属1フィールド名
     * @return The value of the column 'SHIP_SECTION1_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipSection1Field() {
        checkSpecifiedProperty("shipSection1Field");
        return convertEmptyToNull(_shipSection1Field);
    }

    /**
     * [set] SHIP_SECTION1_FIELD: {varchar(60)} <br>
     * お届け先所属1フィールド名
     * @param shipSection1Field The value of the column 'SHIP_SECTION1_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipSection1Field(String shipSection1Field) {
        registerModifiedProperty("shipSection1Field");
        _shipSection1Field = shipSection1Field;
    }

    /**
     * [get] SHIP_SECTION1_VALUE: {varchar(60)} <br>
     * お届け先所属1フィールド入力内容
     * @return The value of the column 'SHIP_SECTION1_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipSection1Value() {
        checkSpecifiedProperty("shipSection1Value");
        return convertEmptyToNull(_shipSection1Value);
    }

    /**
     * [set] SHIP_SECTION1_VALUE: {varchar(60)} <br>
     * お届け先所属1フィールド入力内容
     * @param shipSection1Value The value of the column 'SHIP_SECTION1_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipSection1Value(String shipSection1Value) {
        registerModifiedProperty("shipSection1Value");
        _shipSection1Value = shipSection1Value;
    }

    /**
     * [get] SHIP_SECTION2_FIELD: {varchar(60)} <br>
     * お届け先所属2フィールド名
     * @return The value of the column 'SHIP_SECTION2_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipSection2Field() {
        checkSpecifiedProperty("shipSection2Field");
        return convertEmptyToNull(_shipSection2Field);
    }

    /**
     * [set] SHIP_SECTION2_FIELD: {varchar(60)} <br>
     * お届け先所属2フィールド名
     * @param shipSection2Field The value of the column 'SHIP_SECTION2_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipSection2Field(String shipSection2Field) {
        registerModifiedProperty("shipSection2Field");
        _shipSection2Field = shipSection2Field;
    }

    /**
     * [get] SHIP_SECTION2_VALUE: {varchar(60)} <br>
     * お届け先所属2フィールド入力内容
     * @return The value of the column 'SHIP_SECTION2_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipSection2Value() {
        checkSpecifiedProperty("shipSection2Value");
        return convertEmptyToNull(_shipSection2Value);
    }

    /**
     * [set] SHIP_SECTION2_VALUE: {varchar(60)} <br>
     * お届け先所属2フィールド入力内容
     * @param shipSection2Value The value of the column 'SHIP_SECTION2_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipSection2Value(String shipSection2Value) {
        registerModifiedProperty("shipSection2Value");
        _shipSection2Value = shipSection2Value;
    }

    /**
     * [get] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号
     * @return The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipPhoneNumber() {
        checkSpecifiedProperty("shipPhoneNumber");
        return convertEmptyToNull(_shipPhoneNumber);
    }

    /**
     * [set] SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号
     * @param shipPhoneNumber The value of the column 'SHIP_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipPhoneNumber(String shipPhoneNumber) {
        registerModifiedProperty("shipPhoneNumber");
        _shipPhoneNumber = shipPhoneNumber;
    }

    /**
     * [get] SHIP_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号(緊急)
     * @return The value of the column 'SHIP_EMG_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipEmgPhoneNumber() {
        checkSpecifiedProperty("shipEmgPhoneNumber");
        return convertEmptyToNull(_shipEmgPhoneNumber);
    }

    /**
     * [set] SHIP_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * お届け先電話番号(緊急)
     * @param shipEmgPhoneNumber The value of the column 'SHIP_EMG_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipEmgPhoneNumber(String shipEmgPhoneNumber) {
        registerModifiedProperty("shipEmgPhoneNumber");
        _shipEmgPhoneNumber = shipEmgPhoneNumber;
    }

    /**
     * [get] SHIP_METHOD: {varchar(60)} <br>
     * お届け方法
     * @return The value of the column 'SHIP_METHOD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipMethod() {
        checkSpecifiedProperty("shipMethod");
        return convertEmptyToNull(_shipMethod);
    }

    /**
     * [set] SHIP_METHOD: {varchar(60)} <br>
     * お届け方法
     * @param shipMethod The value of the column 'SHIP_METHOD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipMethod(String shipMethod) {
        registerModifiedProperty("shipMethod");
        _shipMethod = shipMethod;
    }

    /**
     * [get] SHIP_METHOD_NAME: {varchar(60)} <br>
     * お届け方法名称
     * @return The value of the column 'SHIP_METHOD_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipMethodName() {
        checkSpecifiedProperty("shipMethodName");
        return convertEmptyToNull(_shipMethodName);
    }

    /**
     * [set] SHIP_METHOD_NAME: {varchar(60)} <br>
     * お届け方法名称
     * @param shipMethodName The value of the column 'SHIP_METHOD_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipMethodName(String shipMethodName) {
        registerModifiedProperty("shipMethodName");
        _shipMethodName = shipMethodName;
    }

    /**
     * [get] SHIP_REQUEST_DATE: {varchar(60)} <br>
     * お届け希望日
     * @return The value of the column 'SHIP_REQUEST_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipRequestDate() {
        checkSpecifiedProperty("shipRequestDate");
        return convertEmptyToNull(_shipRequestDate);
    }

    /**
     * [set] SHIP_REQUEST_DATE: {varchar(60)} <br>
     * お届け希望日
     * @param shipRequestDate The value of the column 'SHIP_REQUEST_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipRequestDate(String shipRequestDate) {
        registerModifiedProperty("shipRequestDate");
        _shipRequestDate = shipRequestDate;
    }

    /**
     * [get] SHIP_REQUEST_TIME: {varchar(60)} <br>
     * お届け希望時間帯
     * @return The value of the column 'SHIP_REQUEST_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipRequestTime() {
        checkSpecifiedProperty("shipRequestTime");
        return convertEmptyToNull(_shipRequestTime);
    }

    /**
     * [set] SHIP_REQUEST_TIME: {varchar(60)} <br>
     * お届け希望時間帯
     * @param shipRequestTime The value of the column 'SHIP_REQUEST_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipRequestTime(String shipRequestTime) {
        registerModifiedProperty("shipRequestTime");
        _shipRequestTime = shipRequestTime;
    }

    /**
     * [get] SHIP_NOTES: {varchar(60)} <br>
     * 配送メモ
     * @return The value of the column 'SHIP_NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipNotes() {
        checkSpecifiedProperty("shipNotes");
        return convertEmptyToNull(_shipNotes);
    }

    /**
     * [set] SHIP_NOTES: {varchar(60)} <br>
     * 配送メモ
     * @param shipNotes The value of the column 'SHIP_NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipNotes(String shipNotes) {
        registerModifiedProperty("shipNotes");
        _shipNotes = shipNotes;
    }

    /**
     * [get] ARRIVE_TYPE: {varchar(60)} <br>
     * 着荷種別
     * @return The value of the column 'ARRIVE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArriveType() {
        checkSpecifiedProperty("arriveType");
        return convertEmptyToNull(_arriveType);
    }

    /**
     * [set] ARRIVE_TYPE: {varchar(60)} <br>
     * 着荷種別
     * @param arriveType The value of the column 'ARRIVE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArriveType(String arriveType) {
        registerModifiedProperty("arriveType");
        _arriveType = arriveType;
    }

    /**
     * [get] SHIP_INVOICE_NUMBER1: {varchar(30)} <br>
     * お問い合わせ伝票番号1
     * @return The value of the column 'SHIP_INVOICE_NUMBER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipInvoiceNumber1() {
        checkSpecifiedProperty("shipInvoiceNumber1");
        return convertEmptyToNull(_shipInvoiceNumber1);
    }

    /**
     * [set] SHIP_INVOICE_NUMBER1: {varchar(30)} <br>
     * お問い合わせ伝票番号1
     * @param shipInvoiceNumber1 The value of the column 'SHIP_INVOICE_NUMBER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipInvoiceNumber1(String shipInvoiceNumber1) {
        registerModifiedProperty("shipInvoiceNumber1");
        _shipInvoiceNumber1 = shipInvoiceNumber1;
    }

    /**
     * [get] SHIP_INVOICE_NUMBER2: {varchar(30)} <br>
     * お問い合わせ伝票番号2
     * @return The value of the column 'SHIP_INVOICE_NUMBER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipInvoiceNumber2() {
        checkSpecifiedProperty("shipInvoiceNumber2");
        return convertEmptyToNull(_shipInvoiceNumber2);
    }

    /**
     * [set] SHIP_INVOICE_NUMBER2: {varchar(30)} <br>
     * お問い合わせ伝票番号2
     * @param shipInvoiceNumber2 The value of the column 'SHIP_INVOICE_NUMBER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipInvoiceNumber2(String shipInvoiceNumber2) {
        registerModifiedProperty("shipInvoiceNumber2");
        _shipInvoiceNumber2 = shipInvoiceNumber2;
    }

    /**
     * [get] SHIP_URL: {varchar(60)} <br>
     * 配送会社URL
     * @return The value of the column 'SHIP_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipUrl() {
        checkSpecifiedProperty("shipUrl");
        return convertEmptyToNull(_shipUrl);
    }

    /**
     * [set] SHIP_URL: {varchar(60)} <br>
     * 配送会社URL
     * @param shipUrl The value of the column 'SHIP_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipUrl(String shipUrl) {
        registerModifiedProperty("shipUrl");
        _shipUrl = shipUrl;
    }

    /**
     * [get] SHIP_DATE: {varchar(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipDate() {
        checkSpecifiedProperty("shipDate");
        return convertEmptyToNull(_shipDate);
    }

    /**
     * [set] SHIP_DATE: {varchar(30)} <br>
     * 出荷日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipDate(String shipDate) {
        registerModifiedProperty("shipDate");
        _shipDate = shipDate;
    }

    /**
     * [get] GIFT_WRAP_TYPE: {varchar(60)} <br>
     * ギフト包装種類
     * @return The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftWrapType() {
        checkSpecifiedProperty("giftWrapType");
        return convertEmptyToNull(_giftWrapType);
    }

    /**
     * [set] GIFT_WRAP_TYPE: {varchar(60)} <br>
     * ギフト包装種類
     * @param giftWrapType The value of the column 'GIFT_WRAP_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapType(String giftWrapType) {
        registerModifiedProperty("giftWrapType");
        _giftWrapType = giftWrapType;
    }

    /**
     * [get] GIFT_WRAP_PAPER_TYPE: {varchar(60)} <br>
     * のし
     * @return The value of the column 'GIFT_WRAP_PAPER_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftWrapPaperType() {
        checkSpecifiedProperty("giftWrapPaperType");
        return convertEmptyToNull(_giftWrapPaperType);
    }

    /**
     * [set] GIFT_WRAP_PAPER_TYPE: {varchar(60)} <br>
     * のし
     * @param giftWrapPaperType The value of the column 'GIFT_WRAP_PAPER_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapPaperType(String giftWrapPaperType) {
        registerModifiedProperty("giftWrapPaperType");
        _giftWrapPaperType = giftWrapPaperType;
    }

    /**
     * [get] GIFT_WRAP_NAME: {varchar(60)} <br>
     * のし名入れ
     * @return The value of the column 'GIFT_WRAP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftWrapName() {
        checkSpecifiedProperty("giftWrapName");
        return convertEmptyToNull(_giftWrapName);
    }

    /**
     * [set] GIFT_WRAP_NAME: {varchar(60)} <br>
     * のし名入れ
     * @param giftWrapName The value of the column 'GIFT_WRAP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapName(String giftWrapName) {
        registerModifiedProperty("giftWrapName");
        _giftWrapName = giftWrapName;
    }

    /**
     * [get] NEED_BILL_SLIP: {varchar(60)} <br>
     * 請求書 同梱有無
     * @return The value of the column 'NEED_BILL_SLIP'. (NullAllowed even if selected: for no constraint)
     */
    public String getNeedBillSlip() {
        checkSpecifiedProperty("needBillSlip");
        return convertEmptyToNull(_needBillSlip);
    }

    /**
     * [set] NEED_BILL_SLIP: {varchar(60)} <br>
     * 請求書 同梱有無
     * @param needBillSlip The value of the column 'NEED_BILL_SLIP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNeedBillSlip(String needBillSlip) {
        registerModifiedProperty("needBillSlip");
        _needBillSlip = needBillSlip;
    }

    /**
     * [get] NEED_DETAILED_SLIP: {varchar(60)} <br>
     * 明細書・納品書 同梱有無
     * @return The value of the column 'NEED_DETAILED_SLIP'. (NullAllowed even if selected: for no constraint)
     */
    public String getNeedDetailedSlip() {
        checkSpecifiedProperty("needDetailedSlip");
        return convertEmptyToNull(_needDetailedSlip);
    }

    /**
     * [set] NEED_DETAILED_SLIP: {varchar(60)} <br>
     * 明細書・納品書 同梱有無
     * @param needDetailedSlip The value of the column 'NEED_DETAILED_SLIP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNeedDetailedSlip(String needDetailedSlip) {
        registerModifiedProperty("needDetailedSlip");
        _needDetailedSlip = needDetailedSlip;
    }

    /**
     * [get] NEED_RECEIPT: {varchar(60)} <br>
     * 領収書 同梱有無
     * @return The value of the column 'NEED_RECEIPT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNeedReceipt() {
        checkSpecifiedProperty("needReceipt");
        return convertEmptyToNull(_needReceipt);
    }

    /**
     * [set] NEED_RECEIPT: {varchar(60)} <br>
     * 領収書 同梱有無
     * @param needReceipt The value of the column 'NEED_RECEIPT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNeedReceipt(String needReceipt) {
        registerModifiedProperty("needReceipt");
        _needReceipt = needReceipt;
    }

    /**
     * [get] OPTION1_FIELD: {varchar(60)} <br>
     * オプションフィールド1名称
     * @return The value of the column 'OPTION1_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOption1Field() {
        checkSpecifiedProperty("option1Field");
        return convertEmptyToNull(_option1Field);
    }

    /**
     * [set] OPTION1_FIELD: {varchar(60)} <br>
     * オプションフィールド1名称
     * @param option1Field The value of the column 'OPTION1_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOption1Field(String option1Field) {
        registerModifiedProperty("option1Field");
        _option1Field = option1Field;
    }

    /**
     * [get] OPTION1_VALUE: {varchar(60)} <br>
     * オプションフィールド1入力内容
     * @return The value of the column 'OPTION1_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOption1Value() {
        checkSpecifiedProperty("option1Value");
        return convertEmptyToNull(_option1Value);
    }

    /**
     * [set] OPTION1_VALUE: {varchar(60)} <br>
     * オプションフィールド1入力内容
     * @param option1Value The value of the column 'OPTION1_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOption1Value(String option1Value) {
        registerModifiedProperty("option1Value");
        _option1Value = option1Value;
    }

    /**
     * [get] OPTION2_FIELD: {varchar(60)} <br>
     * オプションフィールド2名称
     * @return The value of the column 'OPTION2_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOption2Field() {
        checkSpecifiedProperty("option2Field");
        return convertEmptyToNull(_option2Field);
    }

    /**
     * [set] OPTION2_FIELD: {varchar(60)} <br>
     * オプションフィールド2名称
     * @param option2Field The value of the column 'OPTION2_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOption2Field(String option2Field) {
        registerModifiedProperty("option2Field");
        _option2Field = option2Field;
    }

    /**
     * [get] OPTION2_VALUE: {varchar(60)} <br>
     * オプションフィールド2入力内容
     * @return The value of the column 'OPTION2_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOption2Value() {
        checkSpecifiedProperty("option2Value");
        return convertEmptyToNull(_option2Value);
    }

    /**
     * [set] OPTION2_VALUE: {varchar(60)} <br>
     * オプションフィールド2入力内容
     * @param option2Value The value of the column 'OPTION2_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOption2Value(String option2Value) {
        registerModifiedProperty("option2Value");
        _option2Value = option2Value;
    }

    /**
     * [get] GIFT_WRAP_MASSAGE: {varchar(60)} <br>
     * ギフトメッセージ
     * @return The value of the column 'GIFT_WRAP_MASSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftWrapMassage() {
        checkSpecifiedProperty("giftWrapMassage");
        return convertEmptyToNull(_giftWrapMassage);
    }

    /**
     * [set] GIFT_WRAP_MASSAGE: {varchar(60)} <br>
     * ギフトメッセージ
     * @param giftWrapMassage The value of the column 'GIFT_WRAP_MASSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapMassage(String giftWrapMassage) {
        registerModifiedProperty("giftWrapMassage");
        _giftWrapMassage = giftWrapMassage;
    }

    /**
     * [get] BILL_NAME: {varchar(255)} <br>
     * ご請求先氏名
     * @return The value of the column 'BILL_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillName() {
        checkSpecifiedProperty("billName");
        return convertEmptyToNull(_billName);
    }

    /**
     * [set] BILL_NAME: {varchar(255)} <br>
     * ご請求先氏名
     * @param billName The value of the column 'BILL_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillName(String billName) {
        registerModifiedProperty("billName");
        _billName = billName;
    }

    /**
     * [get] BILL_FIRST_NAME: {varchar(255)} <br>
     * ご請求先名前
     * @return The value of the column 'BILL_FIRST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillFirstName() {
        checkSpecifiedProperty("billFirstName");
        return convertEmptyToNull(_billFirstName);
    }

    /**
     * [set] BILL_FIRST_NAME: {varchar(255)} <br>
     * ご請求先名前
     * @param billFirstName The value of the column 'BILL_FIRST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillFirstName(String billFirstName) {
        registerModifiedProperty("billFirstName");
        _billFirstName = billFirstName;
    }

    /**
     * [get] BILL_LAST_NAME: {varchar(255)} <br>
     * ご請求先名字
     * @return The value of the column 'BILL_LAST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillLastName() {
        checkSpecifiedProperty("billLastName");
        return convertEmptyToNull(_billLastName);
    }

    /**
     * [set] BILL_LAST_NAME: {varchar(255)} <br>
     * ご請求先名字
     * @param billLastName The value of the column 'BILL_LAST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillLastName(String billLastName) {
        registerModifiedProperty("billLastName");
        _billLastName = billLastName;
    }

    /**
     * [get] BILL_ADDRESS1: {varchar(255)} <br>
     * ご請求先住所1
     * @return The value of the column 'BILL_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress1() {
        checkSpecifiedProperty("billAddress1");
        return convertEmptyToNull(_billAddress1);
    }

    /**
     * [set] BILL_ADDRESS1: {varchar(255)} <br>
     * ご請求先住所1
     * @param billAddress1 The value of the column 'BILL_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress1(String billAddress1) {
        registerModifiedProperty("billAddress1");
        _billAddress1 = billAddress1;
    }

    /**
     * [get] BILL_ADDRESS2: {varchar(255)} <br>
     * ご請求先住所2
     * @return The value of the column 'BILL_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress2() {
        checkSpecifiedProperty("billAddress2");
        return convertEmptyToNull(_billAddress2);
    }

    /**
     * [set] BILL_ADDRESS2: {varchar(255)} <br>
     * ご請求先住所2
     * @param billAddress2 The value of the column 'BILL_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress2(String billAddress2) {
        registerModifiedProperty("billAddress2");
        _billAddress2 = billAddress2;
    }

    /**
     * [get] BILL_CITY: {varchar(255)} <br>
     * ご請求先市区町村
     * @return The value of the column 'BILL_CITY'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillCity() {
        checkSpecifiedProperty("billCity");
        return convertEmptyToNull(_billCity);
    }

    /**
     * [set] BILL_CITY: {varchar(255)} <br>
     * ご請求先市区町村
     * @param billCity The value of the column 'BILL_CITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillCity(String billCity) {
        registerModifiedProperty("billCity");
        _billCity = billCity;
    }

    /**
     * [get] BILL_PREFECTURE: {varchar(255)} <br>
     * ご請求先都道府県
     * @return The value of the column 'BILL_PREFECTURE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillPrefecture() {
        checkSpecifiedProperty("billPrefecture");
        return convertEmptyToNull(_billPrefecture);
    }

    /**
     * [set] BILL_PREFECTURE: {varchar(255)} <br>
     * ご請求先都道府県
     * @param billPrefecture The value of the column 'BILL_PREFECTURE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillPrefecture(String billPrefecture) {
        registerModifiedProperty("billPrefecture");
        _billPrefecture = billPrefecture;
    }

    /**
     * [get] BILL_ZIP_CODE: {varchar(30)} <br>
     * ご請求先郵便番号
     * @return The value of the column 'BILL_ZIP_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillZipCode() {
        checkSpecifiedProperty("billZipCode");
        return convertEmptyToNull(_billZipCode);
    }

    /**
     * [set] BILL_ZIP_CODE: {varchar(30)} <br>
     * ご請求先郵便番号
     * @param billZipCode The value of the column 'BILL_ZIP_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillZipCode(String billZipCode) {
        registerModifiedProperty("billZipCode");
        _billZipCode = billZipCode;
    }

    /**
     * [get] BILL_NAME_KANA: {varchar(255)} <br>
     * ご請求先氏名カナ
     * @return The value of the column 'BILL_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillNameKana() {
        checkSpecifiedProperty("billNameKana");
        return convertEmptyToNull(_billNameKana);
    }

    /**
     * [set] BILL_NAME_KANA: {varchar(255)} <br>
     * ご請求先氏名カナ
     * @param billNameKana The value of the column 'BILL_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillNameKana(String billNameKana) {
        registerModifiedProperty("billNameKana");
        _billNameKana = billNameKana;
    }

    /**
     * [get] BILL_FIRST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名前カナ
     * @return The value of the column 'BILL_FIRST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillFirstNameKana() {
        checkSpecifiedProperty("billFirstNameKana");
        return convertEmptyToNull(_billFirstNameKana);
    }

    /**
     * [set] BILL_FIRST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名前カナ
     * @param billFirstNameKana The value of the column 'BILL_FIRST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillFirstNameKana(String billFirstNameKana) {
        registerModifiedProperty("billFirstNameKana");
        _billFirstNameKana = billFirstNameKana;
    }

    /**
     * [get] BILL_LAST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名字カナ
     * @return The value of the column 'BILL_LAST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillLastNameKana() {
        checkSpecifiedProperty("billLastNameKana");
        return convertEmptyToNull(_billLastNameKana);
    }

    /**
     * [set] BILL_LAST_NAME_KANA: {varchar(255)} <br>
     * ご請求先名字カナ
     * @param billLastNameKana The value of the column 'BILL_LAST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillLastNameKana(String billLastNameKana) {
        registerModifiedProperty("billLastNameKana");
        _billLastNameKana = billLastNameKana;
    }

    /**
     * [get] BILL_ADDRESS1_KANA: {varchar(255)} <br>
     * ご請求先住所1カナ
     * @return The value of the column 'BILL_ADDRESS1_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress1Kana() {
        checkSpecifiedProperty("billAddress1Kana");
        return convertEmptyToNull(_billAddress1Kana);
    }

    /**
     * [set] BILL_ADDRESS1_KANA: {varchar(255)} <br>
     * ご請求先住所1カナ
     * @param billAddress1Kana The value of the column 'BILL_ADDRESS1_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress1Kana(String billAddress1Kana) {
        registerModifiedProperty("billAddress1Kana");
        _billAddress1Kana = billAddress1Kana;
    }

    /**
     * [get] BILL_ADDRESS2_KANA: {varchar(255)} <br>
     * ご請求先住所2カナ
     * @return The value of the column 'BILL_ADDRESS2_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress2Kana() {
        checkSpecifiedProperty("billAddress2Kana");
        return convertEmptyToNull(_billAddress2Kana);
    }

    /**
     * [set] BILL_ADDRESS2_KANA: {varchar(255)} <br>
     * ご請求先住所2カナ
     * @param billAddress2Kana The value of the column 'BILL_ADDRESS2_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress2Kana(String billAddress2Kana) {
        registerModifiedProperty("billAddress2Kana");
        _billAddress2Kana = billAddress2Kana;
    }

    /**
     * [get] BILL_CITY_KANA: {varchar(255)} <br>
     * ご請求先市区町村カナ
     * @return The value of the column 'BILL_CITY_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillCityKana() {
        checkSpecifiedProperty("billCityKana");
        return convertEmptyToNull(_billCityKana);
    }

    /**
     * [set] BILL_CITY_KANA: {varchar(255)} <br>
     * ご請求先市区町村カナ
     * @param billCityKana The value of the column 'BILL_CITY_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillCityKana(String billCityKana) {
        registerModifiedProperty("billCityKana");
        _billCityKana = billCityKana;
    }

    /**
     * [get] BILL_PREFECTURE_KANA: {varchar(255)} <br>
     * ご請求先都道府県カナ
     * @return The value of the column 'BILL_PREFECTURE_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillPrefectureKana() {
        checkSpecifiedProperty("billPrefectureKana");
        return convertEmptyToNull(_billPrefectureKana);
    }

    /**
     * [set] BILL_PREFECTURE_KANA: {varchar(255)} <br>
     * ご請求先都道府県カナ
     * @param billPrefectureKana The value of the column 'BILL_PREFECTURE_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillPrefectureKana(String billPrefectureKana) {
        registerModifiedProperty("billPrefectureKana");
        _billPrefectureKana = billPrefectureKana;
    }

    /**
     * [get] BILL_SECTION1_FIELD: {varchar(60)} <br>
     * ご請求先所属1フィールド名
     * @return The value of the column 'BILL_SECTION1_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillSection1Field() {
        checkSpecifiedProperty("billSection1Field");
        return convertEmptyToNull(_billSection1Field);
    }

    /**
     * [set] BILL_SECTION1_FIELD: {varchar(60)} <br>
     * ご請求先所属1フィールド名
     * @param billSection1Field The value of the column 'BILL_SECTION1_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillSection1Field(String billSection1Field) {
        registerModifiedProperty("billSection1Field");
        _billSection1Field = billSection1Field;
    }

    /**
     * [get] BILL_SECTION1_VALUE: {varchar(60)} <br>
     * ご請求先所属1フィールド入力内容
     * @return The value of the column 'BILL_SECTION1_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillSection1Value() {
        checkSpecifiedProperty("billSection1Value");
        return convertEmptyToNull(_billSection1Value);
    }

    /**
     * [set] BILL_SECTION1_VALUE: {varchar(60)} <br>
     * ご請求先所属1フィールド入力内容
     * @param billSection1Value The value of the column 'BILL_SECTION1_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillSection1Value(String billSection1Value) {
        registerModifiedProperty("billSection1Value");
        _billSection1Value = billSection1Value;
    }

    /**
     * [get] BILL_SECTION2_FIELD: {varchar(60)} <br>
     * ご請求先所属2フィールド名
     * @return The value of the column 'BILL_SECTION2_FIELD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillSection2Field() {
        checkSpecifiedProperty("billSection2Field");
        return convertEmptyToNull(_billSection2Field);
    }

    /**
     * [set] BILL_SECTION2_FIELD: {varchar(60)} <br>
     * ご請求先所属2フィールド名
     * @param billSection2Field The value of the column 'BILL_SECTION2_FIELD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillSection2Field(String billSection2Field) {
        registerModifiedProperty("billSection2Field");
        _billSection2Field = billSection2Field;
    }

    /**
     * [get] BILL_SECTION2_VALUE: {varchar(60)} <br>
     * ご請求先所属2フィールド入力内容
     * @return The value of the column 'BILL_SECTION2_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillSection2Value() {
        checkSpecifiedProperty("billSection2Value");
        return convertEmptyToNull(_billSection2Value);
    }

    /**
     * [set] BILL_SECTION2_VALUE: {varchar(60)} <br>
     * ご請求先所属2フィールド入力内容
     * @param billSection2Value The value of the column 'BILL_SECTION2_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillSection2Value(String billSection2Value) {
        registerModifiedProperty("billSection2Value");
        _billSection2Value = billSection2Value;
    }

    /**
     * [get] BILL_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号
     * @return The value of the column 'BILL_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillPhoneNumber() {
        checkSpecifiedProperty("billPhoneNumber");
        return convertEmptyToNull(_billPhoneNumber);
    }

    /**
     * [set] BILL_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号
     * @param billPhoneNumber The value of the column 'BILL_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillPhoneNumber(String billPhoneNumber) {
        registerModifiedProperty("billPhoneNumber");
        _billPhoneNumber = billPhoneNumber;
    }

    /**
     * [get] BILL_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号(緊急)
     * @return The value of the column 'BILL_EMG_PHONE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillEmgPhoneNumber() {
        checkSpecifiedProperty("billEmgPhoneNumber");
        return convertEmptyToNull(_billEmgPhoneNumber);
    }

    /**
     * [set] BILL_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * ご請求先電話番号(緊急)
     * @param billEmgPhoneNumber The value of the column 'BILL_EMG_PHONE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillEmgPhoneNumber(String billEmgPhoneNumber) {
        registerModifiedProperty("billEmgPhoneNumber");
        _billEmgPhoneNumber = billEmgPhoneNumber;
    }

    /**
     * [get] BILL_MAIL_ADDRESS: {varchar(255)} <br>
     * ご請求先メールアドレス
     * @return The value of the column 'BILL_MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillMailAddress() {
        checkSpecifiedProperty("billMailAddress");
        return convertEmptyToNull(_billMailAddress);
    }

    /**
     * [set] BILL_MAIL_ADDRESS: {varchar(255)} <br>
     * ご請求先メールアドレス
     * @param billMailAddress The value of the column 'BILL_MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillMailAddress(String billMailAddress) {
        registerModifiedProperty("billMailAddress");
        _billMailAddress = billMailAddress;
    }

    /**
     * [get] PAY_MATHOD: {varchar(60)} <br>
     * お支払方法
     * @return The value of the column 'PAY_MATHOD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayMathod() {
        checkSpecifiedProperty("payMathod");
        return convertEmptyToNull(_payMathod);
    }

    /**
     * [set] PAY_MATHOD: {varchar(60)} <br>
     * お支払方法
     * @param payMathod The value of the column 'PAY_MATHOD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayMathod(String payMathod) {
        registerModifiedProperty("payMathod");
        _payMathod = payMathod;
    }

    /**
     * [get] PAY_MATHOD_NAME: {varchar(60)} <br>
     * お支払方法名称
     * @return The value of the column 'PAY_MATHOD_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayMathodName() {
        checkSpecifiedProperty("payMathodName");
        return convertEmptyToNull(_payMathodName);
    }

    /**
     * [set] PAY_MATHOD_NAME: {varchar(60)} <br>
     * お支払方法名称
     * @param payMathodName The value of the column 'PAY_MATHOD_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayMathodName(String payMathodName) {
        registerModifiedProperty("payMathodName");
        _payMathodName = payMathodName;
    }

    /**
     * [get] PAY_KIND: {varchar(60)} <br>
     * お支払方法種別
     * @return The value of the column 'PAY_KIND'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayKind() {
        checkSpecifiedProperty("payKind");
        return convertEmptyToNull(_payKind);
    }

    /**
     * [set] PAY_KIND: {varchar(60)} <br>
     * お支払方法種別
     * @param payKind The value of the column 'PAY_KIND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayKind(String payKind) {
        registerModifiedProperty("payKind");
        _payKind = payKind;
    }

    /**
     * [get] CARD_PAY_COUNT: {bigint(19)} <br>
     * クレジットカードお支払回数
     * @return The value of the column 'CARD_PAY_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCardPayCount() {
        checkSpecifiedProperty("cardPayCount");
        return _cardPayCount;
    }

    /**
     * [set] CARD_PAY_COUNT: {bigint(19)} <br>
     * クレジットカードお支払回数
     * @param cardPayCount The value of the column 'CARD_PAY_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardPayCount(Long cardPayCount) {
        registerModifiedProperty("cardPayCount");
        _cardPayCount = cardPayCount;
    }

    /**
     * [get] CARD_PAY_TYPE: {varchar(60)} <br>
     * クレジットカードお支払区分
     * @return The value of the column 'CARD_PAY_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardPayType() {
        checkSpecifiedProperty("cardPayType");
        return convertEmptyToNull(_cardPayType);
    }

    /**
     * [set] CARD_PAY_TYPE: {varchar(60)} <br>
     * クレジットカードお支払区分
     * @param cardPayType The value of the column 'CARD_PAY_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardPayType(String cardPayType) {
        registerModifiedProperty("cardPayType");
        _cardPayType = cardPayType;
    }

    /**
     * [get] SETTLE_STATUS: {varchar(60)} <br>
     * 決済ステータス
     * @return The value of the column 'SETTLE_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSettleStatus() {
        checkSpecifiedProperty("settleStatus");
        return convertEmptyToNull(_settleStatus);
    }

    /**
     * [set] SETTLE_STATUS: {varchar(60)} <br>
     * 決済ステータス
     * @param settleStatus The value of the column 'SETTLE_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSettleStatus(String settleStatus) {
        registerModifiedProperty("settleStatus");
        _settleStatus = settleStatus;
    }

    /**
     * [get] SETTLE_ID: {varchar(30)} <br>
     * 決済ID
     * @return The value of the column 'SETTLE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSettleId() {
        checkSpecifiedProperty("settleId");
        return convertEmptyToNull(_settleId);
    }

    /**
     * [set] SETTLE_ID: {varchar(30)} <br>
     * 決済ID
     * @param settleId The value of the column 'SETTLE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSettleId(String settleId) {
        registerModifiedProperty("settleId");
        _settleId = settleId;
    }

    /**
     * [get] PAY_NO: {varchar(30)} <br>
     * 支払番号
     * @return The value of the column 'PAY_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayNo() {
        checkSpecifiedProperty("payNo");
        return convertEmptyToNull(_payNo);
    }

    /**
     * [set] PAY_NO: {varchar(30)} <br>
     * 支払番号
     * @param payNo The value of the column 'PAY_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayNo(String payNo) {
        registerModifiedProperty("payNo");
        _payNo = payNo;
    }

    /**
     * [get] PAY_NO_ISSUE_DATE: {varchar(30)} <br>
     * 支払番号発行日時
     * @return The value of the column 'PAY_NO_ISSUE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayNoIssueDate() {
        checkSpecifiedProperty("payNoIssueDate");
        return convertEmptyToNull(_payNoIssueDate);
    }

    /**
     * [set] PAY_NO_ISSUE_DATE: {varchar(30)} <br>
     * 支払番号発行日時
     * @param payNoIssueDate The value of the column 'PAY_NO_ISSUE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayNoIssueDate(String payNoIssueDate) {
        registerModifiedProperty("payNoIssueDate");
        _payNoIssueDate = payNoIssueDate;
    }

    /**
     * [get] PAY_DATE: {varchar(30)} <br>
     * 入金日
     * @return The value of the column 'PAY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPayDate() {
        checkSpecifiedProperty("payDate");
        return convertEmptyToNull(_payDate);
    }

    /**
     * [set] PAY_DATE: {varchar(30)} <br>
     * 入金日
     * @param payDate The value of the column 'PAY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayDate(String payDate) {
        registerModifiedProperty("payDate");
        _payDate = payDate;
    }

    /**
     * [get] BUYER_COMMENTS: {varchar(60)} <br>
     * ご要望
     * @return The value of the column 'BUYER_COMMENTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getBuyerComments() {
        checkSpecifiedProperty("buyerComments");
        return convertEmptyToNull(_buyerComments);
    }

    /**
     * [set] BUYER_COMMENTS: {varchar(60)} <br>
     * ご要望
     * @param buyerComments The value of the column 'BUYER_COMMENTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBuyerComments(String buyerComments) {
        registerModifiedProperty("buyerComments");
        _buyerComments = buyerComments;
    }

    /**
     * [get] AGE_CONFIRM: {varchar(60)} <br>
     * 年齢確認
     * @return The value of the column 'AGE_CONFIRM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAgeConfirm() {
        checkSpecifiedProperty("ageConfirm");
        return convertEmptyToNull(_ageConfirm);
    }

    /**
     * [set] AGE_CONFIRM: {varchar(60)} <br>
     * 年齢確認
     * @param ageConfirm The value of the column 'AGE_CONFIRM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAgeConfirm(String ageConfirm) {
        registerModifiedProperty("ageConfirm");
        _ageConfirm = ageConfirm;
    }

    /**
     * [get] QUANTITY_DETAIL: {bigint(19)} <br>
     * 注文商品の数量
     * @return The value of the column 'QUANTITY_DETAIL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getQuantityDetail() {
        checkSpecifiedProperty("quantityDetail");
        return _quantityDetail;
    }

    /**
     * [set] QUANTITY_DETAIL: {bigint(19)} <br>
     * 注文商品の数量
     * @param quantityDetail The value of the column 'QUANTITY_DETAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuantityDetail(Long quantityDetail) {
        registerModifiedProperty("quantityDetail");
        _quantityDetail = quantityDetail;
    }

    /**
     * [get] SHIP_CHARGE: {bigint(19)} <br>
     * 送料
     * @return The value of the column 'SHIP_CHARGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShipCharge() {
        checkSpecifiedProperty("shipCharge");
        return _shipCharge;
    }

    /**
     * [set] SHIP_CHARGE: {bigint(19)} <br>
     * 送料
     * @param shipCharge The value of the column 'SHIP_CHARGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCharge(Long shipCharge) {
        registerModifiedProperty("shipCharge");
        _shipCharge = shipCharge;
    }

    /**
     * [get] PAY_CHARGE: {bigint(19)} <br>
     * 手数料
     * @return The value of the column 'PAY_CHARGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPayCharge() {
        checkSpecifiedProperty("payCharge");
        return _payCharge;
    }

    /**
     * [set] PAY_CHARGE: {bigint(19)} <br>
     * 手数料
     * @param payCharge The value of the column 'PAY_CHARGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPayCharge(Long payCharge) {
        registerModifiedProperty("payCharge");
        _payCharge = payCharge;
    }

    /**
     * [get] GIFT_WRAP_CHARGE: {bigint(19)} <br>
     * ギフト包装料
     * @return The value of the column 'GIFT_WRAP_CHARGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGiftWrapCharge() {
        checkSpecifiedProperty("giftWrapCharge");
        return _giftWrapCharge;
    }

    /**
     * [set] GIFT_WRAP_CHARGE: {bigint(19)} <br>
     * ギフト包装料
     * @param giftWrapCharge The value of the column 'GIFT_WRAP_CHARGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftWrapCharge(Long giftWrapCharge) {
        registerModifiedProperty("giftWrapCharge");
        _giftWrapCharge = giftWrapCharge;
    }

    /**
     * [get] DISCOUNT: {bigint(19)} <br>
     * 値引き
     * @return The value of the column 'DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDiscount() {
        checkSpecifiedProperty("discount");
        return _discount;
    }

    /**
     * [set] DISCOUNT: {bigint(19)} <br>
     * 値引き
     * @param discount The value of the column 'DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiscount(Long discount) {
        registerModifiedProperty("discount");
        _discount = discount;
    }

    /**
     * [get] ADJUSTMENTS: {bigint(19)} <br>
     * 調整額
     * @return The value of the column 'ADJUSTMENTS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustments() {
        checkSpecifiedProperty("adjustments");
        return _adjustments;
    }

    /**
     * [set] ADJUSTMENTS: {bigint(19)} <br>
     * 調整額
     * @param adjustments The value of the column 'ADJUSTMENTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustments(Long adjustments) {
        registerModifiedProperty("adjustments");
        _adjustments = adjustments;
    }

    /**
     * [get] USE_POINT: {bigint(19)} <br>
     * 利用ポイント合計
     * @return The value of the column 'USE_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsePoint() {
        checkSpecifiedProperty("usePoint");
        return _usePoint;
    }

    /**
     * [set] USE_POINT: {bigint(19)} <br>
     * 利用ポイント合計
     * @param usePoint The value of the column 'USE_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsePoint(Long usePoint) {
        registerModifiedProperty("usePoint");
        _usePoint = usePoint;
    }

    /**
     * [get] GET_POINT: {bigint(19)} <br>
     * 付与ポイント合計
     * @return The value of the column 'GET_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGetPoint() {
        checkSpecifiedProperty("getPoint");
        return _getPoint;
    }

    /**
     * [set] GET_POINT: {bigint(19)} <br>
     * 付与ポイント合計
     * @param getPoint The value of the column 'GET_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGetPoint(Long getPoint) {
        registerModifiedProperty("getPoint");
        _getPoint = getPoint;
    }

    /**
     * [get] TOTAL: {bigint(19)} <br>
     * 請求金額合計
     * @return The value of the column 'TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotal() {
        checkSpecifiedProperty("total");
        return _total;
    }

    /**
     * [set] TOTAL: {bigint(19)} <br>
     * 請求金額合計
     * @param total The value of the column 'TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotal(Long total) {
        registerModifiedProperty("total");
        _total = total;
    }

    /**
     * [get] TOTAL_PRICE: {bigint(19)} <br>
     * 注文金額合計
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {bigint(19)} <br>
     * 注文金額合計
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(Long totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] SHIPPING_C_DISCOUNT: {bigint(19)} <br>
     * 送料無料クーポン値引額
     * @return The value of the column 'SHIPPING_C_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingCDiscount() {
        checkSpecifiedProperty("shippingCDiscount");
        return _shippingCDiscount;
    }

    /**
     * [set] SHIPPING_C_DISCOUNT: {bigint(19)} <br>
     * 送料無料クーポン値引額
     * @param shippingCDiscount The value of the column 'SHIPPING_C_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingCDiscount(Long shippingCDiscount) {
        registerModifiedProperty("shippingCDiscount");
        _shippingCDiscount = shippingCDiscount;
    }

    /**
     * [get] ITEM_C_DISCOUNT: {bigint(19)} <br>
     * 定額・定率クーポン値引額
     * @return The value of the column 'ITEM_C_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getItemCDiscount() {
        checkSpecifiedProperty("itemCDiscount");
        return _itemCDiscount;
    }

    /**
     * [set] ITEM_C_DISCOUNT: {bigint(19)} <br>
     * 定額・定率クーポン値引額
     * @param itemCDiscount The value of the column 'ITEM_C_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCDiscount(Long itemCDiscount) {
        registerModifiedProperty("itemCDiscount");
        _itemCDiscount = itemCDiscount;
    }

    /**
     * [get] TOTAL_MALL_C_DISCOUNT: {bigint(19)} <br>
     * モールクーポン値引額
     * @return The value of the column 'TOTAL_MALL_C_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalMallCDiscount() {
        checkSpecifiedProperty("totalMallCDiscount");
        return _totalMallCDiscount;
    }

    /**
     * [set] TOTAL_MALL_C_DISCOUNT: {bigint(19)} <br>
     * モールクーポン値引額
     * @param totalMallCDiscount The value of the column 'TOTAL_MALL_C_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalMallCDiscount(Long totalMallCDiscount) {
        registerModifiedProperty("totalMallCDiscount");
        _totalMallCDiscount = totalMallCDiscount;
    }

    /**
     * [get] GET_POINT_CRG_TO_STORE: {bigint(19)} <br>
     * ストア負担ポイント合計
     * @return The value of the column 'GET_POINT_CRG_TO_STORE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGetPointCrgToStore() {
        checkSpecifiedProperty("getPointCrgToStore");
        return _getPointCrgToStore;
    }

    /**
     * [set] GET_POINT_CRG_TO_STORE: {bigint(19)} <br>
     * ストア負担ポイント合計
     * @param getPointCrgToStore The value of the column 'GET_POINT_CRG_TO_STORE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGetPointCrgToStore(Long getPointCrgToStore) {
        registerModifiedProperty("getPointCrgToStore");
        _getPointCrgToStore = getPointCrgToStore;
    }

    /**
     * [get] LINE_ID: {varchar(30)} <br>
     * Line ID
     * @return The value of the column 'LINE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineId() {
        checkSpecifiedProperty("lineId");
        return convertEmptyToNull(_lineId);
    }

    /**
     * [set] LINE_ID: {varchar(30)} <br>
     * Line ID
     * @param lineId The value of the column 'LINE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineId(String lineId) {
        registerModifiedProperty("lineId");
        _lineId = lineId;
    }

    /**
     * [get] QUANTITY: {bigint(19)} <br>
     * 数量
     * @return The value of the column 'QUANTITY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getQuantity() {
        checkSpecifiedProperty("quantity");
        return _quantity;
    }

    /**
     * [set] QUANTITY: {bigint(19)} <br>
     * 数量
     * @param quantity The value of the column 'QUANTITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuantity(Long quantity) {
        registerModifiedProperty("quantity");
        _quantity = quantity;
    }

    /**
     * [get] ITEM_ID: {varchar(30)} <br>
     * 商品CD
     * @return The value of the column 'ITEM_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemId() {
        checkSpecifiedProperty("itemId");
        return convertEmptyToNull(_itemId);
    }

    /**
     * [set] ITEM_ID: {varchar(30)} <br>
     * 商品CD
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemId(String itemId) {
        registerModifiedProperty("itemId");
        _itemId = itemId;
    }

    /**
     * [get] SUB_CODE: {varchar(30)} <br>
     * 商品サブCD
     * @return The value of the column 'SUB_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubCode() {
        checkSpecifiedProperty("subCode");
        return convertEmptyToNull(_subCode);
    }

    /**
     * [set] SUB_CODE: {varchar(30)} <br>
     * 商品サブCD
     * @param subCode The value of the column 'SUB_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubCode(String subCode) {
        registerModifiedProperty("subCode");
        _subCode = subCode;
    }

    /**
     * [get] TITLE: {varchar(255)} <br>
     * 商品名
     * @return The value of the column 'TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return convertEmptyToNull(_title);
    }

    /**
     * [set] TITLE: {varchar(255)} <br>
     * 商品名
     * @param title The value of the column 'TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] ITEM_OPTION_NAME: {varchar(60)} <br>
     * 商品オプション名
     * @return The value of the column 'ITEM_OPTION_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemOptionName() {
        checkSpecifiedProperty("itemOptionName");
        return convertEmptyToNull(_itemOptionName);
    }

    /**
     * [set] ITEM_OPTION_NAME: {varchar(60)} <br>
     * 商品オプション名
     * @param itemOptionName The value of the column 'ITEM_OPTION_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemOptionName(String itemOptionName) {
        registerModifiedProperty("itemOptionName");
        _itemOptionName = itemOptionName;
    }

    /**
     * [get] ITEM_OPTION_VALUE: {varchar(60)} <br>
     * 商品オプション内容
     * @return The value of the column 'ITEM_OPTION_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemOptionValue() {
        checkSpecifiedProperty("itemOptionValue");
        return convertEmptyToNull(_itemOptionValue);
    }

    /**
     * [set] ITEM_OPTION_VALUE: {varchar(60)} <br>
     * 商品オプション内容
     * @param itemOptionValue The value of the column 'ITEM_OPTION_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemOptionValue(String itemOptionValue) {
        registerModifiedProperty("itemOptionValue");
        _itemOptionValue = itemOptionValue;
    }

    /**
     * [get] SUB_CODE_OPTION: {varchar(60)} <br>
     * 商品サブCDオプション内容文字列
     * @return The value of the column 'SUB_CODE_OPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubCodeOption() {
        checkSpecifiedProperty("subCodeOption");
        return convertEmptyToNull(_subCodeOption);
    }

    /**
     * [set] SUB_CODE_OPTION: {varchar(60)} <br>
     * 商品サブCDオプション内容文字列
     * @param subCodeOption The value of the column 'SUB_CODE_OPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubCodeOption(String subCodeOption) {
        registerModifiedProperty("subCodeOption");
        _subCodeOption = subCodeOption;
    }

    /**
     * [get] INSCRIPTION_NAME: {varchar(60)} <br>
     * インスクリプション番号
     * @return The value of the column 'INSCRIPTION_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getInscriptionName() {
        checkSpecifiedProperty("inscriptionName");
        return convertEmptyToNull(_inscriptionName);
    }

    /**
     * [set] INSCRIPTION_NAME: {varchar(60)} <br>
     * インスクリプション番号
     * @param inscriptionName The value of the column 'INSCRIPTION_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInscriptionName(String inscriptionName) {
        registerModifiedProperty("inscriptionName");
        _inscriptionName = inscriptionName;
    }

    /**
     * [get] INSCRIPTION_VALUE: {varchar(60)} <br>
     * インスクリプション内容
     * @return The value of the column 'INSCRIPTION_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInscriptionValue() {
        checkSpecifiedProperty("inscriptionValue");
        return convertEmptyToNull(_inscriptionValue);
    }

    /**
     * [set] INSCRIPTION_VALUE: {varchar(60)} <br>
     * インスクリプション内容
     * @param inscriptionValue The value of the column 'INSCRIPTION_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInscriptionValue(String inscriptionValue) {
        registerModifiedProperty("inscriptionValue");
        _inscriptionValue = inscriptionValue;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 商品販売価格
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 商品販売価格
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(Long unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] UNIT_GET_POINT: {bigint(19)} <br>
     * 注文付与ポイント
     * @return The value of the column 'UNIT_GET_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitGetPoint() {
        checkSpecifiedProperty("unitGetPoint");
        return _unitGetPoint;
    }

    /**
     * [set] UNIT_GET_POINT: {bigint(19)} <br>
     * 注文付与ポイント
     * @param unitGetPoint The value of the column 'UNIT_GET_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitGetPoint(Long unitGetPoint) {
        registerModifiedProperty("unitGetPoint");
        _unitGetPoint = unitGetPoint;
    }

    /**
     * [get] LINE_SUB_TOTAL: {bigint(19)} <br>
     * 商品毎の小計
     * @return The value of the column 'LINE_SUB_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineSubTotal() {
        checkSpecifiedProperty("lineSubTotal");
        return _lineSubTotal;
    }

    /**
     * [set] LINE_SUB_TOTAL: {bigint(19)} <br>
     * 商品毎の小計
     * @param lineSubTotal The value of the column 'LINE_SUB_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineSubTotal(Long lineSubTotal) {
        registerModifiedProperty("lineSubTotal");
        _lineSubTotal = lineSubTotal;
    }

    /**
     * [get] LINE_GET_POINT: {bigint(19)} <br>
     * 商品毎の付与ポイント小計
     * @return The value of the column 'LINE_GET_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineGetPoint() {
        checkSpecifiedProperty("lineGetPoint");
        return _lineGetPoint;
    }

    /**
     * [set] LINE_GET_POINT: {bigint(19)} <br>
     * 商品毎の付与ポイント小計
     * @param lineGetPoint The value of the column 'LINE_GET_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineGetPoint(Long lineGetPoint) {
        registerModifiedProperty("lineGetPoint");
        _lineGetPoint = lineGetPoint;
    }

    /**
     * [get] POINT_FSP_CODE: {varchar(30)} <br>
     * 商品付与ポイントCD
     * @return The value of the column 'POINT_FSP_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPointFspCode() {
        checkSpecifiedProperty("pointFspCode");
        return convertEmptyToNull(_pointFspCode);
    }

    /**
     * [set] POINT_FSP_CODE: {varchar(30)} <br>
     * 商品付与ポイントCD
     * @param pointFspCode The value of the column 'POINT_FSP_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointFspCode(String pointFspCode) {
        registerModifiedProperty("pointFspCode");
        _pointFspCode = pointFspCode;
    }

    /**
     * [get] ITEM_CONDITION: {varchar(30)} <br>
     * 商品状態
     * @return The value of the column 'ITEM_CONDITION'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCondition() {
        checkSpecifiedProperty("itemCondition");
        return convertEmptyToNull(_itemCondition);
    }

    /**
     * [set] ITEM_CONDITION: {varchar(30)} <br>
     * 商品状態
     * @param itemCondition The value of the column 'ITEM_CONDITION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCondition(String itemCondition) {
        registerModifiedProperty("itemCondition");
        _itemCondition = itemCondition;
    }

    /**
     * [get] COUPON_ID: {varchar(30)} <br>
     * クーポンID
     * @return The value of the column 'COUPON_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCouponId() {
        checkSpecifiedProperty("couponId");
        return convertEmptyToNull(_couponId);
    }

    /**
     * [set] COUPON_ID: {varchar(30)} <br>
     * クーポンID
     * @param couponId The value of the column 'COUPON_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCouponId(String couponId) {
        registerModifiedProperty("couponId");
        _couponId = couponId;
    }

    /**
     * [get] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用値引額
     * @return The value of the column 'COUPON_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCouponDiscount() {
        checkSpecifiedProperty("couponDiscount");
        return _couponDiscount;
    }

    /**
     * [set] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用値引額
     * @param couponDiscount The value of the column 'COUPON_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCouponDiscount(Long couponDiscount) {
        registerModifiedProperty("couponDiscount");
        _couponDiscount = couponDiscount;
    }

    /**
     * [get] ORIGINAL_PRICE: {bigint(19)} <br>
     * 値引き前単価
     * @return The value of the column 'ORIGINAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOriginalPrice() {
        checkSpecifiedProperty("originalPrice");
        return _originalPrice;
    }

    /**
     * [set] ORIGINAL_PRICE: {bigint(19)} <br>
     * 値引き前単価
     * @param originalPrice The value of the column 'ORIGINAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalPrice(Long originalPrice) {
        registerModifiedProperty("originalPrice");
        _originalPrice = originalPrice;
    }

    /**
     * [get] IS_GET_POINT_FIX: {varchar(30)} <br>
     * ポイント確定状態
     * @return The value of the column 'IS_GET_POINT_FIX'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsGetPointFix() {
        checkSpecifiedProperty("isGetPointFix");
        return convertEmptyToNull(_isGetPointFix);
    }

    /**
     * [set] IS_GET_POINT_FIX: {varchar(30)} <br>
     * ポイント確定状態
     * @param isGetPointFix The value of the column 'IS_GET_POINT_FIX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsGetPointFix(String isGetPointFix) {
        registerModifiedProperty("isGetPointFix");
        _isGetPointFix = isGetPointFix;
    }

    /**
     * [get] GET_POINT_FIX_DATE: {varchar(30)} <br>
     * ポイント確定予定日
     * @return The value of the column 'GET_POINT_FIX_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGetPointFixDate() {
        checkSpecifiedProperty("getPointFixDate");
        return convertEmptyToNull(_getPointFixDate);
    }

    /**
     * [set] GET_POINT_FIX_DATE: {varchar(30)} <br>
     * ポイント確定予定日
     * @param getPointFixDate The value of the column 'GET_POINT_FIX_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGetPointFixDate(String getPointFixDate) {
        registerModifiedProperty("getPointFixDate");
        _getPointFixDate = getPointFixDate;
    }

    /**
     * [get] RELEASE_DATE: {varchar(30)} <br>
     * 発売日
     * @return The value of the column 'RELEASE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReleaseDate() {
        checkSpecifiedProperty("releaseDate");
        return convertEmptyToNull(_releaseDate);
    }

    /**
     * [set] RELEASE_DATE: {varchar(30)} <br>
     * 発売日
     * @param releaseDate The value of the column 'RELEASE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReleaseDate(String releaseDate) {
        registerModifiedProperty("releaseDate");
        _releaseDate = releaseDate;
    }

    /**
     * [get] GET_POINT_TYPE: {varchar(30)} <br>
     * 付与ポイント種別
     * @return The value of the column 'GET_POINT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGetPointType() {
        checkSpecifiedProperty("getPointType");
        return convertEmptyToNull(_getPointType);
    }

    /**
     * [set] GET_POINT_TYPE: {varchar(30)} <br>
     * 付与ポイント種別
     * @param getPointType The value of the column 'GET_POINT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGetPointType(String getPointType) {
        registerModifiedProperty("getPointType");
        _getPointType = getPointType;
    }

    /**
     * [get] JAN: {varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN'. (NullAllowed even if selected: for no constraint)
     */
    public String getJan() {
        checkSpecifiedProperty("jan");
        return convertEmptyToNull(_jan);
    }

    /**
     * [set] JAN: {varchar(30)} <br>
     * JANCD
     * @param jan The value of the column 'JAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJan(String jan) {
        registerModifiedProperty("jan");
        _jan = jan;
    }

    /**
     * [get] PRODUCT_ID: {varchar(30)} <br>
     * 製品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductId() {
        checkSpecifiedProperty("productId");
        return convertEmptyToNull(_productId);
    }

    /**
     * [set] PRODUCT_ID: {varchar(30)} <br>
     * 製品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(String productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] POINT_CHARGED_TO_STORE: {bigint(19)} <br>
     * 商品毎ストア負担ポイント小計
     * @return The value of the column 'POINT_CHARGED_TO_STORE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPointChargedToStore() {
        checkSpecifiedProperty("pointChargedToStore");
        return _pointChargedToStore;
    }

    /**
     * [set] POINT_CHARGED_TO_STORE: {bigint(19)} <br>
     * 商品毎ストア負担ポイント小計
     * @param pointChargedToStore The value of the column 'POINT_CHARGED_TO_STORE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointChargedToStore(Long pointChargedToStore) {
        registerModifiedProperty("pointChargedToStore");
        _pointChargedToStore = pointChargedToStore;
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
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getImportTypeId() {
        checkSpecifiedProperty("importTypeId");
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {bigint(19)} <br>
     * 取込種別ID
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
