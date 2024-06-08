package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlGoodItemDiffReportListCenter. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_ABBR, INVDATE, PRODUCT_CD, PRODUCT_NM, DAMAGE_REFUND_KBN, DIFFOCCAREA, CGGDID, DIFF_QTY, USER_CD, USER_NM, CGGDID_NM, INOUTKBN_NM, PRINTCOUNT, EMTPYFLAG
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
public abstract class BsSqlGoodItemDiffReportListCenterDto implements Serializable {

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

    /** PRODUCT_CD: {int(10)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {int(10)} */
    @JsonKey
    protected String _productNm;

    /** DAMAGE_REFUND_KBN: {varchar(1)} */
    @JsonKey
    protected String _damageRefundKbn;

    /** DIFFOCCAREA: {varchar(2)} */
    @JsonKey
    protected String _diffoccarea;

    /** CGGDID: {int(10)} */
    @JsonKey
    protected String _cggdid;

    /** DIFF_QTY: {int(10)} */
    @JsonKey
    protected java.math.BigDecimal _diffQty;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** CGGDID_NM: {int(10)} */
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
    public BsSqlGoodItemDiffReportListCenterDto() {
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
        if (other == null || !(other instanceof BsSqlGoodItemDiffReportListCenterDto)) { return false; }
        final BsSqlGoodItemDiffReportListCenterDto otherEntity = (BsSqlGoodItemDiffReportListCenterDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getInvdate(), otherEntity.getInvdate())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getDamageRefundKbn(), otherEntity.getDamageRefundKbn())) { return false; }
        if (!helpComparingValue(getDiffoccarea(), otherEntity.getDiffoccarea())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        if (!helpComparingValue(getDiffQty(), otherEntity.getDiffQty())) { return false; }
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
        result = xCH(result, "SqlGoodItemDiffReportListCenter");
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getInvdate());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getDamageRefundKbn());
        result = xCH(result, getDiffoccarea());
        result = xCH(result, getCggdid());
        result = xCH(result, getDiffQty());
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
        sb.append(c).append(getProductNm());
        sb.append(c).append(getDamageRefundKbn());
        sb.append(c).append(getDiffoccarea());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getDiffQty());
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
     * [get] PRODUCT_CD: {int(10)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {int(10)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {int(10)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {int(10)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] DAMAGE_REFUND_KBN: {varchar(1)} <br>
     * @return The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public String getDamageRefundKbn() {
        return _damageRefundKbn;
    }

    /**
     * [set] DAMAGE_REFUND_KBN: {varchar(1)} <br>
     * @param damageRefundKbn The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public void setDamageRefundKbn(String damageRefundKbn) {
        __modifiedProperties.add("damageRefundKbn");
        this._damageRefundKbn = damageRefundKbn;
    }

    /**
     * [get] DIFFOCCAREA: {varchar(2)} <br>
     * @return The value of the column 'DIFFOCCAREA'. (NullAllowed)
     */
    public String getDiffoccarea() {
        return _diffoccarea;
    }

    /**
     * [set] DIFFOCCAREA: {varchar(2)} <br>
     * @param diffoccarea The value of the column 'DIFFOCCAREA'. (NullAllowed)
     */
    public void setDiffoccarea(String diffoccarea) {
        __modifiedProperties.add("diffoccarea");
        this._diffoccarea = diffoccarea;
    }

    /**
     * [get] CGGDID: {int(10)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {int(10)} <br>
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] DIFF_QTY: {int(10)} <br>
     * @return The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffQty() {
        return _diffQty;
    }

    /**
     * [set] DIFF_QTY: {int(10)} <br>
     * @param diffQty The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public void setDiffQty(java.math.BigDecimal diffQty) {
        __modifiedProperties.add("diffQty");
        this._diffQty = diffQty;
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
     * [get] CGGDID_NM: {int(10)} <br>
     * @return The value of the column 'CGGDID_NM'. (NullAllowed)
     */
    public String getCggdidNm() {
        return _cggdidNm;
    }

    /**
     * [set] CGGDID_NM: {int(10)} <br>
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
