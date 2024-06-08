package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_SERVICE as TABLE. <br>
 * 印刷サービス情報
 * <pre>
 * [primary-key]
 *     PRINT_SERVICE_ID
 *
 * [column]
 *     PRINT_SERVICE_ID, PRINT_SERVICE_NM, TERMINAL_NM, MAC_ADDRESS, PRINTER_GROUP_ID, PRINT_SERVICE_STATUS, START_DT, END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByPrintServiceStatus)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bClassDtlByPrintServiceStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrintServiceDto implements Serializable {

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
    /** PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printServiceId;

    /** PRINT_SERVICE_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _printServiceNm;

    /** TERMINAL_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _terminalNm;

    /** MAC_ADDRESS: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _macAddress;

    /** PRINTER_GROUP_ID: {IX, bigint(19)} */
    @JsonKey
    protected Long _printerGroupId;

    /** PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} */
    @JsonKey
    protected String _printServiceStatus;

    /** START_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _startDt;

    /** END_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _endDt;

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
    public BsPPrintServiceDto() {
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
    protected BClassDtlDto _bClassDtlByPrintServiceStatus;

    public BClassDtlDto getBClassDtlByPrintServiceStatus() {
        return _bClassDtlByPrintServiceStatus;
    }

    public void setBClassDtlByPrintServiceStatus(BClassDtlDto bClassDtlByPrintServiceStatus) {
        this._bClassDtlByPrintServiceStatus = bClassDtlByPrintServiceStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrintServiceDto)) { return false; }
        final BsPPrintServiceDto otherEntity = (BsPPrintServiceDto)other;
        if (!helpComparingValue(getPrintServiceId(), otherEntity.getPrintServiceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_SERVICE");
        result = xCH(result, getPrintServiceId());
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
        sb.append(c).append(getPrintServiceId());
        sb.append(c).append(getPrintServiceNm());
        sb.append(c).append(getTerminalNm());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getPrinterGroupId());
        sb.append(c).append(getPrintServiceStatus());
        sb.append(c).append(getStartDt());
        sb.append(c).append(getEndDt());
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
     * [get] PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷サービスID
     * @return The value of the column 'PRINT_SERVICE_ID'. (NullAllowed)
     */
    public Long getPrintServiceId() {
        return _printServiceId;
    }

    /**
     * [set] PRINT_SERVICE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷サービスID
     * @param printServiceId The value of the column 'PRINT_SERVICE_ID'. (NullAllowed)
     */
    public void setPrintServiceId(Long printServiceId) {
        __modifiedProperties.add("printServiceId");
        this._printServiceId = printServiceId;
    }

    /**
     * [get] PRINT_SERVICE_NM: {NotNull, varchar(60)} <br>
     * 印刷サービス名称
     * @return The value of the column 'PRINT_SERVICE_NM'. (NullAllowed)
     */
    public String getPrintServiceNm() {
        return _printServiceNm;
    }

    /**
     * [set] PRINT_SERVICE_NM: {NotNull, varchar(60)} <br>
     * 印刷サービス名称
     * @param printServiceNm The value of the column 'PRINT_SERVICE_NM'. (NullAllowed)
     */
    public void setPrintServiceNm(String printServiceNm) {
        __modifiedProperties.add("printServiceNm");
        this._printServiceNm = printServiceNm;
    }

    /**
     * [get] TERMINAL_NM: {NotNull, varchar(60)} <br>
     * 端末名称
     * @return The value of the column 'TERMINAL_NM'. (NullAllowed)
     */
    public String getTerminalNm() {
        return _terminalNm;
    }

    /**
     * [set] TERMINAL_NM: {NotNull, varchar(60)} <br>
     * 端末名称
     * @param terminalNm The value of the column 'TERMINAL_NM'. (NullAllowed)
     */
    public void setTerminalNm(String terminalNm) {
        __modifiedProperties.add("terminalNm");
        this._terminalNm = terminalNm;
    }

    /**
     * [get] MAC_ADDRESS: {UQ, NotNull, varchar(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * [set] MAC_ADDRESS: {UQ, NotNull, varchar(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public void setMacAddress(String macAddress) {
        __modifiedProperties.add("macAddress");
        this._macAddress = macAddress;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX, bigint(19)} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public Long getPrinterGroupId() {
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX, bigint(19)} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        __modifiedProperties.add("printerGroupId");
        this._printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @return The value of the column 'PRINT_SERVICE_STATUS'. (NullAllowed)
     */
    public String getPrintServiceStatus() {
        return _printServiceStatus;
    }

    /**
     * [set] PRINT_SERVICE_STATUS: {NotNull, char(1), FK to B_CLASS_DTL, classification=PrintServiceStatus} <br>
     * 印刷サービスステータス
     * @param printServiceStatus The value of the column 'PRINT_SERVICE_STATUS'. (NullAllowed)
     */
    public void setPrintServiceStatus(String printServiceStatus) {
        __modifiedProperties.add("printServiceStatus");
        this._printServiceStatus = printServiceStatus;
    }

    /**
     * [get] START_DT: {datetime2(26, 6)} <br>
     * 開始日時
     * @return The value of the column 'START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStartDt() {
        return _startDt;
    }

    /**
     * [set] START_DT: {datetime2(26, 6)} <br>
     * 開始日時
     * @param startDt The value of the column 'START_DT'. (NullAllowed)
     */
    public void setStartDt(java.sql.Timestamp startDt) {
        __modifiedProperties.add("startDt");
        this._startDt = startDt;
    }

    /**
     * [get] END_DT: {datetime2(26, 6)} <br>
     * 終了日時
     * @return The value of the column 'END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getEndDt() {
        return _endDt;
    }

    /**
     * [set] END_DT: {datetime2(26, 6)} <br>
     * 終了日時
     * @param endDt The value of the column 'END_DT'. (NullAllowed)
     */
    public void setEndDt(java.sql.Timestamp endDt) {
        __modifiedProperties.add("endDt");
        this._endDt = endDt;
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
