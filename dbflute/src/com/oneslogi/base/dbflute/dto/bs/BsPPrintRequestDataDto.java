package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_REQUEST_DATA as TABLE. <br>
 * 印刷データ情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_LAYOUT_DATA, SUBREP_LAYOUT_DATA, REPORT_LAYOUT_BINARY, SUBREP_LAYOUT_BINARY, DATA_FOR_REPORT, CULTURE_CD, TIME_ZONE_CD, DATE_TIME_FORMAT, DATE_FORMAT, TIME_FORMAT, NUMBER_FORMAT, CURRENCY_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINT_REQUEST
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrintRequest
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrintRequestDataDto implements Serializable {

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
    /** PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} */
    @JsonKey
    protected Long _printRequestId;

    /** REPORT_LAYOUT_DATA: {varchar(2147483647)} */
    @JsonKey
    protected String _reportLayoutData;

    /** SUBREP_LAYOUT_DATA: {varchar(2147483647)} */
    @JsonKey
    protected String _subrepLayoutData;

    /** REPORT_LAYOUT_BINARY: {varbinary(2147483647)} */
    @JsonKey
    protected byte[] _reportLayoutBinary;

    /** SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} */
    @JsonKey
    protected byte[] _subrepLayoutBinary;

    /** DATA_FOR_REPORT: {varchar(2147483647)} */
    @JsonKey
    protected String _dataForReport;

    /** CULTURE_CD: {varchar(30)} */
    @JsonKey
    protected String _cultureCd;

    /** TIME_ZONE_CD: {varchar(30)} */
    @JsonKey
    protected String _timeZoneCd;

    /** DATE_TIME_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _dateTimeFormat;

    /** DATE_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _dateFormat;

    /** TIME_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _timeFormat;

    /** NUMBER_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _numberFormat;

    /** CURRENCY_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _currencyFormat;

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
    public BsPPrintRequestDataDto() {
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
    protected PPrintRequestDto _pPrintRequest;

    public PPrintRequestDto getPPrintRequest() {
        return _pPrintRequest;
    }

    public void setPPrintRequest(PPrintRequestDto pPrintRequest) {
        this._pPrintRequest = pPrintRequest;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrintRequestDataDto)) { return false; }
        final BsPPrintRequestDataDto otherEntity = (BsPPrintRequestDataDto)other;
        if (!helpComparingValue(getPrintRequestId(), otherEntity.getPrintRequestId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_REQUEST_DATA");
        result = xCH(result, getPrintRequestId());
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
        sb.append(c).append(getPrintRequestId());
        sb.append(c).append(getReportLayoutData());
        sb.append(c).append(getSubrepLayoutData());
        sb.append(c).append(xfBA(getReportLayoutBinary()));
        sb.append(c).append(xfBA(getSubrepLayoutBinary()));
        sb.append(c).append(getDataForReport());
        sb.append(c).append(getCultureCd());
        sb.append(c).append(getTimeZoneCd());
        sb.append(c).append(getDateTimeFormat());
        sb.append(c).append(getDateFormat());
        sb.append(c).append(getTimeFormat());
        sb.append(c).append(getNumberFormat());
        sb.append(c).append(getCurrencyFormat());
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
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public Long getPrintRequestId() {
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public void setPrintRequestId(Long printRequestId) {
        __modifiedProperties.add("printRequestId");
        this._printRequestId = printRequestId;
    }

    /**
     * [get] REPORT_LAYOUT_DATA: {varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @return The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed)
     */
    public String getReportLayoutData() {
        return _reportLayoutData;
    }

    /**
     * [set] REPORT_LAYOUT_DATA: {varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @param reportLayoutData The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed)
     */
    public void setReportLayoutData(String reportLayoutData) {
        __modifiedProperties.add("reportLayoutData");
        this._reportLayoutData = reportLayoutData;
    }

    /**
     * [get] SUBREP_LAYOUT_DATA: {varchar(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @return The value of the column 'SUBREP_LAYOUT_DATA'. (NullAllowed)
     */
    public String getSubrepLayoutData() {
        return _subrepLayoutData;
    }

    /**
     * [set] SUBREP_LAYOUT_DATA: {varchar(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @param subrepLayoutData The value of the column 'SUBREP_LAYOUT_DATA'. (NullAllowed)
     */
    public void setSubrepLayoutData(String subrepLayoutData) {
        __modifiedProperties.add("subrepLayoutData");
        this._subrepLayoutData = subrepLayoutData;
    }

    /**
     * [get] REPORT_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * 帳票レイアウトバイナリ
     * @return The value of the column 'REPORT_LAYOUT_BINARY'. (NullAllowed)
     */
    public byte[] getReportLayoutBinary() {
        return _reportLayoutBinary;
    }

    /**
     * [set] REPORT_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * 帳票レイアウトバイナリ
     * @param reportLayoutBinary The value of the column 'REPORT_LAYOUT_BINARY'. (NullAllowed)
     */
    public void setReportLayoutBinary(byte[] reportLayoutBinary) {
        __modifiedProperties.add("reportLayoutBinary");
        this._reportLayoutBinary = reportLayoutBinary;
    }

    /**
     * [get] SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * サブレポートレイアウトバイナリ
     * @return The value of the column 'SUBREP_LAYOUT_BINARY'. (NullAllowed)
     */
    public byte[] getSubrepLayoutBinary() {
        return _subrepLayoutBinary;
    }

    /**
     * [set] SUBREP_LAYOUT_BINARY: {varbinary(2147483647)} <br>
     * サブレポートレイアウトバイナリ
     * @param subrepLayoutBinary The value of the column 'SUBREP_LAYOUT_BINARY'. (NullAllowed)
     */
    public void setSubrepLayoutBinary(byte[] subrepLayoutBinary) {
        __modifiedProperties.add("subrepLayoutBinary");
        this._subrepLayoutBinary = subrepLayoutBinary;
    }

    /**
     * [get] DATA_FOR_REPORT: {varchar(2147483647)} <br>
     * 業務データ
     * @return The value of the column 'DATA_FOR_REPORT'. (NullAllowed)
     */
    public String getDataForReport() {
        return _dataForReport;
    }

    /**
     * [set] DATA_FOR_REPORT: {varchar(2147483647)} <br>
     * 業務データ
     * @param dataForReport The value of the column 'DATA_FOR_REPORT'. (NullAllowed)
     */
    public void setDataForReport(String dataForReport) {
        __modifiedProperties.add("dataForReport");
        this._dataForReport = dataForReport;
    }

    /**
     * [get] CULTURE_CD: {varchar(30)} <br>
     * カルチャCD
     * @return The value of the column 'CULTURE_CD'. (NullAllowed)
     */
    public String getCultureCd() {
        return _cultureCd;
    }

    /**
     * [set] CULTURE_CD: {varchar(30)} <br>
     * カルチャCD
     * @param cultureCd The value of the column 'CULTURE_CD'. (NullAllowed)
     */
    public void setCultureCd(String cultureCd) {
        __modifiedProperties.add("cultureCd");
        this._cultureCd = cultureCd;
    }

    /**
     * [get] TIME_ZONE_CD: {varchar(30)} <br>
     * タイムゾーンCD
     * @return The value of the column 'TIME_ZONE_CD'. (NullAllowed)
     */
    public String getTimeZoneCd() {
        return _timeZoneCd;
    }

    /**
     * [set] TIME_ZONE_CD: {varchar(30)} <br>
     * タイムゾーンCD
     * @param timeZoneCd The value of the column 'TIME_ZONE_CD'. (NullAllowed)
     */
    public void setTimeZoneCd(String timeZoneCd) {
        __modifiedProperties.add("timeZoneCd");
        this._timeZoneCd = timeZoneCd;
    }

    /**
     * [get] DATE_TIME_FORMAT: {varchar(30)} <br>
     * 日時書式
     * @return The value of the column 'DATE_TIME_FORMAT'. (NullAllowed)
     */
    public String getDateTimeFormat() {
        return _dateTimeFormat;
    }

    /**
     * [set] DATE_TIME_FORMAT: {varchar(30)} <br>
     * 日時書式
     * @param dateTimeFormat The value of the column 'DATE_TIME_FORMAT'. (NullAllowed)
     */
    public void setDateTimeFormat(String dateTimeFormat) {
        __modifiedProperties.add("dateTimeFormat");
        this._dateTimeFormat = dateTimeFormat;
    }

    /**
     * [get] DATE_FORMAT: {varchar(30)} <br>
     * 日付書式
     * @return The value of the column 'DATE_FORMAT'. (NullAllowed)
     */
    public String getDateFormat() {
        return _dateFormat;
    }

    /**
     * [set] DATE_FORMAT: {varchar(30)} <br>
     * 日付書式
     * @param dateFormat The value of the column 'DATE_FORMAT'. (NullAllowed)
     */
    public void setDateFormat(String dateFormat) {
        __modifiedProperties.add("dateFormat");
        this._dateFormat = dateFormat;
    }

    /**
     * [get] TIME_FORMAT: {varchar(30)} <br>
     * 時間書式
     * @return The value of the column 'TIME_FORMAT'. (NullAllowed)
     */
    public String getTimeFormat() {
        return _timeFormat;
    }

    /**
     * [set] TIME_FORMAT: {varchar(30)} <br>
     * 時間書式
     * @param timeFormat The value of the column 'TIME_FORMAT'. (NullAllowed)
     */
    public void setTimeFormat(String timeFormat) {
        __modifiedProperties.add("timeFormat");
        this._timeFormat = timeFormat;
    }

    /**
     * [get] NUMBER_FORMAT: {varchar(30)} <br>
     * 数値書式
     * @return The value of the column 'NUMBER_FORMAT'. (NullAllowed)
     */
    public String getNumberFormat() {
        return _numberFormat;
    }

    /**
     * [set] NUMBER_FORMAT: {varchar(30)} <br>
     * 数値書式
     * @param numberFormat The value of the column 'NUMBER_FORMAT'. (NullAllowed)
     */
    public void setNumberFormat(String numberFormat) {
        __modifiedProperties.add("numberFormat");
        this._numberFormat = numberFormat;
    }

    /**
     * [get] CURRENCY_FORMAT: {varchar(30)} <br>
     * 通貨書式
     * @return The value of the column 'CURRENCY_FORMAT'. (NullAllowed)
     */
    public String getCurrencyFormat() {
        return _currencyFormat;
    }

    /**
     * [set] CURRENCY_FORMAT: {varchar(30)} <br>
     * 通貨書式
     * @param currencyFormat The value of the column 'CURRENCY_FORMAT'. (NullAllowed)
     */
    public void setCurrencyFormat(String currencyFormat) {
        __modifiedProperties.add("currencyFormat");
        this._currencyFormat = currencyFormat;
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
