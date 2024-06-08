package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlGetInventoryItem. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, STOCKDATE, PRODUCT_CD, ITEM_NAME, DUALITEMCDFLG, DUALITEMCD, YDAYTLEQULYTOTALINV, TDAY_DIFF, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, EXCESSTOTALINV, DEFECTTOTALINV, CAPITEMFLG, USER_CD, USER_NM, CGGDID_NM, INVENTORYREPORTINV, USERNUM3, CGGDID
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
public abstract class BsSqlGetInventoryItemDto implements Serializable {

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

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** ITEM_NAME: {varchar(60)} */
    @JsonKey
    protected String _itemName;

    /** DUALITEMCDFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _dualitemcdflg;

    /** DUALITEMCD: {varchar(30)} */
    @JsonKey
    protected String _dualitemcd;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAY_DIFF: {decimal(17, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayDiff;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investautoinv;

    /** EXCESSTOTALINV: {decimal(17, 6)} */
    @JsonKey
    protected java.math.BigDecimal _excesstotalinv;

    /** DEFECTTOTALINV: {decimal(17, 6)} */
    @JsonKey
    protected java.math.BigDecimal _defecttotalinv;

    /** CAPITEMFLG: {char(1)} */
    @JsonKey
    protected String _capitemflg;

    /** USER_CD: {varchar(30)} */
    @JsonKey
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** CGGDID_NM: {varchar(100)} */
    @JsonKey
    protected String _cggdidNm;

    /** INVENTORYREPORTINV: {varchar(19)} */
    @JsonKey
    protected String _inventoryreportinv;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlGetInventoryItemDto() {
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
        if (other == null || !(other instanceof BsSqlGetInventoryItemDto)) { return false; }
        final BsSqlGetInventoryItemDto otherEntity = (BsSqlGetInventoryItemDto)other;
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getStockdate(), otherEntity.getStockdate())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getItemName(), otherEntity.getItemName())) { return false; }
        if (!helpComparingValue(getDualitemcdflg(), otherEntity.getDualitemcdflg())) { return false; }
        if (!helpComparingValue(getDualitemcd(), otherEntity.getDualitemcd())) { return false; }
        if (!helpComparingValue(getYdaytlequlytotalinv(), otherEntity.getYdaytlequlytotalinv())) { return false; }
        if (!helpComparingValue(getTdayDiff(), otherEntity.getTdayDiff())) { return false; }
        if (!helpComparingValue(getSysinvtotalinv(), otherEntity.getSysinvtotalinv())) { return false; }
        if (!helpComparingValue(getInvesttotalinv(), otherEntity.getInvesttotalinv())) { return false; }
        if (!helpComparingValue(getInvestkeeplocinv(), otherEntity.getInvestkeeplocinv())) { return false; }
        if (!helpComparingValue(getInvestreceivelocinv(), otherEntity.getInvestreceivelocinv())) { return false; }
        if (!helpComparingValue(getInvestdamageitem(), otherEntity.getInvestdamageitem())) { return false; }
        if (!helpComparingValue(getInvestclssifylocinv(), otherEntity.getInvestclssifylocinv())) { return false; }
        if (!helpComparingValue(getInvesttmplocinv(), otherEntity.getInvesttmplocinv())) { return false; }
        if (!helpComparingValue(getInvestautoinv(), otherEntity.getInvestautoinv())) { return false; }
        if (!helpComparingValue(getExcesstotalinv(), otherEntity.getExcesstotalinv())) { return false; }
        if (!helpComparingValue(getDefecttotalinv(), otherEntity.getDefecttotalinv())) { return false; }
        if (!helpComparingValue(getCapitemflg(), otherEntity.getCapitemflg())) { return false; }
        if (!helpComparingValue(getUserCd(), otherEntity.getUserCd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getCggdidNm(), otherEntity.getCggdidNm())) { return false; }
        if (!helpComparingValue(getInventoryreportinv(), otherEntity.getInventoryreportinv())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlGetInventoryItem");
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getStockdate());
        result = xCH(result, getProductCd());
        result = xCH(result, getItemName());
        result = xCH(result, getDualitemcdflg());
        result = xCH(result, getDualitemcd());
        result = xCH(result, getYdaytlequlytotalinv());
        result = xCH(result, getTdayDiff());
        result = xCH(result, getSysinvtotalinv());
        result = xCH(result, getInvesttotalinv());
        result = xCH(result, getInvestkeeplocinv());
        result = xCH(result, getInvestreceivelocinv());
        result = xCH(result, getInvestdamageitem());
        result = xCH(result, getInvestclssifylocinv());
        result = xCH(result, getInvesttmplocinv());
        result = xCH(result, getInvestautoinv());
        result = xCH(result, getExcesstotalinv());
        result = xCH(result, getDefecttotalinv());
        result = xCH(result, getCapitemflg());
        result = xCH(result, getUserCd());
        result = xCH(result, getUserNm());
        result = xCH(result, getCggdidNm());
        result = xCH(result, getInventoryreportinv());
        result = xCH(result, getUsernum3());
        result = xCH(result, getCggdid());
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
        sb.append(c).append(getItemName());
        sb.append(c).append(getDualitemcdflg());
        sb.append(c).append(getDualitemcd());
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getTdayDiff());
        sb.append(c).append(getSysinvtotalinv());
        sb.append(c).append(getInvesttotalinv());
        sb.append(c).append(getInvestkeeplocinv());
        sb.append(c).append(getInvestreceivelocinv());
        sb.append(c).append(getInvestdamageitem());
        sb.append(c).append(getInvestclssifylocinv());
        sb.append(c).append(getInvesttmplocinv());
        sb.append(c).append(getInvestautoinv());
        sb.append(c).append(getExcesstotalinv());
        sb.append(c).append(getDefecttotalinv());
        sb.append(c).append(getCapitemflg());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getCggdidNm());
        sb.append(c).append(getInventoryreportinv());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getCggdid());
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
     * [get] ITEM_NAME: {varchar(60)} <br>
     * @return The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public String getItemName() {
        return _itemName;
    }

    /**
     * [set] ITEM_NAME: {varchar(60)} <br>
     * @param itemName The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public void setItemName(String itemName) {
        __modifiedProperties.add("itemName");
        this._itemName = itemName;
    }

    /**
     * [get] DUALITEMCDFLG: {decimal(16, 6)} <br>
     * @return The value of the column 'DUALITEMCDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getDualitemcdflg() {
        return _dualitemcdflg;
    }

    /**
     * [set] DUALITEMCDFLG: {decimal(16, 6)} <br>
     * @param dualitemcdflg The value of the column 'DUALITEMCDFLG'. (NullAllowed)
     */
    public void setDualitemcdflg(java.math.BigDecimal dualitemcdflg) {
        __modifiedProperties.add("dualitemcdflg");
        this._dualitemcdflg = dualitemcdflg;
    }

    /**
     * [get] DUALITEMCD: {varchar(30)} <br>
     * @return The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public String getDualitemcd() {
        return _dualitemcd;
    }

    /**
     * [set] DUALITEMCD: {varchar(30)} <br>
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public void setDualitemcd(String dualitemcd) {
        __modifiedProperties.add("dualitemcd");
        this._dualitemcd = dualitemcd;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAY_DIFF: {decimal(17, 6)} <br>
     * @return The value of the column 'TDAY_DIFF'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayDiff() {
        return _tdayDiff;
    }

    /**
     * [set] TDAY_DIFF: {decimal(17, 6)} <br>
     * @param tdayDiff The value of the column 'TDAY_DIFF'. (NullAllowed)
     */
    public void setTdayDiff(java.math.BigDecimal tdayDiff) {
        __modifiedProperties.add("tdayDiff");
        this._tdayDiff = tdayDiff;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] EXCESSTOTALINV: {decimal(17, 6)} <br>
     * @return The value of the column 'EXCESSTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getExcesstotalinv() {
        return _excesstotalinv;
    }

    /**
     * [set] EXCESSTOTALINV: {decimal(17, 6)} <br>
     * @param excesstotalinv The value of the column 'EXCESSTOTALINV'. (NullAllowed)
     */
    public void setExcesstotalinv(java.math.BigDecimal excesstotalinv) {
        __modifiedProperties.add("excesstotalinv");
        this._excesstotalinv = excesstotalinv;
    }

    /**
     * [get] DEFECTTOTALINV: {decimal(17, 6)} <br>
     * @return The value of the column 'DEFECTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getDefecttotalinv() {
        return _defecttotalinv;
    }

    /**
     * [set] DEFECTTOTALINV: {decimal(17, 6)} <br>
     * @param defecttotalinv The value of the column 'DEFECTTOTALINV'. (NullAllowed)
     */
    public void setDefecttotalinv(java.math.BigDecimal defecttotalinv) {
        __modifiedProperties.add("defecttotalinv");
        this._defecttotalinv = defecttotalinv;
    }

    /**
     * [get] CAPITEMFLG: {char(1)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public String getCapitemflg() {
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {char(1)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public void setCapitemflg(String capitemflg) {
        __modifiedProperties.add("capitemflg");
        this._capitemflg = capitemflg;
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
     * [get] INVENTORYREPORTINV: {varchar(19)} <br>
     * @return The value of the column 'INVENTORYREPORTINV'. (NullAllowed)
     */
    public String getInventoryreportinv() {
        return _inventoryreportinv;
    }

    /**
     * [set] INVENTORYREPORTINV: {varchar(19)} <br>
     * @param inventoryreportinv The value of the column 'INVENTORYREPORTINV'. (NullAllowed)
     */
    public void setInventoryreportinv(String inventoryreportinv) {
        __modifiedProperties.add("inventoryreportinv");
        this._inventoryreportinv = inventoryreportinv;
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

}
