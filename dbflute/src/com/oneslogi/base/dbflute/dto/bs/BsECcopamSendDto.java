package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_CCOPAM_SEND as TABLE. <br>
 * 配車実績データ送信テーブル
 * <pre>
 * [primary-key]
 *     CCOPAM_SEND_ID
 *
 * [column]
 *     CCOPAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CCOPAM_ID, SNNO1, SNNO2, SNNO3, CARNO, SNYMD, ARVYMD, SFCD, STCD, GNLPLTQA, OTPLTQA, PLNCARKND, AMCARKND, SELNO1, SELNO2, SELNO3, TRANNM, TDRELAYID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CCOPAM_SEND_ID
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
public abstract class BsECcopamSendDto implements Serializable {

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
    /** CCOPAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _ccopamSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _workFlg;

    /** CCOPAM_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _ccopamId;

    /** SNNO1: {varchar(255)} */
    @JsonKey
    protected String _snno1;

    /** SNNO2: {varchar(255)} */
    @JsonKey
    protected String _snno2;

    /** SNNO3: {varchar(255)} */
    @JsonKey
    protected String _snno3;

    /** CARNO: {varchar(255)} */
    @JsonKey
    protected String _carno;

    /** SNYMD: {varchar(255)} */
    @JsonKey
    protected String _snymd;

    /** ARVYMD: {varchar(255)} */
    @JsonKey
    protected String _arvymd;

    /** SFCD: {varchar(255)} */
    @JsonKey
    protected String _sfcd;

    /** STCD: {varchar(255)} */
    @JsonKey
    protected String _stcd;

    /** GNLPLTQA: {varchar(255)} */
    @JsonKey
    protected String _gnlpltqa;

    /** OTPLTQA: {varchar(255)} */
    @JsonKey
    protected String _otpltqa;

    /** PLNCARKND: {varchar(255)} */
    @JsonKey
    protected String _plncarknd;

    /** AMCARKND: {varchar(255)} */
    @JsonKey
    protected String _amcarknd;

    /** SELNO1: {varchar(255)} */
    @JsonKey
    protected String _selno1;

    /** SELNO2: {varchar(255)} */
    @JsonKey
    protected String _selno2;

    /** SELNO3: {varchar(255)} */
    @JsonKey
    protected String _selno3;

    /** TRANNM: {varchar(255)} */
    @JsonKey
    protected String _trannm;

