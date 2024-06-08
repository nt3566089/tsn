package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlgetStockHozeiList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LID, PID, PCD, LOT1, LOT4, LOT2, SUMCHARGE, SUMALLOC
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
public abstract class BsSqlgetStockHozeiListDto implements Serializable {

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

    /** LOT1: {varchar(255)} */
    @JsonKey
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT2: {varchar(255)} */
    @JsonKey
    protected String _lot2;

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
    public BsSqlgetStockHozeiListDto() {
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
        if (other == null || !(other instanceof BsSqlgetStockHozeiListDto)) { return false; }
        final BsSqlgetStockHozeiListDto otherEntity = (BsSqlgetStockHozeiListDto)other;
        if (!helpComparingValue(getLid(), otherEntity.getLid())) { return false; }
        if (!helpComparingValue(getPid(), otherEntity.getPid())) { return false; }
        if (!helpComparingValue(getPcd(), otherEntity.getPcd())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getLot2(), otherEntity.getLot2())) { return false; }
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
        result = xCH(result, "SqlgetStockHozeiList");
        result = xCH(result, getLid());
        result = xCH(result, getPid());
        result = xCH(result, getPcd());
        result = xCH(result, getLot1());
        result = xCH(result, getLot4());
        result = xCH(result, getLot2());
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
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot2());
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
     * [get] LOT1: {varchar(255)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
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
