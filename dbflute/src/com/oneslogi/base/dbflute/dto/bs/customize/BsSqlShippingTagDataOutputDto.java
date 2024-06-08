package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShippingTagDataOutput. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, ALLOC_INST_H_ID, SHIPPING_DT, WORK_DT, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ABBR, PICKING_WORK_NO, CLIENT_SHIPPING_NO, SUM_PICKINGH_COUNT, EMERGENCY_FLG, INVOICE_CREATE_FLG, INVOICE_CREATE_DT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlShippingTagDataOutputDto implements Serializable {

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
    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** ALLOC_INST_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _allocInstHId;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** CARRIER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _carrierAbbr;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerAbbr;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SUM_PICKINGH_COUNT: {int(10)} */
    @JsonKey
    protected Long _sumPickinghCount;

    /** EMERGENCY_FLG: {varchar(100)} */
    @JsonKey
    protected String _emergencyFlg;

    /** INVOICE_CREATE_FLG: {varchar(100)} */
    @JsonKey
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _invoiceCreateDt;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShippingTagDataOutputDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlShippingTagDataOutputDto)) { return false; }
        final BsSqlShippingTagDataOutputDto otherEntity = (BsSqlShippingTagDataOutputDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getAllocInstHId(), otherEntity.getAllocInstHId())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getCarrierAbbr(), otherEntity.getCarrierAbbr())) { return false; }
        if (!helpComparingValue(getDelivCustomerCd(), otherEntity.getDelivCustomerCd())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivAddress1(), otherEntity.getDelivAddress1())) { return false; }
        if (!helpComparingValue(getDelivAddress2(), otherEntity.getDelivAddress2())) { return false; }
        if (!helpComparingValue(getDelivAddress3(), otherEntity.getDelivAddress3())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerAbbr(), otherEntity.getSupplyCustomerAbbr())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getSumPickinghCount(), otherEntity.getSumPickinghCount())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getInvoiceCreateFlg(), otherEntity.getInvoiceCreateFlg())) { return false; }
        if (!helpComparingValue(getInvoiceCreateDt(), otherEntity.getInvoiceCreateDt())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShippingTagDataOutput");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getAllocInstHId());
        result = xCH(result, getShippingDt());
        result = xCH(result, getWorkDt());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getCarrierAbbr());
        result = xCH(result, getDelivCustomerCd());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getDelivAddress1());
        result = xCH(result, getDelivAddress2());
        result = xCH(result, getDelivAddress3());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getSupplyCustomerAbbr());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getSumPickinghCount());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getInvoiceCreateFlg());
        result = xCH(result, getInvoiceCreateDt());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCarrierAbbr());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSupplyCustomerAbbr());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getSumPickinghCount());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getInvoiceCreateFlg());
        sb.append(c).append(getInvoiceCreateDt());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] CARRIER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public String getCarrierAbbr() {
        return _carrierAbbr;
    }

    /**
     * [set] CARRIER_ABBR: {varchar(60)} <br>
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        __modifiedProperties.add("carrierAbbr");
        this._carrierAbbr = carrierAbbr;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getSupplyCustomerAbbr() {
        return _supplyCustomerAbbr;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @param supplyCustomerAbbr The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setSupplyCustomerAbbr(String supplyCustomerAbbr) {
        __modifiedProperties.add("supplyCustomerAbbr");
        this._supplyCustomerAbbr = supplyCustomerAbbr;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SUM_PICKINGH_COUNT: {int(10)} <br>
     * @return The value of the column 'SUM_PICKINGH_COUNT'. (NullAllowed)
     */
    public Long getSumPickinghCount() {
        return _sumPickinghCount;
    }

    /**
     * [set] SUM_PICKINGH_COUNT: {int(10)} <br>
     * @param sumPickinghCount The value of the column 'SUM_PICKINGH_COUNT'. (NullAllowed)
     */
    public void setSumPickinghCount(Long sumPickinghCount) {
        __modifiedProperties.add("sumPickinghCount");
        this._sumPickinghCount = sumPickinghCount;
    }

    /**
     * [get] EMERGENCY_FLG: {varchar(100)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(100)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {varchar(100)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public String getInvoiceCreateFlg() {
        return _invoiceCreateFlg;
    }

    /**
     * [set] INVOICE_CREATE_FLG: {varchar(100)} <br>
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        __modifiedProperties.add("invoiceCreateFlg");
        this._invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInvoiceCreateDt() {
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        __modifiedProperties.add("invoiceCreateDt");
        this._invoiceCreateDt = invoiceCreateDt;
    }

}
