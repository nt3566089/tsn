package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_PACKING_R as TABLE. <br>
 * 梱包帳票
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, STW_OUT_FLG, STW_OUT_USER_ID, STW_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, TAG_DL_URL, INSPECTION_OUT_FLG, INSPECTION_OUT_USER_ID, INSPECTION_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_USER, T_PACKING_H, B_CLASS_DTL(ByStwOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUserByTagOutUserId, bUserByInspectionOutUserId, tPackingH, bUserByStwOutUserId, bClassDtlByStwOutFlg, bClassDtlByTagOutFlg, bClassDtlByInspectionOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPackingRDto implements Serializable {

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
    /** PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} */
    @JsonKey
    protected Long _packingHId;

    /** STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _stwOutFlg;

    /** STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _stwOutUserId;

    /** STW_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _stwOutDt;

    /** TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _tagOutFlg;

    /** TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _tagOutUserId;

    /** TAG_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _tagOutDt;

    /** TAG_DL_URL: {varchar(255)} */
    @JsonKey
    protected String _tagDlUrl;

    /** INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _inspectionOutFlg;

    /** INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _inspectionOutUserId;

    /** INSPECTION_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _inspectionOutDt;

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
    public BsTPackingRDto() {
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
    protected BUserDto _bUserByTagOutUserId;

    public BUserDto getBUserByTagOutUserId() {
        return _bUserByTagOutUserId;
    }

    public void setBUserByTagOutUserId(BUserDto bUserByTagOutUserId) {
        this._bUserByTagOutUserId = bUserByTagOutUserId;
    }

    protected BUserDto _bUserByInspectionOutUserId;

    public BUserDto getBUserByInspectionOutUserId() {
        return _bUserByInspectionOutUserId;
    }

    public void setBUserByInspectionOutUserId(BUserDto bUserByInspectionOutUserId) {
        this._bUserByInspectionOutUserId = bUserByInspectionOutUserId;
    }

    protected TPackingHDto _tPackingH;

    public TPackingHDto getTPackingH() {
        return _tPackingH;
    }

    public void setTPackingH(TPackingHDto tPackingH) {
        this._tPackingH = tPackingH;
    }

    protected BUserDto _bUserByStwOutUserId;

    public BUserDto getBUserByStwOutUserId() {
        return _bUserByStwOutUserId;
    }

    public void setBUserByStwOutUserId(BUserDto bUserByStwOutUserId) {
        this._bUserByStwOutUserId = bUserByStwOutUserId;
    }

    protected BClassDtlDto _bClassDtlByStwOutFlg;

    public BClassDtlDto getBClassDtlByStwOutFlg() {
        return _bClassDtlByStwOutFlg;
    }

    public void setBClassDtlByStwOutFlg(BClassDtlDto bClassDtlByStwOutFlg) {
        this._bClassDtlByStwOutFlg = bClassDtlByStwOutFlg;
    }

    protected BClassDtlDto _bClassDtlByTagOutFlg;

    public BClassDtlDto getBClassDtlByTagOutFlg() {
        return _bClassDtlByTagOutFlg;
    }

    public void setBClassDtlByTagOutFlg(BClassDtlDto bClassDtlByTagOutFlg) {
        this._bClassDtlByTagOutFlg = bClassDtlByTagOutFlg;
    }

    protected BClassDtlDto _bClassDtlByInspectionOutFlg;

    public BClassDtlDto getBClassDtlByInspectionOutFlg() {
        return _bClassDtlByInspectionOutFlg;
    }

    public void setBClassDtlByInspectionOutFlg(BClassDtlDto bClassDtlByInspectionOutFlg) {
        this._bClassDtlByInspectionOutFlg = bClassDtlByInspectionOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPackingRDto)) { return false; }
        final BsTPackingRDto otherEntity = (BsTPackingRDto)other;
        if (!helpComparingValue(getPackingHId(), otherEntity.getPackingHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PACKING_R");
        result = xCH(result, getPackingHId());
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
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getStwOutFlg());
        sb.append(c).append(getStwOutUserId());
        sb.append(c).append(getStwOutDt());
        sb.append(c).append(getTagOutFlg());
        sb.append(c).append(getTagOutUserId());
        sb.append(c).append(getTagOutDt());
        sb.append(c).append(getTagDlUrl());
        sb.append(c).append(getInspectionOutFlg());
        sb.append(c).append(getInspectionOutUserId());
        sb.append(c).append(getInspectionOutDt());
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
     * [get] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 積込リスト出力フラグ
     * @return The value of the column 'STW_OUT_FLG'. (NullAllowed)
     */
    public String getStwOutFlg() {
        return _stwOutFlg;
    }

    /**
     * [set] STW_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 積込リスト出力フラグ
     * @param stwOutFlg The value of the column 'STW_OUT_FLG'. (NullAllowed)
     */
    public void setStwOutFlg(String stwOutFlg) {
        __modifiedProperties.add("stwOutFlg");
        this._stwOutFlg = stwOutFlg;
    }

    /**
     * [get] STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 積込リスト出力者ID
     * @return The value of the column 'STW_OUT_USER_ID'. (NullAllowed)
     */
    public Long getStwOutUserId() {
        return _stwOutUserId;
    }

    /**
     * [set] STW_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 積込リスト出力者ID
     * @param stwOutUserId The value of the column 'STW_OUT_USER_ID'. (NullAllowed)
     */
    public void setStwOutUserId(Long stwOutUserId) {
        __modifiedProperties.add("stwOutUserId");
        this._stwOutUserId = stwOutUserId;
    }

    /**
     * [get] STW_OUT_DT: {datetime2(26, 6)} <br>
     * 積込リスト出力日時
     * @return The value of the column 'STW_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStwOutDt() {
        return _stwOutDt;
    }

    /**
     * [set] STW_OUT_DT: {datetime2(26, 6)} <br>
     * 積込リスト出力日時
     * @param stwOutDt The value of the column 'STW_OUT_DT'. (NullAllowed)
     */
    public void setStwOutDt(java.sql.Timestamp stwOutDt) {
        __modifiedProperties.add("stwOutDt");
        this._stwOutDt = stwOutDt;
    }

    /**
     * [get] TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 荷札出力フラグ
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public String getTagOutFlg() {
        return _tagOutFlg;
    }

    /**
     * [set] TAG_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 荷札出力フラグ
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public void setTagOutFlg(String tagOutFlg) {
        __modifiedProperties.add("tagOutFlg");
        this._tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 荷札出力者ID
     * @return The value of the column 'TAG_OUT_USER_ID'. (NullAllowed)
     */
    public Long getTagOutUserId() {
        return _tagOutUserId;
    }

    /**
     * [set] TAG_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 荷札出力者ID
     * @param tagOutUserId The value of the column 'TAG_OUT_USER_ID'. (NullAllowed)
     */
    public void setTagOutUserId(Long tagOutUserId) {
        __modifiedProperties.add("tagOutUserId");
        this._tagOutUserId = tagOutUserId;
    }

    /**
     * [get] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * 荷札出力日時
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTagOutDt() {
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * 荷札出力日時
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        __modifiedProperties.add("tagOutDt");
        this._tagOutDt = tagOutDt;
    }

    /**
     * [get] TAG_DL_URL: {varchar(255)} <br>
     * 荷札ダウンロードURL
     * @return The value of the column 'TAG_DL_URL'. (NullAllowed)
     */
    public String getTagDlUrl() {
        return _tagDlUrl;
    }

    /**
     * [set] TAG_DL_URL: {varchar(255)} <br>
     * 荷札ダウンロードURL
     * @param tagDlUrl The value of the column 'TAG_DL_URL'. (NullAllowed)
     */
    public void setTagDlUrl(String tagDlUrl) {
        __modifiedProperties.add("tagDlUrl");
        this._tagDlUrl = tagDlUrl;
    }

    /**
     * [get] INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @return The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed)
     */
    public String getInspectionOutFlg() {
        return _inspectionOutFlg;
    }

    /**
     * [set] INSPECTION_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @param inspectionOutFlg The value of the column 'INSPECTION_OUT_FLG'. (NullAllowed)
     */
    public void setInspectionOutFlg(String inspectionOutFlg) {
        __modifiedProperties.add("inspectionOutFlg");
        this._inspectionOutFlg = inspectionOutFlg;
    }

    /**
     * [get] INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * SD検品ラベル出力者ID
     * @return The value of the column 'INSPECTION_OUT_USER_ID'. (NullAllowed)
     */
    public Long getInspectionOutUserId() {
        return _inspectionOutUserId;
    }

    /**
     * [set] INSPECTION_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * SD検品ラベル出力者ID
     * @param inspectionOutUserId The value of the column 'INSPECTION_OUT_USER_ID'. (NullAllowed)
     */
    public void setInspectionOutUserId(Long inspectionOutUserId) {
        __modifiedProperties.add("inspectionOutUserId");
        this._inspectionOutUserId = inspectionOutUserId;
    }

    /**
     * [get] INSPECTION_OUT_DT: {datetime2(26, 6)} <br>
     * SD検品ラベル出力日時
     * @return The value of the column 'INSPECTION_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInspectionOutDt() {
        return _inspectionOutDt;
    }

    /**
     * [set] INSPECTION_OUT_DT: {datetime2(26, 6)} <br>
     * SD検品ラベル出力日時
     * @param inspectionOutDt The value of the column 'INSPECTION_OUT_DT'. (NullAllowed)
     */
    public void setInspectionOutDt(java.sql.Timestamp inspectionOutDt) {
        __modifiedProperties.add("inspectionOutDt");
        this._inspectionOutDt = inspectionOutDt;
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
