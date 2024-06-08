package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryInspection. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_BODY_COUNT, INSPECTION_NOT_COMPLETE_COUNT
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
public abstract class BsSqlInventoryInspectionDto implements Serializable {

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
    /** INVENTORY_BODY_COUNT: {int(10)} */
    @JsonKey
    protected Long _inventoryBodyCount;

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
    public BsSqlInventoryInspectionDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryInspectionDto)) { return false; }
        final BsSqlInventoryInspectionDto otherEntity = (BsSqlInventoryInspectionDto)other;
        if (!helpComparingValue(getInventoryBodyCount(), otherEntity.getInventoryBodyCount())) { return false; }
        if (!helpComparingValue(getInspectionNotCompleteCount(), otherEntity.getInspectionNotCompleteCount())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryInspection");
        result = xCH(result, getInventoryBodyCount());
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
        sb.append(c).append(getInventoryBodyCount());
        sb.append(c).append(getInspectionNotCompleteCount());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_BODY_COUNT: {int(10)} <br>
     * @return The value of the column 'INVENTORY_BODY_COUNT'. (NullAllowed)
     */
    public Long getInventoryBodyCount() {
        return _inventoryBodyCount;
    }

    /**
     * [set] INVENTORY_BODY_COUNT: {int(10)} <br>
     * @param inventoryBodyCount The value of the column 'INVENTORY_BODY_COUNT'. (NullAllowed)
     */
    public void setInventoryBodyCount(Long inventoryBodyCount) {
        __modifiedProperties.add("inventoryBodyCount");
        this._inventoryBodyCount = inventoryBodyCount;
    }

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
