package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_SYSTEM_LOG as TABLE. <br>
 * システムログ
 * <pre>
 * [primary-key]
 *     SYSTEM_LOG_ID
 *
 * [column]
 *     SYSTEM_LOG_ID, SYSTEM_LOG_PROCESS_ID, SYSTEM_LOG_TYPE, SYSTEM_LOG_STATUS, CLASS_CD, METHOD_CD, PROCESS_INFO, PROCESS_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SYSTEM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(BySystemLogType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bClassDtlBySystemLogType, bClassDtlBySystemLogStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBSystemLogDto implements Serializable {

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
    /** SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _systemLogId;

    /** SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _systemLogProcessId;

    /** SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} */
    @JsonKey
    protected String _systemLogType;

    /** SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} */
    @JsonKey
    protected String _systemLogStatus;

    /** CLASS_CD: {NotNull, varchar(100)} */
    @JsonKey
    protected String _classCd;

    /** METHOD_CD: {NotNull, varchar(100)} */
    @JsonKey
    protected String _methodCd;

    /** PROCESS_INFO: {NotNull, varchar(2147483647)} */
    @JsonKey
    protected String _processInfo;

    /** PROCESS_DT: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processDt;

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
    public BsBSystemLogDto() {
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
    protected BClassDtlDto _bClassDtlBySystemLogType;

    public BClassDtlDto getBClassDtlBySystemLogType() {
        return _bClassDtlBySystemLogType;
    }

    public void setBClassDtlBySystemLogType(BClassDtlDto bClassDtlBySystemLogType) {
        this._bClassDtlBySystemLogType = bClassDtlBySystemLogType;
    }

    protected BClassDtlDto _bClassDtlBySystemLogStatus;

    public BClassDtlDto getBClassDtlBySystemLogStatus() {
        return _bClassDtlBySystemLogStatus;
    }

    public void setBClassDtlBySystemLogStatus(BClassDtlDto bClassDtlBySystemLogStatus) {
        this._bClassDtlBySystemLogStatus = bClassDtlBySystemLogStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBSystemLogDto)) { return false; }
        final BsBSystemLogDto otherEntity = (BsBSystemLogDto)other;
        if (!helpComparingValue(getSystemLogId(), otherEntity.getSystemLogId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_SYSTEM_LOG");
        result = xCH(result, getSystemLogId());
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
        sb.append(c).append(getSystemLogId());
        sb.append(c).append(getSystemLogProcessId());
        sb.append(c).append(getSystemLogType());
        sb.append(c).append(getSystemLogStatus());
        sb.append(c).append(getClassCd());
        sb.append(c).append(getMethodCd());
        sb.append(c).append(getProcessInfo());
        sb.append(c).append(getProcessDt());
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
     * [get] SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * システムログID
     * @return The value of the column 'SYSTEM_LOG_ID'. (NullAllowed)
     */
    public Long getSystemLogId() {
        return _systemLogId;
    }

    /**
     * [set] SYSTEM_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * システムログID
     * @param systemLogId The value of the column 'SYSTEM_LOG_ID'. (NullAllowed)
     */
    public void setSystemLogId(Long systemLogId) {
        __modifiedProperties.add("systemLogId");
        this._systemLogId = systemLogId;
    }

    /**
     * [get] SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} <br>
     * システムログ処理ID
     * @return The value of the column 'SYSTEM_LOG_PROCESS_ID'. (NullAllowed)
     */
    public Long getSystemLogProcessId() {
        return _systemLogProcessId;
    }

    /**
     * [set] SYSTEM_LOG_PROCESS_ID: {NotNull, bigint(19)} <br>
     * システムログ処理ID
     * @param systemLogProcessId The value of the column 'SYSTEM_LOG_PROCESS_ID'. (NullAllowed)
     */
    public void setSystemLogProcessId(Long systemLogProcessId) {
        __modifiedProperties.add("systemLogProcessId");
        this._systemLogProcessId = systemLogProcessId;
    }

    /**
     * [get] SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @return The value of the column 'SYSTEM_LOG_TYPE'. (NullAllowed)
     */
    public String getSystemLogType() {
        return _systemLogType;
    }

    /**
     * [set] SYSTEM_LOG_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogType} <br>
     * システムログ種別
     * @param systemLogType The value of the column 'SYSTEM_LOG_TYPE'. (NullAllowed)
     */
    public void setSystemLogType(String systemLogType) {
        __modifiedProperties.add("systemLogType");
        this._systemLogType = systemLogType;
    }

    /**
     * [get] SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @return The value of the column 'SYSTEM_LOG_STATUS'. (NullAllowed)
     */
    public String getSystemLogStatus() {
        return _systemLogStatus;
    }

    /**
     * [set] SYSTEM_LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=SystemLogStatus} <br>
     * システムログステータス
     * @param systemLogStatus The value of the column 'SYSTEM_LOG_STATUS'. (NullAllowed)
     */
    public void setSystemLogStatus(String systemLogStatus) {
        __modifiedProperties.add("systemLogStatus");
        this._systemLogStatus = systemLogStatus;
    }

    /**
     * [get] CLASS_CD: {NotNull, varchar(100)} <br>
     * クラス名
     * @return The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public String getClassCd() {
        return _classCd;
    }

    /**
     * [set] CLASS_CD: {NotNull, varchar(100)} <br>
     * クラス名
     * @param classCd The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public void setClassCd(String classCd) {
        __modifiedProperties.add("classCd");
        this._classCd = classCd;
    }

    /**
     * [get] METHOD_CD: {NotNull, varchar(100)} <br>
     * メソッド名
     * @return The value of the column 'METHOD_CD'. (NullAllowed)
     */
    public String getMethodCd() {
        return _methodCd;
    }

    /**
     * [set] METHOD_CD: {NotNull, varchar(100)} <br>
     * メソッド名
     * @param methodCd The value of the column 'METHOD_CD'. (NullAllowed)
     */
    public void setMethodCd(String methodCd) {
        __modifiedProperties.add("methodCd");
        this._methodCd = methodCd;
    }

    /**
     * [get] PROCESS_INFO: {NotNull, varchar(2147483647)} <br>
     * 処理情報
     * @return The value of the column 'PROCESS_INFO'. (NullAllowed)
     */
    public String getProcessInfo() {
        return _processInfo;
    }

    /**
     * [set] PROCESS_INFO: {NotNull, varchar(2147483647)} <br>
     * 処理情報
     * @param processInfo The value of the column 'PROCESS_INFO'. (NullAllowed)
     */
    public void setProcessInfo(String processInfo) {
        __modifiedProperties.add("processInfo");
        this._processInfo = processInfo;
    }

    /**
     * [get] PROCESS_DT: {NotNull, datetime2(26, 6)} <br>
     * 処理日時
     * @return The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcessDt() {
        return _processDt;
    }

    /**
     * [set] PROCESS_DT: {NotNull, datetime2(26, 6)} <br>
     * 処理日時
     * @param processDt The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    public void setProcessDt(java.sql.Timestamp processDt) {
        __modifiedProperties.add("processDt");
        this._processDt = processDt;
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
