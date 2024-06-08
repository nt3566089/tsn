package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTTrsymbolInventoryInputProductSortingPlace. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, LOT4, PRODUCT_CD, RECEIVEDQTY, LOT3, SOTEDUNIT, ASSORTEDUNIT
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
public abstract class BsSqlTTrsymbolInventoryInputProductSortingPlaceDto implements Serializable {

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
    /** TRSYMBOL_ID: {bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** CASECD: {bigint(19)} */
    @JsonKey
    protected Long _casecd;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** RECEIVEDQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receivedqty;

    /** LOT3: {varchar(30)} */
    @JsonKey
    protected String _lot3;

    /** SOTEDUNIT: {varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** ASSORTEDUNIT: {varchar(255)} */
    @JsonKey
    protected String _assortedunit;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTTrsymbolInventoryInputProductSortingPlaceDto() {
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
        if (other == null || !(other instanceof BsSqlTTrsymbolInventoryInputProductSortingPlaceDto)) { return false; }
        final BsSqlTTrsymbolInventoryInputProductSortingPlaceDto otherEntity = (BsSqlTTrsymbolInventoryInputProductSortingPlaceDto)other;
        if (!helpComparingValue(getTrsymbolId(), otherEntity.getTrsymbolId())) { return false; }
        if (!helpComparingValue(getCasecd(), otherEntity.getCasecd())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getReceivedqty(), otherEntity.getReceivedqty())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getSotedunit(), otherEntity.getSotedunit())) { return false; }
        if (!helpComparingValue(getAssortedunit(), otherEntity.getAssortedunit())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTTrsymbolInventoryInputProductSortingPlace");
        result = xCH(result, getTrsymbolId());
        result = xCH(result, getCasecd());
        result = xCH(result, getLot4());
        result = xCH(result, getProductCd());
        result = xCH(result, getReceivedqty());
        result = xCH(result, getLot3());
        result = xCH(result, getSotedunit());
        result = xCH(result, getAssortedunit());
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
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getCasecd());
        sb.append(c).append(getLot4());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getReceivedqty());
        sb.append(c).append(getLot3());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getAssortedunit());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] CASECD: {bigint(19)} <br>
     * @return The value of the column 'CASECD'. (NullAllowed)
     */
    public Long getCasecd() {
        return _casecd;
    }

    /**
     * [set] CASECD: {bigint(19)} <br>
     * @param casecd The value of the column 'CASECD'. (NullAllowed)
     */
    public void setCasecd(Long casecd) {
        __modifiedProperties.add("casecd");
        this._casecd = casecd;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] RECEIVEDQTY: {decimal(16, 6)} <br>
     * @return The value of the column 'RECEIVEDQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivedqty() {
        return _receivedqty;
    }

    /**
     * [set] RECEIVEDQTY: {decimal(16, 6)} <br>
     * @param receivedqty The value of the column 'RECEIVEDQTY'. (NullAllowed)
     */
    public void setReceivedqty(java.math.BigDecimal receivedqty) {
        __modifiedProperties.add("receivedqty");
        this._receivedqty = receivedqty;
    }

    /**
     * [get] LOT3: {varchar(30)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(30)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public String getAssortedunit() {
        return _assortedunit;
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public void setAssortedunit(String assortedunit) {
        __modifiedProperties.add("assortedunit");
        this._assortedunit = assortedunit;
    }

}
