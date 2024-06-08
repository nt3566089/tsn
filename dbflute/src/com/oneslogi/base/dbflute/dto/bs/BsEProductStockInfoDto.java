package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRODUCT_STOCK_INFO as TABLE. <br>
 * 製品在庫情報送信テーブル
 * <pre>
 * [primary-key]
 *     E_PRODUCT_STOCK_INFO_ID
 *
 * [column]
 *     E_PRODUCT_STOCK_INFO_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_ID, CLIENT_ID, SEQ, IN_OUT_KBN, CENTER_CD, CENTER_NM, EXECUTE_DATE, PRODUCT_CD, PRODUCT_NM, STOCK_LOCATION, STOCK_LOCATION_NM, MANUFACTURE_DATE, DESIGN_KBN, LOCATION_CD, TRANSPORT_CD, FIRM_CARRY_NO, SOURCE_CD, SOURCE_NM, SCH_DATE, RCV_DATE, P_TDAY_TOTAL_DIFF_QTY, P_QTY, P_INVENTORY_NUM, P_YDAY_TOTAL_DIFF_QTY, P_TDAY_DIFF_QTY, SL_YDAY_TOTAL_DIFF_QTY, SL_TDAY_DIFF_QTY, QTY, INVENTORY_NUM, USER_USE4, LOT_ATRB1_TITLE, USER_NUM4, USER_NUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_PRODUCT_STOCK_INFO_ID
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
public abstract class BsEProductStockInfoDto implements Serializable {

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
    /** E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _eProductStockInfoId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** SEQ: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _seq;

    /** IN_OUT_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inOutKbn;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** EXECUTE_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _executeDate;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _productNm;

    /** STOCK_LOCATION: {NotNull, varchar(30)} */
    @JsonKey
    protected String _stockLocation;

    /** STOCK_LOCATION_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _stockLocationNm;

    /** MANUFACTURE_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _manufactureDate;

    /** DESIGN_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designKbn;

    /** LOCATION_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** TRANSPORT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _transportCd;

    /** FIRM_CARRY_NO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _firmCarryNo;

    /** SOURCE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sourceCd;

    /** SOURCE_NM: {NotNull, varchar(60)} */
    @JsonKey
    protected String _sourceNm;

    /** SCH_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _schDate;

    /** RCV_DATE: {NotNull, varchar(14)} */
    @JsonKey
    protected String _rcvDate;

    /** P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pTdayTotalDiffQty;

    /** P_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pQty;

    /** P_INVENTORY_NUM: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pInventoryNum;

    /** P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pYdayTotalDiffQty;

    /** P_TDAY_DIFF_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pTdayDiffQty;

    /** SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _slYdayTotalDiffQty;

    /** SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _slTdayDiffQty;

    /** QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qty;

    /** INVENTORY_NUM: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _inventoryNum;

    /** USER_USE4: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userUse4;

    /** LOT_ATRB1_TITLE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _lotAtrb1Title;

    /** USER_NUM4: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userNum4;

    /** USER_NUM3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userNum3;

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
    public BsEProductStockInfoDto() {
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
        if (other == null || !(other instanceof BsEProductStockInfoDto)) { return false; }
        final BsEProductStockInfoDto otherEntity = (BsEProductStockInfoDto)other;
        if (!helpComparingValue(getEProductStockInfoId(), otherEntity.getEProductStockInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRODUCT_STOCK_INFO");
        result = xCH(result, getEProductStockInfoId());
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
        sb.append(c).append(getEProductStockInfoId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getSeq());
        sb.append(c).append(getInOutKbn());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getExecuteDate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getStockLocation());
        sb.append(c).append(getStockLocationNm());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getDesignKbn());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getTransportCd());
        sb.append(c).append(getFirmCarryNo());
        sb.append(c).append(getSourceCd());
        sb.append(c).append(getSourceNm());
        sb.append(c).append(getSchDate());
        sb.append(c).append(getRcvDate());
        sb.append(c).append(getPTdayTotalDiffQty());
        sb.append(c).append(getPQty());
        sb.append(c).append(getPInventoryNum());
        sb.append(c).append(getPYdayTotalDiffQty());
        sb.append(c).append(getPTdayDiffQty());
        sb.append(c).append(getSlYdayTotalDiffQty());
        sb.append(c).append(getSlTdayDiffQty());
        sb.append(c).append(getQty());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getUserUse4());
        sb.append(c).append(getLotAtrb1Title());
        sb.append(c).append(getUserNum4());
        sb.append(c).append(getUserNum3());
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
     * [get] E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品在庫情報送信テーブルID
     * @return The value of the column 'E_PRODUCT_STOCK_INFO_ID'. (NullAllowed)
     */
    public Long getEProductStockInfoId() {
        return _eProductStockInfoId;
    }

