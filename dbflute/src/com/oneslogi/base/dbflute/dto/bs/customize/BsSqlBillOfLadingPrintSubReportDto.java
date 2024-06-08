package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlBillOfLadingPrintSubReport. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INST_NUM2, TYPE, WEIGHT, PRODUCT_ABBR, NMFC_CODE, FREIGHT_CLS
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
public abstract class BsSqlBillOfLadingPrintSubReportDto implements Serializable {

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
    /** INST_NUM2: {int(10)} */
    @JsonKey
    protected Long _instNum2;

    /** TYPE: {varchar(30)} */
    @JsonKey
    protected String _type;

    /** WEIGHT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _weight;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** NMFC_CODE: {varchar(30)} */
    @JsonKey
    protected String _nmfcCode;

    /** FREIGHT_CLS: {varchar(100)} */
    @JsonKey
    protected String _freightCls;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlBillOfLadingPrintSubReportDto() {
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
        if (other == null || !(other instanceof BsSqlBillOfLadingPrintSubReportDto)) { return false; }
        final BsSqlBillOfLadingPrintSubReportDto otherEntity = (BsSqlBillOfLadingPrintSubReportDto)other;
        if (!helpComparingValue(getInstNum2(), otherEntity.getInstNum2())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getWeight(), otherEntity.getWeight())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getNmfcCode(), otherEntity.getNmfcCode())) { return false; }
        if (!helpComparingValue(getFreightCls(), otherEntity.getFreightCls())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlBillOfLadingPrintSubReport");
        result = xCH(result, getInstNum2());
        result = xCH(result, getType());
        result = xCH(result, getWeight());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getNmfcCode());
        result = xCH(result, getFreightCls());
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
        sb.append(c).append(getInstNum2());
        sb.append(c).append(getType());
        sb.append(c).append(getWeight());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getNmfcCode());
        sb.append(c).append(getFreightCls());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INST_NUM2: {int(10)} <br>
     * @return The value of the column 'INST_NUM2'. (NullAllowed)
     */
    public Long getInstNum2() {
        return _instNum2;
    }

    /**
     * [set] INST_NUM2: {int(10)} <br>
     * @param instNum2 The value of the column 'INST_NUM2'. (NullAllowed)
     */
    public void setInstNum2(Long instNum2) {
        __modifiedProperties.add("instNum2");
        this._instNum2 = instNum2;
    }

    /**
     * [get] TYPE: {varchar(30)} <br>
     * @return The value of the column 'TYPE'. (NullAllowed)
     */
    public String getType() {
        return _type;
    }

    /**
     * [set] TYPE: {varchar(30)} <br>
     * @param type The value of the column 'TYPE'. (NullAllowed)
     */
    public void setType(String type) {
        __modifiedProperties.add("type");
        this._type = type;
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

}
