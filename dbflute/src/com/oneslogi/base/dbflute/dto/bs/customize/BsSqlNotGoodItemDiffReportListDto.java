package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlNotGoodItemDiffReportList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, STOCKDATE, PRODUCT_CD, PRODUCT_ABBR, DIFFOCC_AREA, DIFF_QTY_1, CGGDID, USER_CD, USER_NM, DICT_NM, PRINTCOUNT, EMTPYFLAG
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
public abstract class BsSqlNotGoodItemDiffReportListDto implements Serializable {

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
    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** STOCKDATE: {varchar(8)} */
    @JsonKey
    protected String _stockdate;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** DIFFOCC_AREA: {char(1)} */
    @JsonKey
    protected String _diffoccArea;

    /** DIFF_QTY_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _diffQty1;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** DICT_NM: {varchar(100)} */
    @JsonKey
    protected String _dictNm;

    /** PRINTCOUNT: {numeric(11)} */
    @JsonKey
    protected Long _printcount;

    /** EMTPYFLAG: {varchar(19)} */
    @JsonKey
    protected String _emtpyflag;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlNotGoodItemDiffReportListDto() {
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
        if (other == null || !(other instanceof BsSqlNotGoodItemDiffReportListDto)) { return false; }
        final BsSqlNotGoodItemDiffReportListDto otherEntity = (BsSqlNotGoodItemDiffReportListDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getStockdate(), otherEntity.getStockdate())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getDiffoccArea(), otherEntity.getDiffoccArea())) { return false; }
        if (!helpComparingValue(getDiffQty1(), otherEntity.getDiffQty1())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getDictNm(), otherEntity.getDictNm())) { return false; }
        if (!helpComparingValue(getPrintcount(), otherEntity.getPrintcount())) { return false; }
        if (!helpComparingValue(getEmtpyflag(), otherEntity.getEmtpyflag())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlNotGoodItemDiffReportList");
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getStockdate());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getDiffoccArea());
        result = xCH(result, getDiffQty1());
        result = xCH(result, getCggdid());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
        result = xCH(result, getDictNm());
        result = xCH(result, getPrintcount());
        result = xCH(result, getEmtpyflag());
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
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getStockdate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getDiffoccArea());
        sb.append(c).append(getDiffQty1());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getDictNm());
        sb.append(c).append(getPrintcount());
        sb.append(c).append(getEmtpyflag());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] STOCKDATE: {varchar(8)} <br>
     * @return The value of the column 'STOCKDATE'. (NullAllowed)
     */
    public String getStockdate() {
        return _stockdate;
    }

    /**
     * [set] STOCKDATE: {varchar(8)} <br>
     * @param stockdate The value of the column 'STOCKDATE'. (NullAllowed)
     */
    public void setStockdate(String stockdate) {
        __modifiedProperties.add("stockdate");
        this._stockdate = stockdate;
    }

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
     * [get] DIFFOCC_AREA: {char(1)} <br>
     * @return The value of the column 'DIFFOCC_AREA'. (NullAllowed)
     */
    public String getDiffoccArea() {
        return _diffoccArea;
    }

    /**
     * [set] DIFFOCC_AREA: {char(1)} <br>
     * @param diffoccArea The value of the column 'DIFFOCC_AREA'. (NullAllowed)
     */
    public void setDiffoccArea(String diffoccArea) {
        __modifiedProperties.add("diffoccArea");
        this._diffoccArea = diffoccArea;
    }

    /**
     * [get] DIFF_QTY_1: {decimal(38, 6)} <br>
     * @return The value of the column 'DIFF_QTY_1'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffQty1() {
        return _diffQty1;
    }

    /**
     * [set] DIFF_QTY_1: {decimal(38, 6)} <br>
     * @param diffQty1 The value of the column 'DIFF_QTY_1'. (NullAllowed)
     */
    public void setDiffQty1(java.math.BigDecimal diffQty1) {
        __modifiedProperties.add("diffQty1");
        this._diffQty1 = diffQty1;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

    /**
     * [get] DICT_NM: {varchar(100)} <br>
     * @return The value of the column 'DICT_NM'. (NullAllowed)
     */
    public String getDictNm() {
        return _dictNm;
    }

    /**
     * [set] DICT_NM: {varchar(100)} <br>
     * @param dictNm The value of the column 'DICT_NM'. (NullAllowed)
     */
    public void setDictNm(String dictNm) {
        __modifiedProperties.add("dictNm");
        this._dictNm = dictNm;
    }

    /**
     * [get] PRINTCOUNT: {numeric(11)} <br>
     * @return The value of the column 'PRINTCOUNT'. (NullAllowed)
     */
    public Long getPrintcount() {
        return _printcount;
    }

    /**
     * [set] PRINTCOUNT: {numeric(11)} <br>
     * @param printcount The value of the column 'PRINTCOUNT'. (NullAllowed)
     */
    public void setPrintcount(Long printcount) {
        __modifiedProperties.add("printcount");
        this._printcount = printcount;
    }

    /**
     * [get] EMTPYFLAG: {varchar(19)} <br>
     * @return The value of the column 'EMTPYFLAG'. (NullAllowed)
     */
    public String getEmtpyflag() {
        return _emtpyflag;
    }

    /**
     * [set] EMTPYFLAG: {varchar(19)} <br>
     * @param emtpyflag The value of the column 'EMTPYFLAG'. (NullAllowed)
     */
    public void setEmtpyflag(String emtpyflag) {
        __modifiedProperties.add("emtpyflag");
        this._emtpyflag = emtpyflag;
    }

}
