package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WORK as TABLE. <br>
 * 勤務実績ワーク
 * <pre>
 * [primary-key]
 *     WORK_ID
 *
 * [column]
 *     WORK_ID, CENTER_CD, WORK_USER_CD, WORK_DT, CLOCK_IN_FLG, CLOCK_OUT_FLG, ENTRY_START_DT, ENTRY_START_TM, ENTRY_END_DT, ENTRY_END_TM, BREAK_START_FLG, BREAK_START_DT, BREAK_START_TM, BREAK_END_DT, BREAK_END_TM, FORCED_CLOCK_OUT_FLG, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_ID
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
public abstract class BsWWorkDto implements Serializable {

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
    /** WORK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _workId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** WORK_USER_CD: {varchar(30)} */
    @JsonKey
    protected String _workUserCd;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** CLOCK_IN_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _clockInFlg;

    /** CLOCK_OUT_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _clockOutFlg;

    /** ENTRY_START_DT: {varchar(8)} */
    @JsonKey
    protected String _entryStartDt;

    /** ENTRY_START_TM: {varchar(6)} */
    @JsonKey
    protected String _entryStartTm;

    /** ENTRY_END_DT: {varchar(8)} */
    @JsonKey
    protected String _entryEndDt;

    /** ENTRY_END_TM: {varchar(6)} */
    @JsonKey
    protected String _entryEndTm;

    /** BREAK_START_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _breakStartFlg;

    /** BREAK_START_DT: {varchar(8)} */
    @JsonKey
    protected String _breakStartDt;

    /** BREAK_START_TM: {varchar(6)} */
    @JsonKey
    protected String _breakStartTm;

    /** BREAK_END_DT: {varchar(8)} */
    @JsonKey
    protected String _breakEndDt;

    /** BREAK_END_TM: {varchar(6)} */
    @JsonKey
    protected String _breakEndTm;

    /** FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _forcedClockOutFlg;

    /** WORK_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    @JsonKey
    protected String _errorMsg;

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
    public BsWWorkDto() {
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
        if (other == null || !(other instanceof BsWWorkDto)) { return false; }
        final BsWWorkDto otherEntity = (BsWWorkDto)other;
        if (!helpComparingValue(getWorkId(), otherEntity.getWorkId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WORK");
        result = xCH(result, getWorkId());
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
        sb.append(c).append(getWorkId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getWorkUserCd());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getClockInFlg());
        sb.append(c).append(getClockOutFlg());
        sb.append(c).append(getEntryStartDt());
        sb.append(c).append(getEntryStartTm());
        sb.append(c).append(getEntryEndDt());
        sb.append(c).append(getEntryEndTm());
        sb.append(c).append(getBreakStartFlg());
        sb.append(c).append(getBreakStartDt());
        sb.append(c).append(getBreakStartTm());
        sb.append(c).append(getBreakEndDt());
        sb.append(c).append(getBreakEndTm());
        sb.append(c).append(getForcedClockOutFlg());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMsg());
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
     * [get] WORK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 勤務実績ワークID
     * @return The value of the column 'WORK_ID'. (NullAllowed)
     */
    public Long getWorkId() {
        return _workId;
    }

    /**
     * [set] WORK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 勤務実績ワークID
     * @param workId The value of the column 'WORK_ID'. (NullAllowed)
     */
    public void setWorkId(Long workId) {
        __modifiedProperties.add("workId");
        this._workId = workId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] WORK_USER_CD: {varchar(30)} <br>
     * 作業者CD
     * @return The value of the column 'WORK_USER_CD'. (NullAllowed)
     */
    public String getWorkUserCd() {
        return _workUserCd;
    }

    /**
     * [set] WORK_USER_CD: {varchar(30)} <br>
     * 作業者CD
     * @param workUserCd The value of the column 'WORK_USER_CD'. (NullAllowed)
     */
    public void setWorkUserCd(String workUserCd) {
        __modifiedProperties.add("workUserCd");
        this._workUserCd = workUserCd;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] CLOCK_IN_FLG: {char(1), default=[0]} <br>
     * 出勤フラグ
     * @return The value of the column 'CLOCK_IN_FLG'. (NullAllowed)
     */
    public String getClockInFlg() {
        return _clockInFlg;
    }

