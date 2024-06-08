package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_USER_AUTO_PRINT_SETTING as TABLE. <br>
 * ユーザ別自動印刷設定マスタ
 * <pre>
 * [primary-key]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [column]
 *     USER_AUTO_PRINT_SETTING_ID, USER_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_REPORT_LAYOUT(ByReportLayoutId), P_PRINTER_GROUP(ByPrinterGroupId), P_PRINTER(ByPrinterId), P_PRINTER_ATTRIBUTE(ByPrinterAttributeId)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pReportLayoutByReportLayoutId, pPrinterGroupByPrinterGroupId, pPrinterByPrinterId, pPrinterAttributeByPrinterAttributeId
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPUserAutoPrintSettingDto implements Serializable {

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
    /** USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _userAutoPrintSettingId;

    /** USER_ID: {UQ+, IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _userId;

    /** REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} */
    @JsonKey
    protected Long _reportLayoutId;

    /** PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} */
    @JsonKey
    protected Long _printerGroupId;

    /** PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} */
    @JsonKey
    protected Long _printerId;

    /** PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} */
    @JsonKey
    protected Long _printerAttributeId;

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
    public BsPUserAutoPrintSettingDto() {
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
    protected PReportLayoutDto _pReportLayoutByReportLayoutId;

    public PReportLayoutDto getPReportLayoutByReportLayoutId() {
        return _pReportLayoutByReportLayoutId;
    }

    public void setPReportLayoutByReportLayoutId(PReportLayoutDto pReportLayoutByReportLayoutId) {
        this._pReportLayoutByReportLayoutId = pReportLayoutByReportLayoutId;
    }

    protected PPrinterGroupDto _pPrinterGroupByPrinterGroupId;

    public PPrinterGroupDto getPPrinterGroupByPrinterGroupId() {
        return _pPrinterGroupByPrinterGroupId;
    }

    public void setPPrinterGroupByPrinterGroupId(PPrinterGroupDto pPrinterGroupByPrinterGroupId) {
        this._pPrinterGroupByPrinterGroupId = pPrinterGroupByPrinterGroupId;
    }

    protected PPrinterDto _pPrinterByPrinterId;

    public PPrinterDto getPPrinterByPrinterId() {
        return _pPrinterByPrinterId;
    }

    public void setPPrinterByPrinterId(PPrinterDto pPrinterByPrinterId) {
        this._pPrinterByPrinterId = pPrinterByPrinterId;
    }

    protected PPrinterAttributeDto _pPrinterAttributeByPrinterAttributeId;

    public PPrinterAttributeDto getPPrinterAttributeByPrinterAttributeId() {
        return _pPrinterAttributeByPrinterAttributeId;
    }

    public void setPPrinterAttributeByPrinterAttributeId(PPrinterAttributeDto pPrinterAttributeByPrinterAttributeId) {
        this._pPrinterAttributeByPrinterAttributeId = pPrinterAttributeByPrinterAttributeId;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPUserAutoPrintSettingDto)) { return false; }
        final BsPUserAutoPrintSettingDto otherEntity = (BsPUserAutoPrintSettingDto)other;
        if (!helpComparingValue(getUserAutoPrintSettingId(), otherEntity.getUserAutoPrintSettingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_USER_AUTO_PRINT_SETTING");
        result = xCH(result, getUserAutoPrintSettingId());
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
        sb.append(c).append(getUserAutoPrintSettingId());
        sb.append(c).append(getUserId());
        sb.append(c).append(getReportLayoutId());
        sb.append(c).append(getPrinterGroupId());
        sb.append(c).append(getPrinterId());
        sb.append(c).append(getPrinterAttributeId());
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
     * [get] USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザ別自動印刷設定ID
     * @return The value of the column 'USER_AUTO_PRINT_SETTING_ID'. (NullAllowed)
     */
    public Long getUserAutoPrintSettingId() {
        return _userAutoPrintSettingId;
    }

    /**
     * [set] USER_AUTO_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ユーザ別自動印刷設定ID
     * @param userAutoPrintSettingId The value of the column 'USER_AUTO_PRINT_SETTING_ID'. (NullAllowed)
     */
    public void setUserAutoPrintSettingId(Long userAutoPrintSettingId) {
        __modifiedProperties.add("userAutoPrintSettingId");
        this._userAutoPrintSettingId = userAutoPrintSettingId;
    }

    /**
     * [get] USER_ID: {UQ+, IX, NotNull, bigint(19)} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {UQ+, IX, NotNull, bigint(19)} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public Long getReportLayoutId() {
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        __modifiedProperties.add("reportLayoutId");
        this._reportLayoutId = reportLayoutId;
    }

    /**
     * [get] PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @return The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public Long getPrinterGroupId() {
        return _printerGroupId;
    }

    /**
     * [set] PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP} <br>
     * プリンタグループID
     * @param printerGroupId The value of the column 'PRINTER_GROUP_ID'. (NullAllowed)
     */
    public void setPrinterGroupId(Long printerGroupId) {
        __modifiedProperties.add("printerGroupId");
        this._printerGroupId = printerGroupId;
    }

    /**
     * [get] PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @return The value of the column 'PRINTER_ID'. (NullAllowed)
     */
    public Long getPrinterId() {
        return _printerId;
    }

    /**
     * [set] PRINTER_ID: {IX, bigint(19), FK to P_PRINTER} <br>
     * プリンタID
     * @param printerId The value of the column 'PRINTER_ID'. (NullAllowed)
     */
    public void setPrinterId(Long printerId) {
        __modifiedProperties.add("printerId");
        this._printerId = printerId;
    }

    /**
     * [get] PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} <br>
     * プリンタ属性ID
     * @return The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed)
     */
    public Long getPrinterAttributeId() {
        return _printerAttributeId;
    }

    /**
     * [set] PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE} <br>
     * プリンタ属性ID
     * @param printerAttributeId The value of the column 'PRINTER_ATTRIBUTE_ID'. (NullAllowed)
     */
    public void setPrinterAttributeId(Long printerAttributeId) {
        __modifiedProperties.add("printerAttributeId");
        this._printerAttributeId = printerAttributeId;
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
