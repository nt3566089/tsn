package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_MH_SHIPPING as TABLE. <br>
 * 共通下位データ送信テーブル(さしず実績)
 * <pre>
 * [primary-key]
 *     MH_SHIPPING_ID
 *
 * [column]
 *     MH_SHIPPING_ID, DPCD, DLVYMD, DED, PSTNID, SRDED, SRPSTNID, SRLINCD, SRRNK, SSCD, SSNM, ZZMATNR, SLQACB, SLQACT, LINBLK, LOCNO, LOCID, DLVPRTRNK, DLVSNM, DLVDTLSNM, SROPRTCNT, TTSROPRTCNT, TTTOPDEDRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_SHIPPING_ID
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
public abstract class BsEMhShippingDto implements Serializable {

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
    /** MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mhShippingId;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DLVYMD: {varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DED: {varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {char(1)} */
    @JsonKey
    protected String _pstnid;

    /** SRDED: {varchar(30)} */
    @JsonKey
    protected String _srded;

    /** SRPSTNID: {char(1)} */
    @JsonKey
    protected String _srpstnid;

    /** SRLINCD: {varchar(30)} */
    @JsonKey
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** SSCD: {varchar(30)} */
    @JsonKey
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    @JsonKey
    protected String _ssnm;

    /** ZZMATNR: {varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** SLQACB: {bigint(19)} */
    @JsonKey
    protected Long _slqacb;

    /** SLQACT: {bigint(19)} */
    @JsonKey
    protected Long _slqact;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCNO: {varchar(255)} */
    @JsonKey
    protected String _locno;

    /** LOCID: {char(1)} */
    @JsonKey
    protected String _locid;

    /** DLVPRTRNK: {bigint(19)} */
    @JsonKey
    protected Long _dlvprtrnk;

    /** DLVSNM: {bigint(19)} */
    @JsonKey
    protected Long _dlvsnm;

    /** DLVDTLSNM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _dlvdtlsnm;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** TTSROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _ttsroprtcnt;

    /** TTTOPDEDRNK: {bigint(19)} */
    @JsonKey
    protected Long _tttopdedrnk;

    /** BRTYP: {char(1)} */
    @JsonKey
    protected String _brtyp;

    /** BOXNO: {varchar(30)} */
    @JsonKey
    protected String _boxno;

    /** BOXNOCNSNM: {varchar(30)} */
    @JsonKey
    protected String _boxnocnsnm;

    /** BOXTYP: {char(1)} */
    @JsonKey
    protected String _boxtyp;

    /** MGBOXDID: {char(1)} */
    @JsonKey
    protected String _mgboxdid;

    /** DMDID: {char(1)} */
    @JsonKey
    protected String _dmdid;

    /** TTBOXQA: {bigint(19)} */
    @JsonKey
    protected Long _ttboxqa;

    /** BOXCTQATA: {bigint(19)} */
    @JsonKey
    protected Long _boxctqata;

    /** BOXCTQAAPSRPLC: {bigint(19)} */
    @JsonKey
    protected Long _boxctqaapsrplc;

    /** DRCLSTLBCBID: {char(1)} */
    @JsonKey
    protected String _drclstlbcbid;

    /** LBBOXNO: {bigint(19)} */
    @JsonKey
    protected Long _lbboxno;

