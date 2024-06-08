package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlBoxMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BOX_CD, BOX_NM, BOX_TYPE, BOX_TYPE_NM, BXWEIGHT, BXOSZL, BXOSZW, BXOSZH, LENGTH, WIDTH, HEIGHT, BXCPY, VOLUME_RATE, DEL_FLG, DEL_FLG_NM, VERSION_NO, BOX_ID, CENTER_ID
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
public abstract class BsSqlBoxMasterDto implements Serializable {

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
    /** BOX_CD: {varchar(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {varchar(60)} */
    @JsonKey
    protected String _boxNm;

    /** BOX_TYPE: {varchar(30)} */
    @JsonKey
    protected String _boxType;

    /** BOX_TYPE_NM: {int(10)} */
    @JsonKey
    protected String _boxTypeNm;

    /** BXWEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _bxweight;

    /** BXOSZL: {bigint(19)} */
    @JsonKey
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    @JsonKey
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    @JsonKey
    protected Long _bxoszh;

    /** LENGTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _height;

    /** BXCPY: {float(15)} */
    @JsonKey
    protected java.math.BigDecimal _bxcpy;

    /** VOLUME_RATE: {bigint(19)} */
    @JsonKey
    protected Long _volumeRate;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    @JsonKey
    protected String _delFlgNm;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** BOX_ID: {bigint(19)} */
    @JsonKey
    protected Long _boxId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlBoxMasterDto() {
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
        if (other == null || !(other instanceof BsSqlBoxMasterDto)) { return false; }
        final BsSqlBoxMasterDto otherEntity = (BsSqlBoxMasterDto)other;
        if (!helpComparingValue(getBoxCd(), otherEntity.getBoxCd())) { return false; }
        if (!helpComparingValue(getBoxNm(), otherEntity.getBoxNm())) { return false; }
        if (!helpComparingValue(getBoxType(), otherEntity.getBoxType())) { return false; }
        if (!helpComparingValue(getBoxTypeNm(), otherEntity.getBoxTypeNm())) { return false; }
        if (!helpComparingValue(getBxweight(), otherEntity.getBxweight())) { return false; }
        if (!helpComparingValue(getBxoszl(), otherEntity.getBxoszl())) { return false; }
        if (!helpComparingValue(getBxoszw(), otherEntity.getBxoszw())) { return false; }
        if (!helpComparingValue(getBxoszh(), otherEntity.getBxoszh())) { return false; }
        if (!helpComparingValue(getLength(), otherEntity.getLength())) { return false; }
        if (!helpComparingValue(getWidth(), otherEntity.getWidth())) { return false; }
        if (!helpComparingValue(getHeight(), otherEntity.getHeight())) { return false; }
        if (!helpComparingValue(getBxcpy(), otherEntity.getBxcpy())) { return false; }
        if (!helpComparingValue(getVolumeRate(), otherEntity.getVolumeRate())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getDelFlgNm(), otherEntity.getDelFlgNm())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getBoxId(), otherEntity.getBoxId())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlBoxMaster");
        result = xCH(result, getBoxCd());
        result = xCH(result, getBoxNm());
        result = xCH(result, getBoxType());
        result = xCH(result, getBoxTypeNm());
        result = xCH(result, getBxweight());
        result = xCH(result, getBxoszl());
        result = xCH(result, getBxoszw());
        result = xCH(result, getBxoszh());
        result = xCH(result, getLength());
        result = xCH(result, getWidth());
        result = xCH(result, getHeight());
        result = xCH(result, getBxcpy());
        result = xCH(result, getVolumeRate());
        result = xCH(result, getDelFlg());
        result = xCH(result, getDelFlgNm());
        result = xCH(result, getVersionNo());
        result = xCH(result, getBoxId());
        result = xCH(result, getCenterId());
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
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getBoxType());
        sb.append(c).append(getBoxTypeNm());
        sb.append(c).append(getBxweight());
        sb.append(c).append(getBxoszl());
        sb.append(c).append(getBxoszw());
        sb.append(c).append(getBxoszh());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getBxcpy());
        sb.append(c).append(getVolumeRate());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getDelFlgNm());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getBoxId());
        sb.append(c).append(getCenterId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOX_CD: {varchar(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {varchar(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {varchar(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {varchar(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] BOX_TYPE: {varchar(30)} <br>
     * @return The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public String getBoxType() {
        return _boxType;
    }

    /**
     * [set] BOX_TYPE: {varchar(30)} <br>
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed)
     */
    public void setBoxType(String boxType) {
        __modifiedProperties.add("boxType");
        this._boxType = boxType;
    }

    /**
     * [get] BOX_TYPE_NM: {int(10)} <br>
     * @return The value of the column 'BOX_TYPE_NM'. (NullAllowed)
     */
    public String getBoxTypeNm() {
        return _boxTypeNm;
    }

    /**
     * [set] BOX_TYPE_NM: {int(10)} <br>
     * @param boxTypeNm The value of the column 'BOX_TYPE_NM'. (NullAllowed)
     */
    public void setBoxTypeNm(String boxTypeNm) {
        __modifiedProperties.add("boxTypeNm");
        this._boxTypeNm = boxTypeNm;
    }

    /**
     * [get] BXWEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getBxweight() {
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {decimal(16, 6)} <br>
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed)
     */
    public void setBxweight(java.math.BigDecimal bxweight) {
        __modifiedProperties.add("bxweight");
        this._bxweight = bxweight;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * @return The value of the column 'BXOSZL'. (NullAllowed)
     */
    public Long getBxoszl() {
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed)
     */
    public void setBxoszl(Long bxoszl) {
        __modifiedProperties.add("bxoszl");
        this._bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * @return The value of the column 'BXOSZW'. (NullAllowed)
     */
    public Long getBxoszw() {
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed)
     */
    public void setBxoszw(Long bxoszw) {
        __modifiedProperties.add("bxoszw");
        this._bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * @return The value of the column 'BXOSZH'. (NullAllowed)
     */
    public Long getBxoszh() {
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed)
     */
    public void setBxoszh(Long bxoszh) {
        __modifiedProperties.add("bxoszh");
        this._bxoszh = bxoszh;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public java.math.BigDecimal getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(java.math.BigDecimal length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public java.math.BigDecimal getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(java.math.BigDecimal width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(java.math.BigDecimal height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] BXCPY: {float(15)} <br>
     * @return The value of the column 'BXCPY'. (NullAllowed)
     */
    public java.math.BigDecimal getBxcpy() {
        return _bxcpy;
    }

    /**
     * [set] BXCPY: {float(15)} <br>
     * @param bxcpy The value of the column 'BXCPY'. (NullAllowed)
     */
    public void setBxcpy(java.math.BigDecimal bxcpy) {
        __modifiedProperties.add("bxcpy");
        this._bxcpy = bxcpy;
    }

    /**
     * [get] VOLUME_RATE: {bigint(19)} <br>
     * @return The value of the column 'VOLUME_RATE'. (NullAllowed)
     */
    public Long getVolumeRate() {
        return _volumeRate;
    }

    /**
     * [set] VOLUME_RATE: {bigint(19)} <br>
     * @param volumeRate The value of the column 'VOLUME_RATE'. (NullAllowed)
     */
    public void setVolumeRate(Long volumeRate) {
        __modifiedProperties.add("volumeRate");
        this._volumeRate = volumeRate;
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
     * [get] BOX_ID: {bigint(19)} <br>
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {bigint(19)} <br>
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
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

}
