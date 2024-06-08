package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlSortingPlaceMasterListBlk. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BLKCD, BLKNM, LOCIDFRNK, LOCIDFRNK_NM, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, LOCIDFBRCTG, HDRDBOXRSFID, HDRDBOXRSFID_NM, PKGRT, SPRPRSID, SPRPRSID_NM, DEL_FLG, DEL_FLG_NM
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
public abstract class BsSqlSortingPlaceMasterListBlkDto implements Serializable {

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
    /** BLKCD: {varchar(30)} */
    @JsonKey
    protected String _blkcd;

    /** BLKNM: {varchar(30)} */
    @JsonKey
    protected String _blknm;

    /** LOCIDFRNK: {char(1)} */
    @JsonKey
    protected String _locidfrnk;

    /** LOCIDFRNK_NM: {int(10)} */
    @JsonKey
    protected String _locidfrnkNm;

    /** LOCIDFBRCTG1: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg1;

    /** LOCIDFBRCTG2: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg2;

    /** LOCIDFBRCTG3: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg3;

    /** LOCIDFBRCTG4: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg4;

    /** LOCIDFBRCTG5: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg5;

    /** LOCIDFBRCTG6: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg6;

    /** LOCIDFBRCTG7: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg7;

    /** LOCIDFBRCTG8: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg8;

    /** LOCIDFBRCTG9: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg9;

    /** LOCIDFBRCTG10: {bigint(19)} */
    @JsonKey
    protected Long _locidfbrctg10;

    /** LOCIDFBRCTG: {int(10)} */
    @JsonKey
    protected String _locidfbrctg;

    /** HDRDBOXRSFID: {char(1)} */
    @JsonKey
    protected String _hdrdboxrsfid;

    /** HDRDBOXRSFID_NM: {int(10)} */
    @JsonKey
    protected String _hdrdboxrsfidNm;

    /** PKGRT: {bigint(19)} */
    @JsonKey
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    @JsonKey
    protected String _sprprsid;

