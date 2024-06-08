package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_CDTLVMKADM as TABLE. <br>
 * 明細書・ラベル作表管理
 * <pre>
 * [primary-key]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
 *
 * [column]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID, ZZORGNCD, SRYMD, SROPRTCNT, DLVYMD, DPCD, DED, PSTNID, LINBLK, SRRNK, MKDTM, LSTDSYMD, SRLINCD, SRSRRNK, SPECIFICATION_PRINTEDFLG, LABEL_PRINTEDFLG, REPORT_ID, REPORT_NM, STOCK_NUM, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SPECIFICATION_LABEL_MAKE_MANAGE_ID
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
public abstract class BsTCdtlvmkadmDto implements Serializable {

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
    /** SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _specificationLabelMakeManageId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** SRYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _srymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** DLVYMD: {varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DED: {varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {varchar(30)} */
    @JsonKey
    protected String _pstnid;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** MKDTM: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _mkdtm;

    /** LSTDSYMD: {varchar(8)} */
    @JsonKey
    protected String _lstdsymd;

    /** SRLINCD: {varchar(30)} */
    @JsonKey
    protected String _srlincd;

    /** SRSRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srsrrnk;

    /** SPECIFICATION_PRINTEDFLG: {char(1)} */
    @JsonKey
    protected String _specificationPrintedflg;

    /** LABEL_PRINTEDFLG: {char(1)} */
    @JsonKey
    protected String _labelPrintedflg;

    /** REPORT_ID: {bigint(19)} */
    @JsonKey
    protected Long _reportId;

    /** REPORT_NM: {varchar(30)} */
    @JsonKey
    protected String _reportNm;

