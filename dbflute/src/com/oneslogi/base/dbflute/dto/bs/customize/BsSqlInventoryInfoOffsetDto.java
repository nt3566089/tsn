package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryInfoOffset. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     HEADID, INFOID, INFOVERSION, OFFSETID, OFFSETCASECD, OFFSETCUTCASECD, OFFSETDTLNO, OFFSETINSTNO, OFFSETINSTBRANCHNO, OFFSETVERSION
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
public abstract class BsSqlInventoryInfoOffsetDto implements Serializable {

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
    /** HEADID: {bigint(19)} */
    @JsonKey
    protected Long _headid;

    /** INFOID: {bigint(19)} */
    @JsonKey
    protected Long _infoid;

    /** INFOVERSION: {bigint(19)} */
    @JsonKey
    protected Long _infoversion;

    /** OFFSETID: {bigint(19)} */
    @JsonKey
    protected Long _offsetid;

    /** OFFSETCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _offsetcasecd;

    /** OFFSETCUTCASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _offsetcutcasecd;

    /** OFFSETDTLNO: {bigint(19)} */
    @JsonKey
    protected Long _offsetdtlno;

    /** OFFSETINSTNO: {bigint(19)} */
    @JsonKey
    protected Long _offsetinstno;

    /** OFFSETINSTBRANCHNO: {bigint(19)} */
    @JsonKey
    protected Long _offsetinstbranchno;

