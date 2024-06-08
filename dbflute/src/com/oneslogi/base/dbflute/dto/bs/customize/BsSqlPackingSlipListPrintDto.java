package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPackingSlipListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CLIENT_ADDRESS1, CLIENT_ADDRESS2, CLIENT_ADDRESS3, CLIENT_TEL_NO, SHIPPING_DT, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_NM, BILL_ADDRESS1, BILL_ADDRESS2, BILL_ADDRESS3, BILL_TEL_NO, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, PRODUCT_CD, PRODUCT_NM, ALLOC_NUM
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
public abstract class BsSqlPackingSlipListPrintDto implements Serializable {

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
    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CLIENT_ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _clientAddress1;

    /** CLIENT_ADDRESS2: {varchar(60)} */
    @JsonKey
    protected String _clientAddress2;

    /** CLIENT_ADDRESS3: {varchar(60)} */
    @JsonKey
    protected String _clientAddress3;

    /** CLIENT_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _clientTelNo;

    /** SHIPPING_DT: {varchar(8)} */
    @JsonKey
    protected String _shippingDt;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** BILL_ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _billAddress1;

    /** BILL_ADDRESS2: {varchar(60)} */
    @JsonKey
    protected String _billAddress2;

    /** BILL_ADDRESS3: {varchar(60)} */
    @JsonKey
    protected String _billAddress3;

    /** BILL_TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _billTelNo;

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

    /** DELIV_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** ALLOC_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPackingSlipListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlPackingSlipListPrintDto)) { return false; }
        final BsSqlPackingSlipListPrintDto otherEntity = (BsSqlPackingSlipListPrintDto)other;
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getClientAddress1(), otherEntity.getClientAddress1())) { return false; }
        if (!helpComparingValue(getClientAddress2(), otherEntity.getClientAddress2())) { return false; }
        if (!helpComparingValue(getClientAddress3(), otherEntity.getClientAddress3())) { return false; }
        if (!helpComparingValue(getClientTelNo(), otherEntity.getClientTelNo())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getBillAddress1(), otherEntity.getBillAddress1())) { return false; }
        if (!helpComparingValue(getBillAddress2(), otherEntity.getBillAddress2())) { return false; }
        if (!helpComparingValue(getBillAddress3(), otherEntity.getBillAddress3())) { return false; }
        if (!helpComparingValue(getBillTelNo(), otherEntity.getBillTelNo())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivAddress1(), otherEntity.getDelivAddress1())) { return false; }
        if (!helpComparingValue(getDelivAddress2(), otherEntity.getDelivAddress2())) { return false; }
        if (!helpComparingValue(getDelivAddress3(), otherEntity.getDelivAddress3())) { return false; }
        if (!helpComparingValue(getDelivTelNo(), otherEntity.getDelivTelNo())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getAllocNum(), otherEntity.getAllocNum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPackingSlipListPrint");
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getClientAddress1());
        result = xCH(result, getClientAddress2());
        result = xCH(result, getClientAddress3());
        result = xCH(result, getClientTelNo());
        result = xCH(result, getShippingDt());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getBillAddress1());
        result = xCH(result, getBillAddress2());
        result = xCH(result, getBillAddress3());
        result = xCH(result, getBillTelNo());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getDelivAddress1());
        result = xCH(result, getDelivAddress2());
        result = xCH(result, getDelivAddress3());
        result = xCH(result, getDelivTelNo());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getAllocNum());
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
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getClientAddress1());
        sb.append(c).append(getClientAddress2());
        sb.append(c).append(getClientAddress3());
        sb.append(c).append(getClientTelNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getBillAddress1());
        sb.append(c).append(getBillAddress2());
        sb.append(c).append(getBillAddress3());
        sb.append(c).append(getBillTelNo());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getAllocNum());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] CLIENT_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS1'. (NullAllowed)
     */
    public String getClientAddress1() {
        return _clientAddress1;
    }

    /**
     * [set] CLIENT_ADDRESS1: {varchar(60)} <br>
     * @param clientAddress1 The value of the column 'CLIENT_ADDRESS1'. (NullAllowed)
     */
    public void setClientAddress1(String clientAddress1) {
        __modifiedProperties.add("clientAddress1");
        this._clientAddress1 = clientAddress1;
    }

    /**
     * [get] CLIENT_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS2'. (NullAllowed)
     */
    public String getClientAddress2() {
        return _clientAddress2;
    }

    /**
     * [set] CLIENT_ADDRESS2: {varchar(60)} <br>
     * @param clientAddress2 The value of the column 'CLIENT_ADDRESS2'. (NullAllowed)
     */
    public void setClientAddress2(String clientAddress2) {
        __modifiedProperties.add("clientAddress2");
        this._clientAddress2 = clientAddress2;
    }

    /**
     * [get] CLIENT_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS3'. (NullAllowed)
     */
    public String getClientAddress3() {
        return _clientAddress3;
    }

    /**
     * [set] CLIENT_ADDRESS3: {varchar(60)} <br>
     * @param clientAddress3 The value of the column 'CLIENT_ADDRESS3'. (NullAllowed)
     */
    public void setClientAddress3(String clientAddress3) {
        __modifiedProperties.add("clientAddress3");
        this._clientAddress3 = clientAddress3;
    }

    /**
     * [get] CLIENT_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_TEL_NO'. (NullAllowed)
     */
    public String getClientTelNo() {
        return _clientTelNo;
    }

    /**
     * [set] CLIENT_TEL_NO: {varchar(30)} <br>
     * @param clientTelNo The value of the column 'CLIENT_TEL_NO'. (NullAllowed)
     */
    public void setClientTelNo(String clientTelNo) {
        __modifiedProperties.add("clientTelNo");
        this._clientTelNo = clientTelNo;
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
     * [get] BILL_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS1'. (NullAllowed)
     */
    public String getBillAddress1() {
        return _billAddress1;
    }

    /**
     * [set] BILL_ADDRESS1: {varchar(60)} <br>
     * @param billAddress1 The value of the column 'BILL_ADDRESS1'. (NullAllowed)
     */
    public void setBillAddress1(String billAddress1) {
        __modifiedProperties.add("billAddress1");
        this._billAddress1 = billAddress1;
    }

    /**
     * [get] BILL_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS2'. (NullAllowed)
     */
    public String getBillAddress2() {
        return _billAddress2;
    }

    /**
     * [set] BILL_ADDRESS2: {varchar(60)} <br>
     * @param billAddress2 The value of the column 'BILL_ADDRESS2'. (NullAllowed)
     */
    public void setBillAddress2(String billAddress2) {
        __modifiedProperties.add("billAddress2");
        this._billAddress2 = billAddress2;
    }

    /**
     * [get] BILL_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS3'. (NullAllowed)
     */
    public String getBillAddress3() {
        return _billAddress3;
    }

    /**
     * [set] BILL_ADDRESS3: {varchar(60)} <br>
     * @param billAddress3 The value of the column 'BILL_ADDRESS3'. (NullAllowed)
     */
    public void setBillAddress3(String billAddress3) {
        __modifiedProperties.add("billAddress3");
        this._billAddress3 = billAddress3;
    }

    /**
     * [get] BILL_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'BILL_TEL_NO'. (NullAllowed)
     */
    public String getBillTelNo() {
        return _billTelNo;
    }

    /**
     * [set] BILL_TEL_NO: {varchar(30)} <br>
     * @param billTelNo The value of the column 'BILL_TEL_NO'. (NullAllowed)
     */
    public void setBillTelNo(String billTelNo) {
        __modifiedProperties.add("billTelNo");
        this._billTelNo = billTelNo;
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
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

}
