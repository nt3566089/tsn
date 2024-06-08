package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_CULTURE_ATTRIBUTE as TABLE. <br>
 * カルチャ属性マスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, DATE_TIME_FORMAT_DISPLAY, DATE_TIME_FORMAT_REPORT, DATE_TIME_FORMAT_EXCEL, DATE_TIME_FORMAT_TEXT, DATE_FORMAT_DISPLAY, DATE_FORMAT_REPORT, DATE_FORMAT_EXCEL, DATE_FORMAT_TEXT, TIME_FORMAT_DISPLAY, TIME_FORMAT_REPORT, TIME_FORMAT_EXCEL, TIME_FORMAT_TEXT, NUMBER_FORMAT_DISPLAY, NUMBER_FORMAT_REPORT, NUMBER_FORMAT_EXCEL, NUMBER_FORMAT_TEXT, CURRENCY_FORMAT_REPORT, FONT_NAME_EXCEL, FONT_SIZE_EXCEL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
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
public abstract class BsBCultureAttributeDto implements Serializable {

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
    /** CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _cultureId;

    /** DATE_TIME_FORMAT_DISPLAY: {varchar(30)} */
    @JsonKey
    protected String _dateTimeFormatDisplay;

    /** DATE_TIME_FORMAT_REPORT: {varchar(30)} */
    @JsonKey
    protected String _dateTimeFormatReport;

    /** DATE_TIME_FORMAT_EXCEL: {varchar(30)} */
    @JsonKey
    protected String _dateTimeFormatExcel;

    /** DATE_TIME_FORMAT_TEXT: {varchar(30)} */
    @JsonKey
    protected String _dateTimeFormatText;

    /** DATE_FORMAT_DISPLAY: {varchar(30)} */
    @JsonKey
    protected String _dateFormatDisplay;

    /** DATE_FORMAT_REPORT: {varchar(30)} */
    @JsonKey
    protected String _dateFormatReport;

    /** DATE_FORMAT_EXCEL: {varchar(30)} */
    @JsonKey
    protected String _dateFormatExcel;

    /** DATE_FORMAT_TEXT: {varchar(30)} */
    @JsonKey
    protected String _dateFormatText;

    /** TIME_FORMAT_DISPLAY: {varchar(30)} */
    @JsonKey
    protected String _timeFormatDisplay;

    /** TIME_FORMAT_REPORT: {varchar(30)} */
    @JsonKey
    protected String _timeFormatReport;

    /** TIME_FORMAT_EXCEL: {varchar(30)} */
    @JsonKey
    protected String _timeFormatExcel;

    /** TIME_FORMAT_TEXT: {varchar(30)} */
    @JsonKey
    protected String _timeFormatText;

    /** NUMBER_FORMAT_DISPLAY: {varchar(30)} */
    @JsonKey
    protected String _numberFormatDisplay;

    /** NUMBER_FORMAT_REPORT: {varchar(30)} */
    @JsonKey
    protected String _numberFormatReport;

    /** NUMBER_FORMAT_EXCEL: {varchar(30)} */
    @JsonKey
    protected String _numberFormatExcel;

    /** NUMBER_FORMAT_TEXT: {varchar(30)} */
    @JsonKey
    protected String _numberFormatText;

    /** CURRENCY_FORMAT_REPORT: {varchar(30)} */
    @JsonKey
    protected String _currencyFormatReport;

    /** FONT_NAME_EXCEL: {varchar(60)} */
    @JsonKey
    protected String _fontNameExcel;

    /** FONT_SIZE_EXCEL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _fontSizeExcel;

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
    public BsBCultureAttributeDto() {
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
        if (other == null || !(other instanceof BsBCultureAttributeDto)) { return false; }
        final BsBCultureAttributeDto otherEntity = (BsBCultureAttributeDto)other;
        if (!helpComparingValue(getCultureId(), otherEntity.getCultureId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_CULTURE_ATTRIBUTE");
        result = xCH(result, getCultureId());
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
        sb.append(c).append(getCultureId());
        sb.append(c).append(getDateTimeFormatDisplay());
        sb.append(c).append(getDateTimeFormatReport());
        sb.append(c).append(getDateTimeFormatExcel());
        sb.append(c).append(getDateTimeFormatText());
        sb.append(c).append(getDateFormatDisplay());
        sb.append(c).append(getDateFormatReport());
        sb.append(c).append(getDateFormatExcel());
        sb.append(c).append(getDateFormatText());
        sb.append(c).append(getTimeFormatDisplay());
        sb.append(c).append(getTimeFormatReport());
        sb.append(c).append(getTimeFormatExcel());
        sb.append(c).append(getTimeFormatText());
        sb.append(c).append(getNumberFormatDisplay());
        sb.append(c).append(getNumberFormatReport());
        sb.append(c).append(getNumberFormatExcel());
        sb.append(c).append(getNumberFormatText());
        sb.append(c).append(getCurrencyFormatReport());
        sb.append(c).append(getFontNameExcel());
        sb.append(c).append(getFontSizeExcel());
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
     * [get] CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] DATE_TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日時書式（画面）
     * @return The value of the column 'DATE_TIME_FORMAT_DISPLAY'. (NullAllowed)
     */
    public String getDateTimeFormatDisplay() {
        return _dateTimeFormatDisplay;
    }

