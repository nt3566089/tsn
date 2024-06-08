package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlDrcdizqaList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_ID, ZZMATNR, LINBLK, LOCID, SRRNK, SROPRTCNT, DED, PSTNID, ZQACP, ZQACTQA, UNIT1, UNIT2, LOCATION_ID
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
public abstract class BsSqlDrcdizqaListDto implements Serializable {

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
    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** ZZMATNR: {varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCID: {varchar(30)} */
    @JsonKey
    protected String _locid;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** DED: {varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {varchar(30)} */
    @JsonKey
    protected String _pstnid;

    /** ZQACP: {bigint(19)} */
    @JsonKey
    protected Long _zqacp;

    /** ZQACTQA: {bigint(19)} */
    @JsonKey
    protected Long _zqactqa;

    /** UNIT1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlDrcdizqaListDto() {
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
        if (other == null || !(other instanceof BsSqlDrcdizqaListDto)) { return false; }
        final BsSqlDrcdizqaListDto otherEntity = (BsSqlDrcdizqaListDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getZzmatnr(), otherEntity.getZzmatnr())) { return false; }
        if (!helpComparingValue(getLinblk(), otherEntity.getLinblk())) { return false; }
        if (!helpComparingValue(getLocid(), otherEntity.getLocid())) { return false; }
        if (!helpComparingValue(getSrrnk(), otherEntity.getSrrnk())) { return false; }
        if (!helpComparingValue(getSroprtcnt(), otherEntity.getSroprtcnt())) { return false; }
        if (!helpComparingValue(getDed(), otherEntity.getDed())) { return false; }
        if (!helpComparingValue(getPstnid(), otherEntity.getPstnid())) { return false; }
        if (!helpComparingValue(getZqacp(), otherEntity.getZqacp())) { return false; }
        if (!helpComparingValue(getZqactqa(), otherEntity.getZqactqa())) { return false; }
        if (!helpComparingValue(getUnit1(), otherEntity.getUnit1())) { return false; }
        if (!helpComparingValue(getUnit2(), otherEntity.getUnit2())) { return false; }
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlDrcdizqaList");
        result = xCH(result, getProductId());
        result = xCH(result, getZzmatnr());
        result = xCH(result, getLinblk());
        result = xCH(result, getLocid());
        result = xCH(result, getSrrnk());
        result = xCH(result, getSroprtcnt());
        result = xCH(result, getDed());
        result = xCH(result, getPstnid());
        result = xCH(result, getZqacp());
        result = xCH(result, getZqactqa());
        result = xCH(result, getUnit1());
        result = xCH(result, getUnit2());
        result = xCH(result, getLocationId());
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
        sb.append(c).append(getProductId());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocid());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getZqacp());
        sb.append(c).append(getZqactqa());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getLocationId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCID: {varchar(30)} <br>
     * @return The value of the column 'LOCID'. (NullAllowed)
     */
    public String getLocid() {
        return _locid;
    }

    /**
     * [set] LOCID: {varchar(30)} <br>
     * @param locid The value of the column 'LOCID'. (NullAllowed)
     */
    public void setLocid(String locid) {
        __modifiedProperties.add("locid");
        this._locid = locid;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * @return The value of the column 'SRRNK'. (NullAllowed)
     */
    public Long getSrrnk() {
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed)
     */
    public void setSrrnk(Long srrnk) {
        __modifiedProperties.add("srrnk");
        this._srrnk = srrnk;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] PSTNID: {varchar(30)} <br>
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {varchar(30)} <br>
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] ZQACP: {bigint(19)} <br>
     * @return The value of the column 'ZQACP'. (NullAllowed)
     */
    public Long getZqacp() {
        return _zqacp;
    }

    /**
     * [set] ZQACP: {bigint(19)} <br>
     * @param zqacp The value of the column 'ZQACP'. (NullAllowed)
     */
    public void setZqacp(Long zqacp) {
        __modifiedProperties.add("zqacp");
        this._zqacp = zqacp;
    }

    /**
     * [get] ZQACTQA: {bigint(19)} <br>
     * @return The value of the column 'ZQACTQA'. (NullAllowed)
     */
    public Long getZqactqa() {
        return _zqactqa;
    }

    /**
     * [set] ZQACTQA: {bigint(19)} <br>
     * @param zqactqa The value of the column 'ZQACTQA'. (NullAllowed)
     */
    public void setZqactqa(Long zqactqa) {
        __modifiedProperties.add("zqactqa");
        this._zqactqa = zqactqa;
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
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

}
