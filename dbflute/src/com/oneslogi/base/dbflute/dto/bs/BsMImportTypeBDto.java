package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_IMPORT_TYPE_B as TABLE. <br>
 * 取込種別ボディマスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_B_ID
 *
 * [column]
 *     IMPORT_TYPE_B_ID, IMPORT_TYPE_ID, COLUMN_NO, EDI_COLUMN_ID, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_IMPORT_TYPE, M_EDI_COLUMN
 *
 * [referrer-table]
 *     M_IMPORT_TYPE_B_COPY_B, M_IMPORT_TYPE_B_COPY_H
 *
 * [foreign-property]
 *     mImportType, mEdiColumn
 *
 * [referrer-property]
 *     mImportTypeBCopyBList, mImportTypeBCopyHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMImportTypeBDto implements Serializable {

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
    /** IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _importTypeBId;

    /** IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} */
    @JsonKey
    protected Long _importTypeId;

    /** COLUMN_NO: {bigint(19)} */
    @JsonKey
    protected Long _columnNo;

    /** EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN} */
    @JsonKey
    protected Long _ediColumnId;

    /** UPLOAD_COLUMN_NM: {varchar(100)} */
    @JsonKey
    protected String _uploadColumnNm;

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
    public BsMImportTypeBDto() {
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
    protected MImportTypeDto _mImportType;

    public MImportTypeDto getMImportType() {
        return _mImportType;
    }

    public void setMImportType(MImportTypeDto mImportType) {
        this._mImportType = mImportType;
    }

    protected MEdiColumnDto _mEdiColumn;

    public MEdiColumnDto getMEdiColumn() {
        return _mEdiColumn;
    }

    public void setMEdiColumn(MEdiColumnDto mEdiColumn) {
        this._mEdiColumn = mEdiColumn;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MImportTypeBCopyBDto> _mImportTypeBCopyBList;

    public List<MImportTypeBCopyBDto> getMImportTypeBCopyBList() {
        if (_mImportTypeBCopyBList == null) { _mImportTypeBCopyBList = new ArrayList<MImportTypeBCopyBDto>(); }
        return _mImportTypeBCopyBList;
    }

    public void setMImportTypeBCopyBList(List<MImportTypeBCopyBDto> mImportTypeBCopyBList) {
        this._mImportTypeBCopyBList = mImportTypeBCopyBList;
    }

    protected List<MImportTypeBCopyHDto> _mImportTypeBCopyHList;

    public List<MImportTypeBCopyHDto> getMImportTypeBCopyHList() {
        if (_mImportTypeBCopyHList == null) { _mImportTypeBCopyHList = new ArrayList<MImportTypeBCopyHDto>(); }
        return _mImportTypeBCopyHList;
    }

    public void setMImportTypeBCopyHList(List<MImportTypeBCopyHDto> mImportTypeBCopyHList) {
        this._mImportTypeBCopyHList = mImportTypeBCopyHList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMImportTypeBDto)) { return false; }
        final BsMImportTypeBDto otherEntity = (BsMImportTypeBDto)other;
        if (!helpComparingValue(getImportTypeBId(), otherEntity.getImportTypeBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_IMPORT_TYPE_B");
        result = xCH(result, getImportTypeBId());
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
        sb.append(c).append(getImportTypeBId());
        sb.append(c).append(getImportTypeId());
        sb.append(c).append(getColumnNo());
        sb.append(c).append(getEdiColumnId());
        sb.append(c).append(getUploadColumnNm());
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
     * [get] IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ボディID
     * @return The value of the column 'IMPORT_TYPE_B_ID'. (NullAllowed)
     */
    public Long getImportTypeBId() {
        return _importTypeBId;
    }

    /**
     * [set] IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ボディID
     * @param importTypeBId The value of the column 'IMPORT_TYPE_B_ID'. (NullAllowed)
     */
    public void setImportTypeBId(Long importTypeBId) {
        __modifiedProperties.add("importTypeBId");
        this._importTypeBId = importTypeBId;
    }

    /**
     * [get] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public Long getImportTypeId() {
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public void setImportTypeId(Long importTypeId) {
        __modifiedProperties.add("importTypeId");
        this._importTypeId = importTypeId;
    }

    /**
     * [get] COLUMN_NO: {bigint(19)} <br>
     * 列番号
     * @return The value of the column 'COLUMN_NO'. (NullAllowed)
     */
    public Long getColumnNo() {
        return _columnNo;
    }

    /**
     * [set] COLUMN_NO: {bigint(19)} <br>
     * 列番号
     * @param columnNo The value of the column 'COLUMN_NO'. (NullAllowed)
     */
    public void setColumnNo(Long columnNo) {
        __modifiedProperties.add("columnNo");
        this._columnNo = columnNo;
    }

    /**
     * [get] EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN} <br>
     * EDI項目ID
     * @return The value of the column 'EDI_COLUMN_ID'. (NullAllowed)
     */
    public Long getEdiColumnId() {
        return _ediColumnId;
    }

    /**
     * [set] EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN} <br>
     * EDI項目ID
     * @param ediColumnId The value of the column 'EDI_COLUMN_ID'. (NullAllowed)
     */
    public void setEdiColumnId(Long ediColumnId) {
        __modifiedProperties.add("ediColumnId");
        this._ediColumnId = ediColumnId;
    }

    /**
     * [get] UPLOAD_COLUMN_NM: {varchar(100)} <br>
     * アップロード列名
     * @return The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed)
     */
    public String getUploadColumnNm() {
        return _uploadColumnNm;
    }

    /**
     * [set] UPLOAD_COLUMN_NM: {varchar(100)} <br>
     * アップロード列名
     * @param uploadColumnNm The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed)
     */
    public void setUploadColumnNm(String uploadColumnNm) {
        __modifiedProperties.add("uploadColumnNm");
        this._uploadColumnNm = uploadColumnNm;
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
