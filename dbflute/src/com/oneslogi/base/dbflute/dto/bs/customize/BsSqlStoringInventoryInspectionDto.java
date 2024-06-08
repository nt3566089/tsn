package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlStoringInventoryInspection. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INSPECTION_NOT_COMPLETE_COUNT
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
public abstract class BsSqlStoringInventoryInspectionDto implements Serializable {

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
    /** INSPECTION_NOT_COMPLETE_COUNT: {int(10)} */
    @JsonKey
    protected Long _inspectionNotCompleteCount;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlStoringInventoryInspectionDto() {
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
        if (other == null || !(other instanceof BsSqlStoringInventoryInspectionDto)) { return false; }
        final BsSqlStoringInventoryInspectionDto otherEntity = (BsSqlStoringInventoryInspectionDto)other;
        if (!helpComparingValue(getInspectionNotCompleteCount(), otherEntity.getInspectionNotCompleteCount())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlStoringInventoryInspection");
        result = xCH(result, getInspectionNotCompleteCount());
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
        sb.append(c).append(getInspectionNotCompleteCount());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INSPECTION_NOT_COMPLETE_COUNT: {int(10)} <br>
     * @return The value of the column 'INSPECTION_NOT_COMPLETE_COUNT'. (NullAllowed)
     */
    public Long getInspectionNotCompleteCount() {
        return _inspectionNotCompleteCount;
    }

    /**
     * [set] INSPECTION_NOT_COMPLETE_COUNT: {int(10)} <br>
     * @param inspectionNotCompleteCount The value of the column 'INSPECTION_NOT_COMPLETE_COUNT'. (NullAllowed)
     */
    public void setInspectionNotCompleteCount(Long inspectionNotCompleteCount) {
        __modifiedProperties.add("inspectionNotCompleteCount");
        this._inspectionNotCompleteCount = inspectionNotCompleteCount;
    }

}
