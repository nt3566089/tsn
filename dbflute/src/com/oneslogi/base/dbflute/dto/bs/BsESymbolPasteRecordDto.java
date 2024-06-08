package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SYMBOL_PASTE_RECORD as TABLE. <br>
 * シンボル貼付実績受信テーブル
 * <pre>
 * [primary-key]
 *     E_SYMBOL_PASTE_RECORD_ID
 *
 * [column]
 *     E_SYMBOL_PASTE_RECORD_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, RCV_KEY, PRODUCT_CD, FIRMTRANSPORT_NO, MANUFACTUR_DATE, PRINTER_NO, MAKE_NO, DESIGN_CD, STOCK_TYPE, MAKER_CASE_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_SYMBOL_PASTE_RECORD_ID
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
public abstract class BsESymbolPasteRecordDto implements Serializable {

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
    /** E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _eSymbolPasteRecordId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** RCV_KEY: {varchar(255)} */
    @JsonKey
    protected String _rcvKey;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** FIRMTRANSPORT_NO: {varchar(255)} */
    @JsonKey
    protected String _firmtransportNo;

    /** MANUFACTUR_DATE: {varchar(255)} */
    @JsonKey
    protected String _manufacturDate;

    /** PRINTER_NO: {varchar(255)} */
    @JsonKey
    protected String _printerNo;

    /** MAKE_NO: {varchar(255)} */
    @JsonKey
    protected String _makeNo;

    /** DESIGN_CD: {varchar(255)} */
    @JsonKey
    protected String _designCd;

    /** STOCK_TYPE: {varchar(255)} */
    @JsonKey
    protected String _stockType;

    /** MAKER_CASE_NO: {varchar(255)} */
    @JsonKey
    protected String _makerCaseNo;

    /** DEL_FLG: {char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {bigint(19), default=[(0)]} */
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
    public BsESymbolPasteRecordDto() {
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
        if (other == null || !(other instanceof BsESymbolPasteRecordDto)) { return false; }
        final BsESymbolPasteRecordDto otherEntity = (BsESymbolPasteRecordDto)other;
        if (!helpComparingValue(getESymbolPasteRecordId(), otherEntity.getESymbolPasteRecordId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SYMBOL_PASTE_RECORD");
        result = xCH(result, getESymbolPasteRecordId());
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
        sb.append(c).append(getESymbolPasteRecordId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getRcvKey());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getFirmtransportNo());
        sb.append(c).append(getManufacturDate());
        sb.append(c).append(getPrinterNo());
        sb.append(c).append(getMakeNo());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getStockType());
        sb.append(c).append(getMakerCaseNo());
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
     * [get] E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * シンボル貼付実績受信ID
     * @return The value of the column 'E_SYMBOL_PASTE_RECORD_ID'. (NullAllowed)
     */
    public Long getESymbolPasteRecordId() {
        return _eSymbolPasteRecordId;
    }

    /**
     * [set] E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * シンボル貼付実績受信ID
     * @param eSymbolPasteRecordId The value of the column 'E_SYMBOL_PASTE_RECORD_ID'. (NullAllowed)
     */
    public void setESymbolPasteRecordId(Long eSymbolPasteRecordId) {
        __modifiedProperties.add("ESymbolPasteRecordId");
        this._eSymbolPasteRecordId = eSymbolPasteRecordId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public String getRcvKey() {
        return _rcvKey;
    }

    /**
     * [set] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public void setRcvKey(String rcvKey) {
        __modifiedProperties.add("rcvKey");
        this._rcvKey = rcvKey;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed)
     */
    public String getFirmtransportNo() {
        return _firmtransportNo;
    }

    /**
     * [set] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmtransportNo The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed)
     */
    public void setFirmtransportNo(String firmtransportNo) {
        __modifiedProperties.add("firmtransportNo");
        this._firmtransportNo = firmtransportNo;
    }

    /**
     * [get] MANUFACTUR_DATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUR_DATE'. (NullAllowed)
     */
    public String getManufacturDate() {
        return _manufacturDate;
    }

    /**
     * [set] MANUFACTUR_DATE: {varchar(255)} <br>
     * 製造年月日
     * @param manufacturDate The value of the column 'MANUFACTUR_DATE'. (NullAllowed)
     */
    public void setManufacturDate(String manufacturDate) {
        __modifiedProperties.add("manufacturDate");
        this._manufacturDate = manufacturDate;
    }

    /**
     * [get] PRINTER_NO: {varchar(255)} <br>
     * 印刷機番号
     * @return The value of the column 'PRINTER_NO'. (NullAllowed)
     */
    public String getPrinterNo() {
        return _printerNo;
    }

    /**
     * [set] PRINTER_NO: {varchar(255)} <br>
     * 印刷機番号
     * @param printerNo The value of the column 'PRINTER_NO'. (NullAllowed)
     */
    public void setPrinterNo(String printerNo) {
        __modifiedProperties.add("printerNo");
        this._printerNo = printerNo;
    }

    /**
     * [get] MAKE_NO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'MAKE_NO'. (NullAllowed)
     */
    public String getMakeNo() {
        return _makeNo;
    }

    /**
     * [set] MAKE_NO: {varchar(255)} <br>
     * 生出番号
     * @param makeNo The value of the column 'MAKE_NO'. (NullAllowed)
     */
    public void setMakeNo(String makeNo) {
        __modifiedProperties.add("makeNo");
        this._makeNo = makeNo;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public String getDesignCd() {
        return _designCd;
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public void setDesignCd(String designCd) {
        __modifiedProperties.add("designCd");
        this._designCd = designCd;
    }

    /**
     * [get] STOCK_TYPE: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'STOCK_TYPE'. (NullAllowed)
     */
    public String getStockType() {
        return _stockType;
    }

    /**
     * [set] STOCK_TYPE: {varchar(255)} <br>
     * 在庫区分
     * @param stockType The value of the column 'STOCK_TYPE'. (NullAllowed)
     */
    public void setStockType(String stockType) {
        __modifiedProperties.add("stockType");
        this._stockType = stockType;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public String getMakerCaseNo() {
        return _makerCaseNo;
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        __modifiedProperties.add("makerCaseNo");
        this._makerCaseNo = makerCaseNo;
    }

    /**
     * [get] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19), default=[(0)]} <br>
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