    /**
     * [set] DATE_TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日時書式（画面）
     * @param dateTimeFormatDisplay The value of the column 'DATE_TIME_FORMAT_DISPLAY'. (NullAllowed)
     */
    public void setDateTimeFormatDisplay(String dateTimeFormatDisplay) {
        __modifiedProperties.add("dateTimeFormatDisplay");
        this._dateTimeFormatDisplay = dateTimeFormatDisplay;
    }

    /**
     * [get] DATE_TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 日時書式（帳票）
     * @return The value of the column 'DATE_TIME_FORMAT_REPORT'. (NullAllowed)
     */
    public String getDateTimeFormatReport() {
        return _dateTimeFormatReport;
    }

    /**
     * [set] DATE_TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 日時書式（帳票）
     * @param dateTimeFormatReport The value of the column 'DATE_TIME_FORMAT_REPORT'. (NullAllowed)
     */
    public void setDateTimeFormatReport(String dateTimeFormatReport) {
        __modifiedProperties.add("dateTimeFormatReport");
        this._dateTimeFormatReport = dateTimeFormatReport;
    }

    /**
     * [get] DATE_TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 日時書式（Excel）
     * @return The value of the column 'DATE_TIME_FORMAT_EXCEL'. (NullAllowed)
     */
    public String getDateTimeFormatExcel() {
        return _dateTimeFormatExcel;
    }

    /**
     * [set] DATE_TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 日時書式（Excel）
     * @param dateTimeFormatExcel The value of the column 'DATE_TIME_FORMAT_EXCEL'. (NullAllowed)
     */
    public void setDateTimeFormatExcel(String dateTimeFormatExcel) {
        __modifiedProperties.add("dateTimeFormatExcel");
        this._dateTimeFormatExcel = dateTimeFormatExcel;
    }

    /**
     * [get] DATE_TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 日時書式（Text）
     * @return The value of the column 'DATE_TIME_FORMAT_TEXT'. (NullAllowed)
     */
    public String getDateTimeFormatText() {
        return _dateTimeFormatText;
    }

    /**
     * [set] DATE_TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 日時書式（Text）
     * @param dateTimeFormatText The value of the column 'DATE_TIME_FORMAT_TEXT'. (NullAllowed)
     */
    public void setDateTimeFormatText(String dateTimeFormatText) {
        __modifiedProperties.add("dateTimeFormatText");
        this._dateTimeFormatText = dateTimeFormatText;
    }

    /**
     * [get] DATE_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日付書式（画面）
     * @return The value of the column 'DATE_FORMAT_DISPLAY'. (NullAllowed)
     */
    public String getDateFormatDisplay() {
        return _dateFormatDisplay;
    }

    /**
     * [set] DATE_FORMAT_DISPLAY: {varchar(30)} <br>
     * 日付書式（画面）
     * @param dateFormatDisplay The value of the column 'DATE_FORMAT_DISPLAY'. (NullAllowed)
     */
    public void setDateFormatDisplay(String dateFormatDisplay) {
        __modifiedProperties.add("dateFormatDisplay");
        this._dateFormatDisplay = dateFormatDisplay;
    }

    /**
     * [get] DATE_FORMAT_REPORT: {varchar(30)} <br>
     * 日付書式（帳票）
     * @return The value of the column 'DATE_FORMAT_REPORT'. (NullAllowed)
     */
    public String getDateFormatReport() {
        return _dateFormatReport;
    }

    /**
     * [set] DATE_FORMAT_REPORT: {varchar(30)} <br>
     * 日付書式（帳票）
     * @param dateFormatReport The value of the column 'DATE_FORMAT_REPORT'. (NullAllowed)
     */
    public void setDateFormatReport(String dateFormatReport) {
        __modifiedProperties.add("dateFormatReport");
        this._dateFormatReport = dateFormatReport;
    }

