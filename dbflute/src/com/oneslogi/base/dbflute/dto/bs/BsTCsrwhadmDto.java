package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_CSRWHADM as TABLE. <br>
 * 仕分拠点管理
 * <pre>
 * [primary-key]
 *     SORT_PLACE_MANAGE_ID
 *
 * [column]
 *     SORT_PLACE_MANAGE_ID, CENTER_ID, ZZORGNCD, SRYMD, SROPRTCNT, PRESPLCNT, SRPMTFG, MNTPMTFG, CORDRCVCNT, REFVALUE, SFTPCLMGN, TDAYESRCOMPFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SORTING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_PLACE_MANAGE_ID
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
public abstract class BsTCsrwhadmDto implements Serializable {

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
    /** SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sortPlaceManageId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** SRYMD: {varchar(8)} */
    @JsonKey
    protected String _srymd;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** PRESPLCNT: {bigint(19)} */
    @JsonKey
    protected Long _presplcnt;

    /** SRPMTFG: {char(1)} */
    @JsonKey
    protected String _srpmtfg;

    /** MNTPMTFG: {char(1)} */
    @JsonKey
    protected String _mntpmtfg;

    /** CORDRCVCNT: {bigint(19)} */
    @JsonKey
    protected Long _cordrcvcnt;

    /** REFVALUE: {bigint(19)} */
    @JsonKey
    protected Long _refvalue;

    /** SFTPCLMGN: {bigint(19)} */
    @JsonKey
    protected Long _sftpclmgn;

    /** TDAYESRCOMPFG: {char(1)} */
    @JsonKey
    protected String _tdayesrcompfg;

    /** LOCIDFRNK: {varchar(30)} */
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

