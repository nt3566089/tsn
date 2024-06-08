package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTrhanbaiinvList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_ID, CLIENT_ID, INOUTKBN, PRODUCT_ID, STOCKQTY, DAMAGEITEMQTY
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
public abstract class BsSqlTrhanbaiinvListDto implements Serializable {

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
    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** STOCKQTY: {bigint(19)} */
    @JsonKey
    protected Long _stockqty;

    /** DAMAGEITEMQTY: {bigint(19)} */
    @JsonKey
    protected Long _damageitemqty;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTrhanbaiinvListDto() {
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
        if (other == null || !(other instanceof BsSqlTrhanbaiinvListDto)) { return false; }
        final BsSqlTrhanbaiinvListDto otherEntity = (BsSqlTrhanbaiinvListDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getStockqty(), otherEntity.getStockqty())) { return false; }
        if (!helpComparingValue(getDamageitemqty(), otherEntity.getDamageitemqty())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTrhanbaiinvList");
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getProductId());
        result = xCH(result, getStockqty());
        result = xCH(result, getDamageitemqty());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getProductId());
        sb.append(c).append(getStockqty());
        sb.append(c).append(getDamageitemqty());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] STOCKQTY: {bigint(19)} <br>
     * @return The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public Long getStockqty() {
        return _stockqty;
    }

    /**
     * [set] STOCKQTY: {bigint(19)} <br>
     * @param stockqty The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public void setStockqty(Long stockqty) {
        __modifiedProperties.add("stockqty");
        this._stockqty = stockqty;
    }

    /**
     * [get] DAMAGEITEMQTY: {bigint(19)} <br>
     * @return The value of the column 'DAMAGEITEMQTY'. (NullAllowed)
     */
    public Long getDamageitemqty() {
        return _damageitemqty;
    }

    /**
     * [set] DAMAGEITEMQTY: {bigint(19)} <br>
     * @param damageitemqty The value of the column 'DAMAGEITEMQTY'. (NullAllowed)
     */
    public void setDamageitemqty(Long damageitemqty) {
        __modifiedProperties.add("damageitemqty");
        this._damageitemqty = damageitemqty;
    }

}