    /**
     * [get] DATE_FORMAT_EXCEL: {varchar(30)} <br>
     * 日付書式（Excel）
     * @return The value of the column 'DATE_FORMAT_EXCEL'. (NullAllowed)
     */
    public String getDateFormatExcel() {
        return _dateFormatExcel;
    }

    /**
     * [set] DATE_FORMAT_EXCEL: {varchar(30)} <br>
     * 日付書式（Excel）
     * @param dateFormatExcel The value of the column 'DATE_FORMAT_EXCEL'. (NullAllowed)
     */
    public void setDateFormatExcel(String dateFormatExcel) {
        __modifiedProperties.add("dateFormatExcel");
        this._dateFormatExcel = dateFormatExcel;
    }

    /**
     * [get] DATE_FORMAT_TEXT: {varchar(30)} <br>
     * 日付書式（Text）
     * @return The value of the column 'DATE_FORMAT_TEXT'. (NullAllowed)
     */
    public String getDateFormatText() {
        return _dateFormatText;
    }

    /**
     * [set] DATE_FORMAT_TEXT: {varchar(30)} <br>
     * 日付書式（Text）
     * @param dateFormatText The value of the column 'DATE_FORMAT_TEXT'. (NullAllowed)
     */
    public void setDateFormatText(String dateFormatText) {
        __modifiedProperties.add("dateFormatText");
        this._dateFormatText = dateFormatText;
    }

    /**
     * [get] TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 時間書式（画面）
     * @return The value of the column 'TIME_FORMAT_DISPLAY'. (NullAllowed)
     */
    public String getTimeFormatDisplay() {
        return _timeFormatDisplay;
    }

    /**
     * [set] TIME_FORMAT_DISPLAY: {varchar(30)} <br>
     * 時間書式（画面）
     * @param timeFormatDisplay The value of the column 'TIME_FORMAT_DISPLAY'. (NullAllowed)
     */
    public void setTimeFormatDisplay(String timeFormatDisplay) {
        __modifiedProperties.add("timeFormatDisplay");
        this._timeFormatDisplay = timeFormatDisplay;
    }

    /**
     * [get] TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 時間書式（帳票）
     * @return The value of the column 'TIME_FORMAT_REPORT'. (NullAllowed)
     */
    public String getTimeFormatReport() {
        return _timeFormatReport;
    }

    /**
     * [set] TIME_FORMAT_REPORT: {varchar(30)} <br>
     * 時間書式（帳票）
     * @param timeFormatReport The value of the column 'TIME_FORMAT_REPORT'. (NullAllowed)
     */
    public void setTimeFormatReport(String timeFormatReport) {
        __modifiedProperties.add("timeFormatReport");
        this._timeFormatReport = timeFormatReport;
    }

    /**
     * [get] TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 時間書式（Excel）
     * @return The value of the column 'TIME_FORMAT_EXCEL'. (NullAllowed)
     */
    public String getTimeFormatExcel() {
        return _timeFormatExcel;
    }

    /**
     * [set] TIME_FORMAT_EXCEL: {varchar(30)} <br>
     * 時間書式（Excel）
     * @param timeFormatExcel The value of the column 'TIME_FORMAT_EXCEL'. (NullAllowed)
     */
    public void setTimeFormatExcel(String timeFormatExcel) {
        __modifiedProperties.add("timeFormatExcel");
        this._timeFormatExcel = timeFormatExcel;
    }

    /**
     * [get] TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 時間書式（Text）
     * @return The value of the column 'TIME_FORMAT_TEXT'. (NullAllowed)
     */
    public String getTimeFormatText() {
        return _timeFormatText;
    }

    /**
     * [set] TIME_FORMAT_TEXT: {varchar(30)} <br>
     * 時間書式（Text）
     * @param timeFormatText The value of the column 'TIME_FORMAT_TEXT'. (NullAllowed)
     */
    public void setTimeFormatText(String timeFormatText) {
        __modifiedProperties.add("timeFormatText");
        this._timeFormatText = timeFormatText;
    }

    /**
     * [get] NUMBER_FORMAT_DISPLAY: {varchar(30)} <br>
     * 数値書式（画面）
     * @return The value of the column 'NUMBER_FORMAT_DISPLAY'. (NullAllowed)
     */
    public String getNumberFormatDisplay() {
        return _numberFormatDisplay;
    }

    /**
     * [set] NUMBER_FORMAT_DISPLAY: {varchar(30)} <br>
     * 数値書式（画面）
     * @param numberFormatDisplay The value of the column 'NUMBER_FORMAT_DISPLAY'. (NullAllowed)
     */
    public void setNumberFormatDisplay(String numberFormatDisplay) {
        __modifiedProperties.add("numberFormatDisplay");
        this._numberFormatDisplay = numberFormatDisplay;
    }

