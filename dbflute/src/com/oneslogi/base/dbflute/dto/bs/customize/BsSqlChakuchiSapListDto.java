package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlChakuchiSapList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RLYBSCD, RLYBSSNM
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
public abstract class BsSqlChakuchiSapListDto implements Serializable {

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
    /** RLYBSCD: {varchar(30)} */
    @JsonKey
    protected String _rlybscd;

    /** RLYBSSNM: {varchar(30)} */
    @JsonKey
    protected String _rlybssnm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlChakuchiSapListDto() {
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
        if (other == null || !(other instanceof BsSqlChakuchiSapListDto)) { return false; }
        final BsSqlChakuchiSapListDto otherEntity = (BsSqlChakuchiSapListDto)other;
        if (!helpComparingValue(getRlybscd(), otherEntity.getRlybscd())) { return false; }
        if (!helpComparingValue(getRlybssnm(), otherEntity.getRlybssnm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlChakuchiSapList");
        result = xCH(result, getRlybscd());
        result = xCH(result, getRlybssnm());
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
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getRlybssnm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
    }

    /**
     * [get] RLYBSSNM: {varchar(30)} <br>
     * @return The value of the column 'RLYBSSNM'. (NullAllowed)
     */
    public String getRlybssnm() {
        return _rlybssnm;
    }

    /**
     * [set] RLYBSSNM: {varchar(30)} <br>
     * @param rlybssnm The value of the column 'RLYBSSNM'. (NullAllowed)
     */
    public void setRlybssnm(String rlybssnm) {
        __modifiedProperties.add("rlybssnm");
        this._rlybssnm = rlybssnm;
    }

}
