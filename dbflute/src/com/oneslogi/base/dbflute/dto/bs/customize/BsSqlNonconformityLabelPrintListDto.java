package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlNonconformityLabelPrintList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRBADITEMCASE_ID, TARGETMON, BADITEMCD, ITEMCD, CREATEDDATE, INOUTKBN, VA_EXTDATA2, CENTER_CD, CENTER_NM, PRODUCT_ABBR, CASE_NUM, ALLOCPOLICYKEY, USERNUM3
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
public abstract class BsSqlNonconformityLabelPrintListDto implements Serializable {

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
    /** TRBADITEMCASE_ID: {bigint(19)} */
    @JsonKey
    protected Long _trbaditemcaseId;

    /** TARGETMON: {varchar(8)} */
    @JsonKey
    protected String _targetmon;

    /** BADITEMCD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _baditemcd;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** CREATEDDATE: {varchar(8)} */
    @JsonKey
    protected String _createddate;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** CASE_NUM: {decimal(33, 12)} */
    @JsonKey
    protected java.math.BigDecimal _caseNum;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocpolicykey;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlNonconformityLabelPrintListDto() {
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
        if (other == null || !(other instanceof BsSqlNonconformityLabelPrintListDto)) { return false; }
        final BsSqlNonconformityLabelPrintListDto otherEntity = (BsSqlNonconformityLabelPrintListDto)other;
        if (!helpComparingValue(getTrbaditemcaseId(), otherEntity.getTrbaditemcaseId())) { return false; }
        if (!helpComparingValue(getTargetmon(), otherEntity.getTargetmon())) { return false; }
        if (!helpComparingValue(getBaditemcd(), otherEntity.getBaditemcd())) { return false; }
        if (!helpComparingValue(getItemcd(), otherEntity.getItemcd())) { return false; }
        if (!helpComparingValue(getCreateddate(), otherEntity.getCreateddate())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getVaExtdata2(), otherEntity.getVaExtdata2())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getCaseNum(), otherEntity.getCaseNum())) { return false; }
        if (!helpComparingValue(getAllocpolicykey(), otherEntity.getAllocpolicykey())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlNonconformityLabelPrintList");
        result = xCH(result, getTrbaditemcaseId());
        result = xCH(result, getTargetmon());
        result = xCH(result, getBaditemcd());
        result = xCH(result, getItemcd());
        result = xCH(result, getCreateddate());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getVaExtdata2());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getCaseNum());
        result = xCH(result, getAllocpolicykey());
        result = xCH(result, getUsernum3());
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
        sb.append(c).append(getTrbaditemcaseId());
        sb.append(c).append(getTargetmon());
        sb.append(c).append(getBaditemcd());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getCreateddate());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getCaseNum());
        sb.append(c).append(getAllocpolicykey());
        sb.append(c).append(getUsernum3());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRBADITEMCASE_ID: {bigint(19)} <br>
     * @return The value of the column 'TRBADITEMCASE_ID'. (NullAllowed)
     */
    public Long getTrbaditemcaseId() {
        return _trbaditemcaseId;
    }

    /**
     * [set] TRBADITEMCASE_ID: {bigint(19)} <br>
     * @param trbaditemcaseId The value of the column 'TRBADITEMCASE_ID'. (NullAllowed)
     */
    public void setTrbaditemcaseId(Long trbaditemcaseId) {
        __modifiedProperties.add("trbaditemcaseId");
        this._trbaditemcaseId = trbaditemcaseId;
    }

    /**
     * [get] TARGETMON: {varchar(8)} <br>
     * @return The value of the column 'TARGETMON'. (NullAllowed)
     */
    public String getTargetmon() {
        return _targetmon;
    }

    /**
     * [set] TARGETMON: {varchar(8)} <br>
     * @param targetmon The value of the column 'TARGETMON'. (NullAllowed)
     */
    public void setTargetmon(String targetmon) {
        __modifiedProperties.add("targetmon");
        this._targetmon = targetmon;
    }

    /**
     * [get] BADITEMCD: {decimal(16, 6)} <br>
     * @return The value of the column 'BADITEMCD'. (NullAllowed)
     */
    public java.math.BigDecimal getBaditemcd() {
        return _baditemcd;
    }

    /**
     * [set] BADITEMCD: {decimal(16, 6)} <br>
     * @param baditemcd The value of the column 'BADITEMCD'. (NullAllowed)
     */
    public void setBaditemcd(java.math.BigDecimal baditemcd) {
        __modifiedProperties.add("baditemcd");
        this._baditemcd = baditemcd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
    }

    /**
     * [get] CREATEDDATE: {varchar(8)} <br>
     * @return The value of the column 'CREATEDDATE'. (NullAllowed)
     */
    public String getCreateddate() {
        return _createddate;
    }

    /**
     * [set] CREATEDDATE: {varchar(8)} <br>
     * @param createddate The value of the column 'CREATEDDATE'. (NullAllowed)
     */
    public void setCreateddate(String createddate) {
        __modifiedProperties.add("createddate");
        this._createddate = createddate;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
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
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] CASE_NUM: {decimal(33, 12)} <br>
     * @return The value of the column 'CASE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getCaseNum() {
        return _caseNum;
    }

    /**
     * [set] CASE_NUM: {decimal(33, 12)} <br>
     * @param caseNum The value of the column 'CASE_NUM'. (NullAllowed)
     */
    public void setCaseNum(java.math.BigDecimal caseNum) {
        __modifiedProperties.add("caseNum");
        this._caseNum = caseNum;
    }

    /**
     * [get] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * @return The value of the column 'ALLOCPOLICYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocpolicykey() {
        return _allocpolicykey;
    }

    /**
     * [set] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * @param allocpolicykey The value of the column 'ALLOCPOLICYKEY'. (NullAllowed)
     */
    public void setAllocpolicykey(java.math.BigDecimal allocpolicykey) {
        __modifiedProperties.add("allocpolicykey");
        this._allocpolicykey = allocpolicykey;
    }

    /**
     * [get] USERNUM3: {bigint(19)} <br>
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

}
