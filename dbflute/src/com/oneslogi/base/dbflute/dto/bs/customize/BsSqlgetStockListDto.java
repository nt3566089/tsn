package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlgetStockList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LID, PID, PCD, SUMCHARGE, SUMALLOC
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
public abstract class BsSqlgetStockListDto implements Serializable {

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
    /** LID: {bigint(19)} */
    @JsonKey
    protected Long _lid;

    /** PID: {bigint(19)} */
    @JsonKey
    protected Long _pid;

    /** PCD: {varchar(100)} */
    @JsonKey
    protected String _pcd;

    /** SUMCHARGE: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumcharge;

    /** SUMALLOC: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumalloc;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlgetStockListDto() {
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
        if (other == null || !(other instanceof BsSqlgetStockListDto)) { return false; }
        final BsSqlgetStockListDto otherEntity = (BsSqlgetStockListDto)other;
        if (!helpComparingValue(getLid(), otherEntity.getLid())) { return false; }
        if (!helpComparingValue(getPid(), otherEntity.getPid())) { return false; }
        if (!helpComparingValue(getPcd(), otherEntity.getPcd())) { return false; }
        if (!helpComparingValue(getSumcharge(), otherEntity.getSumcharge())) { return false; }
        if (!helpComparingValue(getSumalloc(), otherEntity.getSumalloc())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlgetStockList");
        result = xCH(result, getLid());
        result = xCH(result, getPid());
        result = xCH(result, getPcd());
        result = xCH(result, getSumcharge());
        result = xCH(result, getSumalloc());
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
        sb.append(c).append(getLid());
        sb.append(c).append(getPid());
        sb.append(c).append(getPcd());
        sb.append(c).append(getSumcharge());
        sb.append(c).append(getSumalloc());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LID: {bigint(19)} <br>
     * @return The value of the column 'LID'. (NullAllowed)
     */
    public Long getLid() {
        return _lid;
    }

    /**
     * [set] LID: {bigint(19)} <br>
     * @param lid The value of the column 'LID'. (NullAllowed)
     */
    public void setLid(Long lid) {
        __modifiedProperties.add("lid");
        this._lid = lid;
    }

    /**
     * [get] PID: {bigint(19)} <br>
     * @return The value of the column 'PID'. (NullAllowed)
     */
    public Long getPid() {
        return _pid;
    }

    /**
     * [set] PID: {bigint(19)} <br>
     * @param pid The value of the column 'PID'. (NullAllowed)
     */
    public void setPid(Long pid) {
        __modifiedProperties.add("pid");
        this._pid = pid;
    }

    /**
     * [get] PCD: {varchar(100)} <br>
     * @return The value of the column 'PCD'. (NullAllowed)
     */
    public String getPcd() {
        return _pcd;
    }

    /**
     * [set] PCD: {varchar(100)} <br>
     * @param pcd The value of the column 'PCD'. (NullAllowed)
     */
    public void setPcd(String pcd) {
        __modifiedProperties.add("pcd");
        this._pcd = pcd;
    }

    /**
     * [get] SUMCHARGE: {decimal(38, 6)} <br>
     * @return The value of the column 'SUMCHARGE'. (NullAllowed)
     */
    public java.math.BigDecimal getSumcharge() {
        return _sumcharge;
    }

    /**
     * [set] SUMCHARGE: {decimal(38, 6)} <br>
     * @param sumcharge The value of the column 'SUMCHARGE'. (NullAllowed)
     */
    public void setSumcharge(java.math.BigDecimal sumcharge) {
        __modifiedProperties.add("sumcharge");
        this._sumcharge = sumcharge;
    }

    /**
     * [get] SUMALLOC: {decimal(38, 6)} <br>
     * @return The value of the column 'SUMALLOC'. (NullAllowed)
     */
    public java.math.BigDecimal getSumalloc() {
        return _sumalloc;
    }

    /**
     * [set] SUMALLOC: {decimal(38, 6)} <br>
     * @param sumalloc The value of the column 'SUMALLOC'. (NullAllowed)
     */
    public void setSumalloc(java.math.BigDecimal sumalloc) {
        __modifiedProperties.add("sumalloc");
        this._sumalloc = sumalloc;
    }

}
