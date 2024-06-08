package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlNonconformityLabelList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRBADITEMCASE_ID, CREATEDDATE, TARGETMON, ITEMCD, PRODUCT_ABBR, LBLKBN, INOUTKBN, VA_EXTDATA2, ALLOCPOLICYKEY, CASE_NUM, BADITEMCD, TODAY_NUM, CREATEDNUM, REPRINTEDFLG, VA_EXTDATA1, VERSION_NO, USERNUM3, CENTER_ID, CENTER_NM, CLIENT_ID, CLIENT_NM
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
public abstract class BsSqlNonconformityLabelListDto implements Serializable {

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

    /** CREATEDDATE: {varchar(8)} */
    @JsonKey
    protected String _createddate;

    /** TARGETMON: {varchar(8)} */
    @JsonKey
    protected String _targetmon;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** LBLKBN: {varchar(30)} */
    @JsonKey
    protected String _lblkbn;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocpolicykey;

    /** CASE_NUM: {decimal(33, 12)} */
    @JsonKey
    protected java.math.BigDecimal _caseNum;

    /** BADITEMCD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _baditemcd;

    /** TODAY_NUM: {int(10)} */
    @JsonKey
    protected Integer _todayNum;

    /** CREATEDNUM: {bigint(19)} */
    @JsonKey
    protected Long _creatednum;

    /** REPRINTEDFLG: {varchar(30)} */
    @JsonKey
    protected String _reprintedflg;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlNonconformityLabelListDto() {
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
        if (other == null || !(other instanceof BsSqlNonconformityLabelListDto)) { return false; }
        final BsSqlNonconformityLabelListDto otherEntity = (BsSqlNonconformityLabelListDto)other;
        if (!helpComparingValue(getTrbaditemcaseId(), otherEntity.getTrbaditemcaseId())) { return false; }
        if (!helpComparingValue(getCreateddate(), otherEntity.getCreateddate())) { return false; }
        if (!helpComparingValue(getTargetmon(), otherEntity.getTargetmon())) { return false; }
        if (!helpComparingValue(getItemcd(), otherEntity.getItemcd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getLblkbn(), otherEntity.getLblkbn())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getVaExtdata2(), otherEntity.getVaExtdata2())) { return false; }
        if (!helpComparingValue(getAllocpolicykey(), otherEntity.getAllocpolicykey())) { return false; }
        if (!helpComparingValue(getCaseNum(), otherEntity.getCaseNum())) { return false; }
        if (!helpComparingValue(getBaditemcd(), otherEntity.getBaditemcd())) { return false; }
        if (!helpComparingValue(getTodayNum(), otherEntity.getTodayNum())) { return false; }
        if (!helpComparingValue(getCreatednum(), otherEntity.getCreatednum())) { return false; }
        if (!helpComparingValue(getReprintedflg(), otherEntity.getReprintedflg())) { return false; }
        if (!helpComparingValue(getVaExtdata1(), otherEntity.getVaExtdata1())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlNonconformityLabelList");
        result = xCH(result, getTrbaditemcaseId());
        result = xCH(result, getCreateddate());
        result = xCH(result, getTargetmon());
        result = xCH(result, getItemcd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getLblkbn());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getVaExtdata2());
        result = xCH(result, getAllocpolicykey());
        result = xCH(result, getCaseNum());
        result = xCH(result, getBaditemcd());
        result = xCH(result, getTodayNum());
        result = xCH(result, getCreatednum());
        result = xCH(result, getReprintedflg());
        result = xCH(result, getVaExtdata1());
        result = xCH(result, getVersionNo());
        result = xCH(result, getUsernum3());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterNm());
        result = xCH(result, getClientId());
        result = xCH(result, getClientNm());
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
        sb.append(c).append(getCreateddate());
        sb.append(c).append(getTargetmon());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getLblkbn());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getAllocpolicykey());
        sb.append(c).append(getCaseNum());
        sb.append(c).append(getBaditemcd());
        sb.append(c).append(getTodayNum());
        sb.append(c).append(getCreatednum());
        sb.append(c).append(getReprintedflg());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientNm());
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
     * [get] LBLKBN: {varchar(30)} <br>
     * @return The value of the column 'LBLKBN'. (NullAllowed)
     */
    public String getLblkbn() {
        return _lblkbn;
    }

    /**
     * [set] LBLKBN: {varchar(30)} <br>
     * @param lblkbn The value of the column 'LBLKBN'. (NullAllowed)
     */
    public void setLblkbn(String lblkbn) {
        __modifiedProperties.add("lblkbn");
        this._lblkbn = lblkbn;
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
     * [get] TODAY_NUM: {int(10)} <br>
     * @return The value of the column 'TODAY_NUM'. (NullAllowed)
     */
    public Integer getTodayNum() {
        return _todayNum;
    }

    /**
     * [set] TODAY_NUM: {int(10)} <br>
     * @param todayNum The value of the column 'TODAY_NUM'. (NullAllowed)
     */
    public void setTodayNum(Integer todayNum) {
        __modifiedProperties.add("todayNum");
        this._todayNum = todayNum;
    }

    /**
     * [get] CREATEDNUM: {bigint(19)} <br>
     * @return The value of the column 'CREATEDNUM'. (NullAllowed)
     */
    public Long getCreatednum() {
        return _creatednum;
    }

    /**
     * [set] CREATEDNUM: {bigint(19)} <br>
     * @param creatednum The value of the column 'CREATEDNUM'. (NullAllowed)
     */
    public void setCreatednum(Long creatednum) {
        __modifiedProperties.add("creatednum");
        this._creatednum = creatednum;
    }

    /**
     * [get] REPRINTEDFLG: {varchar(30)} <br>
     * @return The value of the column 'REPRINTEDFLG'. (NullAllowed)
     */
    public String getReprintedflg() {
        return _reprintedflg;
    }

    /**
     * [set] REPRINTEDFLG: {varchar(30)} <br>
     * @param reprintedflg The value of the column 'REPRINTEDFLG'. (NullAllowed)
     */
    public void setReprintedflg(String reprintedflg) {
        __modifiedProperties.add("reprintedflg");
        this._reprintedflg = reprintedflg;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
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

}
