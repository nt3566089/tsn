package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlAllocateControlMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PRODUCT_CD, PRODUCT_NM, PICKFRDATE, PICKTODATE, VALIDTYPE, VALIDTYPE_NM, PICKRANK1, PICKRANK1_NM, PICKRANK2, PICKRANK2_NM, PICKRANK3, PICKRANK3_NM, PICKRANK4, PICKRANK4_NM, PICKRANK5, PICKRANK5_NM, UPD_DT, UPD_USER, CLIENT_CD, CLIENT_NM, CLIENT_ID, CENTER_CD, CENTER_NM, VERSION_NO
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
public abstract class BsSqlAllocateControlMasterListDto implements Serializable {

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
    /** MFPICKCTL_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfpickctlId;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PICKFRDATE: {varchar(8)} */
    @JsonKey
    protected String _pickfrdate;

    /** PICKTODATE: {varchar(8)} */
    @JsonKey
    protected String _picktodate;

    /** VALIDTYPE: {varchar(30)} */
    @JsonKey
    protected String _validtype;

    /** VALIDTYPE_NM: {int(10)} */
    @JsonKey
    protected String _validtypeNm;

    /** PICKRANK1: {varchar(30)} */
    @JsonKey
    protected String _pickrank1;

    /** PICKRANK1_NM: {int(10)} */
    @JsonKey
    protected String _pickrank1Nm;

    /** PICKRANK2: {varchar(30)} */
    @JsonKey
    protected String _pickrank2;

    /** PICKRANK2_NM: {int(10)} */
    @JsonKey
    protected String _pickrank2Nm;

    /** PICKRANK3: {varchar(30)} */
    @JsonKey
    protected String _pickrank3;

    /** PICKRANK3_NM: {int(10)} */
    @JsonKey
    protected String _pickrank3Nm;

    /** PICKRANK4: {varchar(30)} */
    @JsonKey
    protected String _pickrank4;

    /** PICKRANK4_NM: {int(10)} */
    @JsonKey
    protected String _pickrank4Nm;

    /** PICKRANK5: {varchar(30)} */
    @JsonKey
    protected String _pickrank5;

