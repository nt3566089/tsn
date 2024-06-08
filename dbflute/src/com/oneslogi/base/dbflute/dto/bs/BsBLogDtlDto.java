package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_LOG_DTL as TABLE. <br>
 * ログ明細
 * <pre>
 * [primary-key]
 *     LOG_DTL_ID
 *
 * [column]
 *     LOG_DTL_ID, LOG_ID, LOG_DTL_TYPE, LOG_DTL_STATUS, LOG_DTL_SECTION_ID, LOG_DTL_SECTION_NM, PROCESS_INFO, PROCESS_DT, MESSAGE_REPLACE_STRING1, MESSAGE_REPLACE_STRING2, MESSAGE_REPLACE_STRING3, MESSAGE_REPLACE_STRING4, MESSAGE_REPLACE_STRING5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_LOG, B_CLASS_DTL(ByLogDtlType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bLog, bClassDtlByLogDtlType, bClassDtlByLogDtlStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBLogDtlDto implements Serializable {

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
    /** LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _logDtlId;

    /** LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} */
    @JsonKey
    protected Long _logId;

    /** LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} */
    @JsonKey
    protected String _logDtlType;

    /** LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} */
    @JsonKey
    protected String _logDtlStatus;

    /** LOG_DTL_SECTION_ID: {bigint(19)} */
    @JsonKey
    protected Long _logDtlSectionId;

    /** LOG_DTL_SECTION_NM: {varchar(60)} */
    @JsonKey
    protected String _logDtlSectionNm;

    /** PROCESS_INFO: {NotNull, varchar(2147483647)} */
    @JsonKey
    protected String _processInfo;

    /** PROCESS_DT: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processDt;

    /** MESSAGE_REPLACE_STRING1: {varchar(2147483647)} */
    @JsonKey
    protected String _messageReplaceString1;

    /** MESSAGE_REPLACE_STRING2: {varchar(2147483647)} */
    @JsonKey
    protected String _messageReplaceString2;

    /** MESSAGE_REPLACE_STRING3: {varchar(2147483647)} */
    @JsonKey
    protected String _messageReplaceString3;

    /** MESSAGE_REPLACE_STRING4: {varchar(2147483647)} */
    @JsonKey
    protected String _messageReplaceString4;

    /** MESSAGE_REPLACE_STRING5: {varchar(2147483647)} */
    @JsonKey
    protected String _messageReplaceString5;

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
    public BsBLogDtlDto() {
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
    protected BLogDto _bLog;

    public BLogDto getBLog() {
        return _bLog;
    }

    public void setBLog(BLogDto bLog) {
        this._bLog = bLog;
    }

    protected BClassDtlDto _bClassDtlByLogDtlType;

    public BClassDtlDto getBClassDtlByLogDtlType() {
        return _bClassDtlByLogDtlType;
    }

    public void setBClassDtlByLogDtlType(BClassDtlDto bClassDtlByLogDtlType) {
        this._bClassDtlByLogDtlType = bClassDtlByLogDtlType;
    }

    protected BClassDtlDto _bClassDtlByLogDtlStatus;

    public BClassDtlDto getBClassDtlByLogDtlStatus() {
        return _bClassDtlByLogDtlStatus;
    }

    public void setBClassDtlByLogDtlStatus(BClassDtlDto bClassDtlByLogDtlStatus) {
        this._bClassDtlByLogDtlStatus = bClassDtlByLogDtlStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBLogDtlDto)) { return false; }
        final BsBLogDtlDto otherEntity = (BsBLogDtlDto)other;
        if (!helpComparingValue(getLogDtlId(), otherEntity.getLogDtlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_LOG_DTL");
        result = xCH(result, getLogDtlId());
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
        sb.append(c).append(getLogDtlId());
        sb.append(c).append(getLogId());
        sb.append(c).append(getLogDtlType());
        sb.append(c).append(getLogDtlStatus());
        sb.append(c).append(getLogDtlSectionId());
        sb.append(c).append(getLogDtlSectionNm());
        sb.append(c).append(getProcessInfo());
        sb.append(c).append(getProcessDt());
        sb.append(c).append(getMessageReplaceString1());
        sb.append(c).append(getMessageReplaceString2());
        sb.append(c).append(getMessageReplaceString3());
        sb.append(c).append(getMessageReplaceString4());
        sb.append(c).append(getMessageReplaceString5());
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
     * [get] LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログ明細ID
     * @return The value of the column 'LOG_DTL_ID'. (NullAllowed)
     */
    public Long getLogDtlId() {
        return _logDtlId;
    }

    /**
     * [set] LOG_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログ明細ID
     * @param logDtlId The value of the column 'LOG_DTL_ID'. (NullAllowed)
     */
    public void setLogDtlId(Long logDtlId) {
        __modifiedProperties.add("logDtlId");
        this._logDtlId = logDtlId;
    }

    /**
     * [get] LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} <br>
     * ログID
     * @return The value of the column 'LOG_ID'. (NullAllowed)
     */
    public Long getLogId() {
        return _logId;
    }

    /**
     * [set] LOG_ID: {IX, NotNull, bigint(19), FK to B_LOG} <br>
     * ログID
     * @param logId The value of the column 'LOG_ID'. (NullAllowed)
     */
    public void setLogId(Long logId) {
        __modifiedProperties.add("logId");
        this._logId = logId;
    }

    /**
     * [get] LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @return The value of the column 'LOG_DTL_TYPE'. (NullAllowed)
     */
    public String getLogDtlType() {
        return _logDtlType;
    }

    /**
     * [set] LOG_DTL_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlType} <br>
     * ログ明細種別
     * @param logDtlType The value of the column 'LOG_DTL_TYPE'. (NullAllowed)
     */
    public void setLogDtlType(String logDtlType) {
        __modifiedProperties.add("logDtlType");
        this._logDtlType = logDtlType;
    }

    /**
     * [get] LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @return The value of the column 'LOG_DTL_STATUS'. (NullAllowed)
     */
    public String getLogDtlStatus() {
        return _logDtlStatus;
    }

    /**
     * [set] LOG_DTL_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogDtlStatus} <br>
     * ログ明細ステータス
     * @param logDtlStatus The value of the column 'LOG_DTL_STATUS'. (NullAllowed)
     */
    public void setLogDtlStatus(String logDtlStatus) {
        __modifiedProperties.add("logDtlStatus");
        this._logDtlStatus = logDtlStatus;
    }

    /**
     * [get] LOG_DTL_SECTION_ID: {bigint(19)} <br>
     * ログ明細セクションID
     * @return The value of the column 'LOG_DTL_SECTION_ID'. (NullAllowed)
     */
    public Long getLogDtlSectionId() {
        return _logDtlSectionId;
    }

    /**
     * [set] LOG_DTL_SECTION_ID: {bigint(19)} <br>
     * ログ明細セクションID
     * @param logDtlSectionId The value of the column 'LOG_DTL_SECTION_ID'. (NullAllowed)
     */
    public void setLogDtlSectionId(Long logDtlSectionId) {
        __modifiedProperties.add("logDtlSectionId");
        this._logDtlSectionId = logDtlSectionId;
    }

    /**
     * [get] LOG_DTL_SECTION_NM: {varchar(60)} <br>
     * ログ明細セクション名称
     * @return The value of the column 'LOG_DTL_SECTION_NM'. (NullAllowed)
     */
    public String getLogDtlSectionNm() {
        return _logDtlSectionNm;
    }

    /**
     * [set] LOG_DTL_SECTION_NM: {varchar(60)} <br>
     * ログ明細セクション名称
     * @param logDtlSectionNm The value of the column 'LOG_DTL_SECTION_NM'. (NullAllowed)
     */
    public void setLogDtlSectionNm(String logDtlSectionNm) {
        __modifiedProperties.add("logDtlSectionNm");
        this._logDtlSectionNm = logDtlSectionNm;
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
     * [get] MESSAGE_REPLACE_STRING1: {varchar(2147483647)} <br>
     * メッセージ差替文字列1
     * @return The value of the column 'MESSAGE_REPLACE_STRING1'. (NullAllowed)
     */
    public String getMessageReplaceString1() {
        return _messageReplaceString1;
    }

    /**
     * [set] MESSAGE_REPLACE_STRING1: {varchar(2147483647)} <br>
     * メッセージ差替文字列1
     * @param messageReplaceString1 The value of the column 'MESSAGE_REPLACE_STRING1'. (NullAllowed)
     */
    public void setMessageReplaceString1(String messageReplaceString1) {
        __modifiedProperties.add("messageReplaceString1");
        this._messageReplaceString1 = messageReplaceString1;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING2: {varchar(2147483647)} <br>
     * メッセージ差替文字列2
     * @return The value of the column 'MESSAGE_REPLACE_STRING2'. (NullAllowed)
     */
    public String getMessageReplaceString2() {
        return _messageReplaceString2;
    }

    /**
     * [set] MESSAGE_REPLACE_STRING2: {varchar(2147483647)} <br>
     * メッセージ差替文字列2
     * @param messageReplaceString2 The value of the column 'MESSAGE_REPLACE_STRING2'. (NullAllowed)
     */
    public void setMessageReplaceString2(String messageReplaceString2) {
        __modifiedProperties.add("messageReplaceString2");
        this._messageReplaceString2 = messageReplaceString2;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING3: {varchar(2147483647)} <br>
     * メッセージ差替文字列3
     * @return The value of the column 'MESSAGE_REPLACE_STRING3'. (NullAllowed)
     */
    public String getMessageReplaceString3() {
        return _messageReplaceString3;
    }

    /**
     * [set] MESSAGE_REPLACE_STRING3: {varchar(2147483647)} <br>
     * メッセージ差替文字列3
     * @param messageReplaceString3 The value of the column 'MESSAGE_REPLACE_STRING3'. (NullAllowed)
     */
    public void setMessageReplaceString3(String messageReplaceString3) {
        __modifiedProperties.add("messageReplaceString3");
        this._messageReplaceString3 = messageReplaceString3;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING4: {varchar(2147483647)} <br>
     * メッセージ差替文字列4
     * @return The value of the column 'MESSAGE_REPLACE_STRING4'. (NullAllowed)
     */
    public String getMessageReplaceString4() {
        return _messageReplaceString4;
    }

    /**
     * [set] MESSAGE_REPLACE_STRING4: {varchar(2147483647)} <br>
     * メッセージ差替文字列4
     * @param messageReplaceString4 The value of the column 'MESSAGE_REPLACE_STRING4'. (NullAllowed)
     */
    public void setMessageReplaceString4(String messageReplaceString4) {
        __modifiedProperties.add("messageReplaceString4");
        this._messageReplaceString4 = messageReplaceString4;
    }

    /**
     * [get] MESSAGE_REPLACE_STRING5: {varchar(2147483647)} <br>
     * メッセージ差替文字列5
     * @return The value of the column 'MESSAGE_REPLACE_STRING5'. (NullAllowed)
     */
    public String getMessageReplaceString5() {
        return _messageReplaceString5;
    }

    /**
     * [set] MESSAGE_REPLACE_STRING5: {varchar(2147483647)} <br>
     * メッセージ差替文字列5
     * @param messageReplaceString5 The value of the column 'MESSAGE_REPLACE_STRING5'. (NullAllowed)
     */
    public void setMessageReplaceString5(String messageReplaceString5) {
        __modifiedProperties.add("messageReplaceString5");
        this._messageReplaceString5 = messageReplaceString5;
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
