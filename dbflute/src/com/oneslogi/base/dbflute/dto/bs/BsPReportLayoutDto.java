package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_REPORT_LAYOUT as TABLE. <br>
 * 帳票レイアウトマスタ
 * <pre>
 * [primary-key]
 *     REPORT_LAYOUT_ID
 *
 * [column]
 *     REPORT_LAYOUT_ID, REPORT_ID, REPORT_LAYOUT_NM, REPORT_LAYOUT_DATA, UPDATABLE, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, AUTO_PRINT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_REPORT, B_CLASS_DTL(ByUpdatable), P_LAYOUT_PRINT_SETTING(AsOne), P_SUBREP_LAYOUT(AsOne)
 *
 * [referrer-table]
 *     P_REPORT_LAYOUT_ITEM, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET, P_LAYOUT_PRINT_SETTING, P_SUBREP_LAYOUT
 *
 * [foreign-property]
 *     pReport, bClassDtlByUpdatable, bClassDtlByAutoPrintTargetFlg, pLayoutPrintSettingAsOne, pSubrepLayoutAsOne
 *
 * [referrer-property]
 *     pReportLayoutItemList, pUserAutoPrintSettingByReportLayoutIdList, pTerminalAutoPrintSetByReportLayoutIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPReportLayoutDto implements Serializable {

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
    /** REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _reportLayoutId;

    /** REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} */
    @JsonKey
    protected Long _reportId;

    /** REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} */
    @JsonKey
    protected String _reportLayoutNm;

    /** REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} */
    @JsonKey
    protected String _reportLayoutData;

    /** UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} */
    @JsonKey
    protected String _updatable;

    /** ATTRIBUTE1: {varchar(100)} */
    @JsonKey
    protected String _attribute1;

    /** ATTRIBUTE2: {varchar(100)} */
    @JsonKey
    protected String _attribute2;

    /** ATTRIBUTE3: {varchar(100)} */
    @JsonKey
    protected String _attribute3;

    /** ATTRIBUTE4: {varchar(100)} */
    @JsonKey
    protected String _attribute4;

    /** ATTRIBUTE5: {varchar(100)} */
    @JsonKey
    protected String _attribute5;

    /** AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} */
    @JsonKey
    protected String _autoPrintTargetFlg;

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
    public BsPReportLayoutDto() {
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
    protected PReportDto _pReport;

    public PReportDto getPReport() {
        return _pReport;
    }

    public void setPReport(PReportDto pReport) {
        this._pReport = pReport;
    }

    protected BClassDtlDto _bClassDtlByUpdatable;

    public BClassDtlDto getBClassDtlByUpdatable() {
        return _bClassDtlByUpdatable;
    }

    public void setBClassDtlByUpdatable(BClassDtlDto bClassDtlByUpdatable) {
        this._bClassDtlByUpdatable = bClassDtlByUpdatable;
    }

    protected BClassDtlDto _bClassDtlByAutoPrintTargetFlg;

    public BClassDtlDto getBClassDtlByAutoPrintTargetFlg() {
        return _bClassDtlByAutoPrintTargetFlg;
    }

    public void setBClassDtlByAutoPrintTargetFlg(BClassDtlDto bClassDtlByAutoPrintTargetFlg) {
        this._bClassDtlByAutoPrintTargetFlg = bClassDtlByAutoPrintTargetFlg;
    }

    protected PLayoutPrintSettingDto _pLayoutPrintSettingAsOne;

    public PLayoutPrintSettingDto getPLayoutPrintSettingAsOne() {
        return _pLayoutPrintSettingAsOne;
    }

    public void setPLayoutPrintSettingAsOne(PLayoutPrintSettingDto PLayoutPrintSettingAsOne) {
        this._pLayoutPrintSettingAsOne = PLayoutPrintSettingAsOne;
    }

    protected PSubrepLayoutDto _pSubrepLayoutAsOne;

    public PSubrepLayoutDto getPSubrepLayoutAsOne() {
        return _pSubrepLayoutAsOne;
    }

    public void setPSubrepLayoutAsOne(PSubrepLayoutDto PSubrepLayoutAsOne) {
        this._pSubrepLayoutAsOne = PSubrepLayoutAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<PReportLayoutItemDto> _pReportLayoutItemList;

    public List<PReportLayoutItemDto> getPReportLayoutItemList() {
        if (_pReportLayoutItemList == null) { _pReportLayoutItemList = new ArrayList<PReportLayoutItemDto>(); }
        return _pReportLayoutItemList;
    }

    public void setPReportLayoutItemList(List<PReportLayoutItemDto> pReportLayoutItemList) {
        this._pReportLayoutItemList = pReportLayoutItemList;
    }

    protected List<PUserAutoPrintSettingDto> _pUserAutoPrintSettingByReportLayoutIdList;

    public List<PUserAutoPrintSettingDto> getPUserAutoPrintSettingByReportLayoutIdList() {
        if (_pUserAutoPrintSettingByReportLayoutIdList == null) { _pUserAutoPrintSettingByReportLayoutIdList = new ArrayList<PUserAutoPrintSettingDto>(); }
        return _pUserAutoPrintSettingByReportLayoutIdList;
    }

    public void setPUserAutoPrintSettingByReportLayoutIdList(List<PUserAutoPrintSettingDto> pUserAutoPrintSettingByReportLayoutIdList) {
        this._pUserAutoPrintSettingByReportLayoutIdList = pUserAutoPrintSettingByReportLayoutIdList;
    }

    protected List<PTerminalAutoPrintSetDto> _pTerminalAutoPrintSetByReportLayoutIdList;

    public List<PTerminalAutoPrintSetDto> getPTerminalAutoPrintSetByReportLayoutIdList() {
        if (_pTerminalAutoPrintSetByReportLayoutIdList == null) { _pTerminalAutoPrintSetByReportLayoutIdList = new ArrayList<PTerminalAutoPrintSetDto>(); }
        return _pTerminalAutoPrintSetByReportLayoutIdList;
    }

    public void setPTerminalAutoPrintSetByReportLayoutIdList(List<PTerminalAutoPrintSetDto> pTerminalAutoPrintSetByReportLayoutIdList) {
        this._pTerminalAutoPrintSetByReportLayoutIdList = pTerminalAutoPrintSetByReportLayoutIdList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPReportLayoutDto)) { return false; }
        final BsPReportLayoutDto otherEntity = (BsPReportLayoutDto)other;
        if (!helpComparingValue(getReportLayoutId(), otherEntity.getReportLayoutId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_REPORT_LAYOUT");
        result = xCH(result, getReportLayoutId());
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
        sb.append(c).append(getReportLayoutId());
        sb.append(c).append(getReportId());
        sb.append(c).append(getReportLayoutNm());
        sb.append(c).append(getReportLayoutData());
        sb.append(c).append(getUpdatable());
        sb.append(c).append(getAttribute1());
        sb.append(c).append(getAttribute2());
        sb.append(c).append(getAttribute3());
        sb.append(c).append(getAttribute4());
        sb.append(c).append(getAttribute5());
        sb.append(c).append(getAutoPrintTargetFlg());
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
     * [get] REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public Long getReportLayoutId() {
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        __modifiedProperties.add("reportLayoutId");
        this._reportLayoutId = reportLayoutId;
    }

    /**
     * [get] REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} <br>
     * 帳票ID
     * @return The value of the column 'REPORT_ID'. (NullAllowed)
     */
    public Long getReportId() {
        return _reportId;
    }

    /**
     * [set] REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT} <br>
     * 帳票ID
     * @param reportId The value of the column 'REPORT_ID'. (NullAllowed)
     */
    public void setReportId(Long reportId) {
        __modifiedProperties.add("reportId");
        this._reportId = reportId;
    }

    /**
     * [get] REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} <br>
     * 帳票レイアウト名称
     * @return The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed)
     */
    public String getReportLayoutNm() {
        return _reportLayoutNm;
    }

    /**
     * [set] REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)} <br>
     * 帳票レイアウト名称
     * @param reportLayoutNm The value of the column 'REPORT_LAYOUT_NM'. (NullAllowed)
     */
    public void setReportLayoutNm(String reportLayoutNm) {
        __modifiedProperties.add("reportLayoutNm");
        this._reportLayoutNm = reportLayoutNm;
    }

    /**
     * [get] REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @return The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed)
     */
    public String getReportLayoutData() {
        return _reportLayoutData;
    }

    /**
     * [set] REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)} <br>
     * 帳票レイアウトデータ
     * @param reportLayoutData The value of the column 'REPORT_LAYOUT_DATA'. (NullAllowed)
     */
    public void setReportLayoutData(String reportLayoutData) {
        __modifiedProperties.add("reportLayoutData");
        this._reportLayoutData = reportLayoutData;
    }

    /**
     * [get] UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @return The value of the column 'UPDATABLE'. (NullAllowed)
     */
    public String getUpdatable() {
        return _updatable;
    }

    /**
     * [set] UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable} <br>
     * 更新可否
     * @param updatable The value of the column 'UPDATABLE'. (NullAllowed)
     */
    public void setUpdatable(String updatable) {
        __modifiedProperties.add("updatable");
        this._updatable = updatable;
    }

    /**
     * [get] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @return The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public String getAttribute1() {
        return _attribute1;
    }

    /**
     * [set] ATTRIBUTE1: {varchar(100)} <br>
     * 属性1
     * @param attribute1 The value of the column 'ATTRIBUTE1'. (NullAllowed)
     */
    public void setAttribute1(String attribute1) {
        __modifiedProperties.add("attribute1");
        this._attribute1 = attribute1;
    }

    /**
     * [get] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @return The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public String getAttribute2() {
        return _attribute2;
    }

    /**
     * [set] ATTRIBUTE2: {varchar(100)} <br>
     * 属性2
     * @param attribute2 The value of the column 'ATTRIBUTE2'. (NullAllowed)
     */
    public void setAttribute2(String attribute2) {
        __modifiedProperties.add("attribute2");
        this._attribute2 = attribute2;
    }

    /**
     * [get] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @return The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public String getAttribute3() {
        return _attribute3;
    }

    /**
     * [set] ATTRIBUTE3: {varchar(100)} <br>
     * 属性3
     * @param attribute3 The value of the column 'ATTRIBUTE3'. (NullAllowed)
     */
    public void setAttribute3(String attribute3) {
        __modifiedProperties.add("attribute3");
        this._attribute3 = attribute3;
    }

    /**
     * [get] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @return The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public String getAttribute4() {
        return _attribute4;
    }

    /**
     * [set] ATTRIBUTE4: {varchar(100)} <br>
     * 属性4
     * @param attribute4 The value of the column 'ATTRIBUTE4'. (NullAllowed)
     */
    public void setAttribute4(String attribute4) {
        __modifiedProperties.add("attribute4");
        this._attribute4 = attribute4;
    }

    /**
     * [get] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @return The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public String getAttribute5() {
        return _attribute5;
    }

    /**
     * [set] ATTRIBUTE5: {varchar(100)} <br>
     * 属性5
     * @param attribute5 The value of the column 'ATTRIBUTE5'. (NullAllowed)
     */
    public void setAttribute5(String attribute5) {
        __modifiedProperties.add("attribute5");
        this._attribute5 = attribute5;
    }

    /**
     * [get] AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @return The value of the column 'AUTO_PRINT_TARGET_FLG'. (NullAllowed)
     */
    public String getAutoPrintTargetFlg() {
        return _autoPrintTargetFlg;
    }

    /**
     * [set] AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg} <br>
     * 自動印刷対象フラグ
     * @param autoPrintTargetFlg The value of the column 'AUTO_PRINT_TARGET_FLG'. (NullAllowed)
     */
    public void setAutoPrintTargetFlg(String autoPrintTargetFlg) {
        __modifiedProperties.add("autoPrintTargetFlg");
        this._autoPrintTargetFlg = autoPrintTargetFlg;
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