    /**
     * [set] CLOCK_IN_FLG: {char(1), default=[0]} <br>
     * 出勤フラグ
     * @param clockInFlg The value of the column 'CLOCK_IN_FLG'. (NullAllowed)
     */
    public void setClockInFlg(String clockInFlg) {
        __modifiedProperties.add("clockInFlg");
        this._clockInFlg = clockInFlg;
    }

    /**
     * [get] CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 退勤フラグ
     * @return The value of the column 'CLOCK_OUT_FLG'. (NullAllowed)
     */
    public String getClockOutFlg() {
        return _clockOutFlg;
    }

    /**
     * [set] CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 退勤フラグ
     * @param clockOutFlg The value of the column 'CLOCK_OUT_FLG'. (NullAllowed)
     */
    public void setClockOutFlg(String clockOutFlg) {
        __modifiedProperties.add("clockOutFlg");
        this._clockOutFlg = clockOutFlg;
    }

    /**
     * [get] ENTRY_START_DT: {varchar(8)} <br>
     * 打刻開始日
     * @return The value of the column 'ENTRY_START_DT'. (NullAllowed)
     */
    public String getEntryStartDt() {
        return _entryStartDt;
    }

    /**
     * [set] ENTRY_START_DT: {varchar(8)} <br>
     * 打刻開始日
     * @param entryStartDt The value of the column 'ENTRY_START_DT'. (NullAllowed)
     */
    public void setEntryStartDt(String entryStartDt) {
        __modifiedProperties.add("entryStartDt");
        this._entryStartDt = entryStartDt;
    }

    /**
     * [get] ENTRY_START_TM: {varchar(6)} <br>
     * 打刻開始時刻
     * @return The value of the column 'ENTRY_START_TM'. (NullAllowed)
     */
    public String getEntryStartTm() {
        return _entryStartTm;
    }

    /**
     * [set] ENTRY_START_TM: {varchar(6)} <br>
     * 打刻開始時刻
     * @param entryStartTm The value of the column 'ENTRY_START_TM'. (NullAllowed)
     */
    public void setEntryStartTm(String entryStartTm) {
        __modifiedProperties.add("entryStartTm");
        this._entryStartTm = entryStartTm;
    }

    /**
     * [get] ENTRY_END_DT: {varchar(8)} <br>
     * 打刻終了日
     * @return The value of the column 'ENTRY_END_DT'. (NullAllowed)
     */
    public String getEntryEndDt() {
        return _entryEndDt;
    }

    /**
     * [set] ENTRY_END_DT: {varchar(8)} <br>
     * 打刻終了日
     * @param entryEndDt The value of the column 'ENTRY_END_DT'. (NullAllowed)
     */
    public void setEntryEndDt(String entryEndDt) {
        __modifiedProperties.add("entryEndDt");
        this._entryEndDt = entryEndDt;
    }

    /**
     * [get] ENTRY_END_TM: {varchar(6)} <br>
     * 打刻終了時刻
     * @return The value of the column 'ENTRY_END_TM'. (NullAllowed)
     */
    public String getEntryEndTm() {
        return _entryEndTm;
    }

    /**
     * [set] ENTRY_END_TM: {varchar(6)} <br>
     * 打刻終了時刻
     * @param entryEndTm The value of the column 'ENTRY_END_TM'. (NullAllowed)
     */
    public void setEntryEndTm(String entryEndTm) {
        __modifiedProperties.add("entryEndTm");
        this._entryEndTm = entryEndTm;
    }

    /**
     * [get] BREAK_START_FLG: {char(1), default=[0]} <br>
     * 休憩開始フラグ
     * @return The value of the column 'BREAK_START_FLG'. (NullAllowed)
     */
    public String getBreakStartFlg() {
        return _breakStartFlg;
    }

