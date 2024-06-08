package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShipmentRequestPackage. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, COMP_ID, COMP_CD, PRODUCT_ABBR, GROSS_WEIGHT, LENGTH, WIDTH, HEIGHT, NMFC_CODE, FREIGHT_CLS, SHIPPING_PACKING_NO, CLIENT_SHIPPING_NO
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
public abstract class BsSqlShipmentRequestPackageDto implements Serializable {

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

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** WAREHOUSE_ID: {varchar(30)} */
    @JsonKey
    protected String _warehouseId;

    /** COMP_ID: {bigint(19)} */
    @JsonKey
    protected Long _compId;

    /** COMP_CD: {varchar(30)} */
    @JsonKey
    protected String _compCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** GROSS_WEIGHT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** LENGTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _height;

    /** NMFC_CODE: {varchar(30)} */
    @JsonKey
    protected String _nmfcCode;

    /** FREIGHT_CLS: {varchar(100)} */
    @JsonKey
    protected String _freightCls;

    /** SHIPPING_PACKING_NO: {varchar(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShipmentRequestPackageDto() {
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
        if (other == null || !(other instanceof BsSqlShipmentRequestPackageDto)) { return false; }
        final BsSqlShipmentRequestPackageDto otherEntity = (BsSqlShipmentRequestPackageDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getWarehouseId(), otherEntity.getWarehouseId())) { return false; }
        if (!helpComparingValue(getCompId(), otherEntity.getCompId())) { return false; }
        if (!helpComparingValue(getCompCd(), otherEntity.getCompCd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getGrossWeight(), otherEntity.getGrossWeight())) { return false; }
        if (!helpComparingValue(getLength(), otherEntity.getLength())) { return false; }
        if (!helpComparingValue(getWidth(), otherEntity.getWidth())) { return false; }
        if (!helpComparingValue(getHeight(), otherEntity.getHeight())) { return false; }
        if (!helpComparingValue(getNmfcCode(), otherEntity.getNmfcCode())) { return false; }
        if (!helpComparingValue(getFreightCls(), otherEntity.getFreightCls())) { return false; }
        if (!helpComparingValue(getShippingPackingNo(), otherEntity.getShippingPackingNo())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShipmentRequestPackage");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getWarehouseId());
        result = xCH(result, getCompId());
        result = xCH(result, getCompCd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getGrossWeight());
        result = xCH(result, getLength());
        result = xCH(result, getWidth());
        result = xCH(result, getHeight());
        result = xCH(result, getNmfcCode());
        result = xCH(result, getFreightCls());
        result = xCH(result, getShippingPackingNo());
        result = xCH(result, getClientShippingNo());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getCompId());
        sb.append(c).append(getCompCd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getNmfcCode());
        sb.append(c).append(getFreightCls());
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getClientShippingNo());
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
     * [get] WAREHOUSE_ID: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public String getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {varchar(30)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(String warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] COMP_ID: {bigint(19)} <br>
     * @return The value of the column 'COMP_ID'. (NullAllowed)
     */
    public Long getCompId() {
        return _compId;
    }

    /**
     * [set] COMP_ID: {bigint(19)} <br>
     * @param compId The value of the column 'COMP_ID'. (NullAllowed)
     */
    public void setCompId(Long compId) {
        __modifiedProperties.add("compId");
        this._compId = compId;
    }

    /**
     * [get] COMP_CD: {varchar(30)} <br>
     * @return The value of the column 'COMP_CD'. (NullAllowed)
     */
    public String getCompCd() {
        return _compCd;
    }

    /**
     * [set] COMP_CD: {varchar(30)} <br>
     * @param compCd The value of the column 'COMP_CD'. (NullAllowed)
     */
    public void setCompCd(String compCd) {
        __modifiedProperties.add("compCd");
        this._compCd = compCd;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(38, 6)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public java.math.BigDecimal getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(java.math.BigDecimal length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public java.math.BigDecimal getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(java.math.BigDecimal width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(java.math.BigDecimal height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] NMFC_CODE: {varchar(30)} <br>
     * @return The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public String getNmfcCode() {
        return _nmfcCode;
    }

    /**
     * [set] NMFC_CODE: {varchar(30)} <br>
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed)
     */
    public void setNmfcCode(String nmfcCode) {
        __modifiedProperties.add("nmfcCode");
        this._nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {varchar(100)} <br>
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public String getFreightCls() {
        return _freightCls;
    }

    /**
     * [set] FREIGHT_CLS: {varchar(100)} <br>
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed)
     */
    public void setFreightCls(String freightCls) {
        __modifiedProperties.add("freightCls");
        this._freightCls = freightCls;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
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

}
