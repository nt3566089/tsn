package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlGetPlannedSortingQty. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PlannedSortingQty
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
public abstract class BsSqlGetPlannedSortingQtyDto implements Serializable {

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
    /** PlannedSortingQty: {bigint(19)} */
    @JsonKey
    protected Long _plannedSortingQty;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlGetPlannedSortingQtyDto() {
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
        if (other == null || !(other instanceof BsSqlGetPlannedSortingQtyDto)) { return false; }
        final BsSqlGetPlannedSortingQtyDto otherEntity = (BsSqlGetPlannedSortingQtyDto)other;
        if (!helpComparingValue(getPlannedSortingQty(), otherEntity.getPlannedSortingQty())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlGetPlannedSortingQty");
        result = xCH(result, getPlannedSortingQty());
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
        sb.append(c).append(getPlannedSortingQty());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PlannedSortingQty: {bigint(19)} <br>
     * @return The value of the column 'PlannedSortingQty'. (NullAllowed)
     */
    public Long getPlannedSortingQty() {
        return _plannedSortingQty;
    }

    /**
     * [set] PlannedSortingQty: {bigint(19)} <br>
     * @param plannedSortingQty The value of the column 'PlannedSortingQty'. (NullAllowed)
     */
    public void setPlannedSortingQty(Long plannedSortingQty) {
        __modifiedProperties.add("plannedSortingQty");
        this._plannedSortingQty = plannedSortingQty;
    }

}
