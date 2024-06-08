package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlBillOfLadingPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PICKING_H_ID, PICKING_WORK_NO, SHIPPING_DT, CLIENT_NM, ADDRESS1, ZIP_CD_FROM, BOL_NO, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, ZIP_CD_TO, CARRIER_NM, CARRIER_CD, CARRIER_TRACE_NUM, PAYMENT_TERM, CLIENT_SHIPPING_NO, PKGS, WEIGHT
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
public abstract class BsSqlBillOfLadingPrintDto implements Serializable {

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
    /** PICKING_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingHId;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _address1;

    /** ZIP_CD_FROM: {varchar(543)} */
    @JsonKey
    protected String _zipCdFrom;

    /** BOL_NO: {varchar(30)} */
    @JsonKey
    protected String _bolNo;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** ZIP_CD_TO: {varchar(543)} */
    @JsonKey
    protected String _zipCdTo;

    /** CARRIER_NM: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** CARRIER_CD: {varchar(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** PAYMENT_TERM: {varchar(30)} */
    @JsonKey
    protected String _paymentTerm;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** PKGS: {int(10)} */
    @JsonKey
    protected Long _pkgs;

    /** WEIGHT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _weight;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlBillOfLadingPrintDto() {
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
        if (other == null || !(other instanceof BsSqlBillOfLadingPrintDto)) { return false; }
        final BsSqlBillOfLadingPrintDto otherEntity = (BsSqlBillOfLadingPrintDto)other;
        if (!helpComparingValue(getPickingHId(), otherEntity.getPickingHId())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getAddress1(), otherEntity.getAddress1())) { return false; }
        if (!helpComparingValue(getZipCdFrom(), otherEntity.getZipCdFrom())) { return false; }
        if (!helpComparingValue(getBolNo(), otherEntity.getBolNo())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivAddress1(), otherEntity.getDelivAddress1())) { return false; }
        if (!helpComparingValue(getZipCdTo(), otherEntity.getZipCdTo())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierTraceNum(), otherEntity.getCarrierTraceNum())) { return false; }
        if (!helpComparingValue(getPaymentTerm(), otherEntity.getPaymentTerm())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getPkgs(), otherEntity.getPkgs())) { return false; }
        if (!helpComparingValue(getWeight(), otherEntity.getWeight())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlBillOfLadingPrint");
        result = xCH(result, getPickingHId());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getShippingDt());
        result = xCH(result, getClientNm());
        result = xCH(result, getAddress1());
        result = xCH(result, getZipCdFrom());
        result = xCH(result, getBolNo());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getDelivAddress1());
        result = xCH(result, getZipCdTo());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierTraceNum());
        result = xCH(result, getPaymentTerm());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getPkgs());
        result = xCH(result, getWeight());
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
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getZipCdFrom());
        sb.append(c).append(getBolNo());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getZipCdTo());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getPaymentTerm());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getPkgs());
        sb.append(c).append(getWeight());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
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
     * [get] ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(60)} <br>
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ZIP_CD_FROM: {varchar(543)} <br>
     * @return The value of the column 'ZIP_CD_FROM'. (NullAllowed)
     */
    public String getZipCdFrom() {
        return _zipCdFrom;
    }

    /**
     * [set] ZIP_CD_FROM: {varchar(543)} <br>
     * @param zipCdFrom The value of the column 'ZIP_CD_FROM'. (NullAllowed)
     */
    public void setZipCdFrom(String zipCdFrom) {
        __modifiedProperties.add("zipCdFrom");
        this._zipCdFrom = zipCdFrom;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * @return The value of the column 'BOL_NO'. (NullAllowed)
     */
    public String getBolNo() {
        return _bolNo;
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed)
     */
    public void setBolNo(String bolNo) {
        __modifiedProperties.add("bolNo");
        this._bolNo = bolNo;
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
     * [get] ZIP_CD_TO: {varchar(543)} <br>
     * @return The value of the column 'ZIP_CD_TO'. (NullAllowed)
     */
    public String getZipCdTo() {
        return _zipCdTo;
    }

    /**
     * [set] ZIP_CD_TO: {varchar(543)} <br>
     * @param zipCdTo The value of the column 'ZIP_CD_TO'. (NullAllowed)
     */
    public void setZipCdTo(String zipCdTo) {
        __modifiedProperties.add("zipCdTo");
        this._zipCdTo = zipCdTo;
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
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] PAYMENT_TERM: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public String getPaymentTerm() {
        return _paymentTerm;
    }

    /**
     * [set] PAYMENT_TERM: {varchar(30)} <br>
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public void setPaymentTerm(String paymentTerm) {
        __modifiedProperties.add("paymentTerm");
        this._paymentTerm = paymentTerm;
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
     * [get] PKGS: {int(10)} <br>
     * @return The value of the column 'PKGS'. (NullAllowed)
     */
    public Long getPkgs() {
        return _pkgs;
    }

    /**
     * [set] PKGS: {int(10)} <br>
     * @param pkgs The value of the column 'PKGS'. (NullAllowed)
     */
    public void setPkgs(Long pkgs) {
        __modifiedProperties.add("pkgs");
        this._pkgs = pkgs;
    }

    /**
     * [get] WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getWeight() {
        return _weight;
    }

    /**
     * [set] WEIGHT: {decimal(38, 6)} <br>
     * @param weight The value of the column 'WEIGHT'. (NullAllowed)
     */
    public void setWeight(java.math.BigDecimal weight) {
        __modifiedProperties.add("weight");
        this._weight = weight;
    }

}
