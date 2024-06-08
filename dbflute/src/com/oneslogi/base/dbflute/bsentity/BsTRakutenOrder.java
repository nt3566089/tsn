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
 * The entity of T_RAKUTEN_ORDER as TABLE. <br>
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
 * Long rakutenOrderId = entity.getRakutenOrderId();
 * String orderNo = entity.getOrderNo();
 * String orderStatus = entity.getOrderStatus();
 * String cardStatus = entity.getCardStatus();
 * String paymentDt = entity.getPaymentDt();
 * String shippingDt = entity.getShippingDt();
 * String delivTz = entity.getDelivTz();
 * String delivDt = entity.getDelivDt();
 * String personInCharge = entity.getPersonInCharge();
 * String singleMemo = entity.getSingleMemo();
 * String mailInput = entity.getMailInput();
 * Long firstPayment = entity.getFirstPayment();
 * String terminal = entity.getTerminal();
 * String mailCarrierCd = entity.getMailCarrierCd();
 * String giftFlg = entity.getGiftFlg();
 * String rakutenOrderComment = entity.getRakutenOrderComment();
 * String orderDatetime = entity.getOrderDatetime();
 * String multiDelivFlg = entity.getMultiDelivFlg();
 * String alertFlg = entity.getAlertFlg();
 * String memberFlg = entity.getMemberFlg();
 * Long total = entity.getTotal();
 * Long tax = entity.getTax();
 * Long carriage = entity.getCarriage();
 * Long cod = entity.getCod();
 * Long amountBilled = entity.getAmountBilled();
 * Long totalAmount = entity.getTotalAmount();
 * String combineId = entity.getCombineId();
 * String combineStatus = entity.getCombineStatus();
 * Long combineTotal = entity.getCombineTotal();
 * Long combineCarriage = entity.getCombineCarriage();
 * Long combineCod = entity.getCombineCod();
 * Long combineTax = entity.getCombineTax();
 * Long combineBilled = entity.getCombineBilled();
 * Long combineAmount = entity.getCombineAmount();
 * Long combineBankFee = entity.getCombineBankFee();
 * Long combinePointUse = entity.getCombinePointUse();
 * String mailFlg = entity.getMailFlg();
 * String orderDt = entity.getOrderDt();
 * String orderTime = entity.getOrderTime();
 * String mobilePaymentNo = entity.getMobilePaymentNo();
 * String historyModFlg = entity.getHistoryModFlg();
 * String historyIconFlg = entity.getHistoryIconFlg();
 * String historyMailFlg = entity.getHistoryMailFlg();
 * String delivMatchFlg = entity.getDelivMatchFlg();
 * String pointUseFlg = entity.getPointUseFlg();
 * String orderZipCd1 = entity.getOrderZipCd1();
 * String orderZipCd2 = entity.getOrderZipCd2();
 * String orderAddress1 = entity.getOrderAddress1();
 * String orderAddress2 = entity.getOrderAddress2();
 * String orderAddress3 = entity.getOrderAddress3();
 * String orderCustomerNm1 = entity.getOrderCustomerNm1();
 * String orderCustomerNm2 = entity.getOrderCustomerNm2();
 * String orderCustomerKn1 = entity.getOrderCustomerKn1();
 * String orderCustomerKn2 = entity.getOrderCustomerKn2();
 * String orderTelNo1 = entity.getOrderTelNo1();
 * String orderTelNo2 = entity.getOrderTelNo2();
 * String orderTelNo3 = entity.getOrderTelNo3();
 * String mailAddress = entity.getMailAddress();
 * String orderSex = entity.getOrderSex();
 * String orderBirthday = entity.getOrderBirthday();
 * String paymentMethod = entity.getPaymentMethod();
 * String cardType = entity.getCardType();
 * String cardNo = entity.getCardNo();
 * String cardNm = entity.getCardNm();
 * String cardAvailable = entity.getCardAvailable();
 * String cardInst = entity.getCardInst();
 * String cardInstComment = entity.getCardInstComment();
 * String delivMethod = entity.getDelivMethod();
 * String delivType = entity.getDelivType();
 * Long pointUse = entity.getPointUse();
 * String pointCondition = entity.getPointCondition();
 * String pointStatus = entity.getPointStatus();
 * String bankStatus = entity.getBankStatus();
 * String bankFeeFlg = entity.getBankFeeFlg();
 * Long bankFee = entity.getBankFee();
 * String wrappingTitleP = entity.getWrappingTitleP();
 * String wrappingNmP = entity.getWrappingNmP();
 * Long wrappingFeeP = entity.getWrappingFeeP();
 * Long wrappingTaxP = entity.getWrappingTaxP();
 * String wrappingTitleR = entity.getWrappingTitleR();
 * String wrappingNmR = entity.getWrappingNmR();
 * Long wrappingFeeR = entity.getWrappingFeeR();
 * Long wrappingTaxR = entity.getWrappingTaxR();
 * Long delivCarriage = entity.getDelivCarriage();
 * Long delivCod = entity.getDelivCod();
 * Long delivTax = entity.getDelivTax();
 * String carrierTraceNum = entity.getCarrierTraceNum();
 * Long delivTotal = entity.getDelivTotal();
 * String noshi = entity.getNoshi();
 * String delivZipCd1 = entity.getDelivZipCd1();
 * String delivZipCd2 = entity.getDelivZipCd2();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivCustomerNm1 = entity.getDelivCustomerNm1();
 * String delivCustomerNm2 = entity.getDelivCustomerNm2();
 * String delivCustomerKn1 = entity.getDelivCustomerKn1();
 * String delivCustomerKn2 = entity.getDelivCustomerKn2();
 * String delivTelNo1 = entity.getDelivTelNo1();
 * String delivTelNo2 = entity.getDelivTelNo2();
 * String delivTelNo3 = entity.getDelivTelNo3();
 * String productId = entity.getProductId();
 * String productNm = entity.getProductNm();
 * String productNo = entity.getProductNo();
 * String productUrl = entity.getProductUrl();
 * Long unitPrice = entity.getUnitPrice();
 * Long orderNum = entity.getOrderNum();
 * Long productCarriage = entity.getProductCarriage();
 * Long productTax = entity.getProductTax();
 * Long productCod = entity.getProductCod();
 * String itemChoice = entity.getItemChoice();
 * java.math.BigDecimal pointScale = entity.getPointScale();
 * String pointType = entity.getPointType();
 * Long recordNumber = entity.getRecordNumber();
 * String deliveryInfo = entity.getDeliveryInfo();
 * String stockType = entity.getStockType();
 * String wrappingTypeP = entity.getWrappingTypeP();
 * String wrappingTypeR = entity.getWrappingTypeR();
 * String tomorrowFlg = entity.getTomorrowFlg();
 * Long couponUse = entity.getCouponUse();
 * Long shopCouponUse = entity.getShopCouponUse();
 * Long rakutenCouponUse = entity.getRakutenCouponUse();
 * Long combineCouponUse = entity.getCombineCouponUse();
 * String delivCompany = entity.getDelivCompany();
 * String phamaceFlg = entity.getPhamaceFlg();
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
 * entity.setRakutenOrderId(rakutenOrderId);
 * entity.setOrderNo(orderNo);
 * entity.setOrderStatus(orderStatus);
 * entity.setCardStatus(cardStatus);
 * entity.setPaymentDt(paymentDt);
 * entity.setShippingDt(shippingDt);
 * entity.setDelivTz(delivTz);
 * entity.setDelivDt(delivDt);
 * entity.setPersonInCharge(personInCharge);
 * entity.setSingleMemo(singleMemo);
 * entity.setMailInput(mailInput);
 * entity.setFirstPayment(firstPayment);
 * entity.setTerminal(terminal);
 * entity.setMailCarrierCd(mailCarrierCd);
 * entity.setGiftFlg(giftFlg);
 * entity.setRakutenOrderComment(rakutenOrderComment);
 * entity.setOrderDatetime(orderDatetime);
 * entity.setMultiDelivFlg(multiDelivFlg);
 * entity.setAlertFlg(alertFlg);
 * entity.setMemberFlg(memberFlg);
 * entity.setTotal(total);
 * entity.setTax(tax);
 * entity.setCarriage(carriage);
 * entity.setCod(cod);
 * entity.setAmountBilled(amountBilled);
 * entity.setTotalAmount(totalAmount);
 * entity.setCombineId(combineId);
 * entity.setCombineStatus(combineStatus);
 * entity.setCombineTotal(combineTotal);
 * entity.setCombineCarriage(combineCarriage);
 * entity.setCombineCod(combineCod);
 * entity.setCombineTax(combineTax);
 * entity.setCombineBilled(combineBilled);
 * entity.setCombineAmount(combineAmount);
 * entity.setCombineBankFee(combineBankFee);
 * entity.setCombinePointUse(combinePointUse);
 * entity.setMailFlg(mailFlg);
 * entity.setOrderDt(orderDt);
 * entity.setOrderTime(orderTime);
 * entity.setMobilePaymentNo(mobilePaymentNo);
 * entity.setHistoryModFlg(historyModFlg);
 * entity.setHistoryIconFlg(historyIconFlg);
 * entity.setHistoryMailFlg(historyMailFlg);
 * entity.setDelivMatchFlg(delivMatchFlg);
 * entity.setPointUseFlg(pointUseFlg);
 * entity.setOrderZipCd1(orderZipCd1);
 * entity.setOrderZipCd2(orderZipCd2);
 * entity.setOrderAddress1(orderAddress1);
 * entity.setOrderAddress2(orderAddress2);
 * entity.setOrderAddress3(orderAddress3);
 * entity.setOrderCustomerNm1(orderCustomerNm1);
 * entity.setOrderCustomerNm2(orderCustomerNm2);
 * entity.setOrderCustomerKn1(orderCustomerKn1);
 * entity.setOrderCustomerKn2(orderCustomerKn2);
 * entity.setOrderTelNo1(orderTelNo1);
 * entity.setOrderTelNo2(orderTelNo2);
 * entity.setOrderTelNo3(orderTelNo3);
 * entity.setMailAddress(mailAddress);
 * entity.setOrderSex(orderSex);
 * entity.setOrderBirthday(orderBirthday);
 * entity.setPaymentMethod(paymentMethod);
 * entity.setCardType(cardType);
 * entity.setCardNo(cardNo);
 * entity.setCardNm(cardNm);
 * entity.setCardAvailable(cardAvailable);
 * entity.setCardInst(cardInst);
 * entity.setCardInstComment(cardInstComment);
 * entity.setDelivMethod(delivMethod);
 * entity.setDelivType(delivType);
 * entity.setPointUse(pointUse);
 * entity.setPointCondition(pointCondition);
 * entity.setPointStatus(pointStatus);
 * entity.setBankStatus(bankStatus);
 * entity.setBankFeeFlg(bankFeeFlg);
 * entity.setBankFee(bankFee);
 * entity.setWrappingTitleP(wrappingTitleP);
 * entity.setWrappingNmP(wrappingNmP);
 * entity.setWrappingFeeP(wrappingFeeP);
 * entity.setWrappingTaxP(wrappingTaxP);
 * entity.setWrappingTitleR(wrappingTitleR);
 * entity.setWrappingNmR(wrappingNmR);
 * entity.setWrappingFeeR(wrappingFeeR);
 * entity.setWrappingTaxR(wrappingTaxR);
 * entity.setDelivCarriage(delivCarriage);
 * entity.setDelivCod(delivCod);
 * entity.setDelivTax(delivTax);
 * entity.setCarrierTraceNum(carrierTraceNum);
 * entity.setDelivTotal(delivTotal);
 * entity.setNoshi(noshi);
 * entity.setDelivZipCd1(delivZipCd1);
 * entity.setDelivZipCd2(delivZipCd2);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivCustomerNm1(delivCustomerNm1);
 * entity.setDelivCustomerNm2(delivCustomerNm2);
 * entity.setDelivCustomerKn1(delivCustomerKn1);
 * entity.setDelivCustomerKn2(delivCustomerKn2);
 * entity.setDelivTelNo1(delivTelNo1);
 * entity.setDelivTelNo2(delivTelNo2);
 * entity.setDelivTelNo3(delivTelNo3);
 * entity.setProductId(productId);
 * entity.setProductNm(productNm);
 * entity.setProductNo(productNo);
 * entity.setProductUrl(productUrl);
 * entity.setUnitPrice(unitPrice);
 * entity.setOrderNum(orderNum);
 * entity.setProductCarriage(productCarriage);
 * entity.setProductTax(productTax);
 * entity.setProductCod(productCod);
 * entity.setItemChoice(itemChoice);
 * entity.setPointScale(pointScale);
 * entity.setPointType(pointType);
 * entity.setRecordNumber(recordNumber);
 * entity.setDeliveryInfo(deliveryInfo);
 * entity.setStockType(stockType);
 * entity.setWrappingTypeP(wrappingTypeP);
 * entity.setWrappingTypeR(wrappingTypeR);
 * entity.setTomorrowFlg(tomorrowFlg);
 * entity.setCouponUse(couponUse);
 * entity.setShopCouponUse(shopCouponUse);
 * entity.setRakutenCouponUse(rakutenCouponUse);
 * entity.setCombineCouponUse(combineCouponUse);
 * entity.setDelivCompany(delivCompany);
 * entity.setPhamaceFlg(phamaceFlg);
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
public abstract class BsTRakutenOrder extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _rakutenOrderId;

    /** ORDER_NO: {varchar(100)} */
    protected String _orderNo;

    /** ORDER_STATUS: {varchar(30)} */
    protected String _orderStatus;

    /** CARD_STATUS: {varchar(30)} */
    protected String _cardStatus;

    /** PAYMENT_DT: {varchar(30)} */
    protected String _paymentDt;

    /** SHIPPING_DT: {varchar(30)} */
    protected String _shippingDt;

    /** DELIV_TZ: {varchar(30)} */
    protected String _delivTz;

    /** DELIV_DT: {varchar(30)} */
    protected String _delivDt;

    /** PERSON_IN_CHARGE: {varchar(30)} */
    protected String _personInCharge;

    /** SINGLE_MEMO: {varchar(255)} */
    protected String _singleMemo;

    /** MAIL_INPUT: {varchar(255)} */
    protected String _mailInput;

    /** FIRST_PAYMENT: {bigint(19)} */
    protected Long _firstPayment;

    /** TERMINAL: {varchar(100)} */
    protected String _terminal;

    /** MAIL_CARRIER_CD: {varchar(30)} */
    protected String _mailCarrierCd;

    /** GIFT_FLG: {char(1)} */
    protected String _giftFlg;

    /** RAKUTEN_ORDER_COMMENT: {varchar(255)} */
    protected String _rakutenOrderComment;

    /** ORDER_DATETIME: {varchar(30)} */
    protected String _orderDatetime;

    /** MULTI_DELIV_FLG: {char(1)} */
    protected String _multiDelivFlg;

    /** ALERT_FLG: {char(1)} */
    protected String _alertFlg;

    /** MEMBER_FLG: {char(1)} */
    protected String _memberFlg;

    /** TOTAL: {bigint(19)} */
    protected Long _total;

    /** TAX: {bigint(19)} */
    protected Long _tax;

    /** CARRIAGE: {bigint(19)} */
    protected Long _carriage;

    /** COD: {bigint(19)} */
    protected Long _cod;

    /** AMOUNT_BILLED: {bigint(19)} */
    protected Long _amountBilled;

    /** TOTAL_AMOUNT: {bigint(19)} */
    protected Long _totalAmount;

    /** COMBINE_ID: {varchar(30)} */
    protected String _combineId;

    /** COMBINE_STATUS: {varchar(30)} */
    protected String _combineStatus;

    /** COMBINE_TOTAL: {bigint(19)} */
    protected Long _combineTotal;

    /** COMBINE_CARRIAGE: {bigint(19)} */
    protected Long _combineCarriage;

    /** COMBINE_COD: {bigint(19)} */
    protected Long _combineCod;

    /** COMBINE_TAX: {bigint(19)} */
    protected Long _combineTax;

    /** COMBINE_BILLED: {bigint(19)} */
    protected Long _combineBilled;

    /** COMBINE_AMOUNT: {bigint(19)} */
    protected Long _combineAmount;

    /** COMBINE_BANK_FEE: {bigint(19)} */
    protected Long _combineBankFee;

    /** COMBINE_POINT_USE: {bigint(19)} */
    protected Long _combinePointUse;

    /** MAIL_FLG: {char(1)} */
    protected String _mailFlg;

    /** ORDER_DT: {varchar(30)} */
    protected String _orderDt;

    /** ORDER_TIME: {varchar(30)} */
    protected String _orderTime;

    /** MOBILE_PAYMENT_NO: {varchar(30)} */
    protected String _mobilePaymentNo;

    /** HISTORY_MOD_FLG: {varchar(30)} */
    protected String _historyModFlg;

    /** HISTORY_ICON_FLG: {char(1)} */
    protected String _historyIconFlg;

    /** HISTORY_MAIL_FLG: {char(1)} */
    protected String _historyMailFlg;

    /** DELIV_MATCH_FLG: {char(1)} */
    protected String _delivMatchFlg;

    /** POINT_USE_FLG: {char(1)} */
    protected String _pointUseFlg;

    /** ORDER_ZIP_CD1: {varchar(30)} */
    protected String _orderZipCd1;

    /** ORDER_ZIP_CD2: {varchar(30)} */
    protected String _orderZipCd2;

    /** ORDER_ADDRESS1: {varchar(255)} */
    protected String _orderAddress1;

    /** ORDER_ADDRESS2: {varchar(255)} */
    protected String _orderAddress2;

    /** ORDER_ADDRESS3: {varchar(255)} */
    protected String _orderAddress3;

    /** ORDER_CUSTOMER_NM1: {varchar(255)} */
    protected String _orderCustomerNm1;

    /** ORDER_CUSTOMER_NM2: {varchar(255)} */
    protected String _orderCustomerNm2;

    /** ORDER_CUSTOMER_KN1: {varchar(255)} */
    protected String _orderCustomerKn1;

    /** ORDER_CUSTOMER_KN2: {varchar(255)} */
    protected String _orderCustomerKn2;

    /** ORDER_TEL_NO1: {varchar(255)} */
    protected String _orderTelNo1;

    /** ORDER_TEL_NO2: {varchar(255)} */
    protected String _orderTelNo2;

    /** ORDER_TEL_NO3: {varchar(255)} */
    protected String _orderTelNo3;

    /** MAIL_ADDRESS: {varchar(255)} */
    protected String _mailAddress;

    /** ORDER_SEX: {varchar(30)} */
    protected String _orderSex;

    /** ORDER_BIRTHDAY: {varchar(30)} */
    protected String _orderBirthday;

    /** PAYMENT_METHOD: {varchar(255)} */
    protected String _paymentMethod;

    /** CARD_TYPE: {varchar(100)} */
    protected String _cardType;

    /** CARD_NO: {varchar(255)} */
    protected String _cardNo;

    /** CARD_NM: {varchar(255)} */
    protected String _cardNm;

    /** CARD_AVAILABLE: {varchar(255)} */
    protected String _cardAvailable;

    /** CARD_INST: {varchar(30)} */
    protected String _cardInst;

    /** CARD_INST_COMMENT: {varchar(255)} */
    protected String _cardInstComment;

    /** DELIV_METHOD: {varchar(255)} */
    protected String _delivMethod;

    /** DELIV_TYPE: {varchar(255)} */
    protected String _delivType;

    /** POINT_USE: {bigint(19)} */
    protected Long _pointUse;

    /** POINT_CONDITION: {varchar(30)} */
    protected String _pointCondition;

    /** POINT_STATUS: {varchar(30)} */
    protected String _pointStatus;

    /** BANK_STATUS: {varchar(30)} */
    protected String _bankStatus;

    /** BANK_FEE_FLG: {char(1)} */
    protected String _bankFeeFlg;

    /** BANK_FEE: {bigint(19)} */
    protected Long _bankFee;

    /** WRAPPING_TITLE_P: {varchar(255)} */
    protected String _wrappingTitleP;

    /** WRAPPING_NM_P: {varchar(255)} */
    protected String _wrappingNmP;

    /** WRAPPING_FEE_P: {bigint(19)} */
    protected Long _wrappingFeeP;

    /** WRAPPING_TAX_P: {bigint(19)} */
    protected Long _wrappingTaxP;

    /** WRAPPING_TITLE_R: {varchar(255)} */
    protected String _wrappingTitleR;

    /** WRAPPING_NM_R: {varchar(255)} */
    protected String _wrappingNmR;

    /** WRAPPING_FEE_R: {bigint(19)} */
    protected Long _wrappingFeeR;

    /** WRAPPING_TAX_R: {bigint(19)} */
    protected Long _wrappingTaxR;

    /** DELIV_CARRIAGE: {bigint(19)} */
    protected Long _delivCarriage;

    /** DELIV_COD: {bigint(19)} */
    protected Long _delivCod;

    /** DELIV_TAX: {bigint(19)} */
    protected Long _delivTax;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    protected String _carrierTraceNum;

    /** DELIV_TOTAL: {bigint(19)} */
    protected Long _delivTotal;

    /** NOSHI: {varchar(255)} */
    protected String _noshi;

    /** DELIV_ZIP_CD1: {varchar(30)} */
    protected String _delivZipCd1;

    /** DELIV_ZIP_CD2: {varchar(30)} */
    protected String _delivZipCd2;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** DELIV_CUSTOMER_NM1: {varchar(255)} */
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {varchar(255)} */
    protected String _delivCustomerNm2;

    /** DELIV_CUSTOMER_KN1: {varchar(255)} */
    protected String _delivCustomerKn1;

    /** DELIV_CUSTOMER_KN2: {varchar(255)} */
    protected String _delivCustomerKn2;

    /** DELIV_TEL_NO1: {varchar(255)} */
    protected String _delivTelNo1;

    /** DELIV_TEL_NO2: {varchar(255)} */
    protected String _delivTelNo2;

    /** DELIV_TEL_NO3: {varchar(255)} */
    protected String _delivTelNo3;

    /** PRODUCT_ID: {varchar(30)} */
    protected String _productId;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PRODUCT_NO: {varchar(100)} */
    protected String _productNo;

    /** PRODUCT_URL: {varchar(100)} */
    protected String _productUrl;

    /** UNIT_PRICE: {bigint(19)} */
    protected Long _unitPrice;

    /** ORDER_NUM: {bigint(19)} */
    protected Long _orderNum;

    /** PRODUCT_CARRIAGE: {bigint(19)} */
    protected Long _productCarriage;

    /** PRODUCT_TAX: {bigint(19)} */
    protected Long _productTax;

    /** PRODUCT_COD: {bigint(19)} */
    protected Long _productCod;

    /** ITEM_CHOICE: {varchar(255)} */
    protected String _itemChoice;

    /** POINT_SCALE: {decimal(16, 6)} */
    protected java.math.BigDecimal _pointScale;

    /** POINT_TYPE: {varchar(100)} */
    protected String _pointType;

    /** RECORD_NUMBER: {bigint(19)} */
    protected Long _recordNumber;

    /** DELIVERY_INFO: {varchar(100)} */
    protected String _deliveryInfo;

    /** STOCK_TYPE: {varchar(100)} */
    protected String _stockType;

    /** WRAPPING_TYPE_P: {varchar(255)} */
    protected String _wrappingTypeP;

    /** WRAPPING_TYPE_R: {varchar(255)} */
    protected String _wrappingTypeR;

    /** TOMORROW_FLG: {varchar(30)} */
    protected String _tomorrowFlg;

    /** COUPON_USE: {bigint(19)} */
    protected Long _couponUse;

    /** SHOP_COUPON_USE: {bigint(19)} */
    protected Long _shopCouponUse;

    /** RAKUTEN_COUPON_USE: {bigint(19)} */
    protected Long _rakutenCouponUse;

    /** COMBINE_COUPON_USE: {bigint(19)} */
    protected Long _combineCouponUse;

    /** DELIV_COMPANY: {varchar(255)} */
    protected String _delivCompany;

    /** PHAMACE_FLG: {char(1)} */
    protected String _phamaceFlg;

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
        return "T_RAKUTEN_ORDER";
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
        if (_rakutenOrderId == null) { return false; }
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
        if (obj instanceof BsTRakutenOrder) {
            BsTRakutenOrder other = (BsTRakutenOrder)obj;
            if (!xSV(_rakutenOrderId, other._rakutenOrderId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _rakutenOrderId);
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
        sb.append(dm).append(xfND(_rakutenOrderId));
        sb.append(dm).append(xfND(_orderNo));
        sb.append(dm).append(xfND(_orderStatus));
        sb.append(dm).append(xfND(_cardStatus));
        sb.append(dm).append(xfND(_paymentDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_personInCharge));
        sb.append(dm).append(xfND(_singleMemo));
        sb.append(dm).append(xfND(_mailInput));
        sb.append(dm).append(xfND(_firstPayment));
        sb.append(dm).append(xfND(_terminal));
        sb.append(dm).append(xfND(_mailCarrierCd));
        sb.append(dm).append(xfND(_giftFlg));
        sb.append(dm).append(xfND(_rakutenOrderComment));
        sb.append(dm).append(xfND(_orderDatetime));
        sb.append(dm).append(xfND(_multiDelivFlg));
        sb.append(dm).append(xfND(_alertFlg));
        sb.append(dm).append(xfND(_memberFlg));
        sb.append(dm).append(xfND(_total));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_carriage));
        sb.append(dm).append(xfND(_cod));
        sb.append(dm).append(xfND(_amountBilled));
        sb.append(dm).append(xfND(_totalAmount));
        sb.append(dm).append(xfND(_combineId));
        sb.append(dm).append(xfND(_combineStatus));
        sb.append(dm).append(xfND(_combineTotal));
        sb.append(dm).append(xfND(_combineCarriage));
        sb.append(dm).append(xfND(_combineCod));
        sb.append(dm).append(xfND(_combineTax));
        sb.append(dm).append(xfND(_combineBilled));
        sb.append(dm).append(xfND(_combineAmount));
        sb.append(dm).append(xfND(_combineBankFee));
        sb.append(dm).append(xfND(_combinePointUse));
        sb.append(dm).append(xfND(_mailFlg));
        sb.append(dm).append(xfND(_orderDt));
        sb.append(dm).append(xfND(_orderTime));
        sb.append(dm).append(xfND(_mobilePaymentNo));
        sb.append(dm).append(xfND(_historyModFlg));
        sb.append(dm).append(xfND(_historyIconFlg));
        sb.append(dm).append(xfND(_historyMailFlg));
        sb.append(dm).append(xfND(_delivMatchFlg));
        sb.append(dm).append(xfND(_pointUseFlg));
        sb.append(dm).append(xfND(_orderZipCd1));
        sb.append(dm).append(xfND(_orderZipCd2));
        sb.append(dm).append(xfND(_orderAddress1));
        sb.append(dm).append(xfND(_orderAddress2));
        sb.append(dm).append(xfND(_orderAddress3));
        sb.append(dm).append(xfND(_orderCustomerNm1));
        sb.append(dm).append(xfND(_orderCustomerNm2));
        sb.append(dm).append(xfND(_orderCustomerKn1));
        sb.append(dm).append(xfND(_orderCustomerKn2));
        sb.append(dm).append(xfND(_orderTelNo1));
        sb.append(dm).append(xfND(_orderTelNo2));
        sb.append(dm).append(xfND(_orderTelNo3));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_orderSex));
        sb.append(dm).append(xfND(_orderBirthday));
        sb.append(dm).append(xfND(_paymentMethod));
        sb.append(dm).append(xfND(_cardType));
        sb.append(dm).append(xfND(_cardNo));
        sb.append(dm).append(xfND(_cardNm));
        sb.append(dm).append(xfND(_cardAvailable));
        sb.append(dm).append(xfND(_cardInst));
        sb.append(dm).append(xfND(_cardInstComment));
        sb.append(dm).append(xfND(_delivMethod));
        sb.append(dm).append(xfND(_delivType));
        sb.append(dm).append(xfND(_pointUse));
        sb.append(dm).append(xfND(_pointCondition));
        sb.append(dm).append(xfND(_pointStatus));
        sb.append(dm).append(xfND(_bankStatus));
        sb.append(dm).append(xfND(_bankFeeFlg));
        sb.append(dm).append(xfND(_bankFee));
        sb.append(dm).append(xfND(_wrappingTitleP));
        sb.append(dm).append(xfND(_wrappingNmP));
        sb.append(dm).append(xfND(_wrappingFeeP));
        sb.append(dm).append(xfND(_wrappingTaxP));
        sb.append(dm).append(xfND(_wrappingTitleR));
        sb.append(dm).append(xfND(_wrappingNmR));
        sb.append(dm).append(xfND(_wrappingFeeR));
        sb.append(dm).append(xfND(_wrappingTaxR));
        sb.append(dm).append(xfND(_delivCarriage));
        sb.append(dm).append(xfND(_delivCod));
        sb.append(dm).append(xfND(_delivTax));
        sb.append(dm).append(xfND(_carrierTraceNum));
        sb.append(dm).append(xfND(_delivTotal));
        sb.append(dm).append(xfND(_noshi));
        sb.append(dm).append(xfND(_delivZipCd1));
        sb.append(dm).append(xfND(_delivZipCd2));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivCustomerNm1));
        sb.append(dm).append(xfND(_delivCustomerNm2));
        sb.append(dm).append(xfND(_delivCustomerKn1));
        sb.append(dm).append(xfND(_delivCustomerKn2));
        sb.append(dm).append(xfND(_delivTelNo1));
        sb.append(dm).append(xfND(_delivTelNo2));
        sb.append(dm).append(xfND(_delivTelNo3));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productNo));
        sb.append(dm).append(xfND(_productUrl));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_orderNum));
        sb.append(dm).append(xfND(_productCarriage));
        sb.append(dm).append(xfND(_productTax));
        sb.append(dm).append(xfND(_productCod));
        sb.append(dm).append(xfND(_itemChoice));
        sb.append(dm).append(xfND(_pointScale));
        sb.append(dm).append(xfND(_pointType));
        sb.append(dm).append(xfND(_recordNumber));
        sb.append(dm).append(xfND(_deliveryInfo));
        sb.append(dm).append(xfND(_stockType));
        sb.append(dm).append(xfND(_wrappingTypeP));
        sb.append(dm).append(xfND(_wrappingTypeR));
        sb.append(dm).append(xfND(_tomorrowFlg));
        sb.append(dm).append(xfND(_couponUse));
        sb.append(dm).append(xfND(_shopCouponUse));
        sb.append(dm).append(xfND(_rakutenCouponUse));
        sb.append(dm).append(xfND(_combineCouponUse));
        sb.append(dm).append(xfND(_delivCompany));
        sb.append(dm).append(xfND(_phamaceFlg));
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
    public TRakutenOrder clone() {
        return (TRakutenOrder)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 楽天RMS受注ID
     * @return The value of the column 'RAKUTEN_ORDER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRakutenOrderId() {
        checkSpecifiedProperty("rakutenOrderId");
        return _rakutenOrderId;
    }

    /**
     * [set] RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 楽天RMS受注ID
     * @param rakutenOrderId The value of the column 'RAKUTEN_ORDER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRakutenOrderId(Long rakutenOrderId) {
        registerModifiedProperty("rakutenOrderId");
        _rakutenOrderId = rakutenOrderId;
    }

    /**
     * [get] ORDER_NO: {varchar(100)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderNo() {
        checkSpecifiedProperty("orderNo");
        return convertEmptyToNull(_orderNo);
    }

    /**
     * [set] ORDER_NO: {varchar(100)} <br>
     * 受注番号
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNo(String orderNo) {
        registerModifiedProperty("orderNo");
        _orderNo = orderNo;
    }

    /**
     * [get] ORDER_STATUS: {varchar(30)} <br>
     * 受注ステータス
     * @return The value of the column 'ORDER_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderStatus() {
        checkSpecifiedProperty("orderStatus");
        return convertEmptyToNull(_orderStatus);
    }

    /**
     * [set] ORDER_STATUS: {varchar(30)} <br>
     * 受注ステータス
     * @param orderStatus The value of the column 'ORDER_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderStatus(String orderStatus) {
        registerModifiedProperty("orderStatus");
        _orderStatus = orderStatus;
    }

    /**
     * [get] CARD_STATUS: {varchar(30)} <br>
     * カード決済ステータス
     * @return The value of the column 'CARD_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardStatus() {
        checkSpecifiedProperty("cardStatus");
        return convertEmptyToNull(_cardStatus);
    }

    /**
     * [set] CARD_STATUS: {varchar(30)} <br>
     * カード決済ステータス
     * @param cardStatus The value of the column 'CARD_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardStatus(String cardStatus) {
        registerModifiedProperty("cardStatus");
        _cardStatus = cardStatus;
    }

    /**
     * [get] PAYMENT_DT: {varchar(30)} <br>
     * 入金日
     * @return The value of the column 'PAYMENT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentDt() {
        checkSpecifiedProperty("paymentDt");
        return convertEmptyToNull(_paymentDt);
    }

    /**
     * [set] PAYMENT_DT: {varchar(30)} <br>
     * 入金日
     * @param paymentDt The value of the column 'PAYMENT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentDt(String paymentDt) {
        registerModifiedProperty("paymentDt");
        _paymentDt = paymentDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(30)} <br>
     * 配送日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(30)} <br>
     * 配送日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(30)} <br>
     * お届け時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {varchar(30)} <br>
     * お届け時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] DELIV_DT: {varchar(30)} <br>
     * お届け日指定
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(30)} <br>
     * お届け日指定
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] PERSON_IN_CHARGE: {varchar(30)} <br>
     * 担当者
     * @return The value of the column 'PERSON_IN_CHARGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPersonInCharge() {
        checkSpecifiedProperty("personInCharge");
        return convertEmptyToNull(_personInCharge);
    }

    /**
     * [set] PERSON_IN_CHARGE: {varchar(30)} <br>
     * 担当者
     * @param personInCharge The value of the column 'PERSON_IN_CHARGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPersonInCharge(String personInCharge) {
        registerModifiedProperty("personInCharge");
        _personInCharge = personInCharge;
    }

    /**
     * [get] SINGLE_MEMO: {varchar(255)} <br>
     * ひとことメモ
     * @return The value of the column 'SINGLE_MEMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSingleMemo() {
        checkSpecifiedProperty("singleMemo");
        return convertEmptyToNull(_singleMemo);
    }

    /**
     * [set] SINGLE_MEMO: {varchar(255)} <br>
     * ひとことメモ
     * @param singleMemo The value of the column 'SINGLE_MEMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSingleMemo(String singleMemo) {
        registerModifiedProperty("singleMemo");
        _singleMemo = singleMemo;
    }

    /**
     * [get] MAIL_INPUT: {varchar(255)} <br>
     * メール差込文(お客様へのメッセージ)
     * @return The value of the column 'MAIL_INPUT'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailInput() {
        checkSpecifiedProperty("mailInput");
        return convertEmptyToNull(_mailInput);
    }

    /**
     * [set] MAIL_INPUT: {varchar(255)} <br>
     * メール差込文(お客様へのメッセージ)
     * @param mailInput The value of the column 'MAIL_INPUT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailInput(String mailInput) {
        registerModifiedProperty("mailInput");
        _mailInput = mailInput;
    }

    /**
     * [get] FIRST_PAYMENT: {bigint(19)} <br>
     * 初期購入合計金額
     * @return The value of the column 'FIRST_PAYMENT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFirstPayment() {
        checkSpecifiedProperty("firstPayment");
        return _firstPayment;
    }

    /**
     * [set] FIRST_PAYMENT: {bigint(19)} <br>
     * 初期購入合計金額
     * @param firstPayment The value of the column 'FIRST_PAYMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstPayment(Long firstPayment) {
        registerModifiedProperty("firstPayment");
        _firstPayment = firstPayment;
    }

    /**
     * [get] TERMINAL: {varchar(100)} <br>
     * 利用端末
     * @return The value of the column 'TERMINAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTerminal() {
        checkSpecifiedProperty("terminal");
        return convertEmptyToNull(_terminal);
    }

    /**
     * [set] TERMINAL: {varchar(100)} <br>
     * 利用端末
     * @param terminal The value of the column 'TERMINAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTerminal(String terminal) {
        registerModifiedProperty("terminal");
        _terminal = terminal;
    }

    /**
     * [get] MAIL_CARRIER_CD: {varchar(30)} <br>
     * メールキャリアCD
     * @return The value of the column 'MAIL_CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailCarrierCd() {
        checkSpecifiedProperty("mailCarrierCd");
        return convertEmptyToNull(_mailCarrierCd);
    }

    /**
     * [set] MAIL_CARRIER_CD: {varchar(30)} <br>
     * メールキャリアCD
     * @param mailCarrierCd The value of the column 'MAIL_CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailCarrierCd(String mailCarrierCd) {
        registerModifiedProperty("mailCarrierCd");
        _mailCarrierCd = mailCarrierCd;
    }

    /**
     * [get] GIFT_FLG: {char(1)} <br>
     * ギフトチェック（0:なし/1:あり）
     * @return The value of the column 'GIFT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftFlg() {
        checkSpecifiedProperty("giftFlg");
        return convertEmptyToNull(_giftFlg);
    }

    /**
     * [set] GIFT_FLG: {char(1)} <br>
     * ギフトチェック（0:なし/1:あり）
     * @param giftFlg The value of the column 'GIFT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftFlg(String giftFlg) {
        registerModifiedProperty("giftFlg");
        _giftFlg = giftFlg;
    }

    /**
     * [get] RAKUTEN_ORDER_COMMENT: {varchar(255)} <br>
     * コメント
     * @return The value of the column 'RAKUTEN_ORDER_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getRakutenOrderComment() {
        checkSpecifiedProperty("rakutenOrderComment");
        return convertEmptyToNull(_rakutenOrderComment);
    }

    /**
     * [set] RAKUTEN_ORDER_COMMENT: {varchar(255)} <br>
     * コメント
     * @param rakutenOrderComment The value of the column 'RAKUTEN_ORDER_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRakutenOrderComment(String rakutenOrderComment) {
        registerModifiedProperty("rakutenOrderComment");
        _rakutenOrderComment = rakutenOrderComment;
    }

    /**
     * [get] ORDER_DATETIME: {varchar(30)} <br>
     * 注文日時
     * @return The value of the column 'ORDER_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDatetime() {
        checkSpecifiedProperty("orderDatetime");
        return convertEmptyToNull(_orderDatetime);
    }

    /**
     * [set] ORDER_DATETIME: {varchar(30)} <br>
     * 注文日時
     * @param orderDatetime The value of the column 'ORDER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDatetime(String orderDatetime) {
        registerModifiedProperty("orderDatetime");
        _orderDatetime = orderDatetime;
    }

    /**
     * [get] MULTI_DELIV_FLG: {char(1)} <br>
     * 複数送付先フラグ
     * @return The value of the column 'MULTI_DELIV_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMultiDelivFlg() {
        checkSpecifiedProperty("multiDelivFlg");
        return convertEmptyToNull(_multiDelivFlg);
    }

    /**
     * [set] MULTI_DELIV_FLG: {char(1)} <br>
     * 複数送付先フラグ
     * @param multiDelivFlg The value of the column 'MULTI_DELIV_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMultiDelivFlg(String multiDelivFlg) {
        registerModifiedProperty("multiDelivFlg");
        _multiDelivFlg = multiDelivFlg;
    }

    /**
     * [get] ALERT_FLG: {char(1)} <br>
     * 警告表示フラグ
     * @return The value of the column 'ALERT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAlertFlg() {
        checkSpecifiedProperty("alertFlg");
        return convertEmptyToNull(_alertFlg);
    }

    /**
     * [set] ALERT_FLG: {char(1)} <br>
     * 警告表示フラグ
     * @param alertFlg The value of the column 'ALERT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAlertFlg(String alertFlg) {
        registerModifiedProperty("alertFlg");
        _alertFlg = alertFlg;
    }

    /**
     * [get] MEMBER_FLG: {char(1)} <br>
     * 楽天会員フラグ
     * @return The value of the column 'MEMBER_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberFlg() {
        checkSpecifiedProperty("memberFlg");
        return convertEmptyToNull(_memberFlg);
    }

    /**
     * [set] MEMBER_FLG: {char(1)} <br>
     * 楽天会員フラグ
     * @param memberFlg The value of the column 'MEMBER_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberFlg(String memberFlg) {
        registerModifiedProperty("memberFlg");
        _memberFlg = memberFlg;
    }

    /**
     * [get] TOTAL: {bigint(19)} <br>
     * 合計
     * @return The value of the column 'TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotal() {
        checkSpecifiedProperty("total");
        return _total;
    }

    /**
     * [set] TOTAL: {bigint(19)} <br>
     * 合計
     * @param total The value of the column 'TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotal(Long total) {
        registerModifiedProperty("total");
        _total = total;
    }

    /**
     * [get] TAX: {bigint(19)} <br>
     * 消費税(-99999=無効値)
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTax() {
        checkSpecifiedProperty("tax");
        return _tax;
    }

    /**
     * [set] TAX: {bigint(19)} <br>
     * 消費税(-99999=無効値)
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(Long tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] CARRIAGE: {bigint(19)} <br>
     * 送料(-99999=無効値)
     * @return The value of the column 'CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarriage() {
        checkSpecifiedProperty("carriage");
        return _carriage;
    }

    /**
     * [set] CARRIAGE: {bigint(19)} <br>
     * 送料(-99999=無効値)
     * @param carriage The value of the column 'CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriage(Long carriage) {
        registerModifiedProperty("carriage");
        _carriage = carriage;
    }

    /**
     * [get] COD: {bigint(19)} <br>
     * 代引料(-99999=無効値)
     * @return The value of the column 'COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCod() {
        checkSpecifiedProperty("cod");
        return _cod;
    }

    /**
     * [set] COD: {bigint(19)} <br>
     * 代引料(-99999=無効値)
     * @param cod The value of the column 'COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCod(Long cod) {
        registerModifiedProperty("cod");
        _cod = cod;
    }

    /**
     * [get] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額(-99999=無効値)
     * @return The value of the column 'AMOUNT_BILLED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAmountBilled() {
        checkSpecifiedProperty("amountBilled");
        return _amountBilled;
    }

    /**
     * [set] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額(-99999=無効値)
     * @param amountBilled The value of the column 'AMOUNT_BILLED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmountBilled(Long amountBilled) {
        registerModifiedProperty("amountBilled");
        _amountBilled = amountBilled;
    }

    /**
     * [get] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額(-99999=無効値)
     * @return The value of the column 'TOTAL_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalAmount() {
        checkSpecifiedProperty("totalAmount");
        return _totalAmount;
    }

    /**
     * [set] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額(-99999=無効値)
     * @param totalAmount The value of the column 'TOTAL_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalAmount(Long totalAmount) {
        registerModifiedProperty("totalAmount");
        _totalAmount = totalAmount;
    }

    /**
     * [get] COMBINE_ID: {varchar(30)} <br>
     * 同梱ID
     * @return The value of the column 'COMBINE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCombineId() {
        checkSpecifiedProperty("combineId");
        return convertEmptyToNull(_combineId);
    }

    /**
     * [set] COMBINE_ID: {varchar(30)} <br>
     * 同梱ID
     * @param combineId The value of the column 'COMBINE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineId(String combineId) {
        registerModifiedProperty("combineId");
        _combineId = combineId;
    }

    /**
     * [get] COMBINE_STATUS: {varchar(30)} <br>
     * 同梱ステータス
     * @return The value of the column 'COMBINE_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getCombineStatus() {
        checkSpecifiedProperty("combineStatus");
        return convertEmptyToNull(_combineStatus);
    }

    /**
     * [set] COMBINE_STATUS: {varchar(30)} <br>
     * 同梱ステータス
     * @param combineStatus The value of the column 'COMBINE_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineStatus(String combineStatus) {
        registerModifiedProperty("combineStatus");
        _combineStatus = combineStatus;
    }

    /**
     * [get] COMBINE_TOTAL: {bigint(19)} <br>
     * 同梱商品合計金額
     * @return The value of the column 'COMBINE_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineTotal() {
        checkSpecifiedProperty("combineTotal");
        return _combineTotal;
    }

    /**
     * [set] COMBINE_TOTAL: {bigint(19)} <br>
     * 同梱商品合計金額
     * @param combineTotal The value of the column 'COMBINE_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineTotal(Long combineTotal) {
        registerModifiedProperty("combineTotal");
        _combineTotal = combineTotal;
    }

    /**
     * [get] COMBINE_CARRIAGE: {bigint(19)} <br>
     * 同梱送料合計
     * @return The value of the column 'COMBINE_CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineCarriage() {
        checkSpecifiedProperty("combineCarriage");
        return _combineCarriage;
    }

    /**
     * [set] COMBINE_CARRIAGE: {bigint(19)} <br>
     * 同梱送料合計
     * @param combineCarriage The value of the column 'COMBINE_CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineCarriage(Long combineCarriage) {
        registerModifiedProperty("combineCarriage");
        _combineCarriage = combineCarriage;
    }

    /**
     * [get] COMBINE_COD: {bigint(19)} <br>
     * 同梱代引料合計
     * @return The value of the column 'COMBINE_COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineCod() {
        checkSpecifiedProperty("combineCod");
        return _combineCod;
    }

    /**
     * [set] COMBINE_COD: {bigint(19)} <br>
     * 同梱代引料合計
     * @param combineCod The value of the column 'COMBINE_COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineCod(Long combineCod) {
        registerModifiedProperty("combineCod");
        _combineCod = combineCod;
    }

    /**
     * [get] COMBINE_TAX: {bigint(19)} <br>
     * 同梱消費税合計
     * @return The value of the column 'COMBINE_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineTax() {
        checkSpecifiedProperty("combineTax");
        return _combineTax;
    }

    /**
     * [set] COMBINE_TAX: {bigint(19)} <br>
     * 同梱消費税合計
     * @param combineTax The value of the column 'COMBINE_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineTax(Long combineTax) {
        registerModifiedProperty("combineTax");
        _combineTax = combineTax;
    }

    /**
     * [get] COMBINE_BILLED: {bigint(19)} <br>
     * 同梱請求金額
     * @return The value of the column 'COMBINE_BILLED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineBilled() {
        checkSpecifiedProperty("combineBilled");
        return _combineBilled;
    }

    /**
     * [set] COMBINE_BILLED: {bigint(19)} <br>
     * 同梱請求金額
     * @param combineBilled The value of the column 'COMBINE_BILLED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineBilled(Long combineBilled) {
        registerModifiedProperty("combineBilled");
        _combineBilled = combineBilled;
    }

    /**
     * [get] COMBINE_AMOUNT: {bigint(19)} <br>
     * 同梱合計金額
     * @return The value of the column 'COMBINE_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineAmount() {
        checkSpecifiedProperty("combineAmount");
        return _combineAmount;
    }

    /**
     * [set] COMBINE_AMOUNT: {bigint(19)} <br>
     * 同梱合計金額
     * @param combineAmount The value of the column 'COMBINE_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineAmount(Long combineAmount) {
        registerModifiedProperty("combineAmount");
        _combineAmount = combineAmount;
    }

    /**
     * [get] COMBINE_BANK_FEE: {bigint(19)} <br>
     * 同梱楽天バンク決済振替手数料
     * @return The value of the column 'COMBINE_BANK_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineBankFee() {
        checkSpecifiedProperty("combineBankFee");
        return _combineBankFee;
    }

    /**
     * [set] COMBINE_BANK_FEE: {bigint(19)} <br>
     * 同梱楽天バンク決済振替手数料
     * @param combineBankFee The value of the column 'COMBINE_BANK_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineBankFee(Long combineBankFee) {
        registerModifiedProperty("combineBankFee");
        _combineBankFee = combineBankFee;
    }

    /**
     * [get] COMBINE_POINT_USE: {bigint(19)} <br>
     * 同梱ポイント利用合計
     * @return The value of the column 'COMBINE_POINT_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombinePointUse() {
        checkSpecifiedProperty("combinePointUse");
        return _combinePointUse;
    }

    /**
     * [set] COMBINE_POINT_USE: {bigint(19)} <br>
     * 同梱ポイント利用合計
     * @param combinePointUse The value of the column 'COMBINE_POINT_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombinePointUse(Long combinePointUse) {
        registerModifiedProperty("combinePointUse");
        _combinePointUse = combinePointUse;
    }

    /**
     * [get] MAIL_FLG: {char(1)} <br>
     * メールフラグ
     * @return The value of the column 'MAIL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailFlg() {
        checkSpecifiedProperty("mailFlg");
        return convertEmptyToNull(_mailFlg);
    }

    /**
     * [set] MAIL_FLG: {char(1)} <br>
     * メールフラグ
     * @param mailFlg The value of the column 'MAIL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailFlg(String mailFlg) {
        registerModifiedProperty("mailFlg");
        _mailFlg = mailFlg;
    }

    /**
     * [get] ORDER_DT: {varchar(30)} <br>
     * 注文日
     * @return The value of the column 'ORDER_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDt() {
        checkSpecifiedProperty("orderDt");
        return convertEmptyToNull(_orderDt);
    }

    /**
     * [set] ORDER_DT: {varchar(30)} <br>
     * 注文日
     * @param orderDt The value of the column 'ORDER_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDt(String orderDt) {
        registerModifiedProperty("orderDt");
        _orderDt = orderDt;
    }

    /**
     * [get] ORDER_TIME: {varchar(30)} <br>
     * 注文時間
     * @return The value of the column 'ORDER_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTime() {
        checkSpecifiedProperty("orderTime");
        return convertEmptyToNull(_orderTime);
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文時間
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTime(String orderTime) {
        registerModifiedProperty("orderTime");
        _orderTime = orderTime;
    }

    /**
     * [get] MOBILE_PAYMENT_NO: {varchar(30)} <br>
     * モバイルキャリア決済番号
     * @return The value of the column 'MOBILE_PAYMENT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMobilePaymentNo() {
        checkSpecifiedProperty("mobilePaymentNo");
        return convertEmptyToNull(_mobilePaymentNo);
    }

    /**
     * [set] MOBILE_PAYMENT_NO: {varchar(30)} <br>
     * モバイルキャリア決済番号
     * @param mobilePaymentNo The value of the column 'MOBILE_PAYMENT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMobilePaymentNo(String mobilePaymentNo) {
        registerModifiedProperty("mobilePaymentNo");
        _mobilePaymentNo = mobilePaymentNo;
    }

    /**
     * [get] HISTORY_MOD_FLG: {varchar(30)} <br>
     * 購入履歴修正可否タイプ
     * @return The value of the column 'HISTORY_MOD_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistoryModFlg() {
        checkSpecifiedProperty("historyModFlg");
        return convertEmptyToNull(_historyModFlg);
    }

    /**
     * [set] HISTORY_MOD_FLG: {varchar(30)} <br>
     * 購入履歴修正可否タイプ
     * @param historyModFlg The value of the column 'HISTORY_MOD_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistoryModFlg(String historyModFlg) {
        registerModifiedProperty("historyModFlg");
        _historyModFlg = historyModFlg;
    }

    /**
     * [get] HISTORY_ICON_FLG: {char(1)} <br>
     * 購入履歴修正アイコンフラグ
     * @return The value of the column 'HISTORY_ICON_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistoryIconFlg() {
        checkSpecifiedProperty("historyIconFlg");
        return convertEmptyToNull(_historyIconFlg);
    }

    /**
     * [set] HISTORY_ICON_FLG: {char(1)} <br>
     * 購入履歴修正アイコンフラグ
     * @param historyIconFlg The value of the column 'HISTORY_ICON_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistoryIconFlg(String historyIconFlg) {
        registerModifiedProperty("historyIconFlg");
        _historyIconFlg = historyIconFlg;
    }

    /**
     * [get] HISTORY_MAIL_FLG: {char(1)} <br>
     * 購入履歴修正催促メールフラグ
     * @return The value of the column 'HISTORY_MAIL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHistoryMailFlg() {
        checkSpecifiedProperty("historyMailFlg");
        return convertEmptyToNull(_historyMailFlg);
    }

    /**
     * [set] HISTORY_MAIL_FLG: {char(1)} <br>
     * 購入履歴修正催促メールフラグ
     * @param historyMailFlg The value of the column 'HISTORY_MAIL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHistoryMailFlg(String historyMailFlg) {
        registerModifiedProperty("historyMailFlg");
        _historyMailFlg = historyMailFlg;
    }

    /**
     * [get] DELIV_MATCH_FLG: {char(1)} <br>
     * 送付先一致フラグ
     * @return The value of the column 'DELIV_MATCH_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivMatchFlg() {
        checkSpecifiedProperty("delivMatchFlg");
        return convertEmptyToNull(_delivMatchFlg);
    }

    /**
     * [set] DELIV_MATCH_FLG: {char(1)} <br>
     * 送付先一致フラグ
     * @param delivMatchFlg The value of the column 'DELIV_MATCH_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivMatchFlg(String delivMatchFlg) {
        registerModifiedProperty("delivMatchFlg");
        _delivMatchFlg = delivMatchFlg;
    }

    /**
     * [get] POINT_USE_FLG: {char(1)} <br>
     * ポイント利用有無
     * @return The value of the column 'POINT_USE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPointUseFlg() {
        checkSpecifiedProperty("pointUseFlg");
        return convertEmptyToNull(_pointUseFlg);
    }

    /**
     * [set] POINT_USE_FLG: {char(1)} <br>
     * ポイント利用有無
     * @param pointUseFlg The value of the column 'POINT_USE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointUseFlg(String pointUseFlg) {
        registerModifiedProperty("pointUseFlg");
        _pointUseFlg = pointUseFlg;
    }

    /**
     * [get] ORDER_ZIP_CD1: {varchar(30)} <br>
     * 注文者郵便番号1
     * @return The value of the column 'ORDER_ZIP_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderZipCd1() {
        checkSpecifiedProperty("orderZipCd1");
        return convertEmptyToNull(_orderZipCd1);
    }

    /**
     * [set] ORDER_ZIP_CD1: {varchar(30)} <br>
     * 注文者郵便番号1
     * @param orderZipCd1 The value of the column 'ORDER_ZIP_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderZipCd1(String orderZipCd1) {
        registerModifiedProperty("orderZipCd1");
        _orderZipCd1 = orderZipCd1;
    }

    /**
     * [get] ORDER_ZIP_CD2: {varchar(30)} <br>
     * 注文者郵便番号2
     * @return The value of the column 'ORDER_ZIP_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderZipCd2() {
        checkSpecifiedProperty("orderZipCd2");
        return convertEmptyToNull(_orderZipCd2);
    }

    /**
     * [set] ORDER_ZIP_CD2: {varchar(30)} <br>
     * 注文者郵便番号2
     * @param orderZipCd2 The value of the column 'ORDER_ZIP_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderZipCd2(String orderZipCd2) {
        registerModifiedProperty("orderZipCd2");
        _orderZipCd2 = orderZipCd2;
    }

    /**
     * [get] ORDER_ADDRESS1: {varchar(255)} <br>
     * 注文者住所：都道府県
     * @return The value of the column 'ORDER_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderAddress1() {
        checkSpecifiedProperty("orderAddress1");
        return convertEmptyToNull(_orderAddress1);
    }

    /**
     * [set] ORDER_ADDRESS1: {varchar(255)} <br>
     * 注文者住所：都道府県
     * @param orderAddress1 The value of the column 'ORDER_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderAddress1(String orderAddress1) {
        registerModifiedProperty("orderAddress1");
        _orderAddress1 = orderAddress1;
    }

    /**
     * [get] ORDER_ADDRESS2: {varchar(255)} <br>
     * 注文者住所：都市区
     * @return The value of the column 'ORDER_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderAddress2() {
        checkSpecifiedProperty("orderAddress2");
        return convertEmptyToNull(_orderAddress2);
    }

    /**
     * [set] ORDER_ADDRESS2: {varchar(255)} <br>
     * 注文者住所：都市区
     * @param orderAddress2 The value of the column 'ORDER_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderAddress2(String orderAddress2) {
        registerModifiedProperty("orderAddress2");
        _orderAddress2 = orderAddress2;
    }

    /**
     * [get] ORDER_ADDRESS3: {varchar(255)} <br>
     * 注文者住所：町以降
     * @return The value of the column 'ORDER_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderAddress3() {
        checkSpecifiedProperty("orderAddress3");
        return convertEmptyToNull(_orderAddress3);
    }

    /**
     * [set] ORDER_ADDRESS3: {varchar(255)} <br>
     * 注文者住所：町以降
     * @param orderAddress3 The value of the column 'ORDER_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderAddress3(String orderAddress3) {
        registerModifiedProperty("orderAddress3");
        _orderAddress3 = orderAddress3;
    }

    /**
     * [get] ORDER_CUSTOMER_NM1: {varchar(255)} <br>
     * 注文者名字
     * @return The value of the column 'ORDER_CUSTOMER_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerNm1() {
        checkSpecifiedProperty("orderCustomerNm1");
        return convertEmptyToNull(_orderCustomerNm1);
    }

    /**
     * [set] ORDER_CUSTOMER_NM1: {varchar(255)} <br>
     * 注文者名字
     * @param orderCustomerNm1 The value of the column 'ORDER_CUSTOMER_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerNm1(String orderCustomerNm1) {
        registerModifiedProperty("orderCustomerNm1");
        _orderCustomerNm1 = orderCustomerNm1;
    }

    /**
     * [get] ORDER_CUSTOMER_NM2: {varchar(255)} <br>
     * 注文者名前
     * @return The value of the column 'ORDER_CUSTOMER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerNm2() {
        checkSpecifiedProperty("orderCustomerNm2");
        return convertEmptyToNull(_orderCustomerNm2);
    }

    /**
     * [set] ORDER_CUSTOMER_NM2: {varchar(255)} <br>
     * 注文者名前
     * @param orderCustomerNm2 The value of the column 'ORDER_CUSTOMER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerNm2(String orderCustomerNm2) {
        registerModifiedProperty("orderCustomerNm2");
        _orderCustomerNm2 = orderCustomerNm2;
    }

    /**
     * [get] ORDER_CUSTOMER_KN1: {varchar(255)} <br>
     * 注文者名字フリガナ
     * @return The value of the column 'ORDER_CUSTOMER_KN1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerKn1() {
        checkSpecifiedProperty("orderCustomerKn1");
        return convertEmptyToNull(_orderCustomerKn1);
    }

    /**
     * [set] ORDER_CUSTOMER_KN1: {varchar(255)} <br>
     * 注文者名字フリガナ
     * @param orderCustomerKn1 The value of the column 'ORDER_CUSTOMER_KN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerKn1(String orderCustomerKn1) {
        registerModifiedProperty("orderCustomerKn1");
        _orderCustomerKn1 = orderCustomerKn1;
    }

    /**
     * [get] ORDER_CUSTOMER_KN2: {varchar(255)} <br>
     * 注文者名前フリガナ
     * @return The value of the column 'ORDER_CUSTOMER_KN2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerKn2() {
        checkSpecifiedProperty("orderCustomerKn2");
        return convertEmptyToNull(_orderCustomerKn2);
    }

    /**
     * [set] ORDER_CUSTOMER_KN2: {varchar(255)} <br>
     * 注文者名前フリガナ
     * @param orderCustomerKn2 The value of the column 'ORDER_CUSTOMER_KN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerKn2(String orderCustomerKn2) {
        registerModifiedProperty("orderCustomerKn2");
        _orderCustomerKn2 = orderCustomerKn2;
    }

    /**
     * [get] ORDER_TEL_NO1: {varchar(255)} <br>
     * 注文者電話番号1
     * @return The value of the column 'ORDER_TEL_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTelNo1() {
        checkSpecifiedProperty("orderTelNo1");
        return convertEmptyToNull(_orderTelNo1);
    }

    /**
     * [set] ORDER_TEL_NO1: {varchar(255)} <br>
     * 注文者電話番号1
     * @param orderTelNo1 The value of the column 'ORDER_TEL_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTelNo1(String orderTelNo1) {
        registerModifiedProperty("orderTelNo1");
        _orderTelNo1 = orderTelNo1;
    }

    /**
     * [get] ORDER_TEL_NO2: {varchar(255)} <br>
     * 注文者電話番号2
     * @return The value of the column 'ORDER_TEL_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTelNo2() {
        checkSpecifiedProperty("orderTelNo2");
        return convertEmptyToNull(_orderTelNo2);
    }

    /**
     * [set] ORDER_TEL_NO2: {varchar(255)} <br>
     * 注文者電話番号2
     * @param orderTelNo2 The value of the column 'ORDER_TEL_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTelNo2(String orderTelNo2) {
        registerModifiedProperty("orderTelNo2");
        _orderTelNo2 = orderTelNo2;
    }

    /**
     * [get] ORDER_TEL_NO3: {varchar(255)} <br>
     * 注文者電話番号3
     * @return The value of the column 'ORDER_TEL_NO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTelNo3() {
        checkSpecifiedProperty("orderTelNo3");
        return convertEmptyToNull(_orderTelNo3);
    }

    /**
     * [set] ORDER_TEL_NO3: {varchar(255)} <br>
     * 注文者電話番号3
     * @param orderTelNo3 The value of the column 'ORDER_TEL_NO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTelNo3(String orderTelNo3) {
        registerModifiedProperty("orderTelNo3");
        _orderTelNo3 = orderTelNo3;
    }

    /**
     * [get] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return convertEmptyToNull(_mailAddress);
    }

    /**
     * [set] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] ORDER_SEX: {varchar(30)} <br>
     * 注文者性別
     * @return The value of the column 'ORDER_SEX'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderSex() {
        checkSpecifiedProperty("orderSex");
        return convertEmptyToNull(_orderSex);
    }

    /**
     * [set] ORDER_SEX: {varchar(30)} <br>
     * 注文者性別
     * @param orderSex The value of the column 'ORDER_SEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderSex(String orderSex) {
        registerModifiedProperty("orderSex");
        _orderSex = orderSex;
    }

    /**
     * [get] ORDER_BIRTHDAY: {varchar(30)} <br>
     * 注文者誕生日
     * @return The value of the column 'ORDER_BIRTHDAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderBirthday() {
        checkSpecifiedProperty("orderBirthday");
        return convertEmptyToNull(_orderBirthday);
    }

    /**
     * [set] ORDER_BIRTHDAY: {varchar(30)} <br>
     * 注文者誕生日
     * @param orderBirthday The value of the column 'ORDER_BIRTHDAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderBirthday(String orderBirthday) {
        registerModifiedProperty("orderBirthday");
        _orderBirthday = orderBirthday;
    }

    /**
     * [get] PAYMENT_METHOD: {varchar(255)} <br>
     * 決済方法
     * @return The value of the column 'PAYMENT_METHOD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentMethod() {
        checkSpecifiedProperty("paymentMethod");
        return convertEmptyToNull(_paymentMethod);
    }

    /**
     * [set] PAYMENT_METHOD: {varchar(255)} <br>
     * 決済方法
     * @param paymentMethod The value of the column 'PAYMENT_METHOD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentMethod(String paymentMethod) {
        registerModifiedProperty("paymentMethod");
        _paymentMethod = paymentMethod;
    }

    /**
     * [get] CARD_TYPE: {varchar(100)} <br>
     * クレジットカード種類
     * @return The value of the column 'CARD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardType() {
        checkSpecifiedProperty("cardType");
        return convertEmptyToNull(_cardType);
    }

    /**
     * [set] CARD_TYPE: {varchar(100)} <br>
     * クレジットカード種類
     * @param cardType The value of the column 'CARD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardType(String cardType) {
        registerModifiedProperty("cardType");
        _cardType = cardType;
    }

    /**
     * [get] CARD_NO: {varchar(255)} <br>
     * クレジットカード番号
     * @return The value of the column 'CARD_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardNo() {
        checkSpecifiedProperty("cardNo");
        return convertEmptyToNull(_cardNo);
    }

    /**
     * [set] CARD_NO: {varchar(255)} <br>
     * クレジットカード番号
     * @param cardNo The value of the column 'CARD_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardNo(String cardNo) {
        registerModifiedProperty("cardNo");
        _cardNo = cardNo;
    }

    /**
     * [get] CARD_NM: {varchar(255)} <br>
     * クレジットカード名義人
     * @return The value of the column 'CARD_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardNm() {
        checkSpecifiedProperty("cardNm");
        return convertEmptyToNull(_cardNm);
    }

    /**
     * [set] CARD_NM: {varchar(255)} <br>
     * クレジットカード名義人
     * @param cardNm The value of the column 'CARD_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardNm(String cardNm) {
        registerModifiedProperty("cardNm");
        _cardNm = cardNm;
    }

    /**
     * [get] CARD_AVAILABLE: {varchar(255)} <br>
     * クレジットカード有効期限
     * @return The value of the column 'CARD_AVAILABLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardAvailable() {
        checkSpecifiedProperty("cardAvailable");
        return convertEmptyToNull(_cardAvailable);
    }

    /**
     * [set] CARD_AVAILABLE: {varchar(255)} <br>
     * クレジットカード有効期限
     * @param cardAvailable The value of the column 'CARD_AVAILABLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardAvailable(String cardAvailable) {
        registerModifiedProperty("cardAvailable");
        _cardAvailable = cardAvailable;
    }

    /**
     * [get] CARD_INST: {varchar(30)} <br>
     * クレジットカード分割選択
     * @return The value of the column 'CARD_INST'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardInst() {
        checkSpecifiedProperty("cardInst");
        return convertEmptyToNull(_cardInst);
    }

    /**
     * [set] CARD_INST: {varchar(30)} <br>
     * クレジットカード分割選択
     * @param cardInst The value of the column 'CARD_INST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardInst(String cardInst) {
        registerModifiedProperty("cardInst");
        _cardInst = cardInst;
    }

    /**
     * [get] CARD_INST_COMMENT: {varchar(255)} <br>
     * クレジットカード分割備考
     * @return The value of the column 'CARD_INST_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardInstComment() {
        checkSpecifiedProperty("cardInstComment");
        return convertEmptyToNull(_cardInstComment);
    }

    /**
     * [set] CARD_INST_COMMENT: {varchar(255)} <br>
     * クレジットカード分割備考
     * @param cardInstComment The value of the column 'CARD_INST_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardInstComment(String cardInstComment) {
        registerModifiedProperty("cardInstComment");
        _cardInstComment = cardInstComment;
    }

    /**
     * [get] DELIV_METHOD: {varchar(255)} <br>
     * 配送方法
     * @return The value of the column 'DELIV_METHOD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivMethod() {
        checkSpecifiedProperty("delivMethod");
        return convertEmptyToNull(_delivMethod);
    }

    /**
     * [set] DELIV_METHOD: {varchar(255)} <br>
     * 配送方法
     * @param delivMethod The value of the column 'DELIV_METHOD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivMethod(String delivMethod) {
        registerModifiedProperty("delivMethod");
        _delivMethod = delivMethod;
    }

    /**
     * [get] DELIV_TYPE: {varchar(255)} <br>
     * 配送区分
     * @return The value of the column 'DELIV_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivType() {
        checkSpecifiedProperty("delivType");
        return convertEmptyToNull(_delivType);
    }

    /**
     * [set] DELIV_TYPE: {varchar(255)} <br>
     * 配送区分
     * @param delivType The value of the column 'DELIV_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivType(String delivType) {
        registerModifiedProperty("delivType");
        _delivType = delivType;
    }

    /**
     * [get] POINT_USE: {bigint(19)} <br>
     * ポイント利用額
     * @return The value of the column 'POINT_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPointUse() {
        checkSpecifiedProperty("pointUse");
        return _pointUse;
    }

    /**
     * [set] POINT_USE: {bigint(19)} <br>
     * ポイント利用額
     * @param pointUse The value of the column 'POINT_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointUse(Long pointUse) {
        registerModifiedProperty("pointUse");
        _pointUse = pointUse;
    }

    /**
     * [get] POINT_CONDITION: {varchar(30)} <br>
     * ポイント利用条件
     * @return The value of the column 'POINT_CONDITION'. (NullAllowed even if selected: for no constraint)
     */
    public String getPointCondition() {
        checkSpecifiedProperty("pointCondition");
        return convertEmptyToNull(_pointCondition);
    }

    /**
     * [set] POINT_CONDITION: {varchar(30)} <br>
     * ポイント利用条件
     * @param pointCondition The value of the column 'POINT_CONDITION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointCondition(String pointCondition) {
        registerModifiedProperty("pointCondition");
        _pointCondition = pointCondition;
    }

    /**
     * [get] POINT_STATUS: {varchar(30)} <br>
     * ポイントステータス
     * @return The value of the column 'POINT_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPointStatus() {
        checkSpecifiedProperty("pointStatus");
        return convertEmptyToNull(_pointStatus);
    }

    /**
     * [set] POINT_STATUS: {varchar(30)} <br>
     * ポイントステータス
     * @param pointStatus The value of the column 'POINT_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointStatus(String pointStatus) {
        registerModifiedProperty("pointStatus");
        _pointStatus = pointStatus;
    }

    /**
     * [get] BANK_STATUS: {varchar(30)} <br>
     * 楽天バンク決済ステータス
     * @return The value of the column 'BANK_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getBankStatus() {
        checkSpecifiedProperty("bankStatus");
        return convertEmptyToNull(_bankStatus);
    }

    /**
     * [set] BANK_STATUS: {varchar(30)} <br>
     * 楽天バンク決済ステータス
     * @param bankStatus The value of the column 'BANK_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBankStatus(String bankStatus) {
        registerModifiedProperty("bankStatus");
        _bankStatus = bankStatus;
    }

    /**
     * [get] BANK_FEE_FLG: {char(1)} <br>
     * 楽天バンク振替手数料負担区分
     * @return The value of the column 'BANK_FEE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBankFeeFlg() {
        checkSpecifiedProperty("bankFeeFlg");
        return convertEmptyToNull(_bankFeeFlg);
    }

    /**
     * [set] BANK_FEE_FLG: {char(1)} <br>
     * 楽天バンク振替手数料負担区分
     * @param bankFeeFlg The value of the column 'BANK_FEE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBankFeeFlg(String bankFeeFlg) {
        registerModifiedProperty("bankFeeFlg");
        _bankFeeFlg = bankFeeFlg;
    }

    /**
     * [get] BANK_FEE: {bigint(19)} <br>
     * 楽天バンク決済手数料
     * @return The value of the column 'BANK_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBankFee() {
        checkSpecifiedProperty("bankFee");
        return _bankFee;
    }

    /**
     * [set] BANK_FEE: {bigint(19)} <br>
     * 楽天バンク決済手数料
     * @param bankFee The value of the column 'BANK_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBankFee(Long bankFee) {
        registerModifiedProperty("bankFee");
        _bankFee = bankFee;
    }

    /**
     * [get] WRAPPING_TITLE_P: {varchar(255)} <br>
     * ラッピングタイトル(包装紙)
     * @return The value of the column 'WRAPPING_TITLE_P'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingTitleP() {
        checkSpecifiedProperty("wrappingTitleP");
        return convertEmptyToNull(_wrappingTitleP);
    }

    /**
     * [set] WRAPPING_TITLE_P: {varchar(255)} <br>
     * ラッピングタイトル(包装紙)
     * @param wrappingTitleP The value of the column 'WRAPPING_TITLE_P'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTitleP(String wrappingTitleP) {
        registerModifiedProperty("wrappingTitleP");
        _wrappingTitleP = wrappingTitleP;
    }

    /**
     * [get] WRAPPING_NM_P: {varchar(255)} <br>
     * ラッピング名(包装紙)
     * @return The value of the column 'WRAPPING_NM_P'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingNmP() {
        checkSpecifiedProperty("wrappingNmP");
        return convertEmptyToNull(_wrappingNmP);
    }

    /**
     * [set] WRAPPING_NM_P: {varchar(255)} <br>
     * ラッピング名(包装紙)
     * @param wrappingNmP The value of the column 'WRAPPING_NM_P'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingNmP(String wrappingNmP) {
        registerModifiedProperty("wrappingNmP");
        _wrappingNmP = wrappingNmP;
    }

    /**
     * [get] WRAPPING_FEE_P: {bigint(19)} <br>
     * ラッピング料金(包装紙)
     * @return The value of the column 'WRAPPING_FEE_P'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWrappingFeeP() {
        checkSpecifiedProperty("wrappingFeeP");
        return _wrappingFeeP;
    }

    /**
     * [set] WRAPPING_FEE_P: {bigint(19)} <br>
     * ラッピング料金(包装紙)
     * @param wrappingFeeP The value of the column 'WRAPPING_FEE_P'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingFeeP(Long wrappingFeeP) {
        registerModifiedProperty("wrappingFeeP");
        _wrappingFeeP = wrappingFeeP;
    }

    /**
     * [get] WRAPPING_TAX_P: {bigint(19)} <br>
     * 税込別(包装紙)
     * @return The value of the column 'WRAPPING_TAX_P'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWrappingTaxP() {
        checkSpecifiedProperty("wrappingTaxP");
        return _wrappingTaxP;
    }

    /**
     * [set] WRAPPING_TAX_P: {bigint(19)} <br>
     * 税込別(包装紙)
     * @param wrappingTaxP The value of the column 'WRAPPING_TAX_P'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTaxP(Long wrappingTaxP) {
        registerModifiedProperty("wrappingTaxP");
        _wrappingTaxP = wrappingTaxP;
    }

    /**
     * [get] WRAPPING_TITLE_R: {varchar(255)} <br>
     * ラッピングタイトル(リボン)
     * @return The value of the column 'WRAPPING_TITLE_R'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingTitleR() {
        checkSpecifiedProperty("wrappingTitleR");
        return convertEmptyToNull(_wrappingTitleR);
    }

    /**
     * [set] WRAPPING_TITLE_R: {varchar(255)} <br>
     * ラッピングタイトル(リボン)
     * @param wrappingTitleR The value of the column 'WRAPPING_TITLE_R'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTitleR(String wrappingTitleR) {
        registerModifiedProperty("wrappingTitleR");
        _wrappingTitleR = wrappingTitleR;
    }

    /**
     * [get] WRAPPING_NM_R: {varchar(255)} <br>
     * ラッピング名(リボン)
     * @return The value of the column 'WRAPPING_NM_R'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingNmR() {
        checkSpecifiedProperty("wrappingNmR");
        return convertEmptyToNull(_wrappingNmR);
    }

    /**
     * [set] WRAPPING_NM_R: {varchar(255)} <br>
     * ラッピング名(リボン)
     * @param wrappingNmR The value of the column 'WRAPPING_NM_R'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingNmR(String wrappingNmR) {
        registerModifiedProperty("wrappingNmR");
        _wrappingNmR = wrappingNmR;
    }

    /**
     * [get] WRAPPING_FEE_R: {bigint(19)} <br>
     * ラッピング料金(リボン)
     * @return The value of the column 'WRAPPING_FEE_R'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWrappingFeeR() {
        checkSpecifiedProperty("wrappingFeeR");
        return _wrappingFeeR;
    }

    /**
     * [set] WRAPPING_FEE_R: {bigint(19)} <br>
     * ラッピング料金(リボン)
     * @param wrappingFeeR The value of the column 'WRAPPING_FEE_R'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingFeeR(Long wrappingFeeR) {
        registerModifiedProperty("wrappingFeeR");
        _wrappingFeeR = wrappingFeeR;
    }

    /**
     * [get] WRAPPING_TAX_R: {bigint(19)} <br>
     * 税込別(リボン)
     * @return The value of the column 'WRAPPING_TAX_R'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWrappingTaxR() {
        checkSpecifiedProperty("wrappingTaxR");
        return _wrappingTaxR;
    }

    /**
     * [set] WRAPPING_TAX_R: {bigint(19)} <br>
     * 税込別(リボン)
     * @param wrappingTaxR The value of the column 'WRAPPING_TAX_R'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTaxR(Long wrappingTaxR) {
        registerModifiedProperty("wrappingTaxR");
        _wrappingTaxR = wrappingTaxR;
    }

    /**
     * [get] DELIV_CARRIAGE: {bigint(19)} <br>
     * 送付先送料
     * @return The value of the column 'DELIV_CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCarriage() {
        checkSpecifiedProperty("delivCarriage");
        return _delivCarriage;
    }

    /**
     * [set] DELIV_CARRIAGE: {bigint(19)} <br>
     * 送付先送料
     * @param delivCarriage The value of the column 'DELIV_CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCarriage(Long delivCarriage) {
        registerModifiedProperty("delivCarriage");
        _delivCarriage = delivCarriage;
    }

    /**
     * [get] DELIV_COD: {bigint(19)} <br>
     * 送付先代引料
     * @return The value of the column 'DELIV_COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCod() {
        checkSpecifiedProperty("delivCod");
        return _delivCod;
    }

    /**
     * [set] DELIV_COD: {bigint(19)} <br>
     * 送付先代引料
     * @param delivCod The value of the column 'DELIV_COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCod(Long delivCod) {
        registerModifiedProperty("delivCod");
        _delivCod = delivCod;
    }

    /**
     * [get] DELIV_TAX: {bigint(19)} <br>
     * 送付先消費税
     * @return The value of the column 'DELIV_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivTax() {
        checkSpecifiedProperty("delivTax");
        return _delivTax;
    }

    /**
     * [set] DELIV_TAX: {bigint(19)} <br>
     * 送付先消費税
     * @param delivTax The value of the column 'DELIV_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTax(Long delivTax) {
        registerModifiedProperty("delivTax");
        _delivTax = delivTax;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * お荷物伝票番号
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNum() {
        checkSpecifiedProperty("carrierTraceNum");
        return convertEmptyToNull(_carrierTraceNum);
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * お荷物伝票番号
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        registerModifiedProperty("carrierTraceNum");
        _carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] DELIV_TOTAL: {bigint(19)} <br>
     * 送付先商品合計金額
     * @return The value of the column 'DELIV_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivTotal() {
        checkSpecifiedProperty("delivTotal");
        return _delivTotal;
    }

    /**
     * [set] DELIV_TOTAL: {bigint(19)} <br>
     * 送付先商品合計金額
     * @param delivTotal The value of the column 'DELIV_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTotal(Long delivTotal) {
        registerModifiedProperty("delivTotal");
        _delivTotal = delivTotal;
    }

    /**
     * [get] NOSHI: {varchar(255)} <br>
     * のし
     * @return The value of the column 'NOSHI'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoshi() {
        checkSpecifiedProperty("noshi");
        return convertEmptyToNull(_noshi);
    }

    /**
     * [set] NOSHI: {varchar(255)} <br>
     * のし
     * @param noshi The value of the column 'NOSHI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoshi(String noshi) {
        registerModifiedProperty("noshi");
        _noshi = noshi;
    }

    /**
     * [get] DELIV_ZIP_CD1: {varchar(30)} <br>
     * 送付先郵便番号1
     * @return The value of the column 'DELIV_ZIP_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd1() {
        checkSpecifiedProperty("delivZipCd1");
        return convertEmptyToNull(_delivZipCd1);
    }

    /**
     * [set] DELIV_ZIP_CD1: {varchar(30)} <br>
     * 送付先郵便番号1
     * @param delivZipCd1 The value of the column 'DELIV_ZIP_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd1(String delivZipCd1) {
        registerModifiedProperty("delivZipCd1");
        _delivZipCd1 = delivZipCd1;
    }

    /**
     * [get] DELIV_ZIP_CD2: {varchar(30)} <br>
     * 送付先郵便番号2
     * @return The value of the column 'DELIV_ZIP_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd2() {
        checkSpecifiedProperty("delivZipCd2");
        return convertEmptyToNull(_delivZipCd2);
    }

    /**
     * [set] DELIV_ZIP_CD2: {varchar(30)} <br>
     * 送付先郵便番号2
     * @param delivZipCd2 The value of the column 'DELIV_ZIP_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd2(String delivZipCd2) {
        registerModifiedProperty("delivZipCd2");
        _delivZipCd2 = delivZipCd2;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * 送付先住所：都道府県
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * 送付先住所：都道府県
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * 送付先住所：都市区
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * 送付先住所：都市区
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * 送付先住所：町以降
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * 送付先住所：町以降
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {varchar(255)} <br>
     * 送付先名字
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm1() {
        checkSpecifiedProperty("delivCustomerNm1");
        return convertEmptyToNull(_delivCustomerNm1);
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {varchar(255)} <br>
     * 送付先名字
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        registerModifiedProperty("delivCustomerNm1");
        _delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {varchar(255)} <br>
     * 送付先名前
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm2() {
        checkSpecifiedProperty("delivCustomerNm2");
        return convertEmptyToNull(_delivCustomerNm2);
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {varchar(255)} <br>
     * 送付先名前
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        registerModifiedProperty("delivCustomerNm2");
        _delivCustomerNm2 = delivCustomerNm2;
    }

    /**
     * [get] DELIV_CUSTOMER_KN1: {varchar(255)} <br>
     * 送付先名字フリガナ
     * @return The value of the column 'DELIV_CUSTOMER_KN1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerKn1() {
        checkSpecifiedProperty("delivCustomerKn1");
        return convertEmptyToNull(_delivCustomerKn1);
    }

    /**
     * [set] DELIV_CUSTOMER_KN1: {varchar(255)} <br>
     * 送付先名字フリガナ
     * @param delivCustomerKn1 The value of the column 'DELIV_CUSTOMER_KN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerKn1(String delivCustomerKn1) {
        registerModifiedProperty("delivCustomerKn1");
        _delivCustomerKn1 = delivCustomerKn1;
    }

    /**
     * [get] DELIV_CUSTOMER_KN2: {varchar(255)} <br>
     * 送付先名前フリガナ
     * @return The value of the column 'DELIV_CUSTOMER_KN2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerKn2() {
        checkSpecifiedProperty("delivCustomerKn2");
        return convertEmptyToNull(_delivCustomerKn2);
    }

    /**
     * [set] DELIV_CUSTOMER_KN2: {varchar(255)} <br>
     * 送付先名前フリガナ
     * @param delivCustomerKn2 The value of the column 'DELIV_CUSTOMER_KN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerKn2(String delivCustomerKn2) {
        registerModifiedProperty("delivCustomerKn2");
        _delivCustomerKn2 = delivCustomerKn2;
    }

    /**
     * [get] DELIV_TEL_NO1: {varchar(255)} <br>
     * 送付先電話番号1
     * @return The value of the column 'DELIV_TEL_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo1() {
        checkSpecifiedProperty("delivTelNo1");
        return convertEmptyToNull(_delivTelNo1);
    }

    /**
     * [set] DELIV_TEL_NO1: {varchar(255)} <br>
     * 送付先電話番号1
     * @param delivTelNo1 The value of the column 'DELIV_TEL_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo1(String delivTelNo1) {
        registerModifiedProperty("delivTelNo1");
        _delivTelNo1 = delivTelNo1;
    }

    /**
     * [get] DELIV_TEL_NO2: {varchar(255)} <br>
     * 送付先電話番号2
     * @return The value of the column 'DELIV_TEL_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo2() {
        checkSpecifiedProperty("delivTelNo2");
        return convertEmptyToNull(_delivTelNo2);
    }

    /**
     * [set] DELIV_TEL_NO2: {varchar(255)} <br>
     * 送付先電話番号2
     * @param delivTelNo2 The value of the column 'DELIV_TEL_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo2(String delivTelNo2) {
        registerModifiedProperty("delivTelNo2");
        _delivTelNo2 = delivTelNo2;
    }

    /**
     * [get] DELIV_TEL_NO3: {varchar(255)} <br>
     * 送付先電話番号3
     * @return The value of the column 'DELIV_TEL_NO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo3() {
        checkSpecifiedProperty("delivTelNo3");
        return convertEmptyToNull(_delivTelNo3);
    }

    /**
     * [set] DELIV_TEL_NO3: {varchar(255)} <br>
     * 送付先電話番号3
     * @param delivTelNo3 The value of the column 'DELIV_TEL_NO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo3(String delivTelNo3) {
        registerModifiedProperty("delivTelNo3");
        _delivTelNo3 = delivTelNo3;
    }

    /**
     * [get] PRODUCT_ID: {varchar(30)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductId() {
        checkSpecifiedProperty("productId");
        return convertEmptyToNull(_productId);
    }

    /**
     * [set] PRODUCT_ID: {varchar(30)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(String productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_NO: {varchar(100)} <br>
     * 商品番号
     * @return The value of the column 'PRODUCT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNo() {
        checkSpecifiedProperty("productNo");
        return convertEmptyToNull(_productNo);
    }

    /**
     * [set] PRODUCT_NO: {varchar(100)} <br>
     * 商品番号
     * @param productNo The value of the column 'PRODUCT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNo(String productNo) {
        registerModifiedProperty("productNo");
        _productNo = productNo;
    }

    /**
     * [get] PRODUCT_URL: {varchar(100)} <br>
     * 商品URL
     * @return The value of the column 'PRODUCT_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductUrl() {
        checkSpecifiedProperty("productUrl");
        return convertEmptyToNull(_productUrl);
    }

    /**
     * [set] PRODUCT_URL: {varchar(100)} <br>
     * 商品URL
     * @param productUrl The value of the column 'PRODUCT_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductUrl(String productUrl) {
        registerModifiedProperty("productUrl");
        _productUrl = productUrl;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(Long unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'ORDER_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOrderNum() {
        checkSpecifiedProperty("orderNum");
        return _orderNum;
    }

    /**
     * [set] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @param orderNum The value of the column 'ORDER_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNum(Long orderNum) {
        registerModifiedProperty("orderNum");
        _orderNum = orderNum;
    }

    /**
     * [get] PRODUCT_CARRIAGE: {bigint(19)} <br>
     * 送料込別
     * @return The value of the column 'PRODUCT_CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductCarriage() {
        checkSpecifiedProperty("productCarriage");
        return _productCarriage;
    }

    /**
     * [set] PRODUCT_CARRIAGE: {bigint(19)} <br>
     * 送料込別
     * @param productCarriage The value of the column 'PRODUCT_CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCarriage(Long productCarriage) {
        registerModifiedProperty("productCarriage");
        _productCarriage = productCarriage;
    }

    /**
     * [get] PRODUCT_TAX: {bigint(19)} <br>
     * 税込別
     * @return The value of the column 'PRODUCT_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductTax() {
        checkSpecifiedProperty("productTax");
        return _productTax;
    }

    /**
     * [set] PRODUCT_TAX: {bigint(19)} <br>
     * 税込別
     * @param productTax The value of the column 'PRODUCT_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductTax(Long productTax) {
        registerModifiedProperty("productTax");
        _productTax = productTax;
    }

    /**
     * [get] PRODUCT_COD: {bigint(19)} <br>
     * 代引手数料込別
     * @return The value of the column 'PRODUCT_COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductCod() {
        checkSpecifiedProperty("productCod");
        return _productCod;
    }

    /**
     * [set] PRODUCT_COD: {bigint(19)} <br>
     * 代引手数料込別
     * @param productCod The value of the column 'PRODUCT_COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCod(Long productCod) {
        registerModifiedProperty("productCod");
        _productCod = productCod;
    }

    /**
     * [get] ITEM_CHOICE: {varchar(255)} <br>
     * 項目・選択肢
     * @return The value of the column 'ITEM_CHOICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemChoice() {
        checkSpecifiedProperty("itemChoice");
        return convertEmptyToNull(_itemChoice);
    }

    /**
     * [set] ITEM_CHOICE: {varchar(255)} <br>
     * 項目・選択肢
     * @param itemChoice The value of the column 'ITEM_CHOICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemChoice(String itemChoice) {
        registerModifiedProperty("itemChoice");
        _itemChoice = itemChoice;
    }

    /**
     * [get] POINT_SCALE: {decimal(16, 6)} <br>
     * ポイント倍率
     * @return The value of the column 'POINT_SCALE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPointScale() {
        checkSpecifiedProperty("pointScale");
        return _pointScale;
    }

    /**
     * [set] POINT_SCALE: {decimal(16, 6)} <br>
     * ポイント倍率
     * @param pointScale The value of the column 'POINT_SCALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointScale(java.math.BigDecimal pointScale) {
        registerModifiedProperty("pointScale");
        _pointScale = pointScale;
    }

    /**
     * [get] POINT_TYPE: {varchar(100)} <br>
     * ポイントタイプ
     * @return The value of the column 'POINT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPointType() {
        checkSpecifiedProperty("pointType");
        return convertEmptyToNull(_pointType);
    }

    /**
     * [set] POINT_TYPE: {varchar(100)} <br>
     * ポイントタイプ
     * @param pointType The value of the column 'POINT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointType(String pointType) {
        registerModifiedProperty("pointType");
        _pointType = pointType;
    }

    /**
     * [get] RECORD_NUMBER: {bigint(19)} <br>
     * レコードナンバー
     * @return The value of the column 'RECORD_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRecordNumber() {
        checkSpecifiedProperty("recordNumber");
        return _recordNumber;
    }

    /**
     * [set] RECORD_NUMBER: {bigint(19)} <br>
     * レコードナンバー
     * @param recordNumber The value of the column 'RECORD_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecordNumber(Long recordNumber) {
        registerModifiedProperty("recordNumber");
        _recordNumber = recordNumber;
    }

    /**
     * [get] DELIVERY_INFO: {varchar(100)} <br>
     * 納期情報
     * @return The value of the column 'DELIVERY_INFO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryInfo() {
        checkSpecifiedProperty("deliveryInfo");
        return convertEmptyToNull(_deliveryInfo);
    }

    /**
     * [set] DELIVERY_INFO: {varchar(100)} <br>
     * 納期情報
     * @param deliveryInfo The value of the column 'DELIVERY_INFO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryInfo(String deliveryInfo) {
        registerModifiedProperty("deliveryInfo");
        _deliveryInfo = deliveryInfo;
    }

    /**
     * [get] STOCK_TYPE: {varchar(100)} <br>
     * 在庫タイプ
     * @return The value of the column 'STOCK_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockType() {
        checkSpecifiedProperty("stockType");
        return convertEmptyToNull(_stockType);
    }

    /**
     * [set] STOCK_TYPE: {varchar(100)} <br>
     * 在庫タイプ
     * @param stockType The value of the column 'STOCK_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockType(String stockType) {
        registerModifiedProperty("stockType");
        _stockType = stockType;
    }

    /**
     * [get] WRAPPING_TYPE_P: {varchar(255)} <br>
     * ラッピング種類(包装紙)
     * @return The value of the column 'WRAPPING_TYPE_P'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingTypeP() {
        checkSpecifiedProperty("wrappingTypeP");
        return convertEmptyToNull(_wrappingTypeP);
    }

    /**
     * [set] WRAPPING_TYPE_P: {varchar(255)} <br>
     * ラッピング種類(包装紙)
     * @param wrappingTypeP The value of the column 'WRAPPING_TYPE_P'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTypeP(String wrappingTypeP) {
        registerModifiedProperty("wrappingTypeP");
        _wrappingTypeP = wrappingTypeP;
    }

    /**
     * [get] WRAPPING_TYPE_R: {varchar(255)} <br>
     * ラッピング種類(リボン)
     * @return The value of the column 'WRAPPING_TYPE_R'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrappingTypeR() {
        checkSpecifiedProperty("wrappingTypeR");
        return convertEmptyToNull(_wrappingTypeR);
    }

    /**
     * [set] WRAPPING_TYPE_R: {varchar(255)} <br>
     * ラッピング種類(リボン)
     * @param wrappingTypeR The value of the column 'WRAPPING_TYPE_R'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrappingTypeR(String wrappingTypeR) {
        registerModifiedProperty("wrappingTypeR");
        _wrappingTypeR = wrappingTypeR;
    }

    /**
     * [get] TOMORROW_FLG: {varchar(30)} <br>
     * あす楽希望
     * @return The value of the column 'TOMORROW_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTomorrowFlg() {
        checkSpecifiedProperty("tomorrowFlg");
        return convertEmptyToNull(_tomorrowFlg);
    }

    /**
     * [set] TOMORROW_FLG: {varchar(30)} <br>
     * あす楽希望
     * @param tomorrowFlg The value of the column 'TOMORROW_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTomorrowFlg(String tomorrowFlg) {
        registerModifiedProperty("tomorrowFlg");
        _tomorrowFlg = tomorrowFlg;
    }

    /**
     * [get] COUPON_USE: {bigint(19)} <br>
     * クーポン利用額
     * @return The value of the column 'COUPON_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCouponUse() {
        checkSpecifiedProperty("couponUse");
        return _couponUse;
    }

    /**
     * [set] COUPON_USE: {bigint(19)} <br>
     * クーポン利用額
     * @param couponUse The value of the column 'COUPON_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCouponUse(Long couponUse) {
        registerModifiedProperty("couponUse");
        _couponUse = couponUse;
    }

    /**
     * [get] SHOP_COUPON_USE: {bigint(19)} <br>
     * 店舗発行クーポン利用額
     * @return The value of the column 'SHOP_COUPON_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShopCouponUse() {
        checkSpecifiedProperty("shopCouponUse");
        return _shopCouponUse;
    }

    /**
     * [set] SHOP_COUPON_USE: {bigint(19)} <br>
     * 店舗発行クーポン利用額
     * @param shopCouponUse The value of the column 'SHOP_COUPON_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopCouponUse(Long shopCouponUse) {
        registerModifiedProperty("shopCouponUse");
        _shopCouponUse = shopCouponUse;
    }

    /**
     * [get] RAKUTEN_COUPON_USE: {bigint(19)} <br>
     * 楽天発行クーポン利用額
     * @return The value of the column 'RAKUTEN_COUPON_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRakutenCouponUse() {
        checkSpecifiedProperty("rakutenCouponUse");
        return _rakutenCouponUse;
    }

    /**
     * [set] RAKUTEN_COUPON_USE: {bigint(19)} <br>
     * 楽天発行クーポン利用額
     * @param rakutenCouponUse The value of the column 'RAKUTEN_COUPON_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRakutenCouponUse(Long rakutenCouponUse) {
        registerModifiedProperty("rakutenCouponUse");
        _rakutenCouponUse = rakutenCouponUse;
    }

    /**
     * [get] COMBINE_COUPON_USE: {bigint(19)} <br>
     * 同梱注文クーポン利用額
     * @return The value of the column 'COMBINE_COUPON_USE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCombineCouponUse() {
        checkSpecifiedProperty("combineCouponUse");
        return _combineCouponUse;
    }

    /**
     * [set] COMBINE_COUPON_USE: {bigint(19)} <br>
     * 同梱注文クーポン利用額
     * @param combineCouponUse The value of the column 'COMBINE_COUPON_USE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCombineCouponUse(Long combineCouponUse) {
        registerModifiedProperty("combineCouponUse");
        _combineCouponUse = combineCouponUse;
    }

    /**
     * [get] DELIV_COMPANY: {varchar(255)} <br>
     * 配送会社
     * @return The value of the column 'DELIV_COMPANY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCompany() {
        checkSpecifiedProperty("delivCompany");
        return convertEmptyToNull(_delivCompany);
    }

    /**
     * [set] DELIV_COMPANY: {varchar(255)} <br>
     * 配送会社
     * @param delivCompany The value of the column 'DELIV_COMPANY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCompany(String delivCompany) {
        registerModifiedProperty("delivCompany");
        _delivCompany = delivCompany;
    }

    /**
     * [get] PHAMACE_FLG: {char(1)} <br>
     * 薬事フラグ
     * @return The value of the column 'PHAMACE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhamaceFlg() {
        checkSpecifiedProperty("phamaceFlg");
        return convertEmptyToNull(_phamaceFlg);
    }

    /**
     * [set] PHAMACE_FLG: {char(1)} <br>
     * 薬事フラグ
     * @param phamaceFlg The value of the column 'PHAMACE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhamaceFlg(String phamaceFlg) {
        registerModifiedProperty("phamaceFlg");
        _phamaceFlg = phamaceFlg;
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
