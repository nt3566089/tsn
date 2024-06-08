package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_CSRSTINF as TABLE. <br>
 * 仕分統計情報
 * <pre>
 * [primary-key]
 *     SORT_STATISTICS_INFO_ID
 *
 * [column]
 *     SORT_STATISTICS_INFO_ID, ZZORGNCD, SROPRTYMD, SROPRTCNT, LINBLK, DLVYMD, DPCD, DED, PSTNID, SRLINCD, SRRNK, SRPAT, TTBRQA, SHPQA, SPRQASFTPCL, SPRQATSNBOX, SPRQAJTBOX, SPRQA100BOX, SPRQAHL, SPRQAFUL, SPRQAHLBGBOX, SPRQAHL12BOX, SPRQAHL5BOX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SORT_STATISTICS_INFO_ID
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
public abstract class BsTCsrstinfDto implements Serializable {

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
    /** SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sortStatisticsInfoId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** SROPRTYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _sroprtymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** LINBLK: {NotNull, varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** DLVYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pstnid;

    /** SRLINCD: {varchar(30)} */
    @JsonKey
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** SRPAT: {bigint(19)} */
    @JsonKey
    protected Long _srpat;

    /** TTBRQA: {bigint(19)} */
    @JsonKey
    protected Long _ttbrqa;

    /** SHPQA: {bigint(19)} */
    @JsonKey
    protected Long _shpqa;

    /** SPRQASFTPCL: {bigint(19)} */
    @JsonKey
    protected Long _sprqasftpcl;

    /** SPRQATSNBOX: {bigint(19)} */
    @JsonKey
    protected Long _sprqatsnbox;

    /** SPRQAJTBOX: {bigint(19)} */
    @JsonKey
    protected Long _sprqajtbox;

    /** SPRQA100BOX: {bigint(19)} */
    @JsonKey
    protected Long _sprqa100box;

    /** SPRQAHL: {bigint(19)} */
    @JsonKey
    protected Long _sprqahl;

    /** SPRQAFUL: {bigint(19)} */
    @JsonKey
    protected Long _sprqaful;

    /** SPRQAHLBGBOX: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sprqahlbgbox;

    /** SPRQAHL12BOX: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sprqahl12box;

    /** SPRQAHL5BOX: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sprqahl5box;

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
    public BsTCsrstinfDto() {
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
        if (other == null || !(other instanceof BsTCsrstinfDto)) { return false; }
        final BsTCsrstinfDto otherEntity = (BsTCsrstinfDto)other;
        if (!helpComparingValue(getSortStatisticsInfoId(), otherEntity.getSortStatisticsInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CSRSTINF");
        result = xCH(result, getSortStatisticsInfoId());
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
        sb.append(c).append(getSortStatisticsInfoId());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getSroprtymd());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getSrlincd());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getSrpat());
        sb.append(c).append(getTtbrqa());
        sb.append(c).append(getShpqa());
        sb.append(c).append(getSprqasftpcl());
        sb.append(c).append(getSprqatsnbox());
        sb.append(c).append(getSprqajtbox());
        sb.append(c).append(getSprqa100box());
        sb.append(c).append(getSprqahl());
        sb.append(c).append(getSprqaful());
        sb.append(c).append(getSprqahlbgbox());
        sb.append(c).append(getSprqahl12box());
        sb.append(c).append(getSprqahl5box());
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
     * [get] SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分統計情報ID
     * @return The value of the column 'SORT_STATISTICS_INFO_ID'. (NullAllowed)
     */
    public Long getSortStatisticsInfoId() {
        return _sortStatisticsInfoId;
    }

