package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_EC_ORDER_H as TABLE. <br>
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
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_IMPORT_TYPE, T_SHIPPING_INST_H, B_CLASS_DTL(ByDelivMatchFlg), T_EC_ORDER_R(AsOne)
 *
 * [referrer-table]
 *     T_EC_ORDER_B, T_EC_ORDER_R
 *
 * [foreign-property]
 *     mCenter, mClient, mImportType, tShippingInstH, bClassDtlByDelivMatchFlg, bClassDtlByErrorFlg, bClassDtlByGiftFlg, bClassDtlByImportFlg, bClassDtlByPriorityFlg, tEcOrderRAsOne
 *
 * [referrer-property]
 *     tEcOrderBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTEcOrderHDto implements Serializable {

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
    /** EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _ecOrderHId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** IMPORT_DT: {IX, varchar(8)} */
    @JsonKey
    protected String _importDt;

    /** ORDER_NO: {IX, varchar(100)} */
    @JsonKey
    protected String _orderNo;

    /** PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} */
    @JsonKey
    protected String _priorityFlg;

    /** ORDER_DT: {varchar(30)} */
    @JsonKey
    protected String _orderDt;

    /** ORDER_TIME: {varchar(30)} */
    @JsonKey
    protected String _orderTime;

    /** DELIV_DT: {varchar(30)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {varchar(30)} */
    @JsonKey
    protected String _delivTz;

    /** COMMENT1: {varchar(255)} */
    @JsonKey
    protected String _comment1;

    /** COMMENT2: {varchar(255)} */
    @JsonKey
    protected String _comment2;

    /** GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} */
    @JsonKey
    protected String _giftFlg;

    /** NOSHI: {varchar(255)} */
    @JsonKey
    protected String _noshi;

    /** ORDER_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _orderZipCd;

    /** ORDER_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _orderAddress1;

    /** ORDER_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _orderAddress2;

    /** ORDER_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _orderAddress3;

    /** ORDER_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerNm;

    /** ORDER_CUSTOMER_NM_KANA: {varchar(255)} */
    @JsonKey
    protected String _orderCustomerNmKana;

    /** ORDER_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _orderTelNo;

    /** DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} */
    @JsonKey
    protected String _delivMatchFlg;

    /** MERGE_ID: {IX, varchar(100)} */
    @JsonKey
    protected String _mergeId;

    /** MERGE_STATUS: {varchar(30)} */
    @JsonKey
    protected String _mergeStatus;

    /** DELIV_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** INVOICE_DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _invoiceDelivAddress1;

    /** INVOICE_DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _invoiceDelivAddress2;

    /** INVOICE_DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _invoiceDelivAddress3;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM_KANA: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNmKana;

    /** DELIV_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIV_METHOD: {varchar(255)} */
    @JsonKey
    protected String _delivMethod;

    /** DELIV_TYPE: {varchar(255)} */
    @JsonKey
    protected String _delivType;

    /** DELIV_COMPANY: {varchar(255)} */
    @JsonKey
    protected String _delivCompany;

    /** PAYMENT_METHOD: {varchar(255)} */
    @JsonKey
    protected String _paymentMethod;

    /** CARD_TYPE: {varchar(60)} */
    @JsonKey
    protected String _cardType;

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

    /** TOTAL_AMOUNT: {bigint(19)} */
    @JsonKey
    protected Long _totalAmount;

    /** COUPON_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _couponDiscount;

    /** POINT_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _pointDiscount;

    /** OTHER_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _otherDiscount;

    /** AMOUNT_BILLED: {bigint(19)} */
    @JsonKey
    protected Long _amountBilled;

    /** MERGE_TOTAL: {bigint(19)} */
    @JsonKey
    protected Long _mergeTotal;

    /** MERGE_CARRIAGE: {bigint(19)} */
    @JsonKey
    protected Long _mergeCarriage;

    /** MERGE_COD: {bigint(19)} */
    @JsonKey
    protected Long _mergeCod;

    /** MERGE_TAX: {bigint(19)} */
    @JsonKey
    protected Long _mergeTax;

    /** MERGE_AMOUNT_BILLED: {bigint(19)} */
    @JsonKey
    protected Long _mergeAmountBilled;

    /** MERGE_TOTAL_AMOUNT: {bigint(19)} */
    @JsonKey
    protected Long _mergeTotalAmount;

    /** MERGE_COUPON_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _mergeCouponDiscount;

    /** MERGE_POINT_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _mergePointDiscount;

    /** MERGE_OTHER_DISCOUNT: {bigint(19)} */
    @JsonKey
    protected Long _mergeOtherDiscount;

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

    /** RECEIVE_ID: {bigint(19)} */
    @JsonKey
    protected Long _receiveId;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} */
    @JsonKey
    protected String _importFlg;

    /** IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} */
    @JsonKey
    protected Long _importTypeId;

    /** SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} */
    @JsonKey
    protected Long _shippingInstHId;

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
    public BsTEcOrderHDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MImportTypeDto _mImportType;

    public MImportTypeDto getMImportType() {
        return _mImportType;
    }

    public void setMImportType(MImportTypeDto mImportType) {
        this._mImportType = mImportType;
    }

    protected TShippingInstHDto _tShippingInstH;

    public TShippingInstHDto getTShippingInstH() {
        return _tShippingInstH;
    }

    public void setTShippingInstH(TShippingInstHDto tShippingInstH) {
        this._tShippingInstH = tShippingInstH;
    }

    protected BClassDtlDto _bClassDtlByDelivMatchFlg;

    public BClassDtlDto getBClassDtlByDelivMatchFlg() {
        return _bClassDtlByDelivMatchFlg;
    }

    public void setBClassDtlByDelivMatchFlg(BClassDtlDto bClassDtlByDelivMatchFlg) {
        this._bClassDtlByDelivMatchFlg = bClassDtlByDelivMatchFlg;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected BClassDtlDto _bClassDtlByGiftFlg;

    public BClassDtlDto getBClassDtlByGiftFlg() {
        return _bClassDtlByGiftFlg;
    }

    public void setBClassDtlByGiftFlg(BClassDtlDto bClassDtlByGiftFlg) {
        this._bClassDtlByGiftFlg = bClassDtlByGiftFlg;
    }

    protected BClassDtlDto _bClassDtlByImportFlg;

    public BClassDtlDto getBClassDtlByImportFlg() {
        return _bClassDtlByImportFlg;
    }

    public void setBClassDtlByImportFlg(BClassDtlDto bClassDtlByImportFlg) {
        this._bClassDtlByImportFlg = bClassDtlByImportFlg;
    }

    protected BClassDtlDto _bClassDtlByPriorityFlg;

    public BClassDtlDto getBClassDtlByPriorityFlg() {
        return _bClassDtlByPriorityFlg;
    }

    public void setBClassDtlByPriorityFlg(BClassDtlDto bClassDtlByPriorityFlg) {
        this._bClassDtlByPriorityFlg = bClassDtlByPriorityFlg;
    }

    protected TEcOrderRDto _tEcOrderRAsOne;

    public TEcOrderRDto getTEcOrderRAsOne() {
        return _tEcOrderRAsOne;
    }

    public void setTEcOrderRAsOne(TEcOrderRDto TEcOrderRAsOne) {
        this._tEcOrderRAsOne = TEcOrderRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TEcOrderBDto> _tEcOrderBList;

    public List<TEcOrderBDto> getTEcOrderBList() {
        if (_tEcOrderBList == null) { _tEcOrderBList = new ArrayList<TEcOrderBDto>(); }
        return _tEcOrderBList;
    }

    public void setTEcOrderBList(List<TEcOrderBDto> tEcOrderBList) {
        this._tEcOrderBList = tEcOrderBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTEcOrderHDto)) { return false; }
        final BsTEcOrderHDto otherEntity = (BsTEcOrderHDto)other;
        if (!helpComparingValue(getEcOrderHId(), otherEntity.getEcOrderHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_EC_ORDER_H");
        result = xCH(result, getEcOrderHId());
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
        sb.append(c).append(getEcOrderHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getImportDt());
        sb.append(c).append(getOrderNo());
        sb.append(c).append(getPriorityFlg());
        sb.append(c).append(getOrderDt());
        sb.append(c).append(getOrderTime());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getComment1());
        sb.append(c).append(getComment2());
        sb.append(c).append(getGiftFlg());
        sb.append(c).append(getNoshi());
        sb.append(c).append(getOrderZipCd());
        sb.append(c).append(getOrderAddress1());
        sb.append(c).append(getOrderAddress2());
        sb.append(c).append(getOrderAddress3());
        sb.append(c).append(getOrderCustomerNm());
        sb.append(c).append(getOrderCustomerNmKana());
        sb.append(c).append(getOrderTelNo());
        sb.append(c).append(getDelivMatchFlg());
        sb.append(c).append(getMergeId());
        sb.append(c).append(getMergeStatus());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getInvoiceDelivAddress1());
        sb.append(c).append(getInvoiceDelivAddress2());
        sb.append(c).append(getInvoiceDelivAddress3());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivCustomerNmKana());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDelivMethod());
        sb.append(c).append(getDelivType());
        sb.append(c).append(getDelivCompany());
        sb.append(c).append(getPaymentMethod());
        sb.append(c).append(getCardType());
        sb.append(c).append(getTotal());
        sb.append(c).append(getTax());
        sb.append(c).append(getCarriage());
        sb.append(c).append(getCod());
        sb.append(c).append(getTotalAmount());
        sb.append(c).append(getCouponDiscount());
        sb.append(c).append(getPointDiscount());
        sb.append(c).append(getOtherDiscount());
        sb.append(c).append(getAmountBilled());
        sb.append(c).append(getMergeTotal());
        sb.append(c).append(getMergeCarriage());
        sb.append(c).append(getMergeCod());
        sb.append(c).append(getMergeTax());
        sb.append(c).append(getMergeAmountBilled());
        sb.append(c).append(getMergeTotalAmount());
        sb.append(c).append(getMergeCouponDiscount());
        sb.append(c).append(getMergePointDiscount());
        sb.append(c).append(getMergeOtherDiscount());
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
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getImportTypeId());
        sb.append(c).append(getShippingInstHId());
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
     * [get] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public Long getEcOrderHId() {
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        __modifiedProperties.add("ecOrderHId");
        this._ecOrderHId = ecOrderHId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] IMPORT_DT: {IX, varchar(8)} <br>
     * 取込日
     * @return The value of the column 'IMPORT_DT'. (NullAllowed)
     */
    public String getImportDt() {
        return _importDt;
    }

    /**
     * [set] IMPORT_DT: {IX, varchar(8)} <br>
     * 取込日
     * @param importDt The value of the column 'IMPORT_DT'. (NullAllowed)
     */
    public void setImportDt(String importDt) {
        __modifiedProperties.add("importDt");
        this._importDt = importDt;
    }

    /**
     * [get] ORDER_NO: {IX, varchar(100)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public String getOrderNo() {
        return _orderNo;
    }

    /**
     * [set] ORDER_NO: {IX, varchar(100)} <br>
     * 受注番号
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public void setOrderNo(String orderNo) {
        __modifiedProperties.add("orderNo");
        this._orderNo = orderNo;
    }

    /**
     * [get] PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @return The value of the column 'PRIORITY_FLG'. (NullAllowed)
     */
    public String getPriorityFlg() {
        return _priorityFlg;
    }

    /**
     * [set] PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg} <br>
     * 優先フラグ
     * @param priorityFlg The value of the column 'PRIORITY_FLG'. (NullAllowed)
     */
    public void setPriorityFlg(String priorityFlg) {
        __modifiedProperties.add("priorityFlg");
        this._priorityFlg = priorityFlg;
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
     * 注文時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public String getOrderTime() {
        return _orderTime;
    }

    /**
     * [set] ORDER_TIME: {varchar(30)} <br>
     * 注文時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public void setOrderTime(String orderTime) {
        __modifiedProperties.add("orderTime");
        this._orderTime = orderTime;
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
     * [get] COMMENT1: {varchar(255)} <br>
     * コメント1
     * @return The value of the column 'COMMENT1'. (NullAllowed)
     */
    public String getComment1() {
        return _comment1;
    }

    /**
     * [set] COMMENT1: {varchar(255)} <br>
     * コメント1
     * @param comment1 The value of the column 'COMMENT1'. (NullAllowed)
     */
    public void setComment1(String comment1) {
        __modifiedProperties.add("comment1");
        this._comment1 = comment1;
    }

    /**
     * [get] COMMENT2: {varchar(255)} <br>
     * コメント2
     * @return The value of the column 'COMMENT2'. (NullAllowed)
     */
    public String getComment2() {
        return _comment2;
    }

    /**
     * [set] COMMENT2: {varchar(255)} <br>
     * コメント2
     * @param comment2 The value of the column 'COMMENT2'. (NullAllowed)
     */
    public void setComment2(String comment2) {
        __modifiedProperties.add("comment2");
        this._comment2 = comment2;
    }

    /**
     * [get] GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @return The value of the column 'GIFT_FLG'. (NullAllowed)
     */
    public String getGiftFlg() {
        return _giftFlg;
    }

    /**
     * [set] GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg} <br>
     * ギフトフラグ
     * @param giftFlg The value of the column 'GIFT_FLG'. (NullAllowed)
     */
    public void setGiftFlg(String giftFlg) {
        __modifiedProperties.add("giftFlg");
        this._giftFlg = giftFlg;
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
     * [get] ORDER_ZIP_CD: {varchar(30)} <br>
     * 注文者郵便番号
     * @return The value of the column 'ORDER_ZIP_CD'. (NullAllowed)
     */
    public String getOrderZipCd() {
        return _orderZipCd;
    }

    /**
     * [set] ORDER_ZIP_CD: {varchar(30)} <br>
     * 注文者郵便番号
     * @param orderZipCd The value of the column 'ORDER_ZIP_CD'. (NullAllowed)
     */
    public void setOrderZipCd(String orderZipCd) {
        __modifiedProperties.add("orderZipCd");
        this._orderZipCd = orderZipCd;
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
     * [get] ORDER_CUSTOMER_NM: {varchar(255)} <br>
     * 注文者名称
     * @return The value of the column 'ORDER_CUSTOMER_NM'. (NullAllowed)
     */
    public String getOrderCustomerNm() {
        return _orderCustomerNm;
    }

    /**
     * [set] ORDER_CUSTOMER_NM: {varchar(255)} <br>
     * 注文者名称
     * @param orderCustomerNm The value of the column 'ORDER_CUSTOMER_NM'. (NullAllowed)
     */
    public void setOrderCustomerNm(String orderCustomerNm) {
        __modifiedProperties.add("orderCustomerNm");
        this._orderCustomerNm = orderCustomerNm;
    }

    /**
     * [get] ORDER_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 注文者名称カナ
     * @return The value of the column 'ORDER_CUSTOMER_NM_KANA'. (NullAllowed)
     */
    public String getOrderCustomerNmKana() {
        return _orderCustomerNmKana;
    }

    /**
     * [set] ORDER_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 注文者名称カナ
     * @param orderCustomerNmKana The value of the column 'ORDER_CUSTOMER_NM_KANA'. (NullAllowed)
     */
    public void setOrderCustomerNmKana(String orderCustomerNmKana) {
        __modifiedProperties.add("orderCustomerNmKana");
        this._orderCustomerNmKana = orderCustomerNmKana;
    }

    /**
     * [get] ORDER_TEL_NO: {varchar(255)} <br>
     * 注文者電話番号
     * @return The value of the column 'ORDER_TEL_NO'. (NullAllowed)
     */
    public String getOrderTelNo() {
        return _orderTelNo;
    }

    /**
     * [set] ORDER_TEL_NO: {varchar(255)} <br>
     * 注文者電話番号
     * @param orderTelNo The value of the column 'ORDER_TEL_NO'. (NullAllowed)
     */
    public void setOrderTelNo(String orderTelNo) {
        __modifiedProperties.add("orderTelNo");
        this._orderTelNo = orderTelNo;
    }

    /**
     * [get] DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @return The value of the column 'DELIV_MATCH_FLG'. (NullAllowed)
     */
    public String getDelivMatchFlg() {
        return _delivMatchFlg;
    }

    /**
     * [set] DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg} <br>
     * 送付先一致フラグ
     * @param delivMatchFlg The value of the column 'DELIV_MATCH_FLG'. (NullAllowed)
     */
    public void setDelivMatchFlg(String delivMatchFlg) {
        __modifiedProperties.add("delivMatchFlg");
        this._delivMatchFlg = delivMatchFlg;
    }

    /**
     * [get] MERGE_ID: {IX, varchar(100)} <br>
     * 名寄せID
     * @return The value of the column 'MERGE_ID'. (NullAllowed)
     */
    public String getMergeId() {
        return _mergeId;
    }

    /**
     * [set] MERGE_ID: {IX, varchar(100)} <br>
     * 名寄せID
     * @param mergeId The value of the column 'MERGE_ID'. (NullAllowed)
     */
    public void setMergeId(String mergeId) {
        __modifiedProperties.add("mergeId");
        this._mergeId = mergeId;
    }

    /**
     * [get] MERGE_STATUS: {varchar(30)} <br>
     * 名寄せステータス
     * @return The value of the column 'MERGE_STATUS'. (NullAllowed)
     */
    public String getMergeStatus() {
        return _mergeStatus;
    }

    /**
     * [set] MERGE_STATUS: {varchar(30)} <br>
     * 名寄せステータス
     * @param mergeStatus The value of the column 'MERGE_STATUS'. (NullAllowed)
     */
    public void setMergeStatus(String mergeStatus) {
        __modifiedProperties.add("mergeStatus");
        this._mergeStatus = mergeStatus;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30)} <br>
     * 送付先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30)} <br>
     * 送付先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
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
     * [get] INVOICE_DELIV_ADDRESS1: {varchar(255)} <br>
     * 送り状用送付先住所：都道府県
     * @return The value of the column 'INVOICE_DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getInvoiceDelivAddress1() {
        return _invoiceDelivAddress1;
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS1: {varchar(255)} <br>
     * 送り状用送付先住所：都道府県
     * @param invoiceDelivAddress1 The value of the column 'INVOICE_DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setInvoiceDelivAddress1(String invoiceDelivAddress1) {
        __modifiedProperties.add("invoiceDelivAddress1");
        this._invoiceDelivAddress1 = invoiceDelivAddress1;
    }

    /**
     * [get] INVOICE_DELIV_ADDRESS2: {varchar(255)} <br>
     * 送り状用送付先住所：都市区
     * @return The value of the column 'INVOICE_DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getInvoiceDelivAddress2() {
        return _invoiceDelivAddress2;
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS2: {varchar(255)} <br>
     * 送り状用送付先住所：都市区
     * @param invoiceDelivAddress2 The value of the column 'INVOICE_DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setInvoiceDelivAddress2(String invoiceDelivAddress2) {
        __modifiedProperties.add("invoiceDelivAddress2");
        this._invoiceDelivAddress2 = invoiceDelivAddress2;
    }

    /**
     * [get] INVOICE_DELIV_ADDRESS3: {varchar(255)} <br>
     * 送り状用送付先住所：町以降
     * @return The value of the column 'INVOICE_DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getInvoiceDelivAddress3() {
        return _invoiceDelivAddress3;
    }

    /**
     * [set] INVOICE_DELIV_ADDRESS3: {varchar(255)} <br>
     * 送り状用送付先住所：町以降
     * @param invoiceDelivAddress3 The value of the column 'INVOICE_DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setInvoiceDelivAddress3(String invoiceDelivAddress3) {
        __modifiedProperties.add("invoiceDelivAddress3");
        this._invoiceDelivAddress3 = invoiceDelivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 送付先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 送付先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 送付先名称カナ
     * @return The value of the column 'DELIV_CUSTOMER_NM_KANA'. (NullAllowed)
     */
    public String getDelivCustomerNmKana() {
        return _delivCustomerNmKana;
    }

    /**
     * [set] DELIV_CUSTOMER_NM_KANA: {varchar(255)} <br>
     * 送付先名称カナ
     * @param delivCustomerNmKana The value of the column 'DELIV_CUSTOMER_NM_KANA'. (NullAllowed)
     */
    public void setDelivCustomerNmKana(String delivCustomerNmKana) {
        __modifiedProperties.add("delivCustomerNmKana");
        this._delivCustomerNmKana = delivCustomerNmKana;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * 送付先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * 送付先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
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
     * [get] CARD_TYPE: {varchar(60)} <br>
     * クレジットカード種類
     * @return The value of the column 'CARD_TYPE'. (NullAllowed)
     */
    public String getCardType() {
        return _cardType;
    }

    /**
     * [set] CARD_TYPE: {varchar(60)} <br>
     * クレジットカード種類
     * @param cardType The value of the column 'CARD_TYPE'. (NullAllowed)
     */
    public void setCardType(String cardType) {
        __modifiedProperties.add("cardType");
        this._cardType = cardType;
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
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public Long getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {bigint(19)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(Long tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] CARRIAGE: {bigint(19)} <br>
     * 送料
     * @return The value of the column 'CARRIAGE'. (NullAllowed)
     */
    public Long getCarriage() {
        return _carriage;
    }

    /**
     * [set] CARRIAGE: {bigint(19)} <br>
     * 送料
     * @param carriage The value of the column 'CARRIAGE'. (NullAllowed)
     */
    public void setCarriage(Long carriage) {
        __modifiedProperties.add("carriage");
        this._carriage = carriage;
    }

    /**
     * [get] COD: {bigint(19)} <br>
     * 代引料
     * @return The value of the column 'COD'. (NullAllowed)
     */
    public Long getCod() {
        return _cod;
    }

    /**
     * [set] COD: {bigint(19)} <br>
     * 代引料
     * @param cod The value of the column 'COD'. (NullAllowed)
     */
    public void setCod(Long cod) {
        __modifiedProperties.add("cod");
        this._cod = cod;
    }

    /**
     * [get] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_AMOUNT'. (NullAllowed)
     */
    public Long getTotalAmount() {
        return _totalAmount;
    }

    /**
     * [set] TOTAL_AMOUNT: {bigint(19)} <br>
     * 合計金額
     * @param totalAmount The value of the column 'TOTAL_AMOUNT'. (NullAllowed)
     */
    public void setTotalAmount(Long totalAmount) {
        __modifiedProperties.add("totalAmount");
        this._totalAmount = totalAmount;
    }

    /**
     * [get] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用額
     * @return The value of the column 'COUPON_DISCOUNT'. (NullAllowed)
     */
    public Long getCouponDiscount() {
        return _couponDiscount;
    }

    /**
     * [set] COUPON_DISCOUNT: {bigint(19)} <br>
     * クーポン利用額
     * @param couponDiscount The value of the column 'COUPON_DISCOUNT'. (NullAllowed)
     */
    public void setCouponDiscount(Long couponDiscount) {
        __modifiedProperties.add("couponDiscount");
        this._couponDiscount = couponDiscount;
    }

    /**
     * [get] POINT_DISCOUNT: {bigint(19)} <br>
     * ポイント利用額
     * @return The value of the column 'POINT_DISCOUNT'. (NullAllowed)
     */
    public Long getPointDiscount() {
        return _pointDiscount;
    }

    /**
     * [set] POINT_DISCOUNT: {bigint(19)} <br>
     * ポイント利用額
     * @param pointDiscount The value of the column 'POINT_DISCOUNT'. (NullAllowed)
     */
    public void setPointDiscount(Long pointDiscount) {
        __modifiedProperties.add("pointDiscount");
        this._pointDiscount = pointDiscount;
    }

    /**
     * [get] OTHER_DISCOUNT: {bigint(19)} <br>
     * その他値引額
     * @return The value of the column 'OTHER_DISCOUNT'. (NullAllowed)
     */
    public Long getOtherDiscount() {
        return _otherDiscount;
    }

    /**
     * [set] OTHER_DISCOUNT: {bigint(19)} <br>
     * その他値引額
     * @param otherDiscount The value of the column 'OTHER_DISCOUNT'. (NullAllowed)
     */
    public void setOtherDiscount(Long otherDiscount) {
        __modifiedProperties.add("otherDiscount");
        this._otherDiscount = otherDiscount;
    }

    /**
     * [get] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額
     * @return The value of the column 'AMOUNT_BILLED'. (NullAllowed)
     */
    public Long getAmountBilled() {
        return _amountBilled;
    }

    /**
     * [set] AMOUNT_BILLED: {bigint(19)} <br>
     * 請求金額
     * @param amountBilled The value of the column 'AMOUNT_BILLED'. (NullAllowed)
     */
    public void setAmountBilled(Long amountBilled) {
        __modifiedProperties.add("amountBilled");
        this._amountBilled = amountBilled;
    }

    /**
     * [get] MERGE_TOTAL: {bigint(19)} <br>
     * 名寄せ商品合計金額
     * @return The value of the column 'MERGE_TOTAL'. (NullAllowed)
     */
    public Long getMergeTotal() {
        return _mergeTotal;
    }

    /**
     * [set] MERGE_TOTAL: {bigint(19)} <br>
     * 名寄せ商品合計金額
     * @param mergeTotal The value of the column 'MERGE_TOTAL'. (NullAllowed)
     */
    public void setMergeTotal(Long mergeTotal) {
        __modifiedProperties.add("mergeTotal");
        this._mergeTotal = mergeTotal;
    }

    /**
     * [get] MERGE_CARRIAGE: {bigint(19)} <br>
     * 名寄せ送料合計
     * @return The value of the column 'MERGE_CARRIAGE'. (NullAllowed)
     */
    public Long getMergeCarriage() {
        return _mergeCarriage;
    }

    /**
     * [set] MERGE_CARRIAGE: {bigint(19)} <br>
     * 名寄せ送料合計
     * @param mergeCarriage The value of the column 'MERGE_CARRIAGE'. (NullAllowed)
     */
    public void setMergeCarriage(Long mergeCarriage) {
        __modifiedProperties.add("mergeCarriage");
        this._mergeCarriage = mergeCarriage;
    }

    /**
     * [get] MERGE_COD: {bigint(19)} <br>
     * 名寄せ代引料合計
     * @return The value of the column 'MERGE_COD'. (NullAllowed)
     */
    public Long getMergeCod() {
        return _mergeCod;
    }

    /**
     * [set] MERGE_COD: {bigint(19)} <br>
     * 名寄せ代引料合計
     * @param mergeCod The value of the column 'MERGE_COD'. (NullAllowed)
     */
    public void setMergeCod(Long mergeCod) {
        __modifiedProperties.add("mergeCod");
        this._mergeCod = mergeCod;
    }

    /**
     * [get] MERGE_TAX: {bigint(19)} <br>
     * 名寄せ消費税合計
     * @return The value of the column 'MERGE_TAX'. (NullAllowed)
     */
    public Long getMergeTax() {
        return _mergeTax;
    }

    /**
     * [set] MERGE_TAX: {bigint(19)} <br>
     * 名寄せ消費税合計
     * @param mergeTax The value of the column 'MERGE_TAX'. (NullAllowed)
     */
    public void setMergeTax(Long mergeTax) {
        __modifiedProperties.add("mergeTax");
        this._mergeTax = mergeTax;
    }

    /**
     * [get] MERGE_AMOUNT_BILLED: {bigint(19)} <br>
     * 名寄せ請求金額
     * @return The value of the column 'MERGE_AMOUNT_BILLED'. (NullAllowed)
     */
    public Long getMergeAmountBilled() {
        return _mergeAmountBilled;
    }

    /**
     * [set] MERGE_AMOUNT_BILLED: {bigint(19)} <br>
     * 名寄せ請求金額
     * @param mergeAmountBilled The value of the column 'MERGE_AMOUNT_BILLED'. (NullAllowed)
     */
    public void setMergeAmountBilled(Long mergeAmountBilled) {
        __modifiedProperties.add("mergeAmountBilled");
        this._mergeAmountBilled = mergeAmountBilled;
    }

    /**
     * [get] MERGE_TOTAL_AMOUNT: {bigint(19)} <br>
     * 名寄せ合計金額
     * @return The value of the column 'MERGE_TOTAL_AMOUNT'. (NullAllowed)
     */
    public Long getMergeTotalAmount() {
        return _mergeTotalAmount;
    }

    /**
     * [set] MERGE_TOTAL_AMOUNT: {bigint(19)} <br>
     * 名寄せ合計金額
     * @param mergeTotalAmount The value of the column 'MERGE_TOTAL_AMOUNT'. (NullAllowed)
     */
    public void setMergeTotalAmount(Long mergeTotalAmount) {
        __modifiedProperties.add("mergeTotalAmount");
        this._mergeTotalAmount = mergeTotalAmount;
    }

    /**
     * [get] MERGE_COUPON_DISCOUNT: {bigint(19)} <br>
     * 名寄せクーポン利用額合計
     * @return The value of the column 'MERGE_COUPON_DISCOUNT'. (NullAllowed)
     */
    public Long getMergeCouponDiscount() {
        return _mergeCouponDiscount;
    }

    /**
     * [set] MERGE_COUPON_DISCOUNT: {bigint(19)} <br>
     * 名寄せクーポン利用額合計
     * @param mergeCouponDiscount The value of the column 'MERGE_COUPON_DISCOUNT'. (NullAllowed)
     */
    public void setMergeCouponDiscount(Long mergeCouponDiscount) {
        __modifiedProperties.add("mergeCouponDiscount");
        this._mergeCouponDiscount = mergeCouponDiscount;
    }

    /**
     * [get] MERGE_POINT_DISCOUNT: {bigint(19)} <br>
     * 名寄せポイント利用額合計
     * @return The value of the column 'MERGE_POINT_DISCOUNT'. (NullAllowed)
     */
    public Long getMergePointDiscount() {
        return _mergePointDiscount;
    }

    /**
     * [set] MERGE_POINT_DISCOUNT: {bigint(19)} <br>
     * 名寄せポイント利用額合計
     * @param mergePointDiscount The value of the column 'MERGE_POINT_DISCOUNT'. (NullAllowed)
     */
    public void setMergePointDiscount(Long mergePointDiscount) {
        __modifiedProperties.add("mergePointDiscount");
        this._mergePointDiscount = mergePointDiscount;
    }

    /**
     * [get] MERGE_OTHER_DISCOUNT: {bigint(19)} <br>
     * 名寄せその他値引額合計
     * @return The value of the column 'MERGE_OTHER_DISCOUNT'. (NullAllowed)
     */
    public Long getMergeOtherDiscount() {
        return _mergeOtherDiscount;
    }

    /**
     * [set] MERGE_OTHER_DISCOUNT: {bigint(19)} <br>
     * 名寄せその他値引額合計
     * @param mergeOtherDiscount The value of the column 'MERGE_OTHER_DISCOUNT'. (NullAllowed)
     */
    public void setMergeOtherDiscount(Long mergeOtherDiscount) {
        __modifiedProperties.add("mergeOtherDiscount");
        this._mergeOtherDiscount = mergeOtherDiscount;
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
     * [get] RECEIVE_ID: {bigint(19)} <br>
     * 受信ID
     * @return The value of the column 'RECEIVE_ID'. (NullAllowed)
     */
    public Long getReceiveId() {
        return _receiveId;
    }

    /**
     * [set] RECEIVE_ID: {bigint(19)} <br>
     * 受信ID
     * @param receiveId The value of the column 'RECEIVE_ID'. (NullAllowed)
     */
    public void setReceiveId(Long receiveId) {
        __modifiedProperties.add("receiveId");
        this._receiveId = receiveId;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg} <br>
     * 取込フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public Long getImportTypeId() {
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public void setImportTypeId(Long importTypeId) {
        __modifiedProperties.add("importTypeId");
        this._importTypeId = importTypeId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
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
