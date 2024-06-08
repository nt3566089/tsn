package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of B_DML_LOG as TABLE. <br>
 * 変更ログ
 * <pre>
 * [primary-key]
 *     DML_LOG_ID
 *
 * [column]
 *     DML_LOG_ID, DML_KBN, DML_TABLE_NM, DML_COLUMN_NM, DML_ROW_ID, DML_BEFORE_VALUE, DML_AFTER_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DML_LOG_ID
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
public abstract class BsBDmlLogDto implements Serializable {

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
    /** DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _dmlLogId;

    /** DML_KBN: {varchar(30)} */
    @JsonKey
    protected String _dmlKbn;

    /** DML_TABLE_NM: {varchar(30)} */
    @JsonKey
    protected String _dmlTableNm;

    /** DML_COLUMN_NM: {varchar(30)} */
    @JsonKey
    protected String _dmlColumnNm;

    /** DML_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _dmlRowId;

    /** DML_BEFORE_VALUE: {varchar(255)} */
    @JsonKey
    protected String _dmlBeforeValue;

    /** DML_AFTER_VALUE: {varchar(255)} */
    @JsonKey
    protected String _dmlAfterValue;

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
    public BsBDmlLogDto() {
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
        if (other == null || !(other instanceof BsBDmlLogDto)) { return false; }
        final BsBDmlLogDto otherEntity = (BsBDmlLogDto)other;
        if (!helpComparingValue(getDmlLogId(), otherEntity.getDmlLogId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_DML_LOG");
        result = xCH(result, getDmlLogId());
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
        sb.append(c).append(getDmlLogId());
        sb.append(c).append(getDmlKbn());
        sb.append(c).append(getDmlTableNm());
        sb.append(c).append(getDmlColumnNm());
        sb.append(c).append(getDmlRowId());
        sb.append(c).append(getDmlBeforeValue());
        sb.append(c).append(getDmlAfterValue());
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
     * [get] DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 変更ログID
     * @return The value of the column 'DML_LOG_ID'. (NullAllowed)
     */
    public Long getDmlLogId() {
        return _dmlLogId;
    }

    /**
     * [set] DML_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 変更ログID
     * @param dmlLogId The value of the column 'DML_LOG_ID'. (NullAllowed)
     */
    public void setDmlLogId(Long dmlLogId) {
        __modifiedProperties.add("dmlLogId");
        this._dmlLogId = dmlLogId;
    }

    /**
     * [get] DML_KBN: {varchar(30)} <br>
     * 変更区分
     * @return The value of the column 'DML_KBN'. (NullAllowed)
     */
    public String getDmlKbn() {
        return _dmlKbn;
    }

    /**
     * [set] DML_KBN: {varchar(30)} <br>
     * 変更区分
     * @param dmlKbn The value of the column 'DML_KBN'. (NullAllowed)
     */
    public void setDmlKbn(String dmlKbn) {
        __modifiedProperties.add("dmlKbn");
        this._dmlKbn = dmlKbn;
    }

    /**
     * [get] DML_TABLE_NM: {varchar(30)} <br>
     * 変更テーブル名
     * @return The value of the column 'DML_TABLE_NM'. (NullAllowed)
     */
    public String getDmlTableNm() {
        return _dmlTableNm;
    }

    /**
     * [set] DML_TABLE_NM: {varchar(30)} <br>
     * 変更テーブル名
     * @param dmlTableNm The value of the column 'DML_TABLE_NM'. (NullAllowed)
     */
    public void setDmlTableNm(String dmlTableNm) {
        __modifiedProperties.add("dmlTableNm");
        this._dmlTableNm = dmlTableNm;
    }

    /**
     * [get] DML_COLUMN_NM: {varchar(30)} <br>
     * 変更列名
     * @return The value of the column 'DML_COLUMN_NM'. (NullAllowed)
     */
    public String getDmlColumnNm() {
        return _dmlColumnNm;
    }

    /**
     * [set] DML_COLUMN_NM: {varchar(30)} <br>
     * 変更列名
     * @param dmlColumnNm The value of the column 'DML_COLUMN_NM'. (NullAllowed)
     */
    public void setDmlColumnNm(String dmlColumnNm) {
        __modifiedProperties.add("dmlColumnNm");
        this._dmlColumnNm = dmlColumnNm;
    }

    /**
     * [get] DML_ROW_ID: {bigint(19)} <br>
     * 変更行ID
     * @return The value of the column 'DML_ROW_ID'. (NullAllowed)
     */
    public Long getDmlRowId() {
        return _dmlRowId;
    }

    /**
     * [set] DML_ROW_ID: {bigint(19)} <br>
     * 変更行ID
     * @param dmlRowId The value of the column 'DML_ROW_ID'. (NullAllowed)
     */
    public void setDmlRowId(Long dmlRowId) {
        __modifiedProperties.add("dmlRowId");
        this._dmlRowId = dmlRowId;
    }

    /**
     * [get] DML_BEFORE_VALUE: {varchar(255)} <br>
     * 変更前値
     * @return The value of the column 'DML_BEFORE_VALUE'. (NullAllowed)
     */
    public String getDmlBeforeValue() {
        return _dmlBeforeValue;
    }

    /**
     * [set] DML_BEFORE_VALUE: {varchar(255)} <br>
     * 変更前値
     * @param dmlBeforeValue The value of the column 'DML_BEFORE_VALUE'. (NullAllowed)
     */
    public void setDmlBeforeValue(String dmlBeforeValue) {
        __modifiedProperties.add("dmlBeforeValue");
        this._dmlBeforeValue = dmlBeforeValue;
    }

    /**
     * [get] DML_AFTER_VALUE: {varchar(255)} <br>
     * 変更後値
     * @return The value of the column 'DML_AFTER_VALUE'. (NullAllowed)
     */
    public String getDmlAfterValue() {
        return _dmlAfterValue;
    }

    /**
     * [set] DML_AFTER_VALUE: {varchar(255)} <br>
     * 変更後値
     * @param dmlAfterValue The value of the column 'DML_AFTER_VALUE'. (NullAllowed)
     */
    public void setDmlAfterValue(String dmlAfterValue) {
        __modifiedProperties.add("dmlAfterValue");
        this._dmlAfterValue = dmlAfterValue;
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
