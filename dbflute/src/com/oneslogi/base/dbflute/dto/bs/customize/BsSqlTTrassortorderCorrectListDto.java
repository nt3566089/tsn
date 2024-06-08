package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTTrassortorderCorrectList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO, VERSION_NO
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
public abstract class BsSqlTTrassortorderCorrectListDto implements Serializable {

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
    /** DIRECTIONORDERKEY: {bigint(19)} */
    @JsonKey
    protected Long _directionorderkey;

    /** DIRECTIONORDERGNO: {bigint(19)} */
    @JsonKey
    protected Long _directionordergno;

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
    public BsSqlTTrassortorderCorrectListDto() {
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
        if (other == null || !(other instanceof BsSqlTTrassortorderCorrectListDto)) { return false; }
        final BsSqlTTrassortorderCorrectListDto otherEntity = (BsSqlTTrassortorderCorrectListDto)other;
        if (!helpComparingValue(getDirectionorderkey(), otherEntity.getDirectionorderkey())) { return false; }
        if (!helpComparingValue(getDirectionordergno(), otherEntity.getDirectionordergno())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTTrassortorderCorrectList");
        result = xCH(result, getDirectionorderkey());
        result = xCH(result, getDirectionordergno());
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
        sb.append(c).append(getDirectionorderkey());
        sb.append(c).append(getDirectionordergno());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DIRECTIONORDERKEY: {bigint(19)} <br>
     * @return The value of the column 'DIRECTIONORDERKEY'. (NullAllowed)
     */
    public Long getDirectionorderkey() {
        return _directionorderkey;
    }

    /**
     * [set] DIRECTIONORDERKEY: {bigint(19)} <br>
     * @param directionorderkey The value of the column 'DIRECTIONORDERKEY'. (NullAllowed)
     */
    public void setDirectionorderkey(Long directionorderkey) {
        __modifiedProperties.add("directionorderkey");
        this._directionorderkey = directionorderkey;
    }

    /**
     * [get] DIRECTIONORDERGNO: {bigint(19)} <br>
     * @return The value of the column 'DIRECTIONORDERGNO'. (NullAllowed)
     */
    public Long getDirectionordergno() {
        return _directionordergno;
    }

    /**
     * [set] DIRECTIONORDERGNO: {bigint(19)} <br>
     * @param directionordergno The value of the column 'DIRECTIONORDERGNO'. (NullAllowed)
     */
    public void setDirectionordergno(Long directionordergno) {
        __modifiedProperties.add("directionordergno");
        this._directionordergno = directionordergno;
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
