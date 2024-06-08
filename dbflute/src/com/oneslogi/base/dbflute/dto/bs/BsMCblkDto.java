package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CBLK as TABLE. <br>
 * ブロックマスタ
 * <pre>
 * [primary-key]
 *     CBLK_ID
 *
 * [column]
 *     CBLK_ID, CENTER_ID, BLKCD, BLKNM, SRDTLMKFG, AMINPFG, LBLMKFG, LBLDFG, BCDDFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, SPRPRSID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CBLK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCblkDto implements Serializable {

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
    /** CBLK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _cblkId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** BLKCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _blkcd;

    /** BLKNM: {varchar(30)} */
    @JsonKey
    protected String _blknm;

    /** SRDTLMKFG: {char(1)} */
    @JsonKey
    protected String _srdtlmkfg;

    /** AMINPFG: {char(1)} */
    @JsonKey
    protected String _aminpfg;

    /** LBLMKFG: {char(1)} */
    @JsonKey
    protected String _lblmkfg;

    /** LBLDFG: {char(1)} */
    @JsonKey
    protected String _lbldfg;

    /** BCDDFG: {char(1)} */
    @JsonKey
    protected String _bcddfg;

    /** LOCIDFRNK: {char(1)} */
    @JsonKey
    protected String _locidfrnk;

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

    /** SFTPCLRSFID: {char(1)} */
    @JsonKey
    protected String _sftpclrsfid;

    /** TSNBOXRSFID: {char(1)} */
    @JsonKey
    protected String _tsnboxrsfid;

    /** JTBOXRSFID: {char(1)} */
    @JsonKey
    protected String _jtboxrsfid;

    /** HDRDBOXRSFID: {char(1)} */
    @JsonKey
    protected String _hdrdboxrsfid;

    /** ODRDVRSFID: {char(1)} */
    @JsonKey
    protected String _odrdvrsfid;

    /** PKGRT: {bigint(19)} */
    @JsonKey
    protected Long _pkgrt;

    /** SPRPRSID: {varchar(30)} */
    @JsonKey
    protected String _sprprsid;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCblkDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCblkDto)) { return false; }
        final BsMCblkDto otherEntity = (BsMCblkDto)other;
        if (!helpComparingValue(getCblkId(), otherEntity.getCblkId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CBLK");
        result = xCH(result, getCblkId());
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
        sb.append(c).append(getCblkId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getBlkcd());
        sb.append(c).append(getBlknm());
        sb.append(c).append(getSrdtlmkfg());
        sb.append(c).append(getAminpfg());
        sb.append(c).append(getLblmkfg());
        sb.append(c).append(getLbldfg());
        sb.append(c).append(getBcddfg());
        sb.append(c).append(getLocidfrnk());
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
        sb.append(c).append(getSftpclrsfid());
        sb.append(c).append(getTsnboxrsfid());
        sb.append(c).append(getJtboxrsfid());
        sb.append(c).append(getHdrdboxrsfid());
        sb.append(c).append(getOdrdvrsfid());
        sb.append(c).append(getPkgrt());
        sb.append(c).append(getSprprsid());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CBLK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ブロックID
     * @return The value of the column 'CBLK_ID'. (NullAllowed)
     */
    public Long getCblkId() {
        return _cblkId;
    }

    /**
     * [set] CBLK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ブロックID
     * @param cblkId The value of the column 'CBLK_ID'. (NullAllowed)
     */
    public void setCblkId(Long cblkId) {
        __modifiedProperties.add("cblkId");
        this._cblkId = cblkId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] BLKCD: {NotNull, varchar(30)} <br>
     * ブロックCD
     * @return The value of the column 'BLKCD'. (NullAllowed)
     */
    public String getBlkcd() {
        return _blkcd;
    }

    /**
     * [set] BLKCD: {NotNull, varchar(30)} <br>
     * ブロックCD
     * @param blkcd The value of the column 'BLKCD'. (NullAllowed)
     */
    public void setBlkcd(String blkcd) {
        __modifiedProperties.add("blkcd");
        this._blkcd = blkcd;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * ブロック名称
     * @return The value of the column 'BLKNM'. (NullAllowed)
     */
    public String getBlknm() {
        return _blknm;
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * ブロック名称
     * @param blknm The value of the column 'BLKNM'. (NullAllowed)
     */
    public void setBlknm(String blknm) {
        __modifiedProperties.add("blknm");
        this._blknm = blknm;
    }

    /**
     * [get] SRDTLMKFG: {char(1)} <br>
     * 仕分明細書作成フラグ
     * @return The value of the column 'SRDTLMKFG'. (NullAllowed)
     */
    public String getSrdtlmkfg() {
        return _srdtlmkfg;
    }

    /**
     * [set] SRDTLMKFG: {char(1)} <br>
     * 仕分明細書作成フラグ
     * @param srdtlmkfg The value of the column 'SRDTLMKFG'. (NullAllowed)
     */
    public void setSrdtlmkfg(String srdtlmkfg) {
        __modifiedProperties.add("srdtlmkfg");
        this._srdtlmkfg = srdtlmkfg;
    }

    /**
     * [get] AMINPFG: {char(1)} <br>
     * 実績入力フラグ
     * @return The value of the column 'AMINPFG'. (NullAllowed)
     */
    public String getAminpfg() {
        return _aminpfg;
    }

    /**
     * [set] AMINPFG: {char(1)} <br>
     * 実績入力フラグ
     * @param aminpfg The value of the column 'AMINPFG'. (NullAllowed)
     */
    public void setAminpfg(String aminpfg) {
        __modifiedProperties.add("aminpfg");
        this._aminpfg = aminpfg;
    }

    /**
     * [get] LBLMKFG: {char(1)} <br>
     * ラベル作成フラグ
     * @return The value of the column 'LBLMKFG'. (NullAllowed)
     */
    public String getLblmkfg() {
        return _lblmkfg;
    }

    /**
     * [set] LBLMKFG: {char(1)} <br>
     * ラベル作成フラグ
     * @param lblmkfg The value of the column 'LBLMKFG'. (NullAllowed)
     */
    public void setLblmkfg(String lblmkfg) {
        __modifiedProperties.add("lblmkfg");
        this._lblmkfg = lblmkfg;
    }

    /**
     * [get] LBLDFG: {char(1)} <br>
     * ラベル個口数表示フラグ
     * @return The value of the column 'LBLDFG'. (NullAllowed)
     */
    public String getLbldfg() {
        return _lbldfg;
    }

    /**
     * [set] LBLDFG: {char(1)} <br>
     * ラベル個口数表示フラグ
     * @param lbldfg The value of the column 'LBLDFG'. (NullAllowed)
     */
    public void setLbldfg(String lbldfg) {
        __modifiedProperties.add("lbldfg");
        this._lbldfg = lbldfg;
    }

    /**
     * [get] BCDDFG: {char(1)} <br>
     * バーコード表示フラグ
     * @return The value of the column 'BCDDFG'. (NullAllowed)
     */
    public String getBcddfg() {
        return _bcddfg;
    }

    /**
     * [set] BCDDFG: {char(1)} <br>
     * バーコード表示フラグ
     * @param bcddfg The value of the column 'BCDDFG'. (NullAllowed)
     */
    public void setBcddfg(String bcddfg) {
        __modifiedProperties.add("bcddfg");
        this._bcddfg = bcddfg;
    }

    /**
     * [get] LOCIDFRNK: {char(1)} <br>
     * ロケ不定のロケ貼付順
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public String getLocidfrnk() {
        return _locidfrnk;
    }

    /**
     * [set] LOCIDFRNK: {char(1)} <br>
     * ロケ不定のロケ貼付順
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public void setLocidfrnk(String locidfrnk) {
        __modifiedProperties.add("locidfrnk");
        this._locidfrnk = locidfrnk;
    }

    /**
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１)
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public Long getLocidfbrctg1() {
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１)
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        __modifiedProperties.add("locidfbrctg1");
        this._locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(２)
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public Long getLocidfbrctg2() {
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(２)
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        __modifiedProperties.add("locidfbrctg2");
        this._locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(３)
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public Long getLocidfbrctg3() {
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(３)
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        __modifiedProperties.add("locidfbrctg3");
        this._locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(４)
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public Long getLocidfbrctg4() {
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(４)
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        __modifiedProperties.add("locidfbrctg4");
        this._locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(５)
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public Long getLocidfbrctg5() {
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(５)
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        __modifiedProperties.add("locidfbrctg5");
        this._locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(６)
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public Long getLocidfbrctg6() {
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(６)
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        __modifiedProperties.add("locidfbrctg6");
        this._locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(７)
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public Long getLocidfbrctg7() {
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(７)
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        __modifiedProperties.add("locidfbrctg7");
        this._locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(８)
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public Long getLocidfbrctg8() {
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(８)
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        __modifiedProperties.add("locidfbrctg8");
        this._locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(９)
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public Long getLocidfbrctg9() {
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(９)
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        __modifiedProperties.add("locidfbrctg9");
        this._locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１０)
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public Long getLocidfbrctg10() {
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * ロケ不定の貼付銘柄カテゴリ(１０)
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        __modifiedProperties.add("locidfbrctg10");
        this._locidfbrctg10 = locidfbrctg10;
    }

    /**
     * [get] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @return The value of the column 'SFTPCLRSFID'. (NullAllowed)
     */
    public String getSftpclrsfid() {
        return _sftpclrsfid;
    }

    /**
     * [set] SFTPCLRSFID: {char(1)} <br>
     * ソフトパーセル拒否区分
     * @param sftpclrsfid The value of the column 'SFTPCLRSFID'. (NullAllowed)
     */
    public void setSftpclrsfid(String sftpclrsfid) {
        __modifiedProperties.add("sftpclrsfid");
        this._sftpclrsfid = sftpclrsfid;
    }

    /**
     * [get] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @return The value of the column 'TSNBOXRSFID'. (NullAllowed)
     */
    public String getTsnboxrsfid() {
        return _tsnboxrsfid;
    }

    /**
     * [set] TSNBOXRSFID: {char(1)} <br>
     * ＴＳＮＢＯＸ拒否区分
     * @param tsnboxrsfid The value of the column 'TSNBOXRSFID'. (NullAllowed)
     */
    public void setTsnboxrsfid(String tsnboxrsfid) {
        __modifiedProperties.add("tsnboxrsfid");
        this._tsnboxrsfid = tsnboxrsfid;
    }

    /**
     * [get] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @return The value of the column 'JTBOXRSFID'. (NullAllowed)
     */
    public String getJtboxrsfid() {
        return _jtboxrsfid;
    }

    /**
     * [set] JTBOXRSFID: {char(1)} <br>
     * ＪＴＢＯＸ拒否区分
     * @param jtboxrsfid The value of the column 'JTBOXRSFID'. (NullAllowed)
     */
    public void setJtboxrsfid(String jtboxrsfid) {
        __modifiedProperties.add("jtboxrsfid");
        this._jtboxrsfid = jtboxrsfid;
    }

    /**
     * [get] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @return The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public String getHdrdboxrsfid() {
        return _hdrdboxrsfid;
    }

    /**
     * [set] HDRDBOXRSFID: {char(1)} <br>
     * １００ＢＯＸ拒否区分
     * @param hdrdboxrsfid The value of the column 'HDRDBOXRSFID'. (NullAllowed)
     */
    public void setHdrdboxrsfid(String hdrdboxrsfid) {
        __modifiedProperties.add("hdrdboxrsfid");
        this._hdrdboxrsfid = hdrdboxrsfid;
    }

    /**
     * [get] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @return The value of the column 'ODRDVRSFID'. (NullAllowed)
     */
    public String getOdrdvrsfid() {
        return _odrdvrsfid;
    }

    /**
     * [set] ODRDVRSFID: {char(1)} <br>
     * オーダー分割拒否区分
     * @param odrdvrsfid The value of the column 'ODRDVRSFID'. (NullAllowed)
     */
    public void setOdrdvrsfid(String odrdvrsfid) {
        __modifiedProperties.add("odrdvrsfid");
        this._odrdvrsfid = odrdvrsfid;
    }

    /**
     * [get] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @return The value of the column 'PKGRT'. (NullAllowed)
     */
    public Long getPkgrt() {
        return _pkgrt;
    }

    /**
     * [set] PKGRT: {bigint(19)} <br>
     * 梱包率
     * @param pkgrt The value of the column 'PKGRT'. (NullAllowed)
     */
    public void setPkgrt(Long pkgrt) {
        __modifiedProperties.add("pkgrt");
        this._pkgrt = pkgrt;
    }

    /**
     * [get] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public String getSprprsid() {
        return _sprprsid;
    }

    /**
     * [set] SPRPRSID: {varchar(30)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed)
     */
    public void setSprprsid(String sprprsid) {
        __modifiedProperties.add("sprprsid");
        this._sprprsid = sprprsid;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
