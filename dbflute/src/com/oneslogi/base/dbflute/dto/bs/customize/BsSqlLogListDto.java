package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlLogList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MESSAGE_NM, DICT_NM, PROCESS_START_DT, PROCESS_END_DT, LOG_GROUP_CD, LOG_ID, LOG_GROUP_NM, PGM_CD, PGM_NM, ATTRIBUTE1, CENTER_NM, ATTRIBUTE2, CLIENT_NM, ATTRIBUTE3, ATTRIBUTE3_NM, ATTRIBUTE4, ATTRIBUTE4_NM, ATTRIBUTE5, ATTRIBUTE5_NM
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
public abstract class BsSqlLogListDto implements Serializable {

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
    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** DICT_NM: {varchar(100)} */
    @JsonKey
    protected String _dictNm;

    /** PROCESS_START_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processStartDt;

    /** PROCESS_END_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processEndDt;

    /** LOG_GROUP_CD: {varchar(100)} */
    @JsonKey
    protected String _logGroupCd;

    /** LOG_ID: {bigint(19)} */
    @JsonKey
    protected Long _logId;

    /** LOG_GROUP_NM: {varchar(4000)} */
    @JsonKey
    protected String _logGroupNm;

    /** PGM_CD: {varchar(100)} */
    @JsonKey
    protected String _pgmCd;

    /** PGM_NM: {varchar(4000)} */
    @JsonKey
    protected String _pgmNm;

    /** ATTRIBUTE1: {varchar(100)} */
    @JsonKey
    protected String _attribute1;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** ATTRIBUTE2: {varchar(100)} */
    @JsonKey
    protected String _attribute2;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** ATTRIBUTE3: {varchar(100)} */
    @JsonKey
    protected String _attribute3;

    /** ATTRIBUTE3_NM: {varchar(1)} */
    @JsonKey
    protected String _attribute3Nm;

    /** ATTRIBUTE4: {varchar(100)} */
    @JsonKey
    protected String _attribute4;

    /** ATTRIBUTE4_NM: {varchar(1)} */
    @JsonKey
    protected String _attribute4Nm;

    /** ATTRIBUTE5: {varchar(100)} */
    @JsonKey
    protected String _attribute5;

