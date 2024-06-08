package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlCasePickingNoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     center_id, case_picking_no, packing_status, packing_status_nm, user_cd, user_nm
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
public abstract class BsSqlCasePickingNoListDto implements Serializable {

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
    /** center_id: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** case_picking_no: {varchar(30)} */
    @JsonKey
    protected String _casePickingNo;

    /** packing_status: {varchar(30)} */
    @JsonKey
    protected String _packingStatus;

    /** packing_status_nm: {varchar(100)} */
    @JsonKey
    protected String _packingStatusNm;

    /** user_cd: {varchar(255)} */
    @JsonKey
    protected String _userCd;

    /** user_nm: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlCasePickingNoListDto() {
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
        if (other == null || !(other instanceof BsSqlCasePickingNoListDto)) { return false; }
        final BsSqlCasePickingNoListDto otherEntity = (BsSqlCasePickingNoListDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCasePickingNo(), otherEntity.getCasePickingNo())) { return false; }
        if (!helpComparingValue(getPackingStatus(), otherEntity.getPackingStatus())) { return false; }
        if (!helpComparingValue(getPackingStatusNm(), otherEntity.getPackingStatusNm())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlCasePickingNoList");
        result = xCH(result, getCenterId());
        result = xCH(result, getCasePickingNo());
        result = xCH(result, getPackingStatus());
        result = xCH(result, getPackingStatusNm());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCasePickingNo());
        sb.append(c).append(getPackingStatus());
        sb.append(c).append(getPackingStatusNm());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] case_picking_no: {varchar(30)} <br>
     * @return The value of the column 'case_picking_no'. (NullAllowed)
     */
    public String getCasePickingNo() {
        return _casePickingNo;
    }

    /**
     * [set] case_picking_no: {varchar(30)} <br>
     * @param casePickingNo The value of the column 'case_picking_no'. (NullAllowed)
     */
    public void setCasePickingNo(String casePickingNo) {
        __modifiedProperties.add("casePickingNo");
        this._casePickingNo = casePickingNo;
    }

    /**
     * [get] packing_status: {varchar(30)} <br>
     * @return The value of the column 'packing_status'. (NullAllowed)
     */
    public String getPackingStatus() {
        return _packingStatus;
    }

    /**
     * [set] packing_status: {varchar(30)} <br>
     * @param packingStatus The value of the column 'packing_status'. (NullAllowed)
     */
    public void setPackingStatus(String packingStatus) {
        __modifiedProperties.add("packingStatus");
        this._packingStatus = packingStatus;
    }

    /**
     * [get] packing_status_nm: {varchar(100)} <br>
     * @return The value of the column 'packing_status_nm'. (NullAllowed)
     */
    public String getPackingStatusNm() {
        return _packingStatusNm;
    }

    /**
     * [set] packing_status_nm: {varchar(100)} <br>
     * @param packingStatusNm The value of the column 'packing_status_nm'. (NullAllowed)
     */
    public void setPackingStatusNm(String packingStatusNm) {
        __modifiedProperties.add("packingStatusNm");
        this._packingStatusNm = packingStatusNm;
    }

    /**
     * [get] user_cd: {varchar(255)} <br>
     * @return The value of the column 'user_cd'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] user_cd: {varchar(255)} <br>
     * @param userCd The value of the column 'user_cd'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] user_nm: {varchar(60)} <br>
     * @return The value of the column 'user_nm'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] user_nm: {varchar(60)} <br>
     * @param userNm The value of the column 'user_nm'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

}
