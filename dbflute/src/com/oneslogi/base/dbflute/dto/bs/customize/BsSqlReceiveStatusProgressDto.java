package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlReceiveStatusProgress. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, RECEIVE_STATUS, RECEIVE_STATUS_NM, RECEIVE_CNT, NUM
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
public abstract class BsSqlReceiveStatusProgressDto implements Serializable {

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

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** RECEIVE_STATUS: {varchar(30)} */
    @JsonKey
    protected String _receiveStatus;

    /** RECEIVE_STATUS_NM: {int(10)} */
    @JsonKey
    protected String _receiveStatusNm;

    /** RECEIVE_CNT: {int(10)} */
    @JsonKey
    protected Long _receiveCnt;

    /** NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _num;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlReceiveStatusProgressDto() {
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
        if (other == null || !(other instanceof BsSqlReceiveStatusProgressDto)) { return false; }
        final BsSqlReceiveStatusProgressDto otherEntity = (BsSqlReceiveStatusProgressDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getReceiveStatus(), otherEntity.getReceiveStatus())) { return false; }
        if (!helpComparingValue(getReceiveStatusNm(), otherEntity.getReceiveStatusNm())) { return false; }
        if (!helpComparingValue(getReceiveCnt(), otherEntity.getReceiveCnt())) { return false; }
        if (!helpComparingValue(getNum(), otherEntity.getNum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlReceiveStatusProgress");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getReceiveStatus());
        result = xCH(result, getReceiveStatusNm());
        result = xCH(result, getReceiveCnt());
        result = xCH(result, getNum());
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
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getReceiveStatus());
        sb.append(c).append(getReceiveStatusNm());
        sb.append(c).append(getReceiveCnt());
        sb.append(c).append(getNum());
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

    /**
     * [get] RECEIVE_STATUS: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public String getReceiveStatus() {
        return _receiveStatus;
    }

    /**
     * [set] RECEIVE_STATUS: {varchar(30)} <br>
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public void setReceiveStatus(String receiveStatus) {
        __modifiedProperties.add("receiveStatus");
        this._receiveStatus = receiveStatus;
    }

    /**
     * [get] RECEIVE_STATUS_NM: {int(10)} <br>
     * @return The value of the column 'RECEIVE_STATUS_NM'. (NullAllowed)
     */
    public String getReceiveStatusNm() {
        return _receiveStatusNm;
    }

    /**
     * [set] RECEIVE_STATUS_NM: {int(10)} <br>
     * @param receiveStatusNm The value of the column 'RECEIVE_STATUS_NM'. (NullAllowed)
     */
    public void setReceiveStatusNm(String receiveStatusNm) {
        __modifiedProperties.add("receiveStatusNm");
        this._receiveStatusNm = receiveStatusNm;
    }

    /**
     * [get] RECEIVE_CNT: {int(10)} <br>
     * @return The value of the column 'RECEIVE_CNT'. (NullAllowed)
     */
    public Long getReceiveCnt() {
        return _receiveCnt;
    }

    /**
     * [set] RECEIVE_CNT: {int(10)} <br>
     * @param receiveCnt The value of the column 'RECEIVE_CNT'. (NullAllowed)
     */
    public void setReceiveCnt(Long receiveCnt) {
        __modifiedProperties.add("receiveCnt");
        this._receiveCnt = receiveCnt;
    }

    /**
     * [get] NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getNum() {
        return _num;
    }

    /**
     * [set] NUM: {decimal(38, 6)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(java.math.BigDecimal num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

}
