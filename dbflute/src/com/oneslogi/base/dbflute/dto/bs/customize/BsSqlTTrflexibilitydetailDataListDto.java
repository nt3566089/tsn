package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTTrflexibilitydetailDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLEXIBITYNO, TRANSPORTCD
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
public abstract class BsSqlTTrflexibilitydetailDataListDto implements Serializable {

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
    /** FLEXIBITYNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexibityno;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTTrflexibilitydetailDataListDto() {
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
        if (other == null || !(other instanceof BsSqlTTrflexibilitydetailDataListDto)) { return false; }
        final BsSqlTTrflexibilitydetailDataListDto otherEntity = (BsSqlTTrflexibilitydetailDataListDto)other;
        if (!helpComparingValue(getFlexibityno(), otherEntity.getFlexibityno())) { return false; }
        if (!helpComparingValue(getTransportcd(), otherEntity.getTransportcd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTTrflexibilitydetailDataList");
        result = xCH(result, getFlexibityno());
        result = xCH(result, getTransportcd());
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
        sb.append(c).append(getFlexibityno());
        sb.append(c).append(getTransportcd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLEXIBITYNO: {decimal(16, 6)} <br>
     * @return The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexibityno() {
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {decimal(16, 6)} <br>
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        __modifiedProperties.add("flexibityno");
        this._flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

}