    /** ATTRIBUTE5_NM: {varchar(1)} */
    @JsonKey
    protected String _attribute5Nm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlLogListDto() {
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
        if (other == null || !(other instanceof BsSqlLogListDto)) { return false; }
        final BsSqlLogListDto otherEntity = (BsSqlLogListDto)other;
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getDictNm(), otherEntity.getDictNm())) { return false; }
        if (!helpComparingValue(getProcessStartDt(), otherEntity.getProcessStartDt())) { return false; }
        if (!helpComparingValue(getProcessEndDt(), otherEntity.getProcessEndDt())) { return false; }
        if (!helpComparingValue(getLogGroupCd(), otherEntity.getLogGroupCd())) { return false; }
        if (!helpComparingValue(getLogId(), otherEntity.getLogId())) { return false; }
        if (!helpComparingValue(getLogGroupNm(), otherEntity.getLogGroupNm())) { return false; }
        if (!helpComparingValue(getPgmCd(), otherEntity.getPgmCd())) { return false; }
        if (!helpComparingValue(getPgmNm(), otherEntity.getPgmNm())) { return false; }
        if (!helpComparingValue(getAttribute1(), otherEntity.getAttribute1())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getAttribute2(), otherEntity.getAttribute2())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getAttribute3(), otherEntity.getAttribute3())) { return false; }
        if (!helpComparingValue(getAttribute3Nm(), otherEntity.getAttribute3Nm())) { return false; }
        if (!helpComparingValue(getAttribute4(), otherEntity.getAttribute4())) { return false; }
        if (!helpComparingValue(getAttribute4Nm(), otherEntity.getAttribute4Nm())) { return false; }
        if (!helpComparingValue(getAttribute5(), otherEntity.getAttribute5())) { return false; }
        if (!helpComparingValue(getAttribute5Nm(), otherEntity.getAttribute5Nm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlLogList");
        result = xCH(result, getMessageNm());
        result = xCH(result, getDictNm());
        result = xCH(result, getProcessStartDt());
        result = xCH(result, getProcessEndDt());
        result = xCH(result, getLogGroupCd());
        result = xCH(result, getLogId());
        result = xCH(result, getLogGroupNm());
        result = xCH(result, getPgmCd());
        result = xCH(result, getPgmNm());
        result = xCH(result, getAttribute1());
        result = xCH(result, getCenterNm());
        result = xCH(result, getAttribute2());
        result = xCH(result, getClientNm());
        result = xCH(result, getAttribute3());
        result = xCH(result, getAttribute3Nm());
        result = xCH(result, getAttribute4());
        result = xCH(result, getAttribute4Nm());
        result = xCH(result, getAttribute5());
        result = xCH(result, getAttribute5Nm());
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
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getDictNm());
        sb.append(c).append(getProcessStartDt());
        sb.append(c).append(getProcessEndDt());
        sb.append(c).append(getLogGroupCd());
        sb.append(c).append(getLogId());
        sb.append(c).append(getLogGroupNm());
        sb.append(c).append(getPgmCd());
        sb.append(c).append(getPgmNm());
        sb.append(c).append(getAttribute1());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getAttribute2());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getAttribute3());
        sb.append(c).append(getAttribute3Nm());
        sb.append(c).append(getAttribute4());
        sb.append(c).append(getAttribute4Nm());
        sb.append(c).append(getAttribute5());
        sb.append(c).append(getAttribute5Nm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] DICT_NM: {varchar(100)} <br>
     * @return The value of the column 'DICT_NM'. (NullAllowed)
     */
    public String getDictNm() {
        return _dictNm;
    }

    /**
     * [set] DICT_NM: {varchar(100)} <br>
     * @param dictNm The value of the column 'DICT_NM'. (NullAllowed)
     */
    public void setDictNm(String dictNm) {
        __modifiedProperties.add("dictNm");
        this._dictNm = dictNm;
    }

    /**
     * [get] PROCESS_START_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PROCESS_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcessStartDt() {
        return _processStartDt;
    }

    /**
     * [set] PROCESS_START_DT: {datetime2(26, 6)} <br>
     * @param processStartDt The value of the column 'PROCESS_START_DT'. (NullAllowed)
     */
    public void setProcessStartDt(java.sql.Timestamp processStartDt) {
        __modifiedProperties.add("processStartDt");
        this._processStartDt = processStartDt;
    }

    /**
     * [get] PROCESS_END_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PROCESS_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcessEndDt() {
        return _processEndDt;
    }

    /**
     * [set] PROCESS_END_DT: {datetime2(26, 6)} <br>
     * @param processEndDt The value of the column 'PROCESS_END_DT'. (NullAllowed)
     */
    public void setProcessEndDt(java.sql.Timestamp processEndDt) {
        __modifiedProperties.add("processEndDt");
        this._processEndDt = processEndDt;
    }

    /**
     * [get] LOG_GROUP_CD: {varchar(100)} <br>
     * @return The value of the column 'LOG_GROUP_CD'. (NullAllowed)
     */
    public String getLogGroupCd() {
        return _logGroupCd;
    }

    /**
     * [set] LOG_GROUP_CD: {varchar(100)} <br>
     * @param logGroupCd The value of the column 'LOG_GROUP_CD'. (NullAllowed)
     */
    public void setLogGroupCd(String logGroupCd) {
        __modifiedProperties.add("logGroupCd");
        this._logGroupCd = logGroupCd;
    }

    /**
     * [get] LOG_ID: {bigint(19)} <br>
     * @return The value of the column 'LOG_ID'. (NullAllowed)
     */
    public Long getLogId() {
        return _logId;
    }

    /**
     * [set] LOG_ID: {bigint(19)} <br>
     * @param logId The value of the column 'LOG_ID'. (NullAllowed)
     */
    public void setLogId(Long logId) {
        __modifiedProperties.add("logId");
        this._logId = logId;
    }

    /**
     * [get] LOG_GROUP_NM: {varchar(4000)} <br>
     * @return The value of the column 'LOG_GROUP_NM'. (NullAllowed)
     */
    public String getLogGroupNm() {
        return _logGroupNm;
    }

    /**
     * [set] LOG_GROUP_NM: {varchar(4000)} <br>
     * @param logGroupNm The value of the column 'LOG_GROUP_NM'. (NullAllowed)
     */
    public void setLogGroupNm(String logGroupNm) {
        __modifiedProperties.add("logGroupNm");
        this._logGroupNm = logGroupNm;
    }

    /**
     * [get] PGM_CD: {varchar(100)} <br>
     * @return The value of the column 'PGM_CD'. (NullAllowed)
     */
    public String getPgmCd() {
        return _pgmCd;
    }

    /**
     * [set] PGM_CD: {varchar(100)} <br>
     * @param pgmCd The value of the column 'PGM_CD'. (NullAllowed)
     */
    public void setPgmCd(String pgmCd) {
        __modifiedProperties.add("pgmCd");
        this._pgmCd = pgmCd;
    }

    /**
     * [get] PGM_NM: {varchar(4000)} <br>
     * @return The value of the column 'PGM_NM'. (NullAllowed)
     */
    public String getPgmNm() {
        return _pgmNm;
    }

    /**
     * [set] PGM_NM: {varchar(4000)} <br>
     * @param pgmNm The value of the column 'PGM_NM'. (NullAllowed)
     */
    public void setPgmNm(String pgmNm) {
        __modifiedProperties.add("pgmNm");
        this._pgmNm = pgmNm;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public String getAttribute1() {
        return _attribute1;
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public void setAttribute1(String attribute1) {
        __modifiedProperties.add("attribute1");
        this._attribute1 = attribute1;
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
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public String getAttribute2() {
        return _attribute2;
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public void setAttribute2(String attribute2) {
        __modifiedProperties.add("attribute2");
        this._attribute2 = attribute2;
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
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public String getAttribute3() {
        return _attribute3;
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public void setAttribute3(String attribute3) {
        __modifiedProperties.add("attribute3");
        this._attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE3_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE3_NM'. (NullAllowed)
     */
    public String getAttribute3Nm() {
        return _attribute3Nm;
    }

    /**
     * [set] ATTRIBUTE3_NM: {varchar(1)} <br>
     * @param attribute3Nm The value of the column 'ATTRIBUTE3_NM'. (NullAllowed)
     */
    public void setAttribute3Nm(String attribute3Nm) {
        __modifiedProperties.add("attribute3Nm");
        this._attribute3Nm = attribute3Nm;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public String getAttribute4() {
        return _attribute4;
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public void setAttribute4(String attribute4) {
        __modifiedProperties.add("attribute4");
        this._attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE4_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE4_NM'. (NullAllowed)
     */
    public String getAttribute4Nm() {
        return _attribute4Nm;
    }

    /**
     * [set] ATTRIBUTE4_NM: {varchar(1)} <br>
     * @param attribute4Nm The value of the column 'ATTRIBUTE4_NM'. (NullAllowed)
     */
    public void setAttribute4Nm(String attribute4Nm) {
        __modifiedProperties.add("attribute4Nm");
        this._attribute4Nm = attribute4Nm;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public String getAttribute5() {
        return _attribute5;
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public void setAttribute5(String attribute5) {
        __modifiedProperties.add("attribute5");
        this._attribute5 = attribute5;
    }

    /**
     * [get] ATTRIBUTE5_NM: {varchar(1)} <br>
     * @return The value of the column 'ATTRIBUTE5_NM'. (NullAllowed)
     */
    public String getAttribute5Nm() {
        return _attribute5Nm;
    }

    /**
     * [set] ATTRIBUTE5_NM: {varchar(1)} <br>
     * @param attribute5Nm The value of the column 'ATTRIBUTE5_NM'. (NullAllowed)
     */
    public void setAttribute5Nm(String attribute5Nm) {
        __modifiedProperties.add("attribute5Nm");
        this._attribute5Nm = attribute5Nm;
    }

}