    /**
     * [set] E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品在庫情報送信テーブルID
     * @param eProductStockInfoId The value of the column 'E_PRODUCT_STOCK_INFO_ID'. (NullAllowed)
     */
    public void setEProductStockInfoId(Long eProductStockInfoId) {
        __modifiedProperties.add("EProductStockInfoId");
        this._eProductStockInfoId = eProductStockInfoId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
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
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] SEQ: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQ'. (NullAllowed)
     */
    public Long getSeq() {
        return _seq;
    }

    /**
     * [set] SEQ: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @param seq The value of the column 'SEQ'. (NullAllowed)
     */
    public void setSeq(Long seq) {
        __modifiedProperties.add("seq");
        this._seq = seq;
    }

    /**
     * [get] IN_OUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IN_OUT_KBN'. (NullAllowed)
     */
    public String getInOutKbn() {
        return _inOutKbn;
    }

    /**
     * [set] IN_OUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inOutKbn The value of the column 'IN_OUT_KBN'. (NullAllowed)
     */
    public void setInOutKbn(String inOutKbn) {
        __modifiedProperties.add("inOutKbn");
        this._inOutKbn = inOutKbn;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] EXECUTE_DATE: {NotNull, varchar(8)} <br>
     * 情報作成日
     * @return The value of the column 'EXECUTE_DATE'. (NullAllowed)
     */
    public String getExecuteDate() {
        return _executeDate;
    }

    /**
     * [set] EXECUTE_DATE: {NotNull, varchar(8)} <br>
     * 情報作成日
     * @param executeDate The value of the column 'EXECUTE_DATE'. (NullAllowed)
     */
    public void setExecuteDate(String executeDate) {
        __modifiedProperties.add("executeDate");
        this._executeDate = executeDate;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] STOCK_LOCATION: {NotNull, varchar(30)} <br>
     * 格納場所区分
     * @return The value of the column 'STOCK_LOCATION'. (NullAllowed)
     */
    public String getStockLocation() {
        return _stockLocation;
    }

    /**
     * [set] STOCK_LOCATION: {NotNull, varchar(30)} <br>
     * 格納場所区分
     * @param stockLocation The value of the column 'STOCK_LOCATION'. (NullAllowed)
     */
    public void setStockLocation(String stockLocation) {
        __modifiedProperties.add("stockLocation");
        this._stockLocation = stockLocation;
    }

    /**
     * [get] STOCK_LOCATION_NM: {NotNull, varchar(60)} <br>
     * 格納場所区分名称
     * @return The value of the column 'STOCK_LOCATION_NM'. (NullAllowed)
     */
    public String getStockLocationNm() {
        return _stockLocationNm;
    }

    /**
     * [set] STOCK_LOCATION_NM: {NotNull, varchar(60)} <br>
     * 格納場所区分名称
     * @param stockLocationNm The value of the column 'STOCK_LOCATION_NM'. (NullAllowed)
     */
    public void setStockLocationNm(String stockLocationNm) {
        __modifiedProperties.add("stockLocationNm");
        this._stockLocationNm = stockLocationNm;
    }

    /**
     * [get] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_KBN: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_KBN'. (NullAllowed)
     */
    public String getDesignKbn() {
        return _designKbn;
    }

    /**
     * [set] DESIGN_KBN: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designKbn The value of the column 'DESIGN_KBN'. (NullAllowed)
     */
    public void setDesignKbn(String designKbn) {
        __modifiedProperties.add("designKbn");
        this._designKbn = designKbn;
    }

