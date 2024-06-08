package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlSortingPlaceMasterEditLin. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LINCD, LINNM, LINBLK1, LINBLK2, LINBLK3, HDRDBOXRSFID, PKGRT, SPRPRSID, DEL_FLG, CLIN_ID, VERSION_NO, CENTER_ID
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
public abstract class BsSqlSortingPlaceMasterEditLinDto implements Serializable {

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
    /** LINCD: {varchar(30)} */
    @JsonKey
    protected String _lincd;

    /** LINNM: {varchar(30)} */
    @JsonKey
    protected String _linnm;

    /** LINBLK1: {varchar(30)} */
    @JsonKey
    protected String _linblk1;

    /** LINBLK2: {varchar(30)} */
    @JsonKey
    protected String _linblk2;

    /** LINBLK3: {varchar(30)} */
    @JsonKey
    protected String _linblk3;

    /** HDRDBOXRSFID: {char(1)} */
    @JsonKey
    protected String _hdrdboxrsfid;

    /** PKGRT: {bigint(19)} */
    @JsonKey
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    @JsonKey
    protected String _sprprsid;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** CLIN_ID: {bigint(19)} */
    @JsonKey
    protected Long _clinId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

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
    public BsSqlSortingPlaceMasterEditLinDto() {
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
        if (other == null || !(other instanceof BsSqlSortingPlaceMasterEditLinDto)) { return false; }
        final BsSqlSortingPlaceMasterEditLinDto otherEntity = (BsSqlSortingPlaceMasterEditLinDto)other;
        if (!helpComparingValue(getLincd(), otherEntity.getLincd())) { return false; }
        if (!helpComparingValue(getLinnm(), otherEntity.getLinnm())) { return false; }
        if (!helpComparingValue(getLinblk1(), otherEntity.getLinblk1())) { return false; }
        if (!helpComparingValue(getLinblk2(), otherEntity.getLinblk2())) { return false; }
        if (!helpComparingValue(getLinblk3(), otherEntity.getLinblk3())) { return false; }
        if (!helpComparingValue(getHdrdboxrsfid(), otherEntity.getHdrdboxrsfid())) { return false; }
        if (!helpComparingValue(getPkgrt(), otherEntity.getPkgrt())) { return false; }
        if (!helpComparingValue(getSprprsid(), otherEntity.getSprprsid())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getClinId(), otherEntity.getClinId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlSortingPlaceMasterEditLin");
        result = xCH(result, getLincd());
        result = xCH(result, getLinnm());
        result = xCH(result, getLinblk1());
        result = xCH(result, getLinblk2());
        result = xCH(result, getLinblk3());
        result = xCH(result, getHdrdboxrsfid());
        result = xCH(result, getPkgrt());
        result = xCH(result, getSprprsid());
        result = xCH(result, getDelFlg());
        result = xCH(result, getClinId());
        result = xCH(result, getVersionNo());
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
        sb.append(c).append(getLincd());
        sb.append(c).append(getLinnm());
        sb.append(c).append(getLinblk1());
        sb.append(c).append(getLinblk2());
        sb.append(c).append(getLinblk3());
        sb.append(c).append(getHdrdboxrsfid());
        sb.append(c).append(getPkgrt());
        sb.append(c).append(getSprprsid());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getClinId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getCenterId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LINCD: {varchar(30)} <br>
     * @return The value of the column 'LINCD'. (NullAllowed)
     */
    public String getLincd() {
        return _lincd;
    }

    /**
     * [set] LINCD: {varchar(30)} <br>
     * @param lincd The value of the column 'LINCD'. (NullAllowed)
     */
    public void setLincd(String lincd) {
        __modifiedProperties.add("lincd");
        this._lincd = lincd;
    }

    /**
     * [get] LINNM: {varchar(30)} <br>
     * @return The value of the column 'LINNM'. (NullAllowed)
     */
    public String getLinnm() {
        return _linnm;
    }

    /**
     * [set] LINNM: {varchar(30)} <br>
     * @param linnm The value of the column 'LINNM'. (NullAllowed)
     */
    public void setLinnm(String linnm) {
        __modifiedProperties.add("linnm");
        this._linnm = linnm;
    }

    /**
     * [get] LINBLK1: {varchar(30)} <br>
     * @return The value of the column 'LINBLK1'. (NullAllowed)
     */
    public String getLinblk1() {
        return _linblk1;
    }

    /**
     * [set] LINBLK1: {varchar(30)} <br>
     * @param linblk1 The value of the column 'LINBLK1'. (NullAllowed)
     */
    public void setLinblk1(String linblk1) {
        __modifiedProperties.add("linblk1");
        this._linblk1 = linblk1;
    }

    /**
     * [get] LINBLK2: {varchar(30)} <br>
     * @return The value of the column 'LINBLK2'. (NullAllowed)
     */
    public String getLinblk2() {
        return _linblk2;
    }

    /**
     * [set] LINBLK2: {varchar(30)} <br>
     * @param linblk2 The value of the column 'LINBLK2'. (NullAllowed)
     */
    public void setLinblk2(String linblk2) {
        __modifiedProperties.add("linblk2");
        this._linblk2 = linblk2;
    }

    /**
     * [get] LINBLK3: {varchar(30)} <br>
     * @return The value of the column 'LINBLK3'. (NullAllowed)
     */
    public String getLinblk3() {
        return _linblk3;
    }

    /**
     * [set] LINBLK3: {varchar(30)} <br>
     * @param linblk3 The value of the column 'LINBLK3'. (NullAllowed)
     */
    public void setLinblk3(String linblk3) {
        __modifiedProperties.add("linblk3");
        this._linblk3 = linblk3;
    }

    /**
     * [get] HDRDBOXRSFID: {char(1)} <br>
     * @return The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public String getHdrdboxrsfid() {
        return _hdrdboxrsfid;
    }

    /**
     * [set] HDRDBOXRSFID: {char(1)} <br>
     * @param hdrdboxrsfid The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public void setHdrdboxrsfid(String hdrdboxrsfid) {
        __modifiedProperties.add("hdrdboxrsfid");
        this._hdrdboxrsfid = hdrdboxrsfid;
    }

    /**
     * [get] PKGRT: {bigint(19)} <br>
     * @return The value of the column 'PKGRT'. (NullAllowed)
     */
    public Long getPkgrt() {
        return _pkgrt;
    }

    /**
     * [set] PKGRT: {bigint(19)} <br>
     * @param pkgrt The value of the column 'PKGRT'. (NullAllowed)
     */
    public void setPkgrt(Long pkgrt) {
        __modifiedProperties.add("pkgrt");
        this._pkgrt = pkgrt;
    }

    /**
     * [get] SPRPRSID: {varchar(30)} <br>
     * @return The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public String getSprprsid() {
        return _sprprsid;
    }

    /**
     * [set] SPRPRSID: {varchar(30)} <br>
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public void setSprprsid(String sprprsid) {
        __modifiedProperties.add("sprprsid");
        this._sprprsid = sprprsid;
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
     * [get] CLIN_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIN_ID'. (NullAllowed)
     */
    public Long getClinId() {
        return _clinId;
    }

    /**
     * [set] CLIN_ID: {bigint(19)} <br>
     * @param clinId The value of the column 'CLIN_ID'. (NullAllowed)
     */
    public void setClinId(Long clinId) {
        __modifiedProperties.add("clinId");
        this._clinId = clinId;
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

}
