package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInstKeyList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_INST_KBN, INVENTORY_KEY, INVENTORY_DT, PRODUCT_DIVISION, LINE_BLOCK, DIRECTIONAL_PISTON, LOCATION_GRP, LOCATION_CD, FROM_LOCATION_CD, TO_LOCATION_CD, PRODUCT_CD, PRODUCT_NM, INVENTORY_INST_KBN_NM, PRODUCT_DIVISION_NM, LOCATION_GRP_NM, CLIENT_CD, CLIENT_NM, CENTER_CD, CENTER_NM
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
public abstract class BsSqlInstKeyListDto implements Serializable {

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
    /** INVENTORY_INST_KBN: {varchar(30)} */
    @JsonKey
    protected String _inventoryInstKbn;

    /** INVENTORY_KEY: {bigint(19)} */
    @JsonKey
    protected Long _inventoryKey;

    /** INVENTORY_DT: {varchar(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** PRODUCT_DIVISION: {varchar(30)} */
    @JsonKey
    protected String _productDivision;

    /** LINE_BLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** DIRECTIONAL_PISTON: {varchar(255)} */
    @JsonKey
    protected String _directionalPiston;

    /** LOCATION_GRP: {varchar(30)} */
    @JsonKey
    protected String _locationGrp;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** FROM_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _toLocationCd;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** INVENTORY_INST_KBN_NM: {varchar(100)} */
    @JsonKey
    protected String _inventoryInstKbnNm;

    /** PRODUCT_DIVISION_NM: {varchar(100)} */
    @JsonKey
    protected String _productDivisionNm;

