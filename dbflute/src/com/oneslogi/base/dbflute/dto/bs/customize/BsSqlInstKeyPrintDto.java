package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInstKeyPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_H_ID, INVENTORY_DT, PRODUCT_CD, PRODUCT_NM, CGGDID, FCFLG, USERNUM4, USERNUM3, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, CHARGE_NUM, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, UNIT1, UNIT2, CGGDID_NM, FCFLG_NM
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
public abstract class BsSqlInstKeyPrintDto implements Serializable {

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
    /** INVENTORY_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _inventoryHId;

    /** INVENTORY_DT: {varchar(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** FCFLG: {varchar(30)} */
    @JsonKey
    protected String _fcflg;

    /** USERNUM4: {bigint(19)} */
    @JsonKey
    protected Long _usernum4;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** DIFFQTY_HENPIN: {bigint(19)} */
    @JsonKey
    protected Long _diffqtyHenpin;

    /** DIFFQTY_TAXREFOND: {bigint(19)} */
    @JsonKey
    protected Long _diffqtyTaxrefond;

    /** CHARGE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** SUFFERER_QTY: {bigint(19)} */
    @JsonKey
    protected Long _suffererQty;

    /** MONTH_STATUSSU: {bigint(19)} */
    @JsonKey
    protected Long _monthStatussu;

    /** BLUK_RECIVED_QTY: {bigint(19)} */
    @JsonKey
    protected Long _blukRecivedQty;

    /** REFUNDITEM_QTY: {bigint(19)} */
    @JsonKey
    protected Long _refunditemQty;

    /** UNIT1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** CGGDID_NM: {varchar(100)} */
    @JsonKey
    protected String _cggdidNm;

