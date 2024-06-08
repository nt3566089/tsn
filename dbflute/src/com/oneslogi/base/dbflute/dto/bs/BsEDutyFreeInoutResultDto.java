package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_DUTY_FREE_INOUT_RESULT as TABLE. <br>
 * 国内免税入出庫実績送信テーブル
 * <pre>
 * [primary-key]
 *     DUTY_FREE_INOUT_RESULT_ID
 *
 * [column]
 *     DUTY_FREE_INOUT_RESULT_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, SYMBOL_FACTORY_CD, SYMBOL_ITEM_CD, SYMBOL_SKU, SYMBOL_RECEIVE_CD, SYMBOL_PRODUCT_MARK, SYMBOL_ORDERNO, SYMBOL_PRINTERNO, SYMBOL_MAKENO, SYMBOL_LOT4, SYMBOL_MAKETIME, SYMBOL_CIRCULATION_ID, TRANSPORT_CD, PALLET_ID, INIT_NUM, CREATE_DATETIME, SORTING_DATETIME, TRACE_TYPE, LINE_BLOCK, ASSORT_ED_UNIT, ASSORT_ED_INDEX, OPERATION_CODE, CASE_IN_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, DIST_WAREHOUSE_CD, SYMBOL_RCV_KEY, ITEM_CD, DESIGN_CD, RESESRVE_AREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DUTY_FREE_INOUT_RESULT_ID
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
public abstract class BsEDutyFreeInoutResultDto implements Serializable {

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
    /** DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _dutyFreeInoutResultId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** SYMBOL_POS_KEY: {varchar(255)} */
    @JsonKey
    protected String _symbolPosKey;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** SYMBOL_FACTORY_CD: {varchar(255)} */
    @JsonKey
    protected String _symbolFactoryCd;

    /** SYMBOL_ITEM_CD: {varchar(255)} */
    @JsonKey
    protected String _symbolItemCd;

    /** SYMBOL_SKU: {varchar(255)} */
    @JsonKey
    protected String _symbolSku;

    /** SYMBOL_RECEIVE_CD: {varchar(255)} */
    @JsonKey
    protected String _symbolReceiveCd;

    /** SYMBOL_PRODUCT_MARK: {varchar(255)} */
    @JsonKey
    protected String _symbolProductMark;

    /** SYMBOL_ORDERNO: {varchar(255)} */
    @JsonKey
    protected String _symbolOrderno;

    /** SYMBOL_PRINTERNO: {varchar(255)} */
    @JsonKey
    protected String _symbolPrinterno;

    /** SYMBOL_MAKENO: {varchar(255)} */
    @JsonKey
    protected String _symbolMakeno;

    /** SYMBOL_LOT4: {varchar(255)} */
    @JsonKey
    protected String _symbolLot4;

    /** SYMBOL_MAKETIME: {varchar(255)} */
    @JsonKey
    protected String _symbolMaketime;

    /** SYMBOL_CIRCULATION_ID: {varchar(255)} */
    @JsonKey
    protected String _symbolCirculationId;

    /** TRANSPORT_CD: {varchar(255)} */
    @JsonKey
    protected String _transportCd;

    /** PALLET_ID: {varchar(255)} */
    @JsonKey
    protected String _palletId;

    /** INIT_NUM: {varchar(255)} */
    @JsonKey
    protected String _initNum;

    /** CREATE_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _createDatetime;

    /** SORTING_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _sortingDatetime;

    /** TRACE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _traceType;

    /** LINE_BLOCK: {varchar(255)} */
    @JsonKey
    protected String _lineBlock;

    /** ASSORT_ED_UNIT: {varchar(255)} */
    @JsonKey
    protected String _assortEdUnit;

    /** ASSORT_ED_INDEX: {varchar(255)} */
    @JsonKey
    protected String _assortEdIndex;

    /** OPERATION_CODE: {varchar(255)} */
    @JsonKey
    protected String _operationCode;

    /** CASE_IN_NUM: {varchar(255)} */
    @JsonKey
    protected String _caseInNum;

    /** ASSORT_NUM: {varchar(255)} */
    @JsonKey
    protected String _assortNum;

    /** ASSORT_DIF_NUM: {varchar(255)} */
    @JsonKey
    protected String _assortDifNum;

    /** DIRECTION_CD: {varchar(255)} */
    @JsonKey
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _pistonType;

    /** CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _customerCd;

    /** DIRECTION_NUM: {varchar(255)} */
    @JsonKey
    protected String _directionNum;