    /** PICKRANK5_NM: {int(10)} */
    @JsonKey
    protected String _pickrank5Nm;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlAllocateControlMasterListDto() {
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
        if (other == null || !(other instanceof BsSqlAllocateControlMasterListDto)) { return false; }
        final BsSqlAllocateControlMasterListDto otherEntity = (BsSqlAllocateControlMasterListDto)other;
        if (!helpComparingValue(getMfpickctlId(), otherEntity.getMfpickctlId())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getPickfrdate(), otherEntity.getPickfrdate())) { return false; }
        if (!helpComparingValue(getPicktodate(), otherEntity.getPicktodate())) { return false; }
        if (!helpComparingValue(getValidtype(), otherEntity.getValidtype())) { return false; }
        if (!helpComparingValue(getValidtypeNm(), otherEntity.getValidtypeNm())) { return false; }
        if (!helpComparingValue(getPickrank1(), otherEntity.getPickrank1())) { return false; }
        if (!helpComparingValue(getPickrank1Nm(), otherEntity.getPickrank1Nm())) { return false; }
        if (!helpComparingValue(getPickrank2(), otherEntity.getPickrank2())) { return false; }
        if (!helpComparingValue(getPickrank2Nm(), otherEntity.getPickrank2Nm())) { return false; }
        if (!helpComparingValue(getPickrank3(), otherEntity.getPickrank3())) { return false; }
        if (!helpComparingValue(getPickrank3Nm(), otherEntity.getPickrank3Nm())) { return false; }
        if (!helpComparingValue(getPickrank4(), otherEntity.getPickrank4())) { return false; }
        if (!helpComparingValue(getPickrank4Nm(), otherEntity.getPickrank4Nm())) { return false; }
        if (!helpComparingValue(getPickrank5(), otherEntity.getPickrank5())) { return false; }
        if (!helpComparingValue(getPickrank5Nm(), otherEntity.getPickrank5Nm())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlAllocateControlMasterList");
        result = xCH(result, getMfpickctlId());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getPickfrdate());
        result = xCH(result, getPicktodate());
        result = xCH(result, getValidtype());
        result = xCH(result, getValidtypeNm());
        result = xCH(result, getPickrank1());
        result = xCH(result, getPickrank1Nm());
        result = xCH(result, getPickrank2());
        result = xCH(result, getPickrank2Nm());
        result = xCH(result, getPickrank3());
        result = xCH(result, getPickrank3Nm());
        result = xCH(result, getPickrank4());
        result = xCH(result, getPickrank4Nm());
        result = xCH(result, getPickrank5());
        result = xCH(result, getPickrank5Nm());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getClientId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getVersionNo());
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
        sb.append(c).append(getMfpickctlId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getPickfrdate());
        sb.append(c).append(getPicktodate());
        sb.append(c).append(getValidtype());
        sb.append(c).append(getValidtypeNm());
        sb.append(c).append(getPickrank1());
        sb.append(c).append(getPickrank1Nm());
        sb.append(c).append(getPickrank2());
        sb.append(c).append(getPickrank2Nm());
        sb.append(c).append(getPickrank3());
        sb.append(c).append(getPickrank3Nm());
        sb.append(c).append(getPickrank4());
        sb.append(c).append(getPickrank4Nm());
        sb.append(c).append(getPickrank5());
        sb.append(c).append(getPickrank5Nm());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFPICKCTL_ID: {bigint(19)} <br>
     * @return The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public Long getMfpickctlId() {
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {bigint(19)} <br>
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        __modifiedProperties.add("mfpickctlId");
        this._mfpickctlId = mfpickctlId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PICKFRDATE: {varchar(8)} <br>
     * @return The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public String getPickfrdate() {
        return _pickfrdate;
    }

    /**
     * [set] PICKFRDATE: {varchar(8)} <br>
     * @param pickfrdate The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public void setPickfrdate(String pickfrdate) {
        __modifiedProperties.add("pickfrdate");
        this._pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {varchar(8)} <br>
     * @return The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public String getPicktodate() {
        return _picktodate;
    }

    /**
     * [set] PICKTODATE: {varchar(8)} <br>
     * @param picktodate The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public void setPicktodate(String picktodate) {
        __modifiedProperties.add("picktodate");
        this._picktodate = picktodate;
    }

    /**
     * [get] VALIDTYPE: {varchar(30)} <br>
     * @return The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public String getValidtype() {
        return _validtype;
    }

    /**
     * [set] VALIDTYPE: {varchar(30)} <br>
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public void setValidtype(String validtype) {
        __modifiedProperties.add("validtype");
        this._validtype = validtype;
    }

    /**
     * [get] VALIDTYPE_NM: {int(10)} <br>
     * @return The value of the column 'VALIDTYPE_NM'. (NullAllowed)
     */
    public String getValidtypeNm() {
        return _validtypeNm;
    }

    /**
     * [set] VALIDTYPE_NM: {int(10)} <br>
     * @param validtypeNm The value of the column 'VALIDTYPE_NM'. (NullAllowed)
     */
    public void setValidtypeNm(String validtypeNm) {
        __modifiedProperties.add("validtypeNm");
        this._validtypeNm = validtypeNm;
    }

    /**
     * [get] PICKRANK1: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK1'. (NullAllowed)
     */
    public String getPickrank1() {
        return _pickrank1;
    }

    /**
     * [set] PICKRANK1: {varchar(30)} <br>
     * @param pickrank1 The value of the column 'PICKRANK1'. (NullAllowed)
     */
    public void setPickrank1(String pickrank1) {
        __modifiedProperties.add("pickrank1");
        this._pickrank1 = pickrank1;
    }

    /**
     * [get] PICKRANK1_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK1_NM'. (NullAllowed)
     */
    public String getPickrank1Nm() {
        return _pickrank1Nm;
    }

    /**
     * [set] PICKRANK1_NM: {int(10)} <br>
     * @param pickrank1Nm The value of the column 'PICKRANK1_NM'. (NullAllowed)
     */
    public void setPickrank1Nm(String pickrank1Nm) {
        __modifiedProperties.add("pickrank1Nm");
        this._pickrank1Nm = pickrank1Nm;
    }

    /**
     * [get] PICKRANK2: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK2'. (NullAllowed)
     */
    public String getPickrank2() {
        return _pickrank2;
    }

    /**
     * [set] PICKRANK2: {varchar(30)} <br>
     * @param pickrank2 The value of the column 'PICKRANK2'. (NullAllowed)
     */
    public void setPickrank2(String pickrank2) {
        __modifiedProperties.add("pickrank2");
        this._pickrank2 = pickrank2;
    }

    /**
     * [get] PICKRANK2_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK2_NM'. (NullAllowed)
     */
    public String getPickrank2Nm() {
        return _pickrank2Nm;
    }

    /**
     * [set] PICKRANK2_NM: {int(10)} <br>
     * @param pickrank2Nm The value of the column 'PICKRANK2_NM'. (NullAllowed)
     */
    public void setPickrank2Nm(String pickrank2Nm) {
        __modifiedProperties.add("pickrank2Nm");
        this._pickrank2Nm = pickrank2Nm;
    }

    /**
     * [get] PICKRANK3: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK3'. (NullAllowed)
     */
    public String getPickrank3() {
        return _pickrank3;
    }

    /**
     * [set] PICKRANK3: {varchar(30)} <br>
     * @param pickrank3 The value of the column 'PICKRANK3'. (NullAllowed)
     */
    public void setPickrank3(String pickrank3) {
        __modifiedProperties.add("pickrank3");
        this._pickrank3 = pickrank3;
    }

    /**
     * [get] PICKRANK3_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK3_NM'. (NullAllowed)
     */
    public String getPickrank3Nm() {
        return _pickrank3Nm;
    }

    /**
     * [set] PICKRANK3_NM: {int(10)} <br>
     * @param pickrank3Nm The value of the column 'PICKRANK3_NM'. (NullAllowed)
     */
    public void setPickrank3Nm(String pickrank3Nm) {
        __modifiedProperties.add("pickrank3Nm");
        this._pickrank3Nm = pickrank3Nm;
    }

    /**
     * [get] PICKRANK4: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK4'. (NullAllowed)
     */
    public String getPickrank4() {
        return _pickrank4;
    }

    /**
     * [set] PICKRANK4: {varchar(30)} <br>
     * @param pickrank4 The value of the column 'PICKRANK4'. (NullAllowed)
     */
    public void setPickrank4(String pickrank4) {
        __modifiedProperties.add("pickrank4");
        this._pickrank4 = pickrank4;
    }

    /**
     * [get] PICKRANK4_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK4_NM'. (NullAllowed)
     */
    public String getPickrank4Nm() {
        return _pickrank4Nm;
    }

    /**
     * [set] PICKRANK4_NM: {int(10)} <br>
     * @param pickrank4Nm The value of the column 'PICKRANK4_NM'. (NullAllowed)
     */
    public void setPickrank4Nm(String pickrank4Nm) {
        __modifiedProperties.add("pickrank4Nm");
        this._pickrank4Nm = pickrank4Nm;
    }

    /**
     * [get] PICKRANK5: {varchar(30)} <br>
     * @return The value of the column 'PICKRANK5'. (NullAllowed)
     */
    public String getPickrank5() {
        return _pickrank5;
    }

    /**
     * [set] PICKRANK5: {varchar(30)} <br>
     * @param pickrank5 The value of the column 'PICKRANK5'. (NullAllowed)
     */
    public void setPickrank5(String pickrank5) {
        __modifiedProperties.add("pickrank5");
        this._pickrank5 = pickrank5;
    }

    /**
     * [get] PICKRANK5_NM: {int(10)} <br>
     * @return The value of the column 'PICKRANK5_NM'. (NullAllowed)
     */
    public String getPickrank5Nm() {
        return _pickrank5Nm;
    }

    /**
     * [set] PICKRANK5_NM: {int(10)} <br>
     * @param pickrank5Nm The value of the column 'PICKRANK5_NM'. (NullAllowed)
     */
    public void setPickrank5Nm(String pickrank5Nm) {
        __modifiedProperties.add("pickrank5Nm");
        this._pickrank5Nm = pickrank5Nm;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
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

}
