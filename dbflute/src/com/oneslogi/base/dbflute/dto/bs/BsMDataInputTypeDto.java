package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_DATA_INPUT_TYPE as TABLE. <br>
 * 初期データ取込種別マスタ
 * <pre>
 * [primary-key]
 *     DATA_INPUT_TYPE_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_ID, DATA_INPUT_TYPE_CD, DATA_INPUT_TYPE_NM, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByDataInputTypeCd)
 *
 * [referrer-table]
 *     M_DATA_INPUT_TYPE_B
 *
 * [foreign-property]
 *     bClassDtlByDataInputTypeCd
 *
 * [referrer-property]
 *     mDataInputTypeBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMDataInputTypeDto implements Serializable {

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
    /** DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _dataInputTypeId;

    /** DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} */
    @JsonKey
    protected String _dataInputTypeCd;

    /** DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _dataInputTypeNm;

    /** CHARACTER_CD: {varchar(30)} */
    @JsonKey
    protected String _characterCd;

    /** LINE_FEED_CD: {varchar(30)} */
    @JsonKey
    protected String _lineFeedCd;

    /** DELIMITER: {varchar(30)} */
    @JsonKey
    protected String _delimiter;

    /** SKIPPING_ROWS: {bigint(19)} */
    @JsonKey
    protected Long _skippingRows;

    /** UPLOAD_TABLE_NM: {NotNull, varchar(100)} */
    @JsonKey
    protected String _uploadTableNm;

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
    public BsMDataInputTypeDto() {
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
    protected BClassDtlDto _bClassDtlByDataInputTypeCd;

    public BClassDtlDto getBClassDtlByDataInputTypeCd() {
        return _bClassDtlByDataInputTypeCd;
    }

    public void setBClassDtlByDataInputTypeCd(BClassDtlDto bClassDtlByDataInputTypeCd) {
        this._bClassDtlByDataInputTypeCd = bClassDtlByDataInputTypeCd;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MDataInputTypeBDto> _mDataInputTypeBList;

    public List<MDataInputTypeBDto> getMDataInputTypeBList() {
        if (_mDataInputTypeBList == null) { _mDataInputTypeBList = new ArrayList<MDataInputTypeBDto>(); }
        return _mDataInputTypeBList;
    }

    public void setMDataInputTypeBList(List<MDataInputTypeBDto> mDataInputTypeBList) {
        this._mDataInputTypeBList = mDataInputTypeBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMDataInputTypeDto)) { return false; }
        final BsMDataInputTypeDto otherEntity = (BsMDataInputTypeDto)other;
        if (!helpComparingValue(getDataInputTypeId(), otherEntity.getDataInputTypeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_DATA_INPUT_TYPE");
        result = xCH(result, getDataInputTypeId());
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
        sb.append(c).append(getDataInputTypeId());
        sb.append(c).append(getDataInputTypeCd());
        sb.append(c).append(getDataInputTypeNm());
        sb.append(c).append(getCharacterCd());
        sb.append(c).append(getLineFeedCd());
        sb.append(c).append(getDelimiter());
        sb.append(c).append(getSkippingRows());
        sb.append(c).append(getUploadTableNm());
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
     * [get] DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 初期データ取込種別ID
     * @return The value of the column 'DATA_INPUT_TYPE_ID'. (NullAllowed)
     */
    public Long getDataInputTypeId() {
        return _dataInputTypeId;
    }

    /**
     * [set] DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 初期データ取込種別ID
     * @param dataInputTypeId The value of the column 'DATA_INPUT_TYPE_ID'. (NullAllowed)
     */
    public void setDataInputTypeId(Long dataInputTypeId) {
        __modifiedProperties.add("dataInputTypeId");
        this._dataInputTypeId = dataInputTypeId;
    }

    /**
     * [get] DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 初期データ取込種別CD
     * @return The value of the column 'DATA_INPUT_TYPE_CD'. (NullAllowed)
     */
    public String getDataInputTypeCd() {
        return _dataInputTypeCd;
    }

    /**
     * [set] DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 初期データ取込種別CD
     * @param dataInputTypeCd The value of the column 'DATA_INPUT_TYPE_CD'. (NullAllowed)
     */
    public void setDataInputTypeCd(String dataInputTypeCd) {
        __modifiedProperties.add("dataInputTypeCd");
        this._dataInputTypeCd = dataInputTypeCd;
    }

    /**
     * [get] DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 初期データ取込種別名称
     * @return The value of the column 'DATA_INPUT_TYPE_NM'. (NullAllowed)
     */
    public String getDataInputTypeNm() {
        return _dataInputTypeNm;
    }

    /**
     * [set] DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 初期データ取込種別名称
     * @param dataInputTypeNm The value of the column 'DATA_INPUT_TYPE_NM'. (NullAllowed)
     */
    public void setDataInputTypeNm(String dataInputTypeNm) {
        __modifiedProperties.add("dataInputTypeNm");
        this._dataInputTypeNm = dataInputTypeNm;
    }

    /**
     * [get] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @return The value of the column 'CHARACTER_CD'. (NullAllowed)
     */
    public String getCharacterCd() {
        return _characterCd;
    }

    /**
     * [set] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @param characterCd The value of the column 'CHARACTER_CD'. (NullAllowed)
     */
    public void setCharacterCd(String characterCd) {
        __modifiedProperties.add("characterCd");
        this._characterCd = characterCd;
    }

    /**
     * [get] LINE_FEED_CD: {varchar(30)} <br>
     * 改行CD
     * @return The value of the column 'LINE_FEED_CD'. (NullAllowed)
     */
    public String getLineFeedCd() {
        return _lineFeedCd;
    }

    /**
     * [set] LINE_FEED_CD: {varchar(30)} <br>
     * 改行CD
     * @param lineFeedCd The value of the column 'LINE_FEED_CD'. (NullAllowed)
     */
    public void setLineFeedCd(String lineFeedCd) {
        __modifiedProperties.add("lineFeedCd");
        this._lineFeedCd = lineFeedCd;
    }

    /**
     * [get] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @return The value of the column 'DELIMITER'. (NullAllowed)
     */
    public String getDelimiter() {
        return _delimiter;
    }

    /**
     * [set] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @param delimiter The value of the column 'DELIMITER'. (NullAllowed)
     */
    public void setDelimiter(String delimiter) {
        __modifiedProperties.add("delimiter");
        this._delimiter = delimiter;
    }

    /**
     * [get] SKIPPING_ROWS: {bigint(19)} <br>
     * 読み飛ばし行数
     * @return The value of the column 'SKIPPING_ROWS'. (NullAllowed)
     */
    public Long getSkippingRows() {
        return _skippingRows;
    }

    /**
     * [set] SKIPPING_ROWS: {bigint(19)} <br>
     * 読み飛ばし行数
     * @param skippingRows The value of the column 'SKIPPING_ROWS'. (NullAllowed)
     */
    public void setSkippingRows(Long skippingRows) {
        __modifiedProperties.add("skippingRows");
        this._skippingRows = skippingRows;
    }

    /**
     * [get] UPLOAD_TABLE_NM: {NotNull, varchar(100)} <br>
     * アップロードテーブル名
     * @return The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed)
     */
    public String getUploadTableNm() {
        return _uploadTableNm;
    }

    /**
     * [set] UPLOAD_TABLE_NM: {NotNull, varchar(100)} <br>
     * アップロードテーブル名
     * @param uploadTableNm The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed)
     */
    public void setUploadTableNm(String uploadTableNm) {
        __modifiedProperties.add("uploadTableNm");
        this._uploadTableNm = uploadTableNm;
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
