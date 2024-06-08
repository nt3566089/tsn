package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryHCorrectList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_H_ID, TRCASEINVENTORY_ID, VERSION_NO_CASE, TRINVCORRECT_ID, PUTDMYCASECD, PUTDMYCUTCASECD, PUTDMYCASEDETAILNO, PUTDMYDIRECTIONNO, PUTDMYDIRECTIONORDERGNO, VERSION_NO_CORRECT
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
public abstract class BsSqlInventoryHCorrectListDto implements Serializable {

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
    /** INVENTORY_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _inventoryHId;

    /** TRCASEINVENTORY_ID: {bigint(19)} */
    @JsonKey
    protected Long _trcaseinventoryId;

    /** VERSION_NO_CASE: {bigint(19)} */
    @JsonKey
    protected Long _versionNoCase;

    /** TRINVCORRECT_ID: {bigint(19)} */
    @JsonKey
    protected Long _trinvcorrectId;

    /** PUTDMYCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _putdmycasecd;

    /** PUTDMYCUTCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _putdmycutcasecd;

    /** PUTDMYCASEDETAILNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmycasedetailno;

    /** PUTDMYDIRECTIONNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmydirectionno;

    /** PUTDMYDIRECTIONORDERGNO: {bigint(19)} */
    @JsonKey
    protected Long _putdmydirectionordergno;

