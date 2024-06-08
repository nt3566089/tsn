package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINTER_ATTRIBUTE as TABLE. <br>
 * プリンタ属性マスタ
 * <pre>
 * [primary-key]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [column]
 *     PRINTER_ATTRIBUTE_ID, PRINTER_ID, TRAY_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINTER, B_CLASS_DTL(ByVisible)
 *
 * [referrer-table]
 *     P_LAYOUT_PRINT_SETTING, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign-property]
 *     pPrinter, bClassDtlByVisible
 *
 * [referrer-property]
 *     pLayoutPrintSettingList, pUserAutoPrintSettingByPrinterAttributeIdList, pTerminalAutoPrintSetByPrinterAttributeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPPrinterAttributeDto implements Serializable {

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
    /** PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printerAttributeId;

    /** PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER} */
    @JsonKey
    protected Long _printerId;

    /** TRAY_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _trayNm;

    /** VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} */
    @JsonKey
    protected String _visible;

    /** ADD_TERMINAL: {varchar(60)} */
    @JsonKey
    protected String _addTerminal;

    /** UPD_TERMINAL: {varchar(60)} */
    @JsonKey
    protected String _updTerminal;

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
    public BsPPrinterAttributeDto() {
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
    protected PPrinterDto _pPrinter;

    public PPrinterDto getPPrinter() {
        return _pPrinter;
    }

    public void setPPrinter(PPrinterDto pPrinter) {
        this._pPrinter = pPrinter;
    }

    protected BClassDtlDto _bClassDtlByVisible;

    public BClassDtlDto getBClassDtlByVisible() {
        return _bClassDtlByVisible;
    }

    public void setBClassDtlByVisible(BClassDtlDto bClassDtlByVisible) {
        this._bClassDtlByVisible = bClassDtlByVisible;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<PLayoutPrintSettingDto> _pLayoutPrintSettingList;

    public List<PLayoutPrintSettingDto> getPLayoutPrintSettingList() {
        if (_pLayoutPrintSettingList == null) { _pLayoutPrintSettingList = new ArrayList<PLayoutPrintSettingDto>(); }
        return _pLayoutPrintSettingList;
    }

    public void setPLayoutPrintSettingList(List<PLayoutPrintSettingDto> pLayoutPrintSettingList) {
        this._pLayoutPrintSettingList = pLayoutPrintSettingList;
    }

    protected List<PUserAutoPrintSettingDto> _pUserAutoPrintSettingByPrinterAttributeIdList;

    public List<PUserAutoPrintSettingDto> getPUserAutoPrintSettingByPrinterAttributeIdList() {
        if (_pUserAutoPrintSettingByPrinterAttributeIdList == null) { _pUserAutoPrintSettingByPrinterAttributeIdList = new ArrayList<PUserAutoPrintSettingDto>(); }
        return _pUserAutoPrintSettingByPrinterAttributeIdList;
    }

    public void setPUserAutoPrintSettingByPrinterAttributeIdList(List<PUserAutoPrintSettingDto> pUserAutoPrintSettingByPrinterAttributeIdList) {
        this._pUserAutoPrintSettingByPrinterAttributeIdList = pUserAutoPrintSettingByPrinterAttributeIdList;
    }

    protected List<PTerminalAutoPrintSetDto> _pTerminalAutoPrintSetByPrinterAttributeIdList;

    public List<PTerminalAutoPrintSetDto> getPTerminalAutoPrintSetByPrinterAttributeIdList() {
        if (_pTerminalAutoPrintSetByPrinterAttributeIdList == null) { _pTerminalAutoPrintSetByPrinterAttributeIdList = new ArrayList<PTerminalAutoPrintSetDto>(); }
        return _pTerminalAutoPrintSetByPrinterAttributeIdList;
    }

    public void setPTerminalAutoPrintSetByPrinterAttributeIdList(List<PTerminalAutoPrintSetDto> pTerminalAutoPrintSetByPrinterAttributeIdList) {
        this._pTerminalAutoPrintSetByPrinterAttributeIdList = pTerminalAutoPrintSetByPrinterAttributeIdList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPPrinterAttributeDto)) { return false; }
        final BsPPrinterAttributeDto otherEntity = (BsPPrinterAttributeDto)other;
        if (!helpComparingValue(getPrinterAttributeId(), otherEntity.getPrinterAttributeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINTER_ATTRIBUTE");
        result = xCH(result, getPrinterAttributeId());
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
        sb.append(c).append(getPrinterAttributeId());
        sb.append(c).append(getPrinterId());
        sb.append(c).append(getTrayNm());
        sb.append(c).append(getVisible());
        sb.append(c).append(getAddTerminal());
        sb.append(c).append(getUpdTerminal());
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
     * [get] PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタ属性ID
     * @return The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed)
     */
    public Long getPrinterAttributeId() {
        return _printerAttributeId;
    }

    /**
     * [set] PRINTER_ATTRIBUTE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * プリンタ属性ID
     * @param printerAttributeId The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed)
     */
    public void setPrinterAttributeId(Long printerAttributeId) {
        __modifiedProperties.add("printerAttributeId");
        this._printerAttributeId = printerAttributeId;
    }

    /**
     * [get] PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @return The value of the column 'PRINTER_ID'. (NullAllowed)
     */
    public Long getPrinterId() {
        return _printerId;
    }

    /**
     * [set] PRINTER_ID: {IX, NotNull, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @param printerId The value of the column 'PRINTER_ID'. (NullAllowed)
     */
    public void setPrinterId(Long printerId) {
        __modifiedProperties.add("printerId");
        this._printerId = printerId;
    }

    /**
     * [get] TRAY_NM: {NotNull, varchar(60)} <br>
     * トレイ名称
     * @return The value of the column 'TRAY_NM'. (NullAllowed)
     */
    public String getTrayNm() {
        return _trayNm;
    }

    /**
     * [set] TRAY_NM: {NotNull, varchar(60)} <br>
     * トレイ名称
     * @param trayNm The value of the column 'TRAY_NM'. (NullAllowed)
     */
    public void setTrayNm(String trayNm) {
        __modifiedProperties.add("trayNm");
        this._trayNm = trayNm;
    }

    /**
     * [get] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (NullAllowed)
     */
    public String getVisible() {
        return _visible;
    }

    /**
     * [set] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (NullAllowed)
     */
    public void setVisible(String visible) {
        __modifiedProperties.add("visible");
        this._visible = visible;
    }

    /**
     * [get] ADD_TERMINAL: {varchar(60)} <br>
     * 登録端末
     * @return The value of the column 'ADD_TERMINAL'. (NullAllowed)
     */
    public String getAddTerminal() {
        return _addTerminal;
    }

    /**
     * [set] ADD_TERMINAL: {varchar(60)} <br>
     * 登録端末
     * @param addTerminal The value of the column 'ADD_TERMINAL'. (NullAllowed)
     */
    public void setAddTerminal(String addTerminal) {
        __modifiedProperties.add("addTerminal");
        this._addTerminal = addTerminal;
    }

    /**
     * [get] UPD_TERMINAL: {varchar(60)} <br>
     * 更新端末
     * @return The value of the column 'UPD_TERMINAL'. (NullAllowed)
     */
    public String getUpdTerminal() {
        return _updTerminal;
    }

    /**
     * [set] UPD_TERMINAL: {varchar(60)} <br>
     * 更新端末
     * @param updTerminal The value of the column 'UPD_TERMINAL'. (NullAllowed)
     */
    public void setUpdTerminal(String updTerminal) {
        __modifiedProperties.add("updTerminal");
        this._updTerminal = updTerminal;
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
