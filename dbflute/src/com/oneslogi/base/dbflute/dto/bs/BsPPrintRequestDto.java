package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_REQUEST as TABLE. <br>
 * 印刷情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_ID
 *
 * [column]
 *     PRINT_REQUEST_ID, REPORT_CD, REPORT_NM, REPORT_LAYOUT_NM, PRINTER_GROUP_ID, PRINTER_GROUP_NM, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_STATUS, FIRST_PRINT_DT, LATEST_PRINT_DT, PRINTED_COUNT, PRINTED_FLG, QUEUE_ADD_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     B_CLASS_DTL(ByPrintStatus), P_PRINT_REQUEST_DATA(AsOne)
 *
 * [referrer-table]
 *     P_PRINT_QUEUE, P_PRINT_REQUEST_BINARY, P_PRINT_REQUEST_HIST, P_PRINT_REQUEST_DATA
 *
 * [foreign-property]
 *     bClassDtlByPrintStatus, bClassDtlBySheetCollate, bClassDtlByPrintedFlg, bClassDtlByPrintDataType, pPrintRequestDataAsOne
 *
 * [referrer-property]
 *     pPrintQueueList, pPrintRequestBinaryList, pPrintRequestHistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrintRequestDto implements Serializable {

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
    /** PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printRequestId;

    /** REPORT_CD: {NotNull, varchar(100)} */
    @JsonKey
    protected String _reportCd;

    /** REPORT_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _reportNm;

    /** REPORT_LAYOUT_NM: {varchar(60)} */
    @JsonKey
    protected String _reportLayoutNm;

    /** PRINTER_GROUP_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _printerGroupId;

    /** PRINTER_GROUP_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _printerGroupNm;

    /** PRINTER_NM: {varchar(60)} */
    @JsonKey
    protected String _printerNm;

    /** TRAY_NM: {varchar(60)} */
    @JsonKey
    protected String _trayNm;

    /** PRINT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _printNum;

    /** DOCUMENT_PAGE_SIZE: {bigint(19)} */
    @JsonKey
    protected Long _documentPageSize;

    /** SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} */
    @JsonKey
    protected String _sheetCollate;

    /** PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} */
    @JsonKey
    protected String _printStatus;

    /** FIRST_PRINT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _firstPrintDt;

    /** LATEST_PRINT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _latestPrintDt;

    /** PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _printedCount;

    /** PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} */
    @JsonKey
    protected String _printedFlg;

    /** QUEUE_ADD_DT: {IX, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _queueAddDt;

    /** PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} */
    @JsonKey
    protected String _printDataType;

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
    public BsPPrintRequestDto() {
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
    protected BClassDtlDto _bClassDtlByPrintStatus;

    public BClassDtlDto getBClassDtlByPrintStatus() {
        return _bClassDtlByPrintStatus;
    }

    public void setBClassDtlByPrintStatus(BClassDtlDto bClassDtlByPrintStatus) {
        this._bClassDtlByPrintStatus = bClassDtlByPrintStatus;
    }

    protected BClassDtlDto _bClassDtlBySheetCollate;

    public BClassDtlDto getBClassDtlBySheetCollate() {
        return _bClassDtlBySheetCollate;
    }

    public void setBClassDtlBySheetCollate(BClassDtlDto bClassDtlBySheetCollate) {
        this._bClassDtlBySheetCollate = bClassDtlBySheetCollate;
    }

    protected BClassDtlDto _bClassDtlByPrintedFlg;

    public BClassDtlDto getBClassDtlByPrintedFlg() {
        return _bClassDtlByPrintedFlg;
    }

    public void setBClassDtlByPrintedFlg(BClassDtlDto bClassDtlByPrintedFlg) {
        this._bClassDtlByPrintedFlg = bClassDtlByPrintedFlg;
    }

    protected BClassDtlDto _bClassDtlByPrintDataType;

    public BClassDtlDto getBClassDtlByPrintDataType() {
        return _bClassDtlByPrintDataType;
    }

    public void setBClassDtlByPrintDataType(BClassDtlDto bClassDtlByPrintDataType) {
        this._bClassDtlByPrintDataType = bClassDtlByPrintDataType;
    }

    protected PPrintRequestDataDto _pPrintRequestDataAsOne;

    public PPrintRequestDataDto getPPrintRequestDataAsOne() {
        return _pPrintRequestDataAsOne;
    }

    public void setPPrintRequestDataAsOne(PPrintRequestDataDto PPrintRequestDataAsOne) {
        this._pPrintRequestDataAsOne = PPrintRequestDataAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<PPrintQueueDto> _pPrintQueueList;

    public List<PPrintQueueDto> getPPrintQueueList() {
        if (_pPrintQueueList == null) { _pPrintQueueList = new ArrayList<PPrintQueueDto>(); }
        return _pPrintQueueList;
    }

    public void setPPrintQueueList(List<PPrintQueueDto> pPrintQueueList) {
        this._pPrintQueueList = pPrintQueueList;
    }

    protected List<PPrintRequestBinaryDto> _pPrintRequestBinaryList;

    public List<PPrintRequestBinaryDto> getPPrintRequestBinaryList() {
        if (_pPrintRequestBinaryList == null) { _pPrintRequestBinaryList = new ArrayList<PPrintRequestBinaryDto>(); }
        return _pPrintRequestBinaryList;
    }

    public void setPPrintRequestBinaryList(List<PPrintRequestBinaryDto> pPrintRequestBinaryList) {
        this._pPrintRequestBinaryList = pPrintRequestBinaryList;
    }

    protected List<PPrintRequestHistDto> _pPrintRequestHistList;

    public List<PPrintRequestHistDto> getPPrintRequestHistList() {
        if (_pPrintRequestHistList == null) { _pPrintRequestHistList = new ArrayList<PPrintRequestHistDto>(); }
        return _pPrintRequestHistList;
    }

    public void setPPrintRequestHistList(List<PPrintRequestHistDto> pPrintRequestHistList) {
        this._pPrintRequestHistList = pPrintRequestHistList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrintRequestDto)) { return false; }
        final BsPPrintRequestDto otherEntity = (BsPPrintRequestDto)other;
        if (!helpComparingValue(getPrintRequestId(), otherEntity.getPrintRequestId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_REQUEST");
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
        sb.append(c).append(getReportCd());
        sb.append(c).append(getReportNm());
        sb.append(c).append(getReportLayoutNm());
        sb.append(c).append(getPrinterGroupId());
        sb.append(c).append(getPrinterGroupNm());
        sb.append(c).append(getPrinterNm());
        sb.append(c).append(getTrayNm());
        sb.append(c).append(getPrintNum());
        sb.append(c).append(getDocumentPageSize());
        sb.append(c).append(getSheetCollate());
        sb.append(c).append(getPrintStatus());
        sb.append(c).append(getFirstPrintDt());
        sb.append(c).append(getLatestPrintDt());
        sb.append(c).append(getPrintedCount());
        sb.append(c).append(getPrintedFlg());
        sb.append(c).append(getQueueAddDt());
        sb.append(c).append(getPrintDataType());
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
     * [get] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public Long getPrintRequestId() {
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public void setPrintRequestId(Long printRequestId) {
        __modifiedProperties.add("printRequestId");
        this._printRequestId = printRequestId;
    }

    /**
     * [get] REPORT_CD: {NotNull, varchar(100)} <br>
     * 帳票CD
     * @return The value of the column 'REPORT_CD'. (NullAllowed)
     */
    public String getReportCd() {
        return _reportCd;
    }

    /**
     * [set] REPORT_CD: {NotNull, varchar(100)} <br>
     * 帳票CD
     * @param reportCd The value of the column 'REPORT_CD'. (NullAllowed)
     */
    public void setReportCd(String reportCd) {
        __modifiedProperties.add("reportCd");
        this._reportCd = reportCd;
    }

    /**
     * [get] REPORT_NM: {NotNull, varchar(60)} <br>
     * 帳票名称
     * @return The value of the column 'REPORT_NM'. (NullAllowed)
     */
    public String getReportNm() {
        return _reportNm;
    }

    /**
     * [set] REPORT_NM: {NotNull, varchar(60)} <br>
     * 帳票名称
     * @param reportNm The value of the column 'REPORT_NM'. (NullAllowed)
     */
    public void setReportNm(String reportNm) {
        __modifiedProperties.add("reportNm");
        this._reportNm = reportNm;
    }

    /**
     * [get] REPORT_LAYOUT_NM: {varchar(60)} <br>
     * 帳票レイアウト名称
     * @return The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed)
     */
    public String getReportLayoutNm() {
        return _reportLayoutNm;
    }

    /**
     * [set] REPORT_LAYOUT_NM: {varchar(60)} <br>
     * 帳票レイアウト名称
     * @param reportLayoutNm The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed)
     */
    public void setReportLayoutNm(String reportLayoutNm) {
        __modifiedProperties.add("reportLayoutNm");
        this._reportLayoutNm = reportLayoutNm;
    }

    /**
     * [get] PRINTER_GROUP_ID: {NotNull, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public Long getPrinterGroupId() {
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {NotNull, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        __modifiedProperties.add("printerGroupId");
        this._printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_GROUP_NM: {NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @return The value of the column 'PRINTER_GROUP_NM'. (NullAllowed)
     */
    public String getPrinterGroupNm() {
        return _printerGroupNm;
    }

    /**
     * [set] PRINTER_GROUP_NM: {NotNull, varchar(60)} <br>
     * プリンタグループ名称
     * @param printerGroupNm The value of the column 'PRINTER_GROUP_NM'. (NullAllowed)
     */
    public void setPrinterGroupNm(String printerGroupNm) {
        __modifiedProperties.add("printerGroupNm");
        this._printerGroupNm = printerGroupNm;
    }

    /**
     * [get] PRINTER_NM: {varchar(60)} <br>
     * プリンタ名称
     * @return The value of the column 'PRINTER_NM'. (NullAllowed)
     */
    public String getPrinterNm() {
        return _printerNm;
    }

    /**
     * [set] PRINTER_NM: {varchar(60)} <br>
     * プリンタ名称
     * @param printerNm The value of the column 'PRINTER_NM'. (NullAllowed)
     */
    public void setPrinterNm(String printerNm) {
        __modifiedProperties.add("printerNm");
        this._printerNm = printerNm;
    }

    /**
     * [get] TRAY_NM: {varchar(60)} <br>
     * トレイ名称
     * @return The value of the column 'TRAY_NM'. (NullAllowed)
     */
    public String getTrayNm() {
        return _trayNm;
    }

    /**
     * [set] TRAY_NM: {varchar(60)} <br>
     * トレイ名称
     * @param trayNm The value of the column 'TRAY_NM'. (NullAllowed)
     */
    public void setTrayNm(String trayNm) {
        __modifiedProperties.add("trayNm");
        this._trayNm = trayNm;
    }

    /**
     * [get] PRINT_NUM: {bigint(19)} <br>
     * 印刷部数
     * @return The value of the column 'PRINT_NUM'. (NullAllowed)
     */
    public Long getPrintNum() {
        return _printNum;
    }

    /**
     * [set] PRINT_NUM: {bigint(19)} <br>
     * 印刷部数
     * @param printNum The value of the column 'PRINT_NUM'. (NullAllowed)
     */
    public void setPrintNum(Long printNum) {
        __modifiedProperties.add("printNum");
        this._printNum = printNum;
    }

    /**
     * [get] DOCUMENT_PAGE_SIZE: {bigint(19)} <br>
     * ページ総数
     * @return The value of the column 'DOCUMENT_PAGE_SIZE'. (NullAllowed)
     */
    public Long getDocumentPageSize() {
        return _documentPageSize;
    }

    /**
     * [set] DOCUMENT_PAGE_SIZE: {bigint(19)} <br>
     * ページ総数
     * @param documentPageSize The value of the column 'DOCUMENT_PAGE_SIZE'. (NullAllowed)
     */
    public void setDocumentPageSize(Long documentPageSize) {
        __modifiedProperties.add("documentPageSize");
        this._documentPageSize = documentPageSize;
    }

    /**
     * [get] SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @return The value of the column 'SHEET_COLLATE'. (NullAllowed)
     */
    public String getSheetCollate() {
        return _sheetCollate;
    }

    /**
     * [set] SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate} <br>
     * 部単位印刷要否
     * @param sheetCollate The value of the column 'SHEET_COLLATE'. (NullAllowed)
     */
    public void setSheetCollate(String sheetCollate) {
        __modifiedProperties.add("sheetCollate");
        this._sheetCollate = sheetCollate;
    }

    /**
     * [get] PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @return The value of the column 'PRINT_STATUS'. (NullAllowed)
     */
    public String getPrintStatus() {
        return _printStatus;
    }

    /**
     * [set] PRINT_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintStatus} <br>
     * 印刷ステータス
     * @param printStatus The value of the column 'PRINT_STATUS'. (NullAllowed)
     */
    public void setPrintStatus(String printStatus) {
        __modifiedProperties.add("printStatus");
        this._printStatus = printStatus;
    }

    /**
     * [get] FIRST_PRINT_DT: {datetime2(26, 6)} <br>
     * 初回印刷日時
     * @return The value of the column 'FIRST_PRINT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getFirstPrintDt() {
        return _firstPrintDt;
    }

    /**
     * [set] FIRST_PRINT_DT: {datetime2(26, 6)} <br>
     * 初回印刷日時
     * @param firstPrintDt The value of the column 'FIRST_PRINT_DT'. (NullAllowed)
     */
    public void setFirstPrintDt(java.sql.Timestamp firstPrintDt) {
        __modifiedProperties.add("firstPrintDt");
        this._firstPrintDt = firstPrintDt;
    }

    /**
     * [get] LATEST_PRINT_DT: {datetime2(26, 6)} <br>
     * 最終印刷日時
     * @return The value of the column 'LATEST_PRINT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getLatestPrintDt() {
        return _latestPrintDt;
    }

    /**
     * [set] LATEST_PRINT_DT: {datetime2(26, 6)} <br>
     * 最終印刷日時
     * @param latestPrintDt The value of the column 'LATEST_PRINT_DT'. (NullAllowed)
     */
    public void setLatestPrintDt(java.sql.Timestamp latestPrintDt) {
        __modifiedProperties.add("latestPrintDt");
        this._latestPrintDt = latestPrintDt;
    }

    /**
     * [get] PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} <br>
     * 印刷回数
     * @return The value of the column 'PRINTED_COUNT'. (NullAllowed)
     */
    public Long getPrintedCount() {
        return _printedCount;
    }

    /**
     * [set] PRINTED_COUNT: {NotNull, bigint(19), default=[(0)]} <br>
     * 印刷回数
     * @param printedCount The value of the column 'PRINTED_COUNT'. (NullAllowed)
     */
    public void setPrintedCount(Long printedCount) {
        __modifiedProperties.add("printedCount");
        this._printedCount = printedCount;
    }

    /**
     * [get] PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @return The value of the column 'PRINTED_FLG'. (NullAllowed)
     */
    public String getPrintedFlg() {
        return _printedFlg;
    }

    /**
     * [set] PRINTED_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=PrintedFlg} <br>
     * 再印刷有無
     * @param printedFlg The value of the column 'PRINTED_FLG'. (NullAllowed)
     */
    public void setPrintedFlg(String printedFlg) {
        __modifiedProperties.add("printedFlg");
        this._printedFlg = printedFlg;
    }

    /**
     * [get] QUEUE_ADD_DT: {IX, datetime2(26, 6)} <br>
     * キュー登録日時
     * @return The value of the column 'QUEUE_ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getQueueAddDt() {
        return _queueAddDt;
    }

    /**
     * [set] QUEUE_ADD_DT: {IX, datetime2(26, 6)} <br>
     * キュー登録日時
     * @param queueAddDt The value of the column 'QUEUE_ADD_DT'. (NullAllowed)
     */
    public void setQueueAddDt(java.sql.Timestamp queueAddDt) {
        __modifiedProperties.add("queueAddDt");
        this._queueAddDt = queueAddDt;
    }

    /**
     * [get] PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @return The value of the column 'PRINT_DATA_TYPE'. (NullAllowed)
     */
    public String getPrintDataType() {
        return _printDataType;
    }

    /**
     * [set] PRINT_DATA_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintDataType} <br>
     * 印刷データタイプ
     * @param printDataType The value of the column 'PRINT_DATA_TYPE'. (NullAllowed)
     */
    public void setPrintDataType(String printDataType) {
        __modifiedProperties.add("printDataType");
        this._printDataType = printDataType;
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
