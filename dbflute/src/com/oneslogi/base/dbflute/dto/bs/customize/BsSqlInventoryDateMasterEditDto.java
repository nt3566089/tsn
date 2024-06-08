package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryDateMasterEdit. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFINVOPERATION_ID, CENTER_ID, CENTER_CD, CLIENT_ID, CLIENT_CD, TARGET_DATE, TARGET_DATE_EDIT, SUNDAY_FLG, INV_DATE, INV_DATE_EDIT, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlInventoryDateMasterEditDto implements Serializable {

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
    /** MFINVOPERATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfinvoperationId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** TARGET_DATE: {varchar(8)} */
    @JsonKey
    protected String _targetDate;

    /** TARGET_DATE_EDIT: {int(10)} */
    @JsonKey
    protected Integer _targetDateEdit;

    /** SUNDAY_FLG: {char(1)} */
    @JsonKey
    protected String _sundayFlg;

    /** INV_DATE: {varchar(8)} */
    @JsonKey
    protected String _invDate;

    /** INV_DATE_EDIT: {int(10)} */
    @JsonKey
    protected Integer _invDateEdit;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryDateMasterEditDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryDateMasterEditDto)) { return false; }
        final BsSqlInventoryDateMasterEditDto otherEntity = (BsSqlInventoryDateMasterEditDto)other;
        if (!helpComparingValue(getMfinvoperationId(), otherEntity.getMfinvoperationId())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getTargetDate(), otherEntity.getTargetDate())) { return false; }
        if (!helpComparingValue(getTargetDateEdit(), otherEntity.getTargetDateEdit())) { return false; }
        if (!helpComparingValue(getSundayFlg(), otherEntity.getSundayFlg())) { return false; }
        if (!helpComparingValue(getInvDate(), otherEntity.getInvDate())) { return false; }
        if (!helpComparingValue(getInvDateEdit(), otherEntity.getInvDateEdit())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryDateMasterEdit");
        result = xCH(result, getMfinvoperationId());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getTargetDate());
        result = xCH(result, getTargetDateEdit());
        result = xCH(result, getSundayFlg());
        result = xCH(result, getInvDate());
        result = xCH(result, getInvDateEdit());
        result = xCH(result, getVersionNo());
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
        sb.append(c).append(getMfinvoperationId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getTargetDate());
        sb.append(c).append(getTargetDateEdit());
        sb.append(c).append(getSundayFlg());
        sb.append(c).append(getInvDate());
        sb.append(c).append(getInvDateEdit());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFINVOPERATION_ID: {bigint(19)} <br>
     * @return The value of the column 'MFINVOPERATION_ID'. (NullAllowed)
     */
    public Long getMfinvoperationId() {
        return _mfinvoperationId;
    }

    /**
     * [set] MFINVOPERATION_ID: {bigint(19)} <br>
     * @param mfinvoperationId The value of the column 'MFINVOPERATION_ID'. (NullAllowed)
     */
    public void setMfinvoperationId(Long mfinvoperationId) {
        __modifiedProperties.add("mfinvoperationId");
        this._mfinvoperationId = mfinvoperationId;
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
     * [get] TARGET_DATE: {varchar(8)} <br>
     * @return The value of the column 'TARGET_DATE'. (NullAllowed)
     */
    public String getTargetDate() {
        return _targetDate;
    }

    /**
     * [set] TARGET_DATE: {varchar(8)} <br>
     * @param targetDate The value of the column 'TARGET_DATE'. (NullAllowed)
     */
    public void setTargetDate(String targetDate) {
        __modifiedProperties.add("targetDate");
        this._targetDate = targetDate;
    }

    /**
     * [get] TARGET_DATE_EDIT: {int(10)} <br>
     * @return The value of the column 'TARGET_DATE_EDIT'. (NullAllowed)
     */
    public Integer getTargetDateEdit() {
        return _targetDateEdit;
    }

    /**
     * [set] TARGET_DATE_EDIT: {int(10)} <br>
     * @param targetDateEdit The value of the column 'TARGET_DATE_EDIT'. (NullAllowed)
     */
    public void setTargetDateEdit(Integer targetDateEdit) {
        __modifiedProperties.add("targetDateEdit");
        this._targetDateEdit = targetDateEdit;
    }

    /**
     * [get] SUNDAY_FLG: {char(1)} <br>
     * @return The value of the column 'SUNDAY_FLG'. (NullAllowed)
     */
    public String getSundayFlg() {
        return _sundayFlg;
    }

    /**
     * [set] SUNDAY_FLG: {char(1)} <br>
     * @param sundayFlg The value of the column 'SUNDAY_FLG'. (NullAllowed)
     */
    public void setSundayFlg(String sundayFlg) {
        __modifiedProperties.add("sundayFlg");
        this._sundayFlg = sundayFlg;
    }

    /**
     * [get] INV_DATE: {varchar(8)} <br>
     * @return The value of the column 'INV_DATE'. (NullAllowed)
     */
    public String getInvDate() {
        return _invDate;
    }

    /**
     * [set] INV_DATE: {varchar(8)} <br>
     * @param invDate The value of the column 'INV_DATE'. (NullAllowed)
     */
    public void setInvDate(String invDate) {
        __modifiedProperties.add("invDate");
        this._invDate = invDate;
    }

    /**
     * [get] INV_DATE_EDIT: {int(10)} <br>
     * @return The value of the column 'INV_DATE_EDIT'. (NullAllowed)
     */
    public Integer getInvDateEdit() {
        return _invDateEdit;
    }

    /**
     * [set] INV_DATE_EDIT: {int(10)} <br>
     * @param invDateEdit The value of the column 'INV_DATE_EDIT'. (NullAllowed)
     */
    public void setInvDateEdit(Integer invDateEdit) {
        __modifiedProperties.add("invDateEdit");
        this._invDateEdit = invDateEdit;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
