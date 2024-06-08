package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_CCUSAUINF as TABLE. <br>
 * お得意様別集計情報
 * <pre>
 * [primary-key]
 *     CLIENT_TOTAL_INFO_ID
 *
 * [column]
 *     CLIENT_TOTAL_INFO_ID, ZZORGNCD, DPCD, DLVYMD, DED, ZZPSTNID, SROPRTYMD, SROPRTCNT, DLVSNM, DLVDTLSNM, SSCD, SSNM, SRQACB, SRQACBLIN, SRQACBBLK, SRQACBDM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_TOTAL_INFO_ID
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
public abstract class BsTCcusauinfDto implements Serializable {

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
    /** CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _clientTotalInfoId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** DPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DLVYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ded;

    /** ZZPSTNID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzpstnid;

    /** SROPRTYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _sroprtymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** DLVSNM: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _dlvsnm;

    /** DLVDTLSNM: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _dlvdtlsnm;

    /** SSCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    @JsonKey
    protected String _ssnm;

    /** SRQACB: {bigint(19)} */
    @JsonKey
    protected Long _srqacb;

    /** SRQACBLIN: {bigint(19)} */
    @JsonKey
    protected Long _srqacblin;

    /** SRQACBBLK: {bigint(19)} */
    @JsonKey
    protected Long _srqacbblk;

    /** SRQACBDM: {bigint(19)} */
    @JsonKey
    protected Long _srqacbdm;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

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
    public BsTCcusauinfDto() {
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
        if (other == null || !(other instanceof BsTCcusauinfDto)) { return false; }
        final BsTCcusauinfDto otherEntity = (BsTCcusauinfDto)other;
        if (!helpComparingValue(getClientTotalInfoId(), otherEntity.getClientTotalInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CCUSAUINF");
        result = xCH(result, getClientTotalInfoId());
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
        sb.append(c).append(getClientTotalInfoId());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDed());
        sb.append(c).append(getZzpstnid());
        sb.append(c).append(getSroprtymd());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getDlvsnm());
        sb.append(c).append(getDlvdtlsnm());
        sb.append(c).append(getSscd());
        sb.append(c).append(getSsnm());
        sb.append(c).append(getSrqacb());
        sb.append(c).append(getSrqacblin());
        sb.append(c).append(getSrqacbblk());
        sb.append(c).append(getSrqacbdm());
        sb.append(c).append(getCenterId());
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
     * [get] CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お得意様別集計情報ID
     * @return The value of the column 'CLIENT_TOTAL_INFO_ID'. (NullAllowed)
     */
    public Long getClientTotalInfoId() {
        return _clientTotalInfoId;
    }

    /**
     * [set] CLIENT_TOTAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お得意様別集計情報ID
     * @param clientTotalInfoId The value of the column 'CLIENT_TOTAL_INFO_ID'. (NullAllowed)
     */
    public void setClientTotalInfoId(Long clientTotalInfoId) {
        __modifiedProperties.add("clientTotalInfoId");
        this._clientTotalInfoId = clientTotalInfoId;
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
     * [get] ZZPSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'ZZPSTNID'. (NullAllowed)
     */
    public String getZzpstnid() {
        return _zzpstnid;
    }

    /**
     * [set] ZZPSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param zzpstnid The value of the column 'ZZPSTNID'. (NullAllowed)
     */
    public void setZzpstnid(String zzpstnid) {
        __modifiedProperties.add("zzpstnid");
        this._zzpstnid = zzpstnid;
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
     * [get] DLVSNM: {NotNull, bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (NullAllowed)
     */
    public Long getDlvsnm() {
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {NotNull, bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed)
     */
    public void setDlvsnm(Long dlvsnm) {
        __modifiedProperties.add("dlvsnm");
        this._dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {NotNull, bigint(19)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public Long getDlvdtlsnm() {
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {NotNull, bigint(19)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public void setDlvdtlsnm(Long dlvdtlsnm) {
        __modifiedProperties.add("dlvdtlsnm");
        this._dlvdtlsnm = dlvdtlsnm;
    }

    /**
     * [get] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed)
     */
    public String getSscd() {
        return _sscd;
    }

    /**
     * [set] SSCD: {NotNull, varchar(30)} <br>
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
     * [get] SRQACB: {bigint(19)} <br>
     * 仕分段ボール数
     * @return The value of the column 'SRQACB'. (NullAllowed)
     */
    public Long getSrqacb() {
        return _srqacb;
    }

    /**
     * [set] SRQACB: {bigint(19)} <br>
     * 仕分段ボール数
     * @param srqacb The value of the column 'SRQACB'. (NullAllowed)
     */
    public void setSrqacb(Long srqacb) {
        __modifiedProperties.add("srqacb");
        this._srqacb = srqacb;
    }

    /**
     * [get] SRQACBLIN: {bigint(19)} <br>
     * 仕分段ボール数(ライン数)
     * @return The value of the column 'SRQACBLIN'. (NullAllowed)
     */
    public Long getSrqacblin() {
        return _srqacblin;
    }

    /**
     * [set] SRQACBLIN: {bigint(19)} <br>
     * 仕分段ボール数(ライン数)
     * @param srqacblin The value of the column 'SRQACBLIN'. (NullAllowed)
     */
    public void setSrqacblin(Long srqacblin) {
        __modifiedProperties.add("srqacblin");
        this._srqacblin = srqacblin;
    }

    /**
     * [get] SRQACBBLK: {bigint(19)} <br>
     * 仕分段ボール数(ブロック数)
     * @return The value of the column 'SRQACBBLK'. (NullAllowed)
     */
    public Long getSrqacbblk() {
        return _srqacbblk;
    }

    /**
     * [set] SRQACBBLK: {bigint(19)} <br>
     * 仕分段ボール数(ブロック数)
     * @param srqacbblk The value of the column 'SRQACBBLK'. (NullAllowed)
     */
    public void setSrqacbblk(Long srqacbblk) {
        __modifiedProperties.add("srqacbblk");
        this._srqacbblk = srqacbblk;
    }

    /**
     * [get] SRQACBDM: {bigint(19)} <br>
     * 仕分段ボール数(丸段数)
     * @return The value of the column 'SRQACBDM'. (NullAllowed)
     */
    public Long getSrqacbdm() {
        return _srqacbdm;
    }

    /**
     * [set] SRQACBDM: {bigint(19)} <br>
     * 仕分段ボール数(丸段数)
     * @param srqacbdm The value of the column 'SRQACBDM'. (NullAllowed)
     */
    public void setSrqacbdm(Long srqacbdm) {
        __modifiedProperties.add("srqacbdm");
        this._srqacbdm = srqacbdm;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
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
