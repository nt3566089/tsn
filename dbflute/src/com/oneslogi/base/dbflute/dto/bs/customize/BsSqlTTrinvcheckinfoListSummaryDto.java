package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTTrinvcheckinfoListSummary. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, EXECUTEDATE, INOUTKBN, DUALITEMCD, CENTER_ID, CLIENT_ID, DUALPRODUCTID, CAPITEMFLG, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, TDAYEQYTOTALINV
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
public abstract class BsSqlTTrinvcheckinfoListSummaryDto implements Serializable {

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

    /** DUALITEMCD: {nvarchar(8)} */
    @JsonKey
    protected String _dualitemcd;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** DUALPRODUCTID: {bigint(19)} */
    @JsonKey
    protected Long _dualproductid;

    /** CAPITEMFLG: {bigint(19)} */
    @JsonKey
    protected String _capitemflg;

    /** SYSINVTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

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

    /** YDAYTLEQULYTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAYEQYTOTALINV: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytotalinv;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTTrinvcheckinfoListSummaryDto() {
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
        if (other == null || !(other instanceof BsSqlTTrinvcheckinfoListSummaryDto)) { return false; }
        final BsSqlTTrinvcheckinfoListSummaryDto otherEntity = (BsSqlTTrinvcheckinfoListSummaryDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getExecutedate(), otherEntity.getExecutedate())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getDualitemcd(), otherEntity.getDualitemcd())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getDualproductid(), otherEntity.getDualproductid())) { return false; }
        if (!helpComparingValue(getCapitemflg(), otherEntity.getCapitemflg())) { return false; }
        if (!helpComparingValue(getSysinvtotalinv(), otherEntity.getSysinvtotalinv())) { return false; }
        if (!helpComparingValue(getInvesttotalinv(), otherEntity.getInvesttotalinv())) { return false; }
        if (!helpComparingValue(getInvestkeeplocinv(), otherEntity.getInvestkeeplocinv())) { return false; }
        if (!helpComparingValue(getInvestreceivelocinv(), otherEntity.getInvestreceivelocinv())) { return false; }
        if (!helpComparingValue(getInvestdamageitem(), otherEntity.getInvestdamageitem())) { return false; }
        if (!helpComparingValue(getInvestclssifylocinv(), otherEntity.getInvestclssifylocinv())) { return false; }
        if (!helpComparingValue(getInvesttmplocinv(), otherEntity.getInvesttmplocinv())) { return false; }
        if (!helpComparingValue(getInvestautoinv(), otherEntity.getInvestautoinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlytotalinv(), otherEntity.getYdaytlequlytotalinv())) { return false; }
        if (!helpComparingValue(getTdayeqytotalinv(), otherEntity.getTdayeqytotalinv())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTTrinvcheckinfoListSummary");
        result = xCH(result, getCenterCd());
        result = xCH(result, getExecutedate());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getDualitemcd());
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getDualproductid());
        result = xCH(result, getCapitemflg());
        result = xCH(result, getSysinvtotalinv());
        result = xCH(result, getInvesttotalinv());
        result = xCH(result, getInvestkeeplocinv());
        result = xCH(result, getInvestreceivelocinv());
        result = xCH(result, getInvestdamageitem());
        result = xCH(result, getInvestclssifylocinv());
        result = xCH(result, getInvesttmplocinv());
        result = xCH(result, getInvestautoinv());
        result = xCH(result, getYdaytlequlytotalinv());
        result = xCH(result, getTdayeqytotalinv());
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
        sb.append(c).append(getDualitemcd());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getDualproductid());
        sb.append(c).append(getCapitemflg());
        sb.append(c).append(getSysinvtotalinv());
        sb.append(c).append(getInvesttotalinv());
        sb.append(c).append(getInvestkeeplocinv());
        sb.append(c).append(getInvestreceivelocinv());
        sb.append(c).append(getInvestdamageitem());
        sb.append(c).append(getInvestclssifylocinv());
        sb.append(c).append(getInvesttmplocinv());
        sb.append(c).append(getInvestautoinv());
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getTdayeqytotalinv());
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
     * [get] DUALITEMCD: {nvarchar(8)} <br>
     * @return The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public String getDualitemcd() {
        return _dualitemcd;
    }

    /**
     * [set] DUALITEMCD: {nvarchar(8)} <br>
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public void setDualitemcd(String dualitemcd) {
        __modifiedProperties.add("dualitemcd");
        this._dualitemcd = dualitemcd;
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

}