    /** OFFSETVERSION: {bigint(19)} */
    @JsonKey
    protected Long _offsetversion;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryInfoOffsetDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryInfoOffsetDto)) { return false; }
        final BsSqlInventoryInfoOffsetDto otherEntity = (BsSqlInventoryInfoOffsetDto)other;
        if (!helpComparingValue(getHeadid(), otherEntity.getHeadid())) { return false; }
        if (!helpComparingValue(getInfoid(), otherEntity.getInfoid())) { return false; }
        if (!helpComparingValue(getInfoversion(), otherEntity.getInfoversion())) { return false; }
        if (!helpComparingValue(getOffsetid(), otherEntity.getOffsetid())) { return false; }
        if (!helpComparingValue(getOffsetcasecd(), otherEntity.getOffsetcasecd())) { return false; }
        if (!helpComparingValue(getOffsetcutcasecd(), otherEntity.getOffsetcutcasecd())) { return false; }
        if (!helpComparingValue(getOffsetdtlno(), otherEntity.getOffsetdtlno())) { return false; }
        if (!helpComparingValue(getOffsetinstno(), otherEntity.getOffsetinstno())) { return false; }
        if (!helpComparingValue(getOffsetinstbranchno(), otherEntity.getOffsetinstbranchno())) { return false; }
        if (!helpComparingValue(getOffsetversion(), otherEntity.getOffsetversion())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryInfoOffset");
        result = xCH(result, getHeadid());
        result = xCH(result, getInfoid());
        result = xCH(result, getInfoversion());
        result = xCH(result, getOffsetid());
        result = xCH(result, getOffsetcasecd());
        result = xCH(result, getOffsetcutcasecd());
        result = xCH(result, getOffsetdtlno());
        result = xCH(result, getOffsetinstno());
        result = xCH(result, getOffsetinstbranchno());
        result = xCH(result, getOffsetversion());
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
        sb.append(c).append(getHeadid());
        sb.append(c).append(getInfoid());
        sb.append(c).append(getInfoversion());
        sb.append(c).append(getOffsetid());
        sb.append(c).append(getOffsetcasecd());
        sb.append(c).append(getOffsetcutcasecd());
        sb.append(c).append(getOffsetdtlno());
        sb.append(c).append(getOffsetinstno());
        sb.append(c).append(getOffsetinstbranchno());
        sb.append(c).append(getOffsetversion());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HEADID: {bigint(19)} <br>
     * @return The value of the column 'HEADID'. (NullAllowed)
     */
    public Long getHeadid() {
        return _headid;
    }

    /**
     * [set] HEADID: {bigint(19)} <br>
     * @param headid The value of the column 'HEADID'. (NullAllowed)
     */
    public void setHeadid(Long headid) {
        __modifiedProperties.add("headid");
        this._headid = headid;
    }

    /**
     * [get] INFOID: {bigint(19)} <br>
     * @return The value of the column 'INFOID'. (NullAllowed)
     */
    public Long getInfoid() {
        return _infoid;
    }

    /**
     * [set] INFOID: {bigint(19)} <br>
     * @param infoid The value of the column 'INFOID'. (NullAllowed)
     */
    public void setInfoid(Long infoid) {
        __modifiedProperties.add("infoid");
        this._infoid = infoid;
    }

    /**
     * [get] INFOVERSION: {bigint(19)} <br>
     * @return The value of the column 'INFOVERSION'. (NullAllowed)
     */
    public Long getInfoversion() {
        return _infoversion;
    }

    /**
     * [set] INFOVERSION: {bigint(19)} <br>
     * @param infoversion The value of the column 'INFOVERSION'. (NullAllowed)
     */
    public void setInfoversion(Long infoversion) {
        __modifiedProperties.add("infoversion");
        this._infoversion = infoversion;
    }

    /**
     * [get] OFFSETID: {bigint(19)} <br>
     * @return The value of the column 'OFFSETID'. (NullAllowed)
     */
    public Long getOffsetid() {
        return _offsetid;
    }

    /**
     * [set] OFFSETID: {bigint(19)} <br>
     * @param offsetid The value of the column 'OFFSETID'. (NullAllowed)
     */
    public void setOffsetid(Long offsetid) {
        __modifiedProperties.add("offsetid");
        this._offsetid = offsetid;
    }

    /**
     * [get] OFFSETCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'OFFSETCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getOffsetcasecd() {
        return _offsetcasecd;
    }

    /**
     * [set] OFFSETCASECD: {decimal(16, 6)} <br>
     * @param offsetcasecd The value of the column 'OFFSETCASECD'. (NullAllowed)
     */
    public void setOffsetcasecd(java.math.BigDecimal offsetcasecd) {
        __modifiedProperties.add("offsetcasecd");
        this._offsetcasecd = offsetcasecd;
    }

    /**
     * [get] OFFSETCUTCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'OFFSETCUTCASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getOffsetcutcasecd() {
        return _offsetcutcasecd;
    }

    /**
     * [set] OFFSETCUTCASECD: {decimal(16, 6)} <br>
     * @param offsetcutcasecd The value of the column 'OFFSETCUTCASECD'. (NullAllowed)
     */
    public void setOffsetcutcasecd(java.math.BigDecimal offsetcutcasecd) {
        __modifiedProperties.add("offsetcutcasecd");
        this._offsetcutcasecd = offsetcutcasecd;
    }

    /**
     * [get] OFFSETDTLNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETDTLNO'. (NullAllowed)
     */
    public Long getOffsetdtlno() {
        return _offsetdtlno;
    }

    /**
     * [set] OFFSETDTLNO: {bigint(19)} <br>
     * @param offsetdtlno The value of the column 'OFFSETDTLNO'. (NullAllowed)
     */
    public void setOffsetdtlno(Long offsetdtlno) {
        __modifiedProperties.add("offsetdtlno");
        this._offsetdtlno = offsetdtlno;
    }

    /**
     * [get] OFFSETINSTNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETINSTNO'. (NullAllowed)
     */
    public Long getOffsetinstno() {
        return _offsetinstno;
    }

    /**
     * [set] OFFSETINSTNO: {bigint(19)} <br>
     * @param offsetinstno The value of the column 'OFFSETINSTNO'. (NullAllowed)
     */
    public void setOffsetinstno(Long offsetinstno) {
        __modifiedProperties.add("offsetinstno");
        this._offsetinstno = offsetinstno;
    }

    /**
     * [get] OFFSETINSTBRANCHNO: {bigint(19)} <br>
     * @return The value of the column 'OFFSETINSTBRANCHNO'. (NullAllowed)
     */
    public Long getOffsetinstbranchno() {
        return _offsetinstbranchno;
    }

    /**
     * [set] OFFSETINSTBRANCHNO: {bigint(19)} <br>
     * @param offsetinstbranchno The value of the column 'OFFSETINSTBRANCHNO'. (NullAllowed)
     */
    public void setOffsetinstbranchno(Long offsetinstbranchno) {
        __modifiedProperties.add("offsetinstbranchno");
        this._offsetinstbranchno = offsetinstbranchno;
    }

    /**
     * [get] OFFSETVERSION: {bigint(19)} <br>
     * @return The value of the column 'OFFSETVERSION'. (NullAllowed)
     */
    public Long getOffsetversion() {
        return _offsetversion;
    }

    /**
     * [set] OFFSETVERSION: {bigint(19)} <br>
     * @param offsetversion The value of the column 'OFFSETVERSION'. (NullAllowed)
     */
    public void setOffsetversion(Long offsetversion) {
        __modifiedProperties.add("offsetversion");
        this._offsetversion = offsetversion;
    }

}