    /** TDRELAYID: {varchar(255)} */
    @JsonKey
    protected String _tdrelayid;

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
    public BsECcopamSendDto() {
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
        if (other == null || !(other instanceof BsECcopamSendDto)) { return false; }
        final BsECcopamSendDto otherEntity = (BsECcopamSendDto)other;
        if (!helpComparingValue(getCcopamSendId(), otherEntity.getCcopamSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_CCOPAM_SEND");
        result = xCH(result, getCcopamSendId());
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
        sb.append(c).append(getCcopamSendId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getCcopamId());
        sb.append(c).append(getSnno1());
        sb.append(c).append(getSnno2());
        sb.append(c).append(getSnno3());
        sb.append(c).append(getCarno());
        sb.append(c).append(getSnymd());
        sb.append(c).append(getArvymd());
        sb.append(c).append(getSfcd());
        sb.append(c).append(getStcd());
        sb.append(c).append(getGnlpltqa());
        sb.append(c).append(getOtpltqa());
        sb.append(c).append(getPlncarknd());
        sb.append(c).append(getAmcarknd());
        sb.append(c).append(getSelno1());
        sb.append(c).append(getSelno2());
        sb.append(c).append(getSelno3());
        sb.append(c).append(getTrannm());
        sb.append(c).append(getTdrelayid());
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
     * [get] CCOPAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配車実績データ送信ID
     * @return The value of the column 'CCOPAM_SEND_ID'. (NullAllowed)
     */
    public Long getCcopamSendId() {
        return _ccopamSendId;
    }

    /**
     * [set] CCOPAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 配車実績データ送信ID
     * @param ccopamSendId The value of the column 'CCOPAM_SEND_ID'. (NullAllowed)
     */
    public void setCcopamSendId(Long ccopamSendId) {
        __modifiedProperties.add("ccopamSendId");
        this._ccopamSendId = ccopamSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] CCOPAM_ID: {NotNull, bigint(19)} <br>
     * 配車実績ID
     * @return The value of the column 'CCOPAM_ID'. (NullAllowed)
     */
    public Long getCcopamId() {
        return _ccopamId;
    }

    /**
     * [set] CCOPAM_ID: {NotNull, bigint(19)} <br>
     * 配車実績ID
     * @param ccopamId The value of the column 'CCOPAM_ID'. (NullAllowed)
     */
    public void setCcopamId(Long ccopamId) {
        __modifiedProperties.add("ccopamId");
        this._ccopamId = ccopamId;
    }

    /**
     * [get] SNNO1: {varchar(255)} <br>
     * 発送番号(1)
     * @return The value of the column 'SNNO1'. (NullAllowed)
     */
    public String getSnno1() {
        return _snno1;
    }

    /**
     * [set] SNNO1: {varchar(255)} <br>
     * 発送番号(1)
     * @param snno1 The value of the column 'SNNO1'. (NullAllowed)
     */
    public void setSnno1(String snno1) {
        __modifiedProperties.add("snno1");
        this._snno1 = snno1;
    }

    /**
     * [get] SNNO2: {varchar(255)} <br>
     * 発送番号(2)
     * @return The value of the column 'SNNO2'. (NullAllowed)
     */
    public String getSnno2() {
        return _snno2;
    }

    /**
     * [set] SNNO2: {varchar(255)} <br>
     * 発送番号(2)
     * @param snno2 The value of the column 'SNNO2'. (NullAllowed)
     */
    public void setSnno2(String snno2) {
        __modifiedProperties.add("snno2");
        this._snno2 = snno2;
    }

    /**
     * [get] SNNO3: {varchar(255)} <br>
     * 発送番号(3)
     * @return The value of the column 'SNNO3'. (NullAllowed)
     */
    public String getSnno3() {
        return _snno3;
    }

    /**
     * [set] SNNO3: {varchar(255)} <br>
     * 発送番号(3)
     * @param snno3 The value of the column 'SNNO3'. (NullAllowed)
     */
    public void setSnno3(String snno3) {
        __modifiedProperties.add("snno3");
        this._snno3 = snno3;
    }

    /**
     * [get] CARNO: {varchar(255)} <br>
     * 号車Ｎｏ.
     * @return The value of the column 'CARNO'. (NullAllowed)
     */
    public String getCarno() {
        return _carno;
    }

    /**
     * [set] CARNO: {varchar(255)} <br>
     * 号車Ｎｏ.
     * @param carno The value of the column 'CARNO'. (NullAllowed)
     */
    public void setCarno(String carno) {
        __modifiedProperties.add("carno");
        this._carno = carno;
    }

    /**
     * [get] SNYMD: {varchar(255)} <br>
     * 発送日
     * @return The value of the column 'SNYMD'. (NullAllowed)
     */
    public String getSnymd() {
        return _snymd;
    }

    /**
     * [set] SNYMD: {varchar(255)} <br>
     * 発送日
     * @param snymd The value of the column 'SNYMD'. (NullAllowed)
     */
    public void setSnymd(String snymd) {
        __modifiedProperties.add("snymd");
        this._snymd = snymd;
    }

    /**
     * [get] ARVYMD: {varchar(255)} <br>
     * 到着日
     * @return The value of the column 'ARVYMD'. (NullAllowed)
     */
    public String getArvymd() {
        return _arvymd;
    }

    /**
     * [set] ARVYMD: {varchar(255)} <br>
     * 到着日
     * @param arvymd The value of the column 'ARVYMD'. (NullAllowed)
     */
    public void setArvymd(String arvymd) {
        __modifiedProperties.add("arvymd");
        this._arvymd = arvymd;
    }

    /**
     * [get] SFCD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SFCD'. (NullAllowed)
     */
    public String getSfcd() {
        return _sfcd;
    }

    /**
     * [set] SFCD: {varchar(255)} <br>
     * 発送元CD
     * @param sfcd The value of the column 'SFCD'. (NullAllowed)
     */
    public void setSfcd(String sfcd) {
        __modifiedProperties.add("sfcd");
        this._sfcd = sfcd;
    }

    /**
     * [get] STCD: {varchar(255)} <br>
     * 発送先CD
     * @return The value of the column 'STCD'. (NullAllowed)
     */
    public String getStcd() {
        return _stcd;
    }

    /**
     * [set] STCD: {varchar(255)} <br>
     * 発送先CD
     * @param stcd The value of the column 'STCD'. (NullAllowed)
     */
    public void setStcd(String stcd) {
        __modifiedProperties.add("stcd");
        this._stcd = stcd;
    }

    /**
     * [get] GNLPLTQA: {varchar(255)} <br>
     * 汎用パレット数
     * @return The value of the column 'GNLPLTQA'. (NullAllowed)
     */
    public String getGnlpltqa() {
        return _gnlpltqa;
    }

    /**
     * [set] GNLPLTQA: {varchar(255)} <br>
     * 汎用パレット数
     * @param gnlpltqa The value of the column 'GNLPLTQA'. (NullAllowed)
     */
    public void setGnlpltqa(String gnlpltqa) {
        __modifiedProperties.add("gnlpltqa");
        this._gnlpltqa = gnlpltqa;
    }

    /**
     * [get] OTPLTQA: {varchar(255)} <br>
     * その他パレット数
     * @return The value of the column 'OTPLTQA'. (NullAllowed)
     */
    public String getOtpltqa() {
        return _otpltqa;
    }

    /**
     * [set] OTPLTQA: {varchar(255)} <br>
     * その他パレット数
     * @param otpltqa The value of the column 'OTPLTQA'. (NullAllowed)
     */
    public void setOtpltqa(String otpltqa) {
        __modifiedProperties.add("otpltqa");
        this._otpltqa = otpltqa;
    }

    /**
     * [get] PLNCARKND: {varchar(255)} <br>
     * 計画車種
     * @return The value of the column 'PLNCARKND'. (NullAllowed)
     */
    public String getPlncarknd() {
        return _plncarknd;
    }

    /**
     * [set] PLNCARKND: {varchar(255)} <br>
     * 計画車種
     * @param plncarknd The value of the column 'PLNCARKND'. (NullAllowed)
     */
    public void setPlncarknd(String plncarknd) {
        __modifiedProperties.add("plncarknd");
        this._plncarknd = plncarknd;
    }

    /**
     * [get] AMCARKND: {varchar(255)} <br>
     * 実績車種
     * @return The value of the column 'AMCARKND'. (NullAllowed)
     */
    public String getAmcarknd() {
        return _amcarknd;
    }

    /**
     * [set] AMCARKND: {varchar(255)} <br>
     * 実績車種
     * @param amcarknd The value of the column 'AMCARKND'. (NullAllowed)
     */
    public void setAmcarknd(String amcarknd) {
        __modifiedProperties.add("amcarknd");
        this._amcarknd = amcarknd;
    }

    /**
     * [get] SELNO1: {varchar(255)} <br>
     * 封印Ｎｏ.(1)
     * @return The value of the column 'SELNO1'. (NullAllowed)
     */
    public String getSelno1() {
        return _selno1;
    }

    /**
     * [set] SELNO1: {varchar(255)} <br>
     * 封印Ｎｏ.(1)
     * @param selno1 The value of the column 'SELNO1'. (NullAllowed)
     */
    public void setSelno1(String selno1) {
        __modifiedProperties.add("selno1");
        this._selno1 = selno1;
    }

    /**
     * [get] SELNO2: {varchar(255)} <br>
     * 封印Ｎｏ.(2)
     * @return The value of the column 'SELNO2'. (NullAllowed)
     */
    public String getSelno2() {
        return _selno2;
    }

    /**
     * [set] SELNO2: {varchar(255)} <br>
     * 封印Ｎｏ.(2)
     * @param selno2 The value of the column 'SELNO2'. (NullAllowed)
     */
    public void setSelno2(String selno2) {
        __modifiedProperties.add("selno2");
        this._selno2 = selno2;
    }

    /**
     * [get] SELNO3: {varchar(255)} <br>
     * 封印Ｎｏ.(3)
     * @return The value of the column 'SELNO3'. (NullAllowed)
     */
    public String getSelno3() {
        return _selno3;
    }

    /**
     * [set] SELNO3: {varchar(255)} <br>
     * 封印Ｎｏ.(3)
     * @param selno3 The value of the column 'SELNO3'. (NullAllowed)
     */
    public void setSelno3(String selno3) {
        __modifiedProperties.add("selno3");
        this._selno3 = selno3;
    }

    /**
     * [get] TRANNM: {varchar(255)} <br>
     * 運輸業社名
     * @return The value of the column 'TRANNM'. (NullAllowed)
     */
    public String getTrannm() {
        return _trannm;
    }

    /**
     * [set] TRANNM: {varchar(255)} <br>
     * 運輸業社名
     * @param trannm The value of the column 'TRANNM'. (NullAllowed)
     */
    public void setTrannm(String trannm) {
        __modifiedProperties.add("trannm");
        this._trannm = trannm;
    }

    /**
     * [get] TDRELAYID: {varchar(255)} <br>
     * ＴＤ中継区分
     * @return The value of the column 'TDRELAYID'. (NullAllowed)
     */
    public String getTdrelayid() {
        return _tdrelayid;
    }

    /**
     * [set] TDRELAYID: {varchar(255)} <br>
     * ＴＤ中継区分
     * @param tdrelayid The value of the column 'TDRELAYID'. (NullAllowed)
     */
    public void setTdrelayid(String tdrelayid) {
        __modifiedProperties.add("tdrelayid");
        this._tdrelayid = tdrelayid;
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