    /** FCFLG_NM: {varchar(100)} */
    @JsonKey
    protected String _fcflgNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInstKeyPrintDto() {
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
        if (other == null || !(other instanceof BsSqlInstKeyPrintDto)) { return false; }
        final BsSqlInstKeyPrintDto otherEntity = (BsSqlInstKeyPrintDto)other;
        if (!helpComparingValue(getInventoryHId(), otherEntity.getInventoryHId())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        if (!helpComparingValue(getFcflg(), otherEntity.getFcflg())) { return false; }
        if (!helpComparingValue(getUsernum4(), otherEntity.getUsernum4())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getDiffqtyHenpin(), otherEntity.getDiffqtyHenpin())) { return false; }
        if (!helpComparingValue(getDiffqtyTaxrefond(), otherEntity.getDiffqtyTaxrefond())) { return false; }
        if (!helpComparingValue(getChargeNum(), otherEntity.getChargeNum())) { return false; }
        if (!helpComparingValue(getSuffererQty(), otherEntity.getSuffererQty())) { return false; }
        if (!helpComparingValue(getMonthStatussu(), otherEntity.getMonthStatussu())) { return false; }
        if (!helpComparingValue(getBlukRecivedQty(), otherEntity.getBlukRecivedQty())) { return false; }
        if (!helpComparingValue(getRefunditemQty(), otherEntity.getRefunditemQty())) { return false; }
        if (!helpComparingValue(getUnit1(), otherEntity.getUnit1())) { return false; }
        if (!helpComparingValue(getUnit2(), otherEntity.getUnit2())) { return false; }
        if (!helpComparingValue(getCggdidNm(), otherEntity.getCggdidNm())) { return false; }
        if (!helpComparingValue(getFcflgNm(), otherEntity.getFcflgNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInstKeyPrint");
        result = xCH(result, getInventoryHId());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getCggdid());
        result = xCH(result, getFcflg());
        result = xCH(result, getUsernum4());
        result = xCH(result, getUsernum3());
        result = xCH(result, getDiffqtyHenpin());
        result = xCH(result, getDiffqtyTaxrefond());
        result = xCH(result, getChargeNum());
        result = xCH(result, getSuffererQty());
        result = xCH(result, getMonthStatussu());
        result = xCH(result, getBlukRecivedQty());
        result = xCH(result, getRefunditemQty());
        result = xCH(result, getUnit1());
        result = xCH(result, getUnit2());
        result = xCH(result, getCggdidNm());
        result = xCH(result, getFcflgNm());
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
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getFcflg());
        sb.append(c).append(getUsernum4());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getDiffqtyHenpin());
        sb.append(c).append(getDiffqtyTaxrefond());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getSuffererQty());
        sb.append(c).append(getMonthStatussu());
        sb.append(c).append(getBlukRecivedQty());
        sb.append(c).append(getRefunditemQty());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getCggdidNm());
        sb.append(c).append(getFcflgNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_H_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {bigint(19)} <br>
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
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
     * [get] FCFLG: {varchar(30)} <br>
     * @return The value of the column 'FCFLG'. (NullAllowed)
     */
    public String getFcflg() {
        return _fcflg;
    }

    /**
     * [set] FCFLG: {varchar(30)} <br>
     * @param fcflg The value of the column 'FCFLG'. (NullAllowed)
     */
    public void setFcflg(String fcflg) {
        __modifiedProperties.add("fcflg");
        this._fcflg = fcflg;
    }

    /**
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed)
     */
    public Long getUsernum4() {
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed)
     */
    public void setUsernum4(Long usernum4) {
        __modifiedProperties.add("usernum4");
        this._usernum4 = usernum4;
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
     * [get] DIFFQTY_HENPIN: {bigint(19)} <br>
     * @return The value of the column 'DIFFQTY_HENPIN'. (NullAllowed)
     */
    public Long getDiffqtyHenpin() {
        return _diffqtyHenpin;
    }

    /**
     * [set] DIFFQTY_HENPIN: {bigint(19)} <br>
     * @param diffqtyHenpin The value of the column 'DIFFQTY_HENPIN'. (NullAllowed)
     */
    public void setDiffqtyHenpin(Long diffqtyHenpin) {
        __modifiedProperties.add("diffqtyHenpin");
        this._diffqtyHenpin = diffqtyHenpin;
    }

    /**
     * [get] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * @return The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed)
     */
    public Long getDiffqtyTaxrefond() {
        return _diffqtyTaxrefond;
    }

    /**
     * [set] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * @param diffqtyTaxrefond The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed)
     */
    public void setDiffqtyTaxrefond(Long diffqtyTaxrefond) {
        __modifiedProperties.add("diffqtyTaxrefond");
        this._diffqtyTaxrefond = diffqtyTaxrefond;
    }

    /**
     * [get] CHARGE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] SUFFERER_QTY: {bigint(19)} <br>
     * @return The value of the column 'SUFFERER_QTY'. (NullAllowed)
     */
    public Long getSuffererQty() {
        return _suffererQty;
    }

    /**
     * [set] SUFFERER_QTY: {bigint(19)} <br>
     * @param suffererQty The value of the column 'SUFFERER_QTY'. (NullAllowed)
     */
    public void setSuffererQty(Long suffererQty) {
        __modifiedProperties.add("suffererQty");
        this._suffererQty = suffererQty;
    }

    /**
     * [get] MONTH_STATUSSU: {bigint(19)} <br>
     * @return The value of the column 'MONTH_STATUSSU'. (NullAllowed)
     */
    public Long getMonthStatussu() {
        return _monthStatussu;
    }

    /**
     * [set] MONTH_STATUSSU: {bigint(19)} <br>
     * @param monthStatussu The value of the column 'MONTH_STATUSSU'. (NullAllowed)
     */
    public void setMonthStatussu(Long monthStatussu) {
        __modifiedProperties.add("monthStatussu");
        this._monthStatussu = monthStatussu;
    }

    /**
     * [get] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * @return The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed)
     */
    public Long getBlukRecivedQty() {
        return _blukRecivedQty;
    }

    /**
     * [set] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * @param blukRecivedQty The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed)
     */
    public void setBlukRecivedQty(Long blukRecivedQty) {
        __modifiedProperties.add("blukRecivedQty");
        this._blukRecivedQty = blukRecivedQty;
    }

    /**
     * [get] REFUNDITEM_QTY: {bigint(19)} <br>
     * @return The value of the column 'REFUNDITEM_QTY'. (NullAllowed)
     */
    public Long getRefunditemQty() {
        return _refunditemQty;
    }

    /**
     * [set] REFUNDITEM_QTY: {bigint(19)} <br>
     * @param refunditemQty The value of the column 'REFUNDITEM_QTY'. (NullAllowed)
     */
    public void setRefunditemQty(Long refunditemQty) {
        __modifiedProperties.add("refunditemQty");
        this._refunditemQty = refunditemQty;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit1() {
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        __modifiedProperties.add("unit1");
        this._unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
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
     * [get] FCFLG_NM: {varchar(100)} <br>
     * @return The value of the column 'FCFLG_NM'. (NullAllowed)
     */
    public String getFcflgNm() {
        return _fcflgNm;
    }

    /**
     * [set] FCFLG_NM: {varchar(100)} <br>
     * @param fcflgNm The value of the column 'FCFLG_NM'. (NullAllowed)
     */
    public void setFcflgNm(String fcflgNm) {
        __modifiedProperties.add("fcflgNm");
        this._fcflgNm = fcflgNm;
    }

}
