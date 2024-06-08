package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_RETURNED_RECEIVE_PLAN as TABLE. <br>
 * 返品入庫予定受信テーブル
 * <pre>
 * [primary-key]
 *     RETURNED_RECEIVE_PLAN_ID
 *
 * [column]
 *     RETURNED_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEADER_FLG, SORT_BS_CD, DELIVAY_CENTER_CD, ORDER_GROUP, SALE_DATETIME, CUSTOMER_CD, SLIP_TYPE, SLIP_NO, SEQUENCE_NO, ORDER_DATE, SHIPING_DATE, OTORGCD, ORDORGCD, RLYBSCD, DIRECTION_CD, PISTON_ID, DELIVALY_RANK, BULK_DELIVALY_NO, DIVMTD, ZZHDVRID, CUSTOMER_NM, HEADER_PRICE_SALE, ZREGPRCC, TAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, COMPANY_CD, SALE_TYPE, HVRT_REASON, HVRT_INOUT_DATE, CNG_PRT_SLIP_NO, PROCESS_TYPE, EOS_ORD_AFT_FLG, EOS_SLIP_NO, HDRD_BX_TYPE, INOT_RFSL_TYPE, BX_MNT_RFSL_TYPE, REPORT_MERFE_TIMING, REPORT_OUT_DATETIME, CLIENT_ID, KWMENG, STATUS_CD, STG_VAL, DETAIL_PRICE_SALE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_RECEIVE_PLAN_ID
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
public abstract class BsEReturnedReceivePlanDto implements Serializable {

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
    /** RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _returnedReceivePlanId;

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

    /** HEADER_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _headerFlg;

    /** SORT_BS_CD: {varchar(255)} */
    @JsonKey
    protected String _sortBsCd;

    /** DELIVAY_CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _delivayCenterCd;

    /** ORDER_GROUP: {varchar(255)} */
    @JsonKey
    protected String _orderGroup;

    /** SALE_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _saleDatetime;

    /** CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _customerCd;

    /** SLIP_TYPE: {varchar(255)} */
    @JsonKey
    protected String _slipType;

    /** SLIP_NO: {varchar(255)} */
    @JsonKey
    protected String _slipNo;

    /** SEQUENCE_NO: {varchar(255)} */
    @JsonKey
    protected String _sequenceNo;

    /** ORDER_DATE: {varchar(255)} */
    @JsonKey
    protected String _orderDate;

    /** SHIPING_DATE: {varchar(255)} */
    @JsonKey
    protected String _shipingDate;

    /** OTORGCD: {varchar(255)} */
    @JsonKey
    protected String _otorgcd;

