package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlWTrallinvList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_ID, CLIENT_ID, INOUTKBN, PRODUCT_ID, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, PRODUCT_CD, USERNUM4
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
public abstract class BsSqlWTrallinvListDto implements Serializable {

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

    /** SYSINVTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

    /** SYSINVKEEPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvkeeplocinv;

    /** SYSINVRECEIVELOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvreceivelocinv;

    /** SYSINVDAMAGEITEM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvdamageitem;

    /** SYSINVCLSSIFYLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvclssifylocinv;

    /** SYSINVTMPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtmplocinv;

    /** SYSINVAUTOINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvautoinv;

    /** INVESTTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investautoinv;

    /** TDAYEQYTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** TDAYEQYKEEPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqykeeplocinv;

    /** TDAYEQYRECEIVELOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqyreceivelocinv;

    /** TDAYEQYDAMAGEITEM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqydamageitem;

    /** TDAYEQYCLSSIFYLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqyclssifylocinv;

    /** YDAYTLEQULYTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** YDAYTLEQULYKEEPLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlykeeplocinv;

    /** YDAYTLEQULYRECEIVELOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlyreceivelocinv;

    /** YDAYTLEQULYDAMAGEITEM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlydamageitem;

    /** YDAYTLEQULYCLSSIFYLOCINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlyclssifylocinv;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** USERNUM4: {bigint(19)} */
    @JsonKey
    protected Long _usernum4;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlWTrallinvListDto() {
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
        if (other == null || !(other instanceof BsSqlWTrallinvListDto)) { return false; }
        final BsSqlWTrallinvListDto otherEntity = (BsSqlWTrallinvListDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getSysinvtotalinv(), otherEntity.getSysinvtotalinv())) { return false; }
        if (!helpComparingValue(getSysinvkeeplocinv(), otherEntity.getSysinvkeeplocinv())) { return false; }
        if (!helpComparingValue(getSysinvreceivelocinv(), otherEntity.getSysinvreceivelocinv())) { return false; }
        if (!helpComparingValue(getSysinvdamageitem(), otherEntity.getSysinvdamageitem())) { return false; }
        if (!helpComparingValue(getSysinvclssifylocinv(), otherEntity.getSysinvclssifylocinv())) { return false; }
        if (!helpComparingValue(getSysinvtmplocinv(), otherEntity.getSysinvtmplocinv())) { return false; }
        if (!helpComparingValue(getSysinvautoinv(), otherEntity.getSysinvautoinv())) { return false; }
        if (!helpComparingValue(getInvesttotalinv(), otherEntity.getInvesttotalinv())) { return false; }
        if (!helpComparingValue(getInvestkeeplocinv(), otherEntity.getInvestkeeplocinv())) { return false; }
        if (!helpComparingValue(getInvestreceivelocinv(), otherEntity.getInvestreceivelocinv())) { return false; }
        if (!helpComparingValue(getInvestdamageitem(), otherEntity.getInvestdamageitem())) { return false; }
        if (!helpComparingValue(getInvestclssifylocinv(), otherEntity.getInvestclssifylocinv())) { return false; }
        if (!helpComparingValue(getInvesttmplocinv(), otherEntity.getInvesttmplocinv())) { return false; }
        if (!helpComparingValue(getInvestautoinv(), otherEntity.getInvestautoinv())) { return false; }
        if (!helpComparingValue(getTdayeqytotalinv(), otherEntity.getTdayeqytotalinv())) { return false; }
        if (!helpComparingValue(getTdayeqykeeplocinv(), otherEntity.getTdayeqykeeplocinv())) { return false; }
        if (!helpComparingValue(getTdayeqyreceivelocinv(), otherEntity.getTdayeqyreceivelocinv())) { return false; }
        if (!helpComparingValue(getTdayeqydamageitem(), otherEntity.getTdayeqydamageitem())) { return false; }
        if (!helpComparingValue(getTdayeqyclssifylocinv(), otherEntity.getTdayeqyclssifylocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlytotalinv(), otherEntity.getYdaytlequlytotalinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlykeeplocinv(), otherEntity.getYdaytlequlykeeplocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlyreceivelocinv(), otherEntity.getYdaytlequlyreceivelocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlydamageitem(), otherEntity.getYdaytlequlydamageitem())) { return false; }
        if (!helpComparingValue(getYdaytlequlyclssifylocinv(), otherEntity.getYdaytlequlyclssifylocinv())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getUsernum4(), otherEntity.getUsernum4())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlWTrallinvList");
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getProductId());
        result = xCH(result, getSysinvtotalinv());
        result = xCH(result, getSysinvkeeplocinv());
        result = xCH(result, getSysinvreceivelocinv());
        result = xCH(result, getSysinvdamageitem());
        result = xCH(result, getSysinvclssifylocinv());
        result = xCH(result, getSysinvtmplocinv());
        result = xCH(result, getSysinvautoinv());
        result = xCH(result, getInvesttotalinv());
        result = xCH(result, getInvestkeeplocinv());
        result = xCH(result, getInvestreceivelocinv());
        result = xCH(result, getInvestdamageitem());
        result = xCH(result, getInvestclssifylocinv());
        result = xCH(result, getInvesttmplocinv());
        result = xCH(result, getInvestautoinv());
        result = xCH(result, getTdayeqytotalinv());
        result = xCH(result, getTdayeqykeeplocinv());
        result = xCH(result, getTdayeqyreceivelocinv());
        result = xCH(result, getTdayeqydamageitem());
        result = xCH(result, getTdayeqyclssifylocinv());
        result = xCH(result, getYdaytlequlytotalinv());
        result = xCH(result, getYdaytlequlykeeplocinv());
        result = xCH(result, getYdaytlequlyreceivelocinv());
        result = xCH(result, getYdaytlequlydamageitem());
        result = xCH(result, getYdaytlequlyclssifylocinv());
        result = xCH(result, getProductCd());
        result = xCH(result, getUsernum4());
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
        sb.append(c).append(getSysinvtotalinv());
        sb.append(c).append(getSysinvkeeplocinv());
        sb.append(c).append(getSysinvreceivelocinv());
        sb.append(c).append(getSysinvdamageitem());
        sb.append(c).append(getSysinvclssifylocinv());
        sb.append(c).append(getSysinvtmplocinv());
        sb.append(c).append(getSysinvautoinv());
        sb.append(c).append(getInvesttotalinv());
        sb.append(c).append(getInvestkeeplocinv());
        sb.append(c).append(getInvestreceivelocinv());
        sb.append(c).append(getInvestdamageitem());
        sb.append(c).append(getInvestclssifylocinv());
        sb.append(c).append(getInvesttmplocinv());
        sb.append(c).append(getInvestautoinv());
        sb.append(c).append(getTdayeqytotalinv());
        sb.append(c).append(getTdayeqykeeplocinv());
        sb.append(c).append(getTdayeqyreceivelocinv());
        sb.append(c).append(getTdayeqydamageitem());
        sb.append(c).append(getTdayeqyclssifylocinv());
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getYdaytlequlykeeplocinv());
        sb.append(c).append(getYdaytlequlyreceivelocinv());
        sb.append(c).append(getYdaytlequlydamageitem());
        sb.append(c).append(getYdaytlequlyclssifylocinv());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getUsernum4());
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
     * [get] SYSINVTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(38, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] SYSINVKEEPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvkeeplocinv() {
        return _sysinvkeeplocinv;
    }

    /**
     * [set] SYSINVKEEPLOCINV: {decimal(38, 6)} <br>
     * @param sysinvkeeplocinv The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public void setSysinvkeeplocinv(java.math.BigDecimal sysinvkeeplocinv) {
        __modifiedProperties.add("sysinvkeeplocinv");
        this._sysinvkeeplocinv = sysinvkeeplocinv;
    }

    /**
     * [get] SYSINVRECEIVELOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvreceivelocinv() {
        return _sysinvreceivelocinv;
    }

    /**
     * [set] SYSINVRECEIVELOCINV: {decimal(38, 6)} <br>
     * @param sysinvreceivelocinv The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public void setSysinvreceivelocinv(java.math.BigDecimal sysinvreceivelocinv) {
        __modifiedProperties.add("sysinvreceivelocinv");
        this._sysinvreceivelocinv = sysinvreceivelocinv;
    }

    /**
     * [get] SYSINVDAMAGEITEM: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvdamageitem() {
        return _sysinvdamageitem;
    }

    /**
     * [set] SYSINVDAMAGEITEM: {decimal(38, 6)} <br>
     * @param sysinvdamageitem The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public void setSysinvdamageitem(java.math.BigDecimal sysinvdamageitem) {
        __modifiedProperties.add("sysinvdamageitem");
        this._sysinvdamageitem = sysinvdamageitem;
    }

    /**
     * [get] SYSINVCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvclssifylocinv() {
        return _sysinvclssifylocinv;
    }

    /**
     * [set] SYSINVCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @param sysinvclssifylocinv The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setSysinvclssifylocinv(java.math.BigDecimal sysinvclssifylocinv) {
        __modifiedProperties.add("sysinvclssifylocinv");
        this._sysinvclssifylocinv = sysinvclssifylocinv;
    }

    /**
     * [get] SYSINVTMPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtmplocinv() {
        return _sysinvtmplocinv;
    }

    /**
     * [set] SYSINVTMPLOCINV: {decimal(38, 6)} <br>
     * @param sysinvtmplocinv The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public void setSysinvtmplocinv(java.math.BigDecimal sysinvtmplocinv) {
        __modifiedProperties.add("sysinvtmplocinv");
        this._sysinvtmplocinv = sysinvtmplocinv;
    }

    /**
     * [get] SYSINVAUTOINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvautoinv() {
        return _sysinvautoinv;
    }

    /**
     * [set] SYSINVAUTOINV: {decimal(38, 6)} <br>
     * @param sysinvautoinv The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public void setSysinvautoinv(java.math.BigDecimal sysinvautoinv) {
        __modifiedProperties.add("sysinvautoinv");
        this._sysinvautoinv = sysinvautoinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(38, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(38, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(38, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(38, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(38, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(38, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(38, 6)} <br>
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        __modifiedProperties.add("tdayeqytotalinv");
        this._tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] TDAYEQYKEEPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqykeeplocinv() {
        return _tdayeqykeeplocinv;
    }

    /**
     * [set] TDAYEQYKEEPLOCINV: {decimal(38, 6)} <br>
     * @param tdayeqykeeplocinv The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public void setTdayeqykeeplocinv(java.math.BigDecimal tdayeqykeeplocinv) {
        __modifiedProperties.add("tdayeqykeeplocinv");
        this._tdayeqykeeplocinv = tdayeqykeeplocinv;
    }

    /**
     * [get] TDAYEQYRECEIVELOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyreceivelocinv() {
        return _tdayeqyreceivelocinv;
    }

    /**
     * [set] TDAYEQYRECEIVELOCINV: {decimal(38, 6)} <br>
     * @param tdayeqyreceivelocinv The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public void setTdayeqyreceivelocinv(java.math.BigDecimal tdayeqyreceivelocinv) {
        __modifiedProperties.add("tdayeqyreceivelocinv");
        this._tdayeqyreceivelocinv = tdayeqyreceivelocinv;
    }

    /**
     * [get] TDAYEQYDAMAGEITEM: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqydamageitem() {
        return _tdayeqydamageitem;
    }

    /**
     * [set] TDAYEQYDAMAGEITEM: {decimal(38, 6)} <br>
     * @param tdayeqydamageitem The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public void setTdayeqydamageitem(java.math.BigDecimal tdayeqydamageitem) {
        __modifiedProperties.add("tdayeqydamageitem");
        this._tdayeqydamageitem = tdayeqydamageitem;
    }

    /**
     * [get] TDAYEQYCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyclssifylocinv() {
        return _tdayeqyclssifylocinv;
    }

    /**
     * [set] TDAYEQYCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @param tdayeqyclssifylocinv The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setTdayeqyclssifylocinv(java.math.BigDecimal tdayeqyclssifylocinv) {
        __modifiedProperties.add("tdayeqyclssifylocinv");
        this._tdayeqyclssifylocinv = tdayeqyclssifylocinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(38, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] YDAYTLEQULYKEEPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlykeeplocinv() {
        return _ydaytlequlykeeplocinv;
    }

    /**
     * [set] YDAYTLEQULYKEEPLOCINV: {decimal(38, 6)} <br>
     * @param ydaytlequlykeeplocinv The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlykeeplocinv(java.math.BigDecimal ydaytlequlykeeplocinv) {
        __modifiedProperties.add("ydaytlequlykeeplocinv");
        this._ydaytlequlykeeplocinv = ydaytlequlykeeplocinv;
    }

    /**
     * [get] YDAYTLEQULYRECEIVELOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyreceivelocinv() {
        return _ydaytlequlyreceivelocinv;
    }

    /**
     * [set] YDAYTLEQULYRECEIVELOCINV: {decimal(38, 6)} <br>
     * @param ydaytlequlyreceivelocinv The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyreceivelocinv(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        __modifiedProperties.add("ydaytlequlyreceivelocinv");
        this._ydaytlequlyreceivelocinv = ydaytlequlyreceivelocinv;
    }

    /**
     * [get] YDAYTLEQULYDAMAGEITEM: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlydamageitem() {
        return _ydaytlequlydamageitem;
    }

    /**
     * [set] YDAYTLEQULYDAMAGEITEM: {decimal(38, 6)} <br>
     * @param ydaytlequlydamageitem The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public void setYdaytlequlydamageitem(java.math.BigDecimal ydaytlequlydamageitem) {
        __modifiedProperties.add("ydaytlequlydamageitem");
        this._ydaytlequlydamageitem = ydaytlequlydamageitem;
    }

    /**
     * [get] YDAYTLEQULYCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyclssifylocinv() {
        return _ydaytlequlyclssifylocinv;
    }

    /**
     * [set] YDAYTLEQULYCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @param ydaytlequlyclssifylocinv The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyclssifylocinv(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        __modifiedProperties.add("ydaytlequlyclssifylocinv");
        this._ydaytlequlyclssifylocinv = ydaytlequlyclssifylocinv;
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
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed)
     */
    public Long getUsernum4() {
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed)
     */
    public void setUsernum4(Long usernum4) {
        __modifiedProperties.add("usernum4");
        this._usernum4 = usernum4;
    }

}
