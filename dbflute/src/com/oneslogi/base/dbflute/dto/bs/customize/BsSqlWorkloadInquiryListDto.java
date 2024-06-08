package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlWorkloadInquiryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SEQUENCENO, WORK_DT, USERCD, USER_NM, TASK_TYPE, TASK_TYPE_DETAIL, WORKTIME, START_END, WORK_PALLET_QTY, WORK_CASE_QTY, WORK_CARTON_QTY, WORK_QTY, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlWorkloadInquiryListDto implements Serializable {

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
    /** SEQUENCENO: {bigint(19)} */
    @JsonKey
    protected Long _sequenceno;

    /** WORK_DT: {nvarchar(4000)} */
    @JsonKey
    protected String _workDt;

    /** USERCD: {varchar(30)} */
    @JsonKey
    protected String _usercd;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** TASK_TYPE: {varchar(30)} */
    @JsonKey
    protected String _taskType;

    /** TASK_TYPE_DETAIL: {varchar(30)} */
    @JsonKey
    protected String _taskTypeDetail;

    /** WORKTIME: {nvarchar(4000)} */
    @JsonKey
    protected String _worktime;

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

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlWorkloadInquiryListDto() {
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
        if (other == null || !(other instanceof BsSqlWorkloadInquiryListDto)) { return false; }
        final BsSqlWorkloadInquiryListDto otherEntity = (BsSqlWorkloadInquiryListDto)other;
        if (!helpComparingValue(getSequenceno(), otherEntity.getSequenceno())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getUsercd(), otherEntity.getUsercd())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getTaskType(), otherEntity.getTaskType())) { return false; }
        if (!helpComparingValue(getTaskTypeDetail(), otherEntity.getTaskTypeDetail())) { return false; }
        if (!helpComparingValue(getWorktime(), otherEntity.getWorktime())) { return false; }
        if (!helpComparingValue(getStartEnd(), otherEntity.getStartEnd())) { return false; }
        if (!helpComparingValue(getWorkPalletQty(), otherEntity.getWorkPalletQty())) { return false; }
        if (!helpComparingValue(getWorkCaseQty(), otherEntity.getWorkCaseQty())) { return false; }
        if (!helpComparingValue(getWorkCartonQty(), otherEntity.getWorkCartonQty())) { return false; }
        if (!helpComparingValue(getWorkQty(), otherEntity.getWorkQty())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlWorkloadInquiryList");
        result = xCH(result, getSequenceno());
        result = xCH(result, getWorkDt());
        result = xCH(result, getUsercd());
        result = xCH(result, getUserNm());
        result = xCH(result, getTaskType());
        result = xCH(result, getTaskTypeDetail());
        result = xCH(result, getWorktime());
        result = xCH(result, getStartEnd());
        result = xCH(result, getWorkPalletQty());
        result = xCH(result, getWorkCaseQty());
        result = xCH(result, getWorkCartonQty());
        result = xCH(result, getWorkQty());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
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
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getUsercd());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getTaskType());
        sb.append(c).append(getTaskTypeDetail());
        sb.append(c).append(getWorktime());
        sb.append(c).append(getStartEnd());
        sb.append(c).append(getWorkPalletQty());
        sb.append(c).append(getWorkCaseQty());
        sb.append(c).append(getWorkCartonQty());
        sb.append(c).append(getWorkQty());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SEQUENCENO: {bigint(19)} <br>
     * @return The value of the column 'SEQUENCENO'. (NullAllowed)
     */
    public Long getSequenceno() {
        return _sequenceno;
    }

    /**
     * [set] SEQUENCENO: {bigint(19)} <br>
     * @param sequenceno The value of the column 'SEQUENCENO'. (NullAllowed)
     */
    public void setSequenceno(Long sequenceno) {
        __modifiedProperties.add("sequenceno");
        this._sequenceno = sequenceno;
    }

    /**
     * [get] WORK_DT: {nvarchar(4000)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {nvarchar(4000)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] USERCD: {varchar(30)} <br>
     * @return The value of the column 'USERCD'. (NullAllowed)
     */
    public String getUsercd() {
        return _usercd;
    }

    /**
     * [set] USERCD: {varchar(30)} <br>
     * @param usercd The value of the column 'USERCD'. (NullAllowed)
     */
    public void setUsercd(String usercd) {
        __modifiedProperties.add("usercd");
        this._usercd = usercd;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

    /**
     * [get] TASK_TYPE: {varchar(30)} <br>
     * @return The value of the column 'TASK_TYPE'. (NullAllowed)
     */
    public String getTaskType() {
        return _taskType;
    }

    /**
     * [set] TASK_TYPE: {varchar(30)} <br>
     * @param taskType The value of the column 'TASK_TYPE'. (NullAllowed)
     */
    public void setTaskType(String taskType) {
        __modifiedProperties.add("taskType");
        this._taskType = taskType;
    }

    /**
     * [get] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * @return The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed)
     */
    public String getTaskTypeDetail() {
        return _taskTypeDetail;
    }

    /**
     * [set] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * @param taskTypeDetail The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed)
     */
    public void setTaskTypeDetail(String taskTypeDetail) {
        __modifiedProperties.add("taskTypeDetail");
        this._taskTypeDetail = taskTypeDetail;
    }

    /**
     * [get] WORKTIME: {nvarchar(4000)} <br>
     * @return The value of the column 'WORKTIME'. (NullAllowed)
     */
    public String getWorktime() {
        return _worktime;
    }

    /**
     * [set] WORKTIME: {nvarchar(4000)} <br>
     * @param worktime The value of the column 'WORKTIME'. (NullAllowed)
     */
    public void setWorktime(String worktime) {
        __modifiedProperties.add("worktime");
        this._worktime = worktime;
    }

    /**
     * [get] START_END: {varchar(30)} <br>
     * @return The value of the column 'START_END'. (NullAllowed)
     */
    public String getStartEnd() {
        return _startEnd;
    }

    /**
     * [set] START_END: {varchar(30)} <br>
     * @param startEnd The value of the column 'START_END'. (NullAllowed)
     */
    public void setStartEnd(String startEnd) {
        __modifiedProperties.add("startEnd");
        this._startEnd = startEnd;
    }

    /**
     * [get] WORK_PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_PALLET_QTY'. (NullAllowed)
     */
    public Long getWorkPalletQty() {
        return _workPalletQty;
    }

    /**
     * [set] WORK_PALLET_QTY: {bigint(19)} <br>
     * @param workPalletQty The value of the column 'WORK_PALLET_QTY'. (NullAllowed)
     */
    public void setWorkPalletQty(Long workPalletQty) {
        __modifiedProperties.add("workPalletQty");
        this._workPalletQty = workPalletQty;
    }

    /**
     * [get] WORK_CASE_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_CASE_QTY'. (NullAllowed)
     */
    public Long getWorkCaseQty() {
        return _workCaseQty;
    }

    /**
     * [set] WORK_CASE_QTY: {bigint(19)} <br>
     * @param workCaseQty The value of the column 'WORK_CASE_QTY'. (NullAllowed)
     */
    public void setWorkCaseQty(Long workCaseQty) {
        __modifiedProperties.add("workCaseQty");
        this._workCaseQty = workCaseQty;
    }

    /**
     * [get] WORK_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_CARTON_QTY'. (NullAllowed)
     */
    public Long getWorkCartonQty() {
        return _workCartonQty;
    }

    /**
     * [set] WORK_CARTON_QTY: {bigint(19)} <br>
     * @param workCartonQty The value of the column 'WORK_CARTON_QTY'. (NullAllowed)
     */
    public void setWorkCartonQty(Long workCartonQty) {
        __modifiedProperties.add("workCartonQty");
        this._workCartonQty = workCartonQty;
    }

    /**
     * [get] WORK_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public Long getWorkQty() {
        return _workQty;
    }

    /**
     * [set] WORK_QTY: {bigint(19)} <br>
     * @param workQty The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public void setWorkQty(Long workQty) {
        __modifiedProperties.add("workQty");
        this._workQty = workQty;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

}
