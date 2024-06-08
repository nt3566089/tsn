package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMatchingUintnumList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MATCHING_KEYWORD, UNIT_NUM, GROSS_WEIGHT, SHAPE_SORT
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
public abstract class BsSqlMatchingUintnumListDto implements Serializable {

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
    /** MATCHING_KEYWORD: {varchar(100)} */
    @JsonKey
    protected String _matchingKeyword;

    /** UNIT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _unitNum;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** SHAPE_SORT: {bigint(19)} */
    @JsonKey
    protected Long _shapeSort;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMatchingUintnumListDto() {
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
        if (other == null || !(other instanceof BsSqlMatchingUintnumListDto)) { return false; }
        final BsSqlMatchingUintnumListDto otherEntity = (BsSqlMatchingUintnumListDto)other;
        if (!helpComparingValue(getMatchingKeyword(), otherEntity.getMatchingKeyword())) { return false; }
        if (!helpComparingValue(getUnitNum(), otherEntity.getUnitNum())) { return false; }
        if (!helpComparingValue(getGrossWeight(), otherEntity.getGrossWeight())) { return false; }
        if (!helpComparingValue(getShapeSort(), otherEntity.getShapeSort())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMatchingUintnumList");
        result = xCH(result, getMatchingKeyword());
        result = xCH(result, getUnitNum());
        result = xCH(result, getGrossWeight());
        result = xCH(result, getShapeSort());
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
        sb.append(c).append(getMatchingKeyword());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getShapeSort());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MATCHING_KEYWORD: {varchar(100)} <br>
     * @return The value of the column 'MATCHING_KEYWORD'. (NullAllowed)
     */
    public String getMatchingKeyword() {
        return _matchingKeyword;
    }

    /**
     * [set] MATCHING_KEYWORD: {varchar(100)} <br>
     * @param matchingKeyword The value of the column 'MATCHING_KEYWORD'. (NullAllowed)
     */
    public void setMatchingKeyword(String matchingKeyword) {
        __modifiedProperties.add("matchingKeyword");
        this._matchingKeyword = matchingKeyword;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] SHAPE_SORT: {bigint(19)} <br>
     * @return The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public Long getShapeSort() {
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {bigint(19)} <br>
     * @param shapeSort The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public void setShapeSort(Long shapeSort) {
        __modifiedProperties.add("shapeSort");
        this._shapeSort = shapeSort;
    }

}
