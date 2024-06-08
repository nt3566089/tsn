package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_REQUEST_HIST as TABLE. <br>
 * 印刷履歴情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_HIST_ID
 *
 * [column]
 *     PRINT_REQUEST_HIST_ID, PRINT_REQUEST_ID, PRINT_REQUEST_NO, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_RESULT_CLASS, PROCESS_INFO, QUEUE_ADD_DT, PRINT_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrintRequest, bClassDtlBySheetCollate, bClassDtlByPrintResultClass
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrintRequestHistDto implements Serializable {

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
    /** PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printRequestHistId;

    /** PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    @JsonKey
    protected Long _printRequestId;

    /** PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _printRequestNo;

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

    /** PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} */
    @JsonKey
    protected String _printResultClass;

    /** PROCESS_INFO: {varchar(2147483647)} */
    @JsonKey
    protected String _processInfo;

    /** QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _queueAddDt;

    /** PRINT_DT: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _printDt;

    /** PRINT_DATA_TYPE: {NotNull, char(1)} */
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
    public BsPPrintRequestHistDto() {
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

    protected BClassDtlDto _bClassDtlBySheetCollate;

    public BClassDtlDto getBClassDtlBySheetCollate() {
        return _bClassDtlBySheetCollate;
    }

    public void setBClassDtlBySheetCollate(BClassDtlDto bClassDtlBySheetCollate) {
        this._bClassDtlBySheetCollate = bClassDtlBySheetCollate;
    }

    protected BClassDtlDto _bClassDtlByPrintResultClass;

    public BClassDtlDto getBClassDtlByPrintResultClass() {
        return _bClassDtlByPrintResultClass;
    }

    public void setBClassDtlByPrintResultClass(BClassDtlDto bClassDtlByPrintResultClass) {
        this._bClassDtlByPrintResultClass = bClassDtlByPrintResultClass;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrintRequestHistDto)) { return false; }
        final BsPPrintRequestHistDto otherEntity = (BsPPrintRequestHistDto)other;
        if (!helpComparingValue(getPrintRequestHistId(), otherEntity.getPrintRequestHistId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_REQUEST_HIST");
        result = xCH(result, getPrintRequestHistId());
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
        sb.append(c).append(getPrintRequestHistId());
        sb.append(c).append(getPrintRequestId());
        sb.append(c).append(getPrintRequestNo());
        sb.append(c).append(getPrinterNm());
        sb.append(c).append(getTrayNm());
        sb.append(c).append(getPrintNum());
        sb.append(c).append(getDocumentPageSize());
        sb.append(c).append(getSheetCollate());
        sb.append(c).append(getPrintResultClass());
        sb.append(c).append(getProcessInfo());
        sb.append(c).append(getQueueAddDt());
        sb.append(c).append(getPrintDt());
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
     * [get] PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷履歴ID
     * @return The value of the column 'PRINT_REQUEST_HIST_ID'. (NullAllowed)
     */
    public Long getPrintRequestHistId() {
        return _printRequestHistId;
    }

    /**
     * [set] PRINT_REQUEST_HIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷履歴ID
     * @param printRequestHistId The value of the column 'PRINT_REQUEST_HIST_ID'. (NullAllowed)
     */
    public void setPrintRequestHistId(Long printRequestHistId) {
        __modifiedProperties.add("printRequestHistId");
        this._printRequestHistId = printRequestHistId;
    }

    /**
     * [get] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public Long getPrintRequestId() {
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public void setPrintRequestId(Long printRequestId) {
        __modifiedProperties.add("printRequestId");
        this._printRequestId = printRequestId;
    }

    /**
     * [get] PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} <br>
     * 印刷No.
     * @return The value of the column 'PRINT_REQUEST_NO'. (NullAllowed)
     */
    public Long getPrintRequestNo() {
        return _printRequestNo;
    }

    /**
     * [set] PRINT_REQUEST_NO: {+UQ, NotNull, bigint(19)} <br>
     * 印刷No.
     * @param printRequestNo The value of the column 'PRINT_REQUEST_NO'. (NullAllowed)
     */
    public void setPrintRequestNo(Long printRequestNo) {
        __modifiedProperties.add("printRequestNo");
        this._printRequestNo = printRequestNo;
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
     * [get] PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @return The value of the column 'PRINT_RESULT_CLASS'. (NullAllowed)
     */
    public String getPrintResultClass() {
        return _printResultClass;
    }

    /**
     * [set] PRINT_RESULT_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintResultClass} <br>
     * 印刷結果区分
     * @param printResultClass The value of the column 'PRINT_RESULT_CLASS'. (NullAllowed)
     */
    public void setPrintResultClass(String printResultClass) {
        __modifiedProperties.add("printResultClass");
        this._printResultClass = printResultClass;
    }

    /**
     * [get] PROCESS_INFO: {varchar(2147483647)} <br>
     * 処理情報
     * @return The value of the column 'PROCESS_INFO'. (NullAllowed)
     */
    public String getProcessInfo() {
        return _processInfo;
    }

    /**
     * [set] PROCESS_INFO: {varchar(2147483647)} <br>
     * 処理情報
     * @param processInfo The value of the column 'PROCESS_INFO'. (NullAllowed)
     */
    public void setProcessInfo(String processInfo) {
        __modifiedProperties.add("processInfo");
        this._processInfo = processInfo;
    }

    /**
     * [get] QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} <br>
     * キュー登録日時
     * @return The value of the column 'QUEUE_ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getQueueAddDt() {
        return _queueAddDt;
    }

    /**
     * [set] QUEUE_ADD_DT: {NotNull, datetime2(26, 6)} <br>
     * キュー登録日時
     * @param queueAddDt The value of the column 'QUEUE_ADD_DT'. (NullAllowed)
     */
    public void setQueueAddDt(java.sql.Timestamp queueAddDt) {
        __modifiedProperties.add("queueAddDt");
        this._queueAddDt = queueAddDt;
    }

    /**
     * [get] PRINT_DT: {NotNull, datetime2(26, 6)} <br>
     * 印刷日時
     * @return The value of the column 'PRINT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPrintDt() {
        return _printDt;
    }

    /**
     * [set] PRINT_DT: {NotNull, datetime2(26, 6)} <br>
     * 印刷日時
     * @param printDt The value of the column 'PRINT_DT'. (NullAllowed)
     */
    public void setPrintDt(java.sql.Timestamp printDt) {
        __modifiedProperties.add("printDt");
        this._printDt = printDt;
    }

    /**
     * [get] PRINT_DATA_TYPE: {NotNull, char(1)} <br>
     * 印刷データタイプ
     * @return The value of the column 'PRINT_DATA_TYPE'. (NullAllowed)
     */
    public String getPrintDataType() {
        return _printDataType;
    }

    /**
     * [set] PRINT_DATA_TYPE: {NotNull, char(1)} <br>
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