    /** SPRPRSID_NM: {int(10)} */
    @JsonKey
    protected String _sprprsidNm;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** DEL_FLG_NM: {int(10)} */
    @JsonKey
    protected String _delFlgNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlSortingPlaceMasterListBlkDto() {
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
        if (other == null || !(other instanceof BsSqlSortingPlaceMasterListBlkDto)) { return false; }
        final BsSqlSortingPlaceMasterListBlkDto otherEntity = (BsSqlSortingPlaceMasterListBlkDto)other;
        if (!helpComparingValue(getBlkcd(), otherEntity.getBlkcd())) { return false; }
        if (!helpComparingValue(getBlknm(), otherEntity.getBlknm())) { return false; }
        if (!helpComparingValue(getLocidfrnk(), otherEntity.getLocidfrnk())) { return false; }
        if (!helpComparingValue(getLocidfrnkNm(), otherEntity.getLocidfrnkNm())) { return false; }
        if (!helpComparingValue(getLocidfbrctg1(), otherEntity.getLocidfbrctg1())) { return false; }
        if (!helpComparingValue(getLocidfbrctg2(), otherEntity.getLocidfbrctg2())) { return false; }
        if (!helpComparingValue(getLocidfbrctg3(), otherEntity.getLocidfbrctg3())) { return false; }
        if (!helpComparingValue(getLocidfbrctg4(), otherEntity.getLocidfbrctg4())) { return false; }
        if (!helpComparingValue(getLocidfbrctg5(), otherEntity.getLocidfbrctg5())) { return false; }
        if (!helpComparingValue(getLocidfbrctg6(), otherEntity.getLocidfbrctg6())) { return false; }
        if (!helpComparingValue(getLocidfbrctg7(), otherEntity.getLocidfbrctg7())) { return false; }
        if (!helpComparingValue(getLocidfbrctg8(), otherEntity.getLocidfbrctg8())) { return false; }
        if (!helpComparingValue(getLocidfbrctg9(), otherEntity.getLocidfbrctg9())) { return false; }
        if (!helpComparingValue(getLocidfbrctg10(), otherEntity.getLocidfbrctg10())) { return false; }
        if (!helpComparingValue(getLocidfbrctg(), otherEntity.getLocidfbrctg())) { return false; }
        if (!helpComparingValue(getHdrdboxrsfid(), otherEntity.getHdrdboxrsfid())) { return false; }
        if (!helpComparingValue(getHdrdboxrsfidNm(), otherEntity.getHdrdboxrsfidNm())) { return false; }
        if (!helpComparingValue(getPkgrt(), otherEntity.getPkgrt())) { return false; }
        if (!helpComparingValue(getSprprsid(), otherEntity.getSprprsid())) { return false; }
        if (!helpComparingValue(getSprprsidNm(), otherEntity.getSprprsidNm())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getDelFlgNm(), otherEntity.getDelFlgNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlSortingPlaceMasterListBlk");
        result = xCH(result, getBlkcd());
        result = xCH(result, getBlknm());
        result = xCH(result, getLocidfrnk());
        result = xCH(result, getLocidfrnkNm());
        result = xCH(result, getLocidfbrctg1());
        result = xCH(result, getLocidfbrctg2());
        result = xCH(result, getLocidfbrctg3());
        result = xCH(result, getLocidfbrctg4());
        result = xCH(result, getLocidfbrctg5());
        result = xCH(result, getLocidfbrctg6());
        result = xCH(result, getLocidfbrctg7());
        result = xCH(result, getLocidfbrctg8());
        result = xCH(result, getLocidfbrctg9());
        result = xCH(result, getLocidfbrctg10());
        result = xCH(result, getLocidfbrctg());
        result = xCH(result, getHdrdboxrsfid());
        result = xCH(result, getHdrdboxrsfidNm());
        result = xCH(result, getPkgrt());
        result = xCH(result, getSprprsid());
        result = xCH(result, getSprprsidNm());
        result = xCH(result, getDelFlg());
        result = xCH(result, getDelFlgNm());
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
        sb.append(c).append(getBlkcd());
        sb.append(c).append(getBlknm());
        sb.append(c).append(getLocidfrnk());
        sb.append(c).append(getLocidfrnkNm());
        sb.append(c).append(getLocidfbrctg1());
        sb.append(c).append(getLocidfbrctg2());
        sb.append(c).append(getLocidfbrctg3());
        sb.append(c).append(getLocidfbrctg4());
        sb.append(c).append(getLocidfbrctg5());
        sb.append(c).append(getLocidfbrctg6());
        sb.append(c).append(getLocidfbrctg7());
        sb.append(c).append(getLocidfbrctg8());
        sb.append(c).append(getLocidfbrctg9());
        sb.append(c).append(getLocidfbrctg10());
        sb.append(c).append(getLocidfbrctg());
        sb.append(c).append(getHdrdboxrsfid());
        sb.append(c).append(getHdrdboxrsfidNm());
        sb.append(c).append(getPkgrt());
        sb.append(c).append(getSprprsid());
        sb.append(c).append(getSprprsidNm());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getDelFlgNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLKCD: {varchar(30)} <br>
     * @return The value of the column 'BLKCD'. (NullAllowed)
     */
    public String getBlkcd() {
        return _blkcd;
    }

    /**
     * [set] BLKCD: {varchar(30)} <br>
     * @param blkcd The value of the column 'BLKCD'. (NullAllowed)
     */
    public void setBlkcd(String blkcd) {
        __modifiedProperties.add("blkcd");
        this._blkcd = blkcd;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * @return The value of the column 'BLKNM'. (NullAllowed)
     */
    public String getBlknm() {
        return _blknm;
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * @param blknm The value of the column 'BLKNM'. (NullAllowed)
     */
    public void setBlknm(String blknm) {
        __modifiedProperties.add("blknm");
        this._blknm = blknm;
    }

    /**
     * [get] LOCIDFRNK: {char(1)} <br>
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public String getLocidfrnk() {
        return _locidfrnk;
    }

    /**
     * [set] LOCIDFRNK: {char(1)} <br>
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public void setLocidfrnk(String locidfrnk) {
        __modifiedProperties.add("locidfrnk");
        this._locidfrnk = locidfrnk;
    }

    /**
     * [get] LOCIDFRNK_NM: {int(10)} <br>
     * @return The value of the column 'LOCIDFRNK_NM'. (NullAllowed)
     */
    public String getLocidfrnkNm() {
        return _locidfrnkNm;
    }

    /**
     * [set] LOCIDFRNK_NM: {int(10)} <br>
     * @param locidfrnkNm The value of the column 'LOCIDFRNK_NM'. (NullAllowed)
     */
    public void setLocidfrnkNm(String locidfrnkNm) {
        __modifiedProperties.add("locidfrnkNm");
        this._locidfrnkNm = locidfrnkNm;
    }

    /**
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public Long getLocidfbrctg1() {
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        __modifiedProperties.add("locidfbrctg1");
        this._locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public Long getLocidfbrctg2() {
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        __modifiedProperties.add("locidfbrctg2");
        this._locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public Long getLocidfbrctg3() {
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        __modifiedProperties.add("locidfbrctg3");
        this._locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public Long getLocidfbrctg4() {
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        __modifiedProperties.add("locidfbrctg4");
        this._locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public Long getLocidfbrctg5() {
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        __modifiedProperties.add("locidfbrctg5");
        this._locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public Long getLocidfbrctg6() {
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        __modifiedProperties.add("locidfbrctg6");
        this._locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public Long getLocidfbrctg7() {
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        __modifiedProperties.add("locidfbrctg7");
        this._locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public Long getLocidfbrctg8() {
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        __modifiedProperties.add("locidfbrctg8");
        this._locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public Long getLocidfbrctg9() {
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        __modifiedProperties.add("locidfbrctg9");
        this._locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public Long getLocidfbrctg10() {
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        __modifiedProperties.add("locidfbrctg10");
        this._locidfbrctg10 = locidfbrctg10;
    }

    /**
     * [get] LOCIDFBRCTG: {int(10)} <br>
     * @return The value of the column 'LOCIDFBRCTG'. (NullAllowed)
     */
    public String getLocidfbrctg() {
        return _locidfbrctg;
    }

    /**
     * [set] LOCIDFBRCTG: {int(10)} <br>
     * @param locidfbrctg The value of the column 'LOCIDFBRCTG'. (NullAllowed)
     */
    public void setLocidfbrctg(String locidfbrctg) {
        __modifiedProperties.add("locidfbrctg");
        this._locidfbrctg = locidfbrctg;
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
     * [get] HDRDBOXRSFID_NM: {int(10)} <br>
     * @return The value of the column 'HDRDBOXRSFID_NM'. (NullAllowed)
     */
    public String getHdrdboxrsfidNm() {
        return _hdrdboxrsfidNm;
    }

    /**
     * [set] HDRDBOXRSFID_NM: {int(10)} <br>
     * @param hdrdboxrsfidNm The value of the column 'HDRDBOXRSFID_NM'. (NullAllowed)
     */
    public void setHdrdboxrsfidNm(String hdrdboxrsfidNm) {
        __modifiedProperties.add("hdrdboxrsfidNm");
        this._hdrdboxrsfidNm = hdrdboxrsfidNm;
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
     * [get] SPRPRSID_NM: {int(10)} <br>
     * @return The value of the column 'SPRPRSID_NM'. (NullAllowed)
     */
    public String getSprprsidNm() {
        return _sprprsidNm;
    }

    /**
     * [set] SPRPRSID_NM: {int(10)} <br>
     * @param sprprsidNm The value of the column 'SPRPRSID_NM'. (NullAllowed)
     */
    public void setSprprsidNm(String sprprsidNm) {
        __modifiedProperties.add("sprprsidNm");
        this._sprprsidNm = sprprsidNm;
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

}