    /** SORTING_FLG: {char(1)} */
    @JsonKey
    protected String _sortingFlg;

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
    public BsTCsrwhadmDto() {
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
        if (other == null || !(other instanceof BsTCsrwhadmDto)) { return false; }
        final BsTCsrwhadmDto otherEntity = (BsTCsrwhadmDto)other;
        if (!helpComparingValue(getSortPlaceManageId(), otherEntity.getSortPlaceManageId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CSRWHADM");
        result = xCH(result, getSortPlaceManageId());
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
        sb.append(c).append(getSortPlaceManageId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getSrymd());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getPresplcnt());
        sb.append(c).append(getSrpmtfg());
        sb.append(c).append(getMntpmtfg());
        sb.append(c).append(getCordrcvcnt());
        sb.append(c).append(getRefvalue());
        sb.append(c).append(getSftpclmgn());
        sb.append(c).append(getTdayesrcompfg());
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
        sb.append(c).append(getSortingFlg());
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
     * [get] SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分拠点管理ID
     * @return The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed)
     */
    public Long getSortPlaceManageId() {
        return _sortPlaceManageId;
    }

    /**
     * [set] SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分拠点管理ID
     * @param sortPlaceManageId The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed)
     */
    public void setSortPlaceManageId(Long sortPlaceManageId) {
        __modifiedProperties.add("sortPlaceManageId");
        this._sortPlaceManageId = sortPlaceManageId;
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
     * [get] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public String getZzorgncd() {
        return _zzorgncd;
    }

    /**
     * [set] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public void setZzorgncd(String zzorgncd) {
        __modifiedProperties.add("zzorgncd");
        this._zzorgncd = zzorgncd;
    }

    /**
     * [get] SRYMD: {varchar(8)} <br>
     * 仕分日
     * @return The value of the column 'SRYMD'. (NullAllowed)
     */
    public String getSrymd() {
        return _srymd;
    }

    /**
     * [set] SRYMD: {varchar(8)} <br>
     * 仕分日
     * @param srymd The value of the column 'SRYMD'. (NullAllowed)
     */
    public void setSrymd(String srymd) {
        __modifiedProperties.add("srymd");
        this._srymd = srymd;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] PRESPLCNT: {bigint(19)} <br>
     * 事前補充回数
     * @return The value of the column 'PRESPLCNT'. (NullAllowed)
     */
    public Long getPresplcnt() {
        return _presplcnt;
    }

    /**
     * [set] PRESPLCNT: {bigint(19)} <br>
     * 事前補充回数
     * @param presplcnt The value of the column 'PRESPLCNT'. (NullAllowed)
     */
    public void setPresplcnt(Long presplcnt) {
        __modifiedProperties.add("presplcnt");
        this._presplcnt = presplcnt;
    }

    /**
     * [get] SRPMTFG: {char(1)} <br>
     * 仕分許可フラグ
     * @return The value of the column 'SRPMTFG'. (NullAllowed)
     */
    public String getSrpmtfg() {
        return _srpmtfg;
    }

    /**
     * [set] SRPMTFG: {char(1)} <br>
     * 仕分許可フラグ
     * @param srpmtfg The value of the column 'SRPMTFG'. (NullAllowed)
     */
    public void setSrpmtfg(String srpmtfg) {
        __modifiedProperties.add("srpmtfg");
        this._srpmtfg = srpmtfg;
    }

    /**
     * [get] MNTPMTFG: {char(1)} <br>
     * メンテナンス許可フラグ
     * @return The value of the column 'MNTPMTFG'. (NullAllowed)
     */
    public String getMntpmtfg() {
        return _mntpmtfg;
    }

    /**
     * [set] MNTPMTFG: {char(1)} <br>
     * メンテナンス許可フラグ
     * @param mntpmtfg The value of the column 'MNTPMTFG'. (NullAllowed)
     */
    public void setMntpmtfg(String mntpmtfg) {
        __modifiedProperties.add("mntpmtfg");
        this._mntpmtfg = mntpmtfg;
    }

    /**
     * [get] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public Long getCordrcvcnt() {
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        __modifiedProperties.add("cordrcvcnt");
        this._cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] REFVALUE: {bigint(19)} <br>
     * 基準値
     * @return The value of the column 'REFVALUE'. (NullAllowed)
     */
    public Long getRefvalue() {
        return _refvalue;
    }

    /**
     * [set] REFVALUE: {bigint(19)} <br>
     * 基準値
     * @param refvalue The value of the column 'REFVALUE'. (NullAllowed)
     */
    public void setRefvalue(Long refvalue) {
        __modifiedProperties.add("refvalue");
        this._refvalue = refvalue;
    }

    /**
     * [get] SFTPCLMGN: {bigint(19)} <br>
     * ソフトパーセル係数
     * @return The value of the column 'SFTPCLMGN'. (NullAllowed)
     */
    public Long getSftpclmgn() {
        return _sftpclmgn;
    }

    /**
     * [set] SFTPCLMGN: {bigint(19)} <br>
     * ソフトパーセル係数
     * @param sftpclmgn The value of the column 'SFTPCLMGN'. (NullAllowed)
     */
    public void setSftpclmgn(Long sftpclmgn) {
        __modifiedProperties.add("sftpclmgn");
        this._sftpclmgn = sftpclmgn;
    }

    /**
     * [get] TDAYESRCOMPFG: {char(1)} <br>
     * 当日仕分完了フラグ
     * @return The value of the column 'TDAYESRCOMPFG'. (NullAllowed)
     */
    public String getTdayesrcompfg() {
        return _tdayesrcompfg;
    }

    /**
     * [set] TDAYESRCOMPFG: {char(1)} <br>
     * 当日仕分完了フラグ
     * @param tdayesrcompfg The value of the column 'TDAYESRCOMPFG'. (NullAllowed)
     */
    public void setTdayesrcompfg(String tdayesrcompfg) {
        __modifiedProperties.add("tdayesrcompfg");
        this._tdayesrcompfg = tdayesrcompfg;
    }

    /**
     * [get] LOCIDFRNK: {varchar(30)} <br>
     * ロケ不定のロケ貼付順
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed)
     */
    public String getLocidfrnk() {
        return _locidfrnk;
    }

    /**
     * [set] LOCIDFRNK: {varchar(30)} <br>
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
     * [get] SORTING_FLG: {char(1)} <br>
     * 仕分中フラグ
     * @return The value of the column 'SORTING_FLG'. (NullAllowed)
     */
    public String getSortingFlg() {
        return _sortingFlg;
    }

    /**
     * [set] SORTING_FLG: {char(1)} <br>
     * 仕分中フラグ
     * @param sortingFlg The value of the column 'SORTING_FLG'. (NullAllowed)
     */
    public void setSortingFlg(String sortingFlg) {
        __modifiedProperties.add("sortingFlg");
        this._sortingFlg = sortingFlg;
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
