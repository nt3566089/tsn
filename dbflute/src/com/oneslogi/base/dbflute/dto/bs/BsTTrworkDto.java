package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRWORK as TABLE. <br>
 * 作業実績(基盤)
 * <pre>
 * [primary-key]
 *     SEQUENCENO
 *
 * [column]
 *     SEQUENCENO, CLIENT_CD, CENTER_CD, USERCD, TASK_TYPE, TASK_TYPE_DETAIL, WORK_DT, WORKTIME, START_END, WORK_PALLET_QTY, WORK_CASE_QTY, WORK_CARTON_QTY, WORK_QTY, ERRCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SEQUENCENO
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
public abstract class BsTTrworkDto implements Serializable {

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
    /** SEQUENCENO: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sequenceno;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** USERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usercd;

    /** TASK_TYPE: {varchar(30)} */
    @JsonKey
    protected String _taskType;

    /** TASK_TYPE_DETAIL: {varchar(30)} */
    @JsonKey
    protected String _taskTypeDetail;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** WORKTIME: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _worktime;

    /** START_END: {varchar(30)} */
    @JsonKey
    protected String _startEnd;

    /** WORK_PALLET_QTY: {bigint(19)} */
    @JsonKey
    protected Long _workPalletQty;

    /** WORK_CASE_QTY: {bigint(19)} */
    @JsonKey
    protected Long _workCaseQty;

    /** WORK_CARTON_QTY: {bigint(19)} */
    @JsonKey
    protected Long _workCartonQty;

    /** WORK_QTY: {bigint(19)} */
    @JsonKey
    protected Long _workQty;

