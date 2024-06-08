package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMCbrctgDropDownList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BRCTG, BRCTGNM
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
public abstract class BsSqlMCbrctgDropDownListDto implements Serializable {

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
    /** BRCTG: {bigint(19)} */
    @JsonKey
    protected Long _brctg;

    /** BRCTGNM: {varchar(30)} */
    @JsonKey
    protected String _brctgnm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMCbrctgDropDownListDto() {
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
        if (other == null || !(other instanceof BsSqlMCbrctgDropDownListDto)) { return false; }
        final BsSqlMCbrctgDropDownListDto otherEntity = (BsSqlMCbrctgDropDownListDto)other;
        if (!helpComparingValue(getBrctg(), otherEntity.getBrctg())) { return false; }
        if (!helpComparingValue(getBrctgnm(), otherEntity.getBrctgnm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMCbrctgDropDownList");
        result = xCH(result, getBrctg());
        result = xCH(result, getBrctgnm());
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
        sb.append(c).append(getBrctg());
        sb.append(c).append(getBrctgnm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BRCTG: {bigint(19)} <br>
     * @return The value of the column 'BRCTG'. (NullAllowed)
     */
    public Long getBrctg() {
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * @param brctg The value of the column 'BRCTG'. (NullAllowed)
     */
    public void setBrctg(Long brctg) {
        __modifiedProperties.add("brctg");
        this._brctg = brctg;
    }

    /**
     * [get] BRCTGNM: {varchar(30)} <br>
     * @return The value of the column 'BRCTGNM'. (NullAllowed)
     */
    public String getBrctgnm() {
        return _brctgnm;
    }

    /**
     * [set] BRCTGNM: {varchar(30)} <br>
     * @param brctgnm The value of the column 'BRCTGNM'. (NullAllowed)
     */
    public void setBrctgnm(String brctgnm) {
        __modifiedProperties.add("brctgnm");
        this._brctgnm = brctgnm;
    }

}
