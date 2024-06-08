package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlGoodItemDiffReportList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_ABBR, INVDATE, PRODUCT_CD, PRODUCT_ABBR, DAMAGE_REFUND_KBN, DIFFOCC_AREA, DIFF_QTY, CGGDID, USER_CD, USER_NM, CGGDID_NM, INOUTKBN_NM, PRINTCOUNT, EMTPYFLAG
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
public abstract class BsSqlGoodItemDiffReportListDto implements Serializable {

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

    /** CENTER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** INVDATE: {varchar(8)} */
    @JsonKey
    protected String _invdate;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** DAMAGE_REFUND_KBN: {char(1)} */
    @JsonKey
    protected String _damageRefundKbn;

    /** DIFFOCC_AREA: {char(1)} */
    @JsonKey
    protected String _diffoccArea;

    /** DIFF_QTY: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _diffQty;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** CGGDID_NM: {varchar(100)} */
    @JsonKey
    protected String _cggdidNm;

    /** INOUTKBN_NM: {varchar(100)} */
    @JsonKey
    protected String _inoutkbnNm;

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
    public BsSqlGoodItemDiffReportListDto() {
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
        if (other == null || !(other instanceof BsSqlGoodItemDiffReportListDto)) { return false; }
        final BsSqlGoodItemDiffReportListDto otherEntity = (BsSqlGoodItemDiffReportListDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getInvdate(), otherEntity.getInvdate())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getDamageRefundKbn(), otherEntity.getDamageRefundKbn())) { return false; }
        if (!helpComparingValue(getDiffoccArea(), otherEntity.getDiffoccArea())) { return false; }
        if (!helpComparingValue(getDiffQty(), otherEntity.getDiffQty())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getCggdidNm(), otherEntity.getCggdidNm())) { return false; }
        if (!helpComparingValue(getInoutkbnNm(), otherEntity.getInoutkbnNm())) { return false; }
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
        result = xCH(result, "SqlGoodItemDiffReportList");
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getInvdate());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getDamageRefundKbn());
        result = xCH(result, getDiffoccArea());
        result = xCH(result, getDiffQty());
        result = xCH(result, getCggdid());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
        result = xCH(result, getCggdidNm());
        result = xCH(result, getInoutkbnNm());
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
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getInvdate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getDamageRefundKbn());
        sb.append(c).append(getDiffoccArea());
        sb.append(c).append(getDiffQty());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getCggdidNm());
        sb.append(c).append(getInoutkbnNm());
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
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] INVDATE: {varchar(8)} <br>
     * @return The value of the column 'INVDATE'. (NullAllowed)
     */
    public String getInvdate() {
        return _invdate;
    }

    /**
     * [set] INVDATE: {varchar(8)} <br>
     * @param invdate The value of the column 'INVDATE'. (NullAllowed)
     */
    public void setInvdate(String invdate) {
        __modifiedProperties.add("invdate");
        this._invdate = invdate;
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
     * [get] DAMAGE_REFUND_KBN: {char(1)} <br>
     * @return The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public String getDamageRefundKbn() {
        return _damageRefundKbn;
    }

    /**
     * [set] DAMAGE_REFUND_KBN: {char(1)} <br>
     * @param damageRefundKbn The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public void setDamageRefundKbn(String damageRefundKbn) {
        __modifiedProperties.add("damageRefundKbn");
        this._damageRefundKbn = damageRefundKbn;
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
     * [get] DIFF_QTY: {decimal(38, 6)} <br>
     * @return The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffQty() {
        return _diffQty;
    }

    /**
     * [set] DIFF_QTY: {decimal(38, 6)} <br>
     * @param diffQty The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public void setDiffQty(java.math.BigDecimal diffQty) {
        __modifiedProperties.add("diffQty");
        this._diffQty = diffQty;
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
     * [get] CGGDID_NM: {varchar(100)} <br>
     * @return The value of the column 'CGGDID_NM'. (NullAllowed)
     */
    public String getCggdidNm() {
        return _cggdidNm;
    }

    /**
     * [set] CGGDID_NM: {varchar(100)} <br>
     * @param cggdidNm The value of the column 'CGGDID_NM'. (NullAllowed)
     */
    public void setCggdidNm(String cggdidNm) {
        __modifiedProperties.add("cggdidNm");
        this._cggdidNm = cggdidNm;
    }

    /**
     * [get] INOUTKBN_NM: {varchar(100)} <br>
     * @return The value of the column 'INOUTKBN_NM'. (NullAllowed)
     */
    public String getInoutkbnNm() {
        return _inoutkbnNm;
    }

    /**
     * [set] INOUTKBN_NM: {varchar(100)} <br>
     * @param inoutkbnNm The value of the column 'INOUTKBN_NM'. (NullAllowed)
     */
    public void setInoutkbnNm(String inoutkbnNm) {
        __modifiedProperties.add("inoutkbnNm");
        this._inoutkbnNm = inoutkbnNm;
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