    /**
     * [set] SORT_STATISTICS_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分統計情報ID
     * @param sortStatisticsInfoId The value of the column 'SORT_STATISTICS_INFO_ID'. (NullAllowed)
     */
    public void setSortStatisticsInfoId(Long sortStatisticsInfoId) {
        __modifiedProperties.add("sortStatisticsInfoId");
        this._sortStatisticsInfoId = sortStatisticsInfoId;
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
     * [get] SROPRTYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日
     * @return The value of the column 'SROPRTYMD'. (NullAllowed)
     */
    public String getSroprtymd() {
        return _sroprtymd;
    }

    /**
     * [set] SROPRTYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日
     * @param sroprtymd The value of the column 'SROPRTYMD'. (NullAllowed)
     */
    public void setSroprtymd(String sroprtymd) {
        __modifiedProperties.add("sroprtymd");
        this._sroprtymd = sroprtymd;
    }

    /**
     * [get] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed)
     */
    public String getDlvymd() {
        return _dlvymd;
    }

    /**
     * [set] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed)
     */
    public void setDlvymd(String dlvymd) {
        __modifiedProperties.add("dlvymd");
        this._dlvymd = dlvymd;
    }

    /**
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed)
     */
    public String getSrlincd() {
        return _srlincd;
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed)
     */
    public void setSrlincd(String srlincd) {
        __modifiedProperties.add("srlincd");
        this._srlincd = srlincd;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed)
     */
    public Long getSrrnk() {
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed)
     */
    public void setSrrnk(Long srrnk) {
        __modifiedProperties.add("srrnk");
        this._srrnk = srrnk;
    }

    /**
     * [get] SRPAT: {bigint(19)} <br>
     * 仕分物量
     * @return The value of the column 'SRPAT'. (NullAllowed)
     */
    public Long getSrpat() {
        return _srpat;
    }

    /**
     * [set] SRPAT: {bigint(19)} <br>
     * 仕分物量
     * @param srpat The value of the column 'SRPAT'. (NullAllowed)
     */
    public void setSrpat(Long srpat) {
        __modifiedProperties.add("srpat");
        this._srpat = srpat;
    }

    /**
     * [get] TTBRQA: {bigint(19)} <br>
     * 延銘柄数
     * @return The value of the column 'TTBRQA'. (NullAllowed)
     */
    public Long getTtbrqa() {
        return _ttbrqa;
    }

    /**
     * [set] TTBRQA: {bigint(19)} <br>
     * 延銘柄数
     * @param ttbrqa The value of the column 'TTBRQA'. (NullAllowed)
     */
    public void setTtbrqa(Long ttbrqa) {
        __modifiedProperties.add("ttbrqa");
        this._ttbrqa = ttbrqa;
    }

    /**
     * [get] SHPQA: {bigint(19)} <br>
     * 店数
     * @return The value of the column 'SHPQA'. (NullAllowed)
     */
    public Long getShpqa() {
        return _shpqa;
    }

    /**
     * [set] SHPQA: {bigint(19)} <br>
     * 店数
     * @param shpqa The value of the column 'SHPQA'. (NullAllowed)
     */
    public void setShpqa(Long shpqa) {
        __modifiedProperties.add("shpqa");
        this._shpqa = shpqa;
    }

    /**
     * [get] SPRQASFTPCL: {bigint(19)} <br>
     * 個口数(ソフトパーセル)
     * @return The value of the column 'SPRQASFTPCL'. (NullAllowed)
     */
    public Long getSprqasftpcl() {
        return _sprqasftpcl;
    }

    /**
     * [set] SPRQASFTPCL: {bigint(19)} <br>
     * 個口数(ソフトパーセル)
     * @param sprqasftpcl The value of the column 'SPRQASFTPCL'. (NullAllowed)
     */
    public void setSprqasftpcl(Long sprqasftpcl) {
        __modifiedProperties.add("sprqasftpcl");
        this._sprqasftpcl = sprqasftpcl;
    }

    /**
     * [get] SPRQATSNBOX: {bigint(19)} <br>
     * 個口数(ＴＳＮＢＯＸ)
     * @return The value of the column 'SPRQATSNBOX'. (NullAllowed)
     */
    public Long getSprqatsnbox() {
        return _sprqatsnbox;
    }

    /**
     * [set] SPRQATSNBOX: {bigint(19)} <br>
     * 個口数(ＴＳＮＢＯＸ)
     * @param sprqatsnbox The value of the column 'SPRQATSNBOX'. (NullAllowed)
     */
    public void setSprqatsnbox(Long sprqatsnbox) {
        __modifiedProperties.add("sprqatsnbox");
        this._sprqatsnbox = sprqatsnbox;
    }

    /**
     * [get] SPRQAJTBOX: {bigint(19)} <br>
     * 個口数(ＪＴＢＯＸ)
     * @return The value of the column 'SPRQAJTBOX'. (NullAllowed)
     */
    public Long getSprqajtbox() {
        return _sprqajtbox;
    }

    /**
     * [set] SPRQAJTBOX: {bigint(19)} <br>
     * 個口数(ＪＴＢＯＸ)
     * @param sprqajtbox The value of the column 'SPRQAJTBOX'. (NullAllowed)
     */
    public void setSprqajtbox(Long sprqajtbox) {
        __modifiedProperties.add("sprqajtbox");
        this._sprqajtbox = sprqajtbox;
    }

    /**
     * [get] SPRQA100BOX: {bigint(19)} <br>
     * 個口数(１００ＢＯＸ)
     * @return The value of the column 'SPRQA100BOX'. (NullAllowed)
     */
    public Long getSprqa100box() {
        return _sprqa100box;
    }

    /**
     * [set] SPRQA100BOX: {bigint(19)} <br>
     * 個口数(１００ＢＯＸ)
     * @param sprqa100box The value of the column 'SPRQA100BOX'. (NullAllowed)
     */
    public void setSprqa100box(Long sprqa100box) {
        __modifiedProperties.add("sprqa100box");
        this._sprqa100box = sprqa100box;
    }

    /**
     * [get] SPRQAHL: {bigint(19)} <br>
     * 個口数(半箱Ｆ)
     * @return The value of the column 'SPRQAHL'. (NullAllowed)
     */
    public Long getSprqahl() {
        return _sprqahl;
    }

    /**
     * [set] SPRQAHL: {bigint(19)} <br>
     * 個口数(半箱Ｆ)
     * @param sprqahl The value of the column 'SPRQAHL'. (NullAllowed)
     */
    public void setSprqahl(Long sprqahl) {
        __modifiedProperties.add("sprqahl");
        this._sprqahl = sprqahl;
    }

    /**
     * [get] SPRQAFUL: {bigint(19)} <br>
     * 個口数(丸段)
     * @return The value of the column 'SPRQAFUL'. (NullAllowed)
     */
    public Long getSprqaful() {
        return _sprqaful;
    }

    /**
     * [set] SPRQAFUL: {bigint(19)} <br>
     * 個口数(丸段)
     * @param sprqaful The value of the column 'SPRQAFUL'. (NullAllowed)
     */
    public void setSprqaful(Long sprqaful) {
        __modifiedProperties.add("sprqaful");
        this._sprqaful = sprqaful;
    }

    /**
     * [get] SPRQAHLBGBOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｅ)
     * @return The value of the column 'SPRQAHLBGBOX'. (NullAllowed)
     */
    public Long getSprqahlbgbox() {
        return _sprqahlbgbox;
    }

    /**
     * [set] SPRQAHLBGBOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｅ)
     * @param sprqahlbgbox The value of the column 'SPRQAHLBGBOX'. (NullAllowed)
     */
    public void setSprqahlbgbox(Long sprqahlbgbox) {
        __modifiedProperties.add("sprqahlbgbox");
        this._sprqahlbgbox = sprqahlbgbox;
    }

    /**
     * [get] SPRQAHL12BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｇ)
     * @return The value of the column 'SPRQAHL12BOX'. (NullAllowed)
     */
    public Long getSprqahl12box() {
        return _sprqahl12box;
    }

    /**
     * [set] SPRQAHL12BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｇ)
     * @param sprqahl12box The value of the column 'SPRQAHL12BOX'. (NullAllowed)
     */
    public void setSprqahl12box(Long sprqahl12box) {
        __modifiedProperties.add("sprqahl12box");
        this._sprqahl12box = sprqahl12box;
    }

    /**
     * [get] SPRQAHL5BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｈ)
     * @return The value of the column 'SPRQAHL5BOX'. (NullAllowed)
     */
    public Long getSprqahl5box() {
        return _sprqahl5box;
    }

    /**
     * [set] SPRQAHL5BOX: {bigint(19), default=[(0)]} <br>
     * 個口数(半箱Ｈ)
     * @param sprqahl5box The value of the column 'SPRQAHL5BOX'. (NullAllowed)
     */
    public void setSprqahl5box(Long sprqahl5box) {
        __modifiedProperties.add("sprqahl5box");
        this._sprqahl5box = sprqahl5box;
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
