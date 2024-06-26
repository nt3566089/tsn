package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_INFO as TABLE. <br>
 * お知らせマスタ
 * <pre>
 * [primary-key]
 *     INFO_ID
 *
 * [column]
 *     INFO_ID, CULTURE_ID, INFO_NM, INFO_START_DT, INFO_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CULTURE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bCulture
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBInfoDto implements Serializable {

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
    /** INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _infoId;

    /** CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _cultureId;

    /** INFO_NM: {varchar(255)} */
    @JsonKey
    protected String _infoNm;

    /** INFO_START_DT: {varchar(8)} */
    @JsonKey
    protected String _infoStartDt;

    /** INFO_END_DT: {varchar(8)} */
    @JsonKey
    protected String _infoEndDt;

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
    public BsBInfoDto() {
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
    protected BCultureDto _bCulture;

    public BCultureDto getBCulture() {
        return _bCulture;
    }

    public void setBCulture(BCultureDto bCulture) {
        this._bCulture = bCulture;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBInfoDto)) { return false; }
        final BsBInfoDto otherEntity = (BsBInfoDto)other;
        if (!helpComparingValue(getInfoId(), otherEntity.getInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_INFO");
        result = xCH(result, getInfoId());
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
        sb.append(c).append(getInfoId());
        sb.append(c).append(getCultureId());
        sb.append(c).append(getInfoNm());
        sb.append(c).append(getInfoStartDt());
        sb.append(c).append(getInfoEndDt());
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
     * [get] INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お知らせID
     * @return The value of the column 'INFO_ID'. (NullAllowed)
     */
    public Long getInfoId() {
        return _infoId;
    }

    /**
     * [set] INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * お知らせID
     * @param infoId The value of the column 'INFO_ID'. (NullAllowed)
     */
    public void setInfoId(Long infoId) {
        __modifiedProperties.add("infoId");
        this._infoId = infoId;
    }

    /**
     * [get] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, NotNull, bigint(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] INFO_NM: {varchar(255)} <br>
     * お知らせ
     * @return The value of the column 'INFO_NM'. (NullAllowed)
     */
    public String getInfoNm() {
        return _infoNm;
    }

    /**
     * [set] INFO_NM: {varchar(255)} <br>
     * お知らせ
     * @param infoNm The value of the column 'INFO_NM'. (NullAllowed)
     */
    public void setInfoNm(String infoNm) {
        __modifiedProperties.add("infoNm");
        this._infoNm = infoNm;
    }

    /**
     * [get] INFO_START_DT: {varchar(8)} <br>
     * 開始日付
     * @return The value of the column 'INFO_START_DT'. (NullAllowed)
     */
    public String getInfoStartDt() {
        return _infoStartDt;
    }

    /**
     * [set] INFO_START_DT: {varchar(8)} <br>
     * 開始日付
     * @param infoStartDt The value of the column 'INFO_START_DT'. (NullAllowed)
     */
    public void setInfoStartDt(String infoStartDt) {
        __modifiedProperties.add("infoStartDt");
        this._infoStartDt = infoStartDt;
    }

    /**
     * [get] INFO_END_DT: {varchar(8)} <br>
     * 終了日付
     * @return The value of the column 'INFO_END_DT'. (NullAllowed)
     */
    public String getInfoEndDt() {
        return _infoEndDt;
    }

    /**
     * [set] INFO_END_DT: {varchar(8)} <br>
     * 終了日付
     * @param infoEndDt The value of the column 'INFO_END_DT'. (NullAllowed)
     */
    public void setInfoEndDt(String infoEndDt) {
        __modifiedProperties.add("infoEndDt");
        this._infoEndDt = infoEndDt;
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
