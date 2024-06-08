package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlSortingPlaceMasterEditSrw. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SORT_PLACE_MANAGE_ID, VERSION_NO, CENTER_ID, CENTER_CD, CLIENT_ID, CLIENT_CD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlSortingPlaceMasterEditSrwDto implements Serializable {

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
    /** LOCIDFRNK: {varchar(30)} */
    @JsonKey
    protected String _locidfrnk;

    /** LOCIDFBRCTG1: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg1;

    /** LOCIDFBRCTG2: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg2;

    /** LOCIDFBRCTG3: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg3;

    /** LOCIDFBRCTG4: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg4;

    /** LOCIDFBRCTG5: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg5;

    /** LOCIDFBRCTG6: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg6;

    /** LOCIDFBRCTG7: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg7;

    /** LOCIDFBRCTG8: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg8;

    /** LOCIDFBRCTG9: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg9;

    /** LOCIDFBRCTG10: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg10;

    /** SORT_PLACE_MANAGE_ID: {bigint(19)} */
    @JsonKey
    protected Long _sortPlaceManageId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CLIENT_ID: {int(10)} */
    @JsonKey
    protected Integer _clientId;

    /** CLIENT_CD: {int(10)} */
    @JsonKey
    protected String _clientCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlSortingPlaceMasterEditSrwDto() {
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
        if (other == null || !(other instanceof BsSqlSortingPlaceMasterEditSrwDto)) { return false; }
        final BsSqlSortingPlaceMasterEditSrwDto otherEntity = (BsSqlSortingPlaceMasterEditSrwDto)other;
        if (!helpComparingValue(getLocidfrnk(), otherEntity.getLocidfrnk())) { return false; }
        if (!helpComparingValue(getLocidfbrctg1(), otherEntity.getLocidfbrctg1())) { return false; }
        if (!helpComparingValue(getLocidfbrctg2(), otherEntity.getLocidfbrctg2())) { return false; }
        if (!helpComparingValue(getLocidfbrctg3(), otherEntity.getLocidfbrctg3())) { return false; }
        if (!helpComparingValue(getLocidfbrctg4(), otherEntity.getLocidfbrctg4())) { return false; }
        if (!helpComparingValue(getLocidfbrctg5(), otherEntity.getLocidfbrctg5())) { return false; }
        if (!helpComparingValue(getLocidfbrctg6(), otherEntity.getLocidfbrctg6())) { return false; }
        if (!helpComparingValue(getLocidfbrctg7(), otherEntity.getLocidfbrctg7())) { return false; }
        if (!helpComparingValue(getLocidfbrctg8(), otherEntity.getLocidfbrctg8())) { return false; }
        if (!helpComparingValue(getLocidfbrctg9(), otherEntity.getLocidfbrctg9())) { return false; }
        if (!helpComparingValue(getLocidfbrctg10(), otherEntity.getLocidfbrctg10())) { return false; }
        if (!helpComparingValue(getSortPlaceManageId(), otherEntity.getSortPlaceManageId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlSortingPlaceMasterEditSrw");
        result = xCH(result, getLocidfrnk());
        result = xCH(result, getLocidfbrctg1());
        result = xCH(result, getLocidfbrctg2());
        result = xCH(result, getLocidfbrctg3());
        result = xCH(result, getLocidfbrctg4());
        result = xCH(result, getLocidfbrctg5());
        result = xCH(result, getLocidfbrctg6());
        result = xCH(result, getLocidfbrctg7());
        result = xCH(result, getLocidfbrctg8());
        result = xCH(result, getLocidfbrctg9());
        result = xCH(result, getLocidfbrctg10());
        result = xCH(result, getSortPlaceManageId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
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
        sb.append(c).append(getLocidfrnk());
        sb.append(c).append(getLocidfbrctg1());
        sb.append(c).append(getLocidfbrctg2());
        sb.append(c).append(getLocidfbrctg3());
        sb.append(c).append(getLocidfbrctg4());
        sb.append(c).append(getLocidfbrctg5());
        sb.append(c).append(getLocidfbrctg6());
        sb.append(c).append(getLocidfbrctg7());
        sb.append(c).append(getLocidfbrctg8());
        sb.append(c).append(getLocidfbrctg9());
        sb.append(c).append(getLocidfbrctg10());
        sb.append(c).append(getSortPlaceManageId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCIDFRNK: {varchar(30)} <br>
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public String getLocidfrnk() {
        return _locidfrnk;
    }

    /**
     * [set] LOCIDFRNK: {varchar(30)} <br>
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public void setLocidfrnk(String locidfrnk) {
        __modifiedProperties.add("locidfrnk");
        this._locidfrnk = locidfrnk;
    }

    /**
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public Long getLocidfbrctg1() {
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        __modifiedProperties.add("locidfbrctg1");
        this._locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public Long getLocidfbrctg2() {
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        __modifiedProperties.add("locidfbrctg2");
        this._locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public Long getLocidfbrctg3() {
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        __modifiedProperties.add("locidfbrctg3");
        this._locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public Long getLocidfbrctg4() {
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        __modifiedProperties.add("locidfbrctg4");
        this._locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public Long getLocidfbrctg5() {
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        __modifiedProperties.add("locidfbrctg5");
        this._locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public Long getLocidfbrctg6() {
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        __modifiedProperties.add("locidfbrctg6");
        this._locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public Long getLocidfbrctg7() {
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        __modifiedProperties.add("locidfbrctg7");
        this._locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public Long getLocidfbrctg8() {
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        __modifiedProperties.add("locidfbrctg8");
        this._locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public Long getLocidfbrctg9() {
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        __modifiedProperties.add("locidfbrctg9");
        this._locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public Long getLocidfbrctg10() {
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        __modifiedProperties.add("locidfbrctg10");
        this._locidfbrctg10 = locidfbrctg10;
    }

    /**
     * [get] SORT_PLACE_MANAGE_ID: {bigint(19)} <br>
     * @return The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed)
     */
    public Long getSortPlaceManageId() {
        return _sortPlaceManageId;
    }

    /**
     * [set] SORT_PLACE_MANAGE_ID: {bigint(19)} <br>
     * @param sortPlaceManageId The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed)
     */
    public void setSortPlaceManageId(Long sortPlaceManageId) {
        __modifiedProperties.add("sortPlaceManageId");
        this._sortPlaceManageId = sortPlaceManageId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CLIENT_ID: {int(10)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Integer getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {int(10)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Integer clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {int(10)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {int(10)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

}
