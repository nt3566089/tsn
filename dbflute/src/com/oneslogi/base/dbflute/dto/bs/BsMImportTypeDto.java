package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_IMPORT_TYPE as TABLE. <br>
 * 取込種別マスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_ID
 *
 * [column]
 *     IMPORT_TYPE_ID, CLIENT_ID, IMPORT_TYPE_CD, IMPORT_TYPE_NM, EDI_ID, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DUPLICATE_COLUMN_NM, RCV_ID_COLUMN_NM, ROW_NO_COLUMN_NM, GIFT_STATEMENT_TYPE, GIFT_STATEMENT_DETAIL, O_KEEPING_DAYS, STATEMENT_TITLE, STATEMENT_URL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_EDI, B_CLASS_DTL(ByGiftStatementType)
 *
 * [referrer-table]
 *     M_IMPORT_TYPE_B, T_EC_ORDER_H
 *
 * [foreign-property]
 *     mClient, mEdi, bClassDtlByGiftStatementType, bClassDtlByLineFeedCd, bClassDtlByUploadTableNm
 *
 * [referrer-property]
 *     mImportTypeBList, tEcOrderHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMImportTypeDto implements Serializable {

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
    /** IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _importTypeId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _importTypeCd;

    /** IMPORT_TYPE_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _importTypeNm;

    /** EDI_ID: {IX, bigint(19), FK to M_EDI} */
    @JsonKey
    protected Long _ediId;

    /** CHARACTER_CD: {varchar(30)} */
    @JsonKey
    protected String _characterCd;

    /** LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} */
    @JsonKey
    protected String _lineFeedCd;

    /** DELIMITER: {varchar(30)} */
    @JsonKey
    protected String _delimiter;

    /** SKIPPING_ROWS: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _skippingRows;

    /** UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} */
    @JsonKey
    protected String _uploadTableNm;

    /** DUPLICATE_COLUMN_NM: {varchar(30)} */
    @JsonKey
    protected String _duplicateColumnNm;

    /** RCV_ID_COLUMN_NM: {varchar(30)} */
    @JsonKey
    protected String _rcvIdColumnNm;

    /** ROW_NO_COLUMN_NM: {varchar(30)} */
    @JsonKey
    protected String _rowNoColumnNm;

    /** GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} */
    @JsonKey
    protected String _giftStatementType;

    /** GIFT_STATEMENT_DETAIL: {varchar(255)} */
    @JsonKey
    protected String _giftStatementDetail;

    /** O_KEEPING_DAYS: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _oKeepingDays;

    /** STATEMENT_TITLE: {varchar(255)} */
    @JsonKey
    protected String _statementTitle;

    /** STATEMENT_URL: {varchar(255)} */
    @JsonKey
    protected String _statementUrl;

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
    public BsMImportTypeDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MEdiDto _mEdi;

    public MEdiDto getMEdi() {
        return _mEdi;
    }

    public void setMEdi(MEdiDto mEdi) {
        this._mEdi = mEdi;
    }

    protected BClassDtlDto _bClassDtlByGiftStatementType;

    public BClassDtlDto getBClassDtlByGiftStatementType() {
        return _bClassDtlByGiftStatementType;
    }

    public void setBClassDtlByGiftStatementType(BClassDtlDto bClassDtlByGiftStatementType) {
        this._bClassDtlByGiftStatementType = bClassDtlByGiftStatementType;
    }

    protected BClassDtlDto _bClassDtlByLineFeedCd;

    public BClassDtlDto getBClassDtlByLineFeedCd() {
        return _bClassDtlByLineFeedCd;
    }

    public void setBClassDtlByLineFeedCd(BClassDtlDto bClassDtlByLineFeedCd) {
        this._bClassDtlByLineFeedCd = bClassDtlByLineFeedCd;
    }

    protected BClassDtlDto _bClassDtlByUploadTableNm;

    public BClassDtlDto getBClassDtlByUploadTableNm() {
        return _bClassDtlByUploadTableNm;
    }

    public void setBClassDtlByUploadTableNm(BClassDtlDto bClassDtlByUploadTableNm) {
        this._bClassDtlByUploadTableNm = bClassDtlByUploadTableNm;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MImportTypeBDto> _mImportTypeBList;

    public List<MImportTypeBDto> getMImportTypeBList() {
        if (_mImportTypeBList == null) { _mImportTypeBList = new ArrayList<MImportTypeBDto>(); }
        return _mImportTypeBList;
    }

    public void setMImportTypeBList(List<MImportTypeBDto> mImportTypeBList) {
        this._mImportTypeBList = mImportTypeBList;
    }

    protected List<TEcOrderHDto> _tEcOrderHList;

    public List<TEcOrderHDto> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = new ArrayList<TEcOrderHDto>(); }
        return _tEcOrderHList;
    }

    public void setTEcOrderHList(List<TEcOrderHDto> tEcOrderHList) {
        this._tEcOrderHList = tEcOrderHList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMImportTypeDto)) { return false; }
        final BsMImportTypeDto otherEntity = (BsMImportTypeDto)other;
        if (!helpComparingValue(getImportTypeId(), otherEntity.getImportTypeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_IMPORT_TYPE");
        result = xCH(result, getImportTypeId());
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
        sb.append(c).append(getImportTypeId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getImportTypeCd());
        sb.append(c).append(getImportTypeNm());
        sb.append(c).append(getEdiId());
        sb.append(c).append(getCharacterCd());
        sb.append(c).append(getLineFeedCd());
        sb.append(c).append(getDelimiter());
        sb.append(c).append(getSkippingRows());
        sb.append(c).append(getUploadTableNm());
        sb.append(c).append(getDuplicateColumnNm());
        sb.append(c).append(getRcvIdColumnNm());
        sb.append(c).append(getRowNoColumnNm());
        sb.append(c).append(getGiftStatementType());
        sb.append(c).append(getGiftStatementDetail());
        sb.append(c).append(getOKeepingDays());
        sb.append(c).append(getStatementTitle());
        sb.append(c).append(getStatementUrl());
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
     * [get] IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public Long getImportTypeId() {
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed)
     */
    public void setImportTypeId(Long importTypeId) {
        __modifiedProperties.add("importTypeId");
        this._importTypeId = importTypeId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 取込種別CD
     * @return The value of the column 'IMPORT_TYPE_CD'. (NullAllowed)
     */
    public String getImportTypeCd() {
        return _importTypeCd;
    }

    /**
     * [set] IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 取込種別CD
     * @param importTypeCd The value of the column 'IMPORT_TYPE_CD'. (NullAllowed)
     */
    public void setImportTypeCd(String importTypeCd) {
        __modifiedProperties.add("importTypeCd");
        this._importTypeCd = importTypeCd;
    }

    /**
     * [get] IMPORT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 取込種別名称
     * @return The value of the column 'IMPORT_TYPE_NM'. (NullAllowed)
     */
    public String getImportTypeNm() {
        return _importTypeNm;
    }

    /**
     * [set] IMPORT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 取込種別名称
     * @param importTypeNm The value of the column 'IMPORT_TYPE_NM'. (NullAllowed)
     */
    public void setImportTypeNm(String importTypeNm) {
        __modifiedProperties.add("importTypeNm");
        this._importTypeNm = importTypeNm;
    }

    /**
     * [get] EDI_ID: {IX, bigint(19), FK to M_EDI} <br>
     * EDIID
     * @return The value of the column 'EDI_ID'. (NullAllowed)
     */
    public Long getEdiId() {
        return _ediId;
    }

    /**
     * [set] EDI_ID: {IX, bigint(19), FK to M_EDI} <br>
     * EDIID
     * @param ediId The value of the column 'EDI_ID'. (NullAllowed)
     */
    public void setEdiId(Long ediId) {
        __modifiedProperties.add("ediId");
        this._ediId = ediId;
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
     * [get] LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行CD
     * @return The value of the column 'LINE_FEED_CD'. (NullAllowed)
     */
    public String getLineFeedCd() {
        return _lineFeedCd;
    }

    /**
     * [set] LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
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
     * [get] SKIPPING_ROWS: {bigint(19), default=[(0)]} <br>
     * 読み飛ばし行数
     * @return The value of the column 'SKIPPING_ROWS'. (NullAllowed)
     */
    public Long getSkippingRows() {
        return _skippingRows;
    }

    /**
     * [set] SKIPPING_ROWS: {bigint(19), default=[(0)]} <br>
     * 読み飛ばし行数
     * @param skippingRows The value of the column 'SKIPPING_ROWS'. (NullAllowed)
     */
    public void setSkippingRows(Long skippingRows) {
        __modifiedProperties.add("skippingRows");
        this._skippingRows = skippingRows;
    }

    /**
     * [get] UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @return The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed)
     */
    public String getUploadTableNm() {
        return _uploadTableNm;
    }

    /**
     * [set] UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param uploadTableNm The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed)
     */
    public void setUploadTableNm(String uploadTableNm) {
        __modifiedProperties.add("uploadTableNm");
        this._uploadTableNm = uploadTableNm;
    }

    /**
     * [get] DUPLICATE_COLUMN_NM: {varchar(30)} <br>
     * 重複チェック列名
     * @return The value of the column 'DUPLICATE_COLUMN_NM'. (NullAllowed)
     */
    public String getDuplicateColumnNm() {
        return _duplicateColumnNm;
    }

    /**
     * [set] DUPLICATE_COLUMN_NM: {varchar(30)} <br>
     * 重複チェック列名
     * @param duplicateColumnNm The value of the column 'DUPLICATE_COLUMN_NM'. (NullAllowed)
     */
    public void setDuplicateColumnNm(String duplicateColumnNm) {
        __modifiedProperties.add("duplicateColumnNm");
        this._duplicateColumnNm = duplicateColumnNm;
    }

    /**
     * [get] RCV_ID_COLUMN_NM: {varchar(30)} <br>
     * 受信ID列名
     * @return The value of the column 'RCV_ID_COLUMN_NM'. (NullAllowed)
     */
    public String getRcvIdColumnNm() {
        return _rcvIdColumnNm;
    }

    /**
     * [set] RCV_ID_COLUMN_NM: {varchar(30)} <br>
     * 受信ID列名
     * @param rcvIdColumnNm The value of the column 'RCV_ID_COLUMN_NM'. (NullAllowed)
     */
    public void setRcvIdColumnNm(String rcvIdColumnNm) {
        __modifiedProperties.add("rcvIdColumnNm");
        this._rcvIdColumnNm = rcvIdColumnNm;
    }

    /**
     * [get] ROW_NO_COLUMN_NM: {varchar(30)} <br>
     * 行番号列名
     * @return The value of the column 'ROW_NO_COLUMN_NM'. (NullAllowed)
     */
    public String getRowNoColumnNm() {
        return _rowNoColumnNm;
    }

    /**
     * [set] ROW_NO_COLUMN_NM: {varchar(30)} <br>
     * 行番号列名
     * @param rowNoColumnNm The value of the column 'ROW_NO_COLUMN_NM'. (NullAllowed)
     */
    public void setRowNoColumnNm(String rowNoColumnNm) {
        __modifiedProperties.add("rowNoColumnNm");
        this._rowNoColumnNm = rowNoColumnNm;
    }

    /**
     * [get] GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種類
     * @return The value of the column 'GIFT_STATEMENT_TYPE'. (NullAllowed)
     */
    public String getGiftStatementType() {
        return _giftStatementType;
    }

    /**
     * [set] GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種類
     * @param giftStatementType The value of the column 'GIFT_STATEMENT_TYPE'. (NullAllowed)
     */
    public void setGiftStatementType(String giftStatementType) {
        __modifiedProperties.add("giftStatementType");
        this._giftStatementType = giftStatementType;
    }

    /**
     * [get] GIFT_STATEMENT_DETAIL: {varchar(255)} <br>
     * 納品書明細置換え文字列
     * @return The value of the column 'GIFT_STATEMENT_DETAIL'. (NullAllowed)
     */
    public String getGiftStatementDetail() {
        return _giftStatementDetail;
    }

    /**
     * [set] GIFT_STATEMENT_DETAIL: {varchar(255)} <br>
     * 納品書明細置換え文字列
     * @param giftStatementDetail The value of the column 'GIFT_STATEMENT_DETAIL'. (NullAllowed)
     */
    public void setGiftStatementDetail(String giftStatementDetail) {
        __modifiedProperties.add("giftStatementDetail");
        this._giftStatementDetail = giftStatementDetail;
    }

    /**
     * [get] O_KEEPING_DAYS: {NotNull, bigint(19)} <br>
     * 受注保持期間
     * @return The value of the column 'O_KEEPING_DAYS'. (NullAllowed)
     */
    public Long getOKeepingDays() {
        return _oKeepingDays;
    }

    /**
     * [set] O_KEEPING_DAYS: {NotNull, bigint(19)} <br>
     * 受注保持期間
     * @param oKeepingDays The value of the column 'O_KEEPING_DAYS'. (NullAllowed)
     */
    public void setOKeepingDays(Long oKeepingDays) {
        __modifiedProperties.add("OKeepingDays");
        this._oKeepingDays = oKeepingDays;
    }

    /**
     * [get] STATEMENT_TITLE: {varchar(255)} <br>
     * 納品書タイトル
     * @return The value of the column 'STATEMENT_TITLE'. (NullAllowed)
     */
    public String getStatementTitle() {
        return _statementTitle;
    }

    /**
     * [set] STATEMENT_TITLE: {varchar(255)} <br>
     * 納品書タイトル
     * @param statementTitle The value of the column 'STATEMENT_TITLE'. (NullAllowed)
     */
    public void setStatementTitle(String statementTitle) {
        __modifiedProperties.add("statementTitle");
        this._statementTitle = statementTitle;
    }

    /**
     * [get] STATEMENT_URL: {varchar(255)} <br>
     * 納品書記載URL
     * @return The value of the column 'STATEMENT_URL'. (NullAllowed)
     */
    public String getStatementUrl() {
        return _statementUrl;
    }

    /**
     * [set] STATEMENT_URL: {varchar(255)} <br>
     * 納品書記載URL
     * @param statementUrl The value of the column 'STATEMENT_URL'. (NullAllowed)
     */
    public void setStatementUrl(String statementUrl) {
        __modifiedProperties.add("statementUrl");
        this._statementUrl = statementUrl;
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