    /**
     * [get] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] TRANSPORT_CD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public String getTransportCd() {
        return _transportCd;
    }

    /**
     * [set] TRANSPORT_CD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public void setTransportCd(String transportCd) {
        __modifiedProperties.add("transportCd");
        this._transportCd = transportCd;
    }

    /**
     * [get] FIRM_CARRY_NO: {NotNull, varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRM_CARRY_NO'. (NullAllowed)
     */
    public String getFirmCarryNo() {
        return _firmCarryNo;
    }

    /**
     * [set] FIRM_CARRY_NO: {NotNull, varchar(30)} <br>
     * 商社搬入番号
     * @param firmCarryNo The value of the column 'FIRM_CARRY_NO'. (NullAllowed)
     */
    public void setFirmCarryNo(String firmCarryNo) {
        __modifiedProperties.add("firmCarryNo");
        this._firmCarryNo = firmCarryNo;
    }

    /**
     * [get] SOURCE_CD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public String getSourceCd() {
        return _sourceCd;
    }

    /**
     * [set] SOURCE_CD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public void setSourceCd(String sourceCd) {
        __modifiedProperties.add("sourceCd");
        this._sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NM: {NotNull, varchar(60)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NM'. (NullAllowed)
     */
    public String getSourceNm() {
        return _sourceNm;
    }

    /**
     * [set] SOURCE_NM: {NotNull, varchar(60)} <br>
     * 発送元名称
     * @param sourceNm The value of the column 'SOURCE_NM'. (NullAllowed)
     */
    public void setSourceNm(String sourceNm) {
        __modifiedProperties.add("sourceNm");
        this._sourceNm = sourceNm;
    }

    /**
     * [get] SCH_DATE: {NotNull, varchar(8)} <br>
     * 発送日
     * @return The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public String getSchDate() {
        return _schDate;
    }

    /**
     * [set] SCH_DATE: {NotNull, varchar(8)} <br>
     * 発送日
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public void setSchDate(String schDate) {
        __modifiedProperties.add("schDate");
        this._schDate = schDate;
    }

    /**
     * [get] RCV_DATE: {NotNull, varchar(14)} <br>
     * 入庫日
     * @return The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public String getRcvDate() {
        return _rcvDate;
    }

    /**
     * [set] RCV_DATE: {NotNull, varchar(14)} <br>
     * 入庫日
     * @param rcvDate The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public void setRcvDate(String rcvDate) {
        __modifiedProperties.add("rcvDate");
        this._rcvDate = rcvDate;
    }

    /**
     * [get] P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当月過不足総計
     * @return The value of the column 'P_TDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public Long getPTdayTotalDiffQty() {
        return _pTdayTotalDiffQty;
    }

    /**
     * [set] P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当月過不足総計
     * @param pTdayTotalDiffQty The value of the column 'P_TDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public void setPTdayTotalDiffQty(Long pTdayTotalDiffQty) {
        __modifiedProperties.add("PTdayTotalDiffQty");
        this._pTdayTotalDiffQty = pTdayTotalDiffQty;
    }

    /**
     * [get] P_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_システム在庫
     * @return The value of the column 'P_QTY'. (NullAllowed)
     */
    public Long getPQty() {
        return _pQty;
    }

    /**
     * [set] P_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_システム在庫
     * @param pQty The value of the column 'P_QTY'. (NullAllowed)
     */
    public void setPQty(Long pQty) {
        __modifiedProperties.add("PQty");
        this._pQty = pQty;
    }

    /**
     * [get] P_INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 銘柄計_調査結果
     * @return The value of the column 'P_INVENTORY_NUM'. (NullAllowed)
     */
    public Long getPInventoryNum() {
        return _pInventoryNum;
    }

    /**
     * [set] P_INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 銘柄計_調査結果
     * @param pInventoryNum The value of the column 'P_INVENTORY_NUM'. (NullAllowed)
     */
    public void setPInventoryNum(Long pInventoryNum) {
        __modifiedProperties.add("PInventoryNum");
        this._pInventoryNum = pInventoryNum;
    }

    /**
     * [get] P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_前日までの過不足
     * @return The value of the column 'P_YDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public Long getPYdayTotalDiffQty() {
        return _pYdayTotalDiffQty;
    }

    /**
     * [set] P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_前日までの過不足
     * @param pYdayTotalDiffQty The value of the column 'P_YDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public void setPYdayTotalDiffQty(Long pYdayTotalDiffQty) {
        __modifiedProperties.add("PYdayTotalDiffQty");
        this._pYdayTotalDiffQty = pYdayTotalDiffQty;
    }

    /**
     * [get] P_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当日過不足
     * @return The value of the column 'P_TDAY_DIFF_QTY'. (NullAllowed)
     */
    public Long getPTdayDiffQty() {
        return _pTdayDiffQty;
    }

