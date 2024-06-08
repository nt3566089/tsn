package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlAllocateControlMasterLast. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PICKFRDATE, PICKTODATE, VALIDTYPE, VERSION_NO
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
public abstract class BsSqlAllocateControlMasterLastDto implements Serializable {

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
    /** MFPICKCTL_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfpickctlId;

    /** PICKFRDATE: {varchar(8)} */
    @JsonKey
    protected String _pickfrdate;

    /** PICKTODATE: {varchar(8)} */
    @JsonKey
    protected String _picktodate;

    /** VALIDTYPE: {varchar(30)} */
    @JsonKey
    protected String _validtype;

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
    public BsSqlAllocateControlMasterLastDto() {
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
        if (other == null || !(other instanceof BsSqlAllocateControlMasterLastDto)) { return false; }
        final BsSqlAllocateControlMasterLastDto otherEntity = (BsSqlAllocateControlMasterLastDto)other;
        if (!helpComparingValue(getMfpickctlId(), otherEntity.getMfpickctlId())) { return false; }
        if (!helpComparingValue(getPickfrdate(), otherEntity.getPickfrdate())) { return false; }
        if (!helpComparingValue(getPicktodate(), otherEntity.getPicktodate())) { return false; }
        if (!helpComparingValue(getValidtype(), otherEntity.getValidtype())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlAllocateControlMasterLast");
        result = xCH(result, getMfpickctlId());
        result = xCH(result, getPickfrdate());
        result = xCH(result, getPicktodate());
        result = xCH(result, getValidtype());
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
        sb.append(c).append(getMfpickctlId());
        sb.append(c).append(getPickfrdate());
        sb.append(c).append(getPicktodate());
        sb.append(c).append(getValidtype());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFPICKCTL_ID: {bigint(19)} <br>
     * @return The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public Long getMfpickctlId() {
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {bigint(19)} <br>
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        __modifiedProperties.add("mfpickctlId");
        this._mfpickctlId = mfpickctlId;
    }

    /**
     * [get] PICKFRDATE: {varchar(8)} <br>
     * @return The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public String getPickfrdate() {
        return _pickfrdate;
    }

    /**
     * [set] PICKFRDATE: {varchar(8)} <br>
     * @param pickfrdate The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public void setPickfrdate(String pickfrdate) {
        __modifiedProperties.add("pickfrdate");
        this._pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {varchar(8)} <br>
     * @return The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public String getPicktodate() {
        return _picktodate;
    }

    /**
     * [set] PICKTODATE: {varchar(8)} <br>
     * @param picktodate The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public void setPicktodate(String picktodate) {
        __modifiedProperties.add("picktodate");
        this._picktodate = picktodate;
    }

    /**
     * [get] VALIDTYPE: {varchar(30)} <br>
     * @return The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public String getValidtype() {
        return _validtype;
    }

    /**
     * [set] VALIDTYPE: {varchar(30)} <br>
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public void setValidtype(String validtype) {
        __modifiedProperties.add("validtype");
        this._validtype = validtype;
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
