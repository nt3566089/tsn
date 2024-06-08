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
 * The entity of T_EC_ORDER_H as TABLE. <br>
 * EC受注ヘッダ
 * <pre>
 * [primary-key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, CLIENT_ID, CENTER_ID, IMPORT_DT, ORDER_NO, PRIORITY_FLG, ORDER_DT, ORDER_TIME, DELIV_DT, DELIV_TZ, COMMENT1, COMMENT2, GIFT_FLG, NOSHI, ORDER_ZIP_CD, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM, ORDER_CUSTOMER_NM_KANA, ORDER_TEL_NO, DELIV_MATCH_FLG, MERGE_ID, MERGE_STATUS, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, INVOICE_DELIV_ADDRESS1, INVOICE_DELIV_ADDRESS2, INVOICE_DELIV_ADDRESS3, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM_KANA, DELIV_TEL_NO, DELIV_METHOD, DELIV_TYPE, DELIV_COMPANY, PAYMENT_METHOD, CARD_TYPE, TOTAL, TAX, CARRIAGE, COD, TOTAL_AMOUNT, COUPON_DISCOUNT, POINT_DISCOUNT, OTHER_DISCOUNT, AMOUNT_BILLED, MERGE_TOTAL, MERGE_CARRIAGE, MERGE_COD, MERGE_TAX, MERGE_AMOUNT_BILLED, MERGE_TOTAL_AMOUNT, MERGE_COUPON_DISCOUNT, MERGE_POINT_DISCOUNT, MERGE_OTHER_DISCOUNT, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, IMPORT_TYPE_ID, SHIPPING_INST_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_IMPORT_TYPE, T_SHIPPING_INST_H, M_CENTER, M_CLIENT, B_CLASS_DTL(ByDelivMatchFlg), T_EC_ORDER_R(AsOne)
 *
 * [referrer table]
 *     T_EC_ORDER_B, T_EC_ORDER_R
 *
 * [foreign property]
 *     mImportType, tShippingInstH, mCenter, mClient, bClassDtlByDelivMatchFlg, bClassDtlByErrorFlg, bClassDtlByGiftFlg, bClassDtlByImportFlg, bClassDtlByPriorityFlg, tEcOrderRAsOne
 *
 * [referrer property]
 *     tEcOrderBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ecOrderHId = entity.getEcOrderHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String importDt = entity.getImportDt();
 * String orderNo = entity.getOrderNo();
 * String priorityFlg = entity.getPriorityFlg();
 * String orderDt = entity.getOrderDt();
 * String orderTime = entity.getOrderTime();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String comment1 = entity.getComment1();
 * String comment2 = entity.getComment2();
 * String giftFlg = entity.getGiftFlg();
 * String noshi = entity.getNoshi();
 * String orderZipCd = entity.getOrderZipCd();
 * String orderAddress1 = entity.getOrderAddress1();
 * String orderAddress2 = entity.getOrderAddress2();
 * String orderAddress3 = entity.getOrderAddress3();
 * String orderCustomerNm = entity.getOrderCustomerNm();
 * String orderCustomerNmKana = entity.getOrderCustomerNmKana();
 * String orderTelNo = entity.getOrderTelNo();
 * String delivMatchFlg = entity.getDelivMatchFlg();
 * String mergeId = entity.getMergeId();
 * String mergeStatus = entity.getMergeStatus();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String invoiceDelivAddress1 = entity.getInvoiceDelivAddress1();
 * String invoiceDelivAddress2 = entity.getInvoiceDelivAddress2();
 * String invoiceDelivAddress3 = entity.getInvoiceDelivAddress3();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivCustomerNmKana = entity.getDelivCustomerNmKana();
 * String delivTelNo = entity.getDelivTelNo();
 * String delivMethod = entity.getDelivMethod();
 * String delivType = entity.getDelivType();
 * String delivCompany = entity.getDelivCompany();
 * String paymentMethod = entity.getPaymentMethod();
 * String cardType = entity.getCardType();
 * Long total = entity.getTotal();
 * Long tax = entity.getTax();
 * Long carriage = entity.getCarriage();
 * Long cod = entity.getCod();
 * Long totalAmount = entity.getTotalAmount();
 * Long couponDiscount = entity.getCouponDiscount();
 * Long pointDiscount = entity.getPointDiscount();
 * Long otherDiscount = entity.getOtherDiscount();
 * Long amountBilled = entity.getAmountBilled();
 * Long mergeTotal = entity.getMergeTotal();
 * Long mergeCarriage = entity.getMergeCarriage();
 * Long mergeCod = entity.getMergeCod();
 * Long mergeTax = entity.getMergeTax();
 * Long mergeAmountBilled = entity.getMergeAmountBilled();
 * Long mergeTotalAmount = entity.getMergeTotalAmount();
 * Long mergeCouponDiscount = entity.getMergeCouponDiscount();
 * Long mergePointDiscount = entity.getMergePointDiscount();
 * Long mergeOtherDiscount = entity.getMergeOtherDiscount();
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
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String importFlg = entity.getImportFlg();
 * Long importTypeId = entity.getImportTypeId();
 * Long shippingInstHId = entity.getShippingInstHId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setEcOrderHId(ecOrderHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setImportDt(importDt);
 * entity.setOrderNo(orderNo);
 * entity.setPriorityFlg(priorityFlg);
 * entity.setOrderDt(orderDt);
 * entity.setOrderTime(orderTime);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setComment1(comment1);
 * entity.setComment2(comment2);
 * entity.setGiftFlg(giftFlg);
 * entity.setNoshi(noshi);
 * entity.setOrderZipCd(orderZipCd);
 * entity.setOrderAddress1(orderAddress1);
 * entity.setOrderAddress2(orderAddress2);
 * entity.setOrderAddress3(orderAddress3);
 * entity.setOrderCustomerNm(orderCustomerNm);
 * entity.setOrderCustomerNmKana(orderCustomerNmKana);
 * entity.setOrderTelNo(orderTelNo);
 * entity.setDelivMatchFlg(delivMatchFlg);
 * entity.setMergeId(mergeId);
 * entity.setMergeStatus(mergeStatus);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setInvoiceDelivAddress1(invoiceDelivAddress1);
 * entity.setInvoiceDelivAddress2(invoiceDelivAddress2);
 * entity.setInvoiceDelivAddress3(invoiceDelivAddress3);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivCustomerNmKana(delivCustomerNmKana);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDelivMethod(delivMethod);
 * entity.setDelivType(delivType);
 * entity.setDelivCompany(delivCompany);
 * entity.setPaymentMethod(paymentMethod);
 * entity.setCardType(cardType);
 * entity.setTotal(total);
 * entity.setTax(tax);
 * entity.setCarriage(carriage);
 * entity.setCod(cod);
 * entity.setTotalAmount(totalAmount);
 * entity.setCouponDiscount(couponDiscount);
 * entity.setPointDiscount(pointDiscount);
 * entity.setOtherDiscount(otherDiscount);
 * entity.setAmountBilled(amountBilled);
 * entity.setMergeTotal(mergeTotal);
 * entity.setMergeCarriage(mergeCarriage);
 * entity.setMergeCod(mergeCod);
 * entity.setMergeTax(mergeTax);
 * entity.setMergeAmountBilled(mergeAmountBilled);
 * entity.setMergeTotalAmount(mergeTotalAmount);
 * entity.setMergeCouponDiscount(mergeCouponDiscount);
 * entity.setMergePointDiscount(mergePointDiscount);
 * entity.setMergeOtherDiscount(mergeOtherDiscount);
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
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setImportFlg(importFlg);
 * entity.setImportTypeId(importTypeId);
 * entity.setShippingInstHId(shippingInstHId);
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
public abstract class BsTEcOrderH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _ecOrderHId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** IMPORT_DT: {IX, varchar(8)} */
    protected String _importDt;

    /** ORDER_NO: {IX, varchar(100)} */
    protected String _orderNo;

    /** PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} */
    protected String _priorityFlg;

    /** ORDER_DT: {varchar(30)} */
    protected String _orderDt;

    /** ORDER_TIME: {varchar(30)} */
    protected String _orderTime;

    /** DELIV_DT: {varchar(30)} */
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30)} */
    protected String _delivTz;

    /** COMMENT1: {varchar(255)} */
    protected String _comment1;

    /** COMMENT2: {varchar(255)} */
    protected String _comment2;

    /** GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} */
    protected String _giftFlg;

    /** NOSHI: {varchar(255)} */
    protected String _noshi;

    /** ORDER_ZIP_CD: {varchar(30)} */
    protected String _orderZipCd;

    /** ORDER_ADDRESS1: {varchar(255)} */
    protected String _orderAddress1;

    /** ORDER_ADDRESS2: {varchar(255)} */
    protected String _orderAddress2;

    /** ORDER_ADDRESS3: {varchar(255)} */
    protected String _orderAddress3;

    /** ORDER_CUSTOMER_NM: {varchar(255)} */
    protected String _orderCustomerNm;

    /** ORDER_CUSTOMER_NM_KANA: {varchar(255)} */
    protected String _orderCustomerNmKana;

    /** ORDER_TEL_NO: {varchar(255)} */
    protected String _orderTelNo;

    /** DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} */
    protected String _delivMatchFlg;

    /** MERGE_ID: {IX, varchar(100)} */
    protected String _mergeId;

    /** MERGE_STATUS: {varchar(30)} */
    protected String _mergeStatus;

    /** DELIV_ZIP_CD: {varchar(30)} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** INVOICE_DELIV_ADDRESS1: {varchar(255)} */
    protected String _invoiceDelivAddress1;

    /** INVOICE_DELIV_ADDRESS2: {varchar(255)} */
    protected String _invoiceDelivAddress2;

    /** INVOICE_DELIV_ADDRESS3: {varchar(255)} */
    protected String _invoiceDelivAddress3;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM_KANA: {varchar(255)} */
    protected String _delivCustomerNmKana;

    /** DELIV_TEL_NO: {varchar(255)} */
    protected String _delivTelNo;

    /** DELIV_METHOD: {varchar(255)} */
    protected String _delivMethod;

    /** DELIV_TYPE: {varchar(255)} */
    protected String _delivType;

    /** DELIV_COMPANY: {varchar(255)} */
    protected String _delivCompany;

    /** PAYMENT_METHOD: {varchar(255)} */
    protected String _paymentMethod;

    /** CARD_TYPE: {varchar(60)} */
    protected String _cardType;

    /** TOTAL: {bigint(19)} */
    protected Long _total;

    /** TAX: {bigint(19)} */
    protected Long _tax;

    /** CARRIAGE: {bigint(19)} */
    protected Long _carriage;

    /** COD: {bigint(19)} */
    protected Long _cod;

    /** TOTAL_AMOUNT: {bigint(19)} */
    protected Long _totalAmount;

    /** COUPON_DISCOUNT: {bigint(19)} */
    protected Long _couponDiscount;

    /** POINT_DISCOUNT: {bigint(19)} */
    protected Long _pointDiscount;

    /** OTHER_DISCOUNT: {bigint(19)} */
    protected Long _otherDiscount;

    /** AMOUNT_BILLED: {bigint(19)} */
    protected Long _amountBilled;

    /** MERGE_TOTAL: {bigint(19)} */
    protected Long _mergeTotal;

    /** MERGE_CARRIAGE: {bigint(19)} */
    protected Long _mergeCarriage;

    /** MERGE_COD: {bigint(19)} */
    protected Long _mergeCod;

    /** MERGE_TAX: {bigint(19)} */
    protected Long _mergeTax;

    /** MERGE_AMOUNT_BILLED: {bigint(19)} */
    protected Long _mergeAmountBilled;

    /** MERGE_TOTAL_AMOUNT: {bigint(19)} */
    protected Long _mergeTotalAmount;

    /** MERGE_COUPON_DISCOUNT: {bigint(19)} */
    protected Long _mergeCouponDiscount;

    /** MERGE_POINT_DISCOUNT: {bigint(19)} */
    protected Long _mergePointDiscount;

    /** MERGE_OTHER_DISCOUNT: {bigint(19)} */
    protected Long _mergeOtherDiscount;

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

    /** RECEIVE_ID: {bigint(19)} */
    protected Long _receiveId;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} */
    protected String _importFlg;

    /** IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} */
    protected Long _importTypeId;

    /** SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} */
    protected Long _shippingInstHId;

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
        return "T_EC_ORDER_H";
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
        if (_ecOrderHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of priorityFlg as the classification of PriorityFlg. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PriorityFlg getPriorityFlgAsPriorityFlg() {
        return CDef.PriorityFlg.codeOf(getPriorityFlg());
    }

    /**
     * Set the value of priorityFlg as the classification of PriorityFlg. <br>
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPriorityFlgAsPriorityFlg(CDef.PriorityFlg cdef) {
        setPriorityFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of giftFlg as the classification of GiftFlg. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GiftFlg getGiftFlgAsGiftFlg() {
        return CDef.GiftFlg.codeOf(getGiftFlg());
    }

    /**
     * Set the value of giftFlg as the classification of GiftFlg. <br>
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGiftFlgAsGiftFlg(CDef.GiftFlg cdef) {
        setGiftFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delivMatchFlg as the classification of DelivMatchFlg. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelivMatchFlg getDelivMatchFlgAsDelivMatchFlg() {
        return CDef.DelivMatchFlg.codeOf(getDelivMatchFlg());
    }

    /**
     * Set the value of delivMatchFlg as the classification of DelivMatchFlg. <br>
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelivMatchFlgAsDelivMatchFlg(CDef.DelivMatchFlg cdef) {
        setDelivMatchFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of importFlg as the classification of ImportFlg. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ImportFlg getImportFlgAsImportFlg() {
        return CDef.ImportFlg.codeOf(getImportFlg());
    }

    /**
     * Set the value of importFlg as the classification of ImportFlg. <br>
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込みフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setImportFlgAsImportFlg(CDef.ImportFlg cdef) {
        setImportFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of priorityFlg as $0 (0). <br>
     * $0: 優先指定無
     */
    public void setPriorityFlg_$0() {
        setPriorityFlgAsPriorityFlg(CDef.PriorityFlg.$0);
    }

    /**
     * Set the value of priorityFlg as $1 (1). <br>
     * $1: 優先指定有
     */
    public void setPriorityFlg_$1() {
        setPriorityFlgAsPriorityFlg(CDef.PriorityFlg.$1);
    }

    /**
     * Set the value of giftFlg as $0 (0). <br>
     * $0: ギフト指定無
     */
    public void setGiftFlg_$0() {
        setGiftFlgAsGiftFlg(CDef.GiftFlg.$0);
    }

    /**
     * Set the value of giftFlg as $1 (1). <br>
     * $1: ギフト指定有
     */
    public void setGiftFlg_$1() {
        setGiftFlgAsGiftFlg(CDef.GiftFlg.$1);
    }

    /**
     * Set the value of delivMatchFlg as $0 (0). <br>
     * $0: 不一致
     */
    public void setDelivMatchFlg_$0() {
        setDelivMatchFlgAsDelivMatchFlg(CDef.DelivMatchFlg.$0);
    }

    /**
     * Set the value of delivMatchFlg as $1 (1). <br>
     * $1: 一致
     */
    public void setDelivMatchFlg_$1() {
        setDelivMatchFlgAsDelivMatchFlg(CDef.DelivMatchFlg.$1);
    }

    /**
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
    }

    /**
     * Set the value of importFlg as $0 (0). <br>
     * $0: 未取込
     */
    public void setImportFlg_$0() {
        setImportFlgAsImportFlg(CDef.ImportFlg.$0);
    }

    /**
     * Set the value of importFlg as $1 (1). <br>
     * $1: 取込済
     */
    public void setImportFlg_$1() {
        setImportFlgAsImportFlg(CDef.ImportFlg.$1);
    }

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
     * Is the value of priorityFlg $0? <br>
     * $0: 優先指定無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPriorityFlg$0() {
        CDef.PriorityFlg cdef = getPriorityFlgAsPriorityFlg();
        return cdef != null ? cdef.equals(CDef.PriorityFlg.$0) : false;
    }

    /**
     * Is the value of priorityFlg $1? <br>
     * $1: 優先指定有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPriorityFlg$1() {
        CDef.PriorityFlg cdef = getPriorityFlgAsPriorityFlg();
        return cdef != null ? cdef.equals(CDef.PriorityFlg.$1) : false;
    }

    /**
     * Is the value of giftFlg $0? <br>
     * $0: ギフト指定無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiftFlg$0() {
        CDef.GiftFlg cdef = getGiftFlgAsGiftFlg();
        return cdef != null ? cdef.equals(CDef.GiftFlg.$0) : false;
    }

    /**
     * Is the value of giftFlg $1? <br>
     * $1: ギフト指定有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiftFlg$1() {
        CDef.GiftFlg cdef = getGiftFlgAsGiftFlg();
        return cdef != null ? cdef.equals(CDef.GiftFlg.$1) : false;
    }

    /**
     * Is the value of delivMatchFlg $0? <br>
     * $0: 不一致
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivMatchFlg$0() {
        CDef.DelivMatchFlg cdef = getDelivMatchFlgAsDelivMatchFlg();
        return cdef != null ? cdef.equals(CDef.DelivMatchFlg.$0) : false;
    }

    /**
     * Is the value of delivMatchFlg $1? <br>
     * $1: 一致
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivMatchFlg$1() {
        CDef.DelivMatchFlg cdef = getDelivMatchFlgAsDelivMatchFlg();
        return cdef != null ? cdef.equals(CDef.DelivMatchFlg.$1) : false;
    }

    /**
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
    }

    /**
     * Is the value of importFlg $0? <br>
     * $0: 未取込
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isImportFlg$0() {
        CDef.ImportFlg cdef = getImportFlgAsImportFlg();
        return cdef != null ? cdef.equals(CDef.ImportFlg.$0) : false;
    }

    /**
     * Is the value of importFlg $1? <br>
     * $1: 取込済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isImportFlg$1() {
        CDef.ImportFlg cdef = getImportFlgAsImportFlg();
        return cdef != null ? cdef.equals(CDef.ImportFlg.$1) : false;
    }

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
     * Get the value of the column 'priorityFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPriorityFlgName() {
        CDef.PriorityFlg cdef = getPriorityFlgAsPriorityFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'giftFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getGiftFlgName() {
        CDef.GiftFlg cdef = getGiftFlgAsGiftFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delivMatchFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelivMatchFlgName() {
        CDef.DelivMatchFlg cdef = getDelivMatchFlgAsDelivMatchFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'importFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getImportFlgName() {
        CDef.ImportFlg cdef = getImportFlgAsImportFlg();
        return cdef != null ? cdef.name() : null;
    }

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
    /** M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'. */
    protected MImportType _mImportType;

    /**
     * [get] M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'. <br>
     * @return The entity of foreign property 'MImportType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MImportType getMImportType() {
        return _mImportType;
    }

    /**
     * [set] M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param mImportType The entity of foreign property 'MImportType'. (NullAllowed)
     */
    public void setMImportType(MImportType mImportType) {
        _mImportType = mImportType;
    }

    /** T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'. */
    protected TShippingInstH _tShippingInstH;

    /**
     * [get] T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'. <br>
     * @return The entity of foreign property 'TShippingInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TShippingInstH getTShippingInstH() {
        return _tShippingInstH;
    }

    /**
     * [set] T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param tShippingInstH The entity of foreign property 'TShippingInstH'. (NullAllowed)
     */
    public void setTShippingInstH(TShippingInstH tShippingInstH) {
        _tShippingInstH = tShippingInstH;
    }

    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'. */
    protected BClassDtl _bClassDtlByDelivMatchFlg;

    /**
     * [get] B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelivMatchFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelivMatchFlg() {
        return _bClassDtlByDelivMatchFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
     * @param bClassDtlByDelivMatchFlg The entity of foreign property 'BClassDtlByDelivMatchFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelivMatchFlg(BClassDtl bClassDtlByDelivMatchFlg) {
        _bClassDtlByDelivMatchFlg = bClassDtlByDelivMatchFlg;
    }

    /** B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    /** B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'. */
    protected BClassDtl _bClassDtlByGiftFlg;

    /**
     * [get] B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByGiftFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByGiftFlg() {
        return _bClassDtlByGiftFlg;
    }

    /**
     * [set] B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
     * @param bClassDtlByGiftFlg The entity of foreign property 'BClassDtlByGiftFlg'. (NullAllowed)
     */
    public void setBClassDtlByGiftFlg(BClassDtl bClassDtlByGiftFlg) {
        _bClassDtlByGiftFlg = bClassDtlByGiftFlg;
    }

    /** B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'. */
    protected BClassDtl _bClassDtlByImportFlg;

    /**
     * [get] B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByImportFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByImportFlg() {
        return _bClassDtlByImportFlg;
    }

    /**
     * [set] B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
     * @param bClassDtlByImportFlg The entity of foreign property 'BClassDtlByImportFlg'. (NullAllowed)
     */
    public void setBClassDtlByImportFlg(BClassDtl bClassDtlByImportFlg) {
        _bClassDtlByImportFlg = bClassDtlByImportFlg;
    }

    /** B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'. */
    protected BClassDtl _bClassDtlByPriorityFlg;

    /**
     * [get] B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPriorityFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPriorityFlg() {
        return _bClassDtlByPriorityFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
     * @param bClassDtlByPriorityFlg The entity of foreign property 'BClassDtlByPriorityFlg'. (NullAllowed)
     */
    public void setBClassDtlByPriorityFlg(BClassDtl bClassDtlByPriorityFlg) {
        _bClassDtlByPriorityFlg = bClassDtlByPriorityFlg;
    }

    /** T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'. */
    protected TEcOrderR _tEcOrderRAsOne;

    /**
     * [get] T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TEcOrderRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TEcOrderR getTEcOrderRAsOne() {
        return _tEcOrderRAsOne;
    }

    /**
     * [set] T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * @param TEcOrderRAsOne The entity of foreign property(referrer-as-one) 'TEcOrderRAsOne'. (NullAllowed)
     */
    public void setTEcOrderRAsOne(TEcOrderR TEcOrderRAsOne) {
        _tEcOrderRAsOne = TEcOrderRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'. */
    protected List<TEcOrderB> _tEcOrderBList;

    /**
     * [get] T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * @return The entity list of referrer property 'TEcOrderBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderB> getTEcOrderBList() {
        if (_tEcOrderBList == null) { _tEcOrderBList = newReferrerList(); }
        return _tEcOrderBList;
    }

    /**
     * [set] T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * @param tEcOrderBList The entity list of referrer property 'TEcOrderBList'. (NullAllowed)
     */
    public void setTEcOrderBList(List<TEcOrderB> tEcOrderBList) {
        _tEcOrderBList = tEcOrderBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTEcOrderH) {
            BsTEcOrderH other = (BsTEcOrderH)obj;
            if (!xSV(_ecOrderHId, other._ecOrderHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ecOrderHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mImportType != null)
        { sb.append(li).append(xbRDS(_mImportType, "mImportType")); }
        if (_tShippingInstH != null)
        { sb.append(li).append(xbRDS(_tShippingInstH, "tShippingInstH")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_bClassDtlByDelivMatchFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelivMatchFlg, "bClassDtlByDelivMatchFlg")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByGiftFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByGiftFlg, "bClassDtlByGiftFlg")); }
        if (_bClassDtlByImportFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByImportFlg, "bClassDtlByImportFlg")); }
        if (_bClassDtlByPriorityFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPriorityFlg, "bClassDtlByPriorityFlg")); }
        if (_tEcOrderRAsOne != null)
        { sb.append(li).append(xbRDS(_tEcOrderRAsOne, "tEcOrderRAsOne")); }
        if (_tEcOrderBList != null) { for (TEcOrderB et : _tEcOrderBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ecOrderHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_importDt));
        sb.append(dm).append(xfND(_orderNo));
        sb.append(dm).append(xfND(_priorityFlg));
        sb.append(dm).append(xfND(_orderDt));
        sb.append(dm).append(xfND(_orderTime));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_comment1));
        sb.append(dm).append(xfND(_comment2));
        sb.append(dm).append(xfND(_giftFlg));
        sb.append(dm).append(xfND(_noshi));
        sb.append(dm).append(xfND(_orderZipCd));
        sb.append(dm).append(xfND(_orderAddress1));
        sb.append(dm).append(xfND(_orderAddress2));
        sb.append(dm).append(xfND(_orderAddress3));
        sb.append(dm).append(xfND(_orderCustomerNm));
        sb.append(dm).append(xfND(_orderCustomerNmKana));
        sb.append(dm).append(xfND(_orderTelNo));
        sb.append(dm).append(xfND(_delivMatchFlg));
        sb.append(dm).append(xfND(_mergeId));
        sb.append(dm).append(xfND(_mergeStatus));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_invoiceDelivAddress1));
        sb.append(dm).append(xfND(_invoiceDelivAddress2));
        sb.append(dm).append(xfND(_invoiceDelivAddress3));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerNmKana));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_delivMethod));
        sb.append(dm).append(xfND(_delivType));
        sb.append(dm).append(xfND(_delivCompany));
        sb.append(dm).append(xfND(_paymentMethod));
        sb.append(dm).append(xfND(_cardType));
        sb.append(dm).append(xfND(_total));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_carriage));
        sb.append(dm).append(xfND(_cod));
        sb.append(dm).append(xfND(_totalAmount));
        sb.append(dm).append(xfND(_couponDiscount));
        sb.append(dm).append(xfND(_pointDiscount));
        sb.append(dm).append(xfND(_otherDiscount));
        sb.append(dm).append(xfND(_amountBilled));
        sb.append(dm).append(xfND(_mergeTotal));
        sb.append(dm).append(xfND(_mergeCarriage));
        sb.append(dm).append(xfND(_mergeCod));
        sb.append(dm).append(xfND(_mergeTax));
        sb.append(dm).append(xfND(_mergeAmountBilled));
        sb.append(dm).append(xfND(_mergeTotalAmount));
        sb.append(dm).append(xfND(_mergeCouponDiscount));
        sb.append(dm).append(xfND(_mergePointDiscount));
        sb.append(dm).append(xfND(_mergeOtherDiscount));
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
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_importTypeId));
        sb.append(dm).append(xfND(_shippingInstHId));
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
        if (_mImportType != null)
        { sb.append(dm).append("mImportType"); }
        if (_tShippingInstH != null)
        { sb.append(dm).append("tShippingInstH"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_bClassDtlByDelivMatchFlg != null)
        { sb.append(dm).append("bClassDtlByDelivMatchFlg"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByGiftFlg != null)
        { sb.append(dm).append("bClassDtlByGiftFlg"); }
        if (_bClassDtlByImportFlg != null)
        { sb.append(dm).append("bClassDtlByImportFlg"); }
        if (_bClassDtlByPriorityFlg != null)
        { sb.append(dm).append("bClassDtlByPriorityFlg"); }
        if (_tEcOrderRAsOne != null)
        { sb.append(dm).append("tEcOrderRAsOne"); }
        if (_tEcOrderBList != null && !_tEcOrderBList.isEmpty())
        { sb.append(dm).append("tEcOrderBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TEcOrderH clone() {
        return (TEcOrderH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getEcOrderHId() {
        checkSpecifiedProperty("ecOrderHId");
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        registerModifiedProperty("ecOrderHId");
        _ecOrderHId = ecOrderHId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] IMPORT_DT: {IX, varchar(8)} <br>
     * 取込日
     * @return The value of the column 'IMPORT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportDt() {
        checkSpecifiedProperty("importDt");
        return convertEmptyToNull(_importDt);
    }

    /**
     * [set] IMPORT_DT: {IX, varchar(8)} <br>
     * 取込日
     * @param importDt The value of the column 'IMPORT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportDt(String importDt) {
        registerModifiedProperty("importDt");
        _importDt = importDt;
    }

    /**
     * [get] ORDER_NO: {IX, varchar(100)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderNo() {
        checkSpecifiedProperty("orderNo");
        return convertEmptyToNull(_orderNo);
    }

    /**
     * [set] ORDER_NO: {IX, varchar(100)} <br>
     * 受注番号
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNo(String orderNo) {
        registerModifiedProperty("orderNo");
        _orderNo = orderNo;
    }

    /**
     * [get] PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @return The value of the column 'PRIORITY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriorityFlg() {
        checkSpecifiedProperty("priorityFlg");
        return convertEmptyToNull(_priorityFlg);
    }

    /**
     * [set] PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param priorityFlg The value of the column 'PRIORITY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriorityFlg(String priorityFlg) {
        registerModifiedProperty("priorityFlg");
        _priorityFlg = priorityFlg;
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
     * 注文時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTime() {
        checkSpecifiedProperty("orderTime");
        return convertEmptyToNull(_orderTime);
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTime(String orderTime) {
        registerModifiedProperty("orderTime");
        _orderTime = orderTime;
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
     * [get] COMMENT1: {varchar(255)} <br>
     * コメント1
     * @return The value of the column 'COMMENT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment1() {
        checkSpecifiedProperty("comment1");
        return convertEmptyToNull(_comment1);
    }

    /**
     * [set] COMMENT1: {varchar(255)} <br>
     * コメント1
     * @param comment1 The value of the column 'COMMENT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment1(String comment1) {
        registerModifiedProperty("comment1");
        _comment1 = comment1;
    }

    /**
     * [get] COMMENT2: {varchar(255)} <br>
     * コメント2
     * @return The value of the column 'COMMENT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment2() {
        checkSpecifiedProperty("comment2");
        return convertEmptyToNull(_comment2);
    }

    /**
     * [set] COMMENT2: {varchar(255)} <br>
     * コメント2
     * @param comment2 The value of the column 'COMMENT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment2(String comment2) {
        registerModifiedProperty("comment2");
        _comment2 = comment2;
    }

    /**
     * [get] GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @return The value of the column 'GIFT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftFlg() {
        checkSpecifiedProperty("giftFlg");
        return convertEmptyToNull(_giftFlg);
    }

    /**
     * [set] GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param giftFlg The value of the column 'GIFT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftFlg(String giftFlg) {
        registerModifiedProperty("giftFlg");
        _giftFlg = giftFlg;
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
     * [get] ORDER_ZIP_CD: {varchar(30)} <br>
     * 注文者郵便番号
     * @return The value of the column 'ORDER_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderZipCd() {
        checkSpecifiedProperty("orderZipCd");
        return convertEmptyToNull(_orderZipCd);
    }

    /**
     * [set] ORDER_ZIP_CD: {varchar(30)} <br>
     * 注文者郵便番号
     * @param orderZipCd The value of the column 'ORDER_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderZipCd(String orderZipCd) {
        registerModifiedProperty("orderZipCd");
        _orderZipCd = orderZipCd;
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
     * [get] ORDER_CUSTOMER_NM: {varchar(255)} <br>
     * 注文者名称
     * @return The value of the column 'ORDER_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerNm() {
        checkSpecifiedProperty("orderCustomerNm");
        return convertEmptyToNull(_orderCustomerNm);
    }

    /**
     * [set] ORDER_CUSTOMER_NM: {varchar(255)} <br>
     * 注文者名称
     * @param orderCustomerNm The value of the column 'ORDER_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerNm(String orderCustomerNm) {
        registerModifiedProperty("orderCustomerNm");
        _orderCustomerNm = orderCustomerNm;
    }

    /**
     * [get] ORDER_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 注文者名称カナ
     * @return The value of the column 'ORDER_CUSTOMER_NM_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderCustomerNmKana() {
        checkSpecifiedProperty("orderCustomerNmKana");
        return convertEmptyToNull(_orderCustomerNmKana);
    }

    /**
     * [set] ORDER_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 注文者名称カナ
     * @param orderCustomerNmKana The value of the column 'ORDER_CUSTOMER_NM_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderCustomerNmKana(String orderCustomerNmKana) {
        registerModifiedProperty("orderCustomerNmKana");
        _orderCustomerNmKana = orderCustomerNmKana;
    }

    /**
     * [get] ORDER_TEL_NO: {varchar(255)} <br>
     * 注文者電話番号
     * @return The value of the column 'ORDER_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTelNo() {
        checkSpecifiedProperty("orderTelNo");
        return convertEmptyToNull(_orderTelNo);
    }

    /**
     * [set] ORDER_TEL_NO: {varchar(255)} <br>
     * 注文者電話番号
     * @param orderTelNo The value of the column 'ORDER_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTelNo(String orderTelNo) {
        registerModifiedProperty("orderTelNo");
        _orderTelNo = orderTelNo;
    }

    /**
     * [get] DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @return The value of the column 'DELIV_MATCH_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivMatchFlg() {
        checkSpecifiedProperty("delivMatchFlg");
        return convertEmptyToNull(_delivMatchFlg);
    }

    /**
     * [set] DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param delivMatchFlg The value of the column 'DELIV_MATCH_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivMatchFlg(String delivMatchFlg) {
        registerModifiedProperty("delivMatchFlg");
        _delivMatchFlg = delivMatchFlg;
    }

    /**
     * [get] MERGE_ID: {IX, varchar(100)} <br>
     * 名寄せID
     * @return The value of the column 'MERGE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getMergeId() {
        checkSpecifiedProperty("mergeId");
        return convertEmptyToNull(_mergeId);
    }

    /**
     * [set] MERGE_ID: {IX, varchar(100)} <br>
     * 名寄せID
     * @param mergeId The value of the column 'MERGE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeId(String mergeId) {
        registerModifiedProperty("mergeId");
        _mergeId = mergeId;
    }

    /**
     * [get] MERGE_STATUS: {varchar(30)} <br>
     * 名寄せステータス
     * @return The value of the column 'MERGE_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMergeStatus() {
        checkSpecifiedProperty("mergeStatus");
        return convertEmptyToNull(_mergeStatus);
    }

    /**
     * [set] MERGE_STATUS: {varchar(30)} <br>
     * 名寄せステータス
     * @param mergeStatus The value of the column 'MERGE_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeStatus(String mergeStatus) {
        registerModifiedProperty("mergeStatus");
        _mergeStatus = mergeStatus;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30)} <br>
     * 送付先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30)} <br>
     * 送付先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
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
     * [get] INVOICE_DELIV_ADDRESS1: {varchar(255)} <br>
     * 送り状用送付先住所：都道府県
     * @return The value of the column 'INVOICE_DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceDelivAddress1() {
        checkSpecifiedProperty("invoiceDelivAddress1");
        return convertEmptyToNull(_invoiceDelivAddress1);
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS1: {varchar(255)} <br>
     * 送り状用送付先住所：都道府県
     * @param invoiceDelivAddress1 The value of the column 'INVOICE_DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceDelivAddress1(String invoiceDelivAddress1) {
        registerModifiedProperty("invoiceDelivAddress1");
        _invoiceDelivAddress1 = invoiceDelivAddress1;
    }

    /**
     * [get] INVOICE_DELIV_ADDRESS2: {varchar(255)} <br>
     * 送り状用送付先住所：都市区
     * @return The value of the column 'INVOICE_DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceDelivAddress2() {
        checkSpecifiedProperty("invoiceDelivAddress2");
        return convertEmptyToNull(_invoiceDelivAddress2);
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS2: {varchar(255)} <br>
     * 送り状用送付先住所：都市区
     * @param invoiceDelivAddress2 The value of the column 'INVOICE_DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceDelivAddress2(String invoiceDelivAddress2) {
        registerModifiedProperty("invoiceDelivAddress2");
        _invoiceDelivAddress2 = invoiceDelivAddress2;
    }

    /**
     * [get] INVOICE_DELIV_ADDRESS3: {varchar(255)} <br>
     * 送り状用送付先住所：町以降
     * @return The value of the column 'INVOICE_DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceDelivAddress3() {
        checkSpecifiedProperty("invoiceDelivAddress3");
        return convertEmptyToNull(_invoiceDelivAddress3);
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS3: {varchar(255)} <br>
     * 送り状用送付先住所：町以降
     * @param invoiceDelivAddress3 The value of the column 'INVOICE_DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceDelivAddress3(String invoiceDelivAddress3) {
        registerModifiedProperty("invoiceDelivAddress3");
        _invoiceDelivAddress3 = invoiceDelivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 送付先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 送付先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 送付先名称カナ
     * @return The value of the column 'DELIV_CUSTOMER_NM_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNmKana() {
        checkSpecifiedProperty("delivCustomerNmKana");
        return convertEmptyToNull(_delivCustomerNmKana);
    }

    /**
     * [set] DELIV_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 送付先名称カナ
     * @param delivCustomerNmKana The value of the column 'DELIV_CUSTOMER_NM_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNmKana(String delivCustomerNmKana) {
        registerModifiedProperty("delivCustomerNmKana");
        _delivCustomerNmKana = delivCustomerNmKana;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * 送付先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * 送付先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
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
     * [get] CARD_TYPE: {varchar(60)} <br>
     * クレジットカード種類
     * @return The value of the column 'CARD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardType() {
        checkSpecifiedProperty("cardType");
        return convertEmptyToNull(_cardType);
    }

    /**
     * [set] CARD_TYPE: {varchar(60)} <br>
     * クレジットカード種類
     * @param cardType The value of the column 'CARD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardType(String cardType) {
        registerModifiedProperty("cardType");
        _cardType = cardType;
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
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTax() {
        checkSpecifiedProperty("tax");
        return _tax;
    }

    /**
     * [set] TAX: {bigint(19)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(Long tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] CARRIAGE: {bigint(19)} <br>
     * 送料
     * @return The value of the column 'CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarriage() {
        checkSpecifiedProperty("carriage");
        return _carriage;
    }

    /**
     * [set] CARRIAGE: {bigint(19)} <br>
     * 送料
     * @param carriage The value of the column 'CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriage(Long carriage) {
        registerModifiedProperty("carriage");
        _carriage = carriage;
    }

    /**
     * [get] COD: {bigint(19)} <br>
     * 代引料
     * @return The value of the column 'COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCod() {
        checkSpecifiedProperty("cod");
        return _cod;
    }

    /**
     * [set] COD: {bigint(19)} <br>
     * 代引料
     * @param cod The value of the column 'COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCod(Long cod) {
        registerModifiedProperty("cod");
        _cod = cod;
    }

    /**
     * [get] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalAmount() {
        checkSpecifiedProperty("totalAmount");
        return _totalAmount;
    }

    /**
     * [set] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額
     * @param totalAmount The value of the column 'TOTAL_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalAmount(Long totalAmount) {
        registerModifiedProperty("totalAmount");
        _totalAmount = totalAmount;
    }

    /**
     * [get] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用額
     * @return The value of the column 'COUPON_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCouponDiscount() {
        checkSpecifiedProperty("couponDiscount");
        return _couponDiscount;
    }

    /**
     * [set] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用額
     * @param couponDiscount The value of the column 'COUPON_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCouponDiscount(Long couponDiscount) {
        registerModifiedProperty("couponDiscount");
        _couponDiscount = couponDiscount;
    }

    /**
     * [get] POINT_DISCOUNT: {bigint(19)} <br>
     * ポイント利用額
     * @return The value of the column 'POINT_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPointDiscount() {
        checkSpecifiedProperty("pointDiscount");
        return _pointDiscount;
    }

    /**
     * [set] POINT_DISCOUNT: {bigint(19)} <br>
     * ポイント利用額
     * @param pointDiscount The value of the column 'POINT_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointDiscount(Long pointDiscount) {
        registerModifiedProperty("pointDiscount");
        _pointDiscount = pointDiscount;
    }

    /**
     * [get] OTHER_DISCOUNT: {bigint(19)} <br>
     * その他値引額
     * @return The value of the column 'OTHER_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtherDiscount() {
        checkSpecifiedProperty("otherDiscount");
        return _otherDiscount;
    }

    /**
     * [set] OTHER_DISCOUNT: {bigint(19)} <br>
     * その他値引額
     * @param otherDiscount The value of the column 'OTHER_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherDiscount(Long otherDiscount) {
        registerModifiedProperty("otherDiscount");
        _otherDiscount = otherDiscount;
    }

    /**
     * [get] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額
     * @return The value of the column 'AMOUNT_BILLED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAmountBilled() {
        checkSpecifiedProperty("amountBilled");
        return _amountBilled;
    }

    /**
     * [set] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額
     * @param amountBilled The value of the column 'AMOUNT_BILLED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmountBilled(Long amountBilled) {
        registerModifiedProperty("amountBilled");
        _amountBilled = amountBilled;
    }

    /**
     * [get] MERGE_TOTAL: {bigint(19)} <br>
     * 名寄せ商品合計金額
     * @return The value of the column 'MERGE_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeTotal() {
        checkSpecifiedProperty("mergeTotal");
        return _mergeTotal;
    }

    /**
     * [set] MERGE_TOTAL: {bigint(19)} <br>
     * 名寄せ商品合計金額
     * @param mergeTotal The value of the column 'MERGE_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeTotal(Long mergeTotal) {
        registerModifiedProperty("mergeTotal");
        _mergeTotal = mergeTotal;
    }

    /**
     * [get] MERGE_CARRIAGE: {bigint(19)} <br>
     * 名寄せ送料合計
     * @return The value of the column 'MERGE_CARRIAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeCarriage() {
        checkSpecifiedProperty("mergeCarriage");
        return _mergeCarriage;
    }

    /**
     * [set] MERGE_CARRIAGE: {bigint(19)} <br>
     * 名寄せ送料合計
     * @param mergeCarriage The value of the column 'MERGE_CARRIAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeCarriage(Long mergeCarriage) {
        registerModifiedProperty("mergeCarriage");
        _mergeCarriage = mergeCarriage;
    }

    /**
     * [get] MERGE_COD: {bigint(19)} <br>
     * 名寄せ代引料合計
     * @return The value of the column 'MERGE_COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeCod() {
        checkSpecifiedProperty("mergeCod");
        return _mergeCod;
    }

    /**
     * [set] MERGE_COD: {bigint(19)} <br>
     * 名寄せ代引料合計
     * @param mergeCod The value of the column 'MERGE_COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeCod(Long mergeCod) {
        registerModifiedProperty("mergeCod");
        _mergeCod = mergeCod;
    }

    /**
     * [get] MERGE_TAX: {bigint(19)} <br>
     * 名寄せ消費税合計
     * @return The value of the column 'MERGE_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeTax() {
        checkSpecifiedProperty("mergeTax");
        return _mergeTax;
    }

    /**
     * [set] MERGE_TAX: {bigint(19)} <br>
     * 名寄せ消費税合計
     * @param mergeTax The value of the column 'MERGE_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeTax(Long mergeTax) {
        registerModifiedProperty("mergeTax");
        _mergeTax = mergeTax;
    }

    /**
     * [get] MERGE_AMOUNT_BILLED: {bigint(19)} <br>
     * 名寄せ請求金額
     * @return The value of the column 'MERGE_AMOUNT_BILLED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeAmountBilled() {
        checkSpecifiedProperty("mergeAmountBilled");
        return _mergeAmountBilled;
    }

    /**
     * [set] MERGE_AMOUNT_BILLED: {bigint(19)} <br>
     * 名寄せ請求金額
     * @param mergeAmountBilled The value of the column 'MERGE_AMOUNT_BILLED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeAmountBilled(Long mergeAmountBilled) {
        registerModifiedProperty("mergeAmountBilled");
        _mergeAmountBilled = mergeAmountBilled;
    }

    /**
     * [get] MERGE_TOTAL_AMOUNT: {bigint(19)} <br>
     * 名寄せ合計金額
     * @return The value of the column 'MERGE_TOTAL_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeTotalAmount() {
        checkSpecifiedProperty("mergeTotalAmount");
        return _mergeTotalAmount;
    }

    /**
     * [set] MERGE_TOTAL_AMOUNT: {bigint(19)} <br>
     * 名寄せ合計金額
     * @param mergeTotalAmount The value of the column 'MERGE_TOTAL_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeTotalAmount(Long mergeTotalAmount) {
        registerModifiedProperty("mergeTotalAmount");
        _mergeTotalAmount = mergeTotalAmount;
    }

    /**
     * [get] MERGE_COUPON_DISCOUNT: {bigint(19)} <br>
     * 名寄せクーポン利用額合計
     * @return The value of the column 'MERGE_COUPON_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeCouponDiscount() {
        checkSpecifiedProperty("mergeCouponDiscount");
        return _mergeCouponDiscount;
    }

    /**
     * [set] MERGE_COUPON_DISCOUNT: {bigint(19)} <br>
     * 名寄せクーポン利用額合計
     * @param mergeCouponDiscount The value of the column 'MERGE_COUPON_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeCouponDiscount(Long mergeCouponDiscount) {
        registerModifiedProperty("mergeCouponDiscount");
        _mergeCouponDiscount = mergeCouponDiscount;
    }

    /**
     * [get] MERGE_POINT_DISCOUNT: {bigint(19)} <br>
     * 名寄せポイント利用額合計
     * @return The value of the column 'MERGE_POINT_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergePointDiscount() {
        checkSpecifiedProperty("mergePointDiscount");
        return _mergePointDiscount;
    }

    /**
     * [set] MERGE_POINT_DISCOUNT: {bigint(19)} <br>
     * 名寄せポイント利用額合計
     * @param mergePointDiscount The value of the column 'MERGE_POINT_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergePointDiscount(Long mergePointDiscount) {
        registerModifiedProperty("mergePointDiscount");
        _mergePointDiscount = mergePointDiscount;
    }

    /**
     * [get] MERGE_OTHER_DISCOUNT: {bigint(19)} <br>
     * 名寄せその他値引額合計
     * @return The value of the column 'MERGE_OTHER_DISCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMergeOtherDiscount() {
        checkSpecifiedProperty("mergeOtherDiscount");
        return _mergeOtherDiscount;
    }

    /**
     * [set] MERGE_OTHER_DISCOUNT: {bigint(19)} <br>
     * 名寄せその他値引額合計
     * @param mergeOtherDiscount The value of the column 'MERGE_OTHER_DISCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeOtherDiscount(Long mergeOtherDiscount) {
        registerModifiedProperty("mergeOtherDiscount");
        _mergeOtherDiscount = mergeOtherDiscount;
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
     * [get] RECEIVE_ID: {bigint(19)} <br>
     * 受信ID
     * @return The value of the column 'RECEIVE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveId() {
        checkSpecifiedProperty("receiveId");
        return _receiveId;
    }

    /**
     * [set] RECEIVE_ID: {bigint(19)} <br>
     * 受信ID
     * @param receiveId The value of the column 'RECEIVE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveId(Long receiveId) {
        registerModifiedProperty("receiveId");
        _receiveId = receiveId;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getImportTypeId() {
        checkSpecifiedProperty("importTypeId");
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportTypeId(Long importTypeId) {
        registerModifiedProperty("importTypeId");
        _importTypeId = importTypeId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
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
