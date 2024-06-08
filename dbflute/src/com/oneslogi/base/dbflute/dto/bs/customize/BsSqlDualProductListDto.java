package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlDualProductList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, EXECUTEDATE, INOUTKBN, PRODUCT_ID, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, TDAYEQYTOTALINV, CAPITEMFLG, CENTER_ID, CLIENT_ID, DUALPRODUCTID, DUALITEMCD
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
public abstract class BsSqlDualProductListDto implements Serializable {

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
    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** EXECUTEDATE: {varchar(8)} */
    @JsonKey
    protected String _executedate;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

    /** SYSINVKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvkeeplocinv;

    /** SYSINVRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvreceivelocinv;

    /** SYSINVDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvdamageitem;

    /** SYSINVCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvclssifylocinv;

    /** SYSINVTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtmplocinv;

    /** SYSINVAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvautoinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investautoinv;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAYEQYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** CAPITEMFLG: {bigint(19)} */
    @JsonKey
    protected String _capitemflg;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** DUALPRODUCTID: {bigint(19)} */
    @JsonKey
    protected Long _dualproductid;

    /** DUALITEMCD: {varchar(8)} */
    @JsonKey
    protected String _dualitemcd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlDualProductListDto() {
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
        if (other == null || !(other instanceof BsSqlDualProductListDto)) { return false; }
        final BsSqlDualProductListDto otherEntity = (BsSqlDualProductListDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getExecutedate(), otherEntity.getExecutedate())) { return false; }
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
        if (!helpComparingValue(getYdaytlequlytotalinv(), otherEntity.getYdaytlequlytotalinv())) { return false; }
        if (!helpComparingValue(getTdayeqytotalinv(), otherEntity.getTdayeqytotalinv())) { return false; }
        if (!helpComparingValue(getCapitemflg(), otherEntity.getCapitemflg())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getDualproductid(), otherEntity.getDualproductid())) { return false; }
        if (!helpComparingValue(getDualitemcd(), otherEntity.getDualitemcd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlDualProductList");
        result = xCH(result, getCenterCd());
        result = xCH(result, getExecutedate());
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
        result = xCH(result, getYdaytlequlytotalinv());
        result = xCH(result, getTdayeqytotalinv());
        result = xCH(result, getCapitemflg());
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getDualproductid());
        result = xCH(result, getDualitemcd());
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
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getExecutedate());
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
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getTdayeqytotalinv());
        sb.append(c).append(getCapitemflg());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getDualproductid());
        sb.append(c).append(getDualitemcd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] EXECUTEDATE: {varchar(8)} <br>
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public String getExecutedate() {
        return _executedate;
    }

    /**
     * [set] EXECUTEDATE: {varchar(8)} <br>
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public void setExecutedate(String executedate) {
        __modifiedProperties.add("executedate");
        this._executedate = executedate;
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
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvkeeplocinv() {
        return _sysinvkeeplocinv;
    }

    /**
     * [set] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvkeeplocinv The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public void setSysinvkeeplocinv(java.math.BigDecimal sysinvkeeplocinv) {
        __modifiedProperties.add("sysinvkeeplocinv");
        this._sysinvkeeplocinv = sysinvkeeplocinv;
    }

    /**
     * [get] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvreceivelocinv() {
        return _sysinvreceivelocinv;
    }

    /**
     * [set] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param sysinvreceivelocinv The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public void setSysinvreceivelocinv(java.math.BigDecimal sysinvreceivelocinv) {
        __modifiedProperties.add("sysinvreceivelocinv");
        this._sysinvreceivelocinv = sysinvreceivelocinv;
    }

    /**
     * [get] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvdamageitem() {
        return _sysinvdamageitem;
    }

    /**
     * [set] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @param sysinvdamageitem The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public void setSysinvdamageitem(java.math.BigDecimal sysinvdamageitem) {
        __modifiedProperties.add("sysinvdamageitem");
        this._sysinvdamageitem = sysinvdamageitem;
    }

    /**
     * [get] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvclssifylocinv() {
        return _sysinvclssifylocinv;
    }

    /**
     * [set] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param sysinvclssifylocinv The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setSysinvclssifylocinv(java.math.BigDecimal sysinvclssifylocinv) {
        __modifiedProperties.add("sysinvclssifylocinv");
        this._sysinvclssifylocinv = sysinvclssifylocinv;
    }

    /**
     * [get] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtmplocinv() {
        return _sysinvtmplocinv;
    }

    /**
     * [set] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvtmplocinv The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public void setSysinvtmplocinv(java.math.BigDecimal sysinvtmplocinv) {
        __modifiedProperties.add("sysinvtmplocinv");
        this._sysinvtmplocinv = sysinvtmplocinv;
    }

    /**
     * [get] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvautoinv() {
        return _sysinvautoinv;
    }

    /**
     * [set] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @param sysinvautoinv The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public void setSysinvautoinv(java.math.BigDecimal sysinvautoinv) {
        __modifiedProperties.add("sysinvautoinv");
        this._sysinvautoinv = sysinvautoinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        __modifiedProperties.add("tdayeqytotalinv");
        this._tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] CAPITEMFLG: {bigint(19)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public String getCapitemflg() {
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {bigint(19)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public void setCapitemflg(String capitemflg) {
        __modifiedProperties.add("capitemflg");
        this._capitemflg = capitemflg;
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
     * [get] DUALPRODUCTID: {bigint(19)} <br>
     * @return The value of the column 'DUALPRODUCTID'. (NullAllowed)
     */
    public Long getDualproductid() {
        return _dualproductid;
    }

    /**
     * [set] DUALPRODUCTID: {bigint(19)} <br>
     * @param dualproductid The value of the column 'DUALPRODUCTID'. (NullAllowed)
     */
    public void setDualproductid(Long dualproductid) {
        __modifiedProperties.add("dualproductid");
        this._dualproductid = dualproductid;
    }

    /**
     * [get] DUALITEMCD: {varchar(8)} <br>
     * @return The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public String getDualitemcd() {
        return _dualitemcd;
    }

    /**
     * [set] DUALITEMCD: {varchar(8)} <br>
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public void setDualitemcd(String dualitemcd) {
        __modifiedProperties.add("dualitemcd");
        this._dualitemcd = dualitemcd;
    }

}
