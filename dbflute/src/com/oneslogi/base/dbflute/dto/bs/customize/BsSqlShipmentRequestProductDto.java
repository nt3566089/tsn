package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShipmentRequestProduct. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, PRODUCT_ABBR, PRODUCT_NM, COUNNTRY_OF_ORIGIN, UNIT_VAL, PACKING_NUM, HTS_CD, PRODUCT_CD
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
public abstract class BsSqlShipmentRequestProductDto implements Serializable {

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

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** COUNNTRY_OF_ORIGIN: {varchar(30)} */
    @JsonKey
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unitVal;

    /** PACKING_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum;

    /** HTS_CD: {varchar(30)} */
    @JsonKey
    protected String _htsCd;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShipmentRequestProductDto() {
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
        if (other == null || !(other instanceof BsSqlShipmentRequestProductDto)) { return false; }
        final BsSqlShipmentRequestProductDto otherEntity = (BsSqlShipmentRequestProductDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getWarehouseId(), otherEntity.getWarehouseId())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getCounntryOfOrigin(), otherEntity.getCounntryOfOrigin())) { return false; }
        if (!helpComparingValue(getUnitVal(), otherEntity.getUnitVal())) { return false; }
        if (!helpComparingValue(getPackingNum(), otherEntity.getPackingNum())) { return false; }
        if (!helpComparingValue(getHtsCd(), otherEntity.getHtsCd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShipmentRequestProduct");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getWarehouseId());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getProductNm());
        result = xCH(result, getCounntryOfOrigin());
        result = xCH(result, getUnitVal());
        result = xCH(result, getPackingNum());
        result = xCH(result, getHtsCd());
        result = xCH(result, getProductCd());
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
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getCounntryOfOrigin());
        sb.append(c).append(getUnitVal());
        sb.append(c).append(getPackingNum());
        sb.append(c).append(getHtsCd());
        sb.append(c).append(getProductCd());
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
     * [get] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public String getCounntryOfOrigin() {
        return _counntryOfOrigin;
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        __modifiedProperties.add("counntryOfOrigin");
        this._counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public java.math.BigDecimal getUnitVal() {
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {decimal(16, 6)} <br>
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        __modifiedProperties.add("unitVal");
        this._unitVal = unitVal;
    }

    /**
     * [get] PACKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum() {
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {decimal(38, 6)} <br>
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        __modifiedProperties.add("packingNum");
        this._packingNum = packingNum;
    }

    /**
     * [get] HTS_CD: {varchar(30)} <br>
     * @return The value of the column 'HTS_CD'. (NullAllowed)
     */
    public String getHtsCd() {
        return _htsCd;
    }

    /**
     * [set] HTS_CD: {varchar(30)} <br>
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed)
     */
    public void setHtsCd(String htsCd) {
        __modifiedProperties.add("htsCd");
        this._htsCd = htsCd;
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

}
