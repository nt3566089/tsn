package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_PRINT_REQUEST_BINARY as TABLE. <br>
 * 印刷データ情報(バイナリファイル)
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_BINARY_ID
 *
 * [column]
 *     PRINT_REQUEST_BINARY_ID, PRINT_REQUEST_ID, SRC_FILE_INDEX, REPORT_BINARY, PRINT_CUSTOM_RANGE_FLG, PRINT_FIRST_PAGE, PRINT_LAST_PAGE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_BINARY_ID
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
public abstract class BsPPrintRequestBinaryDto implements Serializable {

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
    /** PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printRequestBinaryId;

    /** PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST} */
    @JsonKey
    protected Long _printRequestId;

    /** SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _srcFileIndex;

    /** REPORT_BINARY: {varbinary(2147483647)} */
    @JsonKey
    protected byte[] _reportBinary;

    /** PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _printCustomRangeFlg;

    /** PRINT_FIRST_PAGE: {bigint(19)} */
    @JsonKey
    protected Long _printFirstPage;

    /** PRINT_LAST_PAGE: {bigint(19)} */
    @JsonKey
    protected Long _printLastPage;

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
    public BsPPrintRequestBinaryDto() {
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
        if (other == null || !(other instanceof BsPPrintRequestBinaryDto)) { return false; }
        final BsPPrintRequestBinaryDto otherEntity = (BsPPrintRequestBinaryDto)other;
        if (!helpComparingValue(getPrintRequestBinaryId(), otherEntity.getPrintRequestBinaryId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_PRINT_REQUEST_BINARY");
        result = xCH(result, getPrintRequestBinaryId());
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
        sb.append(c).append(getPrintRequestBinaryId());
        sb.append(c).append(getPrintRequestId());
        sb.append(c).append(getSrcFileIndex());
        sb.append(c).append(xfBA(getReportBinary()));
        sb.append(c).append(getPrintCustomRangeFlg());
        sb.append(c).append(getPrintFirstPage());
        sb.append(c).append(getPrintLastPage());
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
     * [get] PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷データ情報(バイナリ)ID
     * @return The value of the column 'PRINT_REQUEST_BINARY_ID'. (NullAllowed)
     */
    public Long getPrintRequestBinaryId() {
        return _printRequestBinaryId;
    }

    /**
     * [set] PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷データ情報(バイナリ)ID
     * @param printRequestBinaryId The value of the column 'PRINT_REQUEST_BINARY_ID'. (NullAllowed)
     */
    public void setPrintRequestBinaryId(Long printRequestBinaryId) {
        __modifiedProperties.add("printRequestBinaryId");
        this._printRequestBinaryId = printRequestBinaryId;
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
     * [get] SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} <br>
     * ファイル番号
     * @return The value of the column 'SRC_FILE_INDEX'. (NullAllowed)
     */
    public Long getSrcFileIndex() {
        return _srcFileIndex;
    }

    /**
     * [set] SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)} <br>
     * ファイル番号
     * @param srcFileIndex The value of the column 'SRC_FILE_INDEX'. (NullAllowed)
     */
    public void setSrcFileIndex(Long srcFileIndex) {
        __modifiedProperties.add("srcFileIndex");
        this._srcFileIndex = srcFileIndex;
    }

    /**
     * [get] REPORT_BINARY: {varbinary(2147483647)} <br>
     * 帳票バイナリデータ
     * @return The value of the column 'REPORT_BINARY'. (NullAllowed)
     */
    public byte[] getReportBinary() {
        return _reportBinary;
    }

    /**
     * [set] REPORT_BINARY: {varbinary(2147483647)} <br>
     * 帳票バイナリデータ
     * @param reportBinary The value of the column 'REPORT_BINARY'. (NullAllowed)
     */
    public void setReportBinary(byte[] reportBinary) {
        __modifiedProperties.add("reportBinary");
        this._reportBinary = reportBinary;
    }

    /**
     * [get] PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} <br>
     * ページ指定印刷有無
     * @return The value of the column 'PRINT_CUSTOM_RANGE_FLG'. (NullAllowed)
     */
    public String getPrintCustomRangeFlg() {
        return _printCustomRangeFlg;
    }

    /**
     * [set] PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)} <br>
     * ページ指定印刷有無
     * @param printCustomRangeFlg The value of the column 'PRINT_CUSTOM_RANGE_FLG'. (NullAllowed)
     */
    public void setPrintCustomRangeFlg(String printCustomRangeFlg) {
        __modifiedProperties.add("printCustomRangeFlg");
        this._printCustomRangeFlg = printCustomRangeFlg;
    }

    /**
     * [get] PRINT_FIRST_PAGE: {bigint(19)} <br>
     * 印刷開始ページ
     * @return The value of the column 'PRINT_FIRST_PAGE'. (NullAllowed)
     */
    public Long getPrintFirstPage() {
        return _printFirstPage;
    }

    /**
     * [set] PRINT_FIRST_PAGE: {bigint(19)} <br>
     * 印刷開始ページ
     * @param printFirstPage The value of the column 'PRINT_FIRST_PAGE'. (NullAllowed)
     */
    public void setPrintFirstPage(Long printFirstPage) {
        __modifiedProperties.add("printFirstPage");
        this._printFirstPage = printFirstPage;
    }

    /**
     * [get] PRINT_LAST_PAGE: {bigint(19)} <br>
     * 印刷終了ページ
     * @return The value of the column 'PRINT_LAST_PAGE'. (NullAllowed)
     */
    public Long getPrintLastPage() {
        return _printLastPage;
    }

    /**
     * [set] PRINT_LAST_PAGE: {bigint(19)} <br>
     * 印刷終了ページ
     * @param printLastPage The value of the column 'PRINT_LAST_PAGE'. (NullAllowed)
     */
    public void setPrintLastPage(Long printLastPage) {
        __modifiedProperties.add("printLastPage");
        this._printLastPage = printLastPage;
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