    /** ERRCD: {varchar(30)} */
    @JsonKey
    protected String _errcd;

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
    public BsTTrworkDto() {
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
        if (other == null || !(other instanceof BsTTrworkDto)) { return false; }
        final BsTTrworkDto otherEntity = (BsTTrworkDto)other;
        if (!helpComparingValue(getSequenceno(), otherEntity.getSequenceno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRWORK");
        result = xCH(result, getSequenceno());
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
        sb.append(c).append(getSequenceno());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getUsercd());
        sb.append(c).append(getTaskType());
        sb.append(c).append(getTaskTypeDetail());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getWorktime());
        sb.append(c).append(getStartEnd());
        sb.append(c).append(getWorkPalletQty());
        sb.append(c).append(getWorkCaseQty());
        sb.append(c).append(getWorkCartonQty());
        sb.append(c).append(getWorkQty());
        sb.append(c).append(getErrcd());
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
     * [get] SEQUENCENO: {PK, ID, NotNull, bigint identity(19)} <br>
     * 作業実績ID
     * @return The value of the column 'SEQUENCENO'. (NullAllowed)
     */
    public Long getSequenceno() {
        return _sequenceno;
    }

    /**
     * [set] SEQUENCENO: {PK, ID, NotNull, bigint identity(19)} <br>
     * 作業実績ID
     * @param sequenceno The value of the column 'SEQUENCENO'. (NullAllowed)
     */
    public void setSequenceno(Long sequenceno) {
        __modifiedProperties.add("sequenceno");
        this._sequenceno = sequenceno;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
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
     * [get] USERCD: {NotNull, varchar(30)} <br>
     * ユーザCD
     * @return The value of the column 'USERCD'. (NullAllowed)
     */
    public String getUsercd() {
        return _usercd;
    }

    /**
     * [set] USERCD: {NotNull, varchar(30)} <br>
     * ユーザCD
     * @param usercd The value of the column 'USERCD'. (NullAllowed)
     */
    public void setUsercd(String usercd) {
        __modifiedProperties.add("usercd");
        this._usercd = usercd;
    }

    /**
     * [get] TASK_TYPE: {varchar(30)} <br>
     * 業務区分
     * @return The value of the column 'TASK_TYPE'. (NullAllowed)
     */
    public String getTaskType() {
        return _taskType;
    }

    /**
     * [set] TASK_TYPE: {varchar(30)} <br>
     * 業務区分
     * @param taskType The value of the column 'TASK_TYPE'. (NullAllowed)
     */
    public void setTaskType(String taskType) {
        __modifiedProperties.add("taskType");
        this._taskType = taskType;
    }

    /**
     * [get] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * 業務区分詳細
     * @return The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed)
     */
    public String getTaskTypeDetail() {
        return _taskTypeDetail;
    }

    /**
     * [set] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * 業務区分詳細
     * @param taskTypeDetail The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed)
     */
    public void setTaskTypeDetail(String taskTypeDetail) {
        __modifiedProperties.add("taskTypeDetail");
        this._taskTypeDetail = taskTypeDetail;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * 作業年月日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * 作業年月日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] WORKTIME: {NotNull, datetime2(26, 6)} <br>
     * 作業時刻
     * @return The value of the column 'WORKTIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorktime() {
        return _worktime;
    }

    /**
     * [set] WORKTIME: {NotNull, datetime2(26, 6)} <br>
     * 作業時刻
     * @param worktime The value of the column 'WORKTIME'. (NullAllowed)
     */
    public void setWorktime(java.sql.Timestamp worktime) {
        __modifiedProperties.add("worktime");
        this._worktime = worktime;
    }

    /**
     * [get] START_END: {varchar(30)} <br>
     * 開始終了区分
     * @return The value of the column 'START_END'. (NullAllowed)
     */
    public String getStartEnd() {
        return _startEnd;
    }

    /**
     * [set] START_END: {varchar(30)} <br>
     * 開始終了区分
     * @param startEnd The value of the column 'START_END'. (NullAllowed)
     */
    public void setStartEnd(String startEnd) {
        __modifiedProperties.add("startEnd");
        this._startEnd = startEnd;
    }

    /**
     * [get] WORK_PALLET_QTY: {bigint(19)} <br>
     * 作業パレット数量
     * @return The value of the column 'WORK_PALLET_QTY'. (NullAllowed)
     */
    public Long getWorkPalletQty() {
        return _workPalletQty;
    }

    /**
     * [set] WORK_PALLET_QTY: {bigint(19)} <br>
     * 作業パレット数量
     * @param workPalletQty The value of the column 'WORK_PALLET_QTY'. (NullAllowed)
     */
    public void setWorkPalletQty(Long workPalletQty) {
        __modifiedProperties.add("workPalletQty");
        this._workPalletQty = workPalletQty;
    }

    /**
     * [get] WORK_CASE_QTY: {bigint(19)} <br>
     * 作業ケース数量
     * @return The value of the column 'WORK_CASE_QTY'. (NullAllowed)
     */
    public Long getWorkCaseQty() {
        return _workCaseQty;
    }

    /**
     * [set] WORK_CASE_QTY: {bigint(19)} <br>
     * 作業ケース数量
     * @param workCaseQty The value of the column 'WORK_CASE_QTY'. (NullAllowed)
     */
    public void setWorkCaseQty(Long workCaseQty) {
        __modifiedProperties.add("workCaseQty");
        this._workCaseQty = workCaseQty;
    }

    /**
     * [get] WORK_CARTON_QTY: {bigint(19)} <br>
     * 作業カートン数量
     * @return The value of the column 'WORK_CARTON_QTY'. (NullAllowed)
     */
    public Long getWorkCartonQty() {
        return _workCartonQty;
    }

    /**
     * [set] WORK_CARTON_QTY: {bigint(19)} <br>
     * 作業カートン数量
     * @param workCartonQty The value of the column 'WORK_CARTON_QTY'. (NullAllowed)
     */
    public void setWorkCartonQty(Long workCartonQty) {
        __modifiedProperties.add("workCartonQty");
        this._workCartonQty = workCartonQty;
    }

    /**
     * [get] WORK_QTY: {bigint(19)} <br>
     * 作業個装数量
     * @return The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public Long getWorkQty() {
        return _workQty;
    }

    /**
     * [set] WORK_QTY: {bigint(19)} <br>
     * 作業個装数量
     * @param workQty The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public void setWorkQty(Long workQty) {
        __modifiedProperties.add("workQty");
        this._workQty = workQty;
    }

    /**
     * [get] ERRCD: {varchar(30)} <br>
     * エラーCD
     * @return The value of the column 'ERRCD'. (NullAllowed)
     */
    public String getErrcd() {
        return _errcd;
    }

    /**
     * [set] ERRCD: {varchar(30)} <br>
     * エラーCD
     * @param errcd The value of the column 'ERRCD'. (NullAllowed)
     */
    public void setErrcd(String errcd) {
        __modifiedProperties.add("errcd");
        this._errcd = errcd;
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
