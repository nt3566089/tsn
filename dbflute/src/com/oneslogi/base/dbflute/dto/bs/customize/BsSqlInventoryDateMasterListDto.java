package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryDateMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFINVOPERATION_ID, TARGET_DATE, TARGET_DATE_EDIT, SUNDAY_FLG_NM, SUNDAY_FLG, INV_DATE, INV_DATE_EDIT, UPD_DT, UPD_USER, USER_NM
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
public abstract class BsSqlInventoryDateMasterListDto implements Serializable {

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

    /** TARGET_DATE: {varchar(8)} */
    @JsonKey
    protected String _targetDate;

    /** TARGET_DATE_EDIT: {int(10)} */
    @JsonKey
    protected String _targetDateEdit;

    /** SUNDAY_FLG_NM: {int(10)} */
    @JsonKey
    protected String _sundayFlgNm;

    /** SUNDAY_FLG: {char(1)} */
    @JsonKey
    protected String _sundayFlg;

    /** INV_DATE: {varchar(8)} */
    @JsonKey
    protected String _invDate;

    /** INV_DATE_EDIT: {int(10)} */
    @JsonKey
    protected String _invDateEdit;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryDateMasterListDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryDateMasterListDto)) { return false; }
        final BsSqlInventoryDateMasterListDto otherEntity = (BsSqlInventoryDateMasterListDto)other;
        if (!helpComparingValue(getMfinvoperationId(), otherEntity.getMfinvoperationId())) { return false; }
        if (!helpComparingValue(getTargetDate(), otherEntity.getTargetDate())) { return false; }
        if (!helpComparingValue(getTargetDateEdit(), otherEntity.getTargetDateEdit())) { return false; }
        if (!helpComparingValue(getSundayFlgNm(), otherEntity.getSundayFlgNm())) { return false; }
        if (!helpComparingValue(getSundayFlg(), otherEntity.getSundayFlg())) { return false; }
        if (!helpComparingValue(getInvDate(), otherEntity.getInvDate())) { return false; }
        if (!helpComparingValue(getInvDateEdit(), otherEntity.getInvDateEdit())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryDateMasterList");
        result = xCH(result, getMfinvoperationId());
        result = xCH(result, getTargetDate());
        result = xCH(result, getTargetDateEdit());
        result = xCH(result, getSundayFlgNm());
        result = xCH(result, getSundayFlg());
        result = xCH(result, getInvDate());
        result = xCH(result, getInvDateEdit());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUserNm());
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
        sb.append(c).append(getTargetDate());
        sb.append(c).append(getTargetDateEdit());
        sb.append(c).append(getSundayFlgNm());
        sb.append(c).append(getSundayFlg());
        sb.append(c).append(getInvDate());
        sb.append(c).append(getInvDateEdit());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUserNm());
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
    public String getTargetDateEdit() {
        return _targetDateEdit;
    }

    /**
     * [set] TARGET_DATE_EDIT: {int(10)} <br>
     * @param targetDateEdit The value of the column 'TARGET_DATE_EDIT'. (NullAllowed)
     */
    public void setTargetDateEdit(String targetDateEdit) {
        __modifiedProperties.add("targetDateEdit");
        this._targetDateEdit = targetDateEdit;
    }

    /**
     * [get] SUNDAY_FLG_NM: {int(10)} <br>
     * @return The value of the column 'SUNDAY_FLG_NM'. (NullAllowed)
     */
    public String getSundayFlgNm() {
        return _sundayFlgNm;
    }

    /**
     * [set] SUNDAY_FLG_NM: {int(10)} <br>
     * @param sundayFlgNm The value of the column 'SUNDAY_FLG_NM'. (NullAllowed)
     */
    public void setSundayFlgNm(String sundayFlgNm) {
        __modifiedProperties.add("sundayFlgNm");
        this._sundayFlgNm = sundayFlgNm;
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
    public String getInvDateEdit() {
        return _invDateEdit;
    }

    /**
     * [set] INV_DATE_EDIT: {int(10)} <br>
     * @param invDateEdit The value of the column 'INV_DATE_EDIT'. (NullAllowed)
     */
    public void setInvDateEdit(String invDateEdit) {
        __modifiedProperties.add("invDateEdit");
        this._invDateEdit = invDateEdit;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

}