    /** DIST_WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _distWarehouseCd;

    /** SYMBOL_RCV_KEY: {varchar(255)} */
    @JsonKey
    protected String _symbolRcvKey;

    /** ITEM_CD: {varchar(255)} */
    @JsonKey
    protected String _itemCd;

    /** DESIGN_CD: {varchar(255)} */
    @JsonKey
    protected String _designCd;

    /** RESESRVE_AREA: {varchar(255)} */
    @JsonKey
    protected String _resesrveArea;

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
    public BsEDutyFreeInoutResultDto() {
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
        if (other == null || !(other instanceof BsEDutyFreeInoutResultDto)) { return false; }
        final BsEDutyFreeInoutResultDto otherEntity = (BsEDutyFreeInoutResultDto)other;
        if (!helpComparingValue(getDutyFreeInoutResultId(), otherEntity.getDutyFreeInoutResultId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_DUTY_FREE_INOUT_RESULT");
        result = xCH(result, getDutyFreeInoutResultId());
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
        sb.append(c).append(getDutyFreeInoutResultId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getSymbolPosKey());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getSymbolFactoryCd());
        sb.append(c).append(getSymbolItemCd());
        sb.append(c).append(getSymbolSku());
        sb.append(c).append(getSymbolReceiveCd());
        sb.append(c).append(getSymbolProductMark());
        sb.append(c).append(getSymbolOrderno());
        sb.append(c).append(getSymbolPrinterno());
        sb.append(c).append(getSymbolMakeno());
        sb.append(c).append(getSymbolLot4());
        sb.append(c).append(getSymbolMaketime());
        sb.append(c).append(getSymbolCirculationId());
        sb.append(c).append(getTransportCd());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getInitNum());
        sb.append(c).append(getCreateDatetime());
        sb.append(c).append(getSortingDatetime());
        sb.append(c).append(getTraceType());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getAssortEdUnit());
        sb.append(c).append(getAssortEdIndex());
        sb.append(c).append(getOperationCode());
        sb.append(c).append(getCaseInNum());
        sb.append(c).append(getAssortNum());
        sb.append(c).append(getAssortDifNum());
        sb.append(c).append(getDirectionCd());
        sb.append(c).append(getPistonType());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getDirectionNum());
        sb.append(c).append(getDistWarehouseCd());
        sb.append(c).append(getSymbolRcvKey());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getResesrveArea());
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
     * [get] DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税入出庫実績送信ID
     * @return The value of the column 'DUTY_FREE_INOUT_RESULT_ID'. (NullAllowed)
     */
    public Long getDutyFreeInoutResultId() {
        return _dutyFreeInoutResultId;
    }

    /**
     * [set] DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税入出庫実績送信ID
     * @param dutyFreeInoutResultId The value of the column 'DUTY_FREE_INOUT_RESULT_ID'. (NullAllowed)
     */
    public void setDutyFreeInoutResultId(Long dutyFreeInoutResultId) {
        __modifiedProperties.add("dutyFreeInoutResultId");
        this._dutyFreeInoutResultId = dutyFreeInoutResultId;
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
     * [get] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'SYMBOL_POS_KEY'. (NullAllowed)
     */
    public String getSymbolPosKey() {
        return _symbolPosKey;
    }

    /**
     * [set] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param symbolPosKey The value of the column 'SYMBOL_POS_KEY'. (NullAllowed)
     */
    public void setSymbolPosKey(String symbolPosKey) {
        __modifiedProperties.add("symbolPosKey");
        this._symbolPosKey = symbolPosKey;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 拠点CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] SYMBOL_FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'SYMBOL_FACTORY_CD'. (NullAllowed)
     */
    public String getSymbolFactoryCd() {
        return _symbolFactoryCd;
    }

    /**
     * [set] SYMBOL_FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @param symbolFactoryCd The value of the column 'SYMBOL_FACTORY_CD'. (NullAllowed)
     */
    public void setSymbolFactoryCd(String symbolFactoryCd) {
        __modifiedProperties.add("symbolFactoryCd");
        this._symbolFactoryCd = symbolFactoryCd;
    }

    /**
     * [get] SYMBOL_ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed)
     */
    public String getSymbolItemCd() {
        return _symbolItemCd;
    }

    /**
     * [set] SYMBOL_ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param symbolItemCd The value of the column 'SYMBOL_ITEM_CD'. (NullAllowed)
     */
    public void setSymbolItemCd(String symbolItemCd) {
        __modifiedProperties.add("symbolItemCd");
        this._symbolItemCd = symbolItemCd;
    }

    /**
     * [get] SYMBOL_SKU: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SYMBOL_SKU'. (NullAllowed)
     */
    public String getSymbolSku() {
        return _symbolSku;
    }

    /**
     * [set] SYMBOL_SKU: {varchar(255)} <br>
     * SKUCD
     * @param symbolSku The value of the column 'SYMBOL_SKU'. (NullAllowed)
     */
    public void setSymbolSku(String symbolSku) {
        __modifiedProperties.add("symbolSku");
        this._symbolSku = symbolSku;
    }

    /**
     * [get] SYMBOL_RECEIVE_CD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'SYMBOL_RECEIVE_CD'. (NullAllowed)
     */
    public String getSymbolReceiveCd() {
        return _symbolReceiveCd;
    }

    /**
     * [set] SYMBOL_RECEIVE_CD: {varchar(255)} <br>
     * 仕向地CD
     * @param symbolReceiveCd The value of the column 'SYMBOL_RECEIVE_CD'. (NullAllowed)
     */
    public void setSymbolReceiveCd(String symbolReceiveCd) {
        __modifiedProperties.add("symbolReceiveCd");
        this._symbolReceiveCd = symbolReceiveCd;
    }

    /**
     * [get] SYMBOL_PRODUCT_MARK: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed)
     */
    public String getSymbolProductMark() {
        return _symbolProductMark;
    }

    /**
     * [set] SYMBOL_PRODUCT_MARK: {varchar(255)} <br>
     * 製造記号
     * @param symbolProductMark The value of the column 'SYMBOL_PRODUCT_MARK'. (NullAllowed)
     */
    public void setSymbolProductMark(String symbolProductMark) {
        __modifiedProperties.add("symbolProductMark");
        this._symbolProductMark = symbolProductMark;
    }

    /**
     * [get] SYMBOL_ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @return The value of the column 'SYMBOL_ORDERNO'. (NullAllowed)
     */
    public String getSymbolOrderno() {
        return _symbolOrderno;
    }

    /**
     * [set] SYMBOL_ORDERNO: {varchar(255)} <br>
     * 発注番号
     * @param symbolOrderno The value of the column 'SYMBOL_ORDERNO'. (NullAllowed)
     */
    public void setSymbolOrderno(String symbolOrderno) {
        __modifiedProperties.add("symbolOrderno");
        this._symbolOrderno = symbolOrderno;
    }

    /**
     * [get] SYMBOL_PRINTERNO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'SYMBOL_PRINTERNO'. (NullAllowed)
     */
    public String getSymbolPrinterno() {
        return _symbolPrinterno;
    }

    /**
     * [set] SYMBOL_PRINTERNO: {varchar(255)} <br>
     * 号機
     * @param symbolPrinterno The value of the column 'SYMBOL_PRINTERNO'. (NullAllowed)
     */
    public void setSymbolPrinterno(String symbolPrinterno) {
        __modifiedProperties.add("symbolPrinterno");
        this._symbolPrinterno = symbolPrinterno;
    }

    /**
     * [get] SYMBOL_MAKENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'SYMBOL_MAKENO'. (NullAllowed)
     */
    public String getSymbolMakeno() {
        return _symbolMakeno;
    }

    /**
     * [set] SYMBOL_MAKENO: {varchar(255)} <br>
     * 生出番号
     * @param symbolMakeno The value of the column 'SYMBOL_MAKENO'. (NullAllowed)
     */
    public void setSymbolMakeno(String symbolMakeno) {
        __modifiedProperties.add("symbolMakeno");
        this._symbolMakeno = symbolMakeno;
    }

    /**
     * [get] SYMBOL_LOT4: {varchar(255)} <br>
     * 年月日
     * @return The value of the column 'SYMBOL_LOT4'. (NullAllowed)
     */
    public String getSymbolLot4() {
        return _symbolLot4;
    }

    /**
     * [set] SYMBOL_LOT4: {varchar(255)} <br>
     * 年月日
     * @param symbolLot4 The value of the column 'SYMBOL_LOT4'. (NullAllowed)
     */
    public void setSymbolLot4(String symbolLot4) {
        __modifiedProperties.add("symbolLot4");
        this._symbolLot4 = symbolLot4;
    }

    /**
     * [get] SYMBOL_MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @return The value of the column 'SYMBOL_MAKETIME'. (NullAllowed)
     */
    public String getSymbolMaketime() {
        return _symbolMaketime;
    }

    /**
     * [set] SYMBOL_MAKETIME: {varchar(255)} <br>
     * 日付時刻
     * @param symbolMaketime The value of the column 'SYMBOL_MAKETIME'. (NullAllowed)
     */
    public void setSymbolMaketime(String symbolMaketime) {
        __modifiedProperties.add("symbolMaketime");
        this._symbolMaketime = symbolMaketime;
    }

    /**
     * [get] SYMBOL_CIRCULATION_ID: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'SYMBOL_CIRCULATION_ID'. (NullAllowed)
     */
    public String getSymbolCirculationId() {
        return _symbolCirculationId;
    }

    /**
     * [set] SYMBOL_CIRCULATION_ID: {varchar(255)} <br>
     * 流通識別
     * @param symbolCirculationId The value of the column 'SYMBOL_CIRCULATION_ID'. (NullAllowed)
     */
    public void setSymbolCirculationId(String symbolCirculationId) {
        __modifiedProperties.add("symbolCirculationId");
        this._symbolCirculationId = symbolCirculationId;
    }

    /**
     * [get] TRANSPORT_CD: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public String getTransportCd() {
        return _transportCd;
    }

    /**
     * [set] TRANSPORT_CD: {varchar(255)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public void setTransportCd(String transportCd) {
        __modifiedProperties.add("transportCd");
        this._transportCd = transportCd;
    }

    /**
     * [get] PALLET_ID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public String getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {varchar(255)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(String palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] INIT_NUM: {varchar(255)} <br>
     * 入庫時数量
     * @return The value of the column 'INIT_NUM'. (NullAllowed)
     */
    public String getInitNum() {
        return _initNum;
    }

    /**
     * [set] INIT_NUM: {varchar(255)} <br>
     * 入庫時数量
     * @param initNum The value of the column 'INIT_NUM'. (NullAllowed)
     */
    public void setInitNum(String initNum) {
        __modifiedProperties.add("initNum");
        this._initNum = initNum;
    }

    /**
     * [get] CREATE_DATETIME: {varchar(255)} <br>
     * 作成年月日
     * @return The value of the column 'CREATE_DATETIME'. (NullAllowed)
     */
    public String getCreateDatetime() {
        return _createDatetime;
    }

    /**
     * [set] CREATE_DATETIME: {varchar(255)} <br>
     * 作成年月日
     * @param createDatetime The value of the column 'CREATE_DATETIME'. (NullAllowed)
     */
    public void setCreateDatetime(String createDatetime) {
        __modifiedProperties.add("createDatetime");
        this._createDatetime = createDatetime;
    }

    /**
     * [get] SORTING_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'SORTING_DATETIME'. (NullAllowed)
     */
    public String getSortingDatetime() {
        return _sortingDatetime;
    }

    /**
     * [set] SORTING_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param sortingDatetime The value of the column 'SORTING_DATETIME'. (NullAllowed)
     */
    public void setSortingDatetime(String sortingDatetime) {
        __modifiedProperties.add("sortingDatetime");
        this._sortingDatetime = sortingDatetime;
    }

    /**
     * [get] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACE_TYPE'. (NullAllowed)
     */
    public String getTraceType() {
        return _traceType;
    }

    /**
     * [set] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @param traceType The value of the column 'TRACE_TYPE'. (NullAllowed)
     */
    public void setTraceType(String traceType) {
        __modifiedProperties.add("traceType");
        this._traceType = traceType;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ライン・ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ライン・ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] ASSORT_ED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORT_ED_UNIT'. (NullAllowed)
     */
    public String getAssortEdUnit() {
        return _assortEdUnit;
    }

    /**
     * [set] ASSORT_ED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortEdUnit The value of the column 'ASSORT_ED_UNIT'. (NullAllowed)
     */
    public void setAssortEdUnit(String assortEdUnit) {
        __modifiedProperties.add("assortEdUnit");
        this._assortEdUnit = assortEdUnit;
    }

    /**
     * [get] ASSORT_ED_INDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORT_ED_INDEX'. (NullAllowed)
     */
    public String getAssortEdIndex() {
        return _assortEdIndex;
    }

    /**
     * [set] ASSORT_ED_INDEX: {varchar(255)} <br>
     * 投入順
     * @param assortEdIndex The value of the column 'ASSORT_ED_INDEX'. (NullAllowed)
     */
    public void setAssortEdIndex(String assortEdIndex) {
        __modifiedProperties.add("assortEdIndex");
        this._assortEdIndex = assortEdIndex;
    }

    /**
     * [get] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATION_CODE'. (NullAllowed)
     */
    public String getOperationCode() {
        return _operationCode;
    }

    /**
     * [set] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationCode The value of the column 'OPERATION_CODE'. (NullAllowed)
     */
    public void setOperationCode(String operationCode) {
        __modifiedProperties.add("operationCode");
        this._operationCode = operationCode;
    }

    /**
     * [get] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASE_IN_NUM'. (NullAllowed)
     */
    public String getCaseInNum() {
        return _caseInNum;
    }

    /**
     * [set] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseInNum The value of the column 'CASE_IN_NUM'. (NullAllowed)
     */
    public void setCaseInNum(String caseInNum) {
        __modifiedProperties.add("caseInNum");
        this._caseInNum = caseInNum;
    }

    /**
     * [get] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORT_NUM'. (NullAllowed)
     */
    public String getAssortNum() {
        return _assortNum;
    }

    /**
     * [set] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortNum The value of the column 'ASSORT_NUM'. (NullAllowed)
     */
    public void setAssortNum(String assortNum) {
        __modifiedProperties.add("assortNum");
        this._assortNum = assortNum;
    }

    /**
     * [get] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORT_DIF_NUM'. (NullAllowed)
     */
    public String getAssortDifNum() {
        return _assortDifNum;
    }

    /**
     * [set] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortDifNum The value of the column 'ASSORT_DIF_NUM'. (NullAllowed)
     */
    public void setAssortDifNum(String assortDifNum) {
        __modifiedProperties.add("assortDifNum");
        this._assortDifNum = assortDifNum;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public String getDirectionCd() {
        return _directionCd;
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public void setDirectionCd(String directionCd) {
        __modifiedProperties.add("directionCd");
        this._directionCd = directionCd;
    }

    /**
     * [get] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public String getPistonType() {
        return _pistonType;
    }

    /**
     * [set] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistonType The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public void setPistonType(String pistonType) {
        __modifiedProperties.add("pistonType");
        this._pistonType = pistonType;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTION_NUM'. (NullAllowed)
     */
    public String getDirectionNum() {
        return _directionNum;
    }

    /**
     * [set] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @param directionNum The value of the column 'DIRECTION_NUM'. (NullAllowed)
     */
    public void setDirectionNum(String directionNum) {
        __modifiedProperties.add("directionNum");
        this._directionNum = directionNum;
    }

    /**
     * [get] DIST_WAREHOUSE_CD: {varchar(255)} <br>
     * 融通先
     * @return The value of the column 'DIST_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getDistWarehouseCd() {
        return _distWarehouseCd;
    }

    /**
     * [set] DIST_WAREHOUSE_CD: {varchar(255)} <br>
     * 融通先
     * @param distWarehouseCd The value of the column 'DIST_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setDistWarehouseCd(String distWarehouseCd) {
        __modifiedProperties.add("distWarehouseCd");
        this._distWarehouseCd = distWarehouseCd;
    }

    /**
     * [get] SYMBOL_RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'SYMBOL_RCV_KEY'. (NullAllowed)
     */
    public String getSymbolRcvKey() {
        return _symbolRcvKey;
    }

    /**
     * [set] SYMBOL_RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param symbolRcvKey The value of the column 'SYMBOL_RCV_KEY'. (NullAllowed)
     */
    public void setSymbolRcvKey(String symbolRcvKey) {
        __modifiedProperties.add("symbolRcvKey");
        this._symbolRcvKey = symbolRcvKey;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        __modifiedProperties.add("itemCd");
        this._itemCd = itemCd;
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
     * [get] RESESRVE_AREA: {varchar(255)} <br>
     * 予備領域
     * @return The value of the column 'RESESRVE_AREA'. (NullAllowed)
     */
    public String getResesrveArea() {
        return _resesrveArea;
    }

    /**
     * [set] RESESRVE_AREA: {varchar(255)} <br>
     * 予備領域
     * @param resesrveArea The value of the column 'RESESRVE_AREA'. (NullAllowed)
     */
    public void setResesrveArea(String resesrveArea) {
        __modifiedProperties.add("resesrveArea");
        this._resesrveArea = resesrveArea;
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