    /**
     * [set] BREAK_START_FLG: {char(1), default=[0]} <br>
     * 休憩開始フラグ
     * @param breakStartFlg The value of the column 'BREAK_START_FLG'. (NullAllowed)
     */
    public void setBreakStartFlg(String breakStartFlg) {
        __modifiedProperties.add("breakStartFlg");
        this._breakStartFlg = breakStartFlg;
    }

    /**
     * [get] BREAK_START_DT: {varchar(8)} <br>
     * 休憩開始日
     * @return The value of the column 'BREAK_START_DT'. (NullAllowed)
     */
    public String getBreakStartDt() {
        return _breakStartDt;
    }

    /**
     * [set] BREAK_START_DT: {varchar(8)} <br>
     * 休憩開始日
     * @param breakStartDt The value of the column 'BREAK_START_DT'. (NullAllowed)
     */
    public void setBreakStartDt(String breakStartDt) {
        __modifiedProperties.add("breakStartDt");
        this._breakStartDt = breakStartDt;
    }

    /**
     * [get] BREAK_START_TM: {varchar(6)} <br>
     * 休憩開始時刻
     * @return The value of the column 'BREAK_START_TM'. (NullAllowed)
     */
    public String getBreakStartTm() {
        return _breakStartTm;
    }

    /**
     * [set] BREAK_START_TM: {varchar(6)} <br>
     * 休憩開始時刻
     * @param breakStartTm The value of the column 'BREAK_START_TM'. (NullAllowed)
     */
    public void setBreakStartTm(String breakStartTm) {
        __modifiedProperties.add("breakStartTm");
        this._breakStartTm = breakStartTm;
    }

    /**
     * [get] BREAK_END_DT: {varchar(8)} <br>
     * 休憩終了日
     * @return The value of the column 'BREAK_END_DT'. (NullAllowed)
     */
    public String getBreakEndDt() {
        return _breakEndDt;
    }

    /**
     * [set] BREAK_END_DT: {varchar(8)} <br>
     * 休憩終了日
     * @param breakEndDt The value of the column 'BREAK_END_DT'. (NullAllowed)
     */
    public void setBreakEndDt(String breakEndDt) {
        __modifiedProperties.add("breakEndDt");
        this._breakEndDt = breakEndDt;
    }

    /**
     * [get] BREAK_END_TM: {varchar(6)} <br>
     * 休憩終了時刻
     * @return The value of the column 'BREAK_END_TM'. (NullAllowed)
     */
    public String getBreakEndTm() {
        return _breakEndTm;
    }

    /**
     * [set] BREAK_END_TM: {varchar(6)} <br>
     * 休憩終了時刻
     * @param breakEndTm The value of the column 'BREAK_END_TM'. (NullAllowed)
     */
    public void setBreakEndTm(String breakEndTm) {
        __modifiedProperties.add("breakEndTm");
        this._breakEndTm = breakEndTm;
    }

    /**
     * [get] FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 強制退勤フラグ
     * @return The value of the column 'FORCED_CLOCK_OUT_FLG'. (NullAllowed)
     */
    public String getForcedClockOutFlg() {
        return _forcedClockOutFlg;
    }

    /**
     * [set] FORCED_CLOCK_OUT_FLG: {char(1), default=[0]} <br>
     * 強制退勤フラグ
     * @param forcedClockOutFlg The value of the column 'FORCED_CLOCK_OUT_FLG'. (NullAllowed)
     */
    public void setForcedClockOutFlg(String forcedClockOutFlg) {
        __modifiedProperties.add("forcedClockOutFlg");
        this._forcedClockOutFlg = forcedClockOutFlg;
    }

    /**
     * [get] WORK_FLG: {char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public String getErrorMsg() {
        return _errorMsg;
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public void setErrorMsg(String errorMsg) {
        __modifiedProperties.add("errorMsg");
        this._errorMsg = errorMsg;
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
