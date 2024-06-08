package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_MH_DRCDIZQA as TABLE. <br>
 * 共通下位データ送信テーブル　(方面別残数)
 * <pre>
 * [primary-key]
 *     MH_DRCDIZQA_ID
 *
 * [column]
 *     MH_DRCDIZQA_ID, LINBLK, ZNECD, SRRNK, LOCNO, ZZMATNR, DLVYMD, DPCD, DED, PSTNID, COMT, SROPRTCNT, CSROPRTCNT, CINLADDRCSRRNK, ZQACP, ZQACTQA, SSQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_DRCDIZQA_ID
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
public abstract class BsEMhDrcdizqaDto implements Serializable {

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
    /** MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mhDrcdizqaId;

    /** LINBLK: {NotNull, varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** ZNECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _znecd;

    /** SRRNK: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** LOCNO: {NotNull, varchar(255)} */
    @JsonKey
    protected String _locno;

    /** ZZMATNR: {varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** DLVYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {NotNull, char(1)} */
    @JsonKey
    protected String _pstnid;

    /** COMT: {varchar(60)} */
    @JsonKey
    protected String _comt;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** CSROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _csroprtcnt;

    /** CINLADDRCSRRNK: {bigint(19)} */
    @JsonKey
    protected Long _cinladdrcsrrnk;

    /** ZQACP: {bigint(19)} */
    @JsonKey
    protected Long _zqacp;

    /** ZQACTQA: {bigint(19)} */
    @JsonKey
    protected Long _zqactqa;

    /** SSQA: {bigint(19)} */
    @JsonKey
    protected Long _ssqa;

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
    public BsEMhDrcdizqaDto() {
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
        if (other == null || !(other instanceof BsEMhDrcdizqaDto)) { return false; }
        final BsEMhDrcdizqaDto otherEntity = (BsEMhDrcdizqaDto)other;
        if (!helpComparingValue(getMhDrcdizqaId(), otherEntity.getMhDrcdizqaId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_MH_DRCDIZQA");
        result = xCH(result, getMhDrcdizqaId());
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
        sb.append(c).append(getMhDrcdizqaId());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getZnecd());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getLocno());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getComt());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getCsroprtcnt());
        sb.append(c).append(getCinladdrcsrrnk());
        sb.append(c).append(getZqacp());
        sb.append(c).append(getZqactqa());
        sb.append(c).append(getSsqa());
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
     * [get] MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信　(方面別残数)ID
     * @return The value of the column 'MH_DRCDIZQA_ID'. (NullAllowed)
     */
    public Long getMhDrcdizqaId() {
        return _mhDrcdizqaId;
    }

    /**
     * [set] MH_DRCDIZQA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信　(方面別残数)ID
     * @param mhDrcdizqaId The value of the column 'MH_DRCDIZQA_ID'. (NullAllowed)
     */
    public void setMhDrcdizqaId(Long mhDrcdizqaId) {
        __modifiedProperties.add("mhDrcdizqaId");
        this._mhDrcdizqaId = mhDrcdizqaId;
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
     * [get] ZNECD: {NotNull, varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZNECD'. (NullAllowed)
     */
    public String getZnecd() {
        return _znecd;
    }

    /**
     * [set] ZNECD: {NotNull, varchar(30)} <br>
     * ゾーンCD
     * @param znecd The value of the column 'ZNECD'. (NullAllowed)
     */
    public void setZnecd(String znecd) {
        __modifiedProperties.add("znecd");
        this._znecd = znecd;
    }

    /**
     * [get] SRRNK: {NotNull, bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed)
     */
    public Long getSrrnk() {
        return _srrnk;
    }

    /**
     * [set] SRRNK: {NotNull, bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed)
     */
    public void setSrrnk(Long srrnk) {
        __modifiedProperties.add("srrnk");
        this._srrnk = srrnk;
    }

    /**
     * [get] LOCNO: {NotNull, varchar(255)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (NullAllowed)
     */
    public String getLocno() {
        return _locno;
    }

    /**
     * [set] LOCNO: {NotNull, varchar(255)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (NullAllowed)
     */
    public void setLocno(String locno) {
        __modifiedProperties.add("locno");
        this._locno = locno;
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
     * [get] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] COMT: {varchar(60)} <br>
     * コメント
     * @return The value of the column 'COMT'. (NullAllowed)
     */
    public String getComt() {
        return _comt;
    }

    /**
     * [set] COMT: {varchar(60)} <br>
     * コメント
     * @param comt The value of the column 'COMT'. (NullAllowed)
     */
    public void setComt(String comt) {
        __modifiedProperties.add("comt");
        this._comt = comt;
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
     * [get] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'CSROPRTCNT'. (NullAllowed)
     */
    public Long getCsroprtcnt() {
        return _csroprtcnt;
    }

    /**
     * [set] CSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param csroprtcnt The value of the column 'CSROPRTCNT'. (NullAllowed)
     */
    public void setCsroprtcnt(Long csroprtcnt) {
        __modifiedProperties.add("csroprtcnt");
        this._csroprtcnt = csroprtcnt;
    }

    /**
     * [get] CINLADDRCSRRNK: {bigint(19)} <br>
     * 割込先頭方面仕分順
     * @return The value of the column 'CINLADDRCSRRNK'. (NullAllowed)
     */
    public Long getCinladdrcsrrnk() {
        return _cinladdrcsrrnk;
    }

    /**
     * [set] CINLADDRCSRRNK: {bigint(19)} <br>
     * 割込先頭方面仕分順
     * @param cinladdrcsrrnk The value of the column 'CINLADDRCSRRNK'. (NullAllowed)
     */
    public void setCinladdrcsrrnk(Long cinladdrcsrrnk) {
        __modifiedProperties.add("cinladdrcsrrnk");
        this._cinladdrcsrrnk = cinladdrcsrrnk;
    }

    /**
     * [get] ZQACP: {bigint(19)} <br>
     * 残数　段ボール
     * @return The value of the column 'ZQACP'. (NullAllowed)
     */
    public Long getZqacp() {
        return _zqacp;
    }

    /**
     * [set] ZQACP: {bigint(19)} <br>
     * 残数　段ボール
     * @param zqacp The value of the column 'ZQACP'. (NullAllowed)
     */
    public void setZqacp(Long zqacp) {
        __modifiedProperties.add("zqacp");
        this._zqacp = zqacp;
    }

    /**
     * [get] ZQACTQA: {bigint(19)} <br>
     * 残数　カートン数
     * @return The value of the column 'ZQACTQA'. (NullAllowed)
     */
    public Long getZqactqa() {
        return _zqactqa;
    }

    /**
     * [set] ZQACTQA: {bigint(19)} <br>
     * 残数　カートン数
     * @param zqactqa The value of the column 'ZQACTQA'. (NullAllowed)
     */
    public void setZqactqa(Long zqactqa) {
        __modifiedProperties.add("zqactqa");
        this._zqactqa = zqactqa;
    }

    /**
     * [get] SSQA: {bigint(19)} <br>
     * 販売店数
     * @return The value of the column 'SSQA'. (NullAllowed)
     */
    public Long getSsqa() {
        return _ssqa;
    }

    /**
     * [set] SSQA: {bigint(19)} <br>
     * 販売店数
     * @param ssqa The value of the column 'SSQA'. (NullAllowed)
     */
    public void setSsqa(Long ssqa) {
        __modifiedProperties.add("ssqa");
        this._ssqa = ssqa;
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