    /** LOCATION_GRP_NM: {varchar(100)} */
    @JsonKey
    protected String _locationGrpNm;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInstKeyListDto() {
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
        if (other == null || !(other instanceof BsSqlInstKeyListDto)) { return false; }
        final BsSqlInstKeyListDto otherEntity = (BsSqlInstKeyListDto)other;
        if (!helpComparingValue(getInventoryInstKbn(), otherEntity.getInventoryInstKbn())) { return false; }
        if (!helpComparingValue(getInventoryKey(), otherEntity.getInventoryKey())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getProductDivision(), otherEntity.getProductDivision())) { return false; }
        if (!helpComparingValue(getLineBlock(), otherEntity.getLineBlock())) { return false; }
        if (!helpComparingValue(getDirectionalPiston(), otherEntity.getDirectionalPiston())) { return false; }
        if (!helpComparingValue(getLocationGrp(), otherEntity.getLocationGrp())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getFromLocationCd(), otherEntity.getFromLocationCd())) { return false; }
        if (!helpComparingValue(getToLocationCd(), otherEntity.getToLocationCd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getInventoryInstKbnNm(), otherEntity.getInventoryInstKbnNm())) { return false; }
        if (!helpComparingValue(getProductDivisionNm(), otherEntity.getProductDivisionNm())) { return false; }
        if (!helpComparingValue(getLocationGrpNm(), otherEntity.getLocationGrpNm())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInstKeyList");
        result = xCH(result, getInventoryInstKbn());
        result = xCH(result, getInventoryKey());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getProductDivision());
        result = xCH(result, getLineBlock());
        result = xCH(result, getDirectionalPiston());
        result = xCH(result, getLocationGrp());
        result = xCH(result, getLocationCd());
        result = xCH(result, getFromLocationCd());
        result = xCH(result, getToLocationCd());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getInventoryInstKbnNm());
        result = xCH(result, getProductDivisionNm());
        result = xCH(result, getLocationGrpNm());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
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
        sb.append(c).append(getInventoryInstKbn());
        sb.append(c).append(getInventoryKey());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getProductDivision());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getDirectionalPiston());
        sb.append(c).append(getLocationGrp());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getFromLocationCd());
        sb.append(c).append(getToLocationCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getInventoryInstKbnNm());
        sb.append(c).append(getProductDivisionNm());
        sb.append(c).append(getLocationGrpNm());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public String getInventoryInstKbn() {
        return _inventoryInstKbn;
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        __modifiedProperties.add("inventoryInstKbn");
        this._inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] INVENTORY_KEY: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public Long getInventoryKey() {
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {bigint(19)} <br>
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public void setInventoryKey(Long inventoryKey) {
        __modifiedProperties.add("inventoryKey");
        this._inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] PRODUCT_DIVISION: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_DIVISION'. (NullAllowed)
     */
    public String getProductDivision() {
        return _productDivision;
    }

    /**
     * [set] PRODUCT_DIVISION: {varchar(30)} <br>
     * @param productDivision The value of the column 'PRODUCT_DIVISION'. (NullAllowed)
     */
    public void setProductDivision(String productDivision) {
        __modifiedProperties.add("productDivision");
        this._productDivision = productDivision;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public String getDirectionalPiston() {
        return _directionalPiston;
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public void setDirectionalPiston(String directionalPiston) {
        __modifiedProperties.add("directionalPiston");
        this._directionalPiston = directionalPiston;
    }

    /**
     * [get] LOCATION_GRP: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public String getLocationGrp() {
        return _locationGrp;
    }

    /**
     * [set] LOCATION_GRP: {varchar(30)} <br>
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public void setLocationGrp(String locationGrp) {
        __modifiedProperties.add("locationGrp");
        this._locationGrp = locationGrp;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] FROM_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public String getFromLocationCd() {
        return _fromLocationCd;
    }

    /**
     * [set] FROM_LOCATION_CD: {varchar(30)} <br>
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public void setFromLocationCd(String fromLocationCd) {
        __modifiedProperties.add("fromLocationCd");
        this._fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public String getToLocationCd() {
        return _toLocationCd;
    }

    /**
     * [set] TO_LOCATION_CD: {varchar(30)} <br>
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public void setToLocationCd(String toLocationCd) {
        __modifiedProperties.add("toLocationCd");
        this._toLocationCd = toLocationCd;
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
     * [get] INVENTORY_INST_KBN_NM: {varchar(100)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN_NM'. (NullAllowed)
     */
    public String getInventoryInstKbnNm() {
        return _inventoryInstKbnNm;
    }

    /**
     * [set] INVENTORY_INST_KBN_NM: {varchar(100)} <br>
     * @param inventoryInstKbnNm The value of the column 'INVENTORY_INST_KBN_NM'. (NullAllowed)
     */
    public void setInventoryInstKbnNm(String inventoryInstKbnNm) {
        __modifiedProperties.add("inventoryInstKbnNm");
        this._inventoryInstKbnNm = inventoryInstKbnNm;
    }

    /**
     * [get] PRODUCT_DIVISION_NM: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_DIVISION_NM'. (NullAllowed)
     */
    public String getProductDivisionNm() {
        return _productDivisionNm;
    }

    /**
     * [set] PRODUCT_DIVISION_NM: {varchar(100)} <br>
     * @param productDivisionNm The value of the column 'PRODUCT_DIVISION_NM'. (NullAllowed)
     */
    public void setProductDivisionNm(String productDivisionNm) {
        __modifiedProperties.add("productDivisionNm");
        this._productDivisionNm = productDivisionNm;
    }

    /**
     * [get] LOCATION_GRP_NM: {varchar(100)} <br>
     * @return The value of the column 'LOCATION_GRP_NM'. (NullAllowed)
     */
    public String getLocationGrpNm() {
        return _locationGrpNm;
    }

    /**
     * [set] LOCATION_GRP_NM: {varchar(100)} <br>
     * @param locationGrpNm The value of the column 'LOCATION_GRP_NM'. (NullAllowed)
     */
    public void setLocationGrpNm(String locationGrpNm) {
        __modifiedProperties.add("locationGrpNm");
        this._locationGrpNm = locationGrpNm;
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

}
