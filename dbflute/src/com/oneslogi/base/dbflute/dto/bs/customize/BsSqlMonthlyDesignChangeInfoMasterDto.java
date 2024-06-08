package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMonthlyDesignChangeInfoMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_CD, PRODUCT_NM, SOTEDUNIT, SOTEDUNIT_NM, LIMITDATE, DESIGNFLG, DESIGNFLG_NM, SOTEDLOC, PICKLISTKEY, PICKLISTGNO, UPD_DT, UPD_USER, DEL_FLG, DEL_FLG_NM, MFMONTHCHG_ID, VERSION_NO, CENTER_ID, SORT
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
public abstract class BsSqlMonthlyDesignChangeInfoMasterDto implements Serializable {

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
    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** SOTEDUNIT: {varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** SOTEDUNIT_NM: {int(10)} */
    @JsonKey
    protected String _sotedunitNm;

    /** LIMITDATE: {varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** DESIGNFLG: {varchar(30)} */
    @JsonKey
    protected String _designflg;

    /** DESIGNFLG_NM: {int(10)} */
    @JsonKey
    protected String _designflgNm;

    /** SOTEDLOC: {varchar(30)} */
    @JsonKey
    protected String _sotedloc;

    /** PICKLISTKEY: {bigint(19)} */
    @JsonKey
    protected Long _picklistkey;

    /** PICKLISTGNO: {bigint(19)} */
    @JsonKey
    protected Long _picklistgno;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    @JsonKey
    protected String _delFlgNm;

    /** MFMONTHCHG_ID: {bigint(19)} */
    @JsonKey
    protected Long _mfmonthchgId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** SORT: {int(10)} */
    @JsonKey
    protected Integer _sort;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMonthlyDesignChangeInfoMasterDto() {
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
        if (other == null || !(other instanceof BsSqlMonthlyDesignChangeInfoMasterDto)) { return false; }
        final BsSqlMonthlyDesignChangeInfoMasterDto otherEntity = (BsSqlMonthlyDesignChangeInfoMasterDto)other;
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getSotedunit(), otherEntity.getSotedunit())) { return false; }
        if (!helpComparingValue(getSotedunitNm(), otherEntity.getSotedunitNm())) { return false; }
        if (!helpComparingValue(getLimitdate(), otherEntity.getLimitdate())) { return false; }
        if (!helpComparingValue(getDesignflg(), otherEntity.getDesignflg())) { return false; }
        if (!helpComparingValue(getDesignflgNm(), otherEntity.getDesignflgNm())) { return false; }
        if (!helpComparingValue(getSotedloc(), otherEntity.getSotedloc())) { return false; }
        if (!helpComparingValue(getPicklistkey(), otherEntity.getPicklistkey())) { return false; }
        if (!helpComparingValue(getPicklistgno(), otherEntity.getPicklistgno())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getDelFlgNm(), otherEntity.getDelFlgNm())) { return false; }
        if (!helpComparingValue(getMfmonthchgId(), otherEntity.getMfmonthchgId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getSort(), otherEntity.getSort())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMonthlyDesignChangeInfoMaster");
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getSotedunit());
        result = xCH(result, getSotedunitNm());
        result = xCH(result, getLimitdate());
        result = xCH(result, getDesignflg());
        result = xCH(result, getDesignflgNm());
        result = xCH(result, getSotedloc());
        result = xCH(result, getPicklistkey());
        result = xCH(result, getPicklistgno());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getDelFlg());
        result = xCH(result, getDelFlgNm());
        result = xCH(result, getMfmonthchgId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getCenterId());
        result = xCH(result, getSort());
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
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getSotedunitNm());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDesignflg());
        sb.append(c).append(getDesignflgNm());
        sb.append(c).append(getSotedloc());
        sb.append(c).append(getPicklistkey());
        sb.append(c).append(getPicklistgno());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getDelFlgNm());
        sb.append(c).append(getMfmonthchgId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSort());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
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
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] SOTEDUNIT_NM: {int(10)} <br>
     * @return The value of the column 'SOTEDUNIT_NM'. (NullAllowed)
     */
    public String getSotedunitNm() {
        return _sotedunitNm;
    }

    /**
     * [set] SOTEDUNIT_NM: {int(10)} <br>
     * @param sotedunitNm The value of the column 'SOTEDUNIT_NM'. (NullAllowed)
     */
    public void setSotedunitNm(String sotedunitNm) {
        __modifiedProperties.add("sotedunitNm");
        this._sotedunitNm = sotedunitNm;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DESIGNFLG: {varchar(30)} <br>
     * @return The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public String getDesignflg() {
        return _designflg;
    }

    /**
     * [set] DESIGNFLG: {varchar(30)} <br>
     * @param designflg The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public void setDesignflg(String designflg) {
        __modifiedProperties.add("designflg");
        this._designflg = designflg;
    }

    /**
     * [get] DESIGNFLG_NM: {int(10)} <br>
     * @return The value of the column 'DESIGNFLG_NM'. (NullAllowed)
     */
    public String getDesignflgNm() {
        return _designflgNm;
    }

    /**
     * [set] DESIGNFLG_NM: {int(10)} <br>
     * @param designflgNm The value of the column 'DESIGNFLG_NM'. (NullAllowed)
     */
    public void setDesignflgNm(String designflgNm) {
        __modifiedProperties.add("designflgNm");
        this._designflgNm = designflgNm;
    }

    /**
     * [get] SOTEDLOC: {varchar(30)} <br>
     * @return The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public String getSotedloc() {
        return _sotedloc;
    }

    /**
     * [set] SOTEDLOC: {varchar(30)} <br>
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public void setSotedloc(String sotedloc) {
        __modifiedProperties.add("sotedloc");
        this._sotedloc = sotedloc;
    }

    /**
     * [get] PICKLISTKEY: {bigint(19)} <br>
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public Long getPicklistkey() {
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {bigint(19)} <br>
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public void setPicklistkey(Long picklistkey) {
        __modifiedProperties.add("picklistkey");
        this._picklistkey = picklistkey;
    }

    /**
     * [get] PICKLISTGNO: {bigint(19)} <br>
     * @return The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public Long getPicklistgno() {
        return _picklistgno;
    }

    /**
     * [set] PICKLISTGNO: {bigint(19)} <br>
     * @param picklistgno The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public void setPicklistgno(Long picklistgno) {
        __modifiedProperties.add("picklistgno");
        this._picklistgno = picklistgno;
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
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] DEL_FLG_NM: {int(10)} <br>
     * @return The value of the column 'DEL_FLG_NM'. (NullAllowed)
     */
    public String getDelFlgNm() {
        return _delFlgNm;
    }

    /**
     * [set] DEL_FLG_NM: {int(10)} <br>
     * @param delFlgNm The value of the column 'DEL_FLG_NM'. (NullAllowed)
     */
    public void setDelFlgNm(String delFlgNm) {
        __modifiedProperties.add("delFlgNm");
        this._delFlgNm = delFlgNm;
    }

    /**
     * [get] MFMONTHCHG_ID: {bigint(19)} <br>
     * @return The value of the column 'MFMONTHCHG_ID'. (NullAllowed)
     */
    public Long getMfmonthchgId() {
        return _mfmonthchgId;
    }

    /**
     * [set] MFMONTHCHG_ID: {bigint(19)} <br>
     * @param mfmonthchgId The value of the column 'MFMONTHCHG_ID'. (NullAllowed)
     */
    public void setMfmonthchgId(Long mfmonthchgId) {
        __modifiedProperties.add("mfmonthchgId");
        this._mfmonthchgId = mfmonthchgId;
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
     * [get] SORT: {int(10)} <br>
     * @return The value of the column 'SORT'. (NullAllowed)
     */
    public Integer getSort() {
        return _sort;
    }

    /**
     * [set] SORT: {int(10)} <br>
     * @param sort The value of the column 'SORT'. (NullAllowed)
     */
    public void setSort(Integer sort) {
        __modifiedProperties.add("sort");
        this._sort = sort;
    }

}