    /**
     * [set] P_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当日過不足
     * @param pTdayDiffQty The value of the column 'P_TDAY_DIFF_QTY'. (NullAllowed)
     */
    public void setPTdayDiffQty(Long pTdayDiffQty) {
        __modifiedProperties.add("PTdayDiffQty");
        this._pTdayDiffQty = pTdayDiffQty;
    }

    /**
     * [get] SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_前日までの過不足
     * @return The value of the column 'SL_YDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public Long getSlYdayTotalDiffQty() {
        return _slYdayTotalDiffQty;
    }

    /**
     * [set] SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_前日までの過不足
     * @param slYdayTotalDiffQty The value of the column 'SL_YDAY_TOTAL_DIFF_QTY'. (NullAllowed)
     */
    public void setSlYdayTotalDiffQty(Long slYdayTotalDiffQty) {
        __modifiedProperties.add("slYdayTotalDiffQty");
        this._slYdayTotalDiffQty = slYdayTotalDiffQty;
    }

    /**
     * [get] SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_当日過不足
     * @return The value of the column 'SL_TDAY_DIFF_QTY'. (NullAllowed)
     */
    public Long getSlTdayDiffQty() {
        return _slTdayDiffQty;
    }

    /**
     * [set] SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_当日過不足
     * @param slTdayDiffQty The value of the column 'SL_TDAY_DIFF_QTY'. (NullAllowed)
     */
    public void setSlTdayDiffQty(Long slTdayDiffQty) {
        __modifiedProperties.add("slTdayDiffQty");
        this._slTdayDiffQty = slTdayDiffQty;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * システム在庫
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * システム在庫
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 調査結果
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public Long getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 調査結果
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(Long inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] USER_USE4: {NotNull, varchar(30)} <br>
     * 銘柄CD(親銘柄)
     * @return The value of the column 'USER_USE4'. (NullAllowed)
     */
    public String getUserUse4() {
        return _userUse4;
    }

    /**
     * [set] USER_USE4: {NotNull, varchar(30)} <br>
     * 銘柄CD(親銘柄)
     * @param userUse4 The value of the column 'USER_USE4'. (NullAllowed)
     */
    public void setUserUse4(String userUse4) {
        __modifiedProperties.add("userUse4");
        this._userUse4 = userUse4;
    }

    /**
     * [get] LOT_ATRB1_TITLE: {NotNull, varchar(60)} <br>
     * 銘柄CD(庫内集約銘柄)
     * @return The value of the column 'LOT_ATRB1_TITLE'. (NullAllowed)
     */
    public String getLotAtrb1Title() {
        return _lotAtrb1Title;
    }

    /**
     * [set] LOT_ATRB1_TITLE: {NotNull, varchar(60)} <br>
     * 銘柄CD(庫内集約銘柄)
     * @param lotAtrb1Title The value of the column 'LOT_ATRB1_TITLE'. (NullAllowed)
     */
    public void setLotAtrb1Title(String lotAtrb1Title) {
        __modifiedProperties.add("lotAtrb1Title");
        this._lotAtrb1Title = lotAtrb1Title;
    }

    /**
     * [get] USER_NUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'USER_NUM4'. (NullAllowed)
     */
    public String getUserNum4() {
        return _userNum4;
    }

    /**
     * [set] USER_NUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @param userNum4 The value of the column 'USER_NUM4'. (NullAllowed)
     */
    public void setUserNum4(String userNum4) {
        __modifiedProperties.add("userNum4");
        this._userNum4 = userNum4;
    }

    /**
     * [get] USER_NUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @return The value of the column 'USER_NUM3'. (NullAllowed)
     */
    public String getUserNum3() {
        return _userNum3;
    }

    /**
     * [set] USER_NUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @param userNum3 The value of the column 'USER_NUM3'. (NullAllowed)
     */
    public void setUserNum3(String userNum3) {
        __modifiedProperties.add("userNum3");
        this._userNum3 = userNum3;
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
