package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlNotGoodItemReportList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, INVDATE, PRODUCT_CD, PRODUCT_NM, INADEQUACYAREA, DIFFQTY, CGGDID, USER_CD, USER_NM, CGGDID_NM, INOUTKBN_NM, PRINTCOUNT, EMTPYFLAG
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
public abstract class BsSqlNotGoodItemReportListDto implements Serializable {

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

    /** INVDATE: {varchar(8)} */
    @JsonKey
    protected String _invdate;

    /** PRODUCT_CD: {int(10)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {int(10)} */
    @JsonKey
    protected String _productNm;

    /** INADEQUACYAREA: {varchar(2)} */
    @JsonKey
    protected String _inadequacyarea;

    /** DIFFQTY: {int(10)} */
    @JsonKey
    protected java.math.BigDecimal _diffqty;

    /** CGGDID: {int(10)} */
    @JsonKey
    protected String _cggdid;

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
    public BsSqlNotGoodItemReportListDto() {
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
        if (other == null || !(other instanceof BsSqlNotGoodItemReportListDto)) { return false; }
        final BsSqlNotGoodItemReportListDto otherEntity = (BsSqlNotGoodItemReportListDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getInvdate(), otherEntity.getInvdate())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getInadequacyarea(), otherEntity.getInadequacyarea())) { return false; }
        if (!helpComparingValue(getDiffqty(), otherEntity.getDiffqty())) { return false; }
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
        result = xCH(result, "SqlNotGoodItemReportList");
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getInvdate());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getInadequacyarea());
        result = xCH(result, getDiffqty());
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
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getInvdate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getInadequacyarea());
        sb.append(c).append(getDiffqty());
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
     * [get] INADEQUACYAREA: {varchar(2)} <br>
     * @return The value of the column 'INADEQUACYAREA'. (NullAllowed)
     */
    public String getInadequacyarea() {
        return _inadequacyarea;
    }

    /**
     * [set] INADEQUACYAREA: {varchar(2)} <br>
     * @param inadequacyarea The value of the column 'INADEQUACYAREA'. (NullAllowed)
     */
    public void setInadequacyarea(String inadequacyarea) {
        __modifiedProperties.add("inadequacyarea");
        this._inadequacyarea = inadequacyarea;
    }

    /**
     * [get] DIFFQTY: {int(10)} <br>
     * @return The value of the column 'DIFFQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffqty() {
        return _diffqty;
    }

    /**
     * [set] DIFFQTY: {int(10)} <br>
     * @param diffqty The value of the column 'DIFFQTY'. (NullAllowed)
     */
    public void setDiffqty(java.math.BigDecimal diffqty) {
        __modifiedProperties.add("diffqty");
        this._diffqty = diffqty;
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