    /** ORDORGCD: {varchar(255)} */
    @JsonKey
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(255)} */
    @JsonKey
    protected String _rlybscd;

    /** DIRECTION_CD: {varchar(255)} */
    @JsonKey
    protected String _directionCd;

    /** PISTON_ID: {varchar(255)} */
    @JsonKey
    protected String _pistonId;

    /** DELIVALY_RANK: {varchar(255)} */
    @JsonKey
    protected String _delivalyRank;

    /** BULK_DELIVALY_NO: {varchar(255)} */
    @JsonKey
    protected String _bulkDelivalyNo;

    /** DIVMTD: {varchar(255)} */
    @JsonKey
    protected String _divmtd;

    /** ZZHDVRID: {varchar(255)} */
    @JsonKey
    protected String _zzhdvrid;

    /** CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _customerNm;

    /** HEADER_PRICE_SALE: {varchar(255)} */
    @JsonKey
    protected String _headerPriceSale;

    /** ZREGPRCC: {varchar(255)} */
    @JsonKey
    protected String _zregprcc;

    /** TAX: {varchar(255)} */
    @JsonKey
    protected String _tax;

    /** ZZGODFPC: {varchar(255)} */
    @JsonKey
    protected String _zzgodfpc;

    /** ZZGODSPC: {varchar(255)} */
    @JsonKey
    protected String _zzgodspc;

    /** ZZGODCTX: {varchar(255)} */
    @JsonKey
    protected String _zzgodctx;

    /** COMPANY_CD: {varchar(255)} */
    @JsonKey
    protected String _companyCd;

    /** SALE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _saleType;

    /** HVRT_REASON: {varchar(255)} */
    @JsonKey
    protected String _hvrtReason;

    /** HVRT_INOUT_DATE: {varchar(255)} */
    @JsonKey
    protected String _hvrtInoutDate;

    /** CNG_PRT_SLIP_NO: {varchar(255)} */
    @JsonKey
    protected String _cngPrtSlipNo;

    /** PROCESS_TYPE: {varchar(255)} */
    @JsonKey
    protected String _processType;

    /** EOS_ORD_AFT_FLG: {varchar(255)} */
    @JsonKey
    protected String _eosOrdAftFlg;

    /** EOS_SLIP_NO: {varchar(255)} */
    @JsonKey
    protected String _eosSlipNo;

    /** HDRD_BX_TYPE: {varchar(255)} */
    @JsonKey
    protected String _hdrdBxType;

    /** INOT_RFSL_TYPE: {varchar(255)} */
    @JsonKey
    protected String _inotRfslType;

    /** BX_MNT_RFSL_TYPE: {varchar(255)} */
    @JsonKey
    protected String _bxMntRfslType;

    /** REPORT_MERFE_TIMING: {varchar(255)} */
    @JsonKey
    protected String _reportMerfeTiming;

    /** REPORT_OUT_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _reportOutDatetime;

    /** CLIENT_ID: {varchar(255)} */
    @JsonKey
    protected String _clientId;

    /** KWMENG: {varchar(255)} */
    @JsonKey
    protected String _kwmeng;

    /** STATUS_CD: {varchar(255)} */
    @JsonKey
    protected String _statusCd;

    /** STG_VAL: {varchar(255)} */
    @JsonKey
    protected String _stgVal;

    /** DETAIL_PRICE_SALE: {varchar(255)} */
    @JsonKey
    protected String _detailPriceSale;

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
    public BsEReturnedReceivePlanDto() {
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
        if (other == null || !(other instanceof BsEReturnedReceivePlanDto)) { return false; }
        final BsEReturnedReceivePlanDto otherEntity = (BsEReturnedReceivePlanDto)other;
        if (!helpComparingValue(getReturnedReceivePlanId(), otherEntity.getReturnedReceivePlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_RETURNED_RECEIVE_PLAN");
        result = xCH(result, getReturnedReceivePlanId());
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
        sb.append(c).append(getReturnedReceivePlanId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getHeaderFlg());
        sb.append(c).append(getSortBsCd());
        sb.append(c).append(getDelivayCenterCd());
        sb.append(c).append(getOrderGroup());
        sb.append(c).append(getSaleDatetime());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getSlipType());
        sb.append(c).append(getSlipNo());
        sb.append(c).append(getSequenceNo());
        sb.append(c).append(getOrderDate());
        sb.append(c).append(getShipingDate());
        sb.append(c).append(getOtorgcd());
        sb.append(c).append(getOrdorgcd());
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getDirectionCd());
        sb.append(c).append(getPistonId());
        sb.append(c).append(getDelivalyRank());
        sb.append(c).append(getBulkDelivalyNo());
        sb.append(c).append(getDivmtd());
        sb.append(c).append(getZzhdvrid());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getHeaderPriceSale());
        sb.append(c).append(getZregprcc());
        sb.append(c).append(getTax());
        sb.append(c).append(getZzgodfpc());
        sb.append(c).append(getZzgodspc());
        sb.append(c).append(getZzgodctx());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getSaleType());
        sb.append(c).append(getHvrtReason());
        sb.append(c).append(getHvrtInoutDate());
        sb.append(c).append(getCngPrtSlipNo());
        sb.append(c).append(getProcessType());
        sb.append(c).append(getEosOrdAftFlg());
        sb.append(c).append(getEosSlipNo());
        sb.append(c).append(getHdrdBxType());
        sb.append(c).append(getInotRfslType());
        sb.append(c).append(getBxMntRfslType());
        sb.append(c).append(getReportMerfeTiming());
        sb.append(c).append(getReportOutDatetime());
        sb.append(c).append(getClientId());
        sb.append(c).append(getKwmeng());
        sb.append(c).append(getStatusCd());
        sb.append(c).append(getStgVal());
        sb.append(c).append(getDetailPriceSale());
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
     * [get] RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定受信ID
     * @return The value of the column 'RETURNED_RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getReturnedReceivePlanId() {
        return _returnedReceivePlanId;
    }

    /**
     * [set] RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定受信ID
     * @param returnedReceivePlanId The value of the column 'RETURNED_RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setReturnedReceivePlanId(Long returnedReceivePlanId) {
        __modifiedProperties.add("returnedReceivePlanId");
        this._returnedReceivePlanId = returnedReceivePlanId;
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
     * [get] HEADER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @return The value of the column 'HEADER_FLG'. (NullAllowed)
     */
    public String getHeaderFlg() {
        return _headerFlg;
    }

    /**
     * [set] HEADER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @param headerFlg The value of the column 'HEADER_FLG'. (NullAllowed)
     */
    public void setHeaderFlg(String headerFlg) {
        __modifiedProperties.add("headerFlg");
        this._headerFlg = headerFlg;
    }

    /**
     * [get] SORT_BS_CD: {varchar(255)} <br>
     * 仕分基地コード
     * @return The value of the column 'SORT_BS_CD'. (NullAllowed)
     */
    public String getSortBsCd() {
        return _sortBsCd;
    }

    /**
     * [set] SORT_BS_CD: {varchar(255)} <br>
     * 仕分基地コード
     * @param sortBsCd The value of the column 'SORT_BS_CD'. (NullAllowed)
     */
    public void setSortBsCd(String sortBsCd) {
        __modifiedProperties.add("sortBsCd");
        this._sortBsCd = sortBsCd;
    }

    /**
     * [get] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点コード
     * @return The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed)
     */
    public String getDelivayCenterCd() {
        return _delivayCenterCd;
    }

    /**
     * [set] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点コード
     * @param delivayCenterCd The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed)
     */
    public void setDelivayCenterCd(String delivayCenterCd) {
        __modifiedProperties.add("delivayCenterCd");
        this._delivayCenterCd = delivayCenterCd;
    }

    /**
     * [get] ORDER_GROUP: {varchar(255)} <br>
     * さしずグループ
     * @return The value of the column 'ORDER_GROUP'. (NullAllowed)
     */
    public String getOrderGroup() {
        return _orderGroup;
    }

    /**
     * [set] ORDER_GROUP: {varchar(255)} <br>
     * さしずグループ
     * @param orderGroup The value of the column 'ORDER_GROUP'. (NullAllowed)
     */
    public void setOrderGroup(String orderGroup) {
        __modifiedProperties.add("orderGroup");
        this._orderGroup = orderGroup;
    }

    /**
     * [get] SALE_DATETIME: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'SALE_DATETIME'. (NullAllowed)
     */
    public String getSaleDatetime() {
        return _saleDatetime;
    }

    /**
     * [set] SALE_DATETIME: {varchar(255)} <br>
     * 販売年月日
     * @param saleDatetime The value of the column 'SALE_DATETIME'. (NullAllowed)
     */
    public void setSaleDatetime(String saleDatetime) {
        __modifiedProperties.add("saleDatetime");
        this._saleDatetime = saleDatetime;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様コード
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様コード
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] SLIP_TYPE: {varchar(255)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLIP_TYPE'. (NullAllowed)
     */
    public String getSlipType() {
        return _slipType;
    }

    /**
     * [set] SLIP_TYPE: {varchar(255)} <br>
     * 伝票タイプ
     * @param slipType The value of the column 'SLIP_TYPE'. (NullAllowed)
     */
    public void setSlipType(String slipType) {
        __modifiedProperties.add("slipType");
        this._slipType = slipType;
    }

    /**
     * [get] SLIP_NO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public String getSlipNo() {
        return _slipNo;
    }

    /**
     * [set] SLIP_NO: {varchar(255)} <br>
     * 伝票番号
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public void setSlipNo(String slipNo) {
        __modifiedProperties.add("slipNo");
        this._slipNo = slipNo;
    }

    /**
     * [get] SEQUENCE_NO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQUENCE_NO'. (NullAllowed)
     */
    public String getSequenceNo() {
        return _sequenceNo;
    }

    /**
     * [set] SEQUENCE_NO: {varchar(255)} <br>
     * シーケンス番号
     * @param sequenceNo The value of the column 'SEQUENCE_NO'. (NullAllowed)
     */
    public void setSequenceNo(String sequenceNo) {
        __modifiedProperties.add("sequenceNo");
        this._sequenceNo = sequenceNo;
    }

    /**
     * [get] ORDER_DATE: {varchar(255)} <br>
     * さしず年月日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public String getOrderDate() {
        return _orderDate;
    }

    /**
     * [set] ORDER_DATE: {varchar(255)} <br>
     * さしず年月日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public void setOrderDate(String orderDate) {
        __modifiedProperties.add("orderDate");
        this._orderDate = orderDate;
    }

    /**
     * [get] SHIPING_DATE: {varchar(255)} <br>
     * 出荷予定年月日
     * @return The value of the column 'SHIPING_DATE'. (NullAllowed)
     */
    public String getShipingDate() {
        return _shipingDate;
    }

    /**
     * [set] SHIPING_DATE: {varchar(255)} <br>
     * 出荷予定年月日
     * @param shipingDate The value of the column 'SHIPING_DATE'. (NullAllowed)
     */
    public void setShipingDate(String shipingDate) {
        __modifiedProperties.add("shipingDate");
        this._shipingDate = shipingDate;
    }

    /**
     * [get] OTORGCD: {varchar(255)} <br>
     * 出力先組織コード
     * @return The value of the column 'OTORGCD'. (NullAllowed)
     */
    public String getOtorgcd() {
        return _otorgcd;
    }

    /**
     * [set] OTORGCD: {varchar(255)} <br>
     * 出力先組織コード
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed)
     */
    public void setOtorgcd(String otorgcd) {
        __modifiedProperties.add("otorgcd");
        this._otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(255)} <br>
     * さしず元組織コード
     * @return The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public String getOrdorgcd() {
        return _ordorgcd;
    }

    /**
     * [set] ORDORGCD: {varchar(255)} <br>
     * さしず元組織コード
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public void setOrdorgcd(String ordorgcd) {
        __modifiedProperties.add("ordorgcd");
        this._ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(255)} <br>
     * 中継拠点コード
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {varchar(255)} <br>
     * 中継拠点コード
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public String getDirectionCd() {
        return _directionCd;
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public void setDirectionCd(String directionCd) {
        __modifiedProperties.add("directionCd");
        this._directionCd = directionCd;
    }

    /**
     * [get] PISTON_ID: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_ID'. (NullAllowed)
     */
    public String getPistonId() {
        return _pistonId;
    }

    /**
     * [set] PISTON_ID: {varchar(255)} <br>
     * ピストン区分
     * @param pistonId The value of the column 'PISTON_ID'. (NullAllowed)
     */
    public void setPistonId(String pistonId) {
        __modifiedProperties.add("pistonId");
        this._pistonId = pistonId;
    }

    /**
     * [get] DELIVALY_RANK: {varchar(255)} <br>
     * 配達順位
     * @return The value of the column 'DELIVALY_RANK'. (NullAllowed)
     */
    public String getDelivalyRank() {
        return _delivalyRank;
    }

    /**
     * [set] DELIVALY_RANK: {varchar(255)} <br>
     * 配達順位
     * @param delivalyRank The value of the column 'DELIVALY_RANK'. (NullAllowed)
     */
    public void setDelivalyRank(String delivalyRank) {
        __modifiedProperties.add("delivalyRank");
        this._delivalyRank = delivalyRank;
    }

    /**
     * [get] BULK_DELIVALY_NO: {varchar(255)} <br>
     * 一括配達番号
     * @return The value of the column 'BULK_DELIVALY_NO'. (NullAllowed)
     */
    public String getBulkDelivalyNo() {
        return _bulkDelivalyNo;
    }

    /**
     * [set] BULK_DELIVALY_NO: {varchar(255)} <br>
     * 一括配達番号
     * @param bulkDelivalyNo The value of the column 'BULK_DELIVALY_NO'. (NullAllowed)
     */
    public void setBulkDelivalyNo(String bulkDelivalyNo) {
        __modifiedProperties.add("bulkDelivalyNo");
        this._bulkDelivalyNo = bulkDelivalyNo;
    }

    /**
     * [get] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed)
     */
    public String getDivmtd() {
        return _divmtd;
    }

    /**
     * [set] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed)
     */
    public void setDivmtd(String divmtd) {
        __modifiedProperties.add("divmtd");
        this._divmtd = divmtd;
    }

    /**
     * [get] ZZHDVRID: {varchar(255)} <br>
     * 宅配区分
     * @return The value of the column 'ZZHDVRID'. (NullAllowed)
     */
    public String getZzhdvrid() {
        return _zzhdvrid;
    }

    /**
     * [set] ZZHDVRID: {varchar(255)} <br>
     * 宅配区分
     * @param zzhdvrid The value of the column 'ZZHDVRID'. (NullAllowed)
     */
    public void setZzhdvrid(String zzhdvrid) {
        __modifiedProperties.add("zzhdvrid");
        this._zzhdvrid = zzhdvrid;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] HEADER_PRICE_SALE: {varchar(255)} <br>
     * ヘッダ定価代金
     * @return The value of the column 'HEADER_PRICE_SALE'. (NullAllowed)
     */
    public String getHeaderPriceSale() {
        return _headerPriceSale;
    }

    /**
     * [set] HEADER_PRICE_SALE: {varchar(255)} <br>
     * ヘッダ定価代金
     * @param headerPriceSale The value of the column 'HEADER_PRICE_SALE'. (NullAllowed)
     */
    public void setHeaderPriceSale(String headerPriceSale) {
        __modifiedProperties.add("headerPriceSale");
        this._headerPriceSale = headerPriceSale;
    }

    /**
     * [get] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @return The value of the column 'ZREGPRCC'. (NullAllowed)
     */
    public String getZregprcc() {
        return _zregprcc;
    }

    /**
     * [set] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @param zregprcc The value of the column 'ZREGPRCC'. (NullAllowed)
     */
    public void setZregprcc(String zregprcc) {
        __modifiedProperties.add("zregprcc");
        this._zregprcc = zregprcc;
    }

    /**
     * [get] TAX: {varchar(255)} <br>
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public String getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {varchar(255)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(String tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @return The value of the column 'ZZGODFPC'. (NullAllowed)
     */
    public String getZzgodfpc() {
        return _zzgodfpc;
    }

    /**
     * [set] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @param zzgodfpc The value of the column 'ZZGODFPC'. (NullAllowed)
     */
    public void setZzgodfpc(String zzgodfpc) {
        __modifiedProperties.add("zzgodfpc");
        this._zzgodfpc = zzgodfpc;
    }

    /**
     * [get] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @return The value of the column 'ZZGODSPC'. (NullAllowed)
     */
    public String getZzgodspc() {
        return _zzgodspc;
    }

    /**
     * [set] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @param zzgodspc The value of the column 'ZZGODSPC'. (NullAllowed)
     */
    public void setZzgodspc(String zzgodspc) {
        __modifiedProperties.add("zzgodspc");
        this._zzgodspc = zzgodspc;
    }

    /**
     * [get] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @return The value of the column 'ZZGODCTX'. (NullAllowed)
     */
    public String getZzgodctx() {
        return _zzgodctx;
    }

    /**
     * [set] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @param zzgodctx The value of the column 'ZZGODCTX'. (NullAllowed)
     */
    public void setZzgodctx(String zzgodctx) {
        __modifiedProperties.add("zzgodctx");
        this._zzgodctx = zzgodctx;
    }

    /**
     * [get] COMPANY_CD: {varchar(255)} <br>
     * 会社コード
     * @return The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public String getCompanyCd() {
        return _companyCd;
    }

    /**
     * [set] COMPANY_CD: {varchar(255)} <br>
     * 会社コード
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public void setCompanyCd(String companyCd) {
        __modifiedProperties.add("companyCd");
        this._companyCd = companyCd;
    }

    /**
     * [get] SALE_TYPE: {varchar(255)} <br>
     * 販売区分
     * @return The value of the column 'SALE_TYPE'. (NullAllowed)
     */
    public String getSaleType() {
        return _saleType;
    }

    /**
     * [set] SALE_TYPE: {varchar(255)} <br>
     * 販売区分
     * @param saleType The value of the column 'SALE_TYPE'. (NullAllowed)
     */
    public void setSaleType(String saleType) {
        __modifiedProperties.add("saleType");
        this._saleType = saleType;
    }

    /**
     * [get] HVRT_REASON: {varchar(255)} <br>
     * 持戻理由
     * @return The value of the column 'HVRT_REASON'. (NullAllowed)
     */
    public String getHvrtReason() {
        return _hvrtReason;
    }

    /**
     * [set] HVRT_REASON: {varchar(255)} <br>
     * 持戻理由
     * @param hvrtReason The value of the column 'HVRT_REASON'. (NullAllowed)
     */
    public void setHvrtReason(String hvrtReason) {
        __modifiedProperties.add("hvrtReason");
        this._hvrtReason = hvrtReason;
    }

    /**
     * [get] HVRT_INOUT_DATE: {varchar(255)} <br>
     * 持戻入庫予定日
     * @return The value of the column 'HVRT_INOUT_DATE'. (NullAllowed)
     */
    public String getHvrtInoutDate() {
        return _hvrtInoutDate;
    }

    /**
     * [set] HVRT_INOUT_DATE: {varchar(255)} <br>
     * 持戻入庫予定日
     * @param hvrtInoutDate The value of the column 'HVRT_INOUT_DATE'. (NullAllowed)
     */
    public void setHvrtInoutDate(String hvrtInoutDate) {
        __modifiedProperties.add("hvrtInoutDate");
        this._hvrtInoutDate = hvrtInoutDate;
    }

    /**
     * [get] CNG_PRT_SLIP_NO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNG_PRT_SLIP_NO'. (NullAllowed)
     */
    public String getCngPrtSlipNo() {
        return _cngPrtSlipNo;
    }

    /**
     * [set] CNG_PRT_SLIP_NO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @param cngPrtSlipNo The value of the column 'CNG_PRT_SLIP_NO'. (NullAllowed)
     */
    public void setCngPrtSlipNo(String cngPrtSlipNo) {
        __modifiedProperties.add("cngPrtSlipNo");
        this._cngPrtSlipNo = cngPrtSlipNo;
    }

    /**
     * [get] PROCESS_TYPE: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public String getProcessType() {
        return _processType;
    }

    /**
     * [set] PROCESS_TYPE: {varchar(255)} <br>
     * 処理区分
     * @param processType The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public void setProcessType(String processType) {
        __modifiedProperties.add("processType");
        this._processType = processType;
    }

    /**
     * [get] EOS_ORD_AFT_FLG: {varchar(255)} <br>
     * EOSさしず後フラグ
     * @return The value of the column 'EOS_ORD_AFT_FLG'. (NullAllowed)
     */
    public String getEosOrdAftFlg() {
        return _eosOrdAftFlg;
    }

    /**
     * [set] EOS_ORD_AFT_FLG: {varchar(255)} <br>
     * EOSさしず後フラグ
     * @param eosOrdAftFlg The value of the column 'EOS_ORD_AFT_FLG'. (NullAllowed)
     */
    public void setEosOrdAftFlg(String eosOrdAftFlg) {
        __modifiedProperties.add("eosOrdAftFlg");
        this._eosOrdAftFlg = eosOrdAftFlg;
    }

    /**
     * [get] EOS_SLIP_NO: {varchar(255)} <br>
     * 相手(EOS)伝票番号
     * @return The value of the column 'EOS_SLIP_NO'. (NullAllowed)
     */
    public String getEosSlipNo() {
        return _eosSlipNo;
    }

    /**
     * [set] EOS_SLIP_NO: {varchar(255)} <br>
     * 相手(EOS)伝票番号
     * @param eosSlipNo The value of the column 'EOS_SLIP_NO'. (NullAllowed)
     */
    public void setEosSlipNo(String eosSlipNo) {
        __modifiedProperties.add("eosSlipNo");
        this._eosSlipNo = eosSlipNo;
    }

    /**
     * [get] HDRD_BX_TYPE: {varchar(255)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRD_BX_TYPE'. (NullAllowed)
     */
    public String getHdrdBxType() {
        return _hdrdBxType;
    }

    /**
     * [set] HDRD_BX_TYPE: {varchar(255)} <br>
     * 100箱拒否区分
     * @param hdrdBxType The value of the column 'HDRD_BX_TYPE'. (NullAllowed)
     */
    public void setHdrdBxType(String hdrdBxType) {
        __modifiedProperties.add("hdrdBxType");
        this._hdrdBxType = hdrdBxType;
    }

    /**
     * [get] INOT_RFSL_TYPE: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOT_RFSL_TYPE'. (NullAllowed)
     */
    public String getInotRfslType() {
        return _inotRfslType;
    }

    /**
     * [set] INOT_RFSL_TYPE: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @param inotRfslType The value of the column 'INOT_RFSL_TYPE'. (NullAllowed)
     */
    public void setInotRfslType(String inotRfslType) {
        __modifiedProperties.add("inotRfslType");
        this._inotRfslType = inotRfslType;
    }

    /**
     * [get] BX_MNT_RFSL_TYPE: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BX_MNT_RFSL_TYPE'. (NullAllowed)
     */
    public String getBxMntRfslType() {
        return _bxMntRfslType;
    }

    /**
     * [set] BX_MNT_RFSL_TYPE: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @param bxMntRfslType The value of the column 'BX_MNT_RFSL_TYPE'. (NullAllowed)
     */
    public void setBxMntRfslType(String bxMntRfslType) {
        __modifiedProperties.add("bxMntRfslType");
        this._bxMntRfslType = bxMntRfslType;
    }

    /**
     * [get] REPORT_MERFE_TIMING: {varchar(255)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'REPORT_MERFE_TIMING'. (NullAllowed)
     */
    public String getReportMerfeTiming() {
        return _reportMerfeTiming;
    }

    /**
     * [set] REPORT_MERFE_TIMING: {varchar(255)} <br>
     * 帳票マージタイミング
     * @param reportMerfeTiming The value of the column 'REPORT_MERFE_TIMING'. (NullAllowed)
     */
    public void setReportMerfeTiming(String reportMerfeTiming) {
        __modifiedProperties.add("reportMerfeTiming");
        this._reportMerfeTiming = reportMerfeTiming;
    }

    /**
     * [get] REPORT_OUT_DATETIME: {varchar(255)} <br>
     * 帳票出力年月日
     * @return The value of the column 'REPORT_OUT_DATETIME'. (NullAllowed)
     */
    public String getReportOutDatetime() {
        return _reportOutDatetime;
    }

    /**
     * [set] REPORT_OUT_DATETIME: {varchar(255)} <br>
     * 帳票出力年月日
     * @param reportOutDatetime The value of the column 'REPORT_OUT_DATETIME'. (NullAllowed)
     */
    public void setReportOutDatetime(String reportOutDatetime) {
        __modifiedProperties.add("reportOutDatetime");
        this._reportOutDatetime = reportOutDatetime;
    }

    /**
     * [get] CLIENT_ID: {varchar(255)} <br>
     * 銘柄コード
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public String getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {varchar(255)} <br>
     * 銘柄コード
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(String clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @return The value of the column 'KWMENG'. (NullAllowed)
     */
    public String getKwmeng() {
        return _kwmeng;
    }

    /**
     * [set] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @param kwmeng The value of the column 'KWMENG'. (NullAllowed)
     */
    public void setKwmeng(String kwmeng) {
        __modifiedProperties.add("kwmeng");
        this._kwmeng = kwmeng;
    }

    /**
     * [get] STATUS_CD: {varchar(255)} <br>
     * 状態コード
     * @return The value of the column 'STATUS_CD'. (NullAllowed)
     */
    public String getStatusCd() {
        return _statusCd;
    }

    /**
     * [set] STATUS_CD: {varchar(255)} <br>
     * 状態コード
     * @param statusCd The value of the column 'STATUS_CD'. (NullAllowed)
     */
    public void setStatusCd(String statusCd) {
        __modifiedProperties.add("statusCd");
        this._statusCd = statusCd;
    }

    /**
     * [get] STG_VAL: {varchar(255)} <br>
     * 不足本数
     * @return The value of the column 'STG_VAL'. (NullAllowed)
     */
    public String getStgVal() {
        return _stgVal;
    }

    /**
     * [set] STG_VAL: {varchar(255)} <br>
     * 不足本数
     * @param stgVal The value of the column 'STG_VAL'. (NullAllowed)
     */
    public void setStgVal(String stgVal) {
        __modifiedProperties.add("stgVal");
        this._stgVal = stgVal;
    }

    /**
     * [get] DETAIL_PRICE_SALE: {varchar(255)} <br>
     * 明細定価代金
     * @return The value of the column 'DETAIL_PRICE_SALE'. (NullAllowed)
     */
    public String getDetailPriceSale() {
        return _detailPriceSale;
    }

    /**
     * [set] DETAIL_PRICE_SALE: {varchar(255)} <br>
     * 明細定価代金
     * @param detailPriceSale The value of the column 'DETAIL_PRICE_SALE'. (NullAllowed)
     */
    public void setDetailPriceSale(String detailPriceSale) {
        __modifiedProperties.add("detailPriceSale");
        this._detailPriceSale = detailPriceSale;
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