    /** STOCK_NUM: {bigint(19)} */
    @JsonKey
    protected Long _stockNum;

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
    public BsTCdtlvmkadmDto() {
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
        if (other == null || !(other instanceof BsTCdtlvmkadmDto)) { return false; }
        final BsTCdtlvmkadmDto otherEntity = (BsTCdtlvmkadmDto)other;
        if (!helpComparingValue(getSpecificationLabelMakeManageId(), otherEntity.getSpecificationLabelMakeManageId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CDTLVMKADM");
        result = xCH(result, getSpecificationLabelMakeManageId());
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
        sb.append(c).append(getSpecificationLabelMakeManageId());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getSrymd());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getMkdtm());
        sb.append(c).append(getLstdsymd());
        sb.append(c).append(getSrlincd());
        sb.append(c).append(getSrsrrnk());
        sb.append(c).append(getSpecificationPrintedflg());
        sb.append(c).append(getLabelPrintedflg());
        sb.append(c).append(getReportId());
        sb.append(c).append(getReportNm());
        sb.append(c).append(getStockNum());
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
     * [get] SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 明細書・ラベル作表管理ID
     * @return The value of the column 'SPECIFICATION_LABEL_MAKE_MANAGE_ID'. (NullAllowed)
     */
    public Long getSpecificationLabelMakeManageId() {
        return _specificationLabelMakeManageId;
    }

    /**
     * [set] SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 明細書・ラベル作表管理ID
     * @param specificationLabelMakeManageId The value of the column 'SPECIFICATION_LABEL_MAKE_MANAGE_ID'. (NullAllowed)
     */
    public void setSpecificationLabelMakeManageId(Long specificationLabelMakeManageId) {
        __modifiedProperties.add("specificationLabelMakeManageId");
        this._specificationLabelMakeManageId = specificationLabelMakeManageId;
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
     * [get] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SRYMD'. (NullAllowed)
     */
    public String getSrymd() {
        return _srymd;
    }

    /**
     * [set] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @param srymd The value of the column 'SRYMD'. (NullAllowed)
     */
    public void setSrymd(String srymd) {
        __modifiedProperties.add("srymd");
        this._srymd = srymd;
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
     * [get] PSTNID: {varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
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
     * [get] MKDTM: {datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'MKDTM'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getMkdtm() {
        return _mkdtm;
    }

    /**
     * [set] MKDTM: {datetime2(26, 6)} <br>
     * 作成日時
     * @param mkdtm The value of the column 'MKDTM'. (NullAllowed)
     */
    public void setMkdtm(java.sql.Timestamp mkdtm) {
        __modifiedProperties.add("mkdtm");
        this._mkdtm = mkdtm;
    }

    /**
     * [get] LSTDSYMD: {varchar(8)} <br>
     * 帳票廃棄日
     * @return The value of the column 'LSTDSYMD'. (NullAllowed)
     */
    public String getLstdsymd() {
        return _lstdsymd;
    }

    /**
     * [set] LSTDSYMD: {varchar(8)} <br>
     * 帳票廃棄日
     * @param lstdsymd The value of the column 'LSTDSYMD'. (NullAllowed)
     */
    public void setLstdsymd(String lstdsymd) {
        __modifiedProperties.add("lstdsymd");
        this._lstdsymd = lstdsymd;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分用ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed)
     */
    public String getSrlincd() {
        return _srlincd;
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分用ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed)
     */
    public void setSrlincd(String srlincd) {
        __modifiedProperties.add("srlincd");
        this._srlincd = srlincd;
    }

    /**
     * [get] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @return The value of the column 'SRSRRNK'. (NullAllowed)
     */
    public Long getSrsrrnk() {
        return _srsrrnk;
    }

    /**
     * [set] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @param srsrrnk The value of the column 'SRSRRNK'. (NullAllowed)
     */
    public void setSrsrrnk(Long srsrrnk) {
        __modifiedProperties.add("srsrrnk");
        this._srsrrnk = srsrrnk;
    }

    /**
     * [get] SPECIFICATION_PRINTEDFLG: {char(1)} <br>
     * 明細書印刷済フラグ
     * @return The value of the column 'SPECIFICATION_PRINTEDFLG'. (NullAllowed)
     */
    public String getSpecificationPrintedflg() {
        return _specificationPrintedflg;
    }

    /**
     * [set] SPECIFICATION_PRINTEDFLG: {char(1)} <br>
     * 明細書印刷済フラグ
     * @param specificationPrintedflg The value of the column 'SPECIFICATION_PRINTEDFLG'. (NullAllowed)
     */
    public void setSpecificationPrintedflg(String specificationPrintedflg) {
        __modifiedProperties.add("specificationPrintedflg");
        this._specificationPrintedflg = specificationPrintedflg;
    }

    /**
     * [get] LABEL_PRINTEDFLG: {char(1)} <br>
     * ラベル印刷済フラグ
     * @return The value of the column 'LABEL_PRINTEDFLG'. (NullAllowed)
     */
    public String getLabelPrintedflg() {
        return _labelPrintedflg;
    }

    /**
     * [set] LABEL_PRINTEDFLG: {char(1)} <br>
     * ラベル印刷済フラグ
     * @param labelPrintedflg The value of the column 'LABEL_PRINTEDFLG'. (NullAllowed)
     */
    public void setLabelPrintedflg(String labelPrintedflg) {
        __modifiedProperties.add("labelPrintedflg");
        this._labelPrintedflg = labelPrintedflg;
    }

    /**
     * [get] REPORT_ID: {bigint(19)} <br>
     * 帳票ID
     * @return The value of the column 'REPORT_ID'. (NullAllowed)
     */
    public Long getReportId() {
        return _reportId;
    }

    /**
     * [set] REPORT_ID: {bigint(19)} <br>
     * 帳票ID
     * @param reportId The value of the column 'REPORT_ID'. (NullAllowed)
     */
    public void setReportId(Long reportId) {
        __modifiedProperties.add("reportId");
        this._reportId = reportId;
    }

    /**
     * [get] REPORT_NM: {varchar(30)} <br>
     * 帳票名
     * @return The value of the column 'REPORT_NM'. (NullAllowed)
     */
    public String getReportNm() {
        return _reportNm;
    }

    /**
     * [set] REPORT_NM: {varchar(30)} <br>
     * 帳票名
     * @param reportNm The value of the column 'REPORT_NM'. (NullAllowed)
     */
    public void setReportNm(String reportNm) {
        __modifiedProperties.add("reportNm");
        this._reportNm = reportNm;
    }

    /**
     * [get] STOCK_NUM: {bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'STOCK_NUM'. (NullAllowed)
     */
    public Long getStockNum() {
        return _stockNum;
    }

    /**
     * [set] STOCK_NUM: {bigint(19)} <br>
     * 補充回数
     * @param stockNum The value of the column 'STOCK_NUM'. (NullAllowed)
     */
    public void setStockNum(Long stockNum) {
        __modifiedProperties.add("stockNum");
        this._stockNum = stockNum;
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
