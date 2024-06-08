package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTrhanbaiinvDiffQtyCountryTaxList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PCD, TOTAL
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
public abstract class BsSqlTrhanbaiinvDiffQtyCountryTaxListDto implements Serializable {

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
    /** PCD: {varchar(30)} */
    @JsonKey
    protected String _pcd;

    /** TOTAL: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _total;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTrhanbaiinvDiffQtyCountryTaxListDto() {
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
        if (other == null || !(other instanceof BsSqlTrhanbaiinvDiffQtyCountryTaxListDto)) { return false; }
        final BsSqlTrhanbaiinvDiffQtyCountryTaxListDto otherEntity = (BsSqlTrhanbaiinvDiffQtyCountryTaxListDto)other;
        if (!helpComparingValue(getPcd(), otherEntity.getPcd())) { return false; }
        if (!helpComparingValue(getTotal(), otherEntity.getTotal())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTrhanbaiinvDiffQtyCountryTaxList");
        result = xCH(result, getPcd());
        result = xCH(result, getTotal());
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
        sb.append(c).append(getPcd());
        sb.append(c).append(getTotal());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PCD: {varchar(30)} <br>
     * @return The value of the column 'PCD'. (NullAllowed)
     */
    public String getPcd() {
        return _pcd;
    }

    /**
     * [set] PCD: {varchar(30)} <br>
     * @param pcd The value of the column 'PCD'. (NullAllowed)
     */
    public void setPcd(String pcd) {
        __modifiedProperties.add("pcd");
        this._pcd = pcd;
    }

    /**
     * [get] TOTAL: {decimal(38, 6)} <br>
     * @return The value of the column 'TOTAL'. (NullAllowed)
     */
    public java.math.BigDecimal getTotal() {
        return _total;
    }

    /**
     * [set] TOTAL: {decimal(38, 6)} <br>
     * @param total The value of the column 'TOTAL'. (NullAllowed)
     */
    public void setTotal(java.math.BigDecimal total) {
        __modifiedProperties.add("total");
        this._total = total;
    }

}
