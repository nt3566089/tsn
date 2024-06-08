package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_LOG as TABLE. <br>
 * ログ
 * <pre>
 * [primary-key]
 *     LOG_ID
 *
 * [column]
 *     LOG_ID, LOG_STATUS, LOG_GROUP_CD, LOG_GROUP_NM, LOG_GROUP_PROCESS_ID, PGM_CD, PGM_NM, PROCESS_START_DT, PROCESS_END_DT, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByLogStatus)
 *
 * [referrer-table]
 *     B_LOG_DTL
 *
 * [foreign-property]
 *     bClassDtlByLogStatus
 *
 * [referrer-property]
 *     bLogDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBLogDto implements Serializable {

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
    /** LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _logId;

    /** LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} */
    @JsonKey
    protected String _logStatus;

    /** LOG_GROUP_CD: {varchar(100)} */
    @JsonKey
    protected String _logGroupCd;

    /** LOG_GROUP_NM: {varchar(60)} */
    @JsonKey
    protected String _logGroupNm;

    /** LOG_GROUP_PROCESS_ID: {bigint(19)} */
    @JsonKey
    protected Long _logGroupProcessId;

    /** PGM_CD: {varchar(100)} */
    @JsonKey
    protected String _pgmCd;

    /** PGM_NM: {varchar(60)} */
    @JsonKey
    protected String _pgmNm;

    /** PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processStartDt;

    /** PROCESS_END_DT: {IX, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _processEndDt;

    /** ATTRIBUTE1: {varchar(100)} */
    @JsonKey
    protected String _attribute1;

    /** ATTRIBUTE2: {varchar(100)} */
    @JsonKey
    protected String _attribute2;

    /** ATTRIBUTE3: {varchar(100)} */
    @JsonKey
    protected String _attribute3;

    /** ATTRIBUTE4: {varchar(100)} */
    @JsonKey
    protected String _attribute4;

    /** ATTRIBUTE5: {varchar(100)} */
    @JsonKey
    protected String _attribute5;

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
    public BsBLogDto() {
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
    protected BClassDtlDto _bClassDtlByLogStatus;

    public BClassDtlDto getBClassDtlByLogStatus() {
        return _bClassDtlByLogStatus;
    }

    public void setBClassDtlByLogStatus(BClassDtlDto bClassDtlByLogStatus) {
        this._bClassDtlByLogStatus = bClassDtlByLogStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BLogDtlDto> _bLogDtlList;

    public List<BLogDtlDto> getBLogDtlList() {
        if (_bLogDtlList == null) { _bLogDtlList = new ArrayList<BLogDtlDto>(); }
        return _bLogDtlList;
    }

    public void setBLogDtlList(List<BLogDtlDto> bLogDtlList) {
        this._bLogDtlList = bLogDtlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBLogDto)) { return false; }
        final BsBLogDto otherEntity = (BsBLogDto)other;
        if (!helpComparingValue(getLogId(), otherEntity.getLogId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_LOG");
        result = xCH(result, getLogId());
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
        sb.append(c).append(getLogId());
        sb.append(c).append(getLogStatus());
        sb.append(c).append(getLogGroupCd());
        sb.append(c).append(getLogGroupNm());
        sb.append(c).append(getLogGroupProcessId());
        sb.append(c).append(getPgmCd());
        sb.append(c).append(getPgmNm());
        sb.append(c).append(getProcessStartDt());
        sb.append(c).append(getProcessEndDt());
        sb.append(c).append(getAttribute1());
        sb.append(c).append(getAttribute2());
        sb.append(c).append(getAttribute3());
        sb.append(c).append(getAttribute4());
        sb.append(c).append(getAttribute5());
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
     * [get] LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログID
     * @return The value of the column 'LOG_ID'. (NullAllowed)
     */
    public Long getLogId() {
        return _logId;
    }

    /**
     * [set] LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ログID
     * @param logId The value of the column 'LOG_ID'. (NullAllowed)
     */
    public void setLogId(Long logId) {
        __modifiedProperties.add("logId");
        this._logId = logId;
    }

    /**
     * [get] LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @return The value of the column 'LOG_STATUS'. (NullAllowed)
     */
    public String getLogStatus() {
        return _logStatus;
    }

    /**
     * [set] LOG_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=LogStatus} <br>
     * ログステータス
     * @param logStatus The value of the column 'LOG_STATUS'. (NullAllowed)
     */
    public void setLogStatus(String logStatus) {
        __modifiedProperties.add("logStatus");
        this._logStatus = logStatus;
    }

    /**
     * [get] LOG_GROUP_CD: {varchar(100)} <br>
     * ロググループCD
     * @return The value of the column 'LOG_GROUP_CD'. (NullAllowed)
     */
    public String getLogGroupCd() {
        return _logGroupCd;
    }

    /**
     * [set] LOG_GROUP_CD: {varchar(100)} <br>
     * ロググループCD
     * @param logGroupCd The value of the column 'LOG_GROUP_CD'. (NullAllowed)
     */
    public void setLogGroupCd(String logGroupCd) {
        __modifiedProperties.add("logGroupCd");
        this._logGroupCd = logGroupCd;
    }

    /**
     * [get] LOG_GROUP_NM: {varchar(60)} <br>
     * ロググループ名称
     * @return The value of the column 'LOG_GROUP_NM'. (NullAllowed)
     */
    public String getLogGroupNm() {
        return _logGroupNm;
    }

    /**
     * [set] LOG_GROUP_NM: {varchar(60)} <br>
     * ロググループ名称
     * @param logGroupNm The value of the column 'LOG_GROUP_NM'. (NullAllowed)
     */
    public void setLogGroupNm(String logGroupNm) {
        __modifiedProperties.add("logGroupNm");
        this._logGroupNm = logGroupNm;
    }

    /**
     * [get] LOG_GROUP_PROCESS_ID: {bigint(19)} <br>
     * ロググループ処理ID
     * @return The value of the column 'LOG_GROUP_PROCESS_ID'. (NullAllowed)
     */
    public Long getLogGroupProcessId() {
        return _logGroupProcessId;
    }

    /**
     * [set] LOG_GROUP_PROCESS_ID: {bigint(19)} <br>
     * ロググループ処理ID
     * @param logGroupProcessId The value of the column 'LOG_GROUP_PROCESS_ID'. (NullAllowed)
     */
    public void setLogGroupProcessId(Long logGroupProcessId) {
        __modifiedProperties.add("logGroupProcessId");
        this._logGroupProcessId = logGroupProcessId;
    }

    /**
     * [get] PGM_CD: {varchar(100)} <br>
     * プログラムCD
     * @return The value of the column 'PGM_CD'. (NullAllowed)
     */
    public String getPgmCd() {
        return _pgmCd;
    }

    /**
     * [set] PGM_CD: {varchar(100)} <br>
     * プログラムCD
     * @param pgmCd The value of the column 'PGM_CD'. (NullAllowed)
     */
    public void setPgmCd(String pgmCd) {
        __modifiedProperties.add("pgmCd");
        this._pgmCd = pgmCd;
    }

    /**
     * [get] PGM_NM: {varchar(60)} <br>
     * プログラム名称
     * @return The value of the column 'PGM_NM'. (NullAllowed)
     */
    public String getPgmNm() {
        return _pgmNm;
    }

    /**
     * [set] PGM_NM: {varchar(60)} <br>
     * プログラム名称
     * @param pgmNm The value of the column 'PGM_NM'. (NullAllowed)
     */
    public void setPgmNm(String pgmNm) {
        __modifiedProperties.add("pgmNm");
        this._pgmNm = pgmNm;
    }

    /**
     * [get] PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} <br>
     * 処理開始日時
     * @return The value of the column 'PROCESS_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcessStartDt() {
        return _processStartDt;
    }

    /**
     * [set] PROCESS_START_DT: {IX, NotNull, datetime2(26, 6)} <br>
     * 処理開始日時
     * @param processStartDt The value of the column 'PROCESS_START_DT'. (NullAllowed)
     */
    public void setProcessStartDt(java.sql.Timestamp processStartDt) {
        __modifiedProperties.add("processStartDt");
        this._processStartDt = processStartDt;
    }

    /**
     * [get] PROCESS_END_DT: {IX, datetime2(26, 6)} <br>
     * 処理終了日時
     * @return The value of the column 'PROCESS_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcessEndDt() {
        return _processEndDt;
    }

    /**
     * [set] PROCESS_END_DT: {IX, datetime2(26, 6)} <br>
     * 処理終了日時
     * @param processEndDt The value of the column 'PROCESS_END_DT'. (NullAllowed)
     */
    public void setProcessEndDt(java.sql.Timestamp processEndDt) {
        __modifiedProperties.add("processEndDt");
        this._processEndDt = processEndDt;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public String getAttribute1() {
        return _attribute1;
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public void setAttribute1(String attribute1) {
        __modifiedProperties.add("attribute1");
        this._attribute1 = attribute1;
    }

    /**
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public String getAttribute2() {
        return _attribute2;
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public void setAttribute2(String attribute2) {
        __modifiedProperties.add("attribute2");
        this._attribute2 = attribute2;
    }

    /**
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public String getAttribute3() {
        return _attribute3;
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public void setAttribute3(String attribute3) {
        __modifiedProperties.add("attribute3");
        this._attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public String getAttribute4() {
        return _attribute4;
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public void setAttribute4(String attribute4) {
        __modifiedProperties.add("attribute4");
        this._attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public String getAttribute5() {
        return _attribute5;
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public void setAttribute5(String attribute5) {
        __modifiedProperties.add("attribute5");
        this._attribute5 = attribute5;
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