    /** VERSION_NO_CORRECT: {bigint(19)} */
    @JsonKey
    protected Long _versionNoCorrect;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryHCorrectListDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryHCorrectListDto)) { return false; }
        final BsSqlInventoryHCorrectListDto otherEntity = (BsSqlInventoryHCorrectListDto)other;
        if (!helpComparingValue(getInventoryHId(), otherEntity.getInventoryHId())) { return false; }
        if (!helpComparingValue(getTrcaseinventoryId(), otherEntity.getTrcaseinventoryId())) { return false; }
        if (!helpComparingValue(getVersionNoCase(), otherEntity.getVersionNoCase())) { return false; }
        if (!helpComparingValue(getTrinvcorrectId(), otherEntity.getTrinvcorrectId())) { return false; }
        if (!helpComparingValue(getPutdmycasecd(), otherEntity.getPutdmycasecd())) { return false; }
        if (!helpComparingValue(getPutdmycutcasecd(), otherEntity.getPutdmycutcasecd())) { return false; }
        if (!helpComparingValue(getPutdmycasedetailno(), otherEntity.getPutdmycasedetailno())) { return false; }
        if (!helpComparingValue(getPutdmydirectionno(), otherEntity.getPutdmydirectionno())) { return false; }
        if (!helpComparingValue(getPutdmydirectionordergno(), otherEntity.getPutdmydirectionordergno())) { return false; }
        if (!helpComparingValue(getVersionNoCorrect(), otherEntity.getVersionNoCorrect())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryHCorrectList");
        result = xCH(result, getInventoryHId());
        result = xCH(result, getTrcaseinventoryId());
        result = xCH(result, getVersionNoCase());
        result = xCH(result, getTrinvcorrectId());
        result = xCH(result, getPutdmycasecd());
        result = xCH(result, getPutdmycutcasecd());
        result = xCH(result, getPutdmycasedetailno());
        result = xCH(result, getPutdmydirectionno());
        result = xCH(result, getPutdmydirectionordergno());
        result = xCH(result, getVersionNoCorrect());
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
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getTrcaseinventoryId());
        sb.append(c).append(getVersionNoCase());
        sb.append(c).append(getTrinvcorrectId());
        sb.append(c).append(getPutdmycasecd());
        sb.append(c).append(getPutdmycutcasecd());
        sb.append(c).append(getPutdmycasedetailno());
        sb.append(c).append(getPutdmydirectionno());
        sb.append(c).append(getPutdmydirectionordergno());
        sb.append(c).append(getVersionNoCorrect());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_H_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {bigint(19)} <br>
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] TRCASEINVENTORY_ID: {bigint(19)} <br>
     * @return The value of the column 'TRCASEINVENTORY_ID'. (NullAllowed)
     */
    public Long getTrcaseinventoryId() {
        return _trcaseinventoryId;
    }

    /**
     * [set] TRCASEINVENTORY_ID: {bigint(19)} <br>
     * @param trcaseinventoryId The value of the column 'TRCASEINVENTORY_ID'. (NullAllowed)
     */
    public void setTrcaseinventoryId(Long trcaseinventoryId) {
        __modifiedProperties.add("trcaseinventoryId");
        this._trcaseinventoryId = trcaseinventoryId;
    }

    /**
     * [get] VERSION_NO_CASE: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO_CASE'. (NullAllowed)
     */
    public Long getVersionNoCase() {
        return _versionNoCase;
    }

    /**
     * [set] VERSION_NO_CASE: {bigint(19)} <br>
     * @param versionNoCase The value of the column 'VERSION_NO_CASE'. (NullAllowed)
     */
    public void setVersionNoCase(Long versionNoCase) {
        __modifiedProperties.add("versionNoCase");
        this._versionNoCase = versionNoCase;
    }

    /**
     * [get] TRINVCORRECT_ID: {bigint(19)} <br>
     * @return The value of the column 'TRINVCORRECT_ID'. (NullAllowed)
     */
    public Long getTrinvcorrectId() {
        return _trinvcorrectId;
    }

    /**
     * [set] TRINVCORRECT_ID: {bigint(19)} <br>
     * @param trinvcorrectId The value of the column 'TRINVCORRECT_ID'. (NullAllowed)
     */
    public void setTrinvcorrectId(Long trinvcorrectId) {
        __modifiedProperties.add("trinvcorrectId");
        this._trinvcorrectId = trinvcorrectId;
    }

    /**
     * [get] PUTDMYCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'PUTDMYCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getPutdmycasecd() {
        return _putdmycasecd;
    }

    /**
     * [set] PUTDMYCASECD: {decimal(16, 6)} <br>
     * @param putdmycasecd The value of the column 'PUTDMYCASECD'. (NullAllowed)
     */
    public void setPutdmycasecd(java.math.BigDecimal putdmycasecd) {
        __modifiedProperties.add("putdmycasecd");
        this._putdmycasecd = putdmycasecd;
    }

    /**
     * [get] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'PUTDMYCUTCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getPutdmycutcasecd() {
        return _putdmycutcasecd;
    }

    /**
     * [set] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * @param putdmycutcasecd The value of the column 'PUTDMYCUTCASECD'. (NullAllowed)
     */
    public void setPutdmycutcasecd(java.math.BigDecimal putdmycutcasecd) {
        __modifiedProperties.add("putdmycutcasecd");
        this._putdmycutcasecd = putdmycutcasecd;
    }

    /**
     * [get] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed)
     */
    public Long getPutdmycasedetailno() {
        return _putdmycasedetailno;
    }

    /**
     * [set] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * @param putdmycasedetailno The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed)
     */
    public void setPutdmycasedetailno(Long putdmycasedetailno) {
        __modifiedProperties.add("putdmycasedetailno");
        this._putdmycasedetailno = putdmycasedetailno;
    }

    /**
     * [get] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed)
     */
    public Long getPutdmydirectionno() {
        return _putdmydirectionno;
    }

    /**
     * [set] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * @param putdmydirectionno The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed)
     */
    public void setPutdmydirectionno(Long putdmydirectionno) {
        __modifiedProperties.add("putdmydirectionno");
        this._putdmydirectionno = putdmydirectionno;
    }

    /**
     * [get] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed)
     */
    public Long getPutdmydirectionordergno() {
        return _putdmydirectionordergno;
    }

    /**
     * [set] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * @param putdmydirectionordergno The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed)
     */
    public void setPutdmydirectionordergno(Long putdmydirectionordergno) {
        __modifiedProperties.add("putdmydirectionordergno");
        this._putdmydirectionordergno = putdmydirectionordergno;
    }

    /**
     * [get] VERSION_NO_CORRECT: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO_CORRECT'. (NullAllowed)
     */
    public Long getVersionNoCorrect() {
        return _versionNoCorrect;
    }

    /**
     * [set] VERSION_NO_CORRECT: {bigint(19)} <br>
     * @param versionNoCorrect The value of the column 'VERSION_NO_CORRECT'. (NullAllowed)
     */
    public void setVersionNoCorrect(Long versionNoCorrect) {
        __modifiedProperties.add("versionNoCorrect");
        this._versionNoCorrect = versionNoCorrect;
    }

}
