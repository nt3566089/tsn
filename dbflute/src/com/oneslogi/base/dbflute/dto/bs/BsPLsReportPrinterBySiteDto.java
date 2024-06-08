package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of P_LS_REPORT_PRINTER_BY_SITE as TABLE. <br>
 * 拠点別帳票プリンタ設定
 * <pre>
 * [primary-key]
 *     WAREHOUSE_CD
 *
 * [column]
 *     WAREHOUSE_CD, REPORT_FORM_NAME, PRINTER_GROUP, LINE_NO, REPORT_SERVER_NAME, REPORT_PRINTER_NAME, FLOOR, AUTO_FLG, TERMINAL_CD, PRITER_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsPLsReportPrinterBySiteDto implements Serializable {

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
    /** WAREHOUSE_CD: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _warehouseCd;

    /** REPORT_FORM_NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _reportFormName;

    /** PRINTER_GROUP: {NotNull, varchar(255)} */
    @JsonKey
    protected String _printerGroup;

    /** LINE_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** REPORT_SERVER_NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _reportServerName;

    /** REPORT_PRINTER_NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _reportPrinterName;

    /** FLOOR: {varchar(255)} */
    @JsonKey
    protected String _floor;

    /** AUTO_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _autoFlg;

    /** TERMINAL_CD: {varchar(255)} */
    @JsonKey
    protected String _terminalCd;

    /** PRITER_NO: {varchar(255)} */
    @JsonKey
    protected String _priterNo;

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
    public BsPLsReportPrinterBySiteDto() {
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
        if (other == null || !(other instanceof BsPLsReportPrinterBySiteDto)) { return false; }
        final BsPLsReportPrinterBySiteDto otherEntity = (BsPLsReportPrinterBySiteDto)other;
        if (!helpComparingValue(getWarehouseCd(), otherEntity.getWarehouseCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_LS_REPORT_PRINTER_BY_SITE");
        result = xCH(result, getWarehouseCd());
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
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getReportFormName());
        sb.append(c).append(getPrinterGroup());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getReportServerName());
        sb.append(c).append(getReportPrinterName());
        sb.append(c).append(getFloor());
        sb.append(c).append(getAutoFlg());
        sb.append(c).append(getTerminalCd());
        sb.append(c).append(getPriterNo());
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
     * [get] WAREHOUSE_CD: {PK, NotNull, bigint(19)} <br>
     * 拠点コード
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public Long getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {PK, NotNull, bigint(19)} <br>
     * 拠点コード
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(Long warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] REPORT_FORM_NAME: {NotNull, varchar(255)} <br>
     * 帳票フォーム名称
     * @return The value of the column 'REPORT_FORM_NAME'. (NullAllowed)
     */
    public String getReportFormName() {
        return _reportFormName;
    }

    /**
     * [set] REPORT_FORM_NAME: {NotNull, varchar(255)} <br>
     * 帳票フォーム名称
     * @param reportFormName The value of the column 'REPORT_FORM_NAME'. (NullAllowed)
     */
    public void setReportFormName(String reportFormName) {
        __modifiedProperties.add("reportFormName");
        this._reportFormName = reportFormName;
    }

    /**
     * [get] PRINTER_GROUP: {NotNull, varchar(255)} <br>
     * プリンタグループ
     * @return The value of the column 'PRINTER_GROUP'. (NullAllowed)
     */
    public String getPrinterGroup() {
        return _printerGroup;
    }

    /**
     * [set] PRINTER_GROUP: {NotNull, varchar(255)} <br>
     * プリンタグループ
     * @param printerGroup The value of the column 'PRINTER_GROUP'. (NullAllowed)
     */
    public void setPrinterGroup(String printerGroup) {
        __modifiedProperties.add("printerGroup");
        this._printerGroup = printerGroup;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 行No.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] REPORT_SERVER_NAME: {NotNull, varchar(255)} <br>
     * 帳票サーバ名称
     * @return The value of the column 'REPORT_SERVER_NAME'. (NullAllowed)
     */
    public String getReportServerName() {
        return _reportServerName;
    }

    /**
     * [set] REPORT_SERVER_NAME: {NotNull, varchar(255)} <br>
     * 帳票サーバ名称
     * @param reportServerName The value of the column 'REPORT_SERVER_NAME'. (NullAllowed)
     */
    public void setReportServerName(String reportServerName) {
        __modifiedProperties.add("reportServerName");
        this._reportServerName = reportServerName;
    }

    /**
     * [get] REPORT_PRINTER_NAME: {NotNull, varchar(255)} <br>
     * 帳票プリンタ名称
     * @return The value of the column 'REPORT_PRINTER_NAME'. (NullAllowed)
     */
    public String getReportPrinterName() {
        return _reportPrinterName;
    }

    /**
     * [set] REPORT_PRINTER_NAME: {NotNull, varchar(255)} <br>
     * 帳票プリンタ名称
     * @param reportPrinterName The value of the column 'REPORT_PRINTER_NAME'. (NullAllowed)
     */
    public void setReportPrinterName(String reportPrinterName) {
        __modifiedProperties.add("reportPrinterName");
        this._reportPrinterName = reportPrinterName;
    }

    /**
     * [get] FLOOR: {varchar(255)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {varchar(255)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] AUTO_FLG: {char(1), default=[0]} <br>
     * デフォルトプリンタ
     * @return The value of the column 'AUTO_FLG'. (NullAllowed)
     */
    public String getAutoFlg() {
        return _autoFlg;
    }

    /**
     * [set] AUTO_FLG: {char(1), default=[0]} <br>
     * デフォルトプリンタ
     * @param autoFlg The value of the column 'AUTO_FLG'. (NullAllowed)
     */
    public void setAutoFlg(String autoFlg) {
        __modifiedProperties.add("autoFlg");
        this._autoFlg = autoFlg;
    }

    /**
     * [get] TERMINAL_CD: {varchar(255)} <br>
     * 端末コード
     * @return The value of the column 'TERMINAL_CD'. (NullAllowed)
     */
    public String getTerminalCd() {
        return _terminalCd;
    }

    /**
     * [set] TERMINAL_CD: {varchar(255)} <br>
     * 端末コード
     * @param terminalCd The value of the column 'TERMINAL_CD'. (NullAllowed)
     */
    public void setTerminalCd(String terminalCd) {
        __modifiedProperties.add("terminalCd");
        this._terminalCd = terminalCd;
    }

    /**
     * [get] PRITER_NO: {varchar(255)} <br>
     * ラインNo
     * @return The value of the column 'PRITER_NO'. (NullAllowed)
     */
    public String getPriterNo() {
        return _priterNo;
    }

    /**
     * [set] PRITER_NO: {varchar(255)} <br>
     * ラインNo
     * @param priterNo The value of the column 'PRITER_NO'. (NullAllowed)
     */
    public void setPriterNo(String priterNo) {
        __modifiedProperties.add("priterNo");
        this._priterNo = priterNo;
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