    /**
     * [get] NUMBER_FORMAT_REPORT: {varchar(30)} <br>
     * 数値書式（帳票）
     * @return The value of the column 'NUMBER_FORMAT_REPORT'. (NullAllowed)
     */
    public String getNumberFormatReport() {
        return _numberFormatReport;
    }

    /**
     * [set] NUMBER_FORMAT_REPORT: {varchar(30)} <br>
     * 数値書式（帳票）
     * @param numberFormatReport The value of the column 'NUMBER_FORMAT_REPORT'. (NullAllowed)
     */
    public void setNumberFormatReport(String numberFormatReport) {
        __modifiedProperties.add("numberFormatReport");
        this._numberFormatReport = numberFormatReport;
    }

    /**
     * [get] NUMBER_FORMAT_EXCEL: {varchar(30)} <br>
     * 数値書式（Excel）
     * @return The value of the column 'NUMBER_FORMAT_EXCEL'. (NullAllowed)
     */
    public String getNumberFormatExcel() {
        return _numberFormatExcel;
    }

    /**
     * [set] NUMBER_FORMAT_EXCEL: {varchar(30)} <br>
     * 数値書式（Excel）
     * @param numberFormatExcel The value of the column 'NUMBER_FORMAT_EXCEL'. (NullAllowed)
     */
    public void setNumberFormatExcel(String numberFormatExcel) {
        __modifiedProperties.add("numberFormatExcel");
        this._numberFormatExcel = numberFormatExcel;
    }

    /**
     * [get] NUMBER_FORMAT_TEXT: {varchar(30)} <br>
     * 数値書式（Text）
     * @return The value of the column 'NUMBER_FORMAT_TEXT'. (NullAllowed)
     */
    public String getNumberFormatText() {
        return _numberFormatText;
    }

    /**
     * [set] NUMBER_FORMAT_TEXT: {varchar(30)} <br>
     * 数値書式（Text）
     * @param numberFormatText The value of the column 'NUMBER_FORMAT_TEXT'. (NullAllowed)
     */
    public void setNumberFormatText(String numberFormatText) {
        __modifiedProperties.add("numberFormatText");
        this._numberFormatText = numberFormatText;
    }

    /**
     * [get] CURRENCY_FORMAT_REPORT: {varchar(30)} <br>
     * 通貨書式（帳票）
     * @return The value of the column 'CURRENCY_FORMAT_REPORT'. (NullAllowed)
     */
    public String getCurrencyFormatReport() {
        return _currencyFormatReport;
    }

    /**
     * [set] CURRENCY_FORMAT_REPORT: {varchar(30)} <br>
     * 通貨書式（帳票）
     * @param currencyFormatReport The value of the column 'CURRENCY_FORMAT_REPORT'. (NullAllowed)
     */
    public void setCurrencyFormatReport(String currencyFormatReport) {
        __modifiedProperties.add("currencyFormatReport");
        this._currencyFormatReport = currencyFormatReport;
    }

    /**
     * [get] FONT_NAME_EXCEL: {varchar(60)} <br>
     * フォント名称（Excel）
     * @return The value of the column 'FONT_NAME_EXCEL'. (NullAllowed)
     */
    public String getFontNameExcel() {
        return _fontNameExcel;
    }

    /**
     * [set] FONT_NAME_EXCEL: {varchar(60)} <br>
     * フォント名称（Excel）
     * @param fontNameExcel The value of the column 'FONT_NAME_EXCEL'. (NullAllowed)
     */
    public void setFontNameExcel(String fontNameExcel) {
        __modifiedProperties.add("fontNameExcel");
        this._fontNameExcel = fontNameExcel;
    }

    /**
     * [get] FONT_SIZE_EXCEL: {decimal(16, 6)} <br>
     * フォントサイズ（Excel）
     * @return The value of the column 'FONT_SIZE_EXCEL'. (NullAllowed)
     */
    public java.math.BigDecimal getFontSizeExcel() {
        return _fontSizeExcel;
    }

    /**
     * [set] FONT_SIZE_EXCEL: {decimal(16, 6)} <br>
     * フォントサイズ（Excel）
     * @param fontSizeExcel The value of the column 'FONT_SIZE_EXCEL'. (NullAllowed)
     */
    public void setFontSizeExcel(java.math.BigDecimal fontSizeExcel) {
        __modifiedProperties.add("fontSizeExcel");
        this._fontSizeExcel = fontSizeExcel;
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