    /** LBTTBOXQA: {bigint(19)} */
    @JsonKey
    protected Long _lbttboxqa;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** WORK_FLG: {char(1)} */
    @JsonKey
    protected String _workFlg;

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
    public BsEMhShippingDto() {
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
        if (other == null || !(other instanceof BsEMhShippingDto)) { return false; }
        final BsEMhShippingDto otherEntity = (BsEMhShippingDto)other;
        if (!helpComparingValue(getMhShippingId(), otherEntity.getMhShippingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_MH_SHIPPING");
        result = xCH(result, getMhShippingId());
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
        sb.append(c).append(getMhShippingId());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getSrded());
        sb.append(c).append(getSrpstnid());
        sb.append(c).append(getSrlincd());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getSscd());
        sb.append(c).append(getSsnm());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getSlqacb());
        sb.append(c).append(getSlqact());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocno());
        sb.append(c).append(getLocid());
        sb.append(c).append(getDlvprtrnk());
        sb.append(c).append(getDlvsnm());
        sb.append(c).append(getDlvdtlsnm());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getTtsroprtcnt());
        sb.append(c).append(getTttopdedrnk());
        sb.append(c).append(getBrtyp());
        sb.append(c).append(getBoxno());
        sb.append(c).append(getBoxnocnsnm());
        sb.append(c).append(getBoxtyp());
        sb.append(c).append(getMgboxdid());
        sb.append(c).append(getDmdid());
        sb.append(c).append(getTtboxqa());
        sb.append(c).append(getBoxctqata());
        sb.append(c).append(getBoxctqaapsrplc());
        sb.append(c).append(getDrclstlbcbid());
        sb.append(c).append(getLbboxno());
        sb.append(c).append(getLbttboxqa());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getWorkFlg());
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
     * [get] MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(さしず実績)ID
     * @return The value of the column 'MH_SHIPPING_ID'. (NullAllowed)
     */
    public Long getMhShippingId() {
        return _mhShippingId;
    }

    /**
     * [set] MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(さしず実績)ID
     * @param mhShippingId The value of the column 'MH_SHIPPING_ID'. (NullAllowed)
     */
    public void setMhShippingId(Long mhShippingId) {
        __modifiedProperties.add("mhShippingId");
        this._mhShippingId = mhShippingId;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed)
     */
    public String getDlvymd() {
        return _dlvymd;
    }

    /**
     * [set] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed)
     */
    public void setDlvymd(String dlvymd) {
        __modifiedProperties.add("dlvymd");
        this._dlvymd = dlvymd;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] PSTNID: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @return The value of the column 'SRDED'. (NullAllowed)
     */
    public String getSrded() {
        return _srded;
    }

    /**
     * [set] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @param srded The value of the column 'SRDED'. (NullAllowed)
     */
    public void setSrded(String srded) {
        __modifiedProperties.add("srded");
        this._srded = srded;
    }

    /**
     * [get] SRPSTNID: {char(1)} <br>
     * CAP用ピストン区分
     * @return The value of the column 'SRPSTNID'. (NullAllowed)
     */
    public String getSrpstnid() {
        return _srpstnid;
    }

    /**
     * [set] SRPSTNID: {char(1)} <br>
     * CAP用ピストン区分
     * @param srpstnid The value of the column 'SRPSTNID'. (NullAllowed)
     */
    public void setSrpstnid(String srpstnid) {
        __modifiedProperties.add("srpstnid");
        this._srpstnid = srpstnid;
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
     * [get] SSCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed)
     */
    public String getSscd() {
        return _sscd;
    }

    /**
     * [set] SSCD: {varchar(30)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (NullAllowed)
     */
    public void setSscd(String sscd) {
        __modifiedProperties.add("sscd");
        this._sscd = sscd;
    }

    /**
     * [get] SSNM: {varchar(60)} <br>
     * お得意様名
     * @return The value of the column 'SSNM'. (NullAllowed)
     */
    public String getSsnm() {
        return _ssnm;
    }

    /**
     * [set] SSNM: {varchar(60)} <br>
     * お得意様名
     * @param ssnm The value of the column 'SSNM'. (NullAllowed)
     */
    public void setSsnm(String ssnm) {
        __modifiedProperties.add("ssnm");
        this._ssnm = ssnm;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @return The value of the column 'SLQACB'. (NullAllowed)
     */
    public Long getSlqacb() {
        return _slqacb;
    }

    /**
     * [set] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed)
     */
    public void setSlqacb(Long slqacb) {
        __modifiedProperties.add("slqacb");
        this._slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @return The value of the column 'SLQACT'. (NullAllowed)
     */
    public Long getSlqact() {
        return _slqact;
    }

    /**
     * [set] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @param slqact The value of the column 'SLQACT'. (NullAllowed)
     */
    public void setSlqact(Long slqact) {
        __modifiedProperties.add("slqact");
        this._slqact = slqact;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (NullAllowed)
     */
    public String getLocno() {
        return _locno;
    }

    /**
     * [set] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (NullAllowed)
     */
    public void setLocno(String locno) {
        __modifiedProperties.add("locno");
        this._locno = locno;
    }

    /**
     * [get] LOCID: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCID'. (NullAllowed)
     */
    public String getLocid() {
        return _locid;
    }

    /**
     * [set] LOCID: {char(1)} <br>
     * ロケーション区分
     * @param locid The value of the column 'LOCID'. (NullAllowed)
     */
    public void setLocid(String locid) {
        __modifiedProperties.add("locid");
        this._locid = locid;
    }

    /**
     * [get] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DLVPRTRNK'. (NullAllowed)
     */
    public Long getDlvprtrnk() {
        return _dlvprtrnk;
    }

    /**
     * [set] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @param dlvprtrnk The value of the column 'DLVPRTRNK'. (NullAllowed)
     */
    public void setDlvprtrnk(Long dlvprtrnk) {
        __modifiedProperties.add("dlvprtrnk");
        this._dlvprtrnk = dlvprtrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (NullAllowed)
     */
    public Long getDlvsnm() {
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed)
     */
    public void setDlvsnm(Long dlvsnm) {
        __modifiedProperties.add("dlvsnm");
        this._dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public java.math.BigDecimal getDlvdtlsnm() {
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public void setDlvdtlsnm(java.math.BigDecimal dlvdtlsnm) {
        __modifiedProperties.add("dlvdtlsnm");
        this._dlvdtlsnm = dlvdtlsnm;
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
     * [get] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'TTSROPRTCNT'. (NullAllowed)
     */
    public Long getTtsroprtcnt() {
        return _ttsroprtcnt;
    }

    /**
     * [set] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param ttsroprtcnt The value of the column 'TTSROPRTCNT'. (NullAllowed)
     */
    public void setTtsroprtcnt(Long ttsroprtcnt) {
        __modifiedProperties.add("ttsroprtcnt");
        this._ttsroprtcnt = ttsroprtcnt;
    }

    /**
     * [get] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public Long getTttopdedrnk() {
        return _tttopdedrnk;
    }

    /**
     * [set] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public void setTttopdedrnk(Long tttopdedrnk) {
        __modifiedProperties.add("tttopdedrnk");
        this._tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] BRTYP: {char(1)} <br>
     * 銘柄タイプ
     * @return The value of the column 'BRTYP'. (NullAllowed)
     */
    public String getBrtyp() {
        return _brtyp;
    }

    /**
     * [set] BRTYP: {char(1)} <br>
     * 銘柄タイプ
     * @param brtyp The value of the column 'BRTYP'. (NullAllowed)
     */
    public void setBrtyp(String brtyp) {
        __modifiedProperties.add("brtyp");
        this._brtyp = brtyp;
    }

    /**
     * [get] BOXNO: {varchar(30)} <br>
     * 箱Ｎｏ．
     * @return The value of the column 'BOXNO'. (NullAllowed)
     */
    public String getBoxno() {
        return _boxno;
    }

    /**
     * [set] BOXNO: {varchar(30)} <br>
     * 箱Ｎｏ．
     * @param boxno The value of the column 'BOXNO'. (NullAllowed)
     */
    public void setBoxno(String boxno) {
        __modifiedProperties.add("boxno");
        this._boxno = boxno;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．(通番)
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public String getBoxnocnsnm() {
        return _boxnocnsnm;
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．(通番)
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        __modifiedProperties.add("boxnocnsnm");
        this._boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BOXTYP: {char(1)} <br>
     * 箱タイプ
     * @return The value of the column 'BOXTYP'. (NullAllowed)
     */
    public String getBoxtyp() {
        return _boxtyp;
    }

    /**
     * [set] BOXTYP: {char(1)} <br>
     * 箱タイプ
     * @param boxtyp The value of the column 'BOXTYP'. (NullAllowed)
     */
    public void setBoxtyp(String boxtyp) {
        __modifiedProperties.add("boxtyp");
        this._boxtyp = boxtyp;
    }

    /**
     * [get] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MGBOXDID'. (NullAllowed)
     */
    public String getMgboxdid() {
        return _mgboxdid;
    }

    /**
     * [set] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @param mgboxdid The value of the column 'MGBOXDID'. (NullAllowed)
     */
    public void setMgboxdid(String mgboxdid) {
        __modifiedProperties.add("mgboxdid");
        this._mgboxdid = mgboxdid;
    }

    /**
     * [get] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'DMDID'. (NullAllowed)
     */
    public String getDmdid() {
        return _dmdid;
    }

    /**
     * [set] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @param dmdid The value of the column 'DMDID'. (NullAllowed)
     */
    public void setDmdid(String dmdid) {
        __modifiedProperties.add("dmdid");
        this._dmdid = dmdid;
    }

    /**
     * [get] TTBOXQA: {bigint(19)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'TTBOXQA'. (NullAllowed)
     */
    public Long getTtboxqa() {
        return _ttboxqa;
    }

    /**
     * [set] TTBOXQA: {bigint(19)} <br>
     * ＤＭ表示区分
     * @param ttboxqa The value of the column 'TTBOXQA'. (NullAllowed)
     */
    public void setTtboxqa(Long ttboxqa) {
        __modifiedProperties.add("ttboxqa");
        this._ttboxqa = ttboxqa;
    }

    /**
     * [get] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数(総数)
     * @return The value of the column 'BOXCTQATA'. (NullAllowed)
     */
    public Long getBoxctqata() {
        return _boxctqata;
    }

    /**
     * [set] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数(総数)
     * @param boxctqata The value of the column 'BOXCTQATA'. (NullAllowed)
     */
    public void setBoxctqata(Long boxctqata) {
        __modifiedProperties.add("boxctqata");
        this._boxctqata = boxctqata;
    }

    /**
     * [get] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数(該当仕分場分)
     * @return The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed)
     */
    public Long getBoxctqaapsrplc() {
        return _boxctqaapsrplc;
    }

    /**
     * [set] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数(該当仕分場分)
     * @param boxctqaapsrplc The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed)
     */
    public void setBoxctqaapsrplc(Long boxctqaapsrplc) {
        __modifiedProperties.add("boxctqaapsrplc");
        this._boxctqaapsrplc = boxctqaapsrplc;
    }

    /**
     * [get] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @return The value of the column 'DRCLSTLBCBID'. (NullAllowed)
     */
    public String getDrclstlbcbid() {
        return _drclstlbcbid;
    }

    /**
     * [set] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @param drclstlbcbid The value of the column 'DRCLSTLBCBID'. (NullAllowed)
     */
    public void setDrclstlbcbid(String drclstlbcbid) {
        __modifiedProperties.add("drclstlbcbid");
        this._drclstlbcbid = drclstlbcbid;
    }

    /**
     * [get] LBBOXNO: {bigint(19)} <br>
     * ライン／ブロック箱Ｎｏ
     * @return The value of the column 'LBBOXNO'. (NullAllowed)
     */
    public Long getLbboxno() {
        return _lbboxno;
    }

    /**
     * [set] LBBOXNO: {bigint(19)} <br>
     * ライン／ブロック箱Ｎｏ
     * @param lbboxno The value of the column 'LBBOXNO'. (NullAllowed)
     */
    public void setLbboxno(Long lbboxno) {
        __modifiedProperties.add("lbboxno");
        this._lbboxno = lbboxno;
    }

    /**
     * [get] LBTTBOXQA: {bigint(19)} <br>
     * ライン／ブロックトータル箱数
     * @return The value of the column 'LBTTBOXQA'. (NullAllowed)
     */
    public Long getLbttboxqa() {
        return _lbttboxqa;
    }

    /**
     * [set] LBTTBOXQA: {bigint(19)} <br>
     * ライン／ブロックトータル箱数
     * @param lbttboxqa The value of the column 'LBTTBOXQA'. (NullAllowed)
     */
    public void setLbttboxqa(Long lbttboxqa) {
        __modifiedProperties.add("lbttboxqa");
        this._lbttboxqa = lbttboxqa;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
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
