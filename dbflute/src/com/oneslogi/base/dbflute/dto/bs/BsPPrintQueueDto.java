package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_QUEUE as TABLE. <br>
 * 印刷キュー情報
 * <pre>
 * [primary-key]
 *     PRINT_QUEUE_ID
 *
 * [column]
 *     PRINT_QUEUE_ID, PRINT_REQUEST_ID, PRINTER_GROUP_ID, PRINT_QUEUE_STATUS, PRINTER_NM, TRAY_NM, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_QUEUE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(ByPrintQueueStatus)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrintRequest, bClassDtlByPrintQueueStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrintQueueDto implements Serializable {

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
    /** PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printQueueId;

    /** PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    @JsonKey
    protected Long _printRequestId;

    /** PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} */
    @JsonKey
    protected Long _printerGroupId;

    /** PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} */
    @JsonKey
    protected String _printQueueStatus;

    /** PRINTER_NM: {varchar(60)} */
    @JsonKey
    protected String _printerNm;

    /** TRAY_NM: {varchar(60)} */
    @JsonKey
    protected String _trayNm;

    /** PRINT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _printNum;

    /** SHEET_COLLATE: {char(1)} */
    @JsonKey
    protected String _sheetCollate;

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
    public BsPPrintQueueDto() {
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

    protected BClassDtlDto _bClassDtlByPrintQueueStatus;

    public BClassDtlDto getBClassDtlByPrintQueueStatus() {
        return _bClassDtlByPrintQueueStatus;
    }

    public void setBClassDtlByPrintQueueStatus(BClassDtlDto bClassDtlByPrintQueueStatus) {
        this._bClassDtlByPrintQueueStatus = bClassDtlByPrintQueueStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrintQueueDto)) { return false; }
        final BsPPrintQueueDto otherEntity = (BsPPrintQueueDto)other;
        if (!helpComparingValue(getPrintQueueId(), otherEntity.getPrintQueueId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_QUEUE");
        result = xCH(result, getPrintQueueId());
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
        sb.append(c).append(getPrintQueueId());
        sb.append(c).append(getPrintRequestId());
        sb.append(c).append(getPrinterGroupId());
        sb.append(c).append(getPrintQueueStatus());
        sb.append(c).append(getPrinterNm());
        sb.append(c).append(getTrayNm());
        sb.append(c).append(getPrintNum());
        sb.append(c).append(getSheetCollate());
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
     * [get] PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷キューID
     * @return The value of the column 'PRINT_QUEUE_ID'. (NullAllowed)
     */
    public Long getPrintQueueId() {
        return _printQueueId;
    }

    /**
     * [set] PRINT_QUEUE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷キューID
     * @param printQueueId The value of the column 'PRINT_QUEUE_ID'. (NullAllowed)
     */
    public void setPrintQueueId(Long printQueueId) {
        __modifiedProperties.add("printQueueId");
        this._printQueueId = printQueueId;
    }

    /**
     * [get] PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @return The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public Long getPrintRequestId() {
        return _printRequestId;
    }

    /**
     * [set] PRINT_REQUEST_ID: {IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} <br>
     * 印刷情報ID
     * @param printRequestId The value of the column 'PRINT_REQUEST_ID'. (NullAllowed)
     */
    public void setPrintRequestId(Long printRequestId) {
        __modifiedProperties.add("printRequestId");
        this._printRequestId = printRequestId;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public Long getPrinterGroupId() {
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX+, NotNull, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        __modifiedProperties.add("printerGroupId");
        this._printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @return The value of the column 'PRINT_QUEUE_STATUS'. (NullAllowed)
     */
    public String getPrintQueueStatus() {
        return _printQueueStatus;
    }

    /**
     * [set] PRINT_QUEUE_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=PrintQueueStatus} <br>
     * 印刷キューステータス
     * @param printQueueStatus The value of the column 'PRINT_QUEUE_STATUS'. (NullAllowed)
     */
    public void setPrintQueueStatus(String printQueueStatus) {
        __modifiedProperties.add("printQueueStatus");
        this._printQueueStatus = printQueueStatus;
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
     * [get] SHEET_COLLATE: {char(1)} <br>
     * 部単位印刷要否
     * @return The value of the column 'SHEET_COLLATE'. (NullAllowed)
     */
    public String getSheetCollate() {
        return _sheetCollate;
    }

    /**
     * [set] SHEET_COLLATE: {char(1)} <br>
     * 部単位印刷要否
     * @param sheetCollate The value of the column 'SHEET_COLLATE'. (NullAllowed)
     */
    public void setSheetCollate(String sheetCollate) {
        __modifiedProperties.add("sheetCollate");
        this._sheetCollate = sheetCollate;
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
